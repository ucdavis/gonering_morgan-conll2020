package wordorder;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;

public class SOVTest extends Test {
	public Stats sov = new Stats();
	
	public Stats sovNomOnly = new Stats();
	public Stats sovAccOnly = new Stats();
	public Stats sovNomAcc = new Stats();
	public Stats sovErgOnly = new Stats();
	public Stats sovAbsOnly = new Stats();
	public Stats sovErgAbs = new Stats();
	
	public Stats sovSAgr123 = new Stats();
//	public Stats sovSAgrWe = new Stats();
	
	public Stats sovOAgr123 = new Stats();
//	public Stats sovOAgrWe = new Stats();
	
	public Stats sovSOAgr123 = new Stats();
//	public Stats sovSOAgrWe = new Stats();
	
	public Stats sovSAgrSP = new Stats();
	public Stats sovOAgrSP = new Stats();
	public Stats sovSOAgrSP = new Stats();
	
	public Stats sovSAgr123_SP = new Stats();
	public Stats sovSAgr123_SP_Nom = new Stats();
	public Stats sovSAgr123_SP_Acc = new Stats();
	public Stats sovSAgr123_SP_NomAcc = new Stats();
	public Stats sovSAgr123_SP_Erg = new Stats();
	public Stats sovSAgr123_SP_Abs = new Stats();
	public Stats sovSAgr123_SP_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP = new Stats();
	public Stats sovOAgr123_SP_Nom = new Stats();
	public Stats sovOAgr123_SP_Acc = new Stats();
	public Stats sovOAgr123_SP_NomAcc = new Stats();
	public Stats sovOAgr123_SP_Erg = new Stats();
	public Stats sovOAgr123_SP_Abs = new Stats();
	public Stats sovOAgr123_SP_ErgAbs = new Stats();
	
	public Stats sovSOAgr123_SP = new Stats();
	public Stats sovSOAgr123_SP_Nom = new Stats();
	public Stats sovSOAgr123_SP_Acc = new Stats();
	public Stats sovSOAgr123_SP_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_Erg = new Stats();
	public Stats sovSOAgr123_SP_Abs = new Stats();
	public Stats sovSOAgr123_SP_ErgAbs = new Stats();
		
	public Stats sovSAgrMF = new Stats();
	public Stats sovSAgrMF_Nom = new Stats();
	public Stats sovSAgrMF_Acc = new Stats();
	public Stats sovSAgrMF_NomAcc = new Stats();
	public Stats sovSAgrMF_Erg = new Stats();
	public Stats sovSAgrMF_Abs = new Stats();
	public Stats sovSAgrMF_ErgAbs = new Stats();
	
	public Stats sovSAgrMFN = new Stats();
	public Stats sovSAgrMFN_Nom = new Stats();
	public Stats sovSAgrMFN_Acc = new Stats();
	public Stats sovSAgrMFN_NomAcc = new Stats();
	public Stats sovSAgrMFN_Erg = new Stats();
	public Stats sovSAgrMFN_Abs = new Stats();
	public Stats sovSAgrMFN_ErgAbs = new Stats();
	
	public Stats sovSAgrCN = new Stats();
	public Stats sovSAgrCN_Nom = new Stats();
	public Stats sovSAgrCN_Acc = new Stats();
	public Stats sovSAgrCN_NomAcc = new Stats();
	public Stats sovSAgrCN_Erg = new Stats();
	public Stats sovSAgrCN_Abs = new Stats();
	public Stats sovSAgrCN_ErgAbs = new Stats();
	
	public Stats sovSAgrAI = new Stats();
	public Stats sovSAgrAI_Nom = new Stats();
	public Stats sovSAgrAI_Acc = new Stats();
	public Stats sovSAgrAI_NomAcc = new Stats();
	public Stats sovSAgrAI_Erg = new Stats();
	public Stats sovSAgrAI_Abs = new Stats();
	public Stats sovSAgrAI_ErgAbs = new Stats();
	
	public Stats sovSAgrHN = new Stats();
	public Stats sovSAgrHN_Nom = new Stats();
	public Stats sovSAgrHN_Acc = new Stats();
	public Stats sovSAgrHN_NomAcc = new Stats();
	public Stats sovSAgrHN_Erg = new Stats();
	public Stats sovSAgrHN_Abs = new Stats();
	public Stats sovSAgrHN_ErgAbs = new Stats();
	
