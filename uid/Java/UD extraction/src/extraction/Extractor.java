package extraction;

import java.util.Scanner;
import java.io.File;

public class Extractor {
	
	public static void main(String[] args) {
//		ArrayList<String> langs = new ArrayList<>();
//		ArrayList<String> langAbvs = new ArrayList<>();
//		langs.add("Afrikaans");
//		langAbvs.add("afr");
//		langs.add("Akkadian");
//		langAbvs.add("akk");
//		langs.add("Amharic");
//		langAbvs.add("amh");
//		langs.add("Ancient Greek");
//		langAbvs.add("ael");
//		langs.add("Arabic");
//		langAbvs.add("ara");
//		langs.add("Armenian");
//		langAbvs.add("arm");
//		langs.add("Assyrian");
//		langAbvs.add("sur");
//		langs.add("Bambara");
//		langAbvs.add("bam");
//		langs.add("Belarusian");
//		langAbvs.add("bru");
//		langs.add("Bhojpuri");
//		langAbvs.add("bho");
//		langs.add("Bulgarian");
//		langAbvs.add("bul");
//		langs.add("Buryat");
//		langAbvs.add("bur");
//		langs.add("Cantonese");
//		langAbvs.add("can");
//		langs.add("Catalan");
//		langAbvs.add("cat");
//		langs.add("Classical Chinese");
//		langAbvs.add("cch");
//		langs.add("Coptic");
//		langAbvs.add("cop");
//		langs.add("Croatian");
//		langAbvs.add("cro");
//		langs.add("Czech");
//		langAbvs.add("cze");
//		langs.add("Danish");
//		langAbvs.add("dan");
//		langs.add("Erzya");
//		langAbvs.add("erz");
//		langs.add("Estonian");
//		langAbvs.add("est");
//		langs.add("Faroese");
//		langAbvs.add("fro");
//		langs.add("Farsi");
//		langAbvs.add("far");
//		langs.add("Finnish");
//		langAbvs.add("fin");
//		langs.add("French");
//		langAbvs.add("fre");
//		langs.add("Galician");
//		langAbvs.add("gal");
//		langs.add("Gothic");
//		langAbvs.add("got");
//		langs.add("Hebrew");
//		langAbvs.add("heb");
//		langs.add("Italian");
//		langAbvs.add("ita");
//		langs.add("Karelian");
//		langAbvs.add("kar");
//		langs.add("Kazakh");
//		langAbvs.add("kaz");
//		langs.add("Komi Permyak");
//		langAbvs.add("kpe");
//		langs.add("Komi Zyrian");
//		langAbvs.add("kzy");
//		langs.add("Kurmanji");
//		langAbvs.add("kur");
//		langs.add("Latin");
//		langAbvs.add("lat");
//		langs.add("Latvian");
//		langAbvs.add("ltv");
//		langs.add("Lithuanian");
//		langAbvs.add("lit");
//		langs.add("Livvi");
//		langAbvs.add("liv");
//		langs.add("Maltese");
//		langAbvs.add("mal");
//		langs.add("Marathi");
//		langAbvs.add("mar");
//		langs.add("Modern Greek");
//		langAbvs.add("ell");
//		langs.add("Moksha");
//		langAbvs.add("mok");
//		langs.add("Nigerian Pidgin");
//		langAbvs.add("npe");
//		langs.add("North Sami");
//		langAbvs.add("nsa");
//		langs.add("Norwegian");
//		langAbvs.add("nor");
//		langs.add("Old Church Slavonic");
//		langAbvs.add("ocs");
//		langs.add("Old French");
//		langAbvs.add("ofr");
//		langs.add("Old Russian");
//		langAbvs.add("oru");
//		langs.add("Polish");
//		langAbvs.add("pol");
//		langs.add("Portuguese");
//		langAbvs.add("por");
//		langs.add("Romanian");
//		langAbvs.add("rom");
//		langs.add("Russian");
//		langAbvs.add("rus");
//		langs.add("Sanskrit");
//		langAbvs.add("san");
//		langs.add("Serbian");
//		langAbvs.add("ser");
//		langs.add("Skolt Sami");
//		langAbvs.add("ssa");
//		langs.add("Slovak");
//		langAbvs.add("slvk");
//		langs.add("Slovenian");
//		langAbvs.add("slvn");
//		langs.add("Spanish");
//		langAbvs.add("spa");
//		langs.add("Swedish");
//		langAbvs.add("swe");
//		langs.add("Swedish Sign Language");
//		langAbvs.add("ssl");
//		langs.add("Swiss German");
//		langAbvs.add("swg");
//		langs.add("Tamil");
//		langAbvs.add("tam");
//		langs.add("Telugu");
//		langAbvs.add("tel");
//		langs.add("Thai");
//		langAbvs.add("tha");
//		langs.add("Ukranian");
//		langAbvs.add("ukr");
//		langs.add("Upper Sorbian");
//		langAbvs.add("uso");
//		langs.add("Urdu");
//		langAbvs.add("urd");
//		langs.add("Uyghur");
//		langAbvs.add("uyg");
//		langs.add("Yoruba");
//		langAbvs.add("yor");
		
//		langs.add("Basque");
//		langAbvs.add("eus");
//		langs.add("Breton");
//		langAbvs.add("bre");
//		langs.add("Hindi");
//		langAbvs.add("hin");
//		langs.add("Hungarian");
//		langAbvs.add("hun");
//		langs.add("Indonesian");
//		langAbvs.add("ind");
//		langs.add("Korean");
//		langAbvs.add("kor");
//		langs.add("Mbya Guarani");
//		langAbvs.add("mgu");
//		langs.add("Scottish Gaelic");
//		langAbvs.add("gai");
//		langs.add("Tagalog");
//		langAbvs.add("tag");
//		langs.add("Turkish");
//		langAbvs.add("tur");
//		langs.add("Vietnamese");
//		langAbvs.add("vie");
//		langs.add("Warlpiri");
//		langAbvs.add("war");
//		langs.add("Welsh");
//		langAbvs.add("cym");
//		langs.add("Wolof");
//		langAbvs.add("wol");
//		langs.add("Mandarin");
//		langAbvs.add("zho");
//		langs.add("Dutch");
//		langAbvs.add("ned");
//		langs.add("German");
//		langAbvs.add("deu");
//		langs.add("English");
//		langAbvs.add("eng");
//		langs.add("Japanese");
//		langAbvs.add("ja");
//		langs.add("Irish");
//		langAbvs.add("gae");
		
		System.out.println("What system are you running this on?\n(s)cribe, (w)indows, or (u)buntu");
		Scanner in = new Scanner(System.in);
		String os =  new String();
		if(in.hasNext()) {
			os = in.nextLine();
		}
//		in.close();
//		String os = "win";
		
		String ud_path = new String();
		if(os.equalsIgnoreCase("w") || os.equalsIgnoreCase("win") || os.equalsIgnoreCase("windows")) {
			ud_path = "C:\\Users\\brenn\\Documents\\UD data\\";
		}
		else {
			if(os.equalsIgnoreCase("s") || os.equalsIgnoreCase("scribe")) {
				ud_path = "./UD data/";
			}
			else {
				ud_path = "/home/brennan/Documents/College work/Grad school/2019 - 2020/Prelim paper/UD data/";
				  //"/media/brennan/Windows/Users/brenn/Documents/";
			}
		}
		
		File f = new File(ud_path);
		String[] langs = f.list();
		System.out.println("What language(s) is(are) you processing?");
		for(int i = 0; i < langs.length; i++) {
			System.out.println(i + " - " + langs[i]);
		}
		
		String toProcessLangs = "";
		if(in.hasNext()) {
			toProcessLangs = in.nextLine();
		}
		
		int startLang = -1;
		int endLang = -1;
		if(toProcessLangs.contains("-")) {
			startLang = Integer.valueOf(toProcessLangs.split("-")[0]);
			endLang = Integer.valueOf(toProcessLangs.split("-")[1]);
		}
		else {
			if(toProcessLangs.equalsIgnoreCase("all")) {
				startLang = 0;
				endLang = langs.length-1;
			}
			else {
				startLang = Integer.valueOf(toProcessLangs);
				endLang = startLang;
			}
		}
		
		StepOne s1 = new StepOne(ud_path, os);
		StepTwo s2 = new StepTwo(ud_path, os);
		
		System.out.println("Do you want to run step (1), step (2) or (b)oth?");
		String step = "";
		if(in.hasNext()) {
			step = in.nextLine();
		}
		in.close();
		
		for(int z = startLang; z <= endLang; z++) {
			System.out.println(langs[z]);
			if(step.equalsIgnoreCase("b") || step.equalsIgnoreCase("both") || step.equalsIgnoreCase("step 1") || step.equalsIgnoreCase("1")) {
				s1.extractAndWrite(langs[z]);
			}
			if(step.equalsIgnoreCase("b") || step.equalsIgnoreCase("both") || step.equalsIgnoreCase("step 2") || step.equalsIgnoreCase("2")) {
				s2.extractAndWrite(langs[z]);
			}
//			s2.leaveSingletonsOut(langs.get(z));
		}
	}
	
