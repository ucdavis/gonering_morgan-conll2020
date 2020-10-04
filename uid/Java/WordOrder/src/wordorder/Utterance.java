package wordorder;
import java.util.ArrayList;
import java.util.Collections;

public class Utterance {
	public Word firstWord;
	public Word secondWord;
	public Word thirdWord;
	
	public Utterance(Event event, int wordOrder) {
		ArrayList<Word> utt = new ArrayList<Word>();
		ArrayList<Enum> al = new ArrayList<Enum>();
		
		utt.add(this.Inflect(event.arg1, "case", Case.NONE));
		al.add(NounClass.NONE);
		Word verb = new Word(event.verb, "subj", al);
		verb.agree("obj", al);
		utt.add(verb);
		utt.add(this.Inflect(event.arg2, "case", Case.NONE));
		genWordOrder(utt, wordOrder);
	}
	
	public Utterance(Event event, int wordOrder, int nounInfl) {
		ArrayList<Word> utt = new ArrayList<Word>();
		ArrayList<Enum> al = new ArrayList<Enum>();
		switch(nounInfl) {
			case 0:
				utt.add(this.Inflect(event.arg1, "case", Case.NONE));
				break;
			case 1:
				utt.add(this.Inflect(event.arg1, "case", Case.NOM));
				break;
			case 2:
				utt.add(this.Inflect(event.arg1, "case", Case.NONE));
				break;
			case 3:
				utt.add(this.Inflect(event.arg1, "case", Case.NOM));
				break;
			case 4:
				utt.add(this.Inflect(event.arg1, "case", Case.ERG));
				break;
			case 5:
				utt.add(this.Inflect(event.arg1, "case", Case.NONE));
				break;
			case 6:
				utt.add(this.Inflect(event.arg1, "case", Case.ERG));
				break;
			default:
				utt.add(this.Inflect(event.arg1, "case", Case.NONE));
				break;
		}
		
		al.add(NounClass.NONE);
		Word verb = new Word(event.verb, "subj", al);
		verb.agree("obj", al);
		utt.add(verb);
		
		switch(nounInfl) {
			case 0:
			case 1:
				utt.add(this.Inflect(event.arg2, "case", Case.NONE));
				break;
			case 2:
				utt.add(this.Inflect(event.arg2, "case", Case.ACC));
				break;
			case 3:
				utt.add(this.Inflect(event.arg2, "case", Case.ACC));
				break;
			case 4:
				utt.add(this.Inflect(event.arg2, "case", Case.NONE));
				break;
			case 5:
				utt.add(this.Inflect(event.arg2, "case", Case.ABS));
				break;
			case 6:
				utt.add(this.Inflect(event.arg2, "case", Case.ABS));
				break;
			default:
				utt.add(this.Inflect(event.arg2, "case", Case.NONE));
				break;
		}
		
		genWordOrder(utt, wordOrder);
	}
	
