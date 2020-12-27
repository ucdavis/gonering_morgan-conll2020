package reefer;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Reformat {
	public static boolean isWindows;
	
	public static void main(String[] args) {
		if(System.getProperty("os.name").startsWith("Windows")) {
			isWindows = true;
		} else { isWindows = false; }
		
		ArrayList<HashMap<String, String>> metadata = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> langs = new HashMap<String, String>();
		langs.put("eng", "English");
		langs.put("ja", "Japanese");
		langs.put("gae", "Irish");
		langs.put("eus", "Basque");
		langs.put("bre", "Breton");
		langs.put("hin", "Hindi");
		langs.put("hun", "Hungarian");
		langs.put("ind", "Indonesian");
		langs.put("kor", "Korean");
		langs.put("mgu", "Mbya Guarani");
		langs.put("gai", "Scottish Gaelic");
		langs.put("tag", "Tagalog");
		langs.put("tur", "Turkish");
		langs.put("vie", "Vietnamese");
		langs.put("war", "Warlpiri");
		langs.put("cym", "Welsh");
		langs.put("wol", "Wolof");
		langs.put("zho", "Mandarin");
		langs.put("ned", "Dutch");
		langs.put("deu", "German");

		HashMap<String, String> classification = new HashMap<String, String>();
		classification.put("eng", "SVO");
		classification.put("ja", "SOV");
		classification.put("gae", "VSO");
		classification.put("eus", "SOV");
		classification.put("bre", "VSO");
		classification.put("hin", "SOV");
		classification.put("hun", "None");
		classification.put("ind", "SVO");
		classification.put("kor", "SOV");
		classification.put("mgu", "SVO");
		classification.put("gai", "VSO");
		classification.put("tag", "VSO");
		classification.put("tur", "SOV");
		classification.put("vie", "SVO");
		classification.put("war", "None");
		classification.put("cym", "VSO");
		classification.put("wol", "SVO");
		classification.put("zho", "SVO");
		classification.put("ned", "None");
		classification.put("deu", "None");
		
		String udPath = "../uid/Java/WordOrder/UD data/";
		if(isWindows) {
			udPath = udPath.replace("/", "\\");
		}
		try {
			Files.newDirectoryStream(Paths.get(udPath), path -> path.toString().contains("-meta"))
			.forEach(f -> {
				try {
					System.out.println(f);
					List<String> lines = Files.readAllLines(f);
					if(!lines.get(0).startsWith("Event")) lines.remove(0);
					System.out.println(lines.get(0));
					String filename = f.getFileName().toString();
					
					int endIndex = filename.indexOf("-meta");
					String lang = langs.get(filename.substring(3, endIndex));
					String c = classification.get(filename.substring(3, endIndex));
					
					HashMap<String, String> hm = new HashMap<String, String>();	
					hm.put("Language", lang);
					hm.put("Classification", c);
					hm.put("Tokens", lines.get(0).split(" ")[3]);
					hm.put("Types", lines.get(7).split(" ")[3]);
					hm.put("SVO", lines.get(1).split(" ")[2]);
					hm.put("SOV", lines.get(2).split(" ")[2]);
					hm.put("VSO", lines.get(3).split(" ")[2]);
					hm.put("VOS", lines.get(4).split(" ")[2]);
					hm.put("OVS", lines.get(5).split(" ")[2]);
					hm.put("OSV", lines.get(6).split(" ")[2]);
					metadata.add(hm);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			
			String grandMetaDest = udPath.concat("metadata/language metadata.csv");
			if(isWindows) {
				grandMetaDest = grandMetaDest.replace("/", "\\");
			}
			FileWriter csvWriter = new FileWriter(grandMetaDest);
			csvWriter.append("Language,Classification,Tokens,Types,SVO,SOV,VSO,VOS,OVS,OSV");
			csvWriter.append("\n");
			
			for (HashMap<String, String> l : metadata) {
				csvWriter.append(l.get("Language").concat(","));
				csvWriter.append(l.get("Classification").concat(","));
				csvWriter.append(l.get("Tokens").concat(","));
				csvWriter.append(l.get("Types").concat(","));
				csvWriter.append(l.get("SVO").concat(","));
				csvWriter.append(l.get("SOV").concat(","));
				csvWriter.append(l.get("VSO").concat(","));
				csvWriter.append(l.get("VOS").concat(","));
				csvWriter.append(l.get("OVS").concat(","));
				csvWriter.append(l.get("OSV"));
			    csvWriter.append("\n");
			}
			
			csvWriter.flush();
			csvWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
