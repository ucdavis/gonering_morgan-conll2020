package wordorder;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class CorpusWorld extends World {
	public ArrayList<String> o1s = new ArrayList<String>();
	public ArrayList<String> rs = new ArrayList<String>();
	public ArrayList<String> o2s = new ArrayList<String>();
	
	public CorpusWorld(String path) {
		super(path);
	}
	
	public void run() {
		for(int i = 0; i < this.events.size(); i++) {
			Event ev = this.events.get(i);
			for(int j = 0; j < 6; j++) {
				if(this.utt.size() < 6) {
					this.utt.add(new Utterance(ev, j));
				}
				else {
					this.utt.set(j, new Utterance(ev, j));
				}
			}
			for(int j = 0; j < 6; j++) {
				HashMap<String, Word> first = new HashMap<>();
				first.put("caseless", this.utt.get(j).firstWord);
				
				HashMap<String, Word> second = new HashMap<>();
				second.put("caseless", this.utt.get(j).secondWord);
				
				HashMap<String, Word> third = new HashMap<>();
				third.put("caseless", this.utt.get(j).thirdWord);
				
				switch(j) {
//-----------------------------------------------------------------------------------------------------------------------------//
//------SVO----------------------------------------------------------------------------------------------------------------------//
					case 0:	
					{
						this.svoTest.first = first;
						this.svoTest.second = second;
						this.svoTest.third = third;
						this.svoTest.calculate(this.events, ev, this.lexicons);
	
						this.ideal.count++;
						BigDecimal twoThirds = BigDecimal.valueOf(2.0);
						twoThirds = twoThirds.divide(BigDecimal.valueOf(3.0), MathContext.DECIMAL128);
						this.ideal.eta1.add(etaNought.multiply(twoThirds));
						this.ideal.eventProbs.add(ev.probability);
						BigDecimal oneThird = BigDecimal.valueOf(1.0);
						oneThird = oneThird.divide(BigDecimal.valueOf(3.0), MathContext.DECIMAL128);
						this.ideal.eta2.add(etaNought.multiply(oneThird));
					}
					break;
//-----------------------------------------------------------------------------------------------------------------------------//
//-----SOV---------------------------------------------------------------------------------------------------------------------//
					case 1:
					{
						this.sovTest.first = first;
						this.sovTest.second = second;
						this.sovTest.third = third;
						this.sovTest.calculate(this.events, ev, this.lexicons);
					}
					break;
//-----------------------------------------------------------------------------------------------------------------------------//
//-----VSO---------------------------------------------------------------------------------------------------------------------//
					case 2:
					{
						this.vsoTest.first = first;
						this.vsoTest.second = second;
						this.vsoTest.third = third;
						this.vsoTest.calculate(this.events, ev, this.lexicons);					
					}
					break;
//-----------------------------------------------------------------------------------------------------------------------------//
//-----VOS---------------------------------------------------------------------------------------------------------------------//
					case 3:
					{
						this.vosTest.first = first;
						this.vosTest.second = second;
						this.vosTest.third = third;
						this.vosTest.calculate(this.events, ev, this.lexicons);
					}
					break;
//-----------------------------------------------------------------------------------------------------------------------------//
//-----OSV---------------------------------------------------------------------------------------------------------------------//
					case 4:
					{
						this.osvTest.first = first;
						this.osvTest.second = second;
						this.osvTest.third = third;
						this.osvTest.calculate(this.events, ev, this.lexicons);				
					}
					break;
//----------------------------------------------------------------------------------------------------------------------------//
//-----OVS--------------------------------------------------------------------------------------------------------------------//
					case 5:
					{
						this.ovsTest.first = first;
						this.ovsTest.second = second;
						this.ovsTest.third = third;
						this.ovsTest.calculate(this.events, ev, this.lexicons);
					}
					break;
					default:
						break;
				}
			}
		}
	}
	
	protected ArrayList<Event> genEvents() {
		ArrayList<Event> events = new ArrayList<>();
		ArrayList<String> subjs = new ArrayList<String>();
		ArrayList<String> verbs = new ArrayList<String>();
		ArrayList<String> objs = new ArrayList<String>();
		try {
			Files.lines(Paths.get(this.corpusPath), Charset.forName("Cp1252"))
//			Files.lines(Paths.get(this.corpusPath))
			.forEach(line -> {
				String[] breakingUpTheBand = line.split(", ");
				if(subjs.contains(breakingUpTheBand[0])) {
					subjs.add(breakingUpTheBand[0]);
				}
				if(verbs.contains(breakingUpTheBand[1])) {
					verbs.add(breakingUpTheBand[1]);
				}
				if(objs.contains(breakingUpTheBand[2])) {
					objs.add(breakingUpTheBand[2]);
				}
				double p = Double.valueOf(breakingUpTheBand[5]);
				events.add(new Event(breakingUpTheBand[0], breakingUpTheBand[1], breakingUpTheBand[2], p));
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.o1s = subjs;
		this.rs = verbs;
		this.o2s = objs;
		return events;
	}
}
