package wordorder;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	BigDecimal eta1 = new BigDecimal(0);
	BigDecimal eta2 = new BigDecimal(0);
	HashMap<String, Word> first = new HashMap<>();
	HashMap<String, Word> second = new HashMap<>();
	HashMap<String, Word> third = new HashMap<>();
	protected Stats[] all;
	protected String[] conditionCode = new String[] {
	 /*i=0*/"caseless", "nom", "acc", "nomacc", "erg", "abs", "ergabs", // i=6
	 /*i=7*/"s-123", "o-123", "so-123", // i=9
	 /*i=10*/"s-sp", "o-sp", "so-sp", // i=12
	 /*i=13*/"s-123+sp", "s-123+sp+nom", "s-123+sp+acc", "s-123+sp+nomacc", "s-123+sp+erg", "s-123+sp+abs", "s-123+sp+ergabs", // i=19 
	 /*i=20*/"o-123+sp", "o-123+sp+nom", "o-123+sp+acc", "o-123+sp+nomacc", "o-123+sp+erg", "o-123+sp+abs", "o-123+sp+ergabs", // i=26
	 /*i=27*/"so-123+sp", "so-123+sp+nom", "so-123+sp+acc", "so-123+sp+nomacc", "so-123+sp+erg", "so-123+sp+abs", "so-123+sp+ergabs", // i=33
	 /*i=34*/"s-mf", "s-mf+nom", "s-mf+acc", "s-mf+nomacc", "s-mf+erg", "s-mf+abs", "s-mf+ergabs", // i=40
	 /*i=41*/"s-mfn", "s-mfn+nom", "s-mfn+acc", "s-mfn+nomacc", "s-mfn+erg", "s-mfn+abs", "s-mfn+ergabs", // i=47
	 /*i=48*/"s-cn", "s-cn+nom", "s-cn+acc", "s-cn+nomacc", "s-cn+erg", "s-cn+abs", "s-cn+ergabs", // i=54
	 /*i=55*/"s-ai", "s-ai+nom", "s-ai+acc", "s-ai+nomacc", "s-ai+erg", "s-ai+abs", "s-ai+ergabs", // i=61
	 /*i=62*/"s-hn", "s-hn+nom", "s-hn+acc", "s-hn+nomacc", "s-hn+erg", "s-hn+abs", "s-hn+ergabs", // i=68
	 /*i=69*/"s-hai", "s-hai+nom", "s-hai+acc", "s-hai+nomacc", "s-hai+erg", "s-hai+abs", "s-hai+ergabs", // i=75
	 /*i=76*/"s-mnm", "s-mnm+nom", "s-mnm+acc", "s-mnm+nomacc", "s-mnm+erg", "s-mnm+abs", "s-mnm+ergabs", // i=82
	 /*i=83*/"o-mf", "o-mf+nom", "o-mf+acc", "o-mf+nomacc", "o-mf+erg", "o-mf+abs", "o-mf+ergabs", // i=89
	 /*i=90*/"o-mfn", "o-mfn+nom", "o-mfn+acc", "o-mfn+nomacc", "o-mfn+erg", "o-mfn+abs", "o-mfn+ergabs", // i=96
	 /*i=97*/"o-cn", "o-cn+nom", "o-cn+acc", "o-cn+nomacc", "o-cn+erg", "o-cn+abs", "o-cn+ergabs", // i=103
	 /*i=104*/"o-ai", "o-ai+nom", "o-ai+acc", "o-ai+nomacc", "o-ai+erg", "o-ai+abs", "o-ai+ergabs", // i=110
	 /*i=111*/"o-hn", "o-hn+nom", "o-hn+acc", "o-hn+nomacc", "o-hn+erg", "o-hn+abs", "o-hn+ergabs", // i=117
	 /*i=118*/"o-hai", "o-hai+nom", "o-hai+acc", "o-hai+nomacc", "o-hai+erg", "o-hai+abs", "o-hai+ergabs", // i=124
	 /*i=125*/"o-mnm", "o-mnm+nom", "o-mnm+acc", "o-mnm+nomacc", "o-mnm+erg", "o-mnm+abs", "o-mnm+ergabs", // i=131
	 /*i=132*/"so-mf", "so-mf+nom", "so-mf+acc", "so-mf+nomacc", "so-mf+erg", "so-mf+abs", "so-mf+ergabs", // i=138
	 /*i=139*/"so-mfn", "so-mfn+nom", "so-mfn+acc", "so-mfn+nomacc", "so-mfn+erg", "so-mfn+abs", "so-mfn+ergabs", // i=145
	 /*i=146*/"so-cn", "so-cn+nom", "so-cn+acc", "so-cn+nomacc", "so-cn+erg", "so-cn+abs", "so-cn+ergabs", // i=152
	 /*i=153*/"so-ai", "so-ai+nom", "so-ai+acc", "so-ai+nomacc", "so-ai+erg", "so-ai+abs", "so-ai+ergabs", // i=159
	 /*i=160*/"so-hn", "so-hn+nom", "so-hn+acc", "so-hn+nomacc", "so-hn+erg", "so-hn+abs", "so-hn+ergabs", // i=166
	 /*i=167*/"so-hai", "so-hai+nom", "so-hai+acc", "so-hai+nomacc", "so-hai+erg", "so-hai+abs", "so-hai+ergabs", // i=173
	 /*i=174*/"so-mnm", "so-mnm+nom", "so-mnm+acc", "so-mnm+nomacc", "so-mnm+erg", "so-mnm+abs", "so-mnm+ergabs", // i=180
	 /*i=181*/"s-123+sp+mf", "s-123+sp+mf+nom", "s-123+sp+mf+acc", "s-123+sp+mf+nomacc", "s-123+sp+mf+erg", "s-123+sp+mf+abs", "s-123+sp+mf+ergabs", // i=187
	 /*i=188*/"s-123+sp+mfn", "s-123+sp+mfn+nom", "s-123+sp+mfn+acc", "s-123+sp+mfn+nomacc", "s-123+sp+mfn+erg", "s-123+sp+mfn+abs", "s-123+sp+mfn+ergabs", // i=194
	 /*i=195*/"s-123+sp+cn", "s-123+sp+cn+nom", "s-123+sp+cn+acc", "s-123+sp+cn+nomacc", "s-123+sp+cn+erg", "s-123+sp+cn+abs", "s-123+sp+cn+ergabs", // i=201
	 /*i=202*/"s-123+sp+ai", "s-123+sp+ai+nom", "s-123+sp+ai+acc", "s-123+sp+ai+nomacc", "s-123+sp+ai+erg", "s-123+sp+ai+abs", "s-123+sp+ai+ergabs", // i=208
	 /*i=209*/"s-123+sp+hn", "s-123+sp+hn+nom", "s-123+sp+hn+acc", "s-123+sp+hn+nomacc", "s-123+sp+hn+erg", "s-123+sp+hn+abs", "s-123+sp+hn+ergabs", // i=215
	 /*i=216*/"s-123+sp+hai", "s-123+sp+hai+nom", "s-123+sp+hai+acc", "s-123+sp+hai+nomacc", "s-123+sp+hai+erg", "s-123+sp+hai+abs", "s-123+sp+hai+ergabs", // i=222
	 /*i=223*/"s-123+sp+mnm", "s-123+sp+mnm+nom", "s-123+sp+mnm+acc", "s-123+sp+mnm+nomacc", "s-123+sp+mnm+erg", "s-123+sp+mnm+abs", "s-123+sp+mnm+ergabs", // i=229
	 /*i=230*/"o-123+sp+mf", "o-123+sp+mf+nom", "o-123+sp+mf+acc", "o-123+sp+mf+nomacc", "o-123+sp+mf+erg", "o-123+sp+mf+abs", "o-123+sp+mf+ergabs", // i=236
	 /*i=237*/"o-123+sp+mfn", "o-123+sp+mfn+nom", "o-123+sp+mfn+acc", "o-123+sp+mfn+nomacc", "o-123+sp+mfn+erg", "o-123+sp+mfn+abs", "o-123+sp+mfn+ergabs", // i=243
	 /*i=244*/"o-123+sp+cn", "o-123+sp+cn+nom", "o-123+sp+cn+acc", "o-123+sp+cn+nomacc", "o-123+sp+cn+erg", "o-123+sp+cn+abs", "o-123+sp+cn+ergabs", // i=250
	 /*i=251*/"o-123+sp+ai", "o-123+sp+ai+nom", "o-123+sp+ai+acc", "o-123+sp+ai+nomacc", "o-123+sp+ai+erg", "o-123+sp+ai+abs", "o-123+sp+ai+ergabs", // i=257
	 /*i=258*/"o-123+sp+hn", "o-123+sp+hn+nom", "o-123+sp+hn+acc", "o-123+sp+hn+nomacc", "o-123+sp+hn+erg", "o-123+sp+hn+abs", "o-123+sp+hn+ergabs", // i=264
	 /*i=265*/"o-123+sp+hai", "o-123+sp+hai+nom", "o-123+sp+hai+acc", "o-123+sp+hai+nomacc", "o-123+sp+hai+erg", "o-123+sp+hai+abs", "o-123+sp+hai+ergabs", // i=271
	 /*i=272*/"o-123+sp+mnm", "o-123+sp+mnm+nom", "o-123+sp+mnm+acc", "o-123+sp+mnm+nomacc", "o-123+sp+mnm+erg", "o-123+sp+mnm+abs", "o-123+sp+mnm+ergabs", // i=278
	 /*i=279*/"so-123+sp+mf", "so-123+sp+mf+nom", "so-123+sp+mf+acc", "so-123+sp+mf+nomacc", "so-123+sp+mf+erg", "so-123+sp+mf+abs", "so-123+sp+mf+ergabs", // i=285
	 /*i=286*/"so-123+sp+mfn", "so-123+sp+mfn+nom", "so-123+sp+mfn+acc", "so-123+sp+mfn+nomacc", "so-123+sp+mfn+erg", "so-123+sp+mfn+abs", "so-123+sp+mfn+ergabs", // i=292
	 /*i=293*/"so-123+sp+cn", "so-123+sp+cn+nom", "so-123+sp+cn+acc", "so-123+sp+cn+nomacc", "so-123+sp+cn+erg", "so-123+sp+cn+abs", "so-123+sp+cn+ergabs", // i=299
	 /*i=300*/"so-123+sp+ai", "so-123+sp+ai+nom", "so-123+sp+ai+acc", "so-123+sp+ai+nomacc", "so-123+sp+ai+erg", "so-123+sp+ai+abs", "so-123+sp+ai+ergabs", // i=306
	 /*i=307*/"so-123+sp+hn", "so-123+sp+hn+nom", "so-123+sp+hn+acc", "so-123+sp+hn+nomacc", "so-123+sp+hn+erg", "so-123+sp+hn+abs", "so-123+sp+hn+ergabs", // i=313
	 /*i=314*/"so-123+sp+hai", "so-123+sp+hai+nom", "so-123+sp+hai+acc", "so-123+sp+hai+nomacc", "so-123+sp+hai+erg", "so-123+sp+hai+abs", "so-123+sp+hai+ergabs", // i=320
	 /*i=321*/"so-123+sp+mnm", "so-123+sp+mnm+nom", "so-123+sp+mnm+acc", "so-123+sp+mnm+nomacc", "so-123+sp+mnm+erg", "so-123+sp+mnm+abs", "so-123+sp+mnm+ergabs"}; // i=327
	
	protected HashMap<String, String> lexiconCode = new HashMap<String, String>();
	
	public Test() {
		lexiconCode.put("s-123", "s-123");
		lexiconCode.put("o-123", "o-123");
		lexiconCode.put("so-123", "so-123");
		
		lexiconCode.put("s-sp", "s-sp");
		lexiconCode.put("o-sp", "o-sp");
		lexiconCode.put("so-sp", "so-sp");
		
		lexiconCode.put("s-123+sp", "s-123+sp");
		lexiconCode.put("s-123+sp+nom", "s-123+sp");
		lexiconCode.put("s-123+sp+acc", "s-123+sp");
		lexiconCode.put("s-123+sp+nomacc", "s-123+sp");
		lexiconCode.put("s-123+sp+erg", "s-123+sp");
		lexiconCode.put("s-123+sp+abs", "s-123+sp");
		lexiconCode.put("s-123+sp+ergabs","s-123+sp");
		
		lexiconCode.put("o-123+sp", "o-123+sp");
		lexiconCode.put("o-123+sp+nom", "o-123+sp");
		lexiconCode.put("o-123+sp+acc", "o-123+sp");
		lexiconCode.put("o-123+sp+nomacc", "o-123+sp");
		lexiconCode.put("o-123+sp+erg", "o-123+sp");
		lexiconCode.put("o-123+sp+abs", "o-123+sp");
		lexiconCode.put("o-123+sp+ergabs","o-123+sp");
		
		lexiconCode.put("so-123+sp", "so-123+sp");
		lexiconCode.put("so-123+sp+nom", "so-123+sp");
		lexiconCode.put("so-123+sp+acc", "so-123+sp");
		lexiconCode.put("so-123+sp+nomacc", "so-123+sp");
		lexiconCode.put("so-123+sp+erg", "so-123+sp");
		lexiconCode.put("so-123+sp+abs", "so-123+sp");
		lexiconCode.put("so-123+sp+ergabs","so-123+sp");
		
		lexiconCode.put("s-mf", "s-mf");
		lexiconCode.put("s-mf+nom", "s-mf");
		lexiconCode.put("s-mf+acc", "s-mf");
		lexiconCode.put("s-mf+nomacc", "s-mf");
		lexiconCode.put("s-mf+erg", "s-mf");
		lexiconCode.put("s-mf+abs", "s-mf");
		lexiconCode.put("s-mf+ergabs", "s-mf");

		lexiconCode.put("s-mfn", "s-mfn");
		lexiconCode.put("s-mfn+nom", "s-mfn");
		lexiconCode.put("s-mfn+acc", "s-mfn");
		lexiconCode.put("s-mfn+nomacc", "s-mfn");
		lexiconCode.put("s-mfn+erg", "s-mfn");
		lexiconCode.put("s-mfn+abs", "s-mfn");
		lexiconCode.put("s-mfn+ergabs", "s-mfn");

		lexiconCode.put("s-cn", "s-cn");
		lexiconCode.put("s-cn+nom", "s-cn");
		lexiconCode.put("s-cn+acc", "s-cn");
		lexiconCode.put("s-cn+nomacc", "s-cn");
		lexiconCode.put("s-cn+erg", "s-cn");
		lexiconCode.put("s-cn+abs", "s-cn");
		lexiconCode.put("s-cn+ergabs", "s-cn");
		
		lexiconCode.put("s-ai", "s-ai");
		lexiconCode.put("s-ai+nom", "s-ai");
		lexiconCode.put("s-ai+acc", "s-ai");
		lexiconCode.put("s-ai+nomacc", "s-ai");
		lexiconCode.put("s-ai+erg", "s-ai");
		lexiconCode.put("s-ai+abs", "s-ai");
		lexiconCode.put("s-ai+ergabs", "s-ai");
		
		lexiconCode.put("s-hn", "s-hn");
		lexiconCode.put("s-hn+nom", "s-hn");
		lexiconCode.put("s-hn+acc", "s-hn");
		lexiconCode.put("s-hn+nomacc", "s-hn");
		lexiconCode.put("s-hn+erg", "s-hn");
		lexiconCode.put("s-hn+abs", "s-hn");
		lexiconCode.put("s-hn+ergabs", "s-hn");
		
		lexiconCode.put("s-hai", "s-hai");
		lexiconCode.put("s-hai+nom", "s-hai");
		lexiconCode.put("s-hai+acc", "s-hai");
		lexiconCode.put("s-hai+nomacc", "s-hai");
		lexiconCode.put("s-hai+erg", "s-hai");
		lexiconCode.put("s-hai+abs", "s-hai");
		lexiconCode.put("s-hai+ergabs", "s-hai");
		
		lexiconCode.put("s-mnm", "s-mnm");
		lexiconCode.put("s-mnm+nom", "s-mnm");
		lexiconCode.put("s-mnm+acc", "s-mnm");
		lexiconCode.put("s-mnm+nomacc", "s-mnm");
		lexiconCode.put("s-mnm+erg", "s-mnm");
		lexiconCode.put("s-mnm+abs", "s-mnm");
		lexiconCode.put("s-mnm+ergabs", "s-mnm");
		
		lexiconCode.put("o-mf", "o-mf");
		lexiconCode.put("o-mf+nom", "o-mf");
		lexiconCode.put("o-mf+acc", "o-mf");
		lexiconCode.put("o-mf+nomacc", "o-mf");
		lexiconCode.put("o-mf+erg", "o-mf");
		lexiconCode.put("o-mf+abs", "o-mf");
		lexiconCode.put("o-mf+ergabs", "o-mf");
		
		lexiconCode.put("o-mfn", "o-mfn");
		lexiconCode.put("o-mfn+nom", "o-mfn");
		lexiconCode.put("o-mfn+acc", "o-mfn");
		lexiconCode.put("o-mfn+nomacc", "o-mfn");
		lexiconCode.put("o-mfn+erg", "o-mfn");
		lexiconCode.put("o-mfn+abs", "o-mfn");
		lexiconCode.put("o-mfn+ergabs", "o-mfn");
		
		lexiconCode.put("o-cn", "o-cn");
		lexiconCode.put("o-cn+nom", "o-cn");
		lexiconCode.put("o-cn+acc", "o-cn");
		lexiconCode.put("o-cn+nomacc", "o-cn");
		lexiconCode.put("o-cn+erg", "o-cn");
		lexiconCode.put("o-cn+abs", "o-cn");
		lexiconCode.put("o-cn+ergabs", "o-cn");
		
		lexiconCode.put("o-ai", "o-ai");
		lexiconCode.put("o-ai+nom", "o-ai");
		lexiconCode.put("o-ai+acc", "o-ai");
		lexiconCode.put("o-ai+nomacc", "o-ai");
		lexiconCode.put("o-ai+erg", "o-ai");
		lexiconCode.put("o-ai+abs", "o-ai");
		lexiconCode.put("o-ai+ergabs", "o-ai");
		
		lexiconCode.put("o-hn", "o-hn");
		lexiconCode.put("o-hn+nom", "o-hn");
		lexiconCode.put("o-hn+acc", "o-hn");
		lexiconCode.put("o-hn+nomacc", "o-hn");
		lexiconCode.put("o-hn+erg", "o-hn");
		lexiconCode.put("o-hn+abs", "o-hn");
		lexiconCode.put("o-hn+ergabs", "o-hn");
		
		lexiconCode.put("o-hai", "o-hai");
		lexiconCode.put("o-hai+nom", "o-hai");
		lexiconCode.put("o-hai+acc", "o-hai");
		lexiconCode.put("o-hai+nomacc", "o-hai");
		lexiconCode.put("o-hai+erg", "o-hai");
		lexiconCode.put("o-hai+abs", "o-hai");
		lexiconCode.put("o-hai+ergabs", "o-hai");
		
		lexiconCode.put("o-mnm", "o-mnm");
		lexiconCode.put("o-mnm+nom", "o-mnm");
		lexiconCode.put("o-mnm+acc", "o-mnm");
		lexiconCode.put("o-mnm+nomacc", "o-mnm");
		lexiconCode.put("o-mnm+erg", "o-mnm");
		lexiconCode.put("o-mnm+abs", "o-mnm");
		lexiconCode.put("o-mnm+ergabs", "o-mnm");

		lexiconCode.put("so-mf", "so-mf");
		lexiconCode.put("so-mf+nom", "so-mf");
		lexiconCode.put("so-mf+acc", "so-mf");
		lexiconCode.put("so-mf+nomacc", "so-mf");
		lexiconCode.put("so-mf+erg", "so-mf");
		lexiconCode.put("so-mf+abs", "so-mf");
		lexiconCode.put("so-mf+ergabs", "so-mf");
		
		lexiconCode.put("so-mfn", "so-mfn");
		lexiconCode.put("so-mfn+nom", "so-mfn");
		lexiconCode.put("so-mfn+acc", "so-mfn");
		lexiconCode.put("so-mfn+nomacc", "so-mfn");
		lexiconCode.put("so-mfn+erg", "so-mfn");
		lexiconCode.put("so-mfn+abs", "so-mfn");
		lexiconCode.put("so-mfn+ergabs", "so-mfn");
		
		lexiconCode.put("so-cn", "so-cn");
		lexiconCode.put("so-cn+nom", "so-cn");
		lexiconCode.put("so-cn+acc", "so-cn");
		lexiconCode.put("so-cn+nomacc", "so-cn");
		lexiconCode.put("so-cn+erg", "so-cn");
		lexiconCode.put("so-cn+abs", "so-cn");
		lexiconCode.put("so-cn+ergabs", "so-cn");
		
		lexiconCode.put("so-ai", "so-ai");
		lexiconCode.put("so-ai+nom", "so-ai");
		lexiconCode.put("so-ai+acc", "so-ai");
		lexiconCode.put("so-ai+nomacc", "so-ai");
		lexiconCode.put("so-ai+erg", "so-ai");
		lexiconCode.put("so-ai+abs", "so-ai");
		lexiconCode.put("so-ai+ergabs", "so-ai");
		
		lexiconCode.put("so-hn", "so-hn");
		lexiconCode.put("so-hn+nom", "so-hn");
		lexiconCode.put("so-hn+acc", "so-hn");
		lexiconCode.put("so-hn+nomacc", "so-hn");
		lexiconCode.put("so-hn+erg", "so-hn");
		lexiconCode.put("so-hn+abs", "so-hn");
		lexiconCode.put("so-hn+ergabs", "so-hn");
		
		lexiconCode.put("so-hai", "so-hai");
		lexiconCode.put("so-hai+nom", "so-hai");
		lexiconCode.put("so-hai+acc", "so-hai");
		lexiconCode.put("so-hai+nomacc", "so-hai");
		lexiconCode.put("so-hai+erg", "so-hai");
		lexiconCode.put("so-hai+abs", "so-hai");
		lexiconCode.put("so-hai+ergabs", "so-hai");
		
		lexiconCode.put("so-mnm", "so-mnm");
		lexiconCode.put("so-mnm+nom", "so-mnm");
		lexiconCode.put("so-mnm+acc", "so-mnm");
		lexiconCode.put("so-mnm+nomacc", "so-mnm");
		lexiconCode.put("so-mnm+erg", "so-mnm");
		lexiconCode.put("so-mnm+abs", "so-mnm");
		lexiconCode.put("so-mnm+ergabs", "so-mnm");
		
		lexiconCode.put("s-123+sp+mf", "s-123+sp+mf");
		lexiconCode.put("s-123+sp+mf+nom", "s-123+sp+mf");
		lexiconCode.put("s-123+sp+mf+acc", "s-123+sp+mf");
		lexiconCode.put("s-123+sp+mf+nomacc", "s-123+sp+mf");
		lexiconCode.put("s-123+sp+mf+erg", "s-123+sp+mf");
		lexiconCode.put("s-123+sp+mf+abs", "s-123+sp+mf");
		lexiconCode.put("s-123+sp+mf+ergabs", "s-123+sp+mf");

		lexiconCode.put("s-123+sp+mfn", "s-123+sp+mfn");
		lexiconCode.put("s-123+sp+mfn+nom", "s-123+sp+mfn");
		lexiconCode.put("s-123+sp+mfn+acc", "s-123+sp+mfn");
		lexiconCode.put("s-123+sp+mfn+nomacc", "s-123+sp+mfn");
		lexiconCode.put("s-123+sp+mfn+erg", "s-123+sp+mfn");
		lexiconCode.put("s-123+sp+mfn+abs", "s-123+sp+mfn");
		lexiconCode.put("s-123+sp+mfn+ergabs", "s-123+sp+mfn");

		lexiconCode.put("s-123+sp+cn", "s-123+sp+cn");
		lexiconCode.put("s-123+sp+cn+nom", "s-123+sp+cn");
		lexiconCode.put("s-123+sp+cn+acc", "s-123+sp+cn");
		lexiconCode.put("s-123+sp+cn+nomacc", "s-123+sp+cn");
		lexiconCode.put("s-123+sp+cn+erg", "s-123+sp+cn");
		lexiconCode.put("s-123+sp+cn+abs", "s-123+sp+cn");
		lexiconCode.put("s-123+sp+cn+ergabs", "s-123+sp+cn");
		
		lexiconCode.put("s-123+sp+ai", "s-123+sp+ai");
		lexiconCode.put("s-123+sp+ai+nom", "s-123+sp+ai");
		lexiconCode.put("s-123+sp+ai+acc", "s-123+sp+ai");
		lexiconCode.put("s-123+sp+ai+nomacc", "s-123+sp+ai");
		lexiconCode.put("s-123+sp+ai+erg", "s-123+sp+ai");
		lexiconCode.put("s-123+sp+ai+abs", "s-123+sp+ai");
		lexiconCode.put("s-123+sp+ai+ergabs", "s-123+sp+ai");
		
		lexiconCode.put("s-123+sp+hn", "s-123+sp+hn");
		lexiconCode.put("s-123+sp+hn+nom", "s-123+sp+hn");
		lexiconCode.put("s-123+sp+hn+acc", "s-123+sp+hn");
		lexiconCode.put("s-123+sp+hn+nomacc", "s-123+sp+hn");
		lexiconCode.put("s-123+sp+hn+erg", "s-123+sp+hn");
		lexiconCode.put("s-123+sp+hn+abs", "s-123+sp+hn");
		lexiconCode.put("s-123+sp+hn+ergabs", "s-123+sp+hn");
		
		lexiconCode.put("s-123+sp+hai", "s-123+sp+hai");
		lexiconCode.put("s-123+sp+hai+nom", "s-123+sp+hai");
		lexiconCode.put("s-123+sp+hai+acc", "s-123+sp+hai");
		lexiconCode.put("s-123+sp+hai+nomacc", "s-123+sp+hai");
		lexiconCode.put("s-123+sp+hai+erg", "s-123+sp+hai");
		lexiconCode.put("s-123+sp+hai+abs", "s-123+sp+hai");
		lexiconCode.put("s-123+sp+hai+ergabs", "s-123+sp+hai");
		
		lexiconCode.put("s-123+sp+mnm", "s-123+sp+mnm");
		lexiconCode.put("s-123+sp+mnm+nom", "s-123+sp+mnm");
		lexiconCode.put("s-123+sp+mnm+acc", "s-123+sp+mnm");
		lexiconCode.put("s-123+sp+mnm+nomacc", "s-123+sp+mnm");
		lexiconCode.put("s-123+sp+mnm+erg", "s-123+sp+mnm");
		lexiconCode.put("s-123+sp+mnm+abs", "s-123+sp+mnm");
		lexiconCode.put("s-123+sp+mnm+ergabs", "s-123+sp+mnm");
		
		lexiconCode.put("o-123+sp+mf", "o-123+sp+mf");
		lexiconCode.put("o-123+sp+mf+nom", "o-123+sp+mf");
		lexiconCode.put("o-123+sp+mf+acc", "o-123+sp+mf");
		lexiconCode.put("o-123+sp+mf+nomacc", "o-123+sp+mf");
		lexiconCode.put("o-123+sp+mf+erg", "o-123+sp+mf");
		lexiconCode.put("o-123+sp+mf+abs", "o-123+sp+mf");
		lexiconCode.put("o-123+sp+mf+ergabs", "o-123+sp+mf");
		
		lexiconCode.put("o-123+sp+mfn", "o-123+sp+mfn");
		lexiconCode.put("o-123+sp+mfn+nom", "o-123+sp+mfn");
		lexiconCode.put("o-123+sp+mfn+acc", "o-123+sp+mfn");
		lexiconCode.put("o-123+sp+mfn+nomacc", "o-123+sp+mfn");
		lexiconCode.put("o-123+sp+mfn+erg", "o-123+sp+mfn");
		lexiconCode.put("o-123+sp+mfn+abs", "o-123+sp+mfn");
		lexiconCode.put("o-123+sp+mfn+ergabs", "o-123+sp+mfn");
		
		lexiconCode.put("o-123+sp+cn", "o-123+sp+cn");
		lexiconCode.put("o-123+sp+cn+nom", "o-123+sp+cn");
		lexiconCode.put("o-123+sp+cn+acc", "o-123+sp+cn");
		lexiconCode.put("o-123+sp+cn+nomacc", "o-123+sp+cn");
		lexiconCode.put("o-123+sp+cn+erg", "o-123+sp+cn");
		lexiconCode.put("o-123+sp+cn+abs", "o-123+sp+cn");
		lexiconCode.put("o-123+sp+cn+ergabs", "o-123+sp+cn");
		
		lexiconCode.put("o-123+sp+ai", "o-123+sp+ai");
		lexiconCode.put("o-123+sp+ai+nom", "o-123+sp+ai");
		lexiconCode.put("o-123+sp+ai+acc", "o-123+sp+ai");
		lexiconCode.put("o-123+sp+ai+nomacc", "o-123+sp+ai");
		lexiconCode.put("o-123+sp+ai+erg", "o-123+sp+ai");
		lexiconCode.put("o-123+sp+ai+abs", "o-123+sp+ai");
		lexiconCode.put("o-123+sp+ai+ergabs", "o-123+sp+ai");
		
		lexiconCode.put("o-123+sp+hn", "o-123+sp+hn");
		lexiconCode.put("o-123+sp+hn+nom", "o-123+sp+hn");
		lexiconCode.put("o-123+sp+hn+acc", "o-123+sp+hn");
		lexiconCode.put("o-123+sp+hn+nomacc", "o-123+sp+hn");
		lexiconCode.put("o-123+sp+hn+erg", "o-123+sp+hn");
		lexiconCode.put("o-123+sp+hn+abs", "o-123+sp+hn");
		lexiconCode.put("o-123+sp+hn+ergabs", "o-123+sp+hn");
		
		lexiconCode.put("o-123+sp+hai", "o-123+sp+hai");
		lexiconCode.put("o-123+sp+hai+nom", "o-123+sp+hai");
		lexiconCode.put("o-123+sp+hai+acc", "o-123+sp+hai");
		lexiconCode.put("o-123+sp+hai+nomacc", "o-123+sp+hai");
		lexiconCode.put("o-123+sp+hai+erg", "o-123+sp+hai");
		lexiconCode.put("o-123+sp+hai+abs", "o-123+sp+hai");
		lexiconCode.put("o-123+sp+hai+ergabs", "o-123+sp+hai");
		
		lexiconCode.put("o-123+sp+mnm", "o-123+sp+mnm");
		lexiconCode.put("o-123+sp+mnm+nom", "o-123+sp+mnm");
		lexiconCode.put("o-123+sp+mnm+acc", "o-123+sp+mnm");
		lexiconCode.put("o-123+sp+mnm+nomacc", "o-123+sp+mnm");
		lexiconCode.put("o-123+sp+mnm+erg", "o-123+sp+mnm");
		lexiconCode.put("o-123+sp+mnm+abs", "o-123+sp+mnm");
		lexiconCode.put("o-123+sp+mnm+ergabs", "o-123+sp+mnm");

		lexiconCode.put("so-123+sp+mf", "so-123+sp+mf");
		lexiconCode.put("so-123+sp+mf+nom", "so-123+sp+mf");
		lexiconCode.put("so-123+sp+mf+acc", "so-123+sp+mf");
		lexiconCode.put("so-123+sp+mf+nomacc", "so-123+sp+mf");
		lexiconCode.put("so-123+sp+mf+erg", "so-123+sp+mf");
		lexiconCode.put("so-123+sp+mf+abs", "so-123+sp+mf");
		lexiconCode.put("so-123+sp+mf+ergabs", "so-123+sp+mf");
		
		lexiconCode.put("so-123+sp+mfn", "so-123+sp+mfn");
		lexiconCode.put("so-123+sp+mfn+nom", "so-123+sp+mfn");
		lexiconCode.put("so-123+sp+mfn+acc", "so-123+sp+mfn");
		lexiconCode.put("so-123+sp+mfn+nomacc", "so-123+sp+mfn");
		lexiconCode.put("so-123+sp+mfn+erg", "so-123+sp+mfn");
		lexiconCode.put("so-123+sp+mfn+abs", "so-123+sp+mfn");
		lexiconCode.put("so-123+sp+mfn+ergabs", "so-123+sp+mfn");
		
		lexiconCode.put("so-123+sp+cn", "so-123+sp+cn");
		lexiconCode.put("so-123+sp+cn+nom", "so-123+sp+cn");
		lexiconCode.put("so-123+sp+cn+acc", "so-123+sp+cn");
		lexiconCode.put("so-123+sp+cn+nomacc", "so-123+sp+cn");
		lexiconCode.put("so-123+sp+cn+erg", "so-123+sp+cn");
		lexiconCode.put("so-123+sp+cn+abs", "so-123+sp+cn");
		lexiconCode.put("so-123+sp+cn+ergabs", "so-123+sp+cn");
		
		lexiconCode.put("so-123+sp+ai", "so-123+sp+ai");
		lexiconCode.put("so-123+sp+ai+nom", "so-123+sp+ai");
		lexiconCode.put("so-123+sp+ai+acc", "so-123+sp+ai");
		lexiconCode.put("so-123+sp+ai+nomacc", "so-123+sp+ai");
		lexiconCode.put("so-123+sp+ai+erg", "so-123+sp+ai");
		lexiconCode.put("so-123+sp+ai+abs", "so-123+sp+ai");
		lexiconCode.put("so-123+sp+ai+ergabs", "so-123+sp+ai");
		
		lexiconCode.put("so-123+sp+hn", "so-123+sp+hn");
		lexiconCode.put("so-123+sp+hn+nom", "so-123+sp+hn");
		lexiconCode.put("so-123+sp+hn+acc", "so-123+sp+hn");
		lexiconCode.put("so-123+sp+hn+nomacc", "so-123+sp+hn");
		lexiconCode.put("so-123+sp+hn+erg", "so-123+sp+hn");
		lexiconCode.put("so-123+sp+hn+abs", "so-123+sp+hn");
		lexiconCode.put("so-123+sp+hn+ergabs", "so-123+sp+hn");
		
		lexiconCode.put("so-123+sp+hai", "so-123+sp+hai");
		lexiconCode.put("so-123+sp+hai+nom", "so-123+sp+hai");
		lexiconCode.put("so-123+sp+hai+acc", "so-123+sp+hai");
		lexiconCode.put("so-123+sp+hai+nomacc", "so-123+sp+hai");
		lexiconCode.put("so-123+sp+hai+erg", "so-123+sp+hai");
		lexiconCode.put("so-123+sp+hai+abs", "so-123+sp+hai");
		lexiconCode.put("so-123+sp+hai+ergabs", "so-123+sp+hai");
		
		lexiconCode.put("so-123+sp+mnm", "so-123+sp+mnm");
		lexiconCode.put("so-123+sp+mnm+nom", "so-123+sp+mnm");
		lexiconCode.put("so-123+sp+mnm+acc", "so-123+sp+mnm");
		lexiconCode.put("so-123+sp+mnm+nomacc", "so-123+sp+mnm");
		lexiconCode.put("so-123+sp+mnm+erg", "so-123+sp+mnm");
		lexiconCode.put("so-123+sp+mnm+abs", "so-123+sp+mnm");
		lexiconCode.put("so-123+sp+mnm+ergabs", "so-123+sp+mnm");
	}
	public void calculate(ArrayList<Event> events, Event e, HashMap<String, HashMap<String, Word>> l) {
//		entropy_SurprisalCalc(events, e, l);
		mutualInfoCalc(events);
	}
	
	protected void entropy_SurprisalCalc(ArrayList<Event> events, Event e, HashMap<String, HashMap<String, Word>> l) {
		
	}
	
	protected void mutualInfoCalc(ArrayList<Event> events) {
		
	}
	
	protected static BigDecimal base2Log(double x) {
		if(x > 0.00) {
			BigDecimal eLog = BigDecimal.valueOf(Math.log(x));
			return eLog.divide(BigDecimal.valueOf(Math.log(2.0D)), MathContext.DECIMAL128);
		}
		else return BigDecimal.valueOf(0);
	}
	
	protected BigDecimal calcEntropy(ArrayList<Double> probs, BigDecimal conditionalProb) {
		BigDecimal probSum = new BigDecimal(0.0);
		
		for(double prob:probs) {
			BigDecimal p = BigDecimal.valueOf(prob);
			p = p.divide(conditionalProb, MathContext.DECIMAL128);
			probSum = probSum.add(p.multiply(base2Log(p.doubleValue())));
		}
		return probSum.multiply(BigDecimal.valueOf(-1.0));
	}
	
	protected BigDecimal calcSurprisal(ArrayList<Double> probs) {
		BigDecimal probSum = new BigDecimal(0.0);
		
		for(double prob:probs) {
			BigDecimal p = BigDecimal.valueOf(prob);
			probSum = probSum.add(p);
		}
		
		BigDecimal surprisal = base2Log(probSum.doubleValue());
		return surprisal.multiply(BigDecimal.valueOf(-1.0));
	}
	
	protected BigDecimal calcMI(BigDecimal jointP, BigDecimal p1, BigDecimal p2) {
//		# MI: p(x,y)*log[p(x,y)/p(x)p(y)]
		return jointP.multiply(base2Log(jointP.divide(p1.multiply(p2), MathContext.DECIMAL128).doubleValue()));
	}
	
	public void calcSummaryStats(BigDecimal etaNought) {
		for(int i = 0; i < all.length; i++) {
//			this.all[i].calcEntTraj();
//			this.all[i].calcInfoProfiles(etaNought);
//			this.all[i].calcMeanEntDevScore(etaNought);
//			this.all[i].calcMeanSurpDevScore();
			this.all[i].calcMeanMI();
		}
	}
}
