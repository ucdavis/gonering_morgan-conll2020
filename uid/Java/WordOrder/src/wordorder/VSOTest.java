package wordorder;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;

public class VSOTest extends Test {
	public Stats vso = new Stats();
	
	public Stats vsoNomOnly = new Stats();
	public Stats vsoAccOnly = new Stats();
	public Stats vsoNomAcc = new Stats();
	public Stats vsoErgOnly = new Stats();
	public Stats vsoAbsOnly = new Stats();
	public Stats vsoErgAbs = new Stats();
	
	public Stats vsoSAgr123 = new Stats();
//	public Stats vsoSAgrWe = new Stats();
	
	public Stats vsoOAgr123 = new Stats();
//	public Stats vsoOAgrWe = new Stats();
	
	public Stats vsoSOAgr123 = new Stats();
//	public Stats vsoSOAgrWe = new Stats();
	
	public Stats vsoSAgrSP = new Stats();
	public Stats vsoOAgrSP = new Stats();
	public Stats vsoSOAgrSP = new Stats();
	
	public Stats vsoSAgr123_SP = new Stats();
	public Stats vsoSAgr123_SP_Nom = new Stats();
	public Stats vsoSAgr123_SP_Acc = new Stats();
	public Stats vsoSAgr123_SP_NomAcc = new Stats();
	public Stats vsoSAgr123_SP_Erg = new Stats();
	public Stats vsoSAgr123_SP_Abs = new Stats();
	public Stats vsoSAgr123_SP_ErgAbs = new Stats();
	
	public Stats vsoOAgr123_SP = new Stats();
	public Stats vsoOAgr123_SP_Nom = new Stats();
	public Stats vsoOAgr123_SP_Acc = new Stats();
	public Stats vsoOAgr123_SP_NomAcc = new Stats();
	public Stats vsoOAgr123_SP_Erg = new Stats();
	public Stats vsoOAgr123_SP_Abs = new Stats();
	public Stats vsoOAgr123_SP_ErgAbs = new Stats();
	
	public Stats vsoSOAgr123_SP = new Stats();
	public Stats vsoSOAgr123_SP_Nom = new Stats();
	public Stats vsoSOAgr123_SP_Acc = new Stats();
	public Stats vsoSOAgr123_SP_NomAcc = new Stats();
	public Stats vsoSOAgr123_SP_Erg = new Stats();
	public Stats vsoSOAgr123_SP_Abs = new Stats();
	public Stats vsoSOAgr123_SP_ErgAbs = new Stats();
		
	public Stats vsoSAgrMF = new Stats();
	public Stats vsoSAgrMF_Nom = new Stats();
	public Stats vsoSAgrMF_Acc = new Stats();
	public Stats vsoSAgrMF_NomAcc = new Stats();
	public Stats vsoSAgrMF_Erg = new Stats();
	public Stats vsoSAgrMF_Abs = new Stats();
	public Stats vsoSAgrMF_ErgAbs = new Stats();
	
	public Stats vsoSAgrMFN = new Stats();
	public Stats vsoSAgrMFN_Nom = new Stats();
	public Stats vsoSAgrMFN_Acc = new Stats();
	public Stats vsoSAgrMFN_NomAcc = new Stats();
	public Stats vsoSAgrMFN_Erg = new Stats();
	public Stats vsoSAgrMFN_Abs = new Stats();
	public Stats vsoSAgrMFN_ErgAbs = new Stats();
	
	public Stats vsoSAgrCN = new Stats();
	public Stats vsoSAgrCN_Nom = new Stats();
	public Stats vsoSAgrCN_Acc = new Stats();
	public Stats vsoSAgrCN_NomAcc = new Stats();
	public Stats vsoSAgrCN_Erg = new Stats();
	public Stats vsoSAgrCN_Abs = new Stats();
	public Stats vsoSAgrCN_ErgAbs = new Stats();
	
	public Stats vsoSAgrAI = new Stats();
	public Stats vsoSAgrAI_Nom = new Stats();
	public Stats vsoSAgrAI_Acc = new Stats();
	public Stats vsoSAgrAI_NomAcc = new Stats();
	public Stats vsoSAgrAI_Erg = new Stats();
	public Stats vsoSAgrAI_Abs = new Stats();
	public Stats vsoSAgrAI_ErgAbs = new Stats();
	
	public Stats vsoSAgrHN = new Stats();
	public Stats vsoSAgrHN_Nom = new Stats();
	public Stats vsoSAgrHN_Acc = new Stats();
	public Stats vsoSAgrHN_NomAcc = new Stats();
	public Stats vsoSAgrHN_Erg = new Stats();
	public Stats vsoSAgrHN_Abs = new Stats();
	public Stats vsoSAgrHN_ErgAbs = new Stats();
	
	public Stats vsoSAgrHAI = new Stats();
	public Stats vsoSAgrHAI_Nom = new Stats();
	public Stats vsoSAgrHAI_Acc = new Stats();
	public Stats vsoSAgrHAI_NomAcc = new Stats();
	public Stats vsoSAgrHAI_Erg = new Stats();
	public Stats vsoSAgrHAI_Abs = new Stats();
	public Stats vsoSAgrHAI_ErgAbs = new Stats();
	
	public Stats vsoSAgrMNM = new Stats();
	public Stats vsoSAgrMNM_Nom = new Stats();
	public Stats vsoSAgrMNM_Acc = new Stats();
	public Stats vsoSAgrMNM_NomAcc = new Stats();
	public Stats vsoSAgrMNM_Erg = new Stats();
	public Stats vsoSAgrMNM_Abs = new Stats();
	public Stats vsoSAgrMNM_ErgAbs = new Stats();
	
	public Stats vsoOAgrMF = new Stats();
	public Stats vsoOAgrMF_Nom = new Stats();
	public Stats vsoOAgrMF_Acc = new Stats();
	public Stats vsoOAgrMF_NomAcc = new Stats();
	public Stats vsoOAgrMF_Erg = new Stats();
	public Stats vsoOAgrMF_Abs = new Stats();
	public Stats vsoOAgrMF_ErgAbs = new Stats();
	
