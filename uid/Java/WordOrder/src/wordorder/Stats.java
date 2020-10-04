package wordorder;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;

public class Stats {
	public double count;
	public ArrayList<BigDecimal> eta1;
	public ArrayList<BigDecimal> eta2;
	
	public ArrayList<BigDecimal> surprisal1;
	public ArrayList<BigDecimal> surprisal2;
	public ArrayList<BigDecimal> surprisal3;
	
	public ArrayList<BigDecimal> mi;
	
	public BigDecimal meanEta1;
	public BigDecimal meanEta2;
	public BigDecimal eta1StdDev;
	public BigDecimal eta2StdDev;
	
	public ArrayList<BigDecimal> i1;
	public ArrayList<BigDecimal> i2;
	public BigDecimal meanI1;
	public BigDecimal meanI2;
	public BigDecimal i1StdDev;
	public BigDecimal i2StdDev;
	// i3 = eta2 - 0 = eta2
	// meanI3 = meanEta2
	// i3StdDev = eta2StdDev
	
	public BigDecimal meanSurprisal1;
	public BigDecimal meanSurprisal2;
	public BigDecimal meanSurprisal3;
	public BigDecimal surp1StdDev;
	public BigDecimal surp2StdDev;
	public BigDecimal surp3StdDev;
	
	public BigDecimal meanMI;
	
	public ArrayList<BigDecimal> entDevScores;
	public BigDecimal meanEntDevScore;
	public BigDecimal entDevScoreStdDev;
	
	public ArrayList<BigDecimal> surpDevScores;
	public BigDecimal meanSurpDevScore;
	public BigDecimal surpDevScoreStdDev;
	
	public ArrayList<Double> eventProbs;
	private MathContext mc = new MathContext(30);
	
	public Stats() {
		this.count = 0;
		this.eta1 = new ArrayList<>();
		this.eta2 = new ArrayList<>();
		this.meanEta1 = new BigDecimal(0);
		this.meanEta2 = new BigDecimal(0);
		this.eta1StdDev = new BigDecimal(0);
		this.eta2StdDev = new BigDecimal(0);
		
		this.surprisal1 = new ArrayList<>();
		this.surprisal2 = new ArrayList<>();
		this.surprisal3 = new ArrayList<>();
		this.meanSurprisal1 = new BigDecimal(0);
		this.meanSurprisal2 = new BigDecimal(0);
		this.meanSurprisal3 = new BigDecimal(0);
		this.surp1StdDev = new BigDecimal(0);
		this.surp2StdDev = new BigDecimal(0);
		this.surp3StdDev = new BigDecimal(0);
		
		this.i1 = new ArrayList<>();
		this.i2 = new ArrayList<>();
		
		this.mi = new ArrayList<>();
		
		this.entDevScores = new ArrayList<>();
		this.meanEntDevScore = new BigDecimal(0);
		this.entDevScoreStdDev = new BigDecimal(0);
		
		this.surpDevScores = new ArrayList<>();
		this.meanSurpDevScore = new BigDecimal(0);
		this.surpDevScoreStdDev = new BigDecimal(0);
		
		this.meanMI = new BigDecimal(0);
		
		this.eventProbs = new ArrayList<Double>();
	}
	
	public BigDecimal eta1Sum() {
		BigDecimal sum = new BigDecimal(0);
		for(BigDecimal e:this.eta1) {
			sum = sum.add(e);
		}
		return sum;
	}
	
	public BigDecimal eta2Sum() {
		BigDecimal sum = new BigDecimal(0);
		for(BigDecimal e:this.eta2) {
			sum = sum.add(e);
		}
		return sum;
	}
	
	public BigDecimal aveEta1() {
		this.meanEta1 = this.eta1Sum().divide(BigDecimal.valueOf(this.count), MathContext.DECIMAL128);
		return this.meanEta1;
	}
	
	public BigDecimal aveEta2() {
		this.meanEta2 = this.eta2Sum().divide(BigDecimal.valueOf(this.count), MathContext.DECIMAL128);
		return this.meanEta2;
	}
	
	public BigDecimal calcEta1StdDev() {
		BigDecimal sum = new BigDecimal(0);
		for (BigDecimal h:this.eta1) {
			sum = sum.add(h.subtract(this.meanEta1).pow(2));
		}
		this.eta1StdDev = sum.divide(BigDecimal.valueOf(this.count-1), MathContext.DECIMAL128).sqrt(this.mc);
		return this.eta1StdDev;
	}
	