	public Stats sovSAgrHAI = new Stats();
	public Stats sovSAgrHAI_Nom = new Stats();
	public Stats sovSAgrHAI_Acc = new Stats();
	public Stats sovSAgrHAI_NomAcc = new Stats();
	public Stats sovSAgrHAI_Erg = new Stats();
	public Stats sovSAgrHAI_Abs = new Stats();
	public Stats sovSAgrHAI_ErgAbs = new Stats();
	
	public Stats sovSAgrMNM = new Stats();
	public Stats sovSAgrMNM_Nom = new Stats();
	public Stats sovSAgrMNM_Acc = new Stats();
	public Stats sovSAgrMNM_NomAcc = new Stats();
	public Stats sovSAgrMNM_Erg = new Stats();
	public Stats sovSAgrMNM_Abs = new Stats();
	public Stats sovSAgrMNM_ErgAbs = new Stats();
	
	public Stats sovOAgrMF = new Stats();
	public Stats sovOAgrMF_Nom = new Stats();
	public Stats sovOAgrMF_Acc = new Stats();
	public Stats sovOAgrMF_NomAcc = new Stats();
	public Stats sovOAgrMF_Erg = new Stats();
	public Stats sovOAgrMF_Abs = new Stats();
	public Stats sovOAgrMF_ErgAbs = new Stats();
	
	public Stats sovOAgrMFN = new Stats();
	public Stats sovOAgrMFN_Nom = new Stats();
	public Stats sovOAgrMFN_Acc = new Stats();
	public Stats sovOAgrMFN_NomAcc = new Stats();
	public Stats sovOAgrMFN_Erg = new Stats();
	public Stats sovOAgrMFN_Abs = new Stats();
	public Stats sovOAgrMFN_ErgAbs = new Stats();
	
	public Stats sovOAgrCN = new Stats();
	public Stats sovOAgrCN_Nom = new Stats();
	public Stats sovOAgrCN_Acc = new Stats();
	public Stats sovOAgrCN_NomAcc = new Stats();
	public Stats sovOAgrCN_Erg = new Stats();
	public Stats sovOAgrCN_Abs = new Stats();
	public Stats sovOAgrCN_ErgAbs = new Stats();
	
	public Stats sovOAgrAI = new Stats();
	public Stats sovOAgrAI_Nom = new Stats();
	public Stats sovOAgrAI_Acc = new Stats();
	public Stats sovOAgrAI_NomAcc = new Stats();
	public Stats sovOAgrAI_Erg = new Stats();
	public Stats sovOAgrAI_Abs = new Stats();
	public Stats sovOAgrAI_ErgAbs = new Stats();
	
	public Stats sovOAgrHN = new Stats();
	public Stats sovOAgrHN_Nom = new Stats();
	public Stats sovOAgrHN_Acc = new Stats();
	public Stats sovOAgrHN_NomAcc = new Stats();
	public Stats sovOAgrHN_Erg = new Stats();
	public Stats sovOAgrHN_Abs = new Stats();
	public Stats sovOAgrHN_ErgAbs = new Stats();
	
	public Stats sovOAgrHAI = new Stats();
	public Stats sovOAgrHAI_Nom = new Stats();
	public Stats sovOAgrHAI_Acc = new Stats();
	public Stats sovOAgrHAI_NomAcc = new Stats();
	public Stats sovOAgrHAI_Erg = new Stats();
	public Stats sovOAgrHAI_Abs = new Stats();
	public Stats sovOAgrHAI_ErgAbs = new Stats();
	
	public Stats sovOAgrMNM = new Stats();
	public Stats sovOAgrMNM_Nom = new Stats();
	public Stats sovOAgrMNM_Acc = new Stats();
	public Stats sovOAgrMNM_NomAcc = new Stats();
	public Stats sovOAgrMNM_Erg = new Stats();
	public Stats sovOAgrMNM_Abs = new Stats();
	public Stats sovOAgrMNM_ErgAbs = new Stats();
		
	public Stats sovSOAgrMF = new Stats();
	public Stats sovSOAgrMF_Nom = new Stats();
	public Stats sovSOAgrMF_Acc = new Stats();
	public Stats sovSOAgrMF_NomAcc = new Stats();
	public Stats sovSOAgrMF_Erg = new Stats();
	public Stats sovSOAgrMF_Abs = new Stats();
	public Stats sovSOAgrMF_ErgAbs = new Stats();
	
