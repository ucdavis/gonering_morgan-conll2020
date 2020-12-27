package extraction;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;

public class StepTwo {
	public String udDirectory = new String();
	public boolean isWindows;
	public String lang = new String();
	public String langAbv = new String();
	
	public StepTwo(String dataDir, boolean isWin) {
		this.udDirectory = dataDir;
		this.isWindows = isWin;
	}
	
	public void leaveSingletonsOut(String lg, String abrv) {
		this.lang = lg;
		this.langAbv = abrv;
		FileWriter fWExtracted;
		FileWriter fWMeta;
		String extLangDest = udDirectory + lang + "/ud-" + langAbv + "-extracted-excl_singletons.txt";
		String langPath_temp = udDirectory + lang + "/ud-" + langAbv + "-temp.csv";
		String metaFileDest = udDirectory + lang + "/ud-" + langAbv + "-meta-excl_singletons.txt";
		
		if(isWindows) {
			extLangDest = extLangDest.replace("/", "\\");
			langPath_temp = langPath_temp.replace("/", "\\");
			metaFileDest = metaFileDest.replace("/", "\\");
		}
		
		// unigrams
		HashMap<String, Double> subjs = new HashMap<>();
		HashMap<String, Double> verbs = new HashMap<>();
		HashMap<String, Double> objs = new HashMap<>();

		// trigrams
		HashMap<String, Double> observedUtts = new HashMap<>();

		HashMap<String, Integer> wordOrders = new HashMap<>();
		
		try {
			fWExtracted = new FileWriter(extLangDest);
			fWMeta = new FileWriter(metaFileDest);

			List<String> lines = Files.readAllLines(Paths.get(langPath_temp));
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
