package wordorder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GetResults {
	private static boolean isWindows;

	public static void runTW() {
		ToyWorld tw = new ToyWorld();
		System.out.println("Maurits et al. toyworld...");
		tw.run();
		printRankings(tw.getStats());
		
		String writeTo = "Results/toyworld-results.csv";
		if(isWindows) {
			writeTo = writeTo.replace("/", "\\");
		}
		tw.writeToCSV(writeTo);
		System.out.println("Toy world done");
	}
	
	public static void runBrown() {
		CorpusWorld bw = new CorpusWorld("CHILDES-Brown-extracted.txt");
		System.out.println("CHILDES, Brown corpus...");
		bw.run();
		printRankings(bw.getStats());
		
		String writeTo = "Results/childes_brown-results.csv";
		if(isWindows) {
			writeTo = writeTo.replace("/", "\\");
		}
		bw.writeToCSV(writeTo);
		System.out.println("CHILDES, Brown corpus done");
	}
	
	public static void runUD() {
		ArrayList<String> langs = new ArrayList<>();
		ArrayList<String> langAbvs = new ArrayList<>();		
		langs.add("English");
		langAbvs.add("eng");
		langs.add("Japanese");
		langAbvs.add("ja");
		langs.add("Irish");
		langAbvs.add("gae");
		langs.add("Basque");
		langAbvs.add("eus");
		langs.add("Breton");
		langAbvs.add("bre");
		langs.add("Hindi");
		langAbvs.add("hin");
		langs.add("Hungarian");
		langAbvs.add("hun");
		langs.add("Indonesian");
		langAbvs.add("ind");
		langs.add("Korean");
		langAbvs.add("kor");
		langs.add("Mbya Guarani");
		langAbvs.add("mgu");
		langs.add("Scottish Gaelic");
		langAbvs.add("gai");
		langs.add("Tagalog");
		langAbvs.add("tag");
		langs.add("Turkish");
		langAbvs.add("tur");
		langs.add("Vietnamese");
		langAbvs.add("vie");
		langs.add("Warlpiri");
		langAbvs.add("war");
		langs.add("Welsh");
		langAbvs.add("cym");
		langs.add("Wolof");
		langAbvs.add("wol");
		langs.add("Mandarin");
		langAbvs.add("zho");
		langs.add("Dutch");
		langAbvs.add("ned");
		langs.add("German");
		langAbvs.add("deu");
		
		System.out.println("What language(s) is(are) you processing?");
		System.out.println("all");
		for(int i = 0; i < langs.size(); i++) {
			System.out.println(i + " - " + langs.get(i));
		}
		
		Scanner in = new Scanner(System.in);
		String toProcessLangs = "";
		if(in.hasNext()) {
			toProcessLangs = in.nextLine();
		}
		in.close();
		
		int startLang = -1;
		int endLang = -1;
		if(toProcessLangs.contains("-")) {
			startLang = Integer.valueOf(toProcessLangs.split("-")[0]);
			endLang = Integer.valueOf(toProcessLangs.split("-")[1]);
		}
		else {
			if(toProcessLangs.equalsIgnoreCase("all")) {
				startLang = 0;
				endLang = langs.size()-1;
			}
			else {
				startLang = Integer.valueOf(toProcessLangs);
				endLang = startLang;
			}
		}
		
		String ud_path = "UD data/";
		String writeTo = "Results/";
		if(isWindows) {
			ud_path = ud_path.replace("/", "\\");
			writeTo = writeTo.replace("/", "\\");
		}
		
		for(int i = startLang; i <= endLang; i++) {
			String corpPath = ud_path.concat(langs.get(i))
										.concat("/ud-")
										.concat(langAbvs.get(i))
										.concat("-extracted-excl_singletons.txt");
			if(isWindows) {
				corpPath = corpPath.replace("/", "\\");
			}
			
			String results_path = writeTo.concat("ud-").concat(langAbvs.get(i)).concat("-results-excl_singletons.csv");
			
			CorpusWorld udw = new CorpusWorld(corpPath);
			System.out.println("UD " + langs.get(i) + "...");
			udw.run();
			udw.getStats();
			udw.writeToCSV(results_path);
			
			System.out.println("UD " + langs.get(i) + " done");
		}
	}
	
	public static void main(String[] args) {
		if(System.getProperty("os.name").startsWith("Windows")) {
			isWindows = true;
		} else { isWindows = false; }
		
		System.out.println("What event dataset corpus would you like to run?\n"
				+ "(a)ll\n"
				+ "toyworld (tw)\n"
				+ "(c)hildes (b)rown corpora\n"
				+ "(ud)-derived language corpora");
		Scanner in = new Scanner(System.in);
		String dataset =  new String();
		if(in.hasNext()) {
			dataset = in.nextLine();
		}
		in.close();
		
		if(dataset.equalsIgnoreCase("all") || dataset.equalsIgnoreCase("tw") || dataset.equalsIgnoreCase("toyworld")) {
			runTW();
		}
		if(dataset.equalsIgnoreCase("all") || dataset.equalsIgnoreCase("c") || dataset.equalsIgnoreCase("b") || 
					dataset.equalsIgnoreCase("childes") || dataset.equalsIgnoreCase("brown")) {
			runBrown();
		}
		if(dataset.equalsIgnoreCase("all") || dataset.equalsIgnoreCase("ud")) {
			runUD();
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
