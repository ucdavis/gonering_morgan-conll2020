package reefer;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Reformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, String>> metadata = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> langs = new HashMap<String, String>();
//		langs.put("afr", "Afrikaans");
//		langs.put("akk", "Akkadian");
//		langs.put("amh", "Amharic");
//		langs.put("ael", "Ancient Greek");
//		langs.put("ara", "Arabic");
//		langs.put("arm", "Armenian");
//		langs.put("sur", "Assyrian");
//		langs.put("bam", "Bambara");
//		langs.put("bru", "Belarusian");
//		langs.put("bho", "Bhojpuri");
//		langs.put("bul", "Bulgarian");
//		langs.put("bur", "Buryat");
//		langs.put("can", "Cantonese");
//		langs.put("cat", "Catalan");
//		langs.put("cch", "Classical Chinese");
//		langs.put("cop", "Coptic");
//		langs.put("cro", "Croatian");
//		langs.put("cze", "Czech");
//		langs.put("dan", "Danish");
//		langs.put("erz", "Erzya");
//		langs.put("est", "Estonian");
//		langs.put("fro", "Faroese");
//		langs.put("far", "Farsi");
//		langs.put("fin", "Finnish");
//		langs.put("fre", "French");
//		langs.put("gal", "Galician");
//		langs.put("got", "Gothic");
//		langs.put("heb", "Hebrew");
//		langs.put("ita", "Italian");
//		langs.put("kar", "Karelian");
//		langs.put("kaz", "Kazakh");
//		langs.put("kpe", "Komi Permyak");
//		langs.put("kzy", "Komi Zyrian");
//		langs.put("kur", "Kurmanji");
//		langs.put("lat", "Latin");
//		langs.put("ltv", "Latvian");
//		langs.put("lit", "Lithuanian");
//		langs.put("liv", "Livvi");
//		langs.put("mal", "Maltese");
//		langs.put("mar", "Marathi");
//		langs.put("ell", "Modern Greek");
//		langs.put("mok", "Moksha");
//		langs.put("nig", "Nigerian Pidgin");
//		langs.put("nsa", "North Sami");
//		langs.put("nor", "Norwegian");
//		langs.put("ocs", "Old Church Slavonic");
//		langs.put("ofr", "Old French");
//		langs.put("oru", "Old Russian");
//		langs.put("pol", "Polish");
//		langs.put("por", "Portuguese");
//		langs.put("rom", "Romanian");
//		langs.put("rus", "Russian");
//		langs.put("san", "Sanskrit");
//		langs.put("ser", "Serbian");
//		langs.put("ssa", "Skolt Sami");
//		langs.put("slvk", "Slovak");
//		langs.put("slvn", "Slovenian");
//		langs.put("spa", "Spanish");
//		langs.put("swe", "Swedish");
//		langs.put("ssl", "Swedish Sign Language");
//		langs.put("swg", "Swiss German");
//		langs.put("tam", "Tamil");
//		langs.put("tel", "Telugu");
//		langs.put("tha", "Thai");
//		langs.put("ukr", "Ukranian");
//		langs.put("uso", "Upper Sorbian");
//		langs.put("urd", "Urdu");
//		langs.put("uyg", "Uyghur");
//		langs.put("yor", "Yoruba");
		
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

//		HashMap<String, String> classification = new HashMap<String, String>();
//		classification.put("afr", "None");
//		classification.put("akk", "SOV");
//		classification.put("amh", "SOV");
//		classification.put("ael", "None");
//		classification.put("ara", "VSO");
//		classification.put("arm", "None");
//		classification.put("sur", "None");
//		classification.put("bam", "SOV");
//		classification.put("bru", "None");
//		classification.put("bho", "SOV");
//		classification.put("bul", "SVO");
//		classification.put("bur", "SOV");
//		classification.put("can", "SVO");
//		classification.put("cat", "SVO");
//		classification.put("cch", "SVO");
//		classification.put("cop", "SVO");
//		classification.put("cro", "SVO");
//		classification.put("cze", "SVO");
//		classification.put("dan", "SVO");
//		classification.put("erz", "SVO");
//		classification.put("est", "SVO");
//		classification.put("fro", "SVO");
//		classification.put("far", "SOV");
//		classification.put("fin", "SVO");
//		classification.put("fre", "SVO");
//		classification.put("gal", "SVO");
//		classification.put("got", "SOV");
//		classification.put("heb", "SVO");
//		classification.put("ita", "SVO");
//		classification.put("kar", "SVO");
//		classification.put("kaz", "SOV");
//		classification.put("kpe", "SVO");
//		classification.put("kzy", "SVO");
//		classification.put("kur", "SOV");
//		classification.put("lat", "None");
//		classification.put("ltv", "SVO");
//		classification.put("lit", "SVO");
//		classification.put("liv", "SVO");
//		classification.put("mal", "SVO");
//		classification.put("mar", "SOV");
//		classification.put("ell", "None");
//		classification.put("mok", "None");
//		classification.put("nig", "SVO");
//		classification.put("nsa", "SVO");
//		classification.put("nor", "SVO");
//		classification.put("ocs", "None");
//		classification.put("ofr", "None");
//		classification.put("oru", "None");
//		classification.put("pol", "SVO");
//		classification.put("por", "SVO");
//		classification.put("rom", "SVO");
//		classification.put("rus", "SVO");
//		classification.put("san", "None");
//		classification.put("ser", "SVO");
//		classification.put("ssa", "SVO");
//		classification.put("slvk", "SVO");
//		classification.put("slvn", "SVO");
//		classification.put("spa", "SVO");
//		classification.put("swe", "SVO");
//		classification.put("ssl", "SVO");
//		classification.put("swg", "None");
//		classification.put("tam", "SOV");
//		classification.put("tel", "SOV");
//		classification.put("tha", "SVO");
//		classification.put("ukr", "SVO");
//		classification.put("uso", "SOV");
//		classification.put("urd", "SOV");
//		classification.put("uyg", "SOV");
//		classification.put("yor", "SVO");
		
