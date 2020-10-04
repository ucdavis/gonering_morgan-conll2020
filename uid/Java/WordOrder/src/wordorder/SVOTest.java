package wordorder;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;

public class SVOTest extends Test {
	public Stats svo = new Stats();
	
	public Stats svoNomOnly = new Stats();
	public Stats svoAccOnly = new Stats();
	public Stats svoNomAcc = new Stats();
	public Stats svoErgOnly = new Stats();
	public Stats svoAbsOnly = new Stats();
	public Stats svoErgAbs = new Stats();
	
	public Stats svoSAgr123 = new Stats();
//	public Stats svoSAgrWe = new Stats();
	
	public Stats svoOAgr123 = new Stats();
//	public Stats svoOAgrWe = new Stats();
	
	public Stats svoSOAgr123 = new Stats();
//	public Stats svoSOAgrWe = new Stats();
	
	public Stats svoSAgrSP = new Stats();
	public Stats svoOAgrSP = new Stats();
	public Stats svoSOAgrSP = new Stats();
	
	public Stats svoSAgr123_SP = new Stats();
	public Stats svoSAgr123_SP_Nom = new Stats();
	public Stats svoSAgr123_SP_Acc = new Stats();
	public Stats svoSAgr123_SP_NomAcc = new Stats();
	public Stats svoSAgr123_SP_Erg = new Stats();
	public Stats svoSAgr123_SP_Abs = new Stats();
	public Stats svoSAgr123_SP_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP = new Stats();
	public Stats svoOAgr123_SP_Nom = new Stats();
	public Stats svoOAgr123_SP_Acc = new Stats();
	public Stats svoOAgr123_SP_NomAcc = new Stats();
	public Stats svoOAgr123_SP_Erg = new Stats();
	public Stats svoOAgr123_SP_Abs = new Stats();
	public Stats svoOAgr123_SP_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP = new Stats();
	public Stats svoSOAgr123_SP_Nom = new Stats();
	public Stats svoSOAgr123_SP_Acc = new Stats();
	public Stats svoSOAgr123_SP_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_Erg = new Stats();
	public Stats svoSOAgr123_SP_Abs = new Stats();
	public Stats svoSOAgr123_SP_ErgAbs = new Stats();
	
	public Stats svoSAgrMF = new Stats();
	public Stats svoSAgrMF_Nom = new Stats();
	public Stats svoSAgrMF_Acc = new Stats();
	public Stats svoSAgrMF_NomAcc = new Stats();
	public Stats svoSAgrMF_Erg = new Stats();
	public Stats svoSAgrMF_Abs = new Stats();
	public Stats svoSAgrMF_ErgAbs = new Stats();
	
	public Stats svoSAgrMFN = new Stats();
	public Stats svoSAgrMFN_Nom = new Stats();
	public Stats svoSAgrMFN_Acc = new Stats();
	public Stats svoSAgrMFN_NomAcc = new Stats();
	public Stats svoSAgrMFN_Erg = new Stats();
	public Stats svoSAgrMFN_Abs = new Stats();
	public Stats svoSAgrMFN_ErgAbs = new Stats();
	
	public Stats svoSAgrCN = new Stats();
	public Stats svoSAgrCN_Nom = new Stats();
	public Stats svoSAgrCN_Acc = new Stats();
	public Stats svoSAgrCN_NomAcc = new Stats();
	public Stats svoSAgrCN_Erg = new Stats();
	public Stats svoSAgrCN_Abs = new Stats();
	public Stats svoSAgrCN_ErgAbs = new Stats();
	
	public Stats svoSAgrAI = new Stats();
	public Stats svoSAgrAI_Nom = new Stats();
	public Stats svoSAgrAI_Acc = new Stats();
	public Stats svoSAgrAI_NomAcc = new Stats();
	public Stats svoSAgrAI_Erg = new Stats();
	public Stats svoSAgrAI_Abs = new Stats();
	public Stats svoSAgrAI_ErgAbs = new Stats();
	
	public Stats svoSAgrHN = new Stats();
	public Stats svoSAgrHN_Nom = new Stats();
	public Stats svoSAgrHN_Acc = new Stats();
	public Stats svoSAgrHN_NomAcc = new Stats();
	public Stats svoSAgrHN_Erg = new Stats();
	public Stats svoSAgrHN_Abs = new Stats();
	public Stats svoSAgrHN_ErgAbs = new Stats();
	
	public Stats svoSAgrHAI = new Stats();
	public Stats svoSAgrHAI_Nom = new Stats();
	public Stats svoSAgrHAI_Acc = new Stats();
	public Stats svoSAgrHAI_NomAcc = new Stats();
	public Stats svoSAgrHAI_Erg = new Stats();
	public Stats svoSAgrHAI_Abs = new Stats();
	public Stats svoSAgrHAI_ErgAbs = new Stats();
	