	public void oldMain() {

//		class ExtractedUtt {
//			public int count = 0;
//			public List<String> wordOrders = new ArrayList<>();
//		}
//		
//		BiFunction<ExtractedUtt, ExtractedUtt, ExtractedUtt> addUtt = (prev, current) -> {
//			prev.count++;
//			prev.wordOrders.add(current.wordOrders.get(0));
//			return prev;
//		};
//				
//		ArrayList<String> langs = new ArrayList<>();
//		ArrayList<String> langAbvs = new ArrayList<>();
//		langs.add("Czech 2.0");
//		langAbvs.add("cz2");
////		langs.add("Afrikaans");
////		langAbvs.add("afr");
////		langs.add("Akkadian");
////		langAbvs.add("akk");
////		langs.add("Amharic");
////		langAbvs.add("amh");
////		langs.add("Ancient Greek");
////		langAbvs.add("ael");
////		langs.add("Arabic");
////		langAbvs.add("ara");
////		langs.add("Armenian");
////		langAbvs.add("arm");
////		langs.add("Assyrian");
////		langAbvs.add("sur");
////		langs.add("Bambara");
////		langAbvs.add("bam");
////		langs.add("Belarusian");
////		langAbvs.add("bru");
////		langs.add("Bhojpuri");
////		langAbvs.add("bho");
////		langs.add("Bulgarian");
////		langAbvs.add("bul");
////		langs.add("Buryat");
////		langAbvs.add("bur");
////		langs.add("Cantonese");
////		langAbvs.add("can");
////		langs.add("Catalan");
////		langAbvs.add("cat");
////		langs.add("Classical Chinese");
////		langAbvs.add("cch");
////		langs.add("Coptic");
////		langAbvs.add("cop");
////		langs.add("Croatian");
////		langAbvs.add("cro");
////		langs.add("Czech");
////		langAbvs.add("cze");
////		langs.add("Danish");
////		langAbvs.add("dan");
////		langs.add("Erzya");
////		langAbvs.add("erz");
////		langs.add("Estonian");
////		langAbvs.add("est");
////		langs.add("Faroese");
////		langAbvs.add("fro");
////		langs.add("Farsi");
////		langAbvs.add("far");
////		langs.add("Finnish");
////		langAbvs.add("fin");
////		langs.add("French");
////		langAbvs.add("fre");
////		langs.add("Galician");
////		langAbvs.add("gal");
////		langs.add("Gothic");
////		langAbvs.add("got");
////		langs.add("Hebrew");
////		langAbvs.add("heb");
////		langs.add("Italian");
////		langAbvs.add("ita");
////		langs.add("Karelian");
////		langAbvs.add("kar");
////		langs.add("Kazakh");
////		langAbvs.add("kaz");
////		langs.add("Komi Permyak");
////		langAbvs.add("kpe");
////		langs.add("Komi Zyrian");
////		langAbvs.add("kzy");
////		langs.add("Kurmanji");
////		langAbvs.add("kur");
////		langs.add("Latin");
////		langAbvs.add("lat");
////		langs.add("Latvian");
////		langAbvs.add("ltv");
////		langs.add("Lithuanian");
////		langAbvs.add("lit");
////		langs.add("Livvi");
////		langAbvs.add("liv");
////		langs.add("Maltese");
////		langAbvs.add("mal");
////		langs.add("Marathi");
////		langAbvs.add("mar");
////		langs.add("Modern Greek");
////		langAbvs.add("ell");
////		langs.add("Moksha");
////		langAbvs.add("mok");
////		langs.add("Nigerian Pidgin");
////		langAbvs.add("npe");
////		langs.add("North Sami");
////		langAbvs.add("nsa");
////		langs.add("Norwegian");
////		langAbvs.add("nor");
////		langs.add("Old Church Slavonic");
////		langAbvs.add("ocs");
////		langs.add("Old French");
////		langAbvs.add("ofr");
////		langs.add("Old Russian");
////		langAbvs.add("oru");
////		langs.add("Polish");
////		langAbvs.add("pol");
////		langs.add("Portuguese");
////		langAbvs.add("por");
////		langs.add("Romanian");
////		langAbvs.add("rom");
////		langs.add("Russian");
////		langAbvs.add("rus");
////		langs.add("Sanskrit");
////		langAbvs.add("san");
////		langs.add("Serbian");
////		langAbvs.add("ser");
////		langs.add("Skolt Sami");
////		langAbvs.add("ssa");
////		langs.add("Slovak");
////		langAbvs.add("slvk");
////		langs.add("Slovenian");
////		langAbvs.add("slvn");
////		langs.add("Spanish");
////		langAbvs.add("spa");
////		langs.add("Swedish");
////		langAbvs.add("swe");
////		langs.add("Swedish Sign Language");
////		langAbvs.add("ssl");
////		langs.add("Swiss German");
////		langAbvs.add("swg");
////		langs.add("Tamil");
////		langAbvs.add("tam");
////		langs.add("Telugu");
////		langAbvs.add("tel");
////		langs.add("Thai");
////		langAbvs.add("tha");
////		langs.add("Ukranian");
////		langAbvs.add("ukr");
////		langs.add("Upper Sorbian");
////		langAbvs.add("uso");
////		langs.add("Urdu");
////		langAbvs.add("urd");
////		langs.add("Uyghur");
////		langAbvs.add("uyg");
////		langs.add("Yoruba");
////		langAbvs.add("yor");
////		langs.add("Basque");
////		langAbvs.add("eus");
////		langs.add("Basque 2.0");
////		langAbvs.add("eus2");
////		langs.add("Breton");
////		langAbvs.add("bre");
////		langs.add("Hindi");
////		langAbvs.add("hin");
////		langs.add("Hungarian");
////		langAbvs.add("hun");
////		langs.add("Indonesian");
////		langAbvs.add("ind");
////		langs.add("Korean");
////		langAbvs.add("kor");
////		langs.add("Mbya Guarani");
////		langAbvs.add("mgu");
////		langs.add("Scottish Gaelic");
////		langAbvs.add("gai");
////		langs.add("Tagalog");
////		langAbvs.add("tag");
////		langs.add("Turkish");
////		langAbvs.add("tur");
////		langs.add("Vietnamese");
////		langAbvs.add("vie");
////		langs.add("Warlpiri");
////		langAbvs.add("war");
////		langs.add("Welsh");
////		langAbvs.add("cym");
////		langs.add("Wolof");
////		langAbvs.add("wol");
////		langs.add("Mandarin");
////		langAbvs.add("zho");
////		langs.add("Dutch");
////		langAbvs.add("ned");
////		langs.add("German");
////		langAbvs.add("deu");
////		langs.add("English");
////		langAbvs.add("eng");
////		langs.add("English 2.0");
////		langAbvs.add("eng2");
////		langs.add("Japanese");
////		langAbvs.add("ja");
////		langs.add("Irish");
////		langAbvs.add("gae");
////		langs.add("Irish 2.0");
////		langAbvs.add("gae2");
//		for(int z = 0; z < langs.size(); z++) {
//			System.out.println("Extracting events for " + langs.get(z));
//			ArrayList<ArrayList<ArrayList<String>>> sentences = new ArrayList<>();
//			ArrayList<ArrayList<String>> lines = new ArrayList<>();
//			HashMap<String, ExtractedUtt> events = new HashMap<>();
//			HashMap<String, Integer> subjCounts = new HashMap<>();
//			HashMap<String, Integer> verbCounts = new HashMap<>();
//			HashMap<String, Integer> objCounts = new HashMap<>();
//			
//			ArrayList<Integer> svo = new ArrayList<Integer>(), sov = new ArrayList<Integer>(), vso = new ArrayList<Integer>(),
//					vos = new ArrayList<Integer>(), ovs = new ArrayList<Integer>(), osv = new ArrayList<Integer>();
//			try {
//				String ud_path = "C:\\Users\\brenn\\Documents\\UD data\\"; //"/media/brennan/Windows/Users/brenn/Documents/"; // "/home/brennan/Documents/College work/Grad school/2019 - 2020/Prelim paper/UD data/"
//				FileWriter fWExtractedEvs = new FileWriter(ud_path + langs.get(z) + "\\ud-" + langAbvs.get(z) + "-extracted.txt");
//				FileWriter fWMeta = new FileWriter(ud_path + langs.get(z) + "\\ud-" + langAbvs.get(z) + "-meta.txt");
//				
//				Files.walk(Paths.get(ud_path + langs.get(z) + "\\treebanks")).filter(Files::isRegularFile)
//				.forEach(f -> {
//					System.out.println(f);
//					ArrayList<String> l = new ArrayList<>();
//					int svoCount = 0, sovCount = 0, vsoCount = 0, vosCount = 0, ovsCount = 0, osvCount = 0;
//					
//					try {
//						l = new ArrayList<String>(Files.lines(f).collect(Collectors.toList()));
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					l.forEach(line -> {
//						if(!line.contains("#") && !line.isBlank()) {
//							String[] temp = line.split("\t");
//							ArrayList<String> tempList = new ArrayList<>();
//							for(int i = 0; i < temp.length; i++) {
//								tempList.add(temp[i]);
//							}
//							lines.add(tempList);
//						}
//					});
//					for(int i = 0; i < lines.size(); i++) {
//						ArrayList<ArrayList<String>> tempList = new ArrayList<>();
//						while(i < lines.size() && lines.get(i).get(0).contains("-")) {
//							i++;
//						}
//						if(Double.parseDouble(lines.get(i).get(0)) == 1) {
//							tempList.add(lines.get(i));
//							i++;
//							if(i < lines.size() && lines.get(i).get(0).contains("-")) {
//								i++;
//								
//							}
//							while(i < lines.size() && Double.parseDouble(lines.get(i).get(0)) != 1) {
//								tempList.add(lines.get(i));
//								i++;
//								if(i < lines.size() && lines.get(i).get(0).contains("-")) {
//									i++;
//								}
//							}
//							sentences.add(tempList);
//							i--;
//						}
//					}
//					
//					// loop thru sentences
//					for(int i = 0; i < sentences.size(); i++) {
//						// loop thru words in the sentence to find transitive
//						boolean transitive = false, subj = false, vrb = false, obj = false;
//						ArrayList<ArrayList<String>> subject = new ArrayList<>();
//						ArrayList<ArrayList<String>> object = new ArrayList<>();
//						ArrayList<ArrayList<String>> verb = new ArrayList<>();
//						for(int j = 0; j < sentences.get(i).size(); j++) {
//							if(sentences.get(i).get(j).get(7).contains("subj")) {
//								subj = true;
//								subject.add(sentences.get(i).get(j));
//							}
//							if(sentences.get(i).get(j).get(7).contains("obj")) {
//								obj = true;
//								object.add(sentences.get(i).get(j));
//							}
//							if(sentences.get(i).get(j).get(7).contains("root") || sentences.get(i).get(j).get(7).contains("aux") ||
//									sentences.get(i).get(j).get(7).contains("ccomp") || sentences.get(i).get(j).get(7).contains("acl") ||
//									sentences.get(i).get(j).get(7).contains("advcl") || sentences.get(i).get(j).get(7).contains("parataxis") ||
//									sentences.get(i).get(j).get(7).contains("xcomp")) {
//								vrb = true;
//								verb.add(sentences.get(i).get(j));
//							}
//							if(subj && vrb && obj) {
//								for(int k = 0; k < subject.size(); k++) {
//									for(int m = 0; m < verb.size(); m++) {
//										if(Integer.parseInt(subject.get(k).get(6)) == Integer.parseInt(verb.get(m).get(0)) && !transitive) {
//											for(int n = 0; n < object.size(); n++) {
//												if(Integer.parseInt(object.get(n).get(6)) == Integer.parseInt(verb.get(m).get(0))) {
//													transitive = true;
//													String s = subject.get(k).get(2);
//													if(s.startsWith("_")) {
//														s = subject.get(k).get(1);
//													}
//													int subjIndex = Integer.parseInt(subject.get(k).get(0));
//													
//													String o = object.get(n).get(2);
//													if(o.startsWith("_")) {
//														o = object.get(n).get(1);
//													}
//													int objIndex = Integer.parseInt(object.get(n).get(0));
//													
//													int verbIndex = Integer.parseInt(verb.get(m).get(0));
//													// look for compound subjects and objects
//													for(int a = 0; a < sentences.get(i).size(); a++) {
//														if(sentences.get(i).get(a).get(6).contains("_")) {
//															a++;
//														}
//														if(a < sentences.get(i).size() && !sentences.get(i).get(a).get(6).contains("_") && Integer.parseInt(sentences.get(i).get(a).get(6)) == Integer.parseInt(subject.get(k).get(0))) {
//															
//															if(sentences.get(i).get(a).get(7).contains("flat")) {
//																s = s.concat("_").concat(sentences.get(i).get(a).get(2));
//															}
//															else {
//																if(sentences.get(i).get(a).get(7).contains("compound")) {
//																	s = sentences.get(i).get(a).get(2).concat("_").concat(s);
//																}
//															}
//														}
//													}
//													for(int a = 0; a < sentences.get(i).size(); a++) {
//														if(sentences.get(i).get(a).get(6).contains("_")) {
//															a++;
//														}
//														if(a < sentences.get(i).size() && !sentences.get(i).get(a).get(6).contains("_") &&  Integer.parseInt(sentences.get(i).get(a).get(6)) == Integer.parseInt(object.get(n).get(0))) {
//															if(sentences.get(i).get(a).get(7).contains("flat")) {
//																if(sentences.get(i).get(a).get(2).startsWith("_")) {
//																	o = o.concat("_").concat(sentences.get(i).get(a).get(1));
//																}
//																else {
//																	o = o.concat("_").concat(sentences.get(i).get(a).get(2));
//																}
//															}
//															else {
//																if(sentences.get(i).get(a).get(7).contains("compound")) {
//																	if(sentences.get(i).get(a).get(2).startsWith("_")) {
//																		o = sentences.get(i).get(a).get(1).concat("_").concat(o);
//																	}
//																	else {
//																		o = sentences.get(i).get(a).get(2).concat("_").concat(o);
//																	}
//																}
//															}
//														}
//													}
//													String v = verb.get(m).get(2);
//													if(v.startsWith("_")) {
//														v = verb.get(m).get(1);
//													}
//													
//													if(s.contains(",")) {
//														s = s.replaceAll(",", "_");
//													}
//													if(v.contains(",")) {
//														v = v.replaceAll(",", "_");
//													}
//													if(o.contains(",")) {
//														o = o.replaceAll(",", "_");
//													}
//													String ev = s.concat(", ").concat(v).concat(", ").concat(o);
//													subjCounts.merge(s, 1, (prev, one) -> prev + one);
//													verbCounts.merge(v, 1, (prev, one) -> prev + one);
//													objCounts.merge(o, 1, (prev, one) -> prev + one);
//													
//													// find word order
//													String order = "";
//													if(subjIndex < verbIndex) {
//							            				// subj before verb: svo, sov, osv
//							            				if(subjIndex < objIndex) {
//							            					// subj before obj: svo, sov
//							            					if(verbIndex < objIndex) {
//							            						// verb before obj: svo
//							            						svoCount++;
//							            						order = "SVO";
//							            					}
//							            					else {
//							            						// verb after obj: sov
//							            						sovCount++;
//							            						order = "SOV";
//							            					}
//							            				}
//							            				else {
//							            					// obj before subj: osv
//							            					osvCount++;
//							            					order = "OSV";
//							            				}
//							            			}
//							            			else {
//							            				// verb before subj: vso, vos, ovs
//							            				if(objIndex < subjIndex) {
//							            					// obj before subj: vos, ovs
//							            					if(verbIndex < objIndex) {
//							            						// verb before obj: vos
//							            						vosCount++;
//							            						order = "VOS";
//							            					}
//							            					else {
//							            						// obj before verb: ovs
//							            						ovsCount++;
//							            						order = "OVS";
//							            					}
//							            				}
//							            				else {
//							            					// subj before obj: vso
//							            					vsoCount++;
//							            					order = "VSO";
//							            				}
//							            			}
//													ExtractedUtt info = new ExtractedUtt();
//													info.count = 1;
//													info.wordOrders.add(order);
//													events.merge(ev, info, addUtt);
//													break;
//												}
//											}
//										}
//									}
//								}
//								if(transitive) {
//									break;
//								}
//							}
//						}
//					}
//					svo.add(svoCount);
//		            sov.add(sovCount);
//		            vso.add(vsoCount);
//		            vos.add(vosCount);
//		            ovs.add(ovsCount);
//		            osv.add(osvCount);
//				});
//				
//				subjCounts.values().removeIf(count -> count > 1);
//				verbCounts.values().removeIf(count -> count > 1);
//				objCounts.values().removeIf(count -> count > 1);
//				int tokens = 0;
//				List<Entry<String, ExtractedUtt>> utts = new ArrayList<>();
//				for(Entry<String, ExtractedUtt> event : events.entrySet()) {
//					String subj = event.getKey().split(", ")[0];
//					String verb = event.getKey().split(", ")[1];
//					String obj = event.getKey().split(", ")[2];
//					if(subjCounts.containsKey(subj) || verbCounts.containsKey(verb) || objCounts.containsKey(obj)) {
//						String order = event.getValue().wordOrders.get(0);
//						if(order.equals("SVO")) {
//							svo.set(svo.size()-1, svo.get(svo.size()-1)-1);
//						} else if(order.equals("SOV")) {
//							sov.set(sov.size()-1, sov.get(sov.size()-1)-1);
//						} else if(order.equals("VSO")) {
//							vso.set(vso.size()-1, vso.get(vso.size()-1)-1);
//						} else if(order.equals("VOS")) {
//							vos.set(vos.size()-1, vos.get(svo.size()-1)-1);
//						} else if(order.equals("OVS")) {
//							ovs.set(ovs.size()-1, ovs.get(ovs.size()-1)-1);
//						} else if(order.equals("OSV")) {
//							osv.set(osv.size()-1, osv.get(osv.size()-1)-1);
//						}
//						events.remove(event);
//					}
//					else {
//						tokens += event.getValue().count;
//						if(event.getValue().count == 1) {
//							utts.add(event);
//						}
//						else {
//							for(int i = 0; i < event.getValue().count; i++) {
//								ExtractedUtt temp = new ExtractedUtt();
//								temp.count = 1;
//								temp.wordOrders.add(event.getValue().wordOrders.get(i));
//								utts.add(Map.entry(event.getKey(), temp));
//							}
//						}
//					}
//				}
//					
//				fWMeta.append("extracted event tokens: " + tokens + "\n");
//				int svoTotal = 0, sovTotal = 0, vsoTotal = 0, vosTotal = 0, ovsTotal = 0, osvTotal = 0;
//				
//				for(int i = 0; i < svo.size(); i++) {
//					svoTotal += svo.get(i);
//				}
//				for(int i = 0; i < sov.size(); i++) {
//					sovTotal += sov.get(i);
//				}
//				for(int i = 0; i < vso.size(); i++) {
//					vsoTotal += vso.get(i);
//				}
//				for(int i = 0; i < vos.size(); i++) {
//					vosTotal += vos.get(i);
//				}
//				for(int i = 0; i < ovs.size(); i++) {
//					ovsTotal += ovs.get(i);
//				}
//				for(int i = 0; i < osv.size(); i++) {
//					osvTotal += osv.get(i);
//				}
//				
//				fWMeta.append("svo utts: " + svoTotal + " " + ((double)svoTotal/events.size()) + "\n");
//				fWMeta.append("sov utts: " + sovTotal + " " + ((double)sovTotal/events.size()) + "\n");
//				fWMeta.append("vso utts: " + vsoTotal + " " + ((double)vsoTotal/events.size()) + "\n");
//				fWMeta.append("vos utts: " + vosTotal + " " + ((double)vosTotal/events.size()) + "\n");
//				fWMeta.append("ovs utts: " + ovsTotal + " " + ((double)ovsTotal/events.size()) + "\n");
//				fWMeta.append("osv utts: " + osvTotal + " " + ((double)osvTotal/events.size()) + "\n");
//				
//				Collections.shuffle(utts);
//				HashMap<String, ExtractedUtt>[] subsets = new HashMap[10];
//				for(int i = 0; i < 10; i++) {
//					subsets[i] = new HashMap<String, ExtractedUtt>();
//					int subsetTokens = events.size()/10;
//					for(int j = 0; j < subsetTokens; j++) {
//						int subsetIndex = i*events.size()/10;
//						subsets[i].merge(utts.get(subsetIndex+j).getKey(), utts.get(subsetIndex+j).getValue(), addUtt);
//					}
//					
//					Path path = Paths.get(ud_path + langs.get(z) + "\\subsets\\subset" + (i+1));
//					Files.createDirectories(path);
//					
//					FileWriter subsetExtracted = new FileWriter(path.toString() + "\\ud-" + langAbvs.get(z) + "_subset" + (i+1) + "-extracted.txt");
//					FileWriter subsetMeta = new FileWriter(path.toString() + "\\ud-" + langAbvs.get(z) + "_subset" + (i+1) + "-meta.txt");
//					
//					subsetMeta.append("extracted event tokens: " + subsetTokens + "\n");
//					svoTotal = 0; sovTotal = 0; vsoTotal = 0; vosTotal = 0; ovsTotal = 0; osvTotal = 0;
//					
//					for(int j = 0; j < subsets[i].size(); j++) {
//						String key = (String) subsets[i].keySet().toArray()[j];
//						for(int k = 0; k < subsets[i].get(key).wordOrders.size(); k++) {
//							String order = subsets[i].get(key).wordOrders.get(k);
//							if(order.equals("SVO")) {
//								svoTotal++;
//							} else {
//								if(order.equals("SOV")) {
//									sovTotal++;
//								}
//								else {
//									if(order.equals("VSO")) {
//										vsoTotal++;
//									}
//									else {
//										if(order.equals("VOS")) {
//											vosTotal++;
//										}
//										else {
//											if(order.equals("OVS")) {
//												ovsTotal++;
//											}
//											else {
//												if(order.equals("OSV")) {
//													osvTotal++;
//												}
//											}
//										}
//									}
//								}
//							}
//						}
//					}
//					subsetMeta.append("svo utts: " + svoTotal + " " + ((double)svoTotal/events.size()/10) + "\n");
//					subsetMeta.append("sov utts: " + sovTotal + " " + ((double)sovTotal/events.size()/10) + "\n");
//					subsetMeta.append("vso utts: " + vsoTotal + " " + ((double)vsoTotal/events.size()/10) + "\n");
//					subsetMeta.append("vos utts: " + vosTotal + " " + ((double)vosTotal/events.size()/10) + "\n");
//					subsetMeta.append("ovs utts: " + ovsTotal + " " + ((double)ovsTotal/events.size()/10) + "\n");
//					subsetMeta.append("osv utts: " + osvTotal + " " + ((double)osvTotal/events.size()/10) + "\n");
//					
//					subsetMeta.append("extracted event types: " + subsets[i].size() + "\n");
//					subsetMeta.flush();
//					subsetMeta.close();
//					
//					for(Entry<String, ExtractedUtt> subsetEvent : subsets[i].entrySet()) {
//						subsetExtracted.append(subsetEvent.getKey() + ", " + 
//								subsetEvent.getValue().count + ", " +
//								subsetTokens + ", " + 
//								(double)subsetEvent.getValue().count/subsetTokens + "\n");
//					}
//					
//					subsetExtracted.flush();
//					subsetExtracted.close();
//				}
//				
////				ArrayList<Integer> eventCounts = new ArrayList<>();
////				for(int i = 0; i < events.size(); i++) {
////					int count = 1;
////					for(int j = i+1; j < events.size(); j++) {
////						if(events.get(i)[0].equalsIgnoreCase(events.get(j)[0])) {
////							count++;
////							events.remove(j);
////							j--;
////						}
////					}
////					eventCounts.add(count);
////				}
//				fWMeta.append("extracted event types: " + events.size() + "\n");
//				fWMeta.flush();
//				fWMeta.close();
//				
//				for(Entry<String, ExtractedUtt> event : events.entrySet()) {
//					fWExtractedEvs.append(event.getKey() + ", " + 
//							event.getValue().count + ", " +
//							events.size() + ", " + 
//							(double)event.getValue().count/events.size() + "\n");
//				}
//				
//				fWExtractedEvs.flush();
//				fWExtractedEvs.close();
//				System.out.println("done, with " + events.size() + " event types");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
	}
}