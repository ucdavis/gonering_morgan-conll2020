package wordorder;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;

public class OSVTest extends Test {
	public Stats osv = new Stats();
	
	public Stats osvNomOnly = new Stats();
	public Stats osvAccOnly = new Stats();
	public Stats osvNomAcc = new Stats();
	public Stats osvErgOnly = new Stats();
	public Stats osvAbsOnly = new Stats();
	public Stats osvErgAbs = new Stats();
	
	public Stats osvSAgr123 = new Stats();
//	public Stats osvSAgrWe = new Stats();
	
	public Stats osvOAgr123 = new Stats();
//	public Stats osvOAgrWe = new Stats();
	
	public Stats osvSOAgr123 = new Stats();
//	public Stats osvSOAgrWe = new Stats();
	
	public Stats osvSAgrSP = new Stats();
	public Stats osvOAgrSP = new Stats();
	public Stats osvSOAgrSP = new Stats();
	
	public Stats osvSAgr123_SP = new Stats();
	public Stats osvSAgr123_SP_Nom = new Stats();
	public Stats osvSAgr123_SP_Acc = new Stats();
	public Stats osvSAgr123_SP_NomAcc = new Stats();
	public Stats osvSAgr123_SP_Erg = new Stats();
	public Stats osvSAgr123_SP_Abs = new Stats();
	public Stats osvSAgr123_SP_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP = new Stats();
	public Stats osvOAgr123_SP_Nom = new Stats();
	public Stats osvOAgr123_SP_Acc = new Stats();
	public Stats osvOAgr123_SP_NomAcc = new Stats();
	public Stats osvOAgr123_SP_Erg = new Stats();
	public Stats osvOAgr123_SP_Abs = new Stats();
	public Stats osvOAgr123_SP_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP = new Stats();
	public Stats osvSOAgr123_SP_Nom = new Stats();
	public Stats osvSOAgr123_SP_Acc = new Stats();
	public Stats osvSOAgr123_SP_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_Erg = new Stats();
	public Stats osvSOAgr123_SP_Abs = new Stats();
	public Stats osvSOAgr123_SP_ErgAbs = new Stats();
	
	public Stats osvSAgrMF = new Stats();
	public Stats osvSAgrMF_Nom = new Stats();
	public Stats osvSAgrMF_Acc = new Stats();
	public Stats osvSAgrMF_NomAcc = new Stats();
	public Stats osvSAgrMF_Erg = new Stats();
	public Stats osvSAgrMF_Abs = new Stats();
	public Stats osvSAgrMF_ErgAbs = new Stats();
	
	public Stats osvSAgrMFN = new Stats();
	public Stats osvSAgrMFN_Nom = new Stats();
	public Stats osvSAgrMFN_Acc = new Stats();
	public Stats osvSAgrMFN_NomAcc = new Stats();
	public Stats osvSAgrMFN_Erg = new Stats();
	public Stats osvSAgrMFN_Abs = new Stats();
	public Stats osvSAgrMFN_ErgAbs = new Stats();
	
	public Stats osvSAgrCN = new Stats();
	public Stats osvSAgrCN_Nom = new Stats();
	public Stats osvSAgrCN_Acc = new Stats();
	public Stats osvSAgrCN_NomAcc = new Stats();
	public Stats osvSAgrCN_Erg = new Stats();
	public Stats osvSAgrCN_Abs = new Stats();
	public Stats osvSAgrCN_ErgAbs = new Stats();
	
	public Stats osvSAgrAI = new Stats();
	public Stats osvSAgrAI_Nom = new Stats();
	public Stats osvSAgrAI_Acc = new Stats();
	public Stats osvSAgrAI_NomAcc = new Stats();
	public Stats osvSAgrAI_Erg = new Stats();
	public Stats osvSAgrAI_Abs = new Stats();
	public Stats osvSAgrAI_ErgAbs = new Stats();
	
	public Stats osvSAgrHN = new Stats();
	public Stats osvSAgrHN_Nom = new Stats();
	public Stats osvSAgrHN_Acc = new Stats();
	public Stats osvSAgrHN_NomAcc = new Stats();
	public Stats osvSAgrHN_Erg = new Stats();
	public Stats osvSAgrHN_Abs = new Stats();
	public Stats osvSAgrHN_ErgAbs = new Stats();
	
	public Stats osvSAgrHAI = new Stats();
	public Stats osvSAgrHAI_Nom = new Stats();
	public Stats osvSAgrHAI_Acc = new Stats();
	public Stats osvSAgrHAI_NomAcc = new Stats();
	public Stats osvSAgrHAI_Erg = new Stats();
	public Stats osvSAgrHAI_Abs = new Stats();
	public Stats osvSAgrHAI_ErgAbs = new Stats();
	