	public Stats sovSOAgrMFN = new Stats();
	public Stats sovSOAgrMFN_Nom = new Stats();
	public Stats sovSOAgrMFN_Acc = new Stats();
	public Stats sovSOAgrMFN_NomAcc = new Stats();
	public Stats sovSOAgrMFN_Erg = new Stats();
	public Stats sovSOAgrMFN_Abs = new Stats();
	public Stats sovSOAgrMFN_ErgAbs = new Stats();
	
	public Stats sovSOAgrCN = new Stats();
	public Stats sovSOAgrCN_Nom = new Stats();
	public Stats sovSOAgrCN_Acc = new Stats();
	public Stats sovSOAgrCN_NomAcc = new Stats();
	public Stats sovSOAgrCN_Erg = new Stats();
	public Stats sovSOAgrCN_Abs = new Stats();
	public Stats sovSOAgrCN_ErgAbs = new Stats();
	
	public Stats sovSOAgrAI = new Stats();
	public Stats sovSOAgrAI_Nom = new Stats();
	public Stats sovSOAgrAI_Acc = new Stats();
	public Stats sovSOAgrAI_NomAcc = new Stats();
	public Stats sovSOAgrAI_Erg = new Stats();
	public Stats sovSOAgrAI_Abs = new Stats();
	public Stats sovSOAgrAI_ErgAbs = new Stats();
	
	public Stats sovSOAgrHN = new Stats();
	public Stats sovSOAgrHN_Nom = new Stats();
	public Stats sovSOAgrHN_Acc = new Stats();
	public Stats sovSOAgrHN_NomAcc = new Stats();
	public Stats sovSOAgrHN_Erg = new Stats();
	public Stats sovSOAgrHN_Abs = new Stats();
	public Stats sovSOAgrHN_ErgAbs = new Stats();
	
	public Stats sovSOAgrHAI = new Stats();
	public Stats sovSOAgrHAI_Nom = new Stats();
	public Stats sovSOAgrHAI_Acc = new Stats();
	public Stats sovSOAgrHAI_NomAcc = new Stats();
	public Stats sovSOAgrHAI_Erg = new Stats();
	public Stats sovSOAgrHAI_Abs = new Stats();
	public Stats sovSOAgrHAI_ErgAbs = new Stats();
	
	public Stats sovSOAgrMNM = new Stats();
	public Stats sovSOAgrMNM_Nom = new Stats();
	public Stats sovSOAgrMNM_Acc = new Stats();
	public Stats sovSOAgrMNM_NomAcc = new Stats();
	public Stats sovSOAgrMNM_Erg = new Stats();
	public Stats sovSOAgrMNM_Abs = new Stats();
	public Stats sovSOAgrMNM_ErgAbs = new Stats();
	
