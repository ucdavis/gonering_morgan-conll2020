package extraction;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;

public class StepTwo {
	public String udDirectory = new String();
	public String os = new String();
	public String lang = new String();
	public String langAbv = new String();
	
	public StepTwo(String dataDir, String operSys) {
		this.udDirectory = dataDir;
		this.os = operSys;
	}
	
	public static double y(double n1, double n2) {
		return (n1/(n1+2*n2));
	}
	
	public static double d(double count, double y, double[] n) {
		double d = 0.0D;
		
		switch((int)count) {
		case 0:
			break;
		case 1:
			if(n[1] > 0) d = 1.0D-(2.0D*y*n[1]/n[0]);
			break;
		case 2:
			if(n[1] > 0) d = 2.0D-(3.0D*y*n[2]/n[1]);
			break;
		case 3:
		default:
			if(n[2] > 0) d = 3.0D-(4.0D*y*n[3]/n[2]);
			break;
		}
		
		return d;
	}
	
	public static double gamma(double[] N, double total, double[] ns) {
		double[] discounts = {0D, 0D, 0D};
		double g = 0;
		for(int i = 0; i < 3; i++) {
			discounts[i] = d(i+1, y(ns[0], ns[1]), ns);
			g += discounts[i]*N[i];
		}
		return g/total;
	}
	
	public static double smoothedProportion(double count, double total, double[] ns) {
		return (count - d(count, y(ns[0], ns[1]), ns))/total;
	}
	
	public static double N_before(String lastElement, HashMap<String, Double> comparisonN_gram_model) {
		double unique = 0D;
		
		for(Entry<String, Double> entry : comparisonN_gram_model.entrySet()) {
			if(entry.getKey().matches(".*,".concat(lastElement).concat("$"))) {
				unique++;
			}
		}
		
		return unique;
	}
	
	public static double N_before_w_swap(String lastElement, HashMap<String, Double> comparisonN_gram_model) {
		double unique = 0D;
		
		for(Entry<String, Double> entry : comparisonN_gram_model.entrySet()) {
			String key = entry.getKey().split(",")[1].concat(",").concat(entry.getKey().split(",")[0]);
			if(key.matches(".*,".concat(lastElement).concat("$"))) {
				unique++;
			}
		}
		
		return unique;
	}
	
	public static double[] N_after(String history, HashMap<String, Double> n_gram_model) {
		double uniques[] = {0, 0, 0};
		for(Entry<String, Double> entry : n_gram_model.entrySet()) {
			if(entry.getKey().matches("^".concat(history).concat("$"))) {
				switch(entry.getValue().intValue()) {
				case 1:
					uniques[0]++;
					break;
				case 2:
					uniques[1]++;
					break;
				case 3:
				default:
					uniques[2]++;
					break;
				}
			}
		}
		return uniques;
	}
	