	public Stats svoSAgrMNM = new Stats();
	public Stats svoSAgrMNM_Nom = new Stats();
	public Stats svoSAgrMNM_Acc = new Stats();
	public Stats svoSAgrMNM_NomAcc = new Stats();
	public Stats svoSAgrMNM_Erg = new Stats();
	public Stats svoSAgrMNM_Abs = new Stats();
	public Stats svoSAgrMNM_ErgAbs = new Stats();
	
	public Stats svoOAgrMF = new Stats();
	public Stats svoOAgrMF_Nom = new Stats();
	public Stats svoOAgrMF_Acc = new Stats();
	public Stats svoOAgrMF_NomAcc = new Stats();
	public Stats svoOAgrMF_Erg = new Stats();
	public Stats svoOAgrMF_Abs = new Stats();
	public Stats svoOAgrMF_ErgAbs = new Stats();
	
	public Stats svoOAgrMFN = new Stats();
	public Stats svoOAgrMFN_Nom = new Stats();
	public Stats svoOAgrMFN_Acc = new Stats();
	public Stats svoOAgrMFN_NomAcc = new Stats();
	public Stats svoOAgrMFN_Erg = new Stats();
	public Stats svoOAgrMFN_Abs = new Stats();
	public Stats svoOAgrMFN_ErgAbs = new Stats();
	
	public Stats svoOAgrCN = new Stats();
	public Stats svoOAgrCN_Nom = new Stats();
	public Stats svoOAgrCN_Acc = new Stats();
	public Stats svoOAgrCN_NomAcc = new Stats();
	public Stats svoOAgrCN_Erg = new Stats();
	public Stats svoOAgrCN_Abs = new Stats();
	public Stats svoOAgrCN_ErgAbs = new Stats();
	
	public Stats svoOAgrAI = new Stats();
	public Stats svoOAgrAI_Nom = new Stats();
	public Stats svoOAgrAI_Acc = new Stats();
	public Stats svoOAgrAI_NomAcc = new Stats();
	public Stats svoOAgrAI_Erg = new Stats();
	public Stats svoOAgrAI_Abs = new Stats();
	public Stats svoOAgrAI_ErgAbs = new Stats();
	
	public Stats svoOAgrHN = new Stats();
	public Stats svoOAgrHN_Nom = new Stats();
	public Stats svoOAgrHN_Acc = new Stats();
	public Stats svoOAgrHN_NomAcc = new Stats();
	public Stats svoOAgrHN_Erg = new Stats();
	public Stats svoOAgrHN_Abs = new Stats();
	public Stats svoOAgrHN_ErgAbs = new Stats();
	
	public Stats svoOAgrHAI = new Stats();
	public Stats svoOAgrHAI_Nom = new Stats();
	public Stats svoOAgrHAI_Acc = new Stats();
	public Stats svoOAgrHAI_NomAcc = new Stats();
	public Stats svoOAgrHAI_Erg = new Stats();
	public Stats svoOAgrHAI_Abs = new Stats();
	public Stats svoOAgrHAI_ErgAbs = new Stats();
	
	public Stats svoOAgrMNM = new Stats();
	public Stats svoOAgrMNM_Nom = new Stats();
	public Stats svoOAgrMNM_Acc = new Stats();
	public Stats svoOAgrMNM_NomAcc = new Stats();
	public Stats svoOAgrMNM_Erg = new Stats();
	public Stats svoOAgrMNM_Abs = new Stats();
	public Stats svoOAgrMNM_ErgAbs = new Stats();
	
	public Stats svoSOAgrMF = new Stats();
	public Stats svoSOAgrMF_Nom = new Stats();
	public Stats svoSOAgrMF_Acc = new Stats();
	public Stats svoSOAgrMF_NomAcc = new Stats();
	public Stats svoSOAgrMF_Erg = new Stats();
	public Stats svoSOAgrMF_Abs = new Stats();
	public Stats svoSOAgrMF_ErgAbs = new Stats();
	
	public Stats svoSOAgrMFN = new Stats();
	public Stats svoSOAgrMFN_Nom = new Stats();
	public Stats svoSOAgrMFN_Acc = new Stats();
	public Stats svoSOAgrMFN_NomAcc = new Stats();
	public Stats svoSOAgrMFN_Erg = new Stats();
	public Stats svoSOAgrMFN_Abs = new Stats();
	public Stats svoSOAgrMFN_ErgAbs = new Stats();
	
	public Stats svoSOAgrCN = new Stats();
	public Stats svoSOAgrCN_Nom = new Stats();
	public Stats svoSOAgrCN_Acc = new Stats();
	public Stats svoSOAgrCN_NomAcc = new Stats();
	public Stats svoSOAgrCN_Erg = new Stats();
	public Stats svoSOAgrCN_Abs = new Stats();
	public Stats svoSOAgrCN_ErgAbs = new Stats();
	
