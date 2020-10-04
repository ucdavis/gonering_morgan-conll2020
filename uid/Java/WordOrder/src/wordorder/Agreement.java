package wordorder;

import java.util.ArrayList;
import java.util.HashMap;

public class Agreement {
	public HashMap<Integer, ArrayList<Enum>> subject = new HashMap<Integer, ArrayList<Enum>>();
	public HashMap<Integer, ArrayList<Enum>> object = new HashMap<Integer, ArrayList<Enum>>();
	
	public Agreement() {
		ArrayList<Enum> l = new ArrayList<Enum>();
		l.add(NounClass.NONE);
		l.add(Number.NONE);
		this.subject.put(0, l);
		this.object.put(0, l);
		l.clear();
		
		l.add(NounClass.MASCULINE);
		l.add(NounClass.FEMININE);
		l.add(Number.NONE);
		this.subject.put(1, l);
		this.object.put(1, l);
		l.clear();
		
		l.add(NounClass.MASCULINE);
		l.add(NounClass.FEMININE);
		l.add(Number.SINGULAR);
		l.add(Number.PLURAL_TWO);
		this.subject.put(2, l);
		this.object.put(2, l);
		l.clear();
		
		l.add(NounClass.MASCULINE);
		l.add(NounClass.FEMININE);
		l.add(Number.SINGULAR);
		l.add(Number.DUAL);
		l.add(Number.PLURAL_THREE);
		this.subject.put(3, l);
		this.object.put(3, l);
		l.clear();
		
		l.add(NounClass.MASCULINE);
		l.add(NounClass.FEMININE);
		l.add(NounClass.NEUTER);
		l.add(Number.NONE);
		this.subject.put(4, l);
		this.object.put(4, l);
		l.clear();
		
		l.add(NounClass.MASCULINE);
		l.add(NounClass.FEMININE);
		l.add(NounClass.NEUTER);
		l.add(Number.SINGULAR);
		l.add(Number.PLURAL_TWO);
		this.subject.put(5, l);
		this.object.put(5, l);
		l.clear();
		
		l.add(NounClass.MASCULINE);
		l.add(NounClass.FEMININE);
		l.add(NounClass.NEUTER);
		l.add(Number.SINGULAR);
		l.add(Number.DUAL);
		l.add(Number.PLURAL_THREE);
		this.subject.put(6, l);
		this.object.put(6, l);
		l.clear();
		
		l.add(NounClass.ANIMATE);
		l.add(NounClass.INANIMATE);
		l.add(Number.NONE);
		this.subject.put(7, l);
		this.object.put(7, l);
		l.clear();
		
		l.add(NounClass.ANIMATE);
		l.add(NounClass.INANIMATE);
		l.add(Number.SINGULAR);
		l.add(Number.PLURAL_TWO);
		this.subject.put(8, l);
		this.object.put(8, l);
		l.clear();
		
		l.add(NounClass.ANIMATE);
		l.add(NounClass.INANIMATE);
		l.add(Number.SINGULAR);
		l.add(Number.DUAL);
		l.add(Number.PLURAL_THREE);
		this.subject.put(9, l);
		this.object.put(9, l);
		l.clear();
		
		l.add(NounClass.HUMAN);
		l.add(NounClass.NONHUMAN);
		l.add(Number.NONE);
		this.subject.put(10, l);
		this.object.put(10, l);
		l.clear();
		
		l.add(NounClass.HUMAN);
		l.add(NounClass.NONHUMAN);
		l.add(Number.SINGULAR);
		l.add(Number.PLURAL_TWO);
		this.subject.put(11, l);
		this.object.put(11, l);
		l.clear();
		
		l.add(NounClass.HUMAN);
		l.add(NounClass.NONHUMAN);
		l.add(Number.SINGULAR);
		l.add(Number.DUAL);
		l.add(Number.PLURAL_THREE);
		this.subject.put(12, l);
		this.object.put(12, l);
		l.clear();
		
		l.add(NounClass.HUMAN);
		l.add(NounClass.ANIMAL);
		l.add(NounClass.INANIMATE);
		l.add(Number.NONE);
		this.subject.put(13, l);
		this.object.put(13, l);
		l.clear();
		
		l.add(NounClass.HUMAN);
		l.add(NounClass.ANIMAL);
		l.add(NounClass.INANIMATE);
		l.add(Number.SINGULAR);
		l.add(Number.PLURAL_TWO);
		this.subject.put(14, l);
		this.object.put(14, l);
		l.clear();
		
		l.add(NounClass.HUMAN);
		l.add(NounClass.ANIMAL);
		l.add(NounClass.INANIMATE);
		l.add(Number.SINGULAR);
		l.add(Number.DUAL);
		l.add(Number.PLURAL_THREE);
		this.subject.put(15, l);
		this.object.put(15, l);
		l.clear();
		
		l.add(NounClass.MALE);
		l.add(NounClass.NONMALE);
		l.add(Number.NONE);
		this.subject.put(16, l);
		this.object.put(16, l);
		l.clear();
		
		l.add(NounClass.MALE);
		l.add(NounClass.NONMALE);
		l.add(Number.SINGULAR);
		l.add(Number.PLURAL_TWO);
		this.subject.put(17, l);
		this.object.put(17, l);
		l.clear();
		
		l.add(NounClass.MALE);
		l.add(NounClass.NONMALE);
		l.add(Number.SINGULAR);
		l.add(Number.DUAL);
		l.add(Number.PLURAL_THREE);
		this.subject.put(18, l);
		this.object.put(18, l);
		l.clear();
		
		l.add(NounClass.MALEHUMAN);
		l.add(NounClass.NONMALEHUMAN);
		l.add(Number.NONE);
		this.subject.put(19, l);
		this.object.put(19, l);
		l.clear();
		
		l.add(NounClass.MALEHUMAN);
		l.add(NounClass.NONMALEHUMAN);
		l.add(Number.SINGULAR);
		l.add(Number.PLURAL_TWO);
		this.subject.put(20, l);
		this.object.put(20, l);
		l.clear();
		
		l.add(NounClass.MALEHUMAN);
		l.add(NounClass.NONMALEHUMAN);
		l.add(Number.SINGULAR);
		l.add(Number.DUAL);
		l.add(Number.PLURAL_THREE);
		this.subject.put(21, l);
		this.object.put(21, l);
		l.clear();
		
		l.add(NounClass.COMMON);
		l.add(NounClass.NEUTER);
		l.add(Number.NONE);
		this.subject.put(22, l);
		this.object.put(22, l);
		l.clear();
		
		l.add(NounClass.COMMON);
		l.add(NounClass.NEUTER);
		l.add(Number.SINGULAR);
		l.add(Number.PLURAL_TWO);
		this.subject.put(23, l);
		this.object.put(23, l);
		l.clear();
		
		l.add(NounClass.COMMON);
		l.add(NounClass.NEUTER);
		l.add(Number.SINGULAR);
		l.add(Number.DUAL);
		l.add(Number.PLURAL_THREE);
		this.subject.put(24, l);
		this.object.put(24, l);
		l.clear();
	}
}