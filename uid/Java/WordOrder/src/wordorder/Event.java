package wordorder;

public class Event {
		public People person;
		public String arg1;
		public Actions action;
		public String verb;
		public Objects obj;
		public String arg2;
		public double probability;
		
		public Event(People p, Actions a, Objects o, double prob) {
			this.person = p;
			this.action = a;
			this.obj = o;
			this.probability = prob;
		}
		
		public Event(String o1, String r, String o2, double p) {
			this.arg1 = o1;
			this.verb = r;
			this.arg2 = o2;
			this.probability = p;
		}
	}