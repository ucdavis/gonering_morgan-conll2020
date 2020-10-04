package wordorder;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;

public class VOSTest extends Test {
	public Stats vos = new Stats();
	
	public Stats vosNomOnly = new Stats();
	public Stats vosAccOnly = new Stats();
	public Stats vosNomAcc = new Stats();
	public Stats vosErgOnly = new Stats();
	public Stats vosAbsOnly = new Stats();
	public Stats vosErgAbs = new Stats();
	
	public Stats vosSAgr123 = new Stats();
//	public Stats vosSAgrWe = new Stats();
	
	public Stats vosOAgr123 = new Stats();
//	public Stats vosOAgrWe = new Stats();
	
	public Stats vosSOAgr123 = new Stats();
//	public Stats vosSOAgrWe = new Stats();
	
	public Stats vosSAgrSP = new Stats();
	public Stats vosOAgrSP = new Stats();
	public Stats vosSOAgrSP = new Stats();
	
	public Stats vosSAgr123_SP = new Stats();
	public Stats vosSAgr123_SP_Nom = new Stats();
	public Stats vosSAgr123_SP_Acc = new Stats();
	public Stats vosSAgr123_SP_NomAcc = new Stats();
	public Stats vosSAgr123_SP_Erg = new Stats();
	public Stats vosSAgr123_SP_Abs = new Stats();
	public Stats vosSAgr123_SP_ErgAbs = new Stats();
	
	public Stats vosOAgr123_SP = new Stats();
	public Stats vosOAgr123_SP_Nom = new Stats();
	public Stats vosOAgr123_SP_Acc = new Stats();
	public Stats vosOAgr123_SP_NomAcc = new Stats();
	public Stats vosOAgr123_SP_Erg = new Stats();
	public Stats vosOAgr123_SP_Abs = new Stats();
	public Stats vosOAgr123_SP_ErgAbs = new Stats();
	
	public Stats vosSOAgr123_SP = new Stats();
	public Stats vosSOAgr123_SP_Nom = new Stats();
	public Stats vosSOAgr123_SP_Acc = new Stats();
	public Stats vosSOAgr123_SP_NomAcc = new Stats();
	public Stats vosSOAgr123_SP_Erg = new Stats();
	public Stats vosSOAgr123_SP_Abs = new Stats();
	public Stats vosSOAgr123_SP_ErgAbs = new Stats();
	
	public Stats vosSAgrMF = new Stats();
	public Stats vosSAgrMF_Nom = new Stats();
	public Stats vosSAgrMF_Acc = new Stats();
	public Stats vosSAgrMF_NomAcc = new Stats();
	public Stats vosSAgrMF_Erg = new Stats();
	public Stats vosSAgrMF_Abs = new Stats();
	public Stats vosSAgrMF_ErgAbs = new Stats();
	
	public Stats vosSAgrMFN = new Stats();
	public Stats vosSAgrMFN_Nom = new Stats();
	public Stats vosSAgrMFN_Acc = new Stats();
	public Stats vosSAgrMFN_NomAcc = new Stats();
	public Stats vosSAgrMFN_Erg = new Stats();
	public Stats vosSAgrMFN_Abs = new Stats();
	public Stats vosSAgrMFN_ErgAbs = new Stats();
	
	public Stats vosSAgrCN = new Stats();
	public Stats vosSAgrCN_Nom = new Stats();
	public Stats vosSAgrCN_Acc = new Stats();
	public Stats vosSAgrCN_NomAcc = new Stats();
	public Stats vosSAgrCN_Erg = new Stats();
	public Stats vosSAgrCN_Abs = new Stats();
	public Stats vosSAgrCN_ErgAbs = new Stats();
	
	public Stats vosSAgrAI = new Stats();
	public Stats vosSAgrAI_Nom = new Stats();
	public Stats vosSAgrAI_Acc = new Stats();
	public Stats vosSAgrAI_NomAcc = new Stats();
	public Stats vosSAgrAI_Erg = new Stats();
	public Stats vosSAgrAI_Abs = new Stats();
	public Stats vosSAgrAI_ErgAbs = new Stats();
	
	public Stats vosSAgrHN = new Stats();
	public Stats vosSAgrHN_Nom = new Stats();
	public Stats vosSAgrHN_Acc = new Stats();
	public Stats vosSAgrHN_NomAcc = new Stats();
	public Stats vosSAgrHN_Erg = new Stats();
	public Stats vosSAgrHN_Abs = new Stats();
	public Stats vosSAgrHN_ErgAbs = new Stats();
	
	public Stats vosSAgrHAI = new Stats();
	public Stats vosSAgrHAI_Nom = new Stats();
	public Stats vosSAgrHAI_Acc = new Stats();
	public Stats vosSAgrHAI_NomAcc = new Stats();
	public Stats vosSAgrHAI_Erg = new Stats();
	public Stats vosSAgrHAI_Abs = new Stats();
	public Stats vosSAgrHAI_ErgAbs = new Stats();
	