	public Stats osvSAgrMNM = new Stats();
	public Stats osvSAgrMNM_Nom = new Stats();
	public Stats osvSAgrMNM_Acc = new Stats();
	public Stats osvSAgrMNM_NomAcc = new Stats();
	public Stats osvSAgrMNM_Erg = new Stats();
	public Stats osvSAgrMNM_Abs = new Stats();
	public Stats osvSAgrMNM_ErgAbs = new Stats();
	
	public Stats osvOAgrMF = new Stats();
	public Stats osvOAgrMF_Nom = new Stats();
	public Stats osvOAgrMF_Acc = new Stats();
	public Stats osvOAgrMF_NomAcc = new Stats();
	public Stats osvOAgrMF_Erg = new Stats();
	public Stats osvOAgrMF_Abs = new Stats();
	public Stats osvOAgrMF_ErgAbs = new Stats();
	
	public Stats osvOAgrMFN = new Stats();
	public Stats osvOAgrMFN_Nom = new Stats();
	public Stats osvOAgrMFN_Acc = new Stats();
	public Stats osvOAgrMFN_NomAcc = new Stats();
	public Stats osvOAgrMFN_Erg = new Stats();
	public Stats osvOAgrMFN_Abs = new Stats();
	public Stats osvOAgrMFN_ErgAbs = new Stats();
	
	public Stats osvOAgrCN = new Stats();
	public Stats osvOAgrCN_Nom = new Stats();
	public Stats osvOAgrCN_Acc = new Stats();
	public Stats osvOAgrCN_NomAcc = new Stats();
	public Stats osvOAgrCN_Erg = new Stats();
	public Stats osvOAgrCN_Abs = new Stats();
	public Stats osvOAgrCN_ErgAbs = new Stats();
	
	public Stats osvOAgrAI = new Stats();
	public Stats osvOAgrAI_Nom = new Stats();
	public Stats osvOAgrAI_Acc = new Stats();
	public Stats osvOAgrAI_NomAcc = new Stats();
	public Stats osvOAgrAI_Erg = new Stats();
	public Stats osvOAgrAI_Abs = new Stats();
	public Stats osvOAgrAI_ErgAbs = new Stats();
	
	public Stats osvOAgrHN = new Stats();
	public Stats osvOAgrHN_Nom = new Stats();
	public Stats osvOAgrHN_Acc = new Stats();
	public Stats osvOAgrHN_NomAcc = new Stats();
	public Stats osvOAgrHN_Erg = new Stats();
	public Stats osvOAgrHN_Abs = new Stats();
	public Stats osvOAgrHN_ErgAbs = new Stats();
	
	public Stats osvOAgrHAI = new Stats();
	public Stats osvOAgrHAI_Nom = new Stats();
	public Stats osvOAgrHAI_Acc = new Stats();
	public Stats osvOAgrHAI_NomAcc = new Stats();
	public Stats osvOAgrHAI_Erg = new Stats();
	public Stats osvOAgrHAI_Abs = new Stats();
	public Stats osvOAgrHAI_ErgAbs = new Stats();
	
	public Stats osvOAgrMNM = new Stats();
	public Stats osvOAgrMNM_Nom = new Stats();
	public Stats osvOAgrMNM_Acc = new Stats();
	public Stats osvOAgrMNM_NomAcc = new Stats();
	public Stats osvOAgrMNM_Erg = new Stats();
	public Stats osvOAgrMNM_Abs = new Stats();
	public Stats osvOAgrMNM_ErgAbs = new Stats();
	
	public Stats osvSOAgrMF = new Stats();
	public Stats osvSOAgrMF_Nom = new Stats();
	public Stats osvSOAgrMF_Acc = new Stats();
	public Stats osvSOAgrMF_NomAcc = new Stats();
	public Stats osvSOAgrMF_Erg = new Stats();
	public Stats osvSOAgrMF_Abs = new Stats();
	public Stats osvSOAgrMF_ErgAbs = new Stats();
	
	public Stats osvSOAgrMFN = new Stats();
	public Stats osvSOAgrMFN_Nom = new Stats();
	public Stats osvSOAgrMFN_Acc = new Stats();
	public Stats osvSOAgrMFN_NomAcc = new Stats();
	public Stats osvSOAgrMFN_Erg = new Stats();
	public Stats osvSOAgrMFN_Abs = new Stats();
	public Stats osvSOAgrMFN_ErgAbs = new Stats();
	