	public Stats sovSAgr123_SP_MF = new Stats();
	public Stats sovSAgr123_SP_MF_Nom = new Stats();
	public Stats sovSAgr123_SP_MF_Acc = new Stats();
	public Stats sovSAgr123_SP_MF_NomAcc = new Stats();
	public Stats sovSAgr123_SP_MF_Erg = new Stats();
	public Stats sovSAgr123_SP_MF_Abs = new Stats();
	public Stats sovSAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats sovSAgr123_SP_MFN = new Stats();
	public Stats sovSAgr123_SP_MFN_Nom = new Stats();
	public Stats sovSAgr123_SP_MFN_Acc = new Stats();
	public Stats sovSAgr123_SP_MFN_NomAcc = new Stats();
	public Stats sovSAgr123_SP_MFN_Erg = new Stats();
	public Stats sovSAgr123_SP_MFN_Abs = new Stats();
	public Stats sovSAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats sovSAgr123_SP_CN = new Stats();
	public Stats sovSAgr123_SP_CN_Nom = new Stats();
	public Stats sovSAgr123_SP_CN_Acc = new Stats();
	public Stats sovSAgr123_SP_CN_NomAcc = new Stats();
	public Stats sovSAgr123_SP_CN_Erg = new Stats();
	public Stats sovSAgr123_SP_CN_Abs = new Stats();
	public Stats sovSAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats sovSAgr123_SP_AI = new Stats();
	public Stats sovSAgr123_SP_AI_Nom = new Stats();
	public Stats sovSAgr123_SP_AI_Acc = new Stats();
	public Stats sovSAgr123_SP_AI_NomAcc = new Stats();
	public Stats sovSAgr123_SP_AI_Erg = new Stats();
	public Stats sovSAgr123_SP_AI_Abs = new Stats();
	public Stats sovSAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats sovSAgr123_SP_HN = new Stats();
	public Stats sovSAgr123_SP_HN_Nom = new Stats();
	public Stats sovSAgr123_SP_HN_Acc = new Stats();
	public Stats sovSAgr123_SP_HN_NomAcc = new Stats();
	public Stats sovSAgr123_SP_HN_Erg = new Stats();
	public Stats sovSAgr123_SP_HN_Abs = new Stats();
	public Stats sovSAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats sovSAgr123_SP_HAI = new Stats();
	public Stats sovSAgr123_SP_HAI_Nom = new Stats();
	public Stats sovSAgr123_SP_HAI_Acc = new Stats();
	public Stats sovSAgr123_SP_HAI_NomAcc = new Stats();
	public Stats sovSAgr123_SP_HAI_Erg = new Stats();
	public Stats sovSAgr123_SP_HAI_Abs = new Stats();
	public Stats sovSAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats sovSAgr123_SP_MNM = new Stats();
	public Stats sovSAgr123_SP_MNM_Nom = new Stats();
	public Stats sovSAgr123_SP_MNM_Acc = new Stats();
	public Stats sovSAgr123_SP_MNM_NomAcc = new Stats();
	public Stats sovSAgr123_SP_MNM_Erg = new Stats();
	public Stats sovSAgr123_SP_MNM_Abs = new Stats();
	public Stats sovSAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP_MF = new Stats();
	public Stats sovOAgr123_SP_MF_Nom = new Stats();
	public Stats sovOAgr123_SP_MF_Acc = new Stats();
	public Stats sovOAgr123_SP_MF_NomAcc = new Stats();
	public Stats sovOAgr123_SP_MF_Erg = new Stats();
	public Stats sovOAgr123_SP_MF_Abs = new Stats();
	public Stats sovOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP_MFN = new Stats();
	public Stats sovOAgr123_SP_MFN_Nom = new Stats();
	public Stats sovOAgr123_SP_MFN_Acc = new Stats();
	public Stats sovOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats sovOAgr123_SP_MFN_Erg = new Stats();
	public Stats sovOAgr123_SP_MFN_Abs = new Stats();
	public Stats sovOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP_CN = new Stats();
	public Stats sovOAgr123_SP_CN_Nom = new Stats();
	public Stats sovOAgr123_SP_CN_Acc = new Stats();
	public Stats sovOAgr123_SP_CN_NomAcc = new Stats();
	public Stats sovOAgr123_SP_CN_Erg = new Stats();
	public Stats sovOAgr123_SP_CN_Abs = new Stats();
	public Stats sovOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP_AI = new Stats();
	public Stats sovOAgr123_SP_AI_Nom = new Stats();
	public Stats sovOAgr123_SP_AI_Acc = new Stats();
	public Stats sovOAgr123_SP_AI_NomAcc = new Stats();
	public Stats sovOAgr123_SP_AI_Erg = new Stats();
	public Stats sovOAgr123_SP_AI_Abs = new Stats();
	public Stats sovOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP_HN = new Stats();
	public Stats sovOAgr123_SP_HN_Nom = new Stats();
	public Stats sovOAgr123_SP_HN_Acc = new Stats();
	public Stats sovOAgr123_SP_HN_NomAcc = new Stats();
	public Stats sovOAgr123_SP_HN_Erg = new Stats();
	public Stats sovOAgr123_SP_HN_Abs = new Stats();
	public Stats sovOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP_HAI = new Stats();
	public Stats sovOAgr123_SP_HAI_Nom = new Stats();
	public Stats sovOAgr123_SP_HAI_Acc = new Stats();
	public Stats sovOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats sovOAgr123_SP_HAI_Erg = new Stats();
	public Stats sovOAgr123_SP_HAI_Abs = new Stats();
	public Stats sovOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats sovOAgr123_SP_MNM = new Stats();
	public Stats sovOAgr123_SP_MNM_Nom = new Stats();
	public Stats sovOAgr123_SP_MNM_Acc = new Stats();
	public Stats sovOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats sovOAgr123_SP_MNM_Erg = new Stats();
	public Stats sovOAgr123_SP_MNM_Abs = new Stats();
	public Stats sovOAgr123_SP_MNM_ErgAbs = new Stats();
		