	public Stats vsoOAgrMFN = new Stats();
	public Stats vsoOAgrMFN_Nom = new Stats();
	public Stats vsoOAgrMFN_Acc = new Stats();
	public Stats vsoOAgrMFN_NomAcc = new Stats();
	public Stats vsoOAgrMFN_Erg = new Stats();
	public Stats vsoOAgrMFN_Abs = new Stats();
	public Stats vsoOAgrMFN_ErgAbs = new Stats();
	
	public Stats vsoOAgrCN = new Stats();
	public Stats vsoOAgrCN_Nom = new Stats();
	public Stats vsoOAgrCN_Acc = new Stats();
	public Stats vsoOAgrCN_NomAcc = new Stats();
	public Stats vsoOAgrCN_Erg = new Stats();
	public Stats vsoOAgrCN_Abs = new Stats();
	public Stats vsoOAgrCN_ErgAbs = new Stats();
	
	public Stats vsoOAgrAI = new Stats();
	public Stats vsoOAgrAI_Nom = new Stats();
	public Stats vsoOAgrAI_Acc = new Stats();
	public Stats vsoOAgrAI_NomAcc = new Stats();
	public Stats vsoOAgrAI_Erg = new Stats();
	public Stats vsoOAgrAI_Abs = new Stats();
	public Stats vsoOAgrAI_ErgAbs = new Stats();
	
	public Stats vsoOAgrHN = new Stats();
	public Stats vsoOAgrHN_Nom = new Stats();
	public Stats vsoOAgrHN_Acc = new Stats();
	public Stats vsoOAgrHN_NomAcc = new Stats();
	public Stats vsoOAgrHN_Erg = new Stats();
	public Stats vsoOAgrHN_Abs = new Stats();
	public Stats vsoOAgrHN_ErgAbs = new Stats();
	
	public Stats vsoOAgrHAI = new Stats();
	public Stats vsoOAgrHAI_Nom = new Stats();
	public Stats vsoOAgrHAI_Acc = new Stats();
	public Stats vsoOAgrHAI_NomAcc = new Stats();
	public Stats vsoOAgrHAI_Erg = new Stats();
	public Stats vsoOAgrHAI_Abs = new Stats();
	public Stats vsoOAgrHAI_ErgAbs = new Stats();
	
	public Stats vsoOAgrMNM = new Stats();
	public Stats vsoOAgrMNM_Nom = new Stats();
	public Stats vsoOAgrMNM_Acc = new Stats();
	public Stats vsoOAgrMNM_NomAcc = new Stats();
	public Stats vsoOAgrMNM_Erg = new Stats();
	public Stats vsoOAgrMNM_Abs = new Stats();
	public Stats vsoOAgrMNM_ErgAbs = new Stats();
		
	public Stats vsoSOAgrMF = new Stats();
	public Stats vsoSOAgrMF_Nom = new Stats();
	public Stats vsoSOAgrMF_Acc = new Stats();
	public Stats vsoSOAgrMF_NomAcc = new Stats();
	public Stats vsoSOAgrMF_Erg = new Stats();
	public Stats vsoSOAgrMF_Abs = new Stats();
	public Stats vsoSOAgrMF_ErgAbs = new Stats();
	
	public Stats vsoSOAgrMFN = new Stats();
	public Stats vsoSOAgrMFN_Nom = new Stats();
	public Stats vsoSOAgrMFN_Acc = new Stats();
	public Stats vsoSOAgrMFN_NomAcc = new Stats();
	public Stats vsoSOAgrMFN_Erg = new Stats();
	public Stats vsoSOAgrMFN_Abs = new Stats();
	public Stats vsoSOAgrMFN_ErgAbs = new Stats();
	
	public Stats vsoSOAgrCN = new Stats();
	public Stats vsoSOAgrCN_Nom = new Stats();
	public Stats vsoSOAgrCN_Acc = new Stats();
	public Stats vsoSOAgrCN_NomAcc = new Stats();
	public Stats vsoSOAgrCN_Erg = new Stats();
	public Stats vsoSOAgrCN_Abs = new Stats();
	public Stats vsoSOAgrCN_ErgAbs = new Stats();
	
	public Stats vsoSOAgrAI = new Stats();
	public Stats vsoSOAgrAI_Nom = new Stats();
	public Stats vsoSOAgrAI_Acc = new Stats();
	public Stats vsoSOAgrAI_NomAcc = new Stats();
	public Stats vsoSOAgrAI_Erg = new Stats();
	public Stats vsoSOAgrAI_Abs = new Stats();
	public Stats vsoSOAgrAI_ErgAbs = new Stats();
	
	public Stats vsoSOAgrHN = new Stats();
	public Stats vsoSOAgrHN_Nom = new Stats();
	public Stats vsoSOAgrHN_Acc = new Stats();
	public Stats vsoSOAgrHN_NomAcc = new Stats();
	public Stats vsoSOAgrHN_Erg = new Stats();
	public Stats vsoSOAgrHN_Abs = new Stats();
	public Stats vsoSOAgrHN_ErgAbs = new Stats();
	
	public Stats vsoSOAgrHAI = new Stats();
	public Stats vsoSOAgrHAI_Nom = new Stats();
	public Stats vsoSOAgrHAI_Acc = new Stats();
	public Stats vsoSOAgrHAI_NomAcc = new Stats();
	public Stats vsoSOAgrHAI_Erg = new Stats();
	public Stats vsoSOAgrHAI_Abs = new Stats();
	public Stats vsoSOAgrHAI_ErgAbs = new Stats();
	
	public Stats vsoSOAgrMNM = new Stats();
	public Stats vsoSOAgrMNM_Nom = new Stats();
	public Stats vsoSOAgrMNM_Acc = new Stats();
	public Stats vsoSOAgrMNM_NomAcc = new Stats();
	public Stats vsoSOAgrMNM_Erg = new Stats();
	public Stats vsoSOAgrMNM_Abs = new Stats();
	public Stats vsoSOAgrMNM_ErgAbs = new Stats();
	
