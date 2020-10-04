package wordorder;

public class ParkingLot {
//	System.out.println(i + " " + utt.firstWord.word + "." + utt.firstWord.inflection + " " 
//	+ utt.secondWord.word + "." + utt.secondWord.inflection + " "
//	+ utt.thirdWord.word + "." + utt.thirdWord.inflection);

//-----------------CASE MARKED LANGS----------------------------------------------------------------------			

////// for the nom only marked situation (eg. Oromo, acc is "bare form")
////// if the first word has NOM case
//if (nomUtt.firstWord.inflection.containsKey("case") 
//	&& nomUtt.firstWord.inflection.get("case").get(0) == Case.NOM) {
//double prob = 0;
//// compute entropy for cond. probability of events, given we know the person who is doing them
//for(Event e:events) {
//	if(e.person.equals(People.valueOf(nomUtt.firstWord.word.toUpperCase()))) {
//		double p = e.probability/0.2;
//		if (p > 0.0) {
//			prob += p*Math.log(p);
//		}
//	}
//}
//			
//eta1 = -1*prob;
//eta1 /= etaNought;
//// if the second word is a verb
//if (nomUtt.secondWord.word.equalsIgnoreCase("eat") || nomUtt.secondWord.word.equalsIgnoreCase("drink")) {
//	svoNomOnly.count++;
//	svoNomOnly.eta1.add(eta1);
//	
//	prob = 0;
//	
//	for(Event e:events) {
//		// compute entropy for probability of events, given we know who is doing what
//		if(e.person.equals(People.valueOf(nomUtt.firstWord.word.toUpperCase())) &&
//				e.action.equals(Actions.valueOf(nomUtt.secondWord.word.toUpperCase()))) {
//			// if the subj corresponds to the person in the event
//			// and if the verb corresponds to the action
//			double p = e.probability/(0.2*0.5);
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//	
//	eta2 = -1*prob;
//	eta2 /= etaNought;
//	svoNomOnly.eta2.add(eta2);
//}
//else {
//	// unless the second word is an obj
//	if (nomUtt.secondWord.word.equalsIgnoreCase("apple") || nomUtt.secondWord.word.equalsIgnoreCase("bread") ||
//			nomUtt.secondWord.word.equalsIgnoreCase("cake") || nomUtt.secondWord.word.equalsIgnoreCase("rice") ||
//			nomUtt.secondWord.word.equalsIgnoreCase("coffee") || nomUtt.secondWord.word.equalsIgnoreCase("cola") ||
//			nomUtt.secondWord.word.equalsIgnoreCase("juice") || nomUtt.secondWord.word.equalsIgnoreCase("water")) {
//		sovNomOnly.count++;
//		sovNomOnly.eta1.add(eta1);
//		
//		prob = 0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(nomUtt.firstWord.word.toUpperCase())) 
//					&& e.obj.equals(Objects.valueOf(nomUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability/(0.2*0.25);
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//		
//		eta2 = -1*prob;
//		eta2 /= etaNought;
//		sovNomOnly.eta2.add(eta2);
//	}
//}
//}
//else {
//// if the first word is a verb
//if (nomUtt.firstWord.word.equalsIgnoreCase("eat") || nomUtt.firstWord.word.equalsIgnoreCase("drink")) {
//	double prob = 0;
//	// compute the entropy  for probability of events, given we know what is being done
//	for(Event e:events) {
//		if(e.action.equals(Actions.valueOf(nomUtt.firstWord.word.toUpperCase()))) {
//			double p = e.probability/0.5;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//	
//	eta1 = -1*prob;
//	eta1 /= etaNought;
//	
//	// if the second word has NOM case
//	if (nomUtt.secondWord.inflection.containsKey("case")
//			&& nomUtt.secondWord.inflection.get("case").get(0) == Case.NOM) {
//		vsoNomOnly.count++;
//		vsoNomOnly.eta1.add(eta1);
//		
//		prob = 0;
//		// compute the entropy for probability of events, given we know what is being done
//		// and by who
//		for(Event e:events) {
//			if(e.action.equals(Actions.valueOf(nomUtt.firstWord.word.toUpperCase())) 
//					&& e.person.equals(People.valueOf(nomUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability/(0.5*0.2);
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//		
//		eta2 = -1*prob;
//		eta2 /= etaNought;
//		vsoNomOnly.eta2.add(eta2);
//	}
//	else {
//		// otherwise, the second word is an obj
//		if (nomUtt.secondWord.word.equalsIgnoreCase("apple") || nomUtt.secondWord.word.equalsIgnoreCase("bread") ||
//				nomUtt.secondWord.word.equalsIgnoreCase("cake") || nomUtt.secondWord.word.equalsIgnoreCase("rice") ||
//				nomUtt.secondWord.word.equalsIgnoreCase("coffee") || nomUtt.secondWord.word.equalsIgnoreCase("cola") ||
//				nomUtt.secondWord.word.equalsIgnoreCase("juice") || nomUtt.secondWord.word.equalsIgnoreCase("water")) {
//			vosNomOnly.count++;
//			vosNomOnly.eta1.add(eta1);
//			
//			prob = 0;
//			// compute the entropy of probability of events, given we know what is being done
//			// and what is being done to
//			for(Event e:events) {
//				if(e.action.equals(Actions.valueOf(nomUtt.firstWord.word.toUpperCase())) 
//						&& e.obj.equals(Objects.valueOf(nomUtt.secondWord.word.toUpperCase()))) {
//					double p = e.probability/(0.5*0.25);
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//			
//			eta2 = -1*prob;
//			eta2 /= etaNought;
//			vosNomOnly.eta2.add(eta2);
//		}
//	}
//}
//else {
//	// otherwise the first word is an obj
//	if (nomUtt.firstWord.word.equalsIgnoreCase("apple") || nomUtt.firstWord.word.equalsIgnoreCase("bread") ||
//			nomUtt.firstWord.word.equalsIgnoreCase("cake") || nomUtt.firstWord.word.equalsIgnoreCase("rice") ||
//			nomUtt.firstWord.word.equalsIgnoreCase("coffee") || nomUtt.firstWord.word.equalsIgnoreCase("cola") ||
//			nomUtt.firstWord.word.equalsIgnoreCase("juice") || nomUtt.firstWord.word.equalsIgnoreCase("water")) {
//		double prob = 0;
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(nomUtt.firstWord.word.toUpperCase()))) {
//				double p = e.probability/0.125;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//		
//		eta1 = -1*prob;
//		eta1 /= etaNought;
//		
//		// if the second word is a verb
//		if (nomUtt.secondWord.word.equalsIgnoreCase("eat") || nomUtt.secondWord.word.equalsIgnoreCase("drink")) {
//			ovsNomOnly.count++;
//			ovsNomOnly.eta1.add(eta1);
//			
//			prob = 0;
//			
//			for(Event e:events) {
//				// compute entropy for probability of events, given we know what is being done to
//				// and what is being done
//				if(e.obj.equals(Objects.valueOf(nomUtt.firstWord.word.toUpperCase())) &&
//						e.action.equals(Actions.valueOf(nomUtt.secondWord.word.toUpperCase()))) {
///* !!!!!!!!!!!!!!!!!!!*/			double p = e.probability/(0.125*0.5);
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//			
//			eta2 = -1*prob;
//			ovsNomOnly.eta2.add(eta2);
//		}
//		else {
//			// otherwise the second word has NOM case
//			if (nomUtt.secondWord.inflection.containsKey("case")
//					&& nomUtt.secondWord.inflection.get("case").get(0) == Case.NOM) {
//				osvNomOnly.count++;
//				osvNomOnly.eta1.add(eta1);
//				
//				prob = 0;
//				// compute the entropy for probability of events, given we know what is being do to
//				// and by who
//				for(Event e:events) {
//					if(e.obj.equals(Objects.valueOf(nomUtt.firstWord.word.toUpperCase())) 
//							&& e.person.equals(People.valueOf(nomUtt.secondWord.word.toUpperCase()))) {
//						double p = e.probability;
//						if (p > 0.0) {
//							prob += p*Math.log(p);
//						}
//					}
//				}
//				
//				eta2 = -1*prob;
//				osvNomOnly.eta2.add(eta2);
//			}
//		}
//	}
//}
//}
//
//
//
//// for the acc only marked situation
//// if the first word is a subject
//if (accUtt.firstWord.word.equalsIgnoreCase("alice") || accUtt.firstWord.word.equalsIgnoreCase("bob") ||
//	accUtt.firstWord.word.equalsIgnoreCase("eve") || accUtt.firstWord.word.equalsIgnoreCase("mallory")
//	|| accUtt.firstWord.word.equalsIgnoreCase("trent")) {
//double prob = 0;
//// compute entropy for probability of events, given we know the person who is doing them
//for(Event e:events) {
//	if(e.person.equals(People.valueOf(accUtt.firstWord.word.toUpperCase()))) {
//		double p = e.probability;
//		if (p > 0.0) {
//			prob += p*Math.log(p);
//		}
//	}
//}
//						
//eta1 = -1*prob;
//			
//// if the second word is a verb
//if (accUtt.secondWord.word.equalsIgnoreCase("eat") || accUtt.secondWord.word.equalsIgnoreCase("drink")) {
//	svoAccOnly.count++;
//	svoAccOnly.eta1.add(eta1);
//		
//	prob = 0;
//			
//	for(Event e:events) {
//		// compute entropy for probability of events, given we know who is doing what
//		if(e.person.equals(People.valueOf(accUtt.firstWord.word.toUpperCase())) &&
//				e.action.equals(Actions.valueOf(accUtt.secondWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//				
//	eta2 = -1*prob;
//	svoAccOnly.eta2.add(eta2);
//}
//else {
//	// unless the second word has ACC case
//	if (accUtt.secondWord.inflection.containsKey("case")
//			&& accUtt.secondWord.inflection.get("case").get(0) == Case.ACC) {
//		sovAccOnly.count++;
//		sovAccOnly.eta1.add(eta1);
//					
//		prob = 0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(accUtt.firstWord.word.toUpperCase())) 
//					&& e.obj.equals(Objects.valueOf(accUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//					
//		eta2 = -1*prob;
//		sovAccOnly.eta2.add(eta2);
//	}
//}
//}
//else {
//// if the first word is a verb
//if (accUtt.firstWord.word.equalsIgnoreCase("eat") || accUtt.firstWord.word.equalsIgnoreCase("drink")) {
//	double prob = 0;
//	// compute the entropy  for probability of events, given we know what is being done
//	for(Event e:events) {
//		if(e.action.equals(Actions.valueOf(accUtt.firstWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//		
//	eta1 = -1*prob;
//				
//	// if the second word is a person
//	if (accUtt.secondWord.word.equalsIgnoreCase("alice") || accUtt.secondWord.word.equalsIgnoreCase("bob") ||
//			accUtt.secondWord.word.equalsIgnoreCase("eve") || accUtt.secondWord.word.equalsIgnoreCase("mallory")
//			|| accUtt.secondWord.word.equalsIgnoreCase("trent")) {
//		vsoAccOnly.count++;
//		vsoAccOnly.eta1.add(eta1);
//					
//		prob = 0;
//		// compute the entropy for probability of events, given we know what is being done
//		// and by who
//		for(Event e:events) {
//			if(e.action.equals(Actions.valueOf(accUtt.firstWord.word.toUpperCase())) 
//					&& e.person.equals(People.valueOf(accUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//		
//		eta2 = -1*prob;
//		vsoAccOnly.eta2.add(eta2);
//	}
//	else {
//		// otherwise, the second word has ACC case
//		if (accUtt.secondWord.inflection.containsKey("case")
//				&& accUtt.secondWord.inflection.get("case").get(0) == Case.ACC) {
//			vosAccOnly.count++;
//			vosAccOnly.eta1.add(eta1);
//						
//			prob = 0;
//			// compute the entropy of probability of events, given we know what is being done
//			// and what is being done to
//			for(Event e:events) {
//				if(e.action.equals(Actions.valueOf(accUtt.firstWord.word.toUpperCase())) 
//						&& e.obj.equals(Objects.valueOf(accUtt.secondWord.word.toUpperCase()))) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//						
//			eta2 = -1*prob;
//			vosAccOnly.eta2.add(eta2);
//		}
//	}
//}
//else {
//	// otherwise the first word has ACC case
//	if (accUtt.firstWord.inflection.containsKey("case")
//			&& accUtt.firstWord.inflection.get("case").get(0) == Case.ACC) {
//		double prob = 0;
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(accUtt.firstWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//					
//		eta1 = -1*prob;
//					
//		// if the second word is a verb
//		if (accUtt.secondWord.word.equalsIgnoreCase("eat") || accUtt.secondWord.word.equalsIgnoreCase("drink")) {
//			ovsAccOnly.count++;
//			ovsAccOnly.eta1.add(eta1);
//						
//			prob = 0;
//						
//			for(Event e:events) {
//				// compute entropy for probability of events, given we know what is being done to
//				// and what is being done
//				if(e.obj.equals(Objects.valueOf(accUtt.firstWord.word.toUpperCase())) &&
//						e.action.equals(Actions.valueOf(accUtt.secondWord.word.toUpperCase()))) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//						
//			eta2 = -1*prob;
//			ovsAccOnly.eta2.add(eta2);
//		}
//		else {
//			// otherwise the second word is a person
//			if (accUtt.secondWord.word.equalsIgnoreCase("alice") || accUtt.secondWord.word.equalsIgnoreCase("bob") ||
//					accUtt.secondWord.word.equalsIgnoreCase("eve") || accUtt.secondWord.word.equalsIgnoreCase("mallory")
//					|| accUtt.secondWord.word.equalsIgnoreCase("trent")) {
//				osvAccOnly.count++;
//				osvAccOnly.eta1.add(eta1);
//							
//				prob = 0;
//				// compute the entropy for probability of events, given we know what is being do to
//				// and by who
//				for(Event e:events) {
//					if(e.obj.equals(Objects.valueOf(accUtt.firstWord.word.toUpperCase())) 
//							&& e.person.equals(People.valueOf(accUtt.secondWord.word.toUpperCase()))) {
//						double p = e.probability;
//						if (p > 0.0) {
//							prob += p*Math.log(p);
//						}
//					}
//				}
//							
//				eta2 = -1*prob;
//				osvAccOnly.eta2.add(eta2);
//			}
//		}
//	}
//}
//}
//
//
//
//// for the NOM-ACC case-full situation
//// if the first word has NOM case
//if (allCaseUtt.firstWord.inflection.containsKey("case")
//	&& allCaseUtt.firstWord.inflection.get("case").get(0) == Case.NOM) {
//double prob = 0;
//// compute entropy for probability of events, given we know the person who is doing them
//for(Event e:events) {
//	if(e.person.equals(People.valueOf(allCaseUtt.firstWord.word.toUpperCase()))) {
//		double p = e.probability;
//		if (p > 0.0) {
//			prob += p*Math.log(p);
//		}
//	}
//}
//
//eta1 = -1*prob;
//
//// if the second word has ACC case
//if (allCaseUtt.secondWord.inflection.containsKey("case")
//		&& allCaseUtt.secondWord.inflection.get("case").get(0) == Case.ACC) {
//	sovNomAcc.count++;
//	sovNomAcc.eta1.add(eta1);
//	
//	prob = 0;
//	// compute the entropy of probability of events, given we know who is doing
//	// and what is being done to
//	for(Event e:events) {
//		if(e.person.equals(People.valueOf(allCaseUtt.firstWord.word.toUpperCase())) 
//				&& e.obj.equals(Objects.valueOf(allCaseUtt.secondWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//	
//	eta2 = -1*prob;
//	sovNomAcc.eta2.add(eta2);
//}
//else {
//	// the word is a verb
//	svoNomAcc.count++;
//	svoNomAcc.eta1.add(eta1);
//	
//	prob = 0;
//	for(Event e:events) {
//		// compute entropy for probability of events, given we know who is doing what
//		if(e.person.equals(People.valueOf(allCaseUtt.firstWord.word.toUpperCase())) &&
//				e.action.equals(Actions.valueOf(allCaseUtt.secondWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//	
//	eta2 = -1*prob;
//	svoNomAcc.eta2.add(eta2);
//}
//}
//else {
//// otherwise, if the first word has ACC case
//if (allCaseUtt.firstWord.inflection.containsKey("case")
//		&& allCaseUtt.firstWord.inflection.get("case").get(0) == Case.ACC) {
//	double prob = 0;
//	// compute the entropy for probability of events, given we know what is being done to
//	for(Event e:events) {
//		if(e.obj.equals(Objects.valueOf(allCaseUtt.firstWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//	
//	eta1 = -1*prob;
//	
//	// if the second word has NOM case
//	if (allCaseUtt.secondWord.inflection.containsKey("case")
//			&& allCaseUtt.secondWord.inflection.get("case").get(0) == Case.NOM) {
//		osvNomAcc.count++;
//		osvNomAcc.eta1.add(eta1);
//		
//		prob = 0;
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(allCaseUtt.firstWord.word.toUpperCase())) 
//					&& e.person.equals(People.valueOf(allCaseUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//		
//		eta2 = -1*prob;
//		osvNomAcc.eta2.add(eta2);
//	}
//	else {
//		// otherwise the second word is for sure a verb
//		ovsNomAcc.count++;
//		ovsNomAcc.eta1.add(eta1);
//		
//		prob = 0;
//		
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(allCaseUtt.firstWord.word.toUpperCase())) &&
//					e.action.equals(Actions.valueOf(allCaseUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//		
//		eta2 = -1*prob;
//		ovsNomAcc.eta2.add(eta2);
//	}
//}
//// otherwise, the first word is for sure a verb
//else {
//	double prob = 0;
//	// compute the entropy  for probability of events, given we know what is being done
//	for(Event e:events) {
//		if(e.action.equals(Actions.valueOf(allCaseUtt.firstWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//	
//	eta1 = -1*prob;
//	
//	// if the second word has NOM case
//	if (allCaseUtt.secondWord.inflection.containsKey("case")
//			&& allCaseUtt.secondWord.inflection.get("case").get(0) == Case.NOM) {
//		vsoNomAcc.count++;
//		vsoNomAcc.eta1.add(eta1);
//		
//		prob = 0;
//		// compute the entropy for probability of events, given we know what is being done
//		// and by who
//		for(Event e:events) {
//			if(e.action.equals(Actions.valueOf(allCaseUtt.firstWord.word.toUpperCase())) 
//					&& e.person.equals(People.valueOf(allCaseUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//		
//		eta2 = -1*prob;
//		vsoNomAcc.eta2.add(eta2);
//	}
//	else {
//		// the second word for sure has ACC case
//		vosNomAcc.count++;
//		vosNomAcc.eta1.add(eta1);
//		
//		prob = 0;
//		// compute the entropy of probability of events, given we know what is being done
//		// and what is being done to
//		for(Event e:events) {
//			if(e.action.equals(Actions.valueOf(allCaseUtt.firstWord.word.toUpperCase())) 
//					&& e.obj.equals(Objects.valueOf(allCaseUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//		
//		eta2 = -1*prob;
//		vosNomAcc.eta2.add(eta2);
//	}
//}
//}
//
//
//
////*********************** ERG-ABS langs		*******************************************************
//
//// for the erg only marked situation
//// if the first word has ERG case
//if (ergUtt.firstWord.inflection.containsKey("case")
//	&& ergUtt.firstWord.inflection.get("case").get(0) == Case.ERG) {
//double prob = 0;
//// compute entropy for probability of events, given we know the person who is doing them
//for(Event e:events) {
//	if(e.person.equals(People.valueOf(ergUtt.firstWord.word.toUpperCase()))) {
//		double p = e.probability;
//		if (p > 0.0) {
//			prob += p*Math.log(p);
//		}
//	}
//}
//						
//eta1 = -1*prob;
//			
//// if the second word is a verb
//if (ergUtt.secondWord.word.equalsIgnoreCase("eat") || ergUtt.secondWord.word.equalsIgnoreCase("drink")) {
//	svoErgOnly.count++;
//	svoErgOnly.eta1.add(eta1);
//				
//	prob = 0;
//				
//	for(Event e:events) {
//		// compute entropy for probability of events, given we know who is doing what
//		if(e.person.equals(People.valueOf(ergUtt.firstWord.word.toUpperCase())) &&
//				e.action.equals(Actions.valueOf(ergUtt.secondWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//				
//	eta2 = -1*prob;
//	svoErgOnly.eta2.add(eta2);
//}
//else {
//	// unless the second word is an obj
//	if (ergUtt.secondWord.word.equalsIgnoreCase("apple") || ergUtt.secondWord.word.equalsIgnoreCase("bread") ||
//			ergUtt.secondWord.word.equalsIgnoreCase("cake") || ergUtt.secondWord.word.equalsIgnoreCase("rice") ||
//			ergUtt.secondWord.word.equalsIgnoreCase("coffee") || ergUtt.secondWord.word.equalsIgnoreCase("cola") ||
//			ergUtt.secondWord.word.equalsIgnoreCase("juice") || ergUtt.secondWord.word.equalsIgnoreCase("water")) {
//		sovErgOnly.count++;
//		sovErgOnly.eta1.add(eta1);
//					
//		prob = 0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(ergUtt.firstWord.word.toUpperCase())) 
//					&& e.obj.equals(Objects.valueOf(ergUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//				
//		eta2 = -1*prob;
//		sovErgOnly.eta2.add(eta2);
//	}
//}
//}
//else {
//// if the first word is a verb
//if (ergUtt.firstWord.word.equalsIgnoreCase("eat") || ergUtt.firstWord.word.equalsIgnoreCase("drink")) {
//	double prob = 0;
//	// compute the entropy  for probability of events, given we know what is being done
//	for(Event e:events) {
//		if(e.action.equals(Actions.valueOf(ergUtt.firstWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//		}
//	}
//}
//				
//eta1 = -1*prob;
//				
//// if the second word has ERG case
//if (ergUtt.secondWord.inflection.containsKey("case")
//		&& ergUtt.secondWord.inflection.get("case").get(0) == Case.ERG) {
//	vsoErgOnly.count++;
//	vsoErgOnly.eta1.add(eta1);
//					
//	prob = 0;
//	// compute the entropy for probability of events, given we know what is being done
//	// and by who
//	for(Event e:events) {
//		if(e.action.equals(Actions.valueOf(ergUtt.firstWord.word.toUpperCase())) 
//				&& e.person.equals(People.valueOf(ergUtt.secondWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//					
//	eta2 = -1*prob;
//	vsoErgOnly.eta2.add(eta2);
//}
//else {
//	// otherwise, the second word is an obj
//	if (ergUtt.secondWord.word.equalsIgnoreCase("apple") || ergUtt.secondWord.word.equalsIgnoreCase("bread") ||
//			ergUtt.secondWord.word.equalsIgnoreCase("cake") || ergUtt.secondWord.word.equalsIgnoreCase("rice") ||
//			ergUtt.secondWord.word.equalsIgnoreCase("coffee") || ergUtt.secondWord.word.equalsIgnoreCase("cola") ||
//			ergUtt.secondWord.word.equalsIgnoreCase("juice") || ergUtt.secondWord.word.equalsIgnoreCase("water")) {
//		vosErgOnly.count++;
//		vosErgOnly.eta1.add(eta1);
//						
//		prob = 0;
//		// compute the entropy of probability of events, given we know what is being done
//		// and what is being done to
//		for(Event e:events) {
//			if(e.action.equals(Actions.valueOf(ergUtt.firstWord.word.toUpperCase())) 
//					&& e.obj.equals(Objects.valueOf(ergUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//						
//		eta2 = -1*prob;
//		vosErgOnly.eta2.add(eta2);
//	}
//}
//}
//else {
//// otherwise the first word is an obj
//if (ergUtt.firstWord.word.equalsIgnoreCase("apple") || ergUtt.firstWord.word.equalsIgnoreCase("bread") ||
//		ergUtt.firstWord.word.equalsIgnoreCase("cake") || ergUtt.firstWord.word.equalsIgnoreCase("rice") ||
//		ergUtt.firstWord.word.equalsIgnoreCase("coffee") || ergUtt.firstWord.word.equalsIgnoreCase("cola") ||
//		ergUtt.firstWord.word.equalsIgnoreCase("juice") || ergUtt.firstWord.word.equalsIgnoreCase("water")) {
//	double prob = 0;
//	// compute the entropy for probability of events, given we know what is being done to
//	for(Event e:events) {
//		if(e.obj.equals(Objects.valueOf(ergUtt.firstWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//					
//	eta1 = -1*prob;
//					
//	// if the second word is a verb
//	if (ergUtt.secondWord.word.equalsIgnoreCase("eat") || ergUtt.secondWord.word.equalsIgnoreCase("drink")) {
//		ovsErgOnly.count++;
//		ovsErgOnly.eta1.add(eta1);
//						
//		prob = 0;
//						
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(ergUtt.firstWord.word.toUpperCase())) &&
//					e.action.equals(Actions.valueOf(ergUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//						
//		eta2 = -1*prob;
//		ovsErgOnly.eta2.add(eta2);
//	}
//	else {
//		// otherwise the second word has ERG case
//		if (ergUtt.secondWord.inflection.containsKey("case")
//				&& ergUtt.secondWord.inflection.get("case").get(0) == Case.ERG) {
//			osvErgOnly.count++;
//			osvErgOnly.eta1.add(eta1);
//							
//			prob = 0;
//			// compute the entropy for probability of events, given we know what is being do to
//			// and by who
//			for(Event e:events) {
//				if(e.obj.equals(Objects.valueOf(ergUtt.firstWord.word.toUpperCase())) 
//						&& e.person.equals(People.valueOf(ergUtt.secondWord.word.toUpperCase()))) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//							
//			eta2 = -1*prob;
//			osvErgOnly.eta2.add(eta2);
//		}
//	}
//}
//}
//}
//		
//		
//		
//// for the abs only marked situation
//// if the first word is a subject
//if (absUtt.firstWord.word.equalsIgnoreCase("alice") || absUtt.firstWord.word.equalsIgnoreCase("bob") ||
//absUtt.firstWord.word.equalsIgnoreCase("eve") || absUtt.firstWord.word.equalsIgnoreCase("mallory")
//|| absUtt.firstWord.word.equalsIgnoreCase("trent")) {
//double prob = 0;
//// compute entropy for probability of events, given we know the person who is doing them
//for(Event e:events) {
//if(e.person.equals(People.valueOf(absUtt.firstWord.word.toUpperCase()))) {
//	double p = e.probability;
//		if (p > 0.0) {
//			prob += p*Math.log(p);
//		}
//	}
//}
//									
//eta1 = -1*prob;
//						
//// if the second word is a verb
//if (absUtt.secondWord.word.equalsIgnoreCase("eat") || absUtt.secondWord.word.equalsIgnoreCase("drink")) {
//	svoAbsOnly.count++;
//	svoAbsOnly.eta1.add(eta1);
//					
//	prob = 0;
//					
//	for(Event e:events) {
//		// compute entropy for probability of events, given we know who is doing what
//		if(e.person.equals(People.valueOf(absUtt.firstWord.word.toUpperCase())) &&
//				e.action.equals(Actions.valueOf(absUtt.secondWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//							
//	eta2 = -1*prob;
//	svoAbsOnly.eta2.add(eta2);
//	
//}
//else {
//	// unless the second word has ABS case
//	if (absUtt.secondWord.inflection.containsKey("case")
//			&& absUtt.secondWord.inflection.get("case").get(0) == Case.ABS) {
//		sovAbsOnly.count++;
//		sovAbsOnly.eta1.add(eta1);
//								
//		prob = 0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(absUtt.firstWord.word.toUpperCase())) 
//					&& e.obj.equals(Objects.valueOf(absUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//								
//		eta2 = -1*prob;
//		sovAbsOnly.eta2.add(eta2);
//		
//	}
//}
//}
//else {
//// if the first word is a verb
//if (absUtt.firstWord.word.equalsIgnoreCase("eat") || absUtt.firstWord.word.equalsIgnoreCase("drink")) {
//	double prob = 0;
//	// compute the entropy  for probability of events, given we know what is being done
//	for(Event e:events) {
//		if(e.action.equals(Actions.valueOf(absUtt.firstWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//					
//	eta1 = -1*prob;
//							
//	// if the second word is a person
//	if (absUtt.secondWord.word.equalsIgnoreCase("alice") || absUtt.secondWord.word.equalsIgnoreCase("bob") ||
//			absUtt.secondWord.word.equalsIgnoreCase("eve") || absUtt.secondWord.word.equalsIgnoreCase("mallory")
//			|| absUtt.secondWord.word.equalsIgnoreCase("trent")) {
//		vsoAbsOnly.count++;
//		vsoAbsOnly.eta1.add(eta1);
//								
//		prob = 0;
//		// compute the entropy for probability of events, given we know what is being done
//		// and by who
//		for(Event e:events) {
//			if(e.action.equals(Actions.valueOf(absUtt.firstWord.word.toUpperCase())) 
//					&& e.person.equals(People.valueOf(absUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//					
//		eta2 = -1*prob;
//		vsoAbsOnly.eta2.add(eta2);
//		
//	}
//	else {
//		// otherwise, the second word has ABS case
//		if (absUtt.secondWord.inflection.containsKey("case")
//				&& absUtt.secondWord.inflection.get("case").get(0) == Case.ABS) {
//			vosAbsOnly.count++;
//			vosAbsOnly.eta1.add(eta1);
//									
//			prob = 0;
//			// compute the entropy of probability of events, given we know what is being done
//			// and what is being done to
//			for(Event e:events) {
//				if(e.action.equals(Actions.valueOf(absUtt.firstWord.word.toUpperCase())) 
//						&& e.obj.equals(Objects.valueOf(absUtt.secondWord.word.toUpperCase()))) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//									
//			eta2 = -1*prob;
//			vosAbsOnly.eta2.add(eta2);
//			
//		}
//	}
//}
//else {
//	// otherwise the first word has ABS case
//	if (absUtt.firstWord.inflection.containsKey("case")
//			&& absUtt.firstWord.inflection.get("case").get(0) == Case.ABS) {
//		double prob = 0;
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(absUtt.firstWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//								
//		eta1 = -1*prob;
//								
//		// if the second word is a verb
//		if (absUtt.secondWord.word.equalsIgnoreCase("eat") || absUtt.secondWord.word.equalsIgnoreCase("drink")) {
//			ovsAbsOnly.count++;
//			ovsAbsOnly.eta1.add(eta1);
//									
//			prob = 0;
//									
//			for(Event e:events) {
//				// compute entropy for probability of events, given we know what is being done to
//				// and what is being done
//				if(e.obj.equals(Objects.valueOf(absUtt.firstWord.word.toUpperCase())) &&
//						e.action.equals(Actions.valueOf(absUtt.secondWord.word.toUpperCase()))) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//									
//			eta2 = -1*prob;
//			ovsAbsOnly.eta2.add(eta2);
//			
//		}
//		else {
//			// otherwise the second word is a person
//			if (absUtt.secondWord.word.equalsIgnoreCase("alice") || absUtt.secondWord.word.equalsIgnoreCase("bob") ||
//					absUtt.secondWord.word.equalsIgnoreCase("eve") || absUtt.secondWord.word.equalsIgnoreCase("mallory")
//					|| absUtt.secondWord.word.equalsIgnoreCase("trent")) {
//				osvAbsOnly.count++;
//				osvAbsOnly.eta1.add(eta1);
//										
//				prob = 0;
//				// compute the entropy for probability of events, given we know what is being do to
//				// and by who
//				for(Event e:events) {
//					if(e.obj.equals(Objects.valueOf(absUtt.firstWord.word.toUpperCase())) 
//							&& e.person.equals(People.valueOf(absUtt.secondWord.word.toUpperCase()))) {
//						double p = e.probability;
//						if (p > 0.0) {
//							prob += p*Math.log(p);
//						}
//					}
//				}
//										
//				eta2 = -1*prob;
//				osvAbsOnly.eta2.add(eta2);
//				
//			}
//		}
//	}
//}
//}
//		
//		
//		
//// for the ERG-ABS case-full situation
//// if the first word has ERG case
//if (ergAbsUtt.firstWord.inflection.containsKey("case")
//	&& ergAbsUtt.firstWord.inflection.get("case").get(0) == Case.ERG) {
//double prob = 0;
//// compute entropy for probability of events, given we know the person who is doing them
//for(Event e:events) {
//	if(e.person.equals(People.valueOf(ergAbsUtt.firstWord.word.toUpperCase()))) {
//		double p = e.probability;
//		if (p > 0.0) {
//			prob += p*Math.log(p);
//		}
//	}
//}
//			
//eta1 = -1*prob;
//			
//// if the second word has ABS case
//if (ergAbsUtt.secondWord.inflection.containsKey("case")
//		&& ergAbsUtt.secondWord.inflection.get("case").get(0) == Case.ABS) {
//	sovErgAbs.count++;
//	sovErgAbs.eta1.add(eta1);
//				
//	prob = 0;
//	// compute the entropy of probability of events, given we know who is doing
//	// and what is being done to
//	for(Event e:events) {
//		if(e.person.equals(People.valueOf(ergAbsUtt.firstWord.word.toUpperCase())) 
//				&& e.obj.equals(Objects.valueOf(ergAbsUtt.secondWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//				
//	eta2 = -1*prob;
//	sovErgAbs.eta2.add(eta2);
//
//}
//else {
//	// the 2nd word is a verb
//	svoErgAbs.count++;
//	svoErgAbs.eta1.add(eta1);
//				
//	prob = 0;
//	for(Event e:events) {
//		// compute entropy for probability of events, given we know who is doing what
//		if(e.person.equals(People.valueOf(ergAbsUtt.firstWord.word.toUpperCase())) &&
//				e.action.equals(Actions.valueOf(ergAbsUtt.secondWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//				
//	eta2 = -1*prob;
//	svoErgAbs.eta2.add(eta2);
//
//}
//}
//else {
//// otherwise, if the first word has ABS case
//if (ergAbsUtt.firstWord.inflection.containsKey("case")
//		&& ergAbsUtt.firstWord.inflection.get("case").get(0) == Case.ABS) {
//	double prob = 0;
//	// compute the entropy for probability of events, given we know what is being done to
//	for(Event e:events) {
//		if(e.obj.equals(Objects.valueOf(ergAbsUtt.firstWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//			
//	eta1 = -1*prob;
//				
//	// if the second word has ERG case
//	if (ergAbsUtt.secondWord.inflection.containsKey("case")
//			&& ergAbsUtt.secondWord.inflection.get("case").get(0) == Case.ERG) {
//		osvErgAbs.count++;
//		osvErgAbs.eta1.add(eta1);
//					
//		prob = 0;
//		// compute the entropy for probability of events, given we know what is being do to
//		// and by who
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(ergAbsUtt.firstWord.word.toUpperCase())) 
//					&& e.person.equals(People.valueOf(ergAbsUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//					
//		eta2 = -1*prob;
//		osvErgAbs.eta2.add(eta2);
//	
//	}
//	else {
//		// otherwise the second word is for sure a verb
//		ovsErgAbs.count++;
//		ovsErgAbs.eta1.add(eta1);
//				
//		prob = 0;
//					
//		for(Event e:events) {
//			// compute entropy for probability of events, given we know what is being done to
//			// and what is being done
//			if(e.obj.equals(Objects.valueOf(ergAbsUtt.firstWord.word.toUpperCase())) &&
//					e.action.equals(Actions.valueOf(ergAbsUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//					
//		eta2 = -1*prob;
//		ovsErgAbs.eta2.add(eta2);
//	
//	}
//}
//else {
//	// otherwise, the first word is for sure a verb
//	double prob = 0;
//	// compute the entropy  for probability of events, given we know what is being done
//	for(Event e:events) {
//		if(e.action.equals(Actions.valueOf(ergAbsUtt.firstWord.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//				
//	eta1 = -1*prob;
//				
//	// if the second word has ERG case
//	if (ergAbsUtt.secondWord.inflection.containsKey("case")
//			&& ergAbsUtt.secondWord.inflection.get("case").get(0) == Case.ERG) {
//		vsoErgAbs.count++;
//		vsoErgAbs.eta1.add(eta1);
//					
//		prob = 0;
//		// compute the entropy for probability of events, given we know what is being done
//		// and by who
//		for(Event e:events) {
//			if(e.action.equals(Actions.valueOf(ergAbsUtt.firstWord.word.toUpperCase())) 
//					&& e.person.equals(People.valueOf(ergAbsUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//					
//		eta2 = -1*prob;
//		vsoErgAbs.eta2.add(eta2);
//	
//	}
//	else {
//		// the second word for sure has ABS case
//		vosErgAbs.count++;
//		vosErgAbs.eta1.add(eta1);
//				
//		prob = 0;
//		// compute the entropy of probability of events, given we know what is being done
//		// and what is being done to
//		for(Event e:events) {
//			if(e.action.equals(Actions.valueOf(ergAbsUtt.firstWord.word.toUpperCase())) 
//					&& e.obj.equals(Objects.valueOf(ergAbsUtt.secondWord.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//					
//		eta2 = -1*prob;
//		vosErgAbs.eta2.add(eta2);
//	
//	}
//}
//}
//
//
////-------------VERB AGREEMENT------------------------------------------------------
//// MASC vs FEM agr			
//HashMap<String, Word> lex = new HashMap<String, Word>();
//lex.put("alice", new Word("alice", "class", NounClass.FEMININE));
//lex.put("bob", new Word("bob", "class", NounClass.MASCULINE));
//lex.put("eve", new Word("eve", "class", NounClass.FEMININE));
//lex.put("mallory", new Word("mallory", "class", NounClass.FEMININE));
//lex.put("trent", new Word("trent", "class", NounClass.MASCULINE));
//lex.put("apple", new Word("apple", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
//lex.put("bread", new Word("bread", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
//lex.put("cake", new Word("cake", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
//lex.put("rice", new Word("rice", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
//lex.put("coffee", new Word("coffee", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
//lex.put("cola", new Word("cola", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
//lex.put("juice", new Word("juice", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
//lex.put("water", new Word("water", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
//
//ArrayList<Word> protoUtt = new ArrayList<Word>();
//protoUtt.add(lex.get(ev.person.toString()));
//protoUtt.add(lex.get(ev.action.toString()));
//protoUtt.add(lex.get(ev.obj.toString()));
//
//Utterance mascFemSubAgrUtt = new Utterance(protoUtt, 0, 1);
//// for the caseless situation
//Word fW = mascFemSubAgrUtt.firstWord;
//Word sW = mascFemSubAgrUtt.secondWord;
//
//// if the first word is a person
//if (fW.word.equalsIgnoreCase("alice") || fW.word.equalsIgnoreCase("bob") ||
//	fW.word.equalsIgnoreCase("eve") || fW.word.equalsIgnoreCase("mallory")
//	|| fW.word.equalsIgnoreCase("trent")) {
//double prob = 0;
//// compute entropy for probability of events, given we know the person who is doing them
//for(Event e:events) {
//	if(e.person.equals(People.valueOf(fW.word.toUpperCase()))) {
//		double p = e.probability;
//		if (p > 0.0) {
//			prob += p*Math.log(p);
//		}
//	}
//}
//
//eta1 = -1*prob;
//
//// if the second word is a verb
//if (sW.word.equalsIgnoreCase("eat") || sW.word.equalsIgnoreCase("drink")) {
//	svoSubjAgrNClassMF.count++;
//	svoSubjAgrNClassMF.eta1.add(eta1);
//
//	prob = 0;
//
//	for(Event e:events) {
//		// compute entropy for probability of events, given we know who is doing what
//		// don't factor noun class into equation because we have the subject and that's more informative
//		if(e.person.equals(People.valueOf(first.toUpperCase())) &&
//				e.action.equals(Actions.valueOf(sW.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//
//	eta2 = -1*prob;
//	svoSubjAgrNClassMF.eta2.add(eta2);
//}
//else {
//	// otherwise the second word is an obj
//	if (sW.word.equalsIgnoreCase("apple") || sW.word.equalsIgnoreCase("bread") ||
//			sW.word.equalsIgnoreCase("cake") || sW.word.equalsIgnoreCase("rice") ||
//			sW.word.equalsIgnoreCase("coffee") || sW.word.equalsIgnoreCase("cola") ||
//			sW.word.equalsIgnoreCase("juice") || sW.word.equalsIgnoreCase("water")) {
//		sovSubjAgrNClassMF.count++;
//		sovSubjAgrNClassMF.eta1.add(eta1);
//
//		prob = 0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(fW.word.toUpperCase())) 
//					&& e.obj.equals(Objects.valueOf(sW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta2 = -1*prob;
//		sovSubjAgrNClassMF.eta2.add(eta2);
//	}
//}
//}
//else {
//// if the first word is a verb
//if (fW.word.equalsIgnoreCase("eat") || fW.word.equalsIgnoreCase("drink")) {
//	double prob = 0;
//	// compute the entropy  for probability of events, given we know what is being done
//	// and the noun class of the subj
//	for(Event e:events) {
//		if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//				&& lex.get(e.person.toString()).inflection.get("class").get(0) == fW.inflection.get("subj").get(0)) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//
//	eta1 = -1*prob;
//
//	// if the second word is a subj
//	if (sW.word.equalsIgnoreCase("alice") || sW.word.equalsIgnoreCase("bob") ||
//			sW.word.equalsIgnoreCase("eve") || sW.word.equalsIgnoreCase("mallory")
//			|| sW.word.equalsIgnoreCase("trent")) {
//		vsoSubjAgrNClassMF.count++;
//		vsoSubjAgrNClassMF.eta1.add(eta1);
//
//		prob = 0;
//		// compute the entropy for probability of events, given we know what is being done
//		// and by who
//		// don't factor noun class into equation because we have the subject and that's more informative
//		for(Event e:events) {
//			if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//					&& e.person.equals(People.valueOf(sW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta2 = -1*prob;
//		vsoSubjAgrNClassMF.eta2.add(eta2);
//	}
//	else {
//		// otherwise, the second word is an obj
//		if (sW.word.equalsIgnoreCase("apple") || sW.word.equalsIgnoreCase("bread") ||
//				sW.word.equalsIgnoreCase("cake") || sW.word.equalsIgnoreCase("rice") ||
//				sW.word.equalsIgnoreCase("coffee") || sW.word.equalsIgnoreCase("cola") ||
//				sW.word.equalsIgnoreCase("juice") || sW.word.equalsIgnoreCase("water")) {
//			vosSubjAgrNClassMF.count++;
//			vosSubjAgrNClassMF.eta1.add(eta1);
//
//			prob = 0;
//			// compute the entropy of probability of events, given we know what is being done
//			// and what is being done to
//			// and the noun class of the subj
//			for(Event e:events) {
//				if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//						&& e.obj.equals(Objects.valueOf(sW.word.toUpperCase()))
//						&& lex.get(e.person.toString()).inflection.get("class").get(0) == fW.inflection.get("subj").get(0)) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//
//			eta2 = -1*prob;
//			vosSubjAgrNClassMF.eta2.add(eta2);
//		}
//	}
//}
//else {
//	// otherwise the first word is an obj
//	if (fW.word.equalsIgnoreCase("apple") || fW.word.equalsIgnoreCase("bread") ||
//			fW.word.equalsIgnoreCase("cake") || fW.word.equalsIgnoreCase("rice") ||
//			fW.word.equalsIgnoreCase("coffee") || fW.word.equalsIgnoreCase("cola") ||
//			fW.word.equalsIgnoreCase("juice") || fW.word.equalsIgnoreCase("water")) {
//		double prob = 0;
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta1 = -1*prob;
//
//		// if the second word is a verb
//		if (sW.word.equalsIgnoreCase("eat") || sW.word.equalsIgnoreCase("drink")) {
//			ovsSubjAgrNClassMF.count++;
//			ovsSubjAgrNClassMF.eta1.add(eta1);
//
//			prob = 0;
//
//			for(Event e:events) {
//				// compute entropy for probability of events, given we know what is being done to
//				// and what is being done
//				// and the noun class of the subj
//				if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase())) 
//						&& e.action.equals(Actions.valueOf(sW.word.toUpperCase()))
//						&& lex.get(e.person.toString()).inflection.get("class").get(0) == sW.inflection.get("subj").get(0)) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//
//			eta2 = -1*prob;
//			ovsSubjAgrNClassMF.eta2.add(eta2);
//		}
//		else {
//			// otherwise the second word is a subj
//			if (sW.word.equalsIgnoreCase("alice") || sW.word.equalsIgnoreCase("bob") ||
//					sW.word.equalsIgnoreCase("eve") || sW.word.equalsIgnoreCase("mallory")
//					|| sW.word.equalsIgnoreCase("trent")) {
//				osvSubjAgrNClassMF.count++;
//				osvSubjAgrNClassMF.eta1.add(eta1);
//
//				prob = 0;
//				// compute the entropy for probability of events, given we know what is being do to
//				// and by who
//				for(Event e:events) {
//					if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase())) 
//							&& e.person.equals(People.valueOf(sW.word.toUpperCase()))) {
//						double p = e.probability;
//						if (p > 0.0) {
//							prob += p*Math.log(p);
//						}
//					}
//				}
//
//				eta2 = -1*prob;
//				osvSubjAgrNClassMF.eta2.add(eta2);
//			}
//		}
//	}
//}	
//}
//
//// TO DO: add object agreements
//
//// MASC vs FEM vs NEUT agr
//lex.remove("apple");
//lex.remove("bread");
//lex.remove("cake");
//lex.remove("rice");
//lex.remove("coffee");
//lex.remove("cola");
//lex.remove("juice");
//lex.remove("water");
//lex.put("apple", new Word("apple", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
//lex.put("bread", new Word("bread", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
//lex.put("cake", new Word("cake", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
//lex.put("rice", new Word("rice", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
//lex.put("coffee", new Word("coffee", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
//lex.put("cola", new Word("cola", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
//lex.put("juice", new Word("juice", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
//lex.put("water", new Word("water", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
//
//protoUtt.clear();
//protoUtt.add(lex.get(ev.person.toString()));
//protoUtt.add(lex.get(ev.action.toString()));
//protoUtt.add(lex.get(ev.obj.toString()));
//Utterance mascFemNeutSubAgrUtt = new Utterance(protoUtt, 0, 1);
//		
//// for the caseless situation
//fW = mascFemNeutSubAgrUtt.firstWord;
//sW = mascFemNeutSubAgrUtt.secondWord;
//
//// if the first word is a person
//if (fW.word.equalsIgnoreCase("alice") || fW.word.equalsIgnoreCase("bob") ||
//	fW.word.equalsIgnoreCase("eve") || fW.word.equalsIgnoreCase("mallory")
//	|| fW.word.equalsIgnoreCase("trent")) {
//double prob = 0;
//// compute entropy for probability of events, given we know the person who is doing them
//for(Event e:events) {
//	if(e.person.equals(People.valueOf(fW.word.toUpperCase()))) {
//		double p = e.probability;
//		if (p > 0.0) {
//			prob += p*Math.log(p);
//		}
//	}
//}
//
//eta1 = -1*prob;
//
//// if the second word is a verb
//if (sW.word.equalsIgnoreCase("eat") || sW.word.equalsIgnoreCase("drink")) {
//	svoSubjAgrNClassMFN.count++;
//	svoSubjAgrNClassMFN.eta1.add(eta1);
//
//	prob = 0;
//
//	for(Event e:events) {
//		// compute entropy for probability of events, given we know who is doing what
//		// don't factor noun class into equation because we have the subject and that's more informative
//		if(e.person.equals(People.valueOf(first.toUpperCase())) &&
//				e.action.equals(Actions.valueOf(sW.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//
//	eta2 = -1*prob;
//	svoSubjAgrNClassMFN.eta2.add(eta2);
//}
//else {
//	// otherwise the second word is an obj
//	if (sW.word.equalsIgnoreCase("apple") || sW.word.equalsIgnoreCase("bread") ||
//			sW.word.equalsIgnoreCase("cake") || sW.word.equalsIgnoreCase("rice") ||
//			sW.word.equalsIgnoreCase("coffee") || sW.word.equalsIgnoreCase("cola") ||
//			sW.word.equalsIgnoreCase("juice") || sW.word.equalsIgnoreCase("water")) {
//		sovSubjAgrNClassMFN.count++;
//		sovSubjAgrNClassMFN.eta1.add(eta1);
//
//		prob = 0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(fW.word.toUpperCase())) 
//					&& e.obj.equals(Objects.valueOf(sW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta2 = -1*prob;
//		sovSubjAgrNClassMFN.eta2.add(eta2);
//	}
//}
//}
//else {
//// if the first word is a verb
//if (fW.word.equalsIgnoreCase("eat") || fW.word.equalsIgnoreCase("drink")) {
//	double prob = 0;
//	// compute the entropy  for probability of events, given we know what is being done
//	// and the noun class of the subj
//	for(Event e:events) {
//		if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//				&& lex.get(e.person.toString()).inflection.get("class").get(0) == fW.inflection.get("subj").get(0)) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//
//	eta1 = -1*prob;
//
//	// if the second word is a subj
//	if (sW.word.equalsIgnoreCase("alice") || sW.word.equalsIgnoreCase("bob") ||
//			sW.word.equalsIgnoreCase("eve") || sW.word.equalsIgnoreCase("mallory")
//			|| sW.word.equalsIgnoreCase("trent")) {
//		vsoSubjAgrNClassMFN.count++;
//		vsoSubjAgrNClassMFN.eta1.add(eta1);
//
//		prob = 0;
//		// compute the entropy for probability of events, given we know what is being done
//		// and by who
//		// don't factor noun class into equation because we have the subject and that's more informative
//		for(Event e:events) {
//			if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//					&& e.person.equals(People.valueOf(sW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta2 = -1*prob;
//		vsoSubjAgrNClassMFN.eta2.add(eta2);
//	}
//	else {
//		// otherwise, the second word is an obj
//		if (sW.word.equalsIgnoreCase("apple") || sW.word.equalsIgnoreCase("bread") ||
//				sW.word.equalsIgnoreCase("cake") || sW.word.equalsIgnoreCase("rice") ||
//				sW.word.equalsIgnoreCase("coffee") || sW.word.equalsIgnoreCase("cola") ||
//				sW.word.equalsIgnoreCase("juice") || sW.word.equalsIgnoreCase("water")) {
//			vosSubjAgrNClassMFN.count++;
//			vosSubjAgrNClassMFN.eta1.add(eta1);
//
//			prob = 0;
//			// compute the entropy of probability of events, given we know what is being done
//			// and what is being done to
//			// and the noun class of the subj
//			for(Event e:events) {
//				if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//						&& e.obj.equals(Objects.valueOf(sW.word.toUpperCase()))
//						&& lex.get(e.person.toString()).inflection.get("class").get(0) == fW.inflection.get("subj").get(0)) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//
//			eta2 = -1*prob;
//			vosSubjAgrNClassMFN.eta2.add(eta2);
//		}
//	}
//}
//else {
//	// otherwise the first word is an obj
//	if (fW.word.equalsIgnoreCase("apple") || fW.word.equalsIgnoreCase("bread") ||
//			fW.word.equalsIgnoreCase("cake") || fW.word.equalsIgnoreCase("rice") ||
//			fW.word.equalsIgnoreCase("coffee") || fW.word.equalsIgnoreCase("cola") ||
//			fW.word.equalsIgnoreCase("juice") || fW.word.equalsIgnoreCase("water")) {
//		double prob = 0;
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta1 = -1*prob;
//
//		// if the second word is a verb
//		if (sW.word.equalsIgnoreCase("eat") || sW.word.equalsIgnoreCase("drink")) {
//			ovsSubjAgrNClassMFN.count++;
//			ovsSubjAgrNClassMFN.eta1.add(eta1);
//
//			prob = 0;
//
//			for(Event e:events) {
//				// compute entropy for probability of events, given we know what is being done to
//				// and what is being done
//				// and the noun class of the subj
//				if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase())) 
//						&& e.action.equals(Actions.valueOf(sW.word.toUpperCase()))
//						&& lex.get(e.person.toString()).inflection.get("class").get(0) == sW.inflection.get("subj").get(0)) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//
//			eta2 = -1*prob;
//			ovsSubjAgrNClassMFN.eta2.add(eta2);
//		}
//		else {
//			// otherwise the second word is a subj
//			if (sW.word.equalsIgnoreCase("alice") || sW.word.equalsIgnoreCase("bob") ||
//					sW.word.equalsIgnoreCase("eve") || sW.word.equalsIgnoreCase("mallory")
//					|| sW.word.equalsIgnoreCase("trent")) {
//				osvSubjAgrNClassMFN.count++;
//				osvSubjAgrNClassMFN.eta1.add(eta1);
//
//				prob = 0;
//				// compute the entropy for probability of events, given we know what is being do to
//				// and by who
//				for(Event e:events) {
//					if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase())) 
//							&& e.person.equals(People.valueOf(sW.word.toUpperCase()))) {
//						double p = e.probability;
//						if (p > 0.0) {
//							prob += p*Math.log(p);
//						}
//					}
//				}
//
//				eta2 = -1*prob;
//				osvSubjAgrNClassMFN.eta2.add(eta2);
//			}
//		}
//	}
//}	
//}
//
//// TO DO: add object agreements
//
//
//// ANIMATE vs INANIMATE agr
//lex.clear();
//lex.put("alice", new Word("alice", "class", NounClass.ANIMATE));
//lex.put("bob", new Word("bob", "class", NounClass.ANIMATE));
//lex.put("eve", new Word("eve", "class", NounClass.ANIMATE));
//lex.put("mallory", new Word("mallory", "class", NounClass.ANIMATE));
//lex.put("trent", new Word("trent", "class", NounClass.ANIMATE));
//lex.put("apple", new Word("apple", "class", NounClass.INANIMATE));
//lex.put("bread", new Word("bread", "class", NounClass.INANIMATE));
//lex.put("cake", new Word("cake", "class", NounClass.INANIMATE));
//lex.put("rice", new Word("rice", "class", NounClass.INANIMATE));
//lex.put("coffee", new Word("coffee", "class", NounClass.INANIMATE));
//lex.put("cola", new Word("cola", "class", NounClass.INANIMATE));
//lex.put("juice", new Word("juice", "class", NounClass.INANIMATE));
//lex.put("water", new Word("water", "class", NounClass.INANIMATE));
//
//protoUtt.clear();
//protoUtt.add(lex.get(ev.person.toString()));
//protoUtt.add(lex.get(ev.action.toString()));
//protoUtt.add(lex.get(ev.obj.toString()));
//Utterance anInanSubAgrUtt = new Utterance(protoUtt, 0, 1);
//
//// for the caseless situation
//fW = anInanSubAgrUtt.firstWord;
//sW = anInanSubAgrUtt.secondWord;
//
//// if the first word is a person
//if (fW.word.equalsIgnoreCase("alice") || fW.word.equalsIgnoreCase("bob") ||
//	fW.word.equalsIgnoreCase("eve") || fW.word.equalsIgnoreCase("mallory")
//	|| fW.word.equalsIgnoreCase("trent")) {
//double prob = 0;
//// compute entropy for probability of events, given we know the person who is doing them
//for(Event e:events) {
//	if(e.person.equals(People.valueOf(fW.word.toUpperCase()))) {
//		double p = e.probability;
//		if (p > 0.0) {
//			prob += p*Math.log(p);
//		}
//	}
//}
//
//eta1 = -1*prob;
//
//// if the second word is a verb
//if (sW.word.equalsIgnoreCase("eat") || sW.word.equalsIgnoreCase("drink")) {
//	svoSubjAgrNClassAI.count++;
//	svoSubjAgrNClassAI.eta1.add(eta1);
//
//	prob = 0;
//
//	for(Event e:events) {
//		// compute entropy for probability of events, given we know who is doing what
//		// don't factor noun class into equation because we have the subject and that's more informative
//		if(e.person.equals(People.valueOf(first.toUpperCase())) &&
//				e.action.equals(Actions.valueOf(sW.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//
//	eta2 = -1*prob;
//	svoSubjAgrNClassAI.eta2.add(eta2);
//}
//else {
//	// otherwise the second word is an obj
//	if (sW.word.equalsIgnoreCase("apple") || sW.word.equalsIgnoreCase("bread") ||
//			sW.word.equalsIgnoreCase("cake") || sW.word.equalsIgnoreCase("rice") ||
//			sW.word.equalsIgnoreCase("coffee") || sW.word.equalsIgnoreCase("cola") ||
//			sW.word.equalsIgnoreCase("juice") || sW.word.equalsIgnoreCase("water")) {
//		sovSubjAgrNClassAI.count++;
//		sovSubjAgrNClassAI.eta1.add(eta1);
//
//		prob = 0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(fW.word.toUpperCase())) 
//					&& e.obj.equals(Objects.valueOf(sW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta2 = -1*prob;
//		sovSubjAgrNClassAI.eta2.add(eta2);
//	}
//}
//}
//else {
//// if the first word is a verb
//if (fW.word.equalsIgnoreCase("eat") || fW.word.equalsIgnoreCase("drink")) {
//	double prob = 0;
//	// compute the entropy  for probability of events, given we know what is being done
//	// and the noun class of the subj
//	for(Event e:events) {
//		if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//				&& lex.get(e.person.toString()).inflection.get("class").get(0) == fW.inflection.get("subj").get(0)) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//
//	eta1 = -1*prob;
//
//	// if the second word is a subj
//	if (sW.word.equalsIgnoreCase("alice") || sW.word.equalsIgnoreCase("bob") ||
//			sW.word.equalsIgnoreCase("eve") || sW.word.equalsIgnoreCase("mallory")
//			|| sW.word.equalsIgnoreCase("trent")) {
//		vsoSubjAgrNClassAI.count++;
//		vsoSubjAgrNClassAI.eta1.add(eta1);
//
//		prob = 0;
//		// compute the entropy for probability of events, given we know what is being done
//		// and by who
//		// don't factor noun class into equation because we have the subject and that's more informative
//		for(Event e:events) {
//			if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//					&& e.person.equals(People.valueOf(sW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta2 = -1*prob;
//		vsoSubjAgrNClassAI.eta2.add(eta2);
//	}
//	else {
//		// otherwise, the second word is an obj
//		if (sW.word.equalsIgnoreCase("apple") || sW.word.equalsIgnoreCase("bread") ||
//				sW.word.equalsIgnoreCase("cake") || sW.word.equalsIgnoreCase("rice") ||
//				sW.word.equalsIgnoreCase("coffee") || sW.word.equalsIgnoreCase("cola") ||
//				sW.word.equalsIgnoreCase("juice") || sW.word.equalsIgnoreCase("water")) {
//			vosSubjAgrNClassAI.count++;
//			vosSubjAgrNClassAI.eta1.add(eta1);
//
//			prob = 0;
//			// compute the entropy of probability of events, given we know what is being done
//			// and what is being done to
//			// and the noun class of the subj
//			for(Event e:events) {
//				if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//						&& e.obj.equals(Objects.valueOf(sW.word.toUpperCase()))
//						&& lex.get(e.person.toString()).inflection.get("class").get(0) == fW.inflection.get("subj").get(0)) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//
//			eta2 = -1*prob;
//			vosSubjAgrNClassAI.eta2.add(eta2);
//		}
//	}
//}
//else {
//	// otherwise the first word is an obj
//	if (fW.word.equalsIgnoreCase("apple") || fW.word.equalsIgnoreCase("bread") ||
//			fW.word.equalsIgnoreCase("cake") || fW.word.equalsIgnoreCase("rice") ||
//			fW.word.equalsIgnoreCase("coffee") || fW.word.equalsIgnoreCase("cola") ||
//			fW.word.equalsIgnoreCase("juice") || fW.word.equalsIgnoreCase("water")) {
//		double prob = 0;
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta1 = -1*prob;
//
//		// if the second word is a verb
//		if (sW.word.equalsIgnoreCase("eat") || sW.word.equalsIgnoreCase("drink")) {
//			ovsSubjAgrNClassAI.count++;
//			ovsSubjAgrNClassAI.eta1.add(eta1);
//
//			prob = 0;
//
//			for(Event e:events) {
//				// compute entropy for probability of events, given we know what is being done to
//				// and what is being done
//				// and the noun class of the subj
//				if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase())) 
//						&& e.action.equals(Actions.valueOf(sW.word.toUpperCase()))
//						&& lex.get(e.person.toString()).inflection.get("class").get(0) == sW.inflection.get("subj").get(0)) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//
//			eta2 = -1*prob;
//			ovsSubjAgrNClassAI.eta2.add(eta2);
//		}
//		else {
//			// otherwise the second word is a subj
//			if (sW.word.equalsIgnoreCase("alice") || sW.word.equalsIgnoreCase("bob") ||
//					sW.word.equalsIgnoreCase("eve") || sW.word.equalsIgnoreCase("mallory")
//					|| sW.word.equalsIgnoreCase("trent")) {
//				osvSubjAgrNClassAI.count++;
//				osvSubjAgrNClassAI.eta1.add(eta1);
//
//				prob = 0;
//				// compute the entropy for probability of events, given we know what is being do to
//				// and by who
//				for(Event e:events) {
//					if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase())) 
//							&& e.person.equals(People.valueOf(sW.word.toUpperCase()))) {
//						double p = e.probability;
//						if (p > 0.0) {
//							prob += p*Math.log(p);
//						}
//					}
//				}
//
//				eta2 = -1*prob;
//				osvSubjAgrNClassAI.eta2.add(eta2);
//			}
//		}
//	}
//}	
//}
//
//// TO DO: add object agreements
//
//
//// HUMAN vs NONHUMAN agr
//lex.clear();
//lex.put("alice", new Word("alice", "class", NounClass.HUMAN));
//lex.put("bob", new Word("bob", "class", NounClass.HUMAN));
//lex.put("eve", new Word("eve", "class", NounClass.HUMAN));
//lex.put("mallory", new Word("mallory", "class", NounClass.HUMAN));
//lex.put("trent", new Word("trent", "class", NounClass.HUMAN));
//lex.put("apple", new Word("apple", "class", NounClass.NONHUMAN));
//lex.put("bread", new Word("bread", "class", NounClass.NONHUMAN));
//lex.put("cake", new Word("cake", "class", NounClass.NONHUMAN));
//lex.put("rice", new Word("rice", "class", NounClass.NONHUMAN));
//lex.put("coffee", new Word("coffee", "class", NounClass.NONHUMAN));
//lex.put("cola", new Word("cola", "class", NounClass.NONHUMAN));
//lex.put("juice", new Word("juice", "class", NounClass.NONHUMAN));
//lex.put("water", new Word("water", "class", NounClass.NONHUMAN));
//
//protoUtt.clear();
//protoUtt.add(lex.get(ev.person.toString()));
//protoUtt.add(lex.get(ev.action.toString()));
//protoUtt.add(lex.get(ev.obj.toString()));
//Utterance humNonhumSubAgrUtt = new Utterance(protoUtt, 0, 1);
//		
//// for the caseless situation
//fW = humNonhumSubAgrUtt.firstWord;
//sW = humNonhumSubAgrUtt.secondWord;
//
//// if the first word is a person
//if (fW.word.equalsIgnoreCase("alice") || fW.word.equalsIgnoreCase("bob") ||
//	fW.word.equalsIgnoreCase("eve") || fW.word.equalsIgnoreCase("mallory")
//	|| fW.word.equalsIgnoreCase("trent")) {
//double prob = 0;
//// compute entropy for probability of events, given we know the person who is doing them
//for(Event e:events) {
//	if(e.person.equals(People.valueOf(fW.word.toUpperCase()))) {
//		double p = e.probability;
//		if (p > 0.0) {
//			prob += p*Math.log(p);
//		}
//	}
//}
//
//eta1 = -1*prob;
//
//// if the second word is a verb
//if (sW.word.equalsIgnoreCase("eat") || sW.word.equalsIgnoreCase("drink")) {
//	svoSubjAgrNClassHN.count++;
//	svoSubjAgrNClassHN.eta1.add(eta1);
//
//	prob = 0;
//
//	for(Event e:events) {
//		// compute entropy for probability of events, given we know who is doing what
//		// don't factor noun class into equation because we have the subject and that's more informative
//		if(e.person.equals(People.valueOf(first.toUpperCase())) &&
//				e.action.equals(Actions.valueOf(sW.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//
//	eta2 = -1*prob;
//	svoSubjAgrNClassHN.eta2.add(eta2);
//}
//else {
//	// otherwise the second word is an obj
//	if (sW.word.equalsIgnoreCase("apple") || sW.word.equalsIgnoreCase("bread") ||
//			sW.word.equalsIgnoreCase("cake") || sW.word.equalsIgnoreCase("rice") ||
//			sW.word.equalsIgnoreCase("coffee") || sW.word.equalsIgnoreCase("cola") ||
//			sW.word.equalsIgnoreCase("juice") || sW.word.equalsIgnoreCase("water")) {
//		sovSubjAgrNClassHN.count++;
//		sovSubjAgrNClassHN.eta1.add(eta1);
//
//		prob = 0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(fW.word.toUpperCase())) 
//					&& e.obj.equals(Objects.valueOf(sW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta2 = -1*prob;
//		sovSubjAgrNClassHN.eta2.add(eta2);
//	}
//}
//}
//else {
//// if the first word is a verb
//if (fW.word.equalsIgnoreCase("eat") || fW.word.equalsIgnoreCase("drink")) {
//	double prob = 0;
//	// compute the entropy  for probability of events, given we know what is being done
//	// and the noun class of the subj
//	for(Event e:events) {
//		if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//				&& lex.get(e.person.toString()).inflection.get("class").get(0) == fW.inflection.get("subj").get(0)) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//
//	eta1 = -1*prob;
//
//	// if the second word is a subj
//	if (sW.word.equalsIgnoreCase("alice") || sW.word.equalsIgnoreCase("bob") ||
//			sW.word.equalsIgnoreCase("eve") || sW.word.equalsIgnoreCase("mallory")
//			|| sW.word.equalsIgnoreCase("trent")) {
//		vsoSubjAgrNClassHN.count++;
//		vsoSubjAgrNClassHN.eta1.add(eta1);
//
//		prob = 0;
//		// compute the entropy for probability of events, given we know what is being done
//		// and by who
//		// don't factor noun class into equation because we have the subject and that's more informative
//		for(Event e:events) {
//			if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//					&& e.person.equals(People.valueOf(sW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta2 = -1*prob;
//		vsoSubjAgrNClassHN.eta2.add(eta2);
//	}
//	else {
//		// otherwise, the second word is an obj
//		if (sW.word.equalsIgnoreCase("apple") || sW.word.equalsIgnoreCase("bread") ||
//				sW.word.equalsIgnoreCase("cake") || sW.word.equalsIgnoreCase("rice") ||
//				sW.word.equalsIgnoreCase("coffee") || sW.word.equalsIgnoreCase("cola") ||
//				sW.word.equalsIgnoreCase("juice") || sW.word.equalsIgnoreCase("water")) {
//			vosSubjAgrNClassHN.count++;
//			vosSubjAgrNClassHN.eta1.add(eta1);
//
//			prob = 0;
//			// compute the entropy of probability of events, given we know what is being done
//			// and what is being done to
//			// and the noun class of the subj
//			for(Event e:events) {
//				if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//						&& e.obj.equals(Objects.valueOf(sW.word.toUpperCase()))
//						&& lex.get(e.person.toString()).inflection.get("class").get(0) == fW.inflection.get("subj").get(0)) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//
//			eta2 = -1*prob;
//			vosSubjAgrNClassHN.eta2.add(eta2);
//		}
//	}
//}
//else {
//	// otherwise the first word is an obj
//	if (fW.word.equalsIgnoreCase("apple") || fW.word.equalsIgnoreCase("bread") ||
//			fW.word.equalsIgnoreCase("cake") || fW.word.equalsIgnoreCase("rice") ||
//			fW.word.equalsIgnoreCase("coffee") || fW.word.equalsIgnoreCase("cola") ||
//			fW.word.equalsIgnoreCase("juice") || fW.word.equalsIgnoreCase("water")) {
//		double prob = 0;
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta1 = -1*prob;
//
//		// if the second word is a verb
//		if (sW.word.equalsIgnoreCase("eat") || sW.word.equalsIgnoreCase("drink")) {
//			ovsSubjAgrNClassHN.count++;
//			ovsSubjAgrNClassHN.eta1.add(eta1);
//
//			prob = 0;
//
//			for(Event e:events) {
//				// compute entropy for probability of events, given we know what is being done to
//				// and what is being done
//				// and the noun class of the subj
//				if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase())) 
//						&& e.action.equals(Actions.valueOf(sW.word.toUpperCase()))
//						&& lex.get(e.person.toString()).inflection.get("class").get(0) == sW.inflection.get("subj").get(0)) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//
//			eta2 = -1*prob;
//			ovsSubjAgrNClassHN.eta2.add(eta2);
//		}
//		else {
//			// otherwise the second word is a subj
//			if (sW.word.equalsIgnoreCase("alice") || sW.word.equalsIgnoreCase("bob") ||
//					sW.word.equalsIgnoreCase("eve") || sW.word.equalsIgnoreCase("mallory")
//					|| sW.word.equalsIgnoreCase("trent")) {
//				osvSubjAgrNClassHN.count++;
//				osvSubjAgrNClassHN.eta1.add(eta1);
//
//				prob = 0;
//				// compute the entropy for probability of events, given we know what is being do to
//				// and by who
//				for(Event e:events) {
//					if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase())) 
//							&& e.person.equals(People.valueOf(sW.word.toUpperCase()))) {
//						double p = e.probability;
//						if (p > 0.0) {
//							prob += p*Math.log(p);
//						}
//					}
//				}
//
//				eta2 = -1*prob;
//				osvSubjAgrNClassHN.eta2.add(eta2);
//			}
//		}
//	}
//}	
//}
//
//// TO DO: add object agreements
//
//
//// HUMAN vs ANIMAL vs INANIMATE agr
//lex.remove("apple");
//lex.remove("bread");
//lex.remove("cake");
//lex.remove("rice");
//lex.remove("coffee");
//lex.remove("cola");
//lex.remove("juice");
//lex.remove("water");
//lex.put("apple", new Word("apple", "class", NounClass.INANIMATE));
//lex.put("bread", new Word("bread", "class", NounClass.INANIMATE));
//lex.put("cake", new Word("cake", "class", NounClass.INANIMATE));
//lex.put("rice", new Word("rice", "class", NounClass.INANIMATE));
//lex.put("coffee", new Word("coffee", "class", NounClass.INANIMATE));
//lex.put("cola", new Word("cola", "class", NounClass.INANIMATE));
//lex.put("juice", new Word("juice", "class", NounClass.INANIMATE));
//lex.put("water", new Word("water", "class", NounClass.INANIMATE));
//
//protoUtt.clear();
//protoUtt.add(lex.get(ev.person.toString()));
//protoUtt.add(lex.get(ev.action.toString()));
//protoUtt.add(lex.get(ev.obj.toString()));
//Utterance humAnInanSubAgrUtt = new Utterance(protoUtt, 0, 1);
//		
//// for the caseless situation
//fW = humAnInanSubAgrUtt.firstWord;
//sW = humAnInanSubAgrUtt.secondWord;
//
//// if the first word is a person
//if (fW.word.equalsIgnoreCase("alice") || fW.word.equalsIgnoreCase("bob") ||
//	fW.word.equalsIgnoreCase("eve") || fW.word.equalsIgnoreCase("mallory")
//	|| fW.word.equalsIgnoreCase("trent")) {
//double prob = 0;
//// compute entropy for probability of events, given we know the person who is doing them
//for(Event e:events) {
//	if(e.person.equals(People.valueOf(fW.word.toUpperCase()))) {
//		double p = e.probability;
//		if (p > 0.0) {
//			prob += p*Math.log(p);
//		}
//	}
//}
//
//eta1 = -1*prob;
//
//// if the second word is a verb
//if (sW.word.equalsIgnoreCase("eat") || sW.word.equalsIgnoreCase("drink")) {
//	svoSubjAgrNClassHAI.count++;
//	svoSubjAgrNClassHAI.eta1.add(eta1);
//
//	prob = 0;
//
//	for(Event e:events) {
//		// compute entropy for probability of events, given we know who is doing what
//		// don't factor noun class into equation because we have the subject and that's more informative
//		if(e.person.equals(People.valueOf(first.toUpperCase())) &&
//				e.action.equals(Actions.valueOf(sW.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//
//	eta2 = -1*prob;
//	svoSubjAgrNClassHAI.eta2.add(eta2);
//}
//else {
//	// otherwise the second word is an obj
//	if (sW.word.equalsIgnoreCase("apple") || sW.word.equalsIgnoreCase("bread") ||
//			sW.word.equalsIgnoreCase("cake") || sW.word.equalsIgnoreCase("rice") ||
//			sW.word.equalsIgnoreCase("coffee") || sW.word.equalsIgnoreCase("cola") ||
//			sW.word.equalsIgnoreCase("juice") || sW.word.equalsIgnoreCase("water")) {
//		sovSubjAgrNClassHAI.count++;
//		sovSubjAgrNClassHAI.eta1.add(eta1);
//
//		prob = 0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(fW.word.toUpperCase())) 
//					&& e.obj.equals(Objects.valueOf(sW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta2 = -1*prob;
//		sovSubjAgrNClassHAI.eta2.add(eta2);
//	}
//}
//}
//else {
//// if the first word is a verb
//if (fW.word.equalsIgnoreCase("eat") || fW.word.equalsIgnoreCase("drink")) {
//	double prob = 0;
//	// compute the entropy  for probability of events, given we know what is being done
//	// and the noun class of the subj
//	for(Event e:events) {
//		if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//				&& lex.get(e.person.toString()).inflection.get("class").get(0) == fW.inflection.get("subj").get(0)) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//
//	eta1 = -1*prob;
//
//	// if the second word is a subj
//	if (sW.word.equalsIgnoreCase("alice") || sW.word.equalsIgnoreCase("bob") ||
//			sW.word.equalsIgnoreCase("eve") || sW.word.equalsIgnoreCase("mallory")
//			|| sW.word.equalsIgnoreCase("trent")) {
//		vsoSubjAgrNClassHAI.count++;
//		vsoSubjAgrNClassHAI.eta1.add(eta1);
//
//		prob = 0;
//		// compute the entropy for probability of events, given we know what is being done
//		// and by who
//		// don't factor noun class into equation because we have the subject and that's more informative
//		for(Event e:events) {
//			if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//					&& e.person.equals(People.valueOf(sW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta2 = -1*prob;
//		vsoSubjAgrNClassHAI.eta2.add(eta2);
//	}
//	else {
//		// otherwise, the second word is an obj
//		if (sW.word.equalsIgnoreCase("apple") || sW.word.equalsIgnoreCase("bread") ||
//				sW.word.equalsIgnoreCase("cake") || sW.word.equalsIgnoreCase("rice") ||
//				sW.word.equalsIgnoreCase("coffee") || sW.word.equalsIgnoreCase("cola") ||
//				sW.word.equalsIgnoreCase("juice") || sW.word.equalsIgnoreCase("water")) {
//			vosSubjAgrNClassHAI.count++;
//			vosSubjAgrNClassHAI.eta1.add(eta1);
//
//			prob = 0;
//			// compute the entropy of probability of events, given we know what is being done
//			// and what is being done to
//			// and the noun class of the subj
//			for(Event e:events) {
//				if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//						&& e.obj.equals(Objects.valueOf(sW.word.toUpperCase()))
//						&& lex.get(e.person.toString()).inflection.get("class").get(0) == fW.inflection.get("subj").get(0)) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//
//			eta2 = -1*prob;
//			vosSubjAgrNClassHAI.eta2.add(eta2);
//		}
//	}
//}
//else {
//	// otherwise the first word is an obj
//	if (fW.word.equalsIgnoreCase("apple") || fW.word.equalsIgnoreCase("bread") ||
//			fW.word.equalsIgnoreCase("cake") || fW.word.equalsIgnoreCase("rice") ||
//			fW.word.equalsIgnoreCase("coffee") || fW.word.equalsIgnoreCase("cola") ||
//			fW.word.equalsIgnoreCase("juice") || fW.word.equalsIgnoreCase("water")) {
//		double prob = 0;
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta1 = -1*prob;
//
//		// if the second word is a verb
//		if (sW.word.equalsIgnoreCase("eat") || sW.word.equalsIgnoreCase("drink")) {
//			ovsSubjAgrNClassHAI.count++;
//			ovsSubjAgrNClassHAI.eta1.add(eta1);
//
//			prob = 0;
//
//			for(Event e:events) {
//				// compute entropy for probability of events, given we know what is being done to
//				// and what is being done
//				// and the noun class of the subj
//				if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase())) 
//						&& e.action.equals(Actions.valueOf(sW.word.toUpperCase()))
//						&& lex.get(e.person.toString()).inflection.get("class").get(0) == sW.inflection.get("subj").get(0)) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//
//			eta2 = -1*prob;
//			ovsSubjAgrNClassHAI.eta2.add(eta2);
//		}
//		else {
//			// otherwise the second word is a subj
//			if (sW.word.equalsIgnoreCase("alice") || sW.word.equalsIgnoreCase("bob") ||
//					sW.word.equalsIgnoreCase("eve") || sW.word.equalsIgnoreCase("mallory")
//					|| sW.word.equalsIgnoreCase("trent")) {
//				osvSubjAgrNClassHAI.count++;
//				osvSubjAgrNClassHAI.eta1.add(eta1);
//
//				prob = 0;
//				// compute the entropy for probability of events, given we know what is being do to
//				// and by who
//				for(Event e:events) {
//					if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase())) 
//							&& e.person.equals(People.valueOf(sW.word.toUpperCase()))) {
//						double p = e.probability;
//						if (p > 0.0) {
//							prob += p*Math.log(p);
//						}
//					}
//				}
//
//				eta2 = -1*prob;
//				osvSubjAgrNClassHAI.eta2.add(eta2);
//			}
//		}
//	}
//}	
//}
//
//// TO DO: add object agreements
//
//
//// MALE vs NONMALE agr
//lex.clear();
//lex.put("alice", new Word("alice", "class", NounClass.NONMALE));
//lex.put("bob", new Word("bob", "class", NounClass.MALE));
//lex.put("eve", new Word("eve", "class", NounClass.NONMALE));
//lex.put("mallory", new Word("mallory", "class", NounClass.NONMALE));
//lex.put("trent", new Word("trent", "class", NounClass.MALE));
//lex.put("apple", new Word("apple", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
//lex.put("bread", new Word("bread", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
//lex.put("cake", new Word("cake", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
//lex.put("rice", new Word("rice", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
//lex.put("coffee", new Word("coffee", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
//lex.put("cola", new Word("cola", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
//lex.put("juice", new Word("juice", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
//lex.put("water", new Word("water", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
//
//protoUtt.clear();
//protoUtt.add(lex.get(ev.person.toString()));
//protoUtt.add(lex.get(ev.action.toString()));
//protoUtt.add(lex.get(ev.obj.toString()));
//Utterance maleNonMaleSubAgrUtt = new Utterance(protoUtt, 0, 1);
//		
//// for the caseless situation
//fW = maleNonMaleSubAgrUtt.firstWord;
//sW = maleNonMaleSubAgrUtt.secondWord;
//
//// if the first word is a person
//if (fW.word.equalsIgnoreCase("alice") || fW.word.equalsIgnoreCase("bob") ||
//	fW.word.equalsIgnoreCase("eve") || fW.word.equalsIgnoreCase("mallory")
//	|| fW.word.equalsIgnoreCase("trent")) {
//double prob = 0;
//// compute entropy for probability of events, given we know the person who is doing them
//for(Event e:events) {
//	if(e.person.equals(People.valueOf(fW.word.toUpperCase()))) {
//		double p = e.probability;
//		if (p > 0.0) {
//			prob += p*Math.log(p);
//		}
//	}
//}
//
//eta1 = -1*prob;
//
//// if the second word is a verb
//if (sW.word.equalsIgnoreCase("eat") || sW.word.equalsIgnoreCase("drink")) {
//	svoSubjAgrNClassHAI.count++;
//	svoSubjAgrNClassHAI.eta1.add(eta1);
//
//	prob = 0;
//
//	for(Event e:events) {
//		// compute entropy for probability of events, given we know who is doing what
//		// don't factor noun class into equation because we have the subject and that's more informative
//		if(e.person.equals(People.valueOf(first.toUpperCase())) &&
//				e.action.equals(Actions.valueOf(sW.word.toUpperCase()))) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//
//	eta2 = -1*prob;
//	svoSubjAgrNClassHAI.eta2.add(eta2);
//}
//else {
//	// otherwise the second word is an obj
//	if (sW.word.equalsIgnoreCase("apple") || sW.word.equalsIgnoreCase("bread") ||
//			sW.word.equalsIgnoreCase("cake") || sW.word.equalsIgnoreCase("rice") ||
//			sW.word.equalsIgnoreCase("coffee") || sW.word.equalsIgnoreCase("cola") ||
//			sW.word.equalsIgnoreCase("juice") || sW.word.equalsIgnoreCase("water")) {
//		sovSubjAgrNClassHAI.count++;
//		sovSubjAgrNClassHAI.eta1.add(eta1);
//
//		prob = 0;
//		// compute the entropy of probability of events, given we know who is doing
//		// and what is being done to
//		for(Event e:events) {
//			if(e.person.equals(People.valueOf(fW.word.toUpperCase())) 
//					&& e.obj.equals(Objects.valueOf(sW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta2 = -1*prob;
//		sovSubjAgrNClassHAI.eta2.add(eta2);
//	}
//}
//}
//else {
//// if the first word is a verb
//if (fW.word.equalsIgnoreCase("eat") || fW.word.equalsIgnoreCase("drink")) {
//	double prob = 0;
//	// compute the entropy  for probability of events, given we know what is being done
//	// and the noun class of the subj
//	for(Event e:events) {
//		if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//				&& lex.get(e.person.toString()).inflection.get("class").get(0) == fW.inflection.get("subj").get(0)) {
//			double p = e.probability;
//			if (p > 0.0) {
//				prob += p*Math.log(p);
//			}
//		}
//	}
//
//	eta1 = -1*prob;
//
//	// if the second word is a subj
//	if (sW.word.equalsIgnoreCase("alice") || sW.word.equalsIgnoreCase("bob") ||
//			sW.word.equalsIgnoreCase("eve") || sW.word.equalsIgnoreCase("mallory")
//			|| sW.word.equalsIgnoreCase("trent")) {
//		vsoSubjAgrNClassHAI.count++;
//		vsoSubjAgrNClassHAI.eta1.add(eta1);
//
//		prob = 0;
//		// compute the entropy for probability of events, given we know what is being done
//		// and by who
//		// don't factor noun class into equation because we have the subject and that's more informative
//		for(Event e:events) {
//			if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//					&& e.person.equals(People.valueOf(sW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta2 = -1*prob;
//		vsoSubjAgrNClassHAI.eta2.add(eta2);
//	}
//	else {
//		// otherwise, the second word is an obj
//		if (sW.word.equalsIgnoreCase("apple") || sW.word.equalsIgnoreCase("bread") ||
//				sW.word.equalsIgnoreCase("cake") || sW.word.equalsIgnoreCase("rice") ||
//				sW.word.equalsIgnoreCase("coffee") || sW.word.equalsIgnoreCase("cola") ||
//				sW.word.equalsIgnoreCase("juice") || sW.word.equalsIgnoreCase("water")) {
//			vosSubjAgrNClassHAI.count++;
//			vosSubjAgrNClassHAI.eta1.add(eta1);
//
//			prob = 0;
//			// compute the entropy of probability of events, given we know what is being done
//			// and what is being done to
//			// and the noun class of the subj
//			for(Event e:events) {
//				if(e.action.equals(Actions.valueOf(fW.word.toUpperCase())) 
//						&& e.obj.equals(Objects.valueOf(sW.word.toUpperCase()))
//						&& lex.get(e.person.toString()).inflection.get("class").get(0) == fW.inflection.get("subj").get(0)) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//
//			eta2 = -1*prob;
//			vosSubjAgrNClassHAI.eta2.add(eta2);
//		}
//	}
//}
//else {
//	// otherwise the first word is an obj
//	if (fW.word.equalsIgnoreCase("apple") || fW.word.equalsIgnoreCase("bread") ||
//			fW.word.equalsIgnoreCase("cake") || fW.word.equalsIgnoreCase("rice") ||
//			fW.word.equalsIgnoreCase("coffee") || fW.word.equalsIgnoreCase("cola") ||
//			fW.word.equalsIgnoreCase("juice") || fW.word.equalsIgnoreCase("water")) {
//		double prob = 0;
//		// compute the entropy for probability of events, given we know what is being done to
//		for(Event e:events) {
//			if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase()))) {
//				double p = e.probability;
//				if (p > 0.0) {
//					prob += p*Math.log(p);
//				}
//			}
//		}
//
//		eta1 = -1*prob;
//
//		// if the second word is a verb
//		if (sW.word.equalsIgnoreCase("eat") || sW.word.equalsIgnoreCase("drink")) {
//			ovsSubjAgrNClassHAI.count++;
//			ovsSubjAgrNClassHAI.eta1.add(eta1);
//
//			prob = 0;
//
//			for(Event e:events) {
//				// compute entropy for probability of events, given we know what is being done to
//				// and what is being done
//				// and the noun class of the subj
//				if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase())) 
//						&& e.action.equals(Actions.valueOf(sW.word.toUpperCase()))
//						&& lex.get(e.person.toString()).inflection.get("class").get(0) == sW.inflection.get("subj").get(0)) {
//					double p = e.probability;
//					if (p > 0.0) {
//						prob += p*Math.log(p);
//					}
//				}
//			}
//
//			eta2 = -1*prob;
//			ovsSubjAgrNClassHAI.eta2.add(eta2);
//		}
//		else {
//			// otherwise the second word is a subj
//			if (sW.word.equalsIgnoreCase("alice") || sW.word.equalsIgnoreCase("bob") ||
//					sW.word.equalsIgnoreCase("eve") || sW.word.equalsIgnoreCase("mallory")
//					|| sW.word.equalsIgnoreCase("trent")) {
//				osvSubjAgrNClassHAI.count++;
//				osvSubjAgrNClassHAI.eta1.add(eta1);
//
//				prob = 0;
//				// compute the entropy for probability of events, given we know what is being do to
//				// and by who
//				for(Event e:events) {
//					if(e.obj.equals(Objects.valueOf(fW.word.toUpperCase())) 
//							&& e.person.equals(People.valueOf(sW.word.toUpperCase()))) {
//						double p = e.probability;
//						if (p > 0.0) {
//							prob += p*Math.log(p);
//						}
//					}
//				}
//
//				eta2 = -1*prob;
//				osvSubjAgrNClassHAI.eta2.add(eta2);
//			}
//		}
//	}
//}	
//}
//
//// TO DO: add object agreements
//
//
//// MALEHUM vs NONMALEHUM agr
//lex.clear();
//lex.put("alice", new Word("alice", "class", NounClass.NONMALEHUMAN));
//lex.put("bob", new Word("bob", "class", NounClass.MALEHUMAN));
//lex.put("eve", new Word("eve", "class", NounClass.NONMALEHUMAN));
//lex.put("mallory", new Word("mallory", "class", NounClass.NONMALEHUMAN));
//lex.put("trent", new Word("trent", "class", NounClass.MALEHUMAN));
//lex.put("apple", new Word("apple", "class", NounClass.NONMALEHUMAN));
//lex.put("bread", new Word("bread", "class", NounClass.NONMALEHUMAN));
//lex.put("cake", new Word("cake", "class", NounClass.NONMALEHUMAN));
//lex.put("rice", new Word("rice", "class", NounClass.NONMALEHUMAN));
//lex.put("coffee", new Word("coffee", "class", NounClass.NONMALEHUMAN));
//lex.put("cola", new Word("cola", "class", NounClass.NONMALEHUMAN));
//lex.put("juice", new Word("juice", "class", NounClass.NONMALEHUMAN));
//lex.put("water", new Word("water", "class", NounClass.NONMALEHUMAN));
//
//// COMMON vs NEUTER agr
//lex.clear();
//lex.put("alice", new Word("alice", "class", NounClass.COMMON));
//lex.put("bob", new Word("bob", "class", NounClass.COMMON));
//lex.put("eve", new Word("eve", "class", NounClass.COMMON));
//lex.put("mallory", new Word("mallory", "class", NounClass.COMMON));
//lex.put("trent", new Word("trent", "class", NounClass.COMMON));
//lex.put("apple", new Word("apple", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.COMMON, NounClass.NEUTER})));
//lex.put("bread", new Word("bread", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.COMMON, NounClass.NEUTER})));
//lex.put("cake", new Word("cake", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.COMMON, NounClass.NEUTER})));
//lex.put("rice", new Word("rice", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.COMMON, NounClass.NEUTER})));
//lex.put("coffee", new Word("coffee", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.COMMON, NounClass.NEUTER})));
//lex.put("cola", new Word("cola", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.COMMON, NounClass.NEUTER})));
//lex.put("juice", new Word("juice", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.COMMON, NounClass.NEUTER})));
//lex.put("water", new Word("water", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.COMMON, NounClass.NEUTER})));
//}
}