	public Stats vosSAgrMNM = new Stats();
	public Stats vosSAgrMNM_Nom = new Stats();
	public Stats vosSAgrMNM_Acc = new Stats();
	public Stats vosSAgrMNM_NomAcc = new Stats();
	public Stats vosSAgrMNM_Erg = new Stats();
	public Stats vosSAgrMNM_Abs = new Stats();
	public Stats vosSAgrMNM_ErgAbs = new Stats();
	
	public Stats vosOAgrMF = new Stats();
	public Stats vosOAgrMF_Nom = new Stats();
	public Stats vosOAgrMF_Acc = new Stats();
	public Stats vosOAgrMF_NomAcc = new Stats();
	public Stats vosOAgrMF_Erg = new Stats();
	public Stats vosOAgrMF_Abs = new Stats();
	public Stats vosOAgrMF_ErgAbs = new Stats();
	
	public Stats vosOAgrMFN = new Stats();
	public Stats vosOAgrMFN_Nom = new Stats();
	public Stats vosOAgrMFN_Acc = new Stats();
	public Stats vosOAgrMFN_NomAcc = new Stats();
	public Stats vosOAgrMFN_Erg = new Stats();
	public Stats vosOAgrMFN_Abs = new Stats();
	public Stats vosOAgrMFN_ErgAbs = new Stats();
	
	public Stats vosOAgrCN = new Stats();
	public Stats vosOAgrCN_Nom = new Stats();
	public Stats vosOAgrCN_Acc = new Stats();
	public Stats vosOAgrCN_NomAcc = new Stats();
	public Stats vosOAgrCN_Erg = new Stats();
	public Stats vosOAgrCN_Abs = new Stats();
	public Stats vosOAgrCN_ErgAbs = new Stats();
	
	public Stats vosOAgrAI = new Stats();
	public Stats vosOAgrAI_Nom = new Stats();
	public Stats vosOAgrAI_Acc = new Stats();
	public Stats vosOAgrAI_NomAcc = new Stats();
	public Stats vosOAgrAI_Erg = new Stats();
	public Stats vosOAgrAI_Abs = new Stats();
	public Stats vosOAgrAI_ErgAbs = new Stats();
	
	public Stats vosOAgrHN = new Stats();
	public Stats vosOAgrHN_Nom = new Stats();
	public Stats vosOAgrHN_Acc = new Stats();
	public Stats vosOAgrHN_NomAcc = new Stats();
	public Stats vosOAgrHN_Erg = new Stats();
	public Stats vosOAgrHN_Abs = new Stats();
	public Stats vosOAgrHN_ErgAbs = new Stats();
	
	public Stats vosOAgrHAI = new Stats();
	public Stats vosOAgrHAI_Nom = new Stats();
	public Stats vosOAgrHAI_Acc = new Stats();
	public Stats vosOAgrHAI_NomAcc = new Stats();
	public Stats vosOAgrHAI_Erg = new Stats();
	public Stats vosOAgrHAI_Abs = new Stats();
	public Stats vosOAgrHAI_ErgAbs = new Stats();
	
	public Stats vosOAgrMNM = new Stats();
	public Stats vosOAgrMNM_Nom = new Stats();
	public Stats vosOAgrMNM_Acc = new Stats();
	public Stats vosOAgrMNM_NomAcc = new Stats();
	public Stats vosOAgrMNM_Erg = new Stats();
	public Stats vosOAgrMNM_Abs = new Stats();
	public Stats vosOAgrMNM_ErgAbs = new Stats();
	
	public Stats vosSOAgrMF = new Stats();
	public Stats vosSOAgrMF_Nom = new Stats();
	public Stats vosSOAgrMF_Acc = new Stats();
	public Stats vosSOAgrMF_NomAcc = new Stats();
	public Stats vosSOAgrMF_Erg = new Stats();
	public Stats vosSOAgrMF_Abs = new Stats();
	public Stats vosSOAgrMF_ErgAbs = new Stats();
	
	public Stats vosSOAgrMFN = new Stats();
	public Stats vosSOAgrMFN_Nom = new Stats();
	public Stats vosSOAgrMFN_Acc = new Stats();
	public Stats vosSOAgrMFN_NomAcc = new Stats();
	public Stats vosSOAgrMFN_Erg = new Stats();
	public Stats vosSOAgrMFN_Abs = new Stats();
	public Stats vosSOAgrMFN_ErgAbs = new Stats();
	
	public Stats vosSOAgrCN = new Stats();
	public Stats vosSOAgrCN_Nom = new Stats();
	public Stats vosSOAgrCN_Acc = new Stats();
	public Stats vosSOAgrCN_NomAcc = new Stats();
	public Stats vosSOAgrCN_Erg = new Stats();
	public Stats vosSOAgrCN_Abs = new Stats();
	public Stats vosSOAgrCN_ErgAbs = new Stats();
	