	public void extractAndWrite(String lg) {
		this.lang = lg;
		this.langAbv = lg.split("_")[1];
		FileWriter fWExtracted;
		FileWriter fWMeta;
		String langPath_temp = new String();
		// unigrams
		HashMap<String, Double> subjs = new HashMap<>();
		HashMap<String, Double> verbs = new HashMap<>();
		HashMap<String, Double> objs = new HashMap<>();
		
		// bigrams
		HashMap<String, Double> subjs_verbs = new HashMap<>();
		HashMap<String, Double> verbs_objs = new HashMap<>();
		HashMap<String, Double> subjs_objs = new HashMap<>();
		
		// trigrams
		HashMap<String, Double> observedUtts = new HashMap<>();
		
		HashMap<String, Integer> wordOrders = new HashMap<>();
		
		try {
			if(os.equalsIgnoreCase("w") || os.equalsIgnoreCase("win") || os.equalsIgnoreCase("windows")) {
//				fWExtracted = new FileWriter(udDirectory + lang + "\\ud-" + langAbv + "-extracted.txt", Charset.forName("UTF-8"));
				fWExtracted = new FileWriter(udDirectory + lang + "\\ud-" + langAbv + "-extracted.txt");
				fWMeta = new FileWriter(udDirectory + lang + "\\ud-" + langAbv + "-meta.txt/");
				langPath_temp = udDirectory + lang + "\\ud-" + langAbv + "-temp.csv";
			}
			else {
				if(os.equalsIgnoreCase("s") || os.equalsIgnoreCase("scribe")) {
					fWExtracted = new FileWriter("/scratch/bgonerin/transitive_order_proj/UD_processing/ud-" + langAbv + "-extracted.txt");
					langPath_temp = "/scratch/bgonerin/transitive_order_proj/UD_processing/ud-" + langAbv + "-temp.csv";
				}
				else {
					fWExtracted = new FileWriter(udDirectory + lang + "/ud-" + langAbv + "-extracted.txt");
					langPath_temp = udDirectory + lang + "/ud-" + langAbv + "-temp.csv";
				}
				fWMeta = new FileWriter(udDirectory + lang + "/ud-" + langAbv + "-meta.txt/"); 
			}
			
			List<String> lines = Files.readAllLines(Paths.get(langPath_temp));
//			List<String> lines = Files.readAllLines(Paths.get(langPath_temp), Charset.forName("Cp1252"));
//			List<String> lines = Files.readAllLines(Paths.get(langPath_temp), Charset.forName("UTF-8"));
			lines.remove(0);
			
			for(int i = 0; i < lines.size(); i++) {
				String line = lines.get(i);
				observedUtts.merge(line.substring(0, line.lastIndexOf(",")).toUpperCase(Locale.ROOT), 1.0D, (prev, one) -> prev + one);
				
				String s = line.split(",")[0];
				String v = line.split(",")[1];
				String o = line.split(",")[2];
				String wo = line.split(",")[3];
					
				subjs_verbs.merge(s.concat(",").concat(v).toUpperCase(Locale.ROOT), 1.0D, (prev, one) -> prev + one);
				verbs_objs.merge(v.concat(",").concat(o).toUpperCase(Locale.ROOT), 1.0D, (prev, one) -> prev + one);
				subjs_objs.merge(s.concat(",").concat(o).toUpperCase(Locale.ROOT), 1.0D, (prev, one) -> prev + one);
				
				subjs.merge(s.toUpperCase(Locale.ROOT), 1.0D, (prev, one) -> prev + one);
				verbs.merge(v.toUpperCase(Locale.ROOT), 1.0D, (prev, one) -> prev + one);
				objs.merge(o.toUpperCase(Locale.ROOT), 1.0D, (prev, one) -> prev + one);
				wordOrders.merge(wo, 1, (prev, one) -> prev + one);
			}
			
			HashMap<String, Double> allSubj_VerbContextNs = new HashMap<>();
			HashMap<String, Double> allSubj_ObjContextNs = new HashMap<>();
			subjs.forEach((s, count) -> {
				allSubj_VerbContextNs.put(s, N_before_w_swap(s, subjs_verbs));
				allSubj_ObjContextNs.put(s, N_before_w_swap(s, subjs_objs));
			});
			
			double subj_vcNTotal = allSubj_VerbContextNs.values().stream().mapToDouble(Double::doubleValue).sum();
			double subj_ocNTotal = allSubj_ObjContextNs.values().stream().mapToDouble(Double::doubleValue).sum();
			
			HashMap<String, Double> allVerb_SubjContextNs = new HashMap<>();
			HashMap<String, Double> allVerb_ObjContextNs = new HashMap<>();
			verbs.forEach((v, count) -> {
				allVerb_SubjContextNs.put(v, N_before(v, subjs_verbs));
				allVerb_ObjContextNs.put(v, N_before_w_swap(v, verbs_objs));
			});
			
			double verb_scNTotal = allVerb_SubjContextNs.values().stream().mapToDouble(Double::doubleValue).sum();
			double verb_ocNTotal = allVerb_ObjContextNs.values().stream().mapToDouble(Double::doubleValue).sum();
			
			HashMap<String, Double> allObj_SubjContextNs = new HashMap<>();
			HashMap<String, Double> allObj_VerbContextNs = new HashMap<>();
			objs.forEach((obj, count) -> {
				allObj_SubjContextNs.put(obj, N_before(obj, subjs_objs));
				allObj_VerbContextNs.put(obj, N_before(obj, verbs_objs));
			});
			
			double obj_scNTotal = allObj_SubjContextNs.values().stream().mapToDouble(Double::doubleValue).sum();
			double obj_vcNTotal = allObj_VerbContextNs.values().stream().mapToDouble(Double::doubleValue).sum();
			
			double totalSVBiGCount = subjs_verbs.values().stream().mapToDouble(Double::doubleValue).sum();
			double totalSOBiGCount = subjs_objs.values().stream().mapToDouble(Double::doubleValue).sum();
			double totalVOBiGCount = verbs_objs.values().stream().mapToDouble(Double::doubleValue).sum();
						
							//  n1,n2,n3,n4
			double[] trigram_ns = {0, 0, 0, 0};
			observedUtts.values().forEach(count -> {
				if(count == 1) {
					trigram_ns[0]++;
				}
				else {
					if(count == 2) {
						trigram_ns[1]++;
					}
					else {
						if(count == 3) {
							trigram_ns[2]++;
						}
						else {
							if(count == 4) trigram_ns[3]++;
						}
					}
				}
			});
			
			ArrayList<Double> sanityCheck = new ArrayList<>();
			subjs.forEach((subj, uniGcount_s) -> {
				verbs.forEach((verb, uniGcount_v) -> {
					double[] svN = N_after(subj.concat(",").concat(verb).concat(",.+"), observedUtts);
					double svcount = 0;
					if(subjs_verbs.containsKey(subj.concat(",").concat(verb))) {
						svcount = subjs_verbs.get(subj.concat(",").concat(verb));
					}
					final double sv = svcount;
					
					objs.forEach((obj, uniGcount_o) -> {
						double[] soN = N_after(subj.concat(",.+,").concat(obj), observedUtts);
						double[] voN = N_after(".+,".concat(verb).concat(",").concat(obj), observedUtts);
						
						String modelUtt = subj.concat(",").concat(verb).concat(",").concat(obj);
						
						double vocount = 0;
						if(verbs_objs.containsKey(verb.concat(",").concat(obj))) {
							vocount = verbs_objs.get(verb.concat(",").concat(obj));
						}
						
						double svocount = 0;
						if(observedUtts.containsKey(modelUtt)) {
							svocount = observedUtts.get(modelUtt);
						}
						
						double so = 0;
						if(subjs_objs.containsKey(subj.concat(",").concat(obj))) {
							so = subjs_objs.get(subj.concat(",").concat(obj));
						}
						
						// svo
						double p_O_givenV = allObj_SubjContextNs.get(obj)/obj_scNTotal;
						double p_O_givenSV = smoothedProportion(svocount, sv, trigram_ns) + gamma(svN, sv, trigram_ns)*p_O_givenV;
						
						// sov
						double p_V_givenO = allVerb_SubjContextNs.get(verb)/verb_scNTotal;
						double p_V_givenSO = smoothedProportion(svocount, so, trigram_ns) + gamma(soN, so, trigram_ns)*p_V_givenO;
						
						// vso
						double p_O_givenS = allObj_VerbContextNs.get(obj)/obj_vcNTotal;
						// c(SV) == c(VS), N(SV) == N(VS)
						double p_O_givenVS = smoothedProportion(svocount, sv, trigram_ns) + gamma(svN, sv, trigram_ns)*p_O_givenS;
						
						// vos
						double p_S_givenO = allSubj_VerbContextNs.get(subj)/subj_vcNTotal;
						double p_S_givenVO = smoothedProportion(svocount, vocount, trigram_ns) + gamma(voN, vocount, trigram_ns)*p_S_givenO;
						
						// osv
						double p_V_givenS = allVerb_ObjContextNs.get(verb)/verb_ocNTotal;
						// c(SO) == c(OS), N(SO) == N(OS)
						double p_V_givenOS = smoothedProportion(svocount, so, trigram_ns) + gamma(soN, so, trigram_ns)*p_V_givenS;
						
						// ovs
						double p_S_givenV = allSubj_ObjContextNs.get(subj)/subj_ocNTotal;
						// c(VO) == c(OV), N(VO) == N(OV)
						double p_S_givenOV = smoothedProportion(svocount, vocount, trigram_ns) + gamma(voN, vocount, trigram_ns)*p_S_givenV;
						
						double p_SVO = (1.0D/6.0D)*p_O_givenSV*(sv/totalSVBiGCount) + // svo
										(1.0D/6.0D)*p_V_givenSO*(so/totalSOBiGCount) + // sov
										(1.0D/6.0D)*p_O_givenVS*(sv/totalSVBiGCount) + // vso
										(1.0D/6.0D)*p_S_givenVO*(vocount/totalVOBiGCount) + // vos
										(1.0D/6.0D)*p_V_givenOS*(so/totalSOBiGCount) + // osv  
										(1.0D/6.0D)*p_S_givenOV*(vocount/totalVOBiGCount); // ovs
						if(p_SVO > 0.000000000000000000000000000000000000000000) {
							try {
								fWExtracted.append(modelUtt.replace(",", ", ") + "," + String.format("%.15f", p_SVO) + "\n");
								fWExtracted.flush();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
//							System.out.println(modelUtt + " " + p_SVO);
							sanityCheck.add(p_SVO);
						}
					});
				});
			});
			fWExtracted.flush();
			fWExtracted.close();
			
			if(!wordOrders.containsKey("SVO")) wordOrders.put("SVO", 0);
			if(!wordOrders.containsKey("SOV")) wordOrders.put("SOV", 0);
			if(!wordOrders.containsKey("VSO")) wordOrders.put("VSO", 0);
			if(!wordOrders.containsKey("VOS")) wordOrders.put("VOS", 0);
			if(!wordOrders.containsKey("OVS")) wordOrders.put("OVS", 0);
			if(!wordOrders.containsKey("OSV")) wordOrders.put("OSV", 0);
			
			double tokens = observedUtts.values().stream().mapToDouble(Double::doubleValue).sum();
			fWMeta.append("extracted event tokens: " + tokens + "\n");
			fWMeta.append("svo utts: " + wordOrders.get("SVO") + " " + wordOrders.get("SVO")/tokens + "\n");
			fWMeta.append("sov utts: " + wordOrders.get("SOV") + " " + wordOrders.get("SOV")/tokens + "\n");
			fWMeta.append("vso utts: " + wordOrders.get("VSO") + " " + wordOrders.get("VSO")/tokens + "\n");
			fWMeta.append("vos utts: " + wordOrders.get("VOS") + " " + wordOrders.get("VOS")/tokens + "\n");
			fWMeta.append("ovs utts: " + wordOrders.get("OVS") + " " + wordOrders.get("OVS")/tokens + "\n");
			fWMeta.append("osv utts: " + wordOrders.get("OSV") + " " + wordOrders.get("OSV")/tokens + "\n");
			fWMeta.append("interpolated event types: " + sanityCheck.size() + "\n");
			double types = observedUtts.size();
			fWMeta.append("observed event types: " + types + "\n");
			double probMass = sanityCheck.stream().mapToDouble(Double::doubleValue).sum();
			fWMeta.append("total probability mass: " + probMass + "\n");
			fWMeta.flush();
			fWMeta.close();
			
			System.out.println("san check: " + probMass);
			if(os.equalsIgnoreCase("s") || os.equalsIgnoreCase("scribe")) {
				if(probMass-1.00 < 0.000000) {
					Files.move(Paths.get("/scratch/bgonerin/transitive_order_proj/UD_processing/ud-" + langAbv + "-extracted.txt"), 
							Paths.get(udDirectory + lang + "/ud-" + langAbv + "-extracted.txt"), StandardCopyOption.REPLACE_EXISTING);
				}
				else {
					FileWriter wompwomp = new FileWriter(udDirectory + lang + "/ud-" + langAbv + "womp_womp.txt");
					wompwomp.append("womp womp " + probMass + "\n");
					wompwomp.flush();
					wompwomp.close();
				}
			}
			System.out.println("done, with " + tokens + " event tokens and " + sanityCheck.size() + " interpolated event types");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void leaveSingletonsOut(String lg, String abrv) {
		this.lang = lg;
		this.langAbv = abrv;
		FileWriter fWExtracted;
		String langPath_temp = new String();
		FileWriter fWMeta;
		
		// unigrams
		HashMap<String, Double> subjs = new HashMap<>();
		HashMap<String, Double> verbs = new HashMap<>();
		HashMap<String, Double> objs = new HashMap<>();

		// trigrams
		HashMap<String, Double> observedUtts = new HashMap<>();
		//			HashMap<String, Double> model = new HashMap<>();

		HashMap<String, Integer> wordOrders = new HashMap<>();

		try {
			if(os.equalsIgnoreCase("windows")) {
				fWExtracted = new FileWriter(udDirectory + lang + "\\ud-" + langAbv + "-extracted-excl_singletons.txt");
				langPath_temp = udDirectory + lang + "\\ud-" + langAbv + "-temp.csv";
				fWMeta = new FileWriter(udDirectory + lang + "\\ud-" + langAbv + "-meta-excl_singletons.txt/");
			}
			else {
				fWExtracted = new FileWriter(udDirectory + lang + "/ud-" + langAbv + "-extracted-excl_singletons.txt");
				langPath_temp = udDirectory + lang + "/ud-" + langAbv + "-temp.csv";
				fWMeta = new FileWriter(udDirectory + lang + "/ud-" + langAbv + "-meta-excl_singletons.txt/");
			}

			List<String> lines = Files.readAllLines(Paths.get(langPath_temp), Charset.forName("Cp1252"));
			lines.remove(0);

			for(int i = 0; i < lines.size(); i++) {
				String line = lines.get(i);
				observedUtts.merge(line.substring(0, line.lastIndexOf(",")).toUpperCase(Locale.ROOT), 1.0D, (prev, one) -> prev + one);

				String s = line.split(",")[0];
				String v = line.split(",")[1];
				String o = line.split(",")[2];
				String wo = line.split(",")[3];

				subjs.merge(s.toUpperCase(Locale.ROOT), 1.0D, (prev, one) -> prev + one);
				verbs.merge(v.toUpperCase(Locale.ROOT), 1.0D, (prev, one) -> prev + one);
				objs.merge(o.toUpperCase(Locale.ROOT), 1.0D, (prev, one) -> prev + one);
				wordOrders.merge(wo, 1, (prev, one) -> prev + one);
			}
			
			for(Entry<String, Double> utt : observedUtts.entrySet()) {
				String s = utt.getKey().split(",")[0];
				String v = utt.getKey().split(",")[1];
				String o = utt.getKey().split(",")[2];
				
				if(subjs.get(s) == 1 || verbs.get(v) == 1 || objs.get(o) == 1) {
					observedUtts.remove(utt);
				}
			}
			
			if(!wordOrders.containsKey("SVO")) wordOrders.put("SVO", 0);
			if(!wordOrders.containsKey("SOV")) wordOrders.put("SOV", 0);
			if(!wordOrders.containsKey("VSO")) wordOrders.put("VSO", 0);
			if(!wordOrders.containsKey("VOS")) wordOrders.put("VOS", 0);
			if(!wordOrders.containsKey("OVS")) wordOrders.put("OVS", 0);
			if(!wordOrders.containsKey("OSV")) wordOrders.put("OSV", 0);
			
			double tokens = observedUtts.values().stream().mapToDouble(Double::doubleValue).sum();
			fWMeta.append("extracted event tokens: " + tokens + "\n");
			fWMeta.append("svo utts: " + wordOrders.get("SVO") + " " + wordOrders.get("SVO")/tokens + "\n");
			fWMeta.append("sov utts: " + wordOrders.get("SOV") + " " + wordOrders.get("SOV")/tokens + "\n");
			fWMeta.append("vso utts: " + wordOrders.get("VSO") + " " + wordOrders.get("VSO")/tokens + "\n");
			fWMeta.append("vos utts: " + wordOrders.get("VOS") + " " + wordOrders.get("VOS")/tokens + "\n");
			fWMeta.append("ovs utts: " + wordOrders.get("OVS") + " " + wordOrders.get("OVS")/tokens + "\n");
			fWMeta.append("osv utts: " + wordOrders.get("OSV") + " " + wordOrders.get("OSV")/tokens + "\n");
			double types = observedUtts.size();
			fWMeta.append("extracted event types: " + types + "\n");
			fWMeta.flush();
			fWMeta.close();
			
			for(Entry<String, Double> utt : observedUtts.entrySet()) {
				fWExtracted.append(utt.getKey().replace(",", ", ") + ", " + 
						utt.getValue() + ", " +
						tokens + ", " + 
						utt.getValue()/tokens + "\n");
			}
			
			fWExtracted.flush();
			fWExtracted.close();
			System.out.println("done, with " + tokens + " event tokens and " + types + " event types");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