	public Stats osvSOAgrCN = new Stats();
	public Stats osvSOAgrCN_Nom = new Stats();
	public Stats osvSOAgrCN_Acc = new Stats();
	public Stats osvSOAgrCN_NomAcc = new Stats();
	public Stats osvSOAgrCN_Erg = new Stats();
	public Stats osvSOAgrCN_Abs = new Stats();
	public Stats osvSOAgrCN_ErgAbs = new Stats();
	
	public Stats osvSOAgrAI = new Stats();
	public Stats osvSOAgrAI_Nom = new Stats();
	public Stats osvSOAgrAI_Acc = new Stats();
	public Stats osvSOAgrAI_NomAcc = new Stats();
	public Stats osvSOAgrAI_Erg = new Stats();
	public Stats osvSOAgrAI_Abs = new Stats();
	public Stats osvSOAgrAI_ErgAbs = new Stats();
	
	public Stats osvSOAgrHN = new Stats();
	public Stats osvSOAgrHN_Nom = new Stats();
	public Stats osvSOAgrHN_Acc = new Stats();
	public Stats osvSOAgrHN_NomAcc = new Stats();
	public Stats osvSOAgrHN_Erg = new Stats();
	public Stats osvSOAgrHN_Abs = new Stats();
	public Stats osvSOAgrHN_ErgAbs = new Stats();
	
	public Stats osvSOAgrHAI = new Stats();
	public Stats osvSOAgrHAI_Nom = new Stats();
	public Stats osvSOAgrHAI_Acc = new Stats();
	public Stats osvSOAgrHAI_NomAcc = new Stats();
	public Stats osvSOAgrHAI_Erg = new Stats();
	public Stats osvSOAgrHAI_Abs = new Stats();
	public Stats osvSOAgrHAI_ErgAbs = new Stats();
	
	public Stats osvSOAgrMNM = new Stats();
	public Stats osvSOAgrMNM_Nom = new Stats();
	public Stats osvSOAgrMNM_Acc = new Stats();
	public Stats osvSOAgrMNM_NomAcc = new Stats();
	public Stats osvSOAgrMNM_Erg = new Stats();
	public Stats osvSOAgrMNM_Abs = new Stats();
	public Stats osvSOAgrMNM_ErgAbs = new Stats();
	