	public Stats svoSOAgrAI = new Stats();
	public Stats svoSOAgrAI_Nom = new Stats();
	public Stats svoSOAgrAI_Acc = new Stats();
	public Stats svoSOAgrAI_NomAcc = new Stats();
	public Stats svoSOAgrAI_Erg = new Stats();
	public Stats svoSOAgrAI_Abs = new Stats();
	public Stats svoSOAgrAI_ErgAbs = new Stats();
	
	public Stats svoSOAgrHN = new Stats();
	public Stats svoSOAgrHN_Nom = new Stats();
	public Stats svoSOAgrHN_Acc = new Stats();
	public Stats svoSOAgrHN_NomAcc = new Stats();
	public Stats svoSOAgrHN_Erg = new Stats();
	public Stats svoSOAgrHN_Abs = new Stats();
	public Stats svoSOAgrHN_ErgAbs = new Stats();
	
	public Stats svoSOAgrHAI = new Stats();
	public Stats svoSOAgrHAI_Nom = new Stats();
	public Stats svoSOAgrHAI_Acc = new Stats();
	public Stats svoSOAgrHAI_NomAcc = new Stats();
	public Stats svoSOAgrHAI_Erg = new Stats();
	public Stats svoSOAgrHAI_Abs = new Stats();
	public Stats svoSOAgrHAI_ErgAbs = new Stats();
	
	public Stats svoSOAgrMNM = new Stats();
	public Stats svoSOAgrMNM_Nom = new Stats();
	public Stats svoSOAgrMNM_Acc = new Stats();
	public Stats svoSOAgrMNM_NomAcc = new Stats();
	public Stats svoSOAgrMNM_Erg = new Stats();
	public Stats svoSOAgrMNM_Abs = new Stats();
	public Stats svoSOAgrMNM_ErgAbs = new Stats();
	