	public Utterance (ArrayList<Word> event, int wordOrder, int nounInfl, int verbInfl) {
		ArrayList<Word> temp = new ArrayList<Word>();
		for(int i = 0; i < event.size(); i++) {
			temp.add(new Word(event.get(i).word, event.get(i).inflection));
		}
		
		ArrayList<Enum> aL = new ArrayList<Enum>();
		switch(verbInfl) {
			case 1:
				// verb agrees w/ subject in noun class only
				aL.add(temp.get(0).inflection.get("class").get(0));
				temp.get(1).agree("subj", aL);
				
				aL = new ArrayList<Enum>();
				aL.add(NounClass.NONE);
				temp.get(1).agree("obj", aL);
				
				aL = new ArrayList<Enum>();
				break;
			case 2:
				// verb agrees w/ subject in person only
				aL.add(temp.get(0).inflection.get("person").get(0));
				temp.get(1).agree("subj", aL);
				
				aL = new ArrayList<Enum>();
				aL.add(NounClass.NONE);
				temp.get(1).agree("obj", aL);
				
				aL = new ArrayList<Enum>();
				break;
			case 3:
				// verb agrees w/ object in noun class only
				aL.add(temp.get(2).inflection.get("class").get(0));
				temp.get(1).agree("obj", aL);
				
				aL = new ArrayList<Enum>();				
				aL.add(NounClass.NONE);
				temp.get(1).agree("subj", aL);
				
				aL = new ArrayList<Enum>();
				break;
			case 4:
				// verb agrees w/ object in person only
				aL.add(temp.get(2).inflection.get("person").get(0));
				temp.get(1).agree("obj", aL);
				
				aL = new ArrayList<Enum>();
				aL.add(Person.NONE);
				temp.get(1).agree("subj", aL);
				
				aL = new ArrayList<Enum>();
				break;
			case 5:
				// verb agrees w/ subject & object in noun class only
				aL.add(temp.get(0).inflection.get("class").get(0));
				temp.get(1).agree("subj", aL);
				aL = new ArrayList<Enum>();
				
				aL.add(temp.get(2).inflection.get("class").get(0));
				temp.get(1).agree("obj", aL);
				aL = new ArrayList<Enum>();
				break;
			case 6:
				// verb agrees w/ subject & object in person only
				aL.add(temp.get(0).inflection.get("person").get(0));
				temp.get(1).agree("subj", aL);
				
				aL = new ArrayList<Enum>();
				aL.add(temp.get(2).inflection.get("person").get(0));
				temp.get(1).agree("obj", aL);
				
				aL = new ArrayList<Enum>();
				break;
			case 7:
				// verb agrees w/ subject in number only
				aL.add(temp.get(0).inflection.get("number").get(0));
				temp.get(1).agree("subj", aL);
				
				aL = new ArrayList<Enum>();
				aL.add(Number.NONE);
				temp.get(1).agree("obj", aL);
				
				aL = new ArrayList<Enum>();
				break;
			case 8:
				// verb agrees w/ object in number only
				aL.add(temp.get(2).inflection.get("number").get(0));
				temp.get(1).agree("obj", aL);
				
				aL = new ArrayList<Enum>();
				aL.add(Number.NONE);
				temp.get(1).agree("subj", aL);
				
				aL = new ArrayList<Enum>();
				break;
			case 9:
				// verb agrees w/ subject & object in number only
				aL.add(temp.get(0).inflection.get("number").get(0));
				temp.get(1).agree("subj", aL);
				
				aL = new ArrayList<Enum>();
				aL.add(temp.get(2).inflection.get("number").get(0));
				temp.get(1).agree("obj", aL);
				
				aL = new ArrayList<Enum>();
				break;
			case 10:
				// verb agrees w/ subject in person & number
				aL.add(temp.get(0).inflection.get("person").get(0));
				aL.add(temp.get(0).inflection.get("number").get(0));
				temp.get(1).agree("subj", aL);
				
				aL = new ArrayList<Enum>();
				aL.add(Number.NONE);
				temp.get(1).agree("obj", aL);
				
				aL = new ArrayList<Enum>();
				break;
			case 11:
				// verb agrees w/ object in person & number
				aL.add(temp.get(2).inflection.get("person").get(0));
				aL.add(temp.get(2).inflection.get("number").get(0));
				temp.get(1).agree("obj", aL);
				
				aL = new ArrayList<Enum>();
				aL.add(Number.NONE);
				temp.get(1).agree("subj", aL);
				
				aL = new ArrayList<Enum>();
				break;
			case 12:
				// verb agrees w/ subject & object in person & number
				aL.add(temp.get(0).inflection.get("person").get(0));
				aL.add(temp.get(0).inflection.get("number").get(0));
				temp.get(1).agree("subj", aL);
				
				aL = new ArrayList<Enum>();
				aL.add(temp.get(2).inflection.get("person").get(0));
				aL.add(temp.get(2).inflection.get("number").get(0));
				temp.get(1).agree("obj", aL);
				
				aL = new ArrayList<Enum>();
				break;
			case 13:
				// verb agrees w/ subject in person & number & class
				aL.add(temp.get(0).inflection.get("person").get(0));
				aL.add(temp.get(0).inflection.get("number").get(0));
				aL.add(temp.get(0).inflection.get("class").get(0));
				temp.get(1).agree("subj", aL);
				
				aL = new ArrayList<Enum>();
				aL.add(Number.NONE);
				temp.get(1).agree("obj", aL);
				
				aL = new ArrayList<Enum>();
				break;
			case 14:
				// verb agrees w/ object in person & number & class
				aL.add(temp.get(2).inflection.get("person").get(0));
				aL.add(temp.get(2).inflection.get("number").get(0));
				aL.add(temp.get(2).inflection.get("class").get(0));
				temp.get(1).agree("obj", aL);
				
				aL = new ArrayList<Enum>();
				aL.add(Number.NONE);
				temp.get(1).agree("subj", aL);
				
				aL = new ArrayList<Enum>();
				break;
			case 15:
				// verb agrees w/ subject & object in person & number
				aL.add(temp.get(0).inflection.get("person").get(0));
				aL.add(temp.get(0).inflection.get("number").get(0));
				aL.add(temp.get(0).inflection.get("class").get(0));
				temp.get(1).agree("subj", aL);
				
				aL = new ArrayList<Enum>();
				aL.add(temp.get(2).inflection.get("person").get(0));
				aL.add(temp.get(2).inflection.get("number").get(0));
				aL.add(temp.get(2).inflection.get("class").get(0));
				temp.get(1).agree("obj", aL);
				
				aL = new ArrayList<Enum>();
				break;
			default:
				break;
		}
		
		aL = new ArrayList<Enum>();
		
		switch(nounInfl) {
			case 0:
				aL.add(Case.NONE);
				break;
			case 1:
				aL.add(Case.NOM);
				break;
			case 2:
				aL.add(Case.NONE);
				break;
			case 3:
				aL.add(Case.NOM);
				break;
			case 4:
				aL.add(Case.ERG);
				break;
			case 5:
				aL.add(Case.NONE);
				break;
			case 6:
				aL.add(Case.ERG);
				break;
			default:
				aL.add(Case.NONE);
				break;
		}

		temp.get(0).inflection.put("case", aL);
		
		aL = new ArrayList<Enum>();
		
		switch(nounInfl) {
			case 0:
				aL.add(Case.NONE);
				break;
			case 1:
				aL.add(Case.NONE);
				break;
			case 2:
				aL.add(Case.ACC);
				break;
			case 3:
				aL.add(Case.ACC);
				break;
			case 4:
				aL.add(Case.NONE);
				break;
			case 5:
				aL.add(Case.ABS);
				break;
			case 6:
				aL.add(Case.ABS);
				break;
			default:
				aL.add(Case.NONE);
				break;
		}
		
		temp.get(2).inflection.put("case", aL);
		
		genWordOrder(temp, wordOrder);
	}
	
