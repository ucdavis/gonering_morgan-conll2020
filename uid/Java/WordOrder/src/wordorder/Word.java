package wordorder;

import java.util.ArrayList;
import java.util.HashMap;

public class Word {
	public String word;
	public HashMap<String, ArrayList<Enum>> inflection;
	
	public Word(String w, String inflKey, Enum infl) {
		this.word = w;
		this.inflection = new HashMap<String, ArrayList<Enum>>();
		ArrayList<Enum> i = new ArrayList<Enum>();
		i.add(infl);
		this.inflection.put(inflKey, i);
	}
	
	public Word(String w, String inflKey, ArrayList<Enum> infls) {
		this.word = w;
		this.inflection = new HashMap<String, ArrayList<Enum>>();
		this.inflection.put(inflKey, infls);
	}
	
	public Word(String w, HashMap<String, ArrayList<Enum>> i) {
		this.word = w;
		this.inflection = new HashMap<String, ArrayList<Enum>>();
		i.forEach((key, value) -> {
			this.inflection.put(key, value);
		});
	}
	
	public Word(String w, String[] inflKeys, Enum[] infls) {
		this.word = w;
		this.inflection = new HashMap<String, ArrayList<Enum>>();
		for(int i = 0; i < inflKeys.length; i++) {
			ArrayList<Enum> inf = new ArrayList<Enum>();
			inf.add(infls[i]);
			this.inflection.put(inflKeys[i], inf);
		}
	}
	
	public void addInfl(String inflKey, Enum infl) {
		ArrayList<Enum> i = new ArrayList<Enum>();
		i.add(infl);
		this.inflection.put(inflKey, i);
	}
	
	public void agree(String agrKey, ArrayList<Enum> agrs) {
		this.inflection.put(agrKey, agrs);
	}
}