	public Stats osvSAgr123_SP_MF = new Stats();
	public Stats osvSAgr123_SP_MF_Nom = new Stats();
	public Stats osvSAgr123_SP_MF_Acc = new Stats();
	public Stats osvSAgr123_SP_MF_NomAcc = new Stats();
	public Stats osvSAgr123_SP_MF_Erg = new Stats();
	public Stats osvSAgr123_SP_MF_Abs = new Stats();
	public Stats osvSAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats osvSAgr123_SP_MFN = new Stats();
	public Stats osvSAgr123_SP_MFN_Nom = new Stats();
	public Stats osvSAgr123_SP_MFN_Acc = new Stats();
	public Stats osvSAgr123_SP_MFN_NomAcc = new Stats();
	public Stats osvSAgr123_SP_MFN_Erg = new Stats();
	public Stats osvSAgr123_SP_MFN_Abs = new Stats();
	public Stats osvSAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats osvSAgr123_SP_CN = new Stats();
	public Stats osvSAgr123_SP_CN_Nom = new Stats();
	public Stats osvSAgr123_SP_CN_Acc = new Stats();
	public Stats osvSAgr123_SP_CN_NomAcc = new Stats();
	public Stats osvSAgr123_SP_CN_Erg = new Stats();
	public Stats osvSAgr123_SP_CN_Abs = new Stats();
	public Stats osvSAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats osvSAgr123_SP_AI = new Stats();
	public Stats osvSAgr123_SP_AI_Nom = new Stats();
	public Stats osvSAgr123_SP_AI_Acc = new Stats();
	public Stats osvSAgr123_SP_AI_NomAcc = new Stats();
	public Stats osvSAgr123_SP_AI_Erg = new Stats();
	public Stats osvSAgr123_SP_AI_Abs = new Stats();
	public Stats osvSAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats osvSAgr123_SP_HN = new Stats();
	public Stats osvSAgr123_SP_HN_Nom = new Stats();
	public Stats osvSAgr123_SP_HN_Acc = new Stats();
	public Stats osvSAgr123_SP_HN_NomAcc = new Stats();
	public Stats osvSAgr123_SP_HN_Erg = new Stats();
	public Stats osvSAgr123_SP_HN_Abs = new Stats();
	public Stats osvSAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats osvSAgr123_SP_HAI = new Stats();
	public Stats osvSAgr123_SP_HAI_Nom = new Stats();
	public Stats osvSAgr123_SP_HAI_Acc = new Stats();
	public Stats osvSAgr123_SP_HAI_NomAcc = new Stats();
	public Stats osvSAgr123_SP_HAI_Erg = new Stats();
	public Stats osvSAgr123_SP_HAI_Abs = new Stats();
	public Stats osvSAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats osvSAgr123_SP_MNM = new Stats();
	public Stats osvSAgr123_SP_MNM_Nom = new Stats();
	public Stats osvSAgr123_SP_MNM_Acc = new Stats();
	public Stats osvSAgr123_SP_MNM_NomAcc = new Stats();
	public Stats osvSAgr123_SP_MNM_Erg = new Stats();
	public Stats osvSAgr123_SP_MNM_Abs = new Stats();
	public Stats osvSAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP_MF = new Stats();
	public Stats osvOAgr123_SP_MF_Nom = new Stats();
	public Stats osvOAgr123_SP_MF_Acc = new Stats();
	public Stats osvOAgr123_SP_MF_NomAcc = new Stats();
	public Stats osvOAgr123_SP_MF_Erg = new Stats();
	public Stats osvOAgr123_SP_MF_Abs = new Stats();
	public Stats osvOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP_MFN = new Stats();
	public Stats osvOAgr123_SP_MFN_Nom = new Stats();
	public Stats osvOAgr123_SP_MFN_Acc = new Stats();
	public Stats osvOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats osvOAgr123_SP_MFN_Erg = new Stats();
	public Stats osvOAgr123_SP_MFN_Abs = new Stats();
	public Stats osvOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP_CN = new Stats();
	public Stats osvOAgr123_SP_CN_Nom = new Stats();
	public Stats osvOAgr123_SP_CN_Acc = new Stats();
	public Stats osvOAgr123_SP_CN_NomAcc = new Stats();
	public Stats osvOAgr123_SP_CN_Erg = new Stats();
	public Stats osvOAgr123_SP_CN_Abs = new Stats();
	public Stats osvOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP_AI = new Stats();
	public Stats osvOAgr123_SP_AI_Nom = new Stats();
	public Stats osvOAgr123_SP_AI_Acc = new Stats();
	public Stats osvOAgr123_SP_AI_NomAcc = new Stats();
	public Stats osvOAgr123_SP_AI_Erg = new Stats();
	public Stats osvOAgr123_SP_AI_Abs = new Stats();
	public Stats osvOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP_HN = new Stats();
	public Stats osvOAgr123_SP_HN_Nom = new Stats();
	public Stats osvOAgr123_SP_HN_Acc = new Stats();
	public Stats osvOAgr123_SP_HN_NomAcc = new Stats();
	public Stats osvOAgr123_SP_HN_Erg = new Stats();
	public Stats osvOAgr123_SP_HN_Abs = new Stats();
	public Stats osvOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP_HAI = new Stats();
	public Stats osvOAgr123_SP_HAI_Nom = new Stats();
	public Stats osvOAgr123_SP_HAI_Acc = new Stats();
	public Stats osvOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats osvOAgr123_SP_HAI_Erg = new Stats();
	public Stats osvOAgr123_SP_HAI_Abs = new Stats();
	public Stats osvOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats osvOAgr123_SP_MNM = new Stats();
	public Stats osvOAgr123_SP_MNM_Nom = new Stats();
	public Stats osvOAgr123_SP_MNM_Acc = new Stats();
	public Stats osvOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats osvOAgr123_SP_MNM_Erg = new Stats();
	public Stats osvOAgr123_SP_MNM_Abs = new Stats();
	public Stats osvOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP_MF = new Stats();
	public Stats osvSOAgr123_SP_MF_Nom = new Stats();
	public Stats osvSOAgr123_SP_MF_Acc = new Stats();
	public Stats osvSOAgr123_SP_MF_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_MF_Erg = new Stats();
	public Stats osvSOAgr123_SP_MF_Abs = new Stats();
	public Stats osvSOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP_MFN = new Stats();
	public Stats osvSOAgr123_SP_MFN_Nom = new Stats();
	public Stats osvSOAgr123_SP_MFN_Acc = new Stats();
	public Stats osvSOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_MFN_Erg = new Stats();
	public Stats osvSOAgr123_SP_MFN_Abs = new Stats();
	public Stats osvSOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP_CN = new Stats();
	public Stats osvSOAgr123_SP_CN_Nom = new Stats();
	public Stats osvSOAgr123_SP_CN_Acc = new Stats();
	public Stats osvSOAgr123_SP_CN_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_CN_Erg = new Stats();
	public Stats osvSOAgr123_SP_CN_Abs = new Stats();
	public Stats osvSOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP_AI = new Stats();
	public Stats osvSOAgr123_SP_AI_Nom = new Stats();
	public Stats osvSOAgr123_SP_AI_Acc = new Stats();
	public Stats osvSOAgr123_SP_AI_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_AI_Erg = new Stats();
	public Stats osvSOAgr123_SP_AI_Abs = new Stats();
	public Stats osvSOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP_HN = new Stats();
	public Stats osvSOAgr123_SP_HN_Nom = new Stats();
	public Stats osvSOAgr123_SP_HN_Acc = new Stats();
	public Stats osvSOAgr123_SP_HN_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_HN_Erg = new Stats();
	public Stats osvSOAgr123_SP_HN_Abs = new Stats();
	public Stats osvSOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP_HAI = new Stats();
	public Stats osvSOAgr123_SP_HAI_Nom = new Stats();
	public Stats osvSOAgr123_SP_HAI_Acc = new Stats();
	public Stats osvSOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_HAI_Erg = new Stats();
	public Stats osvSOAgr123_SP_HAI_Abs = new Stats();
	public Stats osvSOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats osvSOAgr123_SP_MNM = new Stats();
	public Stats osvSOAgr123_SP_MNM_Nom = new Stats();
	public Stats osvSOAgr123_SP_MNM_Acc = new Stats();
	public Stats osvSOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats osvSOAgr123_SP_MNM_Erg = new Stats();
	public Stats osvSOAgr123_SP_MNM_Abs = new Stats();
	public Stats osvSOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public OSVTest() {
		all = new Stats[]{osv, /*osvNomOnly, osvAccOnly, osvNomAcc, osvErgOnly, osvAbsOnly, osvErgAbs,
				osvSAgr123, /*osvSAgrWe, osvOAgr123, /*osvOAgrWe, osvSOAgr123, /*osvSOAgrWe,
				osvSAgrSP, osvOAgrSP, osvSOAgrSP,
				osvSAgr123_SP, osvSAgr123_SP_Nom, osvSAgr123_SP_Acc, osvSAgr123_SP_NomAcc, osvSAgr123_SP_Erg, osvSAgr123_SP_Abs, osvSAgr123_SP_ErgAbs,
				osvOAgr123_SP, osvOAgr123_SP_Nom, osvOAgr123_SP_Acc, osvOAgr123_SP_NomAcc, osvOAgr123_SP_Erg, osvOAgr123_SP_Abs, osvOAgr123_SP_ErgAbs,
				osvSOAgr123_SP, osvSOAgr123_SP_Nom, osvSOAgr123_SP_Acc, osvSOAgr123_SP_NomAcc, osvSOAgr123_SP_Erg, osvSOAgr123_SP_Abs, osvSOAgr123_SP_ErgAbs,
				osvSAgrMF, osvSAgrMF_Nom, osvSAgrMF_Acc, osvSAgrMF_NomAcc, osvSAgrMF_Erg, osvSAgrMF_Abs, osvSAgrMF_ErgAbs,
				osvSAgrMFN, osvSAgrMFN_Nom, osvSAgrMFN_Acc, osvSAgrMFN_NomAcc, osvSAgrMFN_Erg, osvSAgrMFN_Abs, osvSAgrMFN_ErgAbs,
				osvSAgrCN, osvSAgrCN_Nom, osvSAgrCN_Acc, osvSAgrCN_NomAcc, osvSAgrCN_Erg, osvSAgrCN_Abs, osvSAgrCN_ErgAbs,
				osvSAgrAI, osvSAgrAI_Nom, osvSAgrAI_Acc, osvSAgrAI_NomAcc, osvSAgrAI_Erg, osvSAgrAI_Abs, osvSAgrAI_ErgAbs,
				osvSAgrHN, osvSAgrHN_Nom, osvSAgrHN_Acc, osvSAgrHN_NomAcc, osvSAgrHN_Erg, osvSAgrHN_Abs, osvSAgrHN_ErgAbs,
				osvSAgrHAI, osvSAgrHAI_Nom, osvSAgrHAI_Acc, osvSAgrHAI_NomAcc, osvSAgrHAI_Erg, osvSAgrHAI_Abs, osvSAgrHAI_ErgAbs,
				osvSAgrMNM, osvSAgrMNM_Nom, osvSAgrMNM_Acc, osvSAgrMNM_NomAcc, osvSAgrMNM_Erg, osvSAgrMNM_Abs, osvSAgrMNM_ErgAbs,
				osvOAgrMF, osvOAgrMF_Nom, osvOAgrMF_Acc, osvOAgrMF_NomAcc, osvOAgrMF_Erg, osvOAgrMF_Abs, osvOAgrMF_ErgAbs,
				osvOAgrMFN, osvOAgrMFN_Nom, osvOAgrMFN_Acc, osvOAgrMFN_NomAcc, osvOAgrMFN_Erg, osvOAgrMFN_Abs, osvOAgrMFN_ErgAbs,
				osvOAgrCN, osvOAgrCN_Nom, osvOAgrCN_Acc, osvOAgrCN_NomAcc, osvOAgrCN_Erg, osvOAgrCN_Abs, osvOAgrCN_ErgAbs,
				osvOAgrAI, osvOAgrAI_Nom, osvOAgrAI_Acc, osvOAgrAI_NomAcc, osvOAgrAI_Erg, osvOAgrAI_Abs, osvOAgrAI_ErgAbs,
				osvOAgrHN, osvOAgrHN_Nom, osvOAgrHN_Acc, osvOAgrHN_NomAcc, osvOAgrHN_Erg, osvOAgrHN_Abs, osvOAgrHN_ErgAbs,
				osvOAgrHAI, osvOAgrHAI_Nom, osvOAgrHAI_Acc, osvOAgrHAI_NomAcc, osvOAgrHAI_Erg, osvOAgrHAI_Abs, osvOAgrHAI_ErgAbs,
				osvOAgrMNM, osvOAgrMNM_Nom, osvOAgrMNM_Acc, osvOAgrMNM_NomAcc, osvOAgrMNM_Erg, osvOAgrMNM_Abs, osvOAgrMNM_ErgAbs,
				osvSOAgrMF, osvSOAgrMF_Nom, osvSOAgrMF_Acc, osvSOAgrMF_NomAcc, osvSOAgrMF_Erg, osvSOAgrMF_Abs, osvSOAgrMF_ErgAbs,
				osvSOAgrMFN, osvSOAgrMFN_Nom, osvSOAgrMFN_Acc, osvSOAgrMFN_NomAcc, osvSOAgrMFN_Erg, osvSOAgrMFN_Abs, osvSOAgrMFN_ErgAbs,
				osvSOAgrCN, osvSOAgrCN_Nom, osvSOAgrCN_Acc, osvSOAgrCN_NomAcc, osvSOAgrCN_Erg, osvSOAgrCN_Abs, osvSOAgrCN_ErgAbs,
				osvSOAgrAI, osvSOAgrAI_Nom, osvSOAgrAI_Acc, osvSOAgrAI_NomAcc, osvSOAgrAI_Erg, osvSOAgrAI_Abs, osvSOAgrAI_ErgAbs,
				osvSOAgrHN, osvSOAgrHN_Nom, osvSOAgrHN_Acc, osvSOAgrHN_NomAcc, osvSOAgrHN_Erg, osvSOAgrHN_Abs, osvSOAgrHN_ErgAbs,
				osvSOAgrHAI, osvSOAgrHAI_Nom,  osvSOAgrHAI_Acc, osvSOAgrHAI_NomAcc, osvSOAgrHAI_Erg, osvSOAgrHAI_Abs, osvSOAgrHAI_ErgAbs,
				osvSOAgrMNM, osvSOAgrMNM_Nom, osvSOAgrMNM_Acc, osvSOAgrMNM_NomAcc, osvSOAgrMNM_Erg, osvSOAgrMNM_Abs, osvSOAgrMNM_ErgAbs,
				osvSAgr123_SP_MF, osvSAgr123_SP_MF_Nom, osvSAgr123_SP_MF_Acc, osvSAgr123_SP_MF_NomAcc, osvSAgr123_SP_MF_Erg, osvSAgr123_SP_MF_Abs, osvSAgr123_SP_MF_ErgAbs,
				osvSAgr123_SP_MFN, osvSAgr123_SP_MFN_Nom, osvSAgr123_SP_MFN_Acc, osvSAgr123_SP_MFN_NomAcc, osvSAgr123_SP_MFN_Erg, osvSAgr123_SP_MFN_Abs, osvSAgr123_SP_MFN_ErgAbs,
				osvSAgr123_SP_CN, osvSAgr123_SP_CN_Nom, osvSAgr123_SP_CN_Acc, osvSAgr123_SP_CN_NomAcc, osvSAgr123_SP_CN_Erg, osvSAgr123_SP_CN_Abs, osvSAgr123_SP_CN_ErgAbs,
				osvSAgr123_SP_AI, osvSAgr123_SP_AI_Nom, osvSAgr123_SP_AI_Acc, osvSAgr123_SP_AI_NomAcc, osvSAgr123_SP_AI_Erg, osvSAgr123_SP_AI_Abs, osvSAgr123_SP_AI_ErgAbs,
				osvSAgr123_SP_HN, osvSAgr123_SP_HN_Nom, osvSAgr123_SP_HN_Acc, osvSAgr123_SP_HN_NomAcc, osvSAgr123_SP_HN_Erg, osvSAgr123_SP_HN_Abs, osvSAgr123_SP_HN_ErgAbs,
				osvSAgr123_SP_HAI, osvSAgr123_SP_HAI_Nom, osvSAgr123_SP_HAI_Acc, osvSAgr123_SP_HAI_NomAcc, osvSAgr123_SP_HAI_Erg, osvSAgr123_SP_HAI_Abs, osvSAgr123_SP_HAI_ErgAbs,
				osvSAgr123_SP_MNM, osvSAgr123_SP_MNM_Nom, osvSAgr123_SP_MNM_Acc, osvSAgr123_SP_MNM_NomAcc, osvSAgr123_SP_MNM_Erg, osvSAgr123_SP_MNM_Abs, osvSAgr123_SP_MNM_ErgAbs,
				osvOAgr123_SP_MF, osvOAgr123_SP_MF_Nom, osvOAgr123_SP_MF_Acc, osvOAgr123_SP_MF_NomAcc, osvOAgr123_SP_MF_Erg, osvOAgr123_SP_MF_Abs, osvOAgr123_SP_MF_ErgAbs,
				osvOAgr123_SP_MFN, osvOAgr123_SP_MFN_Nom, osvOAgr123_SP_MFN_Acc, osvOAgr123_SP_MFN_NomAcc, osvOAgr123_SP_MFN_Erg, osvOAgr123_SP_MFN_Abs, osvOAgr123_SP_MFN_ErgAbs,
				osvOAgr123_SP_CN, osvOAgr123_SP_CN_Nom, osvOAgr123_SP_CN_Acc, osvOAgr123_SP_CN_NomAcc, osvOAgr123_SP_CN_Erg, osvOAgr123_SP_CN_Abs, osvOAgr123_SP_CN_ErgAbs,
				osvOAgr123_SP_AI, osvOAgr123_SP_AI_Nom, osvOAgr123_SP_AI_Acc, osvOAgr123_SP_AI_NomAcc, osvOAgr123_SP_AI_Erg, osvOAgr123_SP_AI_Abs, osvOAgr123_SP_AI_ErgAbs,
				osvOAgr123_SP_HN, osvOAgr123_SP_HN_Nom, osvOAgr123_SP_HN_Acc, osvOAgr123_SP_HN_NomAcc, osvOAgr123_SP_HN_Erg, osvOAgr123_SP_HN_Abs, osvOAgr123_SP_HN_ErgAbs,
				osvOAgr123_SP_HAI, osvOAgr123_SP_HAI_Nom, osvOAgr123_SP_HAI_Acc, osvOAgr123_SP_HAI_NomAcc, osvOAgr123_SP_HAI_Erg, osvOAgr123_SP_HAI_Abs, osvOAgr123_SP_HAI_ErgAbs,
				osvOAgr123_SP_MNM, osvOAgr123_SP_MNM_Nom, osvOAgr123_SP_MNM_Acc, osvOAgr123_SP_MNM_NomAcc, osvOAgr123_SP_MNM_Erg, osvOAgr123_SP_MNM_Abs, osvOAgr123_SP_MNM_ErgAbs,
				osvSOAgr123_SP_MF, osvSOAgr123_SP_MF_Nom, osvSOAgr123_SP_MF_Acc, osvSOAgr123_SP_MF_NomAcc, osvSOAgr123_SP_MF_Erg, osvSOAgr123_SP_MF_Abs, osvSOAgr123_SP_MF_ErgAbs,
				osvSOAgr123_SP_MFN, osvSOAgr123_SP_MFN_Nom, osvSOAgr123_SP_MFN_Acc, osvSOAgr123_SP_MFN_NomAcc, osvSOAgr123_SP_MFN_Erg, osvSOAgr123_SP_MFN_Abs, osvSOAgr123_SP_MFN_ErgAbs,
				osvSOAgr123_SP_CN, osvSOAgr123_SP_CN_Nom, osvSOAgr123_SP_CN_Acc, osvSOAgr123_SP_CN_NomAcc, osvSOAgr123_SP_CN_Erg, osvSOAgr123_SP_CN_Abs, osvSOAgr123_SP_CN_ErgAbs,
				osvSOAgr123_SP_AI, osvSOAgr123_SP_AI_Nom, osvSOAgr123_SP_AI_Acc, osvSOAgr123_SP_AI_NomAcc, osvSOAgr123_SP_AI_Erg, osvSOAgr123_SP_AI_Abs, osvSOAgr123_SP_AI_ErgAbs,
				osvSOAgr123_SP_HN, osvSOAgr123_SP_HN_Nom, osvSOAgr123_SP_HN_Acc, osvSOAgr123_SP_HN_NomAcc, osvSOAgr123_SP_HN_Erg, osvSOAgr123_SP_HN_Abs, osvSOAgr123_SP_HN_ErgAbs,
				osvSOAgr123_SP_HAI, osvSOAgr123_SP_HAI_Nom,  osvSOAgr123_SP_HAI_Acc, osvSOAgr123_SP_HAI_NomAcc, osvSOAgr123_SP_HAI_Erg, osvSOAgr123_SP_HAI_Abs, osvSOAgr123_SP_HAI_ErgAbs,
				osvSOAgr123_SP_MNM, osvSOAgr123_SP_MNM_Nom, osvSOAgr123_SP_MNM_Acc, osvSOAgr123_SP_MNM_NomAcc, osvSOAgr123_SP_MNM_Erg, osvSOAgr123_SP_MNM_Abs, osvSOAgr123_SP_MNM_ErgAbs*/};
	}
	