	public Stats svoSAgr123_SP_MF = new Stats();
	public Stats svoSAgr123_SP_MF_Nom = new Stats();
	public Stats svoSAgr123_SP_MF_Acc = new Stats();
	public Stats svoSAgr123_SP_MF_NomAcc = new Stats();
	public Stats svoSAgr123_SP_MF_Erg = new Stats();
	public Stats svoSAgr123_SP_MF_Abs = new Stats();
	public Stats svoSAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats svoSAgr123_SP_MFN = new Stats();
	public Stats svoSAgr123_SP_MFN_Nom = new Stats();
	public Stats svoSAgr123_SP_MFN_Acc = new Stats();
	public Stats svoSAgr123_SP_MFN_NomAcc = new Stats();
	public Stats svoSAgr123_SP_MFN_Erg = new Stats();
	public Stats svoSAgr123_SP_MFN_Abs = new Stats();
	public Stats svoSAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats svoSAgr123_SP_CN = new Stats();
	public Stats svoSAgr123_SP_CN_Nom = new Stats();
	public Stats svoSAgr123_SP_CN_Acc = new Stats();
	public Stats svoSAgr123_SP_CN_NomAcc = new Stats();
	public Stats svoSAgr123_SP_CN_Erg = new Stats();
	public Stats svoSAgr123_SP_CN_Abs = new Stats();
	public Stats svoSAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats svoSAgr123_SP_AI = new Stats();
	public Stats svoSAgr123_SP_AI_Nom = new Stats();
	public Stats svoSAgr123_SP_AI_Acc = new Stats();
	public Stats svoSAgr123_SP_AI_NomAcc = new Stats();
	public Stats svoSAgr123_SP_AI_Erg = new Stats();
	public Stats svoSAgr123_SP_AI_Abs = new Stats();
	public Stats svoSAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats svoSAgr123_SP_HN = new Stats();
	public Stats svoSAgr123_SP_HN_Nom = new Stats();
	public Stats svoSAgr123_SP_HN_Acc = new Stats();
	public Stats svoSAgr123_SP_HN_NomAcc = new Stats();
	public Stats svoSAgr123_SP_HN_Erg = new Stats();
	public Stats svoSAgr123_SP_HN_Abs = new Stats();
	public Stats svoSAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats svoSAgr123_SP_HAI = new Stats();
	public Stats svoSAgr123_SP_HAI_Nom = new Stats();
	public Stats svoSAgr123_SP_HAI_Acc = new Stats();
	public Stats svoSAgr123_SP_HAI_NomAcc = new Stats();
	public Stats svoSAgr123_SP_HAI_Erg = new Stats();
	public Stats svoSAgr123_SP_HAI_Abs = new Stats();
	public Stats svoSAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats svoSAgr123_SP_MNM = new Stats();
	public Stats svoSAgr123_SP_MNM_Nom = new Stats();
	public Stats svoSAgr123_SP_MNM_Acc = new Stats();
	public Stats svoSAgr123_SP_MNM_NomAcc = new Stats();
	public Stats svoSAgr123_SP_MNM_Erg = new Stats();
	public Stats svoSAgr123_SP_MNM_Abs = new Stats();
	public Stats svoSAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP_MF = new Stats();
	public Stats svoOAgr123_SP_MF_Nom = new Stats();
	public Stats svoOAgr123_SP_MF_Acc = new Stats();
	public Stats svoOAgr123_SP_MF_NomAcc = new Stats();
	public Stats svoOAgr123_SP_MF_Erg = new Stats();
	public Stats svoOAgr123_SP_MF_Abs = new Stats();
	public Stats svoOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP_MFN = new Stats();
	public Stats svoOAgr123_SP_MFN_Nom = new Stats();
	public Stats svoOAgr123_SP_MFN_Acc = new Stats();
	public Stats svoOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats svoOAgr123_SP_MFN_Erg = new Stats();
	public Stats svoOAgr123_SP_MFN_Abs = new Stats();
	public Stats svoOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP_CN = new Stats();
	public Stats svoOAgr123_SP_CN_Nom = new Stats();
	public Stats svoOAgr123_SP_CN_Acc = new Stats();
	public Stats svoOAgr123_SP_CN_NomAcc = new Stats();
	public Stats svoOAgr123_SP_CN_Erg = new Stats();
	public Stats svoOAgr123_SP_CN_Abs = new Stats();
	public Stats svoOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP_AI = new Stats();
	public Stats svoOAgr123_SP_AI_Nom = new Stats();
	public Stats svoOAgr123_SP_AI_Acc = new Stats();
	public Stats svoOAgr123_SP_AI_NomAcc = new Stats();
	public Stats svoOAgr123_SP_AI_Erg = new Stats();
	public Stats svoOAgr123_SP_AI_Abs = new Stats();
	public Stats svoOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP_HN = new Stats();
	public Stats svoOAgr123_SP_HN_Nom = new Stats();
	public Stats svoOAgr123_SP_HN_Acc = new Stats();
	public Stats svoOAgr123_SP_HN_NomAcc = new Stats();
	public Stats svoOAgr123_SP_HN_Erg = new Stats();
	public Stats svoOAgr123_SP_HN_Abs = new Stats();
	public Stats svoOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP_HAI = new Stats();
	public Stats svoOAgr123_SP_HAI_Nom = new Stats();
	public Stats svoOAgr123_SP_HAI_Acc = new Stats();
	public Stats svoOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats svoOAgr123_SP_HAI_Erg = new Stats();
	public Stats svoOAgr123_SP_HAI_Abs = new Stats();
	public Stats svoOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats svoOAgr123_SP_MNM = new Stats();
	public Stats svoOAgr123_SP_MNM_Nom = new Stats();
	public Stats svoOAgr123_SP_MNM_Acc = new Stats();
	public Stats svoOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats svoOAgr123_SP_MNM_Erg = new Stats();
	public Stats svoOAgr123_SP_MNM_Abs = new Stats();
	public Stats svoOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP_MF = new Stats();
	public Stats svoSOAgr123_SP_MF_Nom = new Stats();
	public Stats svoSOAgr123_SP_MF_Acc = new Stats();
	public Stats svoSOAgr123_SP_MF_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_MF_Erg = new Stats();
	public Stats svoSOAgr123_SP_MF_Abs = new Stats();
	public Stats svoSOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP_MFN = new Stats();
	public Stats svoSOAgr123_SP_MFN_Nom = new Stats();
	public Stats svoSOAgr123_SP_MFN_Acc = new Stats();
	public Stats svoSOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_MFN_Erg = new Stats();
	public Stats svoSOAgr123_SP_MFN_Abs = new Stats();
	public Stats svoSOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP_CN = new Stats();
	public Stats svoSOAgr123_SP_CN_Nom = new Stats();
	public Stats svoSOAgr123_SP_CN_Acc = new Stats();
	public Stats svoSOAgr123_SP_CN_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_CN_Erg = new Stats();
	public Stats svoSOAgr123_SP_CN_Abs = new Stats();
	public Stats svoSOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP_AI = new Stats();
	public Stats svoSOAgr123_SP_AI_Nom = new Stats();
	public Stats svoSOAgr123_SP_AI_Acc = new Stats();
	public Stats svoSOAgr123_SP_AI_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_AI_Erg = new Stats();
	public Stats svoSOAgr123_SP_AI_Abs = new Stats();
	public Stats svoSOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP_HN = new Stats();
	public Stats svoSOAgr123_SP_HN_Nom = new Stats();
	public Stats svoSOAgr123_SP_HN_Acc = new Stats();
	public Stats svoSOAgr123_SP_HN_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_HN_Erg = new Stats();
	public Stats svoSOAgr123_SP_HN_Abs = new Stats();
	public Stats svoSOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP_HAI = new Stats();
	public Stats svoSOAgr123_SP_HAI_Nom = new Stats();
	public Stats svoSOAgr123_SP_HAI_Acc = new Stats();
	public Stats svoSOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_HAI_Erg = new Stats();
	public Stats svoSOAgr123_SP_HAI_Abs = new Stats();
	public Stats svoSOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats svoSOAgr123_SP_MNM = new Stats();
	public Stats svoSOAgr123_SP_MNM_Nom = new Stats();
	public Stats svoSOAgr123_SP_MNM_Acc = new Stats();
	public Stats svoSOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats svoSOAgr123_SP_MNM_Erg = new Stats();
	public Stats svoSOAgr123_SP_MNM_Abs = new Stats();
	public Stats svoSOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public SVOTest() {
		all = new Stats[]{svo, /*svoNomOnly, svoAccOnly, svoNomAcc, svoErgOnly, svoAbsOnly, svoErgAbs,
				svoSAgr123, svoSAgrWe, svoOAgr123, svoOAgrWe, svoSOAgr123, svoSAgrMF, 
				svoSAgrSP, svoOAgrSP, svoSOAgrSP,	
				svoSAgr123_SP, svoSAgr123_SP_Nom, svoSAgr123_SP_Acc, svoSAgr123_SP_NomAcc, svoSAgr123_SP_Erg, svoSAgr123_SP_Abs, svoSAgr123_SP_ErgAbs,
				svoOAgr123_SP, svoOAgr123_SP_Nom, svoOAgr123_SP_Acc, svoOAgr123_SP_NomAcc, svoOAgr123_SP_Erg, svoOAgr123_SP_Abs, svoOAgr123_SP_ErgAbs,
				svoSOAgr123_SP, svoSOAgr123_SP_Nom, svoSOAgr123_SP_Acc, svoSOAgr123_SP_NomAcc, svoSOAgr123_SP_Erg, svoSOAgr123_SP_Abs, svoSOAgr123_SP_ErgAbs,
				svoSAgrMF, svoSAgrMF_Nom, svoSAgrMF_Acc, svoSAgrMF_NomAcc, svoSAgrMF_Erg, svoSAgrMF_Abs, svoSAgrMF_ErgAbs,
				svoSAgrMFN, svoSAgrMFN_Nom, svoSAgrMFN_Acc, svoSAgrMFN_NomAcc, svoSAgrMFN_Erg, svoSAgrMFN_Abs, svoSAgrMFN_ErgAbs,
				svoSAgrCN, svoSAgrCN_Nom, svoSAgrCN_Acc, svoSAgrCN_NomAcc, svoSAgrCN_Erg, svoSAgrCN_Abs, svoSAgrCN_ErgAbs,
				svoSAgrAI, svoSAgrAI_Nom, svoSAgrAI_Acc, svoSAgrAI_NomAcc, svoSAgrAI_Erg, svoSAgrAI_Abs, svoSAgrAI_ErgAbs,
				svoSAgrHN, svoSAgrHN_Nom, svoSAgrHN_Acc, svoSAgrHN_NomAcc, svoSAgrHN_Erg, svoSAgrHN_Abs, svoSAgrHN_ErgAbs,
				svoSAgrHAI, svoSAgrHAI_Nom, svoSAgrHAI_Acc, svoSAgrHAI_NomAcc, svoSAgrHAI_Erg, svoSAgrHAI_Abs, svoSAgrHAI_ErgAbs,
				svoSAgrMNM, svoSAgrMNM_Nom, svoSAgrMNM_Acc, svoSAgrMNM_NomAcc, svoSAgrMNM_Erg, svoSAgrMNM_Abs, svoSAgrMNM_ErgAbs,
				svoOAgrMF, svoOAgrMF_Nom, svoOAgrMF_Acc, svoOAgrMF_NomAcc, svoOAgrMF_Erg, svoOAgrMF_Abs, svoOAgrMF_ErgAbs,
				svoOAgrMFN, svoOAgrMFN_Nom, svoOAgrMFN_Acc, svoOAgrMFN_NomAcc, svoOAgrMFN_Erg, svoOAgrMFN_Abs, svoOAgrMFN_ErgAbs,
				svoOAgrCN, svoOAgrCN_Nom, svoOAgrCN_Acc, svoOAgrCN_NomAcc, svoOAgrCN_Erg, svoOAgrCN_Abs, svoOAgrCN_ErgAbs,
				svoOAgrAI, svoOAgrAI_Nom, svoOAgrAI_Acc, svoOAgrAI_NomAcc, svoOAgrAI_Erg, svoOAgrAI_Abs, svoOAgrAI_ErgAbs,
				svoOAgrHN, svoOAgrHN_Nom, svoOAgrHN_Acc, svoOAgrHN_NomAcc, svoOAgrHN_Erg, svoOAgrHN_Abs, svoOAgrHN_ErgAbs,
				svoOAgrHAI, svoOAgrHAI_Nom, svoOAgrHAI_Acc, svoOAgrHAI_NomAcc, svoOAgrHAI_Erg, svoOAgrHAI_Abs, svoOAgrHAI_ErgAbs,
				svoOAgrMNM, svoOAgrMNM_Nom, svoOAgrMNM_Acc, svoOAgrMNM_NomAcc, svoOAgrMNM_Erg, svoOAgrMNM_Abs, svoOAgrMNM_ErgAbs,
				svoSOAgrMF, svoSOAgrMF_Nom, svoSOAgrMF_Acc, svoSOAgrMF_NomAcc, svoSOAgrMF_Erg, svoSOAgrMF_Abs, svoSOAgrMF_ErgAbs,
				svoSOAgrMFN, svoSOAgrMFN_Nom, svoSOAgrMFN_Acc, svoSOAgrMFN_NomAcc, svoSOAgrMFN_Erg, svoSOAgrMFN_Abs, svoSOAgrMFN_ErgAbs,
				svoSOAgrCN, svoSOAgrCN_Nom, svoSOAgrCN_Acc, svoSOAgrCN_NomAcc, svoSOAgrCN_Erg, svoSOAgrCN_Abs, svoSOAgrCN_ErgAbs,
				svoSOAgrAI, svoSOAgrAI_Nom, svoSOAgrAI_Acc, svoSOAgrAI_NomAcc, svoSOAgrAI_Erg, svoSOAgrAI_Abs, svoSOAgrAI_ErgAbs,
				svoSOAgrHN, svoSOAgrHN_Nom, svoSOAgrHN_Acc, svoSOAgrHN_NomAcc, svoSOAgrHN_Erg, svoSOAgrHN_Abs, svoSOAgrHN_ErgAbs,
				svoSOAgrHAI, svoSOAgrHAI_Nom, svoSOAgrHAI_Acc, svoSOAgrHAI_NomAcc, svoSOAgrHAI_Erg, svoSOAgrHAI_Abs, svoSOAgrHAI_ErgAbs,
				svoSOAgrMNM, svoSOAgrMNM_Nom, svoSOAgrMNM_Acc, svoSOAgrMNM_NomAcc, svoSOAgrMNM_Erg, svoSOAgrMNM_Abs, svoSOAgrMNM_ErgAbs, 
				svoSAgr123_SP_MF, svoSAgr123_SP_MF_Nom, svoSAgr123_SP_MF_Acc, svoSAgr123_SP_MF_NomAcc, svoSAgr123_SP_MF_Erg, svoSAgr123_SP_MF_Abs, svoSAgr123_SP_MF_ErgAbs,
				svoSAgr123_SP_MFN, svoSAgr123_SP_MFN_Nom, svoSAgr123_SP_MFN_Acc, svoSAgr123_SP_MFN_NomAcc, svoSAgr123_SP_MFN_Erg, svoSAgr123_SP_MFN_Abs, svoSAgr123_SP_MFN_ErgAbs,
				svoSAgr123_SP_CN, svoSAgr123_SP_CN_Nom, svoSAgr123_SP_CN_Acc, svoSAgr123_SP_CN_NomAcc, svoSAgr123_SP_CN_Erg, svoSAgr123_SP_CN_Abs, svoSAgr123_SP_CN_ErgAbs,
				svoSAgr123_SP_AI, svoSAgr123_SP_AI_Nom, svoSAgr123_SP_AI_Acc, svoSAgr123_SP_AI_NomAcc, svoSAgr123_SP_AI_Erg, svoSAgr123_SP_AI_Abs, svoSAgr123_SP_AI_ErgAbs,
				svoSAgr123_SP_HN, svoSAgr123_SP_HN_Nom, svoSAgr123_SP_HN_Acc, svoSAgr123_SP_HN_NomAcc, svoSAgr123_SP_HN_Erg, svoSAgr123_SP_HN_Abs, svoSAgr123_SP_HN_ErgAbs,
				svoSAgr123_SP_HAI, svoSAgr123_SP_HAI_Nom, svoSAgr123_SP_HAI_Acc, svoSAgr123_SP_HAI_NomAcc, svoSAgr123_SP_HAI_Erg, svoSAgr123_SP_HAI_Abs, svoSAgr123_SP_HAI_ErgAbs,
				svoSAgr123_SP_MNM, svoSAgr123_SP_MNM_Nom, svoSAgr123_SP_MNM_Acc, svoSAgr123_SP_MNM_NomAcc, svoSAgr123_SP_MNM_Erg, svoSAgr123_SP_MNM_Abs, svoSAgr123_SP_MNM_ErgAbs,
				svoOAgr123_SP_MF, svoOAgr123_SP_MF_Nom, svoOAgr123_SP_MF_Acc, svoOAgr123_SP_MF_NomAcc, svoOAgr123_SP_MF_Erg, svoOAgr123_SP_MF_Abs, svoOAgr123_SP_MF_ErgAbs,
				svoOAgr123_SP_MFN, svoOAgr123_SP_MFN_Nom, svoOAgr123_SP_MFN_Acc, svoOAgr123_SP_MFN_NomAcc, svoOAgr123_SP_MFN_Erg, svoOAgr123_SP_MFN_Abs, svoOAgr123_SP_MFN_ErgAbs,
				svoOAgr123_SP_CN, svoOAgr123_SP_CN_Nom, svoOAgr123_SP_CN_Acc, svoOAgr123_SP_CN_NomAcc, svoOAgr123_SP_CN_Erg, svoOAgr123_SP_CN_Abs, svoOAgr123_SP_CN_ErgAbs,
				svoOAgr123_SP_AI, svoOAgr123_SP_AI_Nom, svoOAgr123_SP_AI_Acc, svoOAgr123_SP_AI_NomAcc, svoOAgr123_SP_AI_Erg, svoOAgr123_SP_AI_Abs, svoOAgr123_SP_AI_ErgAbs,
				svoOAgr123_SP_HN, svoOAgr123_SP_HN_Nom, svoOAgr123_SP_HN_Acc, svoOAgr123_SP_HN_NomAcc, svoOAgr123_SP_HN_Erg, svoOAgr123_SP_HN_Abs, svoOAgr123_SP_HN_ErgAbs,
				svoOAgr123_SP_HAI, svoOAgr123_SP_HAI_Nom, svoOAgr123_SP_HAI_Acc, svoOAgr123_SP_HAI_NomAcc, svoOAgr123_SP_HAI_Erg, svoOAgr123_SP_HAI_Abs, svoOAgr123_SP_HAI_ErgAbs,
				svoOAgr123_SP_MNM, svoOAgr123_SP_MNM_Nom, svoOAgr123_SP_MNM_Acc, svoOAgr123_SP_MNM_NomAcc, svoOAgr123_SP_MNM_Erg, svoOAgr123_SP_MNM_Abs, svoOAgr123_SP_MNM_ErgAbs,
				svoSOAgr123_SP_MF, svoSOAgr123_SP_MF_Nom, svoSOAgr123_SP_MF_Acc, svoSOAgr123_SP_MF_NomAcc, svoSOAgr123_SP_MF_Erg, svoSOAgr123_SP_MF_Abs, svoSOAgr123_SP_MF_ErgAbs,
				svoSOAgr123_SP_MFN, svoSOAgr123_SP_MFN_Nom, svoSOAgr123_SP_MFN_Acc, svoSOAgr123_SP_MFN_NomAcc, svoSOAgr123_SP_MFN_Erg, svoSOAgr123_SP_MFN_Abs, svoSOAgr123_SP_MFN_ErgAbs,
				svoSOAgr123_SP_CN, svoSOAgr123_SP_CN_Nom, svoSOAgr123_SP_CN_Acc, svoSOAgr123_SP_CN_NomAcc, svoSOAgr123_SP_CN_Erg, svoSOAgr123_SP_CN_Abs, svoSOAgr123_SP_CN_ErgAbs,
				svoSOAgr123_SP_AI, svoSOAgr123_SP_AI_Nom, svoSOAgr123_SP_AI_Acc, svoSOAgr123_SP_AI_NomAcc, svoSOAgr123_SP_AI_Erg, svoSOAgr123_SP_AI_Abs, svoSOAgr123_SP_AI_ErgAbs,
				svoSOAgr123_SP_HN, svoSOAgr123_SP_HN_Nom, svoSOAgr123_SP_HN_Acc, svoSOAgr123_SP_HN_NomAcc, svoSOAgr123_SP_HN_Erg, svoSOAgr123_SP_HN_Abs, svoSOAgr123_SP_HN_ErgAbs,
				svoSOAgr123_SP_HAI, svoSOAgr123_SP_HAI_Nom, svoSOAgr123_SP_HAI_Acc, svoSOAgr123_SP_HAI_NomAcc, svoSOAgr123_SP_HAI_Erg, svoSOAgr123_SP_HAI_Abs, svoSOAgr123_SP_HAI_ErgAbs,
				svoSOAgr123_SP_MNM, svoSOAgr123_SP_MNM_Nom, svoSOAgr123_SP_MNM_Acc, svoSOAgr123_SP_MNM_NomAcc, svoSOAgr123_SP_MNM_Erg, svoSOAgr123_SP_MNM_Abs, svoSOAgr123_SP_MNM_ErgAbs*/};
	}
	
