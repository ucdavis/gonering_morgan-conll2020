package wordorder;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class GetResults {

	public static void main(String[] args) {
//		ToyWorld tw = new ToyWorld();
//		System.out.println("Maurits et al. Toy world...");
//		tw.run();
//		tw.getStats();
//		tw.writeToCSV("C:\\Users\\brenn\\Documents\\Results\\toyworld-mi_only.csv");
////		tw.writeToCSV("/home/brennan/Documents/College work/Grad school/2019 - 2020/Prelim paper/Results/toyworld-results.csv");
//		System.out.println("Toy world done");
//		
//		CorpusWorld bw = new CorpusWorld("/home/brennan/Documents/College work/Grad school/2019 - 2020/Prelim paper/CHILDES-Brown-extracted.txt");
//		System.out.println("CHILDES, Brown...");
//		bw.run();
//		bw.getStats();
//		bw.writeToCSV("/home/brennan/Documents/College work/Grad school/2019 - 2020/Prelim paper/Results/childes_brown-results.csv");
//		System.out.println("CHILDES, Brown done");
		
		ArrayList<String> langs = new ArrayList<>();
		ArrayList<String> langAbvs = new ArrayList<>();
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
		
//		langs.add("English");
//		langAbvs.add("eng");
//		langs.add("Japanese");
//		langAbvs.add("ja");
//		langs.add("Irish");
//		langAbvs.add("gae");
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
		langs.add("German");
		langAbvs.add("deu");
		for(int i = 0; i < langs.size(); i++) {
			String ud_path = "C:\\Users\\brenn\\Documents\\UD data\\"; // "/home/brennan/Documents/College work/Grad school/2019 - 2020/Prelim paper/UD data/"
			CorpusWorld udw = new CorpusWorld(ud_path + langs.get(i) + "\\ud-" + langAbvs.get(i) + "-extracted-excl_singletons.txt");
			System.out.println("UD " + langs.get(i) + "...");
			udw.run();
			udw.getStats();
			String results_path = "C:\\Users\\brenn\\Documents\\Results\\singletons excluded"; // "/home/brennan/Documents/College work/Grad school/2019 - 2020/Prelim paper/Results
			udw.writeToCSV(results_path + "\\ud_" + langAbvs.get(i) + "-results-excl_singletons-mi_only.csv");
			
//			for(int j = 1; j <= 10; j++) {
//				udw = new CorpusWorld(ud_path + langs.get(i) + "\\subsets\\subset" + j + "\\ud-" + langAbvs.get(i) + "_subset" + j + "-extracted.txt");
//				System.out.println("\tsubset " + j + "...");
//				udw.run();
//				
//				if(udw.events.size() < 100) {
//					System.out.println("\tfaaarrrrr too few events, skipping");
//				}
//				else {
//					udw.getStats();
//					udw.writeToCSV(results_path + "\\ud_" + langAbvs.get(i) + "-subset" + j + "-results.csv");
//					System.out.println("\tsubset " + j + " done");
//				}
//			}
			
			System.out.println("UD " + langs.get(i) + " done");
		}
	}
	
	protected static void printRankings(ArrayList<HashMap<String, BigDecimal>> unranked) {
		for(int k = 0; k < unranked.size(); k++) {
			List<HashMap.Entry<String, BigDecimal>> list = new LinkedList<HashMap.Entry<String, BigDecimal>>(unranked.get(k).entrySet()); 
			
			Collections.sort(list, new Comparator<HashMap.Entry<String, BigDecimal>>() { 
				public int compare(HashMap.Entry<String, BigDecimal> o1,  HashMap.Entry<String, BigDecimal> o2) {
					return (o1.getValue()).compareTo(o2.getValue()); 
				}
			});
			
		    System.out.println("rank:");
		    for (HashMap.Entry<String, BigDecimal> aa : list) {
		    	System.out.println(aa.getKey() + " " + aa.getValue());
		    }
		}
	}
	
}