	public Word Inflect(String w, String inflKey, Enum infl) {
		Word inflWord = new Word(w, inflKey, infl);
		return inflWord;
	}
	
	public Word Inflect(String w, String inflKey, ArrayList<Enum> infls) {
		Word inflWord = new Word(w, inflKey, infls);
		return inflWord;
	}
	
	public void genWordOrder(ArrayList<Word> utt, int wordOrder) {
		switch(wordOrder) {
			// SVO
			case 0:
				this.firstWord = utt.get(0);
				this.secondWord = utt.get(1);
				this.thirdWord = utt.get(2);
				break;
			// SOV
			case 1:
				this.firstWord = utt.get(0);
				this.secondWord = utt.get(2);
				this.thirdWord = utt.get(1);
				break;
			// VSO
			case 2:
				this.firstWord = utt.get(1);
				this.secondWord = utt.get(0);
				this.thirdWord = utt.get(2);
				break;
			// VOS
			case 3:
				this.firstWord = utt.get(1);
				this.secondWord = utt.get(2);
				this.thirdWord = utt.get(0);
				break;
			// OSV
			case 4:
				this.firstWord = utt.get(2);
				this.secondWord = utt.get(0);
				this.thirdWord = utt.get(1);
				break;
			// OVS
			case 5:
				this.firstWord = utt.get(2);
				this.secondWord = utt.get(1);
				this.thirdWord = utt.get(0);
				break;
			default:
				this.firstWord = utt.get(0);
				this.secondWord = utt.get(1);
				this.thirdWord = utt.get(2);
				break;
		}
	}
}