	public Stats vosSOAgrAI = new Stats();
	public Stats vosSOAgrAI_Nom = new Stats();
	public Stats vosSOAgrAI_Acc = new Stats();
	public Stats vosSOAgrAI_NomAcc = new Stats();
	public Stats vosSOAgrAI_Erg = new Stats();
	public Stats vosSOAgrAI_Abs = new Stats();
	public Stats vosSOAgrAI_ErgAbs = new Stats();
	
	public Stats vosSOAgrHN = new Stats();
	public Stats vosSOAgrHN_Nom = new Stats();
	public Stats vosSOAgrHN_Acc = new Stats();
	public Stats vosSOAgrHN_NomAcc = new Stats();
	public Stats vosSOAgrHN_Erg = new Stats();
	public Stats vosSOAgrHN_Abs = new Stats();
	public Stats vosSOAgrHN_ErgAbs = new Stats();
	
	public Stats vosSOAgrHAI = new Stats();
	public Stats vosSOAgrHAI_Nom = new Stats();
	public Stats vosSOAgrHAI_Acc = new Stats();
	public Stats vosSOAgrHAI_NomAcc = new Stats();
	public Stats vosSOAgrHAI_Erg = new Stats();
	public Stats vosSOAgrHAI_Abs = new Stats();
	public Stats vosSOAgrHAI_ErgAbs = new Stats();
	
	public Stats vosSOAgrMNM = new Stats();
	public Stats vosSOAgrMNM_Nom = new Stats();
	public Stats vosSOAgrMNM_Acc = new Stats();
	public Stats vosSOAgrMNM_NomAcc = new Stats();
	public Stats vosSOAgrMNM_Erg = new Stats();
	public Stats vosSOAgrMNM_Abs = new Stats();
	public Stats vosSOAgrMNM_ErgAbs = new Stats();
	