//		classification.put("eng", "SVO");
//		classification.put("ja", "SOV");
//		classification.put("gae", "VSO");
//		classification.put("eus", "SOV");
//		classification.put("bre", "VSO");
//		classification.put("hin", "SOV");
//		classification.put("hun", "None");
//		classification.put("ind", "SVO");
//		classification.put("kor", "SOV");
//		classification.put("mgu", "SVO");
//		classification.put("gai", "VSO");
//		classification.put("tag", "VSO");
//		classification.put("tur", "SOV");
//		classification.put("vie", "SVO");
//		classification.put("war", "None");
//		classification.put("cym", "VSO");
//		classification.put("wol", "SVO");
//		classification.put("zho", "SVO");
//		classification.put("ned", "None");
//		classification.put("deu", "None");
		try {
//			Files.newDirectoryStream(Paths.get("G:\\My Drive\\Academic Work\\UCD\\2019 - 2020\\Prelim paper\\Results\\metadata\\"), path -> path.toString().endsWith(".txt"))
//			Files.newDirectoryStream(Paths.get("C:\\Users\\brenn\\Documents\\Results\\singletons excluded\\metadata"), path -> path.toString().endsWith(".txt"))
			Files.newDirectoryStream(Paths.get("C:\\Users\\brenn\\Documents\\Results\\singletons excluded"), path -> path.toString().endsWith(".csv"))
			.forEach(f -> {
				try {
					System.out.println(f);
					List<String> lines = Files.readAllLines(f, Charset.forName("UTF-16"));
					if(!lines.get(0).startsWith("Event")) lines.remove(0);
					System.out.println(lines.get(0));
					String filename = f.getFileName().toString();
					FileWriter rewriter = new FileWriter(filename);
//					lines.forEach(line -> {
//						try {
//							System.out.println(line);
//							rewriter.append(line.concat("\n"));
//						} catch (IOException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					});
					rewriter.flush();
					rewriter.close();
//					HashMap<String, String> hm = new HashMap<String, String>();
//					int endIndex = 6;
//					if(filename.contains("_subset")) {
//						endIndex = filename.indexOf("_");
//					}
//					else {
//						endIndex = filename.indexOf("-meta");
//					}
//					String lang = langs.get(filename.substring(3, endIndex));
//					String c = classification.get(filename.substring(3, endIndex));
//					
//					if(filename.contains("_subset")) {
//						lang = lang.concat(" subset ".concat(filename.substring(filename.indexOf("subset")+6, filename.indexOf("-meta"))));
//					}
//						
//					hm.put("Language", lang);
//					hm.put("Classification", c);
//					hm.put("Tokens", lines.get(0).split(" ")[3]);
//					hm.put("Types", lines.get(7).split(" ")[3]);
//					hm.put("SVO", lines.get(1).split(" ")[2]);
//					hm.put("SOV", lines.get(2).split(" ")[2]);
//					hm.put("VSO", lines.get(3).split(" ")[2]);
//					hm.put("VOS", lines.get(4).split(" ")[2]);
//					hm.put("OVS", lines.get(5).split(" ")[2]);
//					hm.put("OSV", lines.get(6).split(" ")[2]);
//					metadata.add(hm);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
//			FileWriter csvWriter = new FileWriter("C:\\Users\\brenn\\Documents\\Results\\singletons excluded\\metadata\\language metadata.csv");
//			csvWriter.append("Language,Classification,Tokens,Types,SVO,SOV,VSO,VOS,OVS,OSV");
//			csvWriter.append("\n");
//			
//			for (HashMap<String, String> l : metadata) {
//				csvWriter.append(l.get("Language").concat(","));
//				csvWriter.append(l.get("Classification").concat(","));
//				csvWriter.append(l.get("Tokens").concat(","));
//				csvWriter.append(l.get("Types").concat(","));
//				csvWriter.append(l.get("SVO").concat(","));
//				csvWriter.append(l.get("SOV").concat(","));
//				csvWriter.append(l.get("VSO").concat(","));
//				csvWriter.append(l.get("VOS").concat(","));
//				csvWriter.append(l.get("OVS").concat(","));
//				csvWriter.append(l.get("OSV"));
//			    csvWriter.append("\n");
//			}
//			
//			csvWriter.flush();
//			csvWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
