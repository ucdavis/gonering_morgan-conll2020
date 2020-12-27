package extraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Extractor {
	private static boolean isWindows;
	
	public static void main(String[] args) {
		if(System.getProperty("os.name").startsWith("Windows")) {
			isWindows = true;
		} else { isWindows = false; }
		
		ArrayList<String> langs = new ArrayList<>();
		ArrayList<String> langAbvs = new ArrayList<>();
		
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
		langs.add("English");
		langAbvs.add("eng");
		langs.add("Japanese");
		langAbvs.add("ja");
		langs.add("Irish");
		langAbvs.add("gae");
		
		String ud_path = "UD data/";
		if(isWindows) {
			ud_path = ud_path.replace("/", "\\");
		}
		
		System.out.println("What language(s) is(are) you processing?");
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < langs.size(); i++) {
			System.out.println(i + " - " + langs.get(i));
		}
		
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
		
		StepOne s1 = new StepOne(ud_path, isWindows);
		StepTwo s2 = new StepTwo(ud_path, isWindows);
		
		for(int z = startLang; z <= endLang; z++) {
			System.out.println(langs.get(z));
			
			s1.extractAndWrite(langs.get(z), langAbvs.get(z));
			s2.leaveSingletonsOut(langs.get(z), langAbvs.get(z));
		}
	}
}