	public Stats vosSAgr123_SP_MF = new Stats();
	public Stats vosSAgr123_SP_MF_Nom = new Stats();
	public Stats vosSAgr123_SP_MF_Acc = new Stats();
	public Stats vosSAgr123_SP_MF_NomAcc = new Stats();
	public Stats vosSAgr123_SP_MF_Erg = new Stats();
	public Stats vosSAgr123_SP_MF_Abs = new Stats();
	public Stats vosSAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats vosSAgr123_SP_MFN = new Stats();
	public Stats vosSAgr123_SP_MFN_Nom = new Stats();
	public Stats vosSAgr123_SP_MFN_Acc = new Stats();
	public Stats vosSAgr123_SP_MFN_NomAcc = new Stats();
	public Stats vosSAgr123_SP_MFN_Erg = new Stats();
	public Stats vosSAgr123_SP_MFN_Abs = new Stats();
	public Stats vosSAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats vosSAgr123_SP_CN = new Stats();
	public Stats vosSAgr123_SP_CN_Nom = new Stats();
	public Stats vosSAgr123_SP_CN_Acc = new Stats();
	public Stats vosSAgr123_SP_CN_NomAcc = new Stats();
	public Stats vosSAgr123_SP_CN_Erg = new Stats();
	public Stats vosSAgr123_SP_CN_Abs = new Stats();
	public Stats vosSAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats vosSAgr123_SP_AI = new Stats();
	public Stats vosSAgr123_SP_AI_Nom = new Stats();
	public Stats vosSAgr123_SP_AI_Acc = new Stats();
	public Stats vosSAgr123_SP_AI_NomAcc = new Stats();
	public Stats vosSAgr123_SP_AI_Erg = new Stats();
	public Stats vosSAgr123_SP_AI_Abs = new Stats();
	public Stats vosSAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats vosSAgr123_SP_HN = new Stats();
	public Stats vosSAgr123_SP_HN_Nom = new Stats();
	public Stats vosSAgr123_SP_HN_Acc = new Stats();
	public Stats vosSAgr123_SP_HN_NomAcc = new Stats();
	public Stats vosSAgr123_SP_HN_Erg = new Stats();
	public Stats vosSAgr123_SP_HN_Abs = new Stats();
	public Stats vosSAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats vosSAgr123_SP_HAI = new Stats();
	public Stats vosSAgr123_SP_HAI_Nom = new Stats();
	public Stats vosSAgr123_SP_HAI_Acc = new Stats();
	public Stats vosSAgr123_SP_HAI_NomAcc = new Stats();
	public Stats vosSAgr123_SP_HAI_Erg = new Stats();
	public Stats vosSAgr123_SP_HAI_Abs = new Stats();
	public Stats vosSAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats vosSAgr123_SP_MNM = new Stats();
	public Stats vosSAgr123_SP_MNM_Nom = new Stats();
	public Stats vosSAgr123_SP_MNM_Acc = new Stats();
	public Stats vosSAgr123_SP_MNM_NomAcc = new Stats();
	public Stats vosSAgr123_SP_MNM_Erg = new Stats();
	public Stats vosSAgr123_SP_MNM_Abs = new Stats();
	public Stats vosSAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats vosOAgr123_SP_MF = new Stats();
	public Stats vosOAgr123_SP_MF_Nom = new Stats();
	public Stats vosOAgr123_SP_MF_Acc = new Stats();
	public Stats vosOAgr123_SP_MF_NomAcc = new Stats();
	public Stats vosOAgr123_SP_MF_Erg = new Stats();
	public Stats vosOAgr123_SP_MF_Abs = new Stats();
	public Stats vosOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats vosOAgr123_SP_MFN = new Stats();
	public Stats vosOAgr123_SP_MFN_Nom = new Stats();
	public Stats vosOAgr123_SP_MFN_Acc = new Stats();
	public Stats vosOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats vosOAgr123_SP_MFN_Erg = new Stats();
	public Stats vosOAgr123_SP_MFN_Abs = new Stats();
	public Stats vosOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats vosOAgr123_SP_CN = new Stats();
	public Stats vosOAgr123_SP_CN_Nom = new Stats();
	public Stats vosOAgr123_SP_CN_Acc = new Stats();
	public Stats vosOAgr123_SP_CN_NomAcc = new Stats();
	public Stats vosOAgr123_SP_CN_Erg = new Stats();
	public Stats vosOAgr123_SP_CN_Abs = new Stats();
	public Stats vosOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats vosOAgr123_SP_AI = new Stats();
	public Stats vosOAgr123_SP_AI_Nom = new Stats();
	public Stats vosOAgr123_SP_AI_Acc = new Stats();
	public Stats vosOAgr123_SP_AI_NomAcc = new Stats();
	public Stats vosOAgr123_SP_AI_Erg = new Stats();
	public Stats vosOAgr123_SP_AI_Abs = new Stats();
	public Stats vosOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats vosOAgr123_SP_HN = new Stats();
	public Stats vosOAgr123_SP_HN_Nom = new Stats();
	public Stats vosOAgr123_SP_HN_Acc = new Stats();
	public Stats vosOAgr123_SP_HN_NomAcc = new Stats();
	public Stats vosOAgr123_SP_HN_Erg = new Stats();
	public Stats vosOAgr123_SP_HN_Abs = new Stats();
	public Stats vosOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats vosOAgr123_SP_HAI = new Stats();
	public Stats vosOAgr123_SP_HAI_Nom = new Stats();
	public Stats vosOAgr123_SP_HAI_Acc = new Stats();
	public Stats vosOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats vosOAgr123_SP_HAI_Erg = new Stats();
	public Stats vosOAgr123_SP_HAI_Abs = new Stats();
	public Stats vosOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats vosOAgr123_SP_MNM = new Stats();
	public Stats vosOAgr123_SP_MNM_Nom = new Stats();
	public Stats vosOAgr123_SP_MNM_Acc = new Stats();
	public Stats vosOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats vosOAgr123_SP_MNM_Erg = new Stats();
	public Stats vosOAgr123_SP_MNM_Abs = new Stats();
	public Stats vosOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats vosSOAgr123_SP_MF = new Stats();
	public Stats vosSOAgr123_SP_MF_Nom = new Stats();
	public Stats vosSOAgr123_SP_MF_Acc = new Stats();
	public Stats vosSOAgr123_SP_MF_NomAcc = new Stats();
	public Stats vosSOAgr123_SP_MF_Erg = new Stats();
	public Stats vosSOAgr123_SP_MF_Abs = new Stats();
	public Stats vosSOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats vosSOAgr123_SP_MFN = new Stats();
	public Stats vosSOAgr123_SP_MFN_Nom = new Stats();
	public Stats vosSOAgr123_SP_MFN_Acc = new Stats();
	public Stats vosSOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats vosSOAgr123_SP_MFN_Erg = new Stats();
	public Stats vosSOAgr123_SP_MFN_Abs = new Stats();
	public Stats vosSOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats vosSOAgr123_SP_CN = new Stats();
	public Stats vosSOAgr123_SP_CN_Nom = new Stats();
	public Stats vosSOAgr123_SP_CN_Acc = new Stats();
	public Stats vosSOAgr123_SP_CN_NomAcc = new Stats();
	public Stats vosSOAgr123_SP_CN_Erg = new Stats();
	public Stats vosSOAgr123_SP_CN_Abs = new Stats();
	public Stats vosSOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats vosSOAgr123_SP_AI = new Stats();
	public Stats vosSOAgr123_SP_AI_Nom = new Stats();
	public Stats vosSOAgr123_SP_AI_Acc = new Stats();
	public Stats vosSOAgr123_SP_AI_NomAcc = new Stats();
	public Stats vosSOAgr123_SP_AI_Erg = new Stats();
	public Stats vosSOAgr123_SP_AI_Abs = new Stats();
	public Stats vosSOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats vosSOAgr123_SP_HN = new Stats();
	public Stats vosSOAgr123_SP_HN_Nom = new Stats();
	public Stats vosSOAgr123_SP_HN_Acc = new Stats();
	public Stats vosSOAgr123_SP_HN_NomAcc = new Stats();
	public Stats vosSOAgr123_SP_HN_Erg = new Stats();
	public Stats vosSOAgr123_SP_HN_Abs = new Stats();
	public Stats vosSOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats vosSOAgr123_SP_HAI = new Stats();
	public Stats vosSOAgr123_SP_HAI_Nom = new Stats();
	public Stats vosSOAgr123_SP_HAI_Acc = new Stats();
	public Stats vosSOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats vosSOAgr123_SP_HAI_Erg = new Stats();
	public Stats vosSOAgr123_SP_HAI_Abs = new Stats();
	public Stats vosSOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats vosSOAgr123_SP_MNM = new Stats();
	public Stats vosSOAgr123_SP_MNM_Nom = new Stats();
	public Stats vosSOAgr123_SP_MNM_Acc = new Stats();
	public Stats vosSOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats vosSOAgr123_SP_MNM_Erg = new Stats();
	public Stats vosSOAgr123_SP_MNM_Abs = new Stats();
	public Stats vosSOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public VOSTest() {
		all = new Stats[]{vos, /*vosNomOnly, vosAccOnly, vosNomAcc, vosErgOnly, vosAbsOnly, vosErgAbs,
				vosSAgr123, /*vosSAgrWe, vosOAgr123, /*vosOAgrWe, vosSOAgr123, /*vosSOAgr123,
				vosSAgrSP, vosOAgrSP, vosSOAgrSP,
				vosSAgr123_SP, vosSAgr123_SP_Nom, vosSAgr123_SP_Acc, vosSAgr123_SP_NomAcc, vosSAgr123_SP_Erg, vosSAgr123_SP_Abs, vosSAgr123_SP_ErgAbs,
				vosOAgr123_SP, vosOAgr123_SP_Nom, vosOAgr123_SP_Acc, vosOAgr123_SP_NomAcc, vosOAgr123_SP_Erg, vosOAgr123_SP_Abs, vosOAgr123_SP_ErgAbs,
				vosSOAgr123_SP, vosSOAgr123_SP_Nom, vosSOAgr123_SP_Acc, vosSOAgr123_SP_NomAcc, vosSOAgr123_SP_Erg, vosSOAgr123_SP_Abs, vosSOAgr123_SP_ErgAbs,
				vosSAgrMF, vosSAgrMF_Nom, vosSAgrMF_Acc, vosSAgrMF_NomAcc, vosSAgrMF_Erg, vosSAgrMF_Abs, vosSAgrMF_ErgAbs,
				vosSAgrMFN, vosSAgrMFN_Nom, vosSAgrMFN_Acc, vosSAgrMFN_NomAcc, vosSAgrMFN_Erg, vosSAgrMFN_Abs, vosSAgrMFN_ErgAbs,
				vosSAgrCN, vosSAgrCN_Nom, vosSAgrCN_Acc, vosSAgrCN_NomAcc, vosSAgrCN_Erg, vosSAgrCN_Abs, vosSAgrCN_ErgAbs,
				vosSAgrAI, vosSAgrAI_Nom, vosSAgrAI_Acc, vosSAgrAI_NomAcc, vosSAgrAI_Erg, vosSAgrAI_Abs, vosSAgrAI_ErgAbs,
				vosSAgrHN, vosSAgrHN_Nom, vosSAgrHN_Acc, vosSAgrHN_NomAcc, vosSAgrHN_Erg, vosSAgrHN_Abs, vosSAgrHN_ErgAbs,
				vosSAgrHAI, vosSAgrHAI_Nom, vosSAgrHAI_Acc, vosSAgrHAI_NomAcc, vosSAgrHAI_Erg, vosSAgrHAI_Abs, vosSAgrHAI_ErgAbs,
				vosSAgrMNM, vosSAgrMNM_Nom, vosSAgrMNM_Acc, vosSAgrMNM_NomAcc, vosSAgrMNM_Erg, vosSAgrMNM_Abs, vosSAgrMNM_ErgAbs,
				vosOAgrMF, vosOAgrMF_Nom, vosOAgrMF_Acc, vosOAgrMF_NomAcc, vosOAgrMF_Erg, vosOAgrMF_Abs, vosOAgrMF_ErgAbs,
				vosOAgrMFN, vosOAgrMFN_Nom, vosOAgrMFN_Acc, vosOAgrMFN_NomAcc, vosOAgrMFN_Erg, vosOAgrMFN_Abs, vosOAgrMFN_ErgAbs,
				vosOAgrCN, vosOAgrCN_Nom, vosOAgrCN_Acc, vosOAgrCN_NomAcc, vosOAgrCN_Erg, vosOAgrCN_Abs, vosOAgrCN_ErgAbs,
				vosOAgrAI, vosOAgrAI_Nom, vosOAgrAI_Acc, vosOAgrAI_NomAcc, vosOAgrAI_Erg, vosOAgrAI_Abs, vosOAgrAI_ErgAbs,
				vosOAgrHN, vosOAgrHN_Nom, vosOAgrHN_Acc, vosOAgrHN_NomAcc, vosOAgrHN_Erg, vosOAgrHN_Abs, vosOAgrHN_ErgAbs,
				vosOAgrHAI, vosOAgrHAI_Nom, vosOAgrHAI_Acc, vosOAgrHAI_NomAcc, vosOAgrHAI_Erg, vosOAgrHAI_Abs, vosOAgrHAI_ErgAbs,
				vosOAgrMNM, vosOAgrMNM_Nom, vosOAgrMNM_Acc, vosOAgrMNM_NomAcc, vosOAgrMNM_Erg, vosOAgrMNM_Abs, vosOAgrMNM_ErgAbs,
				vosSOAgrMF, vosSOAgrMF_Nom, vosSOAgrMF_Acc, vosSOAgrMF_NomAcc, vosSOAgrMF_Erg, vosSOAgrMF_Abs, vosSOAgrMF_ErgAbs,
				vosSOAgrMFN, vosSOAgrMFN_Nom, vosSOAgrMFN_Acc, vosSOAgrMFN_NomAcc, vosSOAgrMFN_Erg, vosSOAgrMFN_Abs, vosSOAgrMFN_ErgAbs,
				vosSOAgrCN, vosSOAgrCN_Nom, vosSOAgrCN_Acc, vosSOAgrCN_NomAcc, vosSOAgrCN_Erg, vosSOAgrCN_Abs, vosSOAgrCN_ErgAbs,
				vosSOAgrAI, vosSOAgrAI_Nom, vosSOAgrAI_Acc, vosSOAgrAI_NomAcc, vosSOAgrAI_Erg, vosSOAgrAI_Abs, vosSOAgrAI_ErgAbs,
				vosSOAgrHN, vosSOAgrHN_Nom, vosSOAgrHN_Acc, vosSOAgrHN_NomAcc, vosSOAgrHN_Erg, vosSOAgrHN_Abs, vosSOAgrHN_ErgAbs,
				vosSOAgrHAI, vosSOAgrHAI_Nom, vosSOAgrHAI_Acc, vosSOAgrHAI_NomAcc, vosSOAgrHAI_Erg, vosSOAgrHAI_Abs, vosSOAgrHAI_ErgAbs,
				vosSOAgrMNM, vosSOAgrMNM_Nom, vosSOAgrMNM_Acc, vosSOAgrMNM_NomAcc, vosSOAgrMNM_Erg, vosSOAgrMNM_Abs, vosSOAgrMNM_ErgAbs,
				vosSAgr123_SP_MF, vosSAgr123_SP_MF_Nom, vosSAgr123_SP_MF_Acc, vosSAgr123_SP_MF_NomAcc, vosSAgr123_SP_MF_Erg, vosSAgr123_SP_MF_Abs, vosSAgr123_SP_MF_ErgAbs,
				vosSAgr123_SP_MFN, vosSAgr123_SP_MFN_Nom, vosSAgr123_SP_MFN_Acc, vosSAgr123_SP_MFN_NomAcc, vosSAgr123_SP_MFN_Erg, vosSAgr123_SP_MFN_Abs, vosSAgr123_SP_MFN_ErgAbs,
				vosSAgr123_SP_CN, vosSAgr123_SP_CN_Nom, vosSAgr123_SP_CN_Acc, vosSAgr123_SP_CN_NomAcc, vosSAgr123_SP_CN_Erg, vosSAgr123_SP_CN_Abs, vosSAgr123_SP_CN_ErgAbs,
				vosSAgr123_SP_AI, vosSAgr123_SP_AI_Nom, vosSAgr123_SP_AI_Acc, vosSAgr123_SP_AI_NomAcc, vosSAgr123_SP_AI_Erg, vosSAgr123_SP_AI_Abs, vosSAgr123_SP_AI_ErgAbs,
				vosSAgr123_SP_HN, vosSAgr123_SP_HN_Nom, vosSAgr123_SP_HN_Acc, vosSAgr123_SP_HN_NomAcc, vosSAgr123_SP_HN_Erg, vosSAgr123_SP_HN_Abs, vosSAgr123_SP_HN_ErgAbs,
				vosSAgr123_SP_HAI, vosSAgr123_SP_HAI_Nom, vosSAgr123_SP_HAI_Acc, vosSAgr123_SP_HAI_NomAcc, vosSAgr123_SP_HAI_Erg, vosSAgr123_SP_HAI_Abs, vosSAgr123_SP_HAI_ErgAbs,
				vosSAgr123_SP_MNM, vosSAgr123_SP_MNM_Nom, vosSAgr123_SP_MNM_Acc, vosSAgr123_SP_MNM_NomAcc, vosSAgr123_SP_MNM_Erg, vosSAgr123_SP_MNM_Abs, vosSAgr123_SP_MNM_ErgAbs,
				vosOAgr123_SP_MF, vosOAgr123_SP_MF_Nom, vosOAgr123_SP_MF_Acc, vosOAgr123_SP_MF_NomAcc, vosOAgr123_SP_MF_Erg, vosOAgr123_SP_MF_Abs, vosOAgr123_SP_MF_ErgAbs,
				vosOAgr123_SP_MFN, vosOAgr123_SP_MFN_Nom, vosOAgr123_SP_MFN_Acc, vosOAgr123_SP_MFN_NomAcc, vosOAgr123_SP_MFN_Erg, vosOAgr123_SP_MFN_Abs, vosOAgr123_SP_MFN_ErgAbs,
				vosOAgr123_SP_CN, vosOAgr123_SP_CN_Nom, vosOAgr123_SP_CN_Acc, vosOAgr123_SP_CN_NomAcc, vosOAgr123_SP_CN_Erg, vosOAgr123_SP_CN_Abs, vosOAgr123_SP_CN_ErgAbs,
				vosOAgr123_SP_AI, vosOAgr123_SP_AI_Nom, vosOAgr123_SP_AI_Acc, vosOAgr123_SP_AI_NomAcc, vosOAgr123_SP_AI_Erg, vosOAgr123_SP_AI_Abs, vosOAgr123_SP_AI_ErgAbs,
				vosOAgr123_SP_HN, vosOAgr123_SP_HN_Nom, vosOAgr123_SP_HN_Acc, vosOAgr123_SP_HN_NomAcc, vosOAgr123_SP_HN_Erg, vosOAgr123_SP_HN_Abs, vosOAgr123_SP_HN_ErgAbs,
				vosOAgr123_SP_HAI, vosOAgr123_SP_HAI_Nom, vosOAgr123_SP_HAI_Acc, vosOAgr123_SP_HAI_NomAcc, vosOAgr123_SP_HAI_Erg, vosOAgr123_SP_HAI_Abs, vosOAgr123_SP_HAI_ErgAbs,
				vosOAgr123_SP_MNM, vosOAgr123_SP_MNM_Nom, vosOAgr123_SP_MNM_Acc, vosOAgr123_SP_MNM_NomAcc, vosOAgr123_SP_MNM_Erg, vosOAgr123_SP_MNM_Abs, vosOAgr123_SP_MNM_ErgAbs,
				vosSOAgr123_SP_MF, vosSOAgr123_SP_MF_Nom, vosSOAgr123_SP_MF_Acc, vosSOAgr123_SP_MF_NomAcc, vosSOAgr123_SP_MF_Erg, vosSOAgr123_SP_MF_Abs, vosSOAgr123_SP_MF_ErgAbs,
				vosSOAgr123_SP_MFN, vosSOAgr123_SP_MFN_Nom, vosSOAgr123_SP_MFN_Acc, vosSOAgr123_SP_MFN_NomAcc, vosSOAgr123_SP_MFN_Erg, vosSOAgr123_SP_MFN_Abs, vosSOAgr123_SP_MFN_ErgAbs,
				vosSOAgr123_SP_CN, vosSOAgr123_SP_CN_Nom, vosSOAgr123_SP_CN_Acc, vosSOAgr123_SP_CN_NomAcc, vosSOAgr123_SP_CN_Erg, vosSOAgr123_SP_CN_Abs, vosSOAgr123_SP_CN_ErgAbs,
				vosSOAgr123_SP_AI, vosSOAgr123_SP_AI_Nom, vosSOAgr123_SP_AI_Acc, vosSOAgr123_SP_AI_NomAcc, vosSOAgr123_SP_AI_Erg, vosSOAgr123_SP_AI_Abs, vosSOAgr123_SP_AI_ErgAbs,
				vosSOAgr123_SP_HN, vosSOAgr123_SP_HN_Nom, vosSOAgr123_SP_HN_Acc, vosSOAgr123_SP_HN_NomAcc, vosSOAgr123_SP_HN_Erg, vosSOAgr123_SP_HN_Abs, vosSOAgr123_SP_HN_ErgAbs,
				vosSOAgr123_SP_HAI, vosSOAgr123_SP_HAI_Nom, vosSOAgr123_SP_HAI_Acc, vosSOAgr123_SP_HAI_NomAcc, vosSOAgr123_SP_HAI_Erg, vosSOAgr123_SP_HAI_Abs, vosSOAgr123_SP_HAI_ErgAbs,
				vosSOAgr123_SP_MNM, vosSOAgr123_SP_MNM_Nom, vosSOAgr123_SP_MNM_Acc, vosSOAgr123_SP_MNM_NomAcc, vosSOAgr123_SP_MNM_Erg, vosSOAgr123_SP_MNM_Abs, vosSOAgr123_SP_MNM_ErgAbs*/};
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
			BigDecimal pVerbObj = new BigDecimal((double)probs.size());
			
			// compute the entropy of probability of events, given we know what is being done
			// and what is being done to
			// and the noun class of the subj
			for(Event e:events) {
				if(e.verb.equalsIgnoreCase(first.get(conditionCode[i]).word) &&
						e.arg2.equalsIgnoreCase(second.get(conditionCode[i]).word) &&
						e.probability > 0.0) {
					switch(i) {
						case 7: case 9:
							// verb agrees with the subj (case 7) and the subj&obj (case 9) in 1st/2nd/3rd person
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(0)) {
								probs.add(e.probability);
								pVerbObj = pVerbObj.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 10: case 12:
							// verb agrees with the subj (case 10) and the subj&obj (case 12) in sing/pl
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(0)) {
								probs.add(e.probability);
								pVerbObj = pVerbObj.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 13: case 14: case 15: case 16: case 17: case 18: case 19:
						case 27: case 28: case 29: case 30: case 31: case 32: case 33:
							// verb agrees with the subj (cases 13-19) and the subj&obj (cases 27-33) in 1st/2nd/3rd person & sing/pl
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(1)) {
								probs.add(e.probability);
								pVerbObj = pVerbObj.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 34: case 35: case 36: case 37: case 38: case 39: case 40:
						case 41: case 42: case 43: case 44: case 45: case 46: case 47:
						case 48: case 49: case 50: case 51: case 52: case 53: case 54:
						case 55: case 56: case 57: case 58: case 59: case 60: case 61:
						case 62: case 63: case 64: case 65: case 66: case 67: case 68:
						case 69: case 70: case 71: case 72: case 73: case 74: case 75:
						case 76: case 77: case 78: case 79: case 80: case 81: case 82:
						case 132: case 133: case 134: case 135: case 136: case 137: case 138:
						case 139: case 140: case 141: case 142: case 143: case 144: case 145:
						case 146: case 147: case 148: case 149: case 150: case 151: case 152:
						case 153: case 154: case 155: case 156: case 157: case 158: case 159:
						case 160: case 161: case 162: case 163: case 164: case 165: case 166:
						case 167: case 168: case 169: case 170: case 171: case 172: case 173:
						case 174: case 175: case 176: case 177: case 178: case 179: case 180:
							// verb agrees with the subj (cases 34-82) and the subj&obj (cases 132-180) in noun class
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("class").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(0)) {
								probs.add(e.probability);
								pVerbObj = pVerbObj.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 181: case 182: case 183: case 184: case 185: case 186: case 187:
						case 188: case 189: case 190: case 191: case 192: case 193: case 194:
						case 195: case 196: case 197: case 198: case 199: case 200: case 201:
						case 202: case 203: case 204: case 205: case 206: case 207: case 208:
						case 209: case 210: case 211: case 212: case 213: case 214: case 215:
						case 216: case 217: case 218: case 219: case 220: case 221: case 222:
						case 223: case 224: case 225: case 226: case 227: case 228: case 229:
						case 279: case 280: case 281: case 282: case 283: case 284: case 285:
						case 286: case 287: case 288: case 289: case 290: case 291: case 292:
						case 293: case 294: case 295: case 296: case 297: case 298: case 299:
						case 300: case 301: case 302: case 303: case 304: case 305: case 306:
						case 307: case 308: case 309: case 310: case 311: case 312: case 313:
						case 314: case 315: case 316: case 317: case 318: case 319: case 320:
						case 321: case 322: case 323: case 324: case 325: case 326: case 327:
							// verb agrees w/ subj (cases 181-229) and the subj&obj (cases 279-327) in 1st/2nd/3rd per & sing/pl & noun class
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("person").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("number").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(1) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("class").get(0) == first.get(conditionCode[i]).inflection.get("subj").get(2)) {
								probs.add(e.probability);
								pVerbObj = pVerbObj.add(BigDecimal.valueOf(e.probability));
							}
							break;
						default:
							probs.add(e.probability);
							pVerbObj = pVerbObj.add(BigDecimal.valueOf(e.probability));
							break;
					}
				}
			}
			