	protected void entropy_SurprisalCalc(ArrayList<Event> events, Event ev, HashMap<String, HashMap<String, Word>> lexicons) {
		for(int i = 0; i < all.length; i++) {
			all[i].count++;
			ArrayList<Double> probs = new ArrayList<>();
			BigDecimal pObj = new BigDecimal((double)probs.size());
			
			// compute the entropy for probability of events, given we know what is being done to
			for(Event e:events) {
				if(e.arg2.equalsIgnoreCase(first.get(conditionCode[i]).word) &&
						e.probability > 0.0) {
					probs.add(e.probability);
					pObj = pObj.add(BigDecimal.valueOf(e.probability));
				}
			}
			
			eta1 = calcEntropy(probs, pObj);
			all[i].surprisal1.add(calcSurprisal(probs));
			all[i].eta1.add(eta1);
			all[i].eventProbs.add(ev.probability);
			
			double surprisalNorm = 0;
			for(int j = 0; j < probs.size(); j++) {
				surprisalNorm += probs.get(j);
			}
			
			probs = new ArrayList<>();
			BigDecimal pObjSubj = new BigDecimal(0.0);
			
			// compute the entropy for probability of events, given we know what is being do to
			// and by who
			for(Event e:events) {
				// reduce the event space to only those events involving the obj
				// how many of those events involve both the obj and subj?
				if(e.arg2.equalsIgnoreCase(first.get(conditionCode[i]).word) &&
						e.arg1.equalsIgnoreCase(second.get(conditionCode[i]).word) &&
						e.probability > 0.0) {
					probs.add(e.probability);
					pObjSubj = pObjSubj.add(BigDecimal.valueOf(e.probability));
				}
			}
			
			eta2 = calcEntropy(probs, pObjSubj);
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
				// reduce the event space to only those events involving the obj
				if(e.arg2.equalsIgnoreCase(first.get(conditionCode[i]).word) &&
						e.arg1.equalsIgnoreCase(second.get(conditionCode[i]).word) &&
						e.verb.equalsIgnoreCase(third.get(conditionCode[i]).word) &&
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
		BigDecimal pOS = new BigDecimal(0);
		BigDecimal pSV = new BigDecimal(0);
		BigDecimal pS = new BigDecimal(0);
		BigDecimal pV = new BigDecimal(0);
		BigDecimal pO = new BigDecimal(0);
		
		for(Event e:events) {
			if(e.arg1.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pS = pS.add(BigDecimal.valueOf(e.probability));
			}
			if(e.verb.equalsIgnoreCase(third.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pV = pV.add(BigDecimal.valueOf(e.probability));
			}
			if(e.arg2.equalsIgnoreCase(first.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pO = pO.add(BigDecimal.valueOf(e.probability));
			}
			if(e.arg2.equalsIgnoreCase(first.get(conditionCode[0]).word) &&
					e.arg1.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pOS = pOS.add(BigDecimal.valueOf(e.probability));
			}
			if(e.arg1.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.verb.equalsIgnoreCase(third.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pSV = pSV.add(BigDecimal.valueOf(e.probability));
			}
		}
		
		osv.mi.add(calcMI(pOS, pO, pS).add(calcMI(pSV, pS, pV)));
	}
}