	public Stats sovSOAgr123_SP_MF = new Stats();
	public Stats sovSOAgr123_SP_MF_Nom = new Stats();
	public Stats sovSOAgr123_SP_MF_Acc = new Stats();
	public Stats sovSOAgr123_SP_MF_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_MF_Erg = new Stats();
	public Stats sovSOAgr123_SP_MF_Abs = new Stats();
	public Stats sovSOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats sovSOAgr123_SP_MFN = new Stats();
	public Stats sovSOAgr123_SP_MFN_Nom = new Stats();
	public Stats sovSOAgr123_SP_MFN_Acc = new Stats();
	public Stats sovSOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_MFN_Erg = new Stats();
	public Stats sovSOAgr123_SP_MFN_Abs = new Stats();
	public Stats sovSOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats sovSOAgr123_SP_CN = new Stats();
	public Stats sovSOAgr123_SP_CN_Nom = new Stats();
	public Stats sovSOAgr123_SP_CN_Acc = new Stats();
	public Stats sovSOAgr123_SP_CN_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_CN_Erg = new Stats();
	public Stats sovSOAgr123_SP_CN_Abs = new Stats();
	public Stats sovSOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats sovSOAgr123_SP_AI = new Stats();
	public Stats sovSOAgr123_SP_AI_Nom = new Stats();
	public Stats sovSOAgr123_SP_AI_Acc = new Stats();
	public Stats sovSOAgr123_SP_AI_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_AI_Erg = new Stats();
	public Stats sovSOAgr123_SP_AI_Abs = new Stats();
	public Stats sovSOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats sovSOAgr123_SP_HN = new Stats();
	public Stats sovSOAgr123_SP_HN_Nom = new Stats();
	public Stats sovSOAgr123_SP_HN_Acc = new Stats();
	public Stats sovSOAgr123_SP_HN_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_HN_Erg = new Stats();
	public Stats sovSOAgr123_SP_HN_Abs = new Stats();
	public Stats sovSOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats sovSOAgr123_SP_HAI = new Stats();
	public Stats sovSOAgr123_SP_HAI_Nom = new Stats();
	public Stats sovSOAgr123_SP_HAI_Acc = new Stats();
	public Stats sovSOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_HAI_Erg = new Stats();
	public Stats sovSOAgr123_SP_HAI_Abs = new Stats();
	public Stats sovSOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats sovSOAgr123_SP_MNM = new Stats();
	public Stats sovSOAgr123_SP_MNM_Nom = new Stats();
	public Stats sovSOAgr123_SP_MNM_Acc = new Stats();
	public Stats sovSOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats sovSOAgr123_SP_MNM_Erg = new Stats();
	public Stats sovSOAgr123_SP_MNM_Abs = new Stats();
	public Stats sovSOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public SOVTest() {
		all = new Stats[]{sov, /*sovNomOnly, sovAccOnly, sovNomAcc, sovErgOnly, sovAbsOnly, sovErgAbs,
				sovSAgr123, /*sovSAgrWe, sovOAgr123, /*sovOAgrWe, sovSOAgr123, /*sovSOAgrWe,
				sovSAgrSP, sovOAgrSP, sovSOAgrSP,
				sovSAgr123_SP, sovSAgr123_SP_Nom, sovSAgr123_SP_Acc, sovSAgr123_SP_NomAcc, sovSAgr123_SP_Erg, sovSAgr123_SP_Abs, sovSAgr123_SP_ErgAbs,
				sovOAgr123_SP, sovOAgr123_SP_Nom, sovOAgr123_SP_Acc, sovOAgr123_SP_NomAcc, sovOAgr123_SP_Erg, sovOAgr123_SP_Abs, sovOAgr123_SP_ErgAbs,
				sovSOAgr123_SP, sovSOAgr123_SP_Nom, sovSOAgr123_SP_Acc, sovSOAgr123_SP_NomAcc, sovSOAgr123_SP_Erg, sovSOAgr123_SP_Abs, sovSOAgr123_SP_ErgAbs,
				sovSAgrMF, sovSAgrMF_Nom, sovSAgrMF_Acc, sovSAgrMF_NomAcc, sovSAgrMF_Erg, sovSAgrMF_Abs, sovSAgrMF_ErgAbs,
				sovSAgrMFN, sovSAgrMFN_Nom, sovSAgrMFN_Acc, sovSAgrMFN_NomAcc, sovSAgrMFN_Erg, sovSAgrMFN_Abs, sovSAgrMFN_ErgAbs,
				sovSAgrCN, sovSAgrCN_Nom, sovSAgrCN_Acc, sovSAgrCN_NomAcc, sovSAgrCN_Erg, sovSAgrCN_Abs, sovSAgrCN_ErgAbs,
				sovSAgrAI, sovSAgrAI_Nom, sovSAgrAI_Acc, sovSAgrAI_NomAcc, sovSAgrAI_Erg, sovSAgrAI_Abs, sovSAgrAI_ErgAbs,
				sovSAgrHN, sovSAgrHN_Nom, sovSAgrHN_Acc, sovSAgrHN_NomAcc, sovSAgrHN_Erg, sovSAgrHN_Abs, sovSAgrHN_ErgAbs,
				sovSAgrHAI, sovSAgrHAI_Nom, sovSAgrHAI_Acc, sovSAgrHAI_NomAcc, sovSAgrHAI_Erg, sovSAgrHAI_Abs, sovSAgrHAI_ErgAbs,
				sovSAgrMNM, sovSAgrMNM_Nom, sovSAgrMNM_Acc, sovSAgrMNM_NomAcc, sovSAgrMNM_Erg, sovSAgrMNM_Abs, sovSAgrMNM_ErgAbs,
				sovOAgrMF, sovOAgrMF_Nom, sovOAgrMF_Acc, sovOAgrMF_NomAcc, sovOAgrMF_Erg, sovOAgrMF_Abs, sovOAgrMF_ErgAbs,
				sovOAgrMFN, sovOAgrMFN_Nom, sovOAgrMFN_Acc, sovOAgrMFN_NomAcc, sovOAgrMFN_Erg, sovOAgrMFN_Abs, sovOAgrMFN_ErgAbs,
				sovOAgrCN, sovOAgrCN_Nom, sovOAgrCN_Acc, sovOAgrCN_NomAcc, sovOAgrCN_Erg, sovOAgrCN_Abs, sovOAgrCN_ErgAbs,
				sovOAgrAI, sovOAgrAI_Nom, sovOAgrAI_Acc, sovOAgrAI_NomAcc, sovOAgrAI_Erg, sovOAgrAI_Abs, sovOAgrAI_ErgAbs,
				sovOAgrHN, sovOAgrHN_Nom, sovOAgrHN_Acc, sovOAgrHN_NomAcc, sovOAgrHN_Erg, sovOAgrHN_Abs, sovOAgrHN_ErgAbs, 
				sovOAgrHAI, sovOAgrHAI_Nom, sovOAgrHAI_Acc, sovOAgrHAI_NomAcc, sovOAgrHAI_Erg, sovOAgrHAI_Abs, sovOAgrHAI_ErgAbs,
				sovOAgrMNM, sovOAgrMNM_Nom, sovOAgrMNM_Acc, sovOAgrMNM_NomAcc, sovOAgrMNM_Erg, sovOAgrMNM_Abs, sovOAgrMNM_ErgAbs,
				sovSOAgrMF, sovSOAgrMF_Nom, sovSOAgrMF_Acc, sovSOAgrMF_NomAcc, sovSOAgrMF_Erg, sovSOAgrMF_Abs, sovSOAgrMF_ErgAbs,
				sovSOAgrMFN, sovSOAgrMFN_Nom, sovSOAgrMFN_Acc, sovSOAgrMFN_NomAcc, sovSOAgrMFN_Erg, sovSOAgrMFN_Abs, sovSOAgrMFN_ErgAbs,
				sovSOAgrCN, sovSOAgrCN_Nom, sovSOAgrCN_Acc, sovSOAgrCN_NomAcc, sovSOAgrCN_Erg, sovSOAgrCN_Abs, sovSOAgrCN_ErgAbs,
				sovSOAgrAI, sovSOAgrAI_Nom, sovSOAgrAI_Acc, sovSOAgrAI_NomAcc, sovSOAgrAI_Erg, sovSOAgrAI_Abs, sovSOAgrAI_ErgAbs,
				sovSOAgrHN, sovSOAgrHN_Nom, sovSOAgrHN_Acc, sovSOAgrHN_NomAcc, sovSOAgrHN_Erg, sovSOAgrHN_Abs, sovSOAgrHN_ErgAbs,
				sovSOAgrHAI, sovSOAgrHAI_Nom, sovSOAgrHAI_Acc, sovSOAgrHAI_NomAcc, sovSOAgrHAI_Erg, sovSOAgrHAI_Abs, sovSOAgrHAI_ErgAbs,
				sovSOAgrMNM, sovSOAgrMNM_Nom, sovSOAgrMNM_Acc, sovSOAgrMNM_NomAcc, sovSOAgrMNM_Erg, sovSOAgrMNM_Abs, sovSOAgrMNM_ErgAbs,
				sovSAgr123_SP_MF, sovSAgr123_SP_MF_Nom, sovSAgr123_SP_MF_Acc, sovSAgr123_SP_MF_NomAcc, sovSAgr123_SP_MF_Erg, sovSAgr123_SP_MF_Abs, sovSAgr123_SP_MF_ErgAbs,
				sovSAgr123_SP_MFN, sovSAgr123_SP_MFN_Nom, sovSAgr123_SP_MFN_Acc, sovSAgr123_SP_MFN_NomAcc, sovSAgr123_SP_MFN_Erg, sovSAgr123_SP_MFN_Abs, sovSAgr123_SP_MFN_ErgAbs,
				sovSAgr123_SP_CN, sovSAgr123_SP_CN_Nom, sovSAgr123_SP_CN_Acc, sovSAgr123_SP_CN_NomAcc, sovSAgr123_SP_CN_Erg, sovSAgr123_SP_CN_Abs, sovSAgr123_SP_CN_ErgAbs,
				sovSAgr123_SP_AI, sovSAgr123_SP_AI_Nom, sovSAgr123_SP_AI_Acc, sovSAgr123_SP_AI_NomAcc, sovSAgr123_SP_AI_Erg, sovSAgr123_SP_AI_Abs, sovSAgr123_SP_AI_ErgAbs,
				sovSAgr123_SP_HN, sovSAgr123_SP_HN_Nom, sovSAgr123_SP_HN_Acc, sovSAgr123_SP_HN_NomAcc, sovSAgr123_SP_HN_Erg, sovSAgr123_SP_HN_Abs, sovSAgr123_SP_HN_ErgAbs,
				sovSAgr123_SP_HAI, sovSAgr123_SP_HAI_Nom, sovSAgr123_SP_HAI_Acc, sovSAgr123_SP_HAI_NomAcc, sovSAgr123_SP_HAI_Erg, sovSAgr123_SP_HAI_Abs, sovSAgr123_SP_HAI_ErgAbs,
				sovSAgr123_SP_MNM, sovSAgr123_SP_MNM_Nom, sovSAgr123_SP_MNM_Acc, sovSAgr123_SP_MNM_NomAcc, sovSAgr123_SP_MNM_Erg, sovSAgr123_SP_MNM_Abs, sovSAgr123_SP_MNM_ErgAbs,
				sovOAgr123_SP_MF, sovOAgr123_SP_MF_Nom, sovOAgr123_SP_MF_Acc, sovOAgr123_SP_MF_NomAcc, sovOAgr123_SP_MF_Erg, sovOAgr123_SP_MF_Abs, sovOAgr123_SP_MF_ErgAbs,
				sovOAgr123_SP_MFN, sovOAgr123_SP_MFN_Nom, sovOAgr123_SP_MFN_Acc, sovOAgr123_SP_MFN_NomAcc, sovOAgr123_SP_MFN_Erg, sovOAgr123_SP_MFN_Abs, sovOAgr123_SP_MFN_ErgAbs,
				sovOAgr123_SP_CN, sovOAgr123_SP_CN_Nom, sovOAgr123_SP_CN_Acc, sovOAgr123_SP_CN_NomAcc, sovOAgr123_SP_CN_Erg, sovOAgr123_SP_CN_Abs, sovOAgr123_SP_CN_ErgAbs,
				sovOAgr123_SP_AI, sovOAgr123_SP_AI_Nom, sovOAgr123_SP_AI_Acc, sovOAgr123_SP_AI_NomAcc, sovOAgr123_SP_AI_Erg, sovOAgr123_SP_AI_Abs, sovOAgr123_SP_AI_ErgAbs,
				sovOAgr123_SP_HN, sovOAgr123_SP_HN_Nom, sovOAgr123_SP_HN_Acc, sovOAgr123_SP_HN_NomAcc, sovOAgr123_SP_HN_Erg, sovOAgr123_SP_HN_Abs, sovOAgr123_SP_HN_ErgAbs, 
				sovOAgr123_SP_HAI, sovOAgr123_SP_HAI_Nom, sovOAgr123_SP_HAI_Acc, sovOAgr123_SP_HAI_NomAcc, sovOAgr123_SP_HAI_Erg, sovOAgr123_SP_HAI_Abs, sovOAgr123_SP_HAI_ErgAbs,
				sovOAgr123_SP_MNM, sovOAgr123_SP_MNM_Nom, sovOAgr123_SP_MNM_Acc, sovOAgr123_SP_MNM_NomAcc, sovOAgr123_SP_MNM_Erg, sovOAgr123_SP_MNM_Abs, sovOAgr123_SP_MNM_ErgAbs,
				sovSOAgr123_SP_MF, sovSOAgr123_SP_MF_Nom, sovSOAgr123_SP_MF_Acc, sovSOAgr123_SP_MF_NomAcc, sovSOAgr123_SP_MF_Erg, sovSOAgr123_SP_MF_Abs, sovSOAgr123_SP_MF_ErgAbs,
				sovSOAgr123_SP_MFN, sovSOAgr123_SP_MFN_Nom, sovSOAgr123_SP_MFN_Acc, sovSOAgr123_SP_MFN_NomAcc, sovSOAgr123_SP_MFN_Erg, sovSOAgr123_SP_MFN_Abs, sovSOAgr123_SP_MFN_ErgAbs,
				sovSOAgr123_SP_CN, sovSOAgr123_SP_CN_Nom, sovSOAgr123_SP_CN_Acc, sovSOAgr123_SP_CN_NomAcc, sovSOAgr123_SP_CN_Erg, sovSOAgr123_SP_CN_Abs, sovSOAgr123_SP_CN_ErgAbs,
				sovSOAgr123_SP_AI, sovSOAgr123_SP_AI_Nom, sovSOAgr123_SP_AI_Acc, sovSOAgr123_SP_AI_NomAcc, sovSOAgr123_SP_AI_Erg, sovSOAgr123_SP_AI_Abs, sovSOAgr123_SP_AI_ErgAbs,
				sovSOAgr123_SP_HN, sovSOAgr123_SP_HN_Nom, sovSOAgr123_SP_HN_Acc, sovSOAgr123_SP_HN_NomAcc, sovSOAgr123_SP_HN_Erg, sovSOAgr123_SP_HN_Abs, sovSOAgr123_SP_HN_ErgAbs,
				sovSOAgr123_SP_HAI, sovSOAgr123_SP_HAI_Nom, sovSOAgr123_SP_HAI_Acc, sovSOAgr123_SP_HAI_NomAcc, sovSOAgr123_SP_HAI_Erg, sovSOAgr123_SP_HAI_Abs, sovSOAgr123_SP_HAI_ErgAbs,
				sovSOAgr123_SP_MNM, sovSOAgr123_SP_MNM_Nom, sovSOAgr123_SP_MNM_Acc, sovSOAgr123_SP_MNM_NomAcc, sovSOAgr123_SP_MNM_Erg, sovSOAgr123_SP_MNM_Abs, sovSOAgr123_SP_MNM_ErgAbs*/};
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
			BigDecimal pSubjObj = new BigDecimal(0.0);
			
			// compute the entropy of probability of events, given we know who is doing
			// and what is being done to
			for(Event e:events) {
				// reduce the event space to just those events involving the subj
				if(e.arg1.equalsIgnoreCase(first.get(conditionCode[i]).word) &&
						e.arg2.equalsIgnoreCase(second.get(conditionCode[i]).word) &&
						e.probability > 0.0) {
						// how many possible events could involve both the subj and obj?
					probs.add(e.probability);
					pSubjObj = pSubjObj.add(BigDecimal.valueOf(e.probability));
				}
			}

			eta2 = calcEntropy(probs, pSubjObj);
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
						e.arg2.equalsIgnoreCase(second.get(conditionCode[i]).word) &&
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
		BigDecimal pSO = new BigDecimal(0);
		BigDecimal pOV = new BigDecimal(0);
		BigDecimal pS = new BigDecimal(0);
		BigDecimal pV = new BigDecimal(0);
		BigDecimal pO = new BigDecimal(0);
		
		for(Event e:events) {
			if(e.arg1.equalsIgnoreCase(first.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pS = pS.add(BigDecimal.valueOf(e.probability));
			}
			if(e.verb.equalsIgnoreCase(third.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pV = pV.add(BigDecimal.valueOf(e.probability));
			}
			if(e.arg2.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pO = pO.add(BigDecimal.valueOf(e.probability));
			}
			if(e.arg1.equalsIgnoreCase(first.get(conditionCode[0]).word) &&
					e.arg2.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pSO = pSO.add(BigDecimal.valueOf(e.probability));
			}
			if(e.arg2.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.verb.equalsIgnoreCase(third.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pOV = pOV.add(BigDecimal.valueOf(e.probability));
			}
		}
		
		sov.mi.add(calcMI(pSO, pS, pO).add(calcMI(pOV, pO, pV)));
	}
}