	public BigDecimal calcEta2StdDev() {
		BigDecimal sum = new BigDecimal(0);
		for (BigDecimal h:this.eta2) {
			sum = sum.add(h.subtract(this.meanEta2).pow(2));
		}
		this.eta2StdDev = sum.divide(BigDecimal.valueOf(this.count-1), MathContext.DECIMAL128).sqrt(this.mc);
		return this.eta2StdDev;
	}
	
	public void calcEntTraj() {
		this.aveEta1();
		this.aveEta2();
		this.calcEta1StdDev();
		this.calcEta2StdDev();
	}
	
	public void calcInfoProfiles(BigDecimal eta0) {
		BigDecimal i1Sum = new BigDecimal(0);
		BigDecimal i2Sum = new BigDecimal(0);
		
		for(int i = 0; i < this.count; i++) {
			this.i1.add(eta0.subtract(this.eta1.get(i)));
			i1Sum = i1Sum.add(this.i1.get(i));
			this.i2.add(this.eta1.get(i).subtract(this.eta2.get(i)));
			i2Sum = i2Sum.add(this.i2.get(i));
		}
		
		this.meanI1 = i1Sum.divide(BigDecimal.valueOf(this.count), MathContext.DECIMAL128);
		this.meanI2 = i2Sum.divide(BigDecimal.valueOf(this.count), MathContext.DECIMAL128);
		
		BigDecimal i1DevSum = new BigDecimal(0);
		BigDecimal i2DevSum = new BigDecimal(0);
		for (int i = 0; i < this.count; i++) {
			i1DevSum = i1DevSum.add(this.i1.get(i).subtract(this.meanI1).pow(2));
			i2DevSum = i2DevSum.add(this.i2.get(i).subtract(this.meanI2).pow(2));
		}
		this.i1StdDev = i1DevSum.divide(BigDecimal.valueOf(this.count-1), MathContext.DECIMAL128).sqrt(this.mc);
		this.i2StdDev = i2DevSum.divide(BigDecimal.valueOf(this.count-1), MathContext.DECIMAL128).sqrt(this.mc);
	}
	
	public BigDecimal calcDevScore(BigDecimal eta0, int index) {
		BigDecimal oneThird = new BigDecimal(1.0);
		oneThird = oneThird.divide(new BigDecimal(3.0), MathContext.DECIMAL128);
		
		BigDecimal temp = this.i1.get(index).divide(eta0, MathContext.DECIMAL128).subtract(oneThird).abs();
		temp = temp.add(this.i2.get(index).divide(eta0, MathContext.DECIMAL128).subtract(oneThird).abs());
		temp = temp.add(this.eta2.get(index).divide(eta0, MathContext.DECIMAL128).subtract(oneThird).abs());
		temp = temp.multiply(BigDecimal.valueOf(0.75));
		this.entDevScores.add(index, temp);
		return this.entDevScores.get(index);
	}
	
	public BigDecimal calcSurpDevScore(int index) {
		BigDecimal oneThird = new BigDecimal(1.0);
		oneThird = oneThird.divide(new BigDecimal(3.0), MathContext.DECIMAL128);
		
		double prob = this.eventProbs.get(index);
		if(prob > 0.00) {
			BigDecimal eventSurp = Test.base2Log(prob).multiply(BigDecimal.valueOf(-1.0));
			BigDecimal temp = this.surprisal1.get(index).divide(eventSurp, MathContext.DECIMAL128).subtract(oneThird).abs();
			temp = temp.add(this.surprisal2.get(index).divide(eventSurp, MathContext.DECIMAL128).subtract(oneThird).abs());
			temp = temp.add(this.surprisal3.get(index).divide(eventSurp, MathContext.DECIMAL128).subtract(oneThird).abs());
			temp = temp.multiply(BigDecimal.valueOf(0.75));
			this.surpDevScores.add(index, temp);
			return this.surpDevScores.get(index);
		}
		else {
			this.surpDevScores.add(index, BigDecimal.valueOf(0));
			return this.surpDevScores.get(index);
		}
	}
	