	public Stats vsoSAgr123_SP_MF = new Stats();
	public Stats vsoSAgr123_SP_MF_Nom = new Stats();
	public Stats vsoSAgr123_SP_MF_Acc = new Stats();
	public Stats vsoSAgr123_SP_MF_NomAcc = new Stats();
	public Stats vsoSAgr123_SP_MF_Erg = new Stats();
	public Stats vsoSAgr123_SP_MF_Abs = new Stats();
	public Stats vsoSAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats vsoSAgr123_SP_MFN = new Stats();
	public Stats vsoSAgr123_SP_MFN_Nom = new Stats();
	public Stats vsoSAgr123_SP_MFN_Acc = new Stats();
	public Stats vsoSAgr123_SP_MFN_NomAcc = new Stats();
	public Stats vsoSAgr123_SP_MFN_Erg = new Stats();
	public Stats vsoSAgr123_SP_MFN_Abs = new Stats();
	public Stats vsoSAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats vsoSAgr123_SP_CN = new Stats();
	public Stats vsoSAgr123_SP_CN_Nom = new Stats();
	public Stats vsoSAgr123_SP_CN_Acc = new Stats();
	public Stats vsoSAgr123_SP_CN_NomAcc = new Stats();
	public Stats vsoSAgr123_SP_CN_Erg = new Stats();
	public Stats vsoSAgr123_SP_CN_Abs = new Stats();
	public Stats vsoSAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats vsoSAgr123_SP_AI = new Stats();
	public Stats vsoSAgr123_SP_AI_Nom = new Stats();
	public Stats vsoSAgr123_SP_AI_Acc = new Stats();
	public Stats vsoSAgr123_SP_AI_NomAcc = new Stats();
	public Stats vsoSAgr123_SP_AI_Erg = new Stats();
	public Stats vsoSAgr123_SP_AI_Abs = new Stats();
	public Stats vsoSAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats vsoSAgr123_SP_HN = new Stats();
	public Stats vsoSAgr123_SP_HN_Nom = new Stats();
	public Stats vsoSAgr123_SP_HN_Acc = new Stats();
	public Stats vsoSAgr123_SP_HN_NomAcc = new Stats();
	public Stats vsoSAgr123_SP_HN_Erg = new Stats();
	public Stats vsoSAgr123_SP_HN_Abs = new Stats();
	public Stats vsoSAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats vsoSAgr123_SP_HAI = new Stats();
	public Stats vsoSAgr123_SP_HAI_Nom = new Stats();
	public Stats vsoSAgr123_SP_HAI_Acc = new Stats();
	public Stats vsoSAgr123_SP_HAI_NomAcc = new Stats();
	public Stats vsoSAgr123_SP_HAI_Erg = new Stats();
	public Stats vsoSAgr123_SP_HAI_Abs = new Stats();
	public Stats vsoSAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats vsoSAgr123_SP_MNM = new Stats();
	public Stats vsoSAgr123_SP_MNM_Nom = new Stats();
	public Stats vsoSAgr123_SP_MNM_Acc = new Stats();
	public Stats vsoSAgr123_SP_MNM_NomAcc = new Stats();
	public Stats vsoSAgr123_SP_MNM_Erg = new Stats();
	public Stats vsoSAgr123_SP_MNM_Abs = new Stats();
	public Stats vsoSAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats vsoOAgr123_SP_MF = new Stats();
	public Stats vsoOAgr123_SP_MF_Nom = new Stats();
	public Stats vsoOAgr123_SP_MF_Acc = new Stats();
	public Stats vsoOAgr123_SP_MF_NomAcc = new Stats();
	public Stats vsoOAgr123_SP_MF_Erg = new Stats();
	public Stats vsoOAgr123_SP_MF_Abs = new Stats();
	public Stats vsoOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats vsoOAgr123_SP_MFN = new Stats();
	public Stats vsoOAgr123_SP_MFN_Nom = new Stats();
	public Stats vsoOAgr123_SP_MFN_Acc = new Stats();
	public Stats vsoOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats vsoOAgr123_SP_MFN_Erg = new Stats();
	public Stats vsoOAgr123_SP_MFN_Abs = new Stats();
	public Stats vsoOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats vsoOAgr123_SP_CN = new Stats();
	public Stats vsoOAgr123_SP_CN_Nom = new Stats();
	public Stats vsoOAgr123_SP_CN_Acc = new Stats();
	public Stats vsoOAgr123_SP_CN_NomAcc = new Stats();
	public Stats vsoOAgr123_SP_CN_Erg = new Stats();
	public Stats vsoOAgr123_SP_CN_Abs = new Stats();
	public Stats vsoOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats vsoOAgr123_SP_AI = new Stats();
	public Stats vsoOAgr123_SP_AI_Nom = new Stats();
	public Stats vsoOAgr123_SP_AI_Acc = new Stats();
	public Stats vsoOAgr123_SP_AI_NomAcc = new Stats();
	public Stats vsoOAgr123_SP_AI_Erg = new Stats();
	public Stats vsoOAgr123_SP_AI_Abs = new Stats();
	public Stats vsoOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats vsoOAgr123_SP_HN = new Stats();
	public Stats vsoOAgr123_SP_HN_Nom = new Stats();
	public Stats vsoOAgr123_SP_HN_Acc = new Stats();
	public Stats vsoOAgr123_SP_HN_NomAcc = new Stats();
	public Stats vsoOAgr123_SP_HN_Erg = new Stats();
	public Stats vsoOAgr123_SP_HN_Abs = new Stats();
	public Stats vsoOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats vsoOAgr123_SP_HAI = new Stats();
	public Stats vsoOAgr123_SP_HAI_Nom = new Stats();
	public Stats vsoOAgr123_SP_HAI_Acc = new Stats();
	public Stats vsoOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats vsoOAgr123_SP_HAI_Erg = new Stats();
	public Stats vsoOAgr123_SP_HAI_Abs = new Stats();
	public Stats vsoOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats vsoOAgr123_SP_MNM = new Stats();
	public Stats vsoOAgr123_SP_MNM_Nom = new Stats();
	public Stats vsoOAgr123_SP_MNM_Acc = new Stats();
	public Stats vsoOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats vsoOAgr123_SP_MNM_Erg = new Stats();
	public Stats vsoOAgr123_SP_MNM_Abs = new Stats();
	public Stats vsoOAgr123_SP_MNM_ErgAbs = new Stats();
		