	protected void entropy_SurprisalCalc(ArrayList<Event> events, Event ev, HashMap<String, HashMap<String, Word>> lexicons) {
		for(int i = 0; i < all.length; i++) {
			all[i].count++;
			ArrayList<Double> probs = new ArrayList<>();
			BigDecimal pSubj = new BigDecimal(0.0);
			
			// compute entropy for cond. probability of events, given we know the person who is doing them
			for(Event e:events) {
				if(e.arg1.equalsIgnoreCase(first.get(conditionCode[i]).word) &&
						e.probability > 0.0) {
					probs.add(e.probability);
					pSubj = pSubj.add(BigDecimal.valueOf(e.probability));
				}
			}
			
			eta1 = calcEntropy(probs, pSubj);
			
			all[i].eta1.add(eta1);
			all[i].surprisal1.add(calcSurprisal(probs));
			all[i].eventProbs.add(ev.probability);
			
			double surprisalNorm = 0;
			for(int j = 0; j < probs.size(); j++) {
				surprisalNorm += probs.get(j);
			}
			
			probs = new ArrayList<>();
			BigDecimal pSubjVerb = new BigDecimal(0.0);
			
			for(Event e:events) {
				if(e.arg1.equalsIgnoreCase(first.get(conditionCode[i]).word) &&
						e.verb.equalsIgnoreCase(second.get(conditionCode[i]).word) &&
						e.probability > 0.0) {
					switch(i) {
						// verb agrees with obj/subj&obj in person
						case 8: case 9:
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("person").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(0)) {
									// if the subj corresponds to the person in the event
									// and if the verb corresponds to the action
								probs.add(e.probability);
								pSubjVerb = pSubjVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						// verb agrees with obj/subj&obj in number
						case 11: case 12:
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("number").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(0)) {
									// if the subj corresponds to the person in the event
									// and if the verb corresponds to the action
								probs.add(e.probability);
								pSubjVerb = pSubjVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						// verb agrees with obj/subj&obj in person and number
						case 20: case 21: case 22: case 23: case 24: case 25: case 26:
						case 27: case 28: case 29: case 30: case 31: case 32: case 33:
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("person").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(0) &&
							lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("number").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(1)) {
									// if the subj corresponds to the person in the event
									// and if the verb corresponds to the action
								probs.add(e.probability);
								pSubjVerb = pSubjVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						// verb agrees with obj/subj&obj in noun class
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
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("class").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(0)) {
									// if the subj corresponds to the person in the event
									// and if the verb corresponds to the action
								probs.add(e.probability);
								pSubjVerb = pSubjVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						// verb agrees with obj/subj&obj in person, number, and noun class
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
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("person").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(0) &&
							lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("number").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(1) &&
							lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg2).inflection.get("class").get(0) == second.get(conditionCode[i]).inflection.get("obj").get(2)) {
									// if the subj corresponds to the person in the event
									// and if the verb corresponds to the action
								probs.add(e.probability);
								pSubjVerb = pSubjVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						default:
								// if the subj corresponds to the person in the event
								// and if the verb corresponds to the action
							probs.add(e.probability);
							pSubjVerb = pSubjVerb.add(BigDecimal.valueOf(e.probability));
							break;
						}
				}
			}
						
			eta2 = calcEntropy(probs, pSubjVerb);
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
				if(e.arg1.equalsIgnoreCase(first.get(conditionCode[i]).word) &&
						e.verb.equalsIgnoreCase(second.get(conditionCode[i]).word) &&
						e.arg2.equalsIgnoreCase(third.get(conditionCode[i]).word)) {
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
		BigDecimal pSV = new BigDecimal(0);
		BigDecimal pVO = new BigDecimal(0);
		BigDecimal pS = new BigDecimal(0);
		BigDecimal pV = new BigDecimal(0);
		BigDecimal pO = new BigDecimal(0);
		
		for(Event e:events) {
			if(e.arg1.equalsIgnoreCase(first.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pS = pS.add(BigDecimal.valueOf(e.probability));
			}
			if(e.verb.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pV = pV.add(BigDecimal.valueOf(e.probability));
			}
			if(e.arg2.equalsIgnoreCase(third.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pO = pO.add(BigDecimal.valueOf(e.probability));
			}
			if(e.arg1.equalsIgnoreCase(first.get(conditionCode[0]).word) &&
					e.verb.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pSV = pSV.add(BigDecimal.valueOf(e.probability));
			}
			if(e.verb.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.arg2.equalsIgnoreCase(third.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pVO = pVO.add(BigDecimal.valueOf(e.probability));
			}
		}
		svo.mi.add(calcMI(pSV, pS, pV).add(calcMI(pVO, pV, pO)));
	}
	
}