	public BigDecimal[] calcMeanEntDevScore(BigDecimal eta0) {
		this.calcInfoProfiles(eta0);
		BigDecimal meanSum = new BigDecimal(0);
		BigDecimal weightSum = new BigDecimal(0);
		for (int i = 0; i < this.count; i++) {
			BigDecimal prob = new BigDecimal(this.eventProbs.get(i));
			meanSum = meanSum.add(this.calcDevScore(eta0, i).multiply(prob));
			weightSum = weightSum.add(prob);
		}
		this.meanEntDevScore = meanSum.divide(weightSum, MathContext.DECIMAL128);/*.divide(BigDecimal.valueOf(this.count), MathContext.DECIMAL128)*/;
		
		BigDecimal devSum = new BigDecimal(0);
		for (int i = 0; i < this.count; i++) {
			BigDecimal temp = (this.entDevScores.get(i).multiply(BigDecimal.valueOf(this.eventProbs.get(i))));
			devSum = devSum.add(temp.subtract(this.meanEntDevScore).pow(2));
		}
		this.entDevScoreStdDev = devSum.divide(BigDecimal.valueOf(this.count-1), MathContext.DECIMAL128).sqrt(this.mc);
		BigDecimal[] score = {this.meanEntDevScore, this.entDevScoreStdDev};
		return score;
	}
	
	public BigDecimal[] calcMeanSurpDevScore() {
		BigDecimal meanSum = new BigDecimal(0);
		BigDecimal weightSum = new BigDecimal(0);
		for (int i = 0; i < this.count; i++) {
			BigDecimal prob = new BigDecimal(this.eventProbs.get(i));
			
			meanSum = meanSum.add(this.calcSurpDevScore(i).multiply(prob));
			weightSum = weightSum.add(prob);
		}
		this.meanSurpDevScore = meanSum.divide(weightSum, MathContext.DECIMAL128);
		
		BigDecimal devSum = new BigDecimal(0);
		for (int i = 0; i < this.count; i++) {
			BigDecimal temp = (this.surpDevScores.get(i).multiply(BigDecimal.valueOf(this.eventProbs.get(i))));
			devSum = devSum.add(temp.subtract(this.meanSurpDevScore).pow(2));
		}
		this.surpDevScoreStdDev = devSum.divide(BigDecimal.valueOf(this.count-1), MathContext.DECIMAL128).sqrt(this.mc);
		BigDecimal[] score = {this.meanSurpDevScore, this.surpDevScoreStdDev};
		return score;
	}
	
	public BigDecimal calcMeanMI() {
		BigDecimal meanSum = new BigDecimal(0);
		BigDecimal weightSum = new BigDecimal(0);
		for (int i = 0; i < this.count; i++) {
			BigDecimal prob = new BigDecimal(this.eventProbs.get(i));
			
			meanSum = meanSum.add(this.mi.get(i).multiply(prob));
			weightSum = weightSum.add(prob);
		}
		this.meanMI = meanSum.divide(weightSum, MathContext.DECIMAL128);		
		return this.meanMI;
	}
	
	public void justFuckMeUpFam(BigDecimal eta0) {
		for (int i = 0; i < this.count/20; i++) {
			if (this.eventProbs.get(i) > 0.0) {
				System.out.println("event prob: " + this.eventProbs.get(i) + " i1: " + this.i1.get(i).divide(eta0, MathContext.DECIMAL128).doubleValue() + " i2: " + this.i2.get(i).divide(eta0, MathContext.DECIMAL128).doubleValue() + " i3: " + this.eta2.get(i).divide(eta0, MathContext.DECIMAL128).doubleValue());
				BigDecimal oneThird = new BigDecimal(1.0);
				oneThird = oneThird.divide(new BigDecimal(3.0), MathContext.DECIMAL128);
				BigDecimal temp1 = this.i1.get(i).divide(eta0, MathContext.DECIMAL128).subtract(oneThird).abs();
				System.out.print(" dev score calc: ( " + temp1.doubleValue() + " + ");
				BigDecimal temp2 = this.i2.get(i).divide(eta0, MathContext.DECIMAL128).subtract(oneThird).abs();
				BigDecimal temp = temp1.add(temp2);
				System.out.print(temp2.doubleValue() + " + ");
				BigDecimal temp3 = this.eta2.get(i).divide(eta0, MathContext.DECIMAL128).subtract(oneThird).abs();
				temp = temp.add(temp3);
				System.out.print(temp3.doubleValue() + " )*3/4 = ");
				temp = temp.multiply(BigDecimal.valueOf(0.75));
				System.out.print(temp.doubleValue() + "\n");
			}
		}
	}
	
}