	public Stats vsoSOAgr123_SP_MF = new Stats();
	public Stats vsoSOAgr123_SP_MF_Nom = new Stats();
	public Stats vsoSOAgr123_SP_MF_Acc = new Stats();
	public Stats vsoSOAgr123_SP_MF_NomAcc = new Stats();
	public Stats vsoSOAgr123_SP_MF_Erg = new Stats();
	public Stats vsoSOAgr123_SP_MF_Abs = new Stats();
	public Stats vsoSOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats vsoSOAgr123_SP_MFN = new Stats();
	public Stats vsoSOAgr123_SP_MFN_Nom = new Stats();
	public Stats vsoSOAgr123_SP_MFN_Acc = new Stats();
	public Stats vsoSOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats vsoSOAgr123_SP_MFN_Erg = new Stats();
	public Stats vsoSOAgr123_SP_MFN_Abs = new Stats();
	public Stats vsoSOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats vsoSOAgr123_SP_CN = new Stats();
	public Stats vsoSOAgr123_SP_CN_Nom = new Stats();
	public Stats vsoSOAgr123_SP_CN_Acc = new Stats();
	public Stats vsoSOAgr123_SP_CN_NomAcc = new Stats();
	public Stats vsoSOAgr123_SP_CN_Erg = new Stats();
	public Stats vsoSOAgr123_SP_CN_Abs = new Stats();
	public Stats vsoSOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats vsoSOAgr123_SP_AI = new Stats();
	public Stats vsoSOAgr123_SP_AI_Nom = new Stats();
	public Stats vsoSOAgr123_SP_AI_Acc = new Stats();
	public Stats vsoSOAgr123_SP_AI_NomAcc = new Stats();
	public Stats vsoSOAgr123_SP_AI_Erg = new Stats();
	public Stats vsoSOAgr123_SP_AI_Abs = new Stats();
	public Stats vsoSOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats vsoSOAgr123_SP_HN = new Stats();
	public Stats vsoSOAgr123_SP_HN_Nom = new Stats();
	public Stats vsoSOAgr123_SP_HN_Acc = new Stats();
	public Stats vsoSOAgr123_SP_HN_NomAcc = new Stats();
	public Stats vsoSOAgr123_SP_HN_Erg = new Stats();
	public Stats vsoSOAgr123_SP_HN_Abs = new Stats();
	public Stats vsoSOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats vsoSOAgr123_SP_HAI = new Stats();
	public Stats vsoSOAgr123_SP_HAI_Nom = new Stats();
	public Stats vsoSOAgr123_SP_HAI_Acc = new Stats();
	public Stats vsoSOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats vsoSOAgr123_SP_HAI_Erg = new Stats();
	public Stats vsoSOAgr123_SP_HAI_Abs = new Stats();
	public Stats vsoSOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats vsoSOAgr123_SP_MNM = new Stats();
	public Stats vsoSOAgr123_SP_MNM_Nom = new Stats();
	public Stats vsoSOAgr123_SP_MNM_Acc = new Stats();
	public Stats vsoSOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats vsoSOAgr123_SP_MNM_Erg = new Stats();
	public Stats vsoSOAgr123_SP_MNM_Abs = new Stats();
	public Stats vsoSOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public VSOTest() {
		all = new Stats[]{vso, /*vsoNomOnly, vsoAccOnly, vsoNomAcc, vsoErgOnly, vsoAbsOnly, vsoErgAbs,
				vsoSAgr123, /*vsoSAgr123, vsoOAgr123, /*vsoOAgrWe, vsoSOAgr123, /*vsoSOAgrWe,
				vsoSAgrSP, vsoOAgrSP, vsoSOAgrSP,
				vsoSAgr123_SP, vsoSAgr123_SP_Nom, vsoSAgr123_SP_Acc, vsoSAgr123_SP_NomAcc, vsoSAgr123_SP_Erg, vsoSAgr123_SP_Abs, vsoSAgr123_SP_ErgAbs,
				vsoOAgr123_SP, vsoOAgr123_SP_Nom, vsoOAgr123_SP_Acc, vsoOAgr123_SP_NomAcc, vsoOAgr123_SP_Erg, vsoOAgr123_SP_Abs, vsoOAgr123_SP_ErgAbs, 
				vsoSOAgr123_SP, vsoSOAgr123_SP_Nom, vsoSOAgr123_SP_Acc, vsoSOAgr123_SP_NomAcc, vsoSOAgr123_SP_Erg, vsoSOAgr123_SP_Abs, vsoSOAgr123_SP_ErgAbs,
				vsoSAgrMF, vsoSAgrMF_Nom, vsoSAgrMF_Acc, vsoSAgrMF_NomAcc, vsoSAgrMF_Erg, vsoSAgrMF_Abs, vsoSAgrMF_ErgAbs,
				vsoSAgrMFN, vsoSAgrMFN_Nom, vsoSAgrMFN_Acc, vsoSAgrMFN_NomAcc, vsoSAgrMFN_Erg, vsoSAgrMFN_Abs, vsoSAgrMFN_ErgAbs,
				vsoSAgrCN, vsoSAgrCN_Nom, vsoSAgrCN_Acc, vsoSAgrCN_NomAcc, vsoSAgrCN_Erg, vsoSAgrCN_Abs, vsoSAgrCN_ErgAbs,
				vsoSAgrAI, vsoSAgrAI_Nom, vsoSAgrAI_Acc, vsoSAgrAI_NomAcc, vsoSAgrAI_Erg, vsoSAgrAI_Abs, vsoSAgrAI_ErgAbs,
				vsoSAgrHN, vsoSAgrHN_Nom, vsoSAgrHN_Acc, vsoSAgrHN_NomAcc, vsoSAgrHN_Erg, vsoSAgrHN_Abs, vsoSAgrHN_ErgAbs,
				vsoSAgrHAI, vsoSAgrHAI_Nom, vsoSAgrHAI_Acc, vsoSAgrHAI_NomAcc, vsoSAgrHAI_Erg, vsoSAgrHAI_Abs, vsoSAgrHAI_ErgAbs, 
				vsoSAgrMNM, vsoSAgrMNM_Nom, vsoSAgrMNM_Acc, vsoSAgrMNM_NomAcc, vsoSAgrMNM_Erg, vsoSAgrMNM_Abs, vsoSAgrMNM_ErgAbs,
				vsoOAgrMF, vsoOAgrMF_Nom, vsoOAgrMF_Acc, vsoOAgrMF_NomAcc, vsoOAgrMF_Erg, vsoOAgrMF_Abs, vsoOAgrMF_ErgAbs,
				vsoOAgrMFN, vsoOAgrMFN_Nom, vsoOAgrMFN_Acc, vsoOAgrMFN_NomAcc, vsoOAgrMFN_Erg, vsoOAgrMFN_Abs, vsoOAgrMFN_ErgAbs,
				vsoOAgrCN, vsoOAgrCN_Nom, vsoOAgrCN_Acc, vsoOAgrCN_NomAcc, vsoOAgrCN_Erg, vsoOAgrCN_Abs, vsoOAgrCN_ErgAbs, 
				vsoOAgrAI, vsoOAgrAI_Nom, vsoOAgrAI_Acc, vsoOAgrAI_NomAcc, vsoOAgrAI_Erg, vsoOAgrAI_Abs, vsoOAgrAI_ErgAbs,
				vsoOAgrHN, vsoOAgrHN_Nom, vsoOAgrHN_Acc, vsoOAgrHN_NomAcc, vsoOAgrHN_Erg, vsoOAgrHN_Abs, vsoOAgrHN_ErgAbs,
				vsoOAgrHAI, vsoOAgrHAI_Nom, vsoOAgrHAI_Acc, vsoOAgrHAI_NomAcc, vsoOAgrHAI_Erg, vsoOAgrHAI_Abs, vsoOAgrHAI_ErgAbs,
				vsoOAgrMNM, vsoOAgrMNM_Nom, vsoOAgrMNM_Acc, vsoOAgrMNM_NomAcc, vsoOAgrMNM_Erg, vsoOAgrMNM_Abs, vsoOAgrMNM_ErgAbs,
				vsoSOAgrMF, vsoSOAgrMF_Nom, vsoSOAgrMF_Acc, vsoSOAgrMF_NomAcc, vsoSOAgrMF_Erg, vsoSOAgrMF_Abs, vsoSOAgrMF_ErgAbs,
				vsoSOAgrMFN, vsoSOAgrMFN_Nom, vsoSOAgrMFN_Acc, vsoSOAgrMFN_NomAcc, vsoSOAgrMFN_Erg, vsoSOAgrMFN_Abs, vsoSOAgrMFN_ErgAbs,
				vsoSOAgrCN, vsoSOAgrCN_Nom, vsoSOAgrCN_Acc, vsoSOAgrCN_NomAcc, vsoSOAgrCN_Erg, vsoSOAgrCN_Abs, vsoSOAgrCN_ErgAbs,
				vsoSOAgrAI, vsoSOAgrAI_Nom, vsoSOAgrAI_Acc, vsoSOAgrAI_NomAcc, vsoSOAgrAI_Erg, vsoSOAgrAI_Abs, vsoSOAgrAI_ErgAbs,
				vsoSOAgrHN, vsoSOAgrHN_Nom, vsoSOAgrHN_Acc, vsoSOAgrHN_NomAcc, vsoSOAgrHN_Erg, vsoSOAgrHN_Abs, vsoSOAgrHN_ErgAbs,
				vsoSOAgrHAI, vsoSOAgrHAI_Nom, vsoSOAgrHAI_Acc, vsoSOAgrHAI_NomAcc, vsoSOAgrHAI_Erg, vsoSOAgrHAI_Abs, vsoSOAgrHAI_ErgAbs,
				vsoSOAgrMNM, vsoSOAgrMNM_Nom, vsoSOAgrMNM_Acc, vsoSOAgrMNM_NomAcc, vsoSOAgrMNM_Erg, vsoSOAgrMNM_Abs, vsoSOAgrMNM_ErgAbs,
				vsoSAgr123_SP_MF, vsoSAgr123_SP_MF_Nom, vsoSAgr123_SP_MF_Acc, vsoSAgr123_SP_MF_NomAcc, vsoSAgr123_SP_MF_Erg, vsoSAgr123_SP_MF_Abs, vsoSAgr123_SP_MF_ErgAbs,
				vsoSAgr123_SP_MFN, vsoSAgr123_SP_MFN_Nom, vsoSAgr123_SP_MFN_Acc, vsoSAgr123_SP_MFN_NomAcc, vsoSAgr123_SP_MFN_Erg, vsoSAgr123_SP_MFN_Abs, vsoSAgr123_SP_MFN_ErgAbs,
				vsoSAgr123_SP_CN, vsoSAgr123_SP_CN_Nom, vsoSAgr123_SP_CN_Acc, vsoSAgr123_SP_CN_NomAcc, vsoSAgr123_SP_CN_Erg, vsoSAgr123_SP_CN_Abs, vsoSAgr123_SP_CN_ErgAbs,
				vsoSAgr123_SP_AI, vsoSAgr123_SP_AI_Nom, vsoSAgr123_SP_AI_Acc, vsoSAgr123_SP_AI_NomAcc, vsoSAgr123_SP_AI_Erg, vsoSAgr123_SP_AI_Abs, vsoSAgr123_SP_AI_ErgAbs,
				vsoSAgr123_SP_HN, vsoSAgr123_SP_HN_Nom, vsoSAgr123_SP_HN_Acc, vsoSAgr123_SP_HN_NomAcc, vsoSAgr123_SP_HN_Erg, vsoSAgr123_SP_HN_Abs, vsoSAgr123_SP_HN_ErgAbs,
				vsoSAgr123_SP_HAI, vsoSAgr123_SP_HAI_Nom, vsoSAgr123_SP_HAI_Acc, vsoSAgr123_SP_HAI_NomAcc, vsoSAgr123_SP_HAI_Erg, vsoSAgr123_SP_HAI_Abs, vsoSAgr123_SP_HAI_ErgAbs, 
				vsoSAgr123_SP_MNM, vsoSAgr123_SP_MNM_Nom, vsoSAgr123_SP_MNM_Acc, vsoSAgr123_SP_MNM_NomAcc, vsoSAgr123_SP_MNM_Erg, vsoSAgr123_SP_MNM_Abs, vsoSAgr123_SP_MNM_ErgAbs,
				vsoOAgr123_SP_MF, vsoOAgr123_SP_MF_Nom, vsoOAgr123_SP_MF_Acc, vsoOAgr123_SP_MF_NomAcc, vsoOAgr123_SP_MF_Erg, vsoOAgr123_SP_MF_Abs, vsoOAgr123_SP_MF_ErgAbs,
				vsoOAgr123_SP_MFN, vsoOAgr123_SP_MFN_Nom, vsoOAgr123_SP_MFN_Acc, vsoOAgr123_SP_MFN_NomAcc, vsoOAgr123_SP_MFN_Erg, vsoOAgr123_SP_MFN_Abs, vsoOAgr123_SP_MFN_ErgAbs,
				vsoOAgr123_SP_CN, vsoOAgr123_SP_CN_Nom, vsoOAgr123_SP_CN_Acc, vsoOAgr123_SP_CN_NomAcc, vsoOAgr123_SP_CN_Erg, vsoOAgr123_SP_CN_Abs, vsoOAgr123_SP_CN_ErgAbs, 
				vsoOAgr123_SP_AI, vsoOAgr123_SP_AI_Nom, vsoOAgr123_SP_AI_Acc, vsoOAgr123_SP_AI_NomAcc, vsoOAgr123_SP_AI_Erg, vsoOAgr123_SP_AI_Abs, vsoOAgr123_SP_AI_ErgAbs,
				vsoOAgr123_SP_HN, vsoOAgr123_SP_HN_Nom, vsoOAgr123_SP_HN_Acc, vsoOAgr123_SP_HN_NomAcc, vsoOAgr123_SP_HN_Erg, vsoOAgr123_SP_HN_Abs, vsoOAgr123_SP_HN_ErgAbs,
				vsoOAgr123_SP_HAI, vsoOAgr123_SP_HAI_Nom, vsoOAgr123_SP_HAI_Acc, vsoOAgr123_SP_HAI_NomAcc, vsoOAgr123_SP_HAI_Erg, vsoOAgr123_SP_HAI_Abs, vsoOAgr123_SP_HAI_ErgAbs,
				vsoOAgr123_SP_MNM, vsoOAgr123_SP_MNM_Nom, vsoOAgr123_SP_MNM_Acc, vsoOAgr123_SP_MNM_NomAcc, vsoOAgr123_SP_MNM_Erg, vsoOAgr123_SP_MNM_Abs, vsoOAgr123_SP_MNM_ErgAbs,
				vsoSOAgr123_SP_MF, vsoSOAgr123_SP_MF_Nom, vsoSOAgr123_SP_MF_Acc, vsoSOAgr123_SP_MF_NomAcc, vsoSOAgr123_SP_MF_Erg, vsoSOAgr123_SP_MF_Abs, vsoSOAgr123_SP_MF_ErgAbs,
				vsoSOAgr123_SP_MFN, vsoSOAgr123_SP_MFN_Nom, vsoSOAgr123_SP_MFN_Acc, vsoSOAgr123_SP_MFN_NomAcc, vsoSOAgr123_SP_MFN_Erg, vsoSOAgr123_SP_MFN_Abs, vsoSOAgr123_SP_MFN_ErgAbs,
				vsoSOAgr123_SP_CN, vsoSOAgr123_SP_CN_Nom, vsoSOAgr123_SP_CN_Acc, vsoSOAgr123_SP_CN_NomAcc, vsoSOAgr123_SP_CN_Erg, vsoSOAgr123_SP_CN_Abs, vsoSOAgr123_SP_CN_ErgAbs,
				vsoSOAgr123_SP_AI, vsoSOAgr123_SP_AI_Nom, vsoSOAgr123_SP_AI_Acc, vsoSOAgr123_SP_AI_NomAcc, vsoSOAgr123_SP_AI_Erg, vsoSOAgr123_SP_AI_Abs, vsoSOAgr123_SP_AI_ErgAbs,
				vsoSOAgr123_SP_HN, vsoSOAgr123_SP_HN_Nom, vsoSOAgr123_SP_HN_Acc, vsoSOAgr123_SP_HN_NomAcc, vsoSOAgr123_SP_HN_Erg, vsoSOAgr123_SP_HN_Abs, vsoSOAgr123_SP_HN_ErgAbs,
				vsoSOAgr123_SP_HAI, vsoSOAgr123_SP_HAI_Nom, vsoSOAgr123_SP_HAI_Acc, vsoSOAgr123_SP_HAI_NomAcc, vsoSOAgr123_SP_HAI_Erg, vsoSOAgr123_SP_HAI_Abs, vsoSOAgr123_SP_HAI_ErgAbs,
				vsoSOAgr123_SP_MNM, vsoSOAgr123_SP_MNM_Nom, vsoSOAgr123_SP_MNM_Acc, vsoSOAgr123_SP_MNM_NomAcc, vsoSOAgr123_SP_MNM_Erg, vsoSOAgr123_SP_MNM_Abs, vsoSOAgr123_SP_MNM_ErgAbs*/};
	}
	