			eta2 = calcEntropy(probs, pVerbObj);
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
						e.arg2.equalsIgnoreCase(second.get(conditionCode[i]).word) &&
						e.arg1.equalsIgnoreCase(third.get(conditionCode[i]).word) &&
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
		BigDecimal pVO = new BigDecimal(0);
		BigDecimal pOS = new BigDecimal(0);
		BigDecimal pS = new BigDecimal(0);
		BigDecimal pV = new BigDecimal(0);
		BigDecimal pO = new BigDecimal(0);
		
		for(Event e:events) {
			if(e.arg1.equalsIgnoreCase(third.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pS = pS.add(BigDecimal.valueOf(e.probability));
			}
			if(e.verb.equalsIgnoreCase(first.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pV = pV.add(BigDecimal.valueOf(e.probability));
			}
			if(e.arg2.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pO = pO.add(BigDecimal.valueOf(e.probability));
			}
			if(e.verb.equalsIgnoreCase(first.get(conditionCode[0]).word) &&
					e.arg2.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pVO = pVO.add(BigDecimal.valueOf(e.probability));
			}
			if(e.arg2.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.arg1.equalsIgnoreCase(third.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pOS = pOS.add(BigDecimal.valueOf(e.probability));
			}
		}
		
		vos.mi.add(calcMI(pVO, pV, pO).add(calcMI(pOS, pO, pS)));
	}
}