	protected void entropy_SurprisalCalc(ArrayList<Event> events, Event ev, HashMap<String, HashMap<String, Word>> lexicons) {
		for(int i = 0; i < all.length; i++) {
			all[i].count++;
			ArrayList<Double> probs = new ArrayList<>();
			BigDecimal pVerb = new BigDecimal(0.0);
			
			// compute the entropy  for probability of events, given we know what is being done
			for(Event e:events) {
				if(e.verb.equalsIgnoreCase(first.get(conditionCode[i]).word) &&
						e.probability > 0.0) {
					switch(i) {
						case 7:
							// verb agrees w/ subj in 1st/2nd/3rd person
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(0)) {
								probs.add(e.probability);
								pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 8:
							// verb agrees w/ obj in 1st/2nd/3rd person
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(0)) {
								probs.add(e.probability);
								pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 9:
							// verb agrees w/ subj&obj in 1st/2nd/3rd person
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(0)) {
								probs.add(e.probability);
								pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 10:
							// verb agrees w/ subj in sing/pl
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(0)) {
								probs.add(e.probability);
								pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 11:
							// verb agrees w/ obj in sing/pl
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(0)) {
								probs.add(e.probability);
								pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 12:
							// verb agrees w/ subj&obj in sing/pl
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(0)) {
								probs.add(e.probability);
								pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 13: case 14: case 15: case 16: case 17: case 18: case 19:
							// verb agrees w/ subj in 1st/2nd/3rd person & sing/pl
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(1)) {
								probs.add(e.probability);
								pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 20: case 21: case 22: case 23: case 24: case 25: case 26:
							// verb agrees w/ obj in 1st/2nd/3rd person & sing/pl
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(1)) {
								probs.add(e.probability);
								pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 27: case 28: case 29: case 30: case 31: case 32: case 33:
							// verb agrees w/ subj & obj in 1st/2nd/3rd person & sing/pl
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(1) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(1)) {
								probs.add(e.probability);
								pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 34: case 35: case 36: case 37: case 38: case 39: case 40:
						case 41: case 42: case 43: case 44: case 45: case 46: case 47:
						case 48: case 49: case 50: case 51: case 52: case 53: case 54:
						case 55: case 56: case 57: case 58: case 59: case 60: case 61:
						case 62: case 63: case 64: case 65: case 66: case 67: case 68:
						case 69: case 70: case 71: case 72: case 73: case 74: case 75:
						case 76: case 77: case 78: case 79: case 80: case 81: case 82:
							// verb agrees w/ subj in noun class
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("class").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(0)) {
								probs.add(e.probability);
								pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 83: case 84: case 85: case 86: case 87: case 88: case 89:
						case 90: case 91: case 92: case 93: case 94: case 95: case 96:
						case 97: case 98: case 99: case 100: case 101: case 102: case 103:
						case 104: case 105: case 106: case 107: case 108: case 109: case 110:
						case 111: case 112: case 113: case 114: case 115: case 116: case 117:
						case 118: case 119: case 120: case 121: case 122: case 123: case 124:
						case 125: case 126: case 127: case 128: case 129: case 130: case 131:
							// verb agrees w/ obj in noun class
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("class").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(0)) {
								probs.add(e.probability);
								pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 132: case 133: case 134: case 135: case 136: case 137: case 138:
						case 139: case 140: case 141: case 142: case 143: case 144: case 145:
						case 146: case 147: case 148: case 149: case 150: case 151: case 152:
						case 153: case 154: case 155: case 156: case 157: case 158: case 159:
						case 160: case 161: case 162: case 163: case 164: case 165: case 166:
						case 167: case 168: case 169: case 170: case 171: case 172: case 173:
						case 174: case 175: case 176: case 177: case 178: case 179: case 180:
							// verb agrees w/ subj & obj in noun class
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("class").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(0) &&
										lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("class").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(0)) {
								probs.add(e.probability);
								pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 181: case 182: case 183: case 184: case 185: case 186: case 187:
						case 188: case 189: case 190: case 191: case 192: case 193: case 194:
						case 195: case 196: case 197: case 198: case 199: case 200: case 201:
						case 202: case 203: case 204: case 205: case 206: case 207: case 208:
						case 209: case 210: case 211: case 212: case 213: case 214: case 215:
						case 216: case 217: case 218: case 219: case 220: case 221: case 222:
						case 223: case 224: case 225: case 226: case 227: case 228: case 229:
							// verb agrees w/ subj in 1st/2nd/3rd per & sing/pl & noun class
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(1) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("class").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(2)) {
								probs.add(e.probability);
								pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 230: case 231: case 232: case 233: case 234: case 235: case 236:
						case 237: case 238: case 239: case 240: case 241: case 242: case 243:
						case 244: case 245: case 246: case 247: case 248: case 249: case 250:
						case 251: case 252: case 253: case 254: case 255: case 256: case 257:
						case 258: case 259: case 260: case 261: case 262: case 263: case 264:
						case 265: case 266: case 267: case 268: case 269: case 270: case 271:
						case 272: case 273: case 274: case 275: case 276: case 277: case 278:
							// verb agrees w/ obj in 1st/2nd/3rd per & sing/pl & noun class
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(1) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("class").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(2)) {
								probs.add(e.probability);
								pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 279: case 280: case 281: case 282: case 283: case 284: case 285:
						case 286: case 287: case 288: case 289: case 290: case 291: case 292:
						case 293: case 294: case 295: case 296: case 297: case 298: case 299:
						case 300: case 301: case 302: case 303: case 304: case 305: case 306:
						case 307: case 308: case 309: case 310: case 311: case 312: case 313:
						case 314: case 315: case 316: case 317: case 318: case 319: case 320:
						case 321: case 322: case 323: case 324: case 325: case 326: case 327:
							// verb agrees w/ subj & obj in 1st/2nd/3rd per & sing/pl & noun class
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(1) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("class").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(2) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(1) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("class").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(2)) {
								probs.add(e.probability);
								pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						default:
							probs.add(e.probability);
							pVerb = pVerb.add(BigDecimal.valueOf(e.probability));
							break;
					}
				}
			}
			
			eta1 = calcEntropy(probs, pVerb);
			
			all[i].eta1.add(eta1);
			all[i].surprisal1.add(calcSurprisal(probs));
			all[i].eventProbs.add(ev.probability);
			
			double surprisalNorm = 0;
			for(int j = 0; j < probs.size(); j++) {
				surprisalNorm += probs.get(j);
			}
			
			probs = new ArrayList<>();
			BigDecimal pVerbSubj = new BigDecimal(0.0);
			
			for(Event e:events) {
				if(e.verb.equalsIgnoreCase(first.get(conditionCode[i]).word) &&
						e.arg1.equalsIgnoreCase(second.get(conditionCode[i]).word) &&
					// find all events that involve the verb
						e.probability > 0.0) {
					switch(i) {
						case 8: case 9:
							// verb agrees with the obj (case 8) and the subj&obj (case 9) in 1st/2nd/3rd person
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(0)) {
									// how many possible events could involve both the verb and the subj?
								probs.add(e.probability);
								pVerbSubj = pVerbSubj.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 11: case 12:
							// verb agrees with the obj (case 11) and the subj&obj (case 12) in sing/pl
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(0)) {
									// how many possible events could involve both the verb and the subj?
								probs.add(e.probability);
								pVerbSubj = pVerbSubj.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 20: case 21: case 22: case 23: case 24: case 25: case 26:
						case 27: case 28: case 29: case 30: case 31: case 32: case 33:
							// verb agrees with the obj (cases 20-26) and the subj&obj (cases 27-33) in 1st/2nd/3rd person & sing/pl
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(1)) {
									// how many possible events could involve both the verb and the subj?
								probs.add(e.probability);
								pVerbSubj = pVerbSubj.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 83: case 84: case 85: case 86: case 87: case 88: case 89:
						case 90: case 91: case 92: case 93: case 94: case 95: case 96:
						case 97: case 98: case 99: case 100: case 101: case 102: case 103:
						case 104: case 105: case 106: case 107: case 108: case 109: case 110:
						case 111: case 112: case 113: case 114: case 115: case 116: case 117:
						case 118: case 119: case 120: case 121: case 122: case 123: case 124:
						case 125: case 126: case 127: case 128: case 129: case 130: case 131:
						case 132: case 133: case 134: case 135: case 136: case 137: case 138:
						case 139: case 140: case 141: case 142: case 143: case 144: case 145:
						case 146: case 147: case 148: case 149: case 150: case 151: case 152:
						case 153: case 154: case 155: case 156: case 157: case 158: case 159:
						case 160: case 161: case 162: case 163: case 164: case 165: case 166:
						case 167: case 168: case 169: case 170: case 171: case 172: case 173:
						case 174: case 175: case 176: case 177: case 178: case 179: case 180:
							// verb agrees with the obj (cases 83-131) and the subj&obj (cases 132-180) in noun class
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("class").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(0)) {
									// how many possible events could involve both the verb and the subj?
								probs.add(e.probability);
								pVerbSubj = pVerbSubj.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 230: case 231: case 232: case 233: case 234: case 235: case 236:
						case 237: case 238: case 239: case 240: case 241: case 242: case 243:
						case 244: case 245: case 246: case 247: case 248: case 249: case 250:
						case 251: case 252: case 253: case 254: case 255: case 256: case 257:
						case 258: case 259: case 260: case 261: case 262: case 263: case 264:
						case 265: case 266: case 267: case 268: case 269: case 270: case 271:
						case 272: case 273: case 274: case 275: case 276: case 277: case 278:
						case 279: case 280: case 281: case 282: case 283: case 284: case 285:
						case 286: case 287: case 288: case 289: case 290: case 291: case 292:
						case 293: case 294: case 295: case 296: case 297: case 298: case 299:
						case 300: case 301: case 302: case 303: case 304: case 305: case 306:
						case 307: case 308: case 309: case 310: case 311: case 312: case 313:
						case 314: case 315: case 316: case 317: case 318: case 319: case 320:
						case 321: case 322: case 323: case 324: case 325: case 326: case 327:
							// verb agrees w/ obj (cases 230-278) and the subj&obj (cases 279-327) in 1st/2nd/3rd per & sing/pl & noun class
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(1) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("class").get(0) == first.get(conditionCode[i]).inflection.get("obj").get(2)) {
									// how many possible events could involve both the verb and the subj?
								probs.add(e.probability);
								pVerbSubj = pVerbSubj.add(BigDecimal.valueOf(e.probability));
							}
							break;
						default:
								// how many possible events could involve both the verb and the subj?
							probs.add(e.probability);
							pVerbSubj = pVerbSubj.add(BigDecimal.valueOf(e.probability));
							break;
					}
				}
			}
			
			eta2 = calcEntropy(probs, pVerbSubj);
			all[i].eta2.add(eta2);

			ArrayList<Double> normedProbs = new ArrayList<>();
			for(int j = 0; j < probs.size(); j++) {
				normedProbs.add(probs.get(j)/surprisalNorm);
			}
			all[i].surprisal2.add(calcSurprisal(normedProbs));
			
			surprisalNorm = 0;
			for(int j = 0; j < probs.size(); j++) {
				surprisalNorm += probs.get(j);
			}
			
			probs = new ArrayList<>();
			for(Event e:events) {
				if(e.verb.equalsIgnoreCase(first.get(conditionCode[i]).word) &&
						e.arg1.equalsIgnoreCase(second.get(conditionCode[i]).word) &&
						e.arg2.equalsIgnoreCase(third.get(conditionCode[i]).word) &&
						e.probability > 0.0) {
					probs.add(e.probability);
				}
			}
			normedProbs = new ArrayList<>();
			for(int j = 0; j < probs.size(); j++) {
				normedProbs.add(probs.get(j)/surprisalNorm);
			}
			all[i].surprisal3.add(calcSurprisal(normedProbs));
		}
	}
	
	protected void mutualInfoCalc(ArrayList<Event> events) {
//		# MI: log[p(x,y)/p(x)p(y)]
//		# for sv=vs: log[p(o1, r)/p(o1)p(r)]
//		# for vo=ov: log[p(r, o2)/p(r)p(o2)]
//		# for so=os: log[p(o1, o2)/p(o1)p(o2)]
//
//		# p(o1, r) = p(alice, eat) = p(alice, eat, bread) + p(alice, eat, rice) + p(alice, eat, apple) + p(alice, eat, cake)
//		# p(o1) = p(alice, eat, bread) + p(alice, drink, coffee) + etc
//		# p(r) = p(alice, eat, bread) + p(bob, eat, cake) + etc
		BigDecimal pVS = new BigDecimal(0);
		BigDecimal pSO = new BigDecimal(0);
		BigDecimal pS = new BigDecimal(0);
		BigDecimal pV = new BigDecimal(0);
		BigDecimal pO = new BigDecimal(0);
		
		for(Event e:events) {
			if(e.arg1.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pS = pS.add(BigDecimal.valueOf(e.probability));
			}
			if(e.verb.equalsIgnoreCase(first.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pV = pV.add(BigDecimal.valueOf(e.probability));
			}
			if(e.arg2.equalsIgnoreCase(third.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pO = pO.add(BigDecimal.valueOf(e.probability));
			}
			if(e.verb.equalsIgnoreCase(first.get(conditionCode[0]).word) &&
					e.arg1.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pVS = pVS.add(BigDecimal.valueOf(e.probability));
			}
			if(e.arg1.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.arg2.equalsIgnoreCase(third.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pSO = pSO.add(BigDecimal.valueOf(e.probability));
			}
		}
		
		vso.mi.add(calcMI(pVS, pV, pS).add(calcMI(pSO, pS, pO)));
	}
}
