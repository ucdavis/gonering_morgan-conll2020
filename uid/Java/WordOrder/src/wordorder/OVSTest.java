package wordorder;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;

public class OVSTest extends Test {
	public Stats ovs = new Stats();
	
	public Stats ovsNomOnly = new Stats();
	public Stats ovsAccOnly = new Stats();
	public Stats ovsNomAcc = new Stats();
	public Stats ovsErgOnly = new Stats();
	public Stats ovsAbsOnly = new Stats();
	public Stats ovsErgAbs = new Stats();
	
	public Stats ovsSAgr123 = new Stats();
//	public Stats ovsSAgrWe = new Stats();
	
	public Stats ovsOAgr123 = new Stats();
//	public Stats ovsOAgrWe = new Stats();
	
	public Stats ovsSOAgr123 = new Stats();
//	public Stats ovsSOAgrWe = new Stats();
	
	public Stats ovsSAgrSP = new Stats();
	public Stats ovsOAgrSP = new Stats();
	public Stats ovsSOAgrSP = new Stats();
	
	public Stats ovsSAgr123_SP = new Stats();
	public Stats ovsSAgr123_SP_Nom = new Stats();
	public Stats ovsSAgr123_SP_Acc = new Stats();
	public Stats ovsSAgr123_SP_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_Erg = new Stats();
	public Stats ovsSAgr123_SP_Abs = new Stats();
	public Stats ovsSAgr123_SP_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP = new Stats();
	public Stats ovsOAgr123_SP_Nom = new Stats();
	public Stats ovsOAgr123_SP_Acc = new Stats();
	public Stats ovsOAgr123_SP_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_Erg = new Stats();
	public Stats ovsOAgr123_SP_Abs = new Stats();
	public Stats ovsOAgr123_SP_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP = new Stats();
	public Stats ovsSOAgr123_SP_Nom = new Stats();
	public Stats ovsSOAgr123_SP_Acc = new Stats();
	public Stats ovsSOAgr123_SP_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_Erg = new Stats();
	public Stats ovsSOAgr123_SP_Abs = new Stats();
	public Stats ovsSOAgr123_SP_ErgAbs = new Stats();
	
	public Stats ovsSAgrMF = new Stats();
	public Stats ovsSAgrMF_Nom = new Stats();
	public Stats ovsSAgrMF_Acc = new Stats();
	public Stats ovsSAgrMF_NomAcc = new Stats();
	public Stats ovsSAgrMF_Erg = new Stats();
	public Stats ovsSAgrMF_Abs = new Stats();
	public Stats ovsSAgrMF_ErgAbs = new Stats();
	
	public Stats ovsSAgrMFN = new Stats();
	public Stats ovsSAgrMFN_Nom = new Stats();
	public Stats ovsSAgrMFN_Acc = new Stats();
	public Stats ovsSAgrMFN_NomAcc = new Stats();
	public Stats ovsSAgrMFN_Erg = new Stats();
	public Stats ovsSAgrMFN_Abs = new Stats();
	public Stats ovsSAgrMFN_ErgAbs = new Stats();
	
	public Stats ovsSAgrCN = new Stats();
	public Stats ovsSAgrCN_Nom = new Stats();
	public Stats ovsSAgrCN_Acc = new Stats();
	public Stats ovsSAgrCN_NomAcc = new Stats();
	public Stats ovsSAgrCN_Erg = new Stats();
	public Stats ovsSAgrCN_Abs = new Stats();
	public Stats ovsSAgrCN_ErgAbs = new Stats();
	
	public Stats ovsSAgrAI = new Stats();
	public Stats ovsSAgrAI_Nom = new Stats();
	public Stats ovsSAgrAI_Acc = new Stats();
	public Stats ovsSAgrAI_NomAcc = new Stats();
	public Stats ovsSAgrAI_Erg = new Stats();
	public Stats ovsSAgrAI_Abs = new Stats();
	public Stats ovsSAgrAI_ErgAbs = new Stats();
	
	public Stats ovsSAgrHN = new Stats();
	public Stats ovsSAgrHN_Nom = new Stats();
	public Stats ovsSAgrHN_Acc = new Stats();
	public Stats ovsSAgrHN_NomAcc = new Stats();
	public Stats ovsSAgrHN_Erg = new Stats();
	public Stats ovsSAgrHN_Abs = new Stats();
	public Stats ovsSAgrHN_ErgAbs = new Stats();
	
	public Stats ovsSAgrHAI = new Stats();
	public Stats ovsSAgrHAI_Nom = new Stats();
	public Stats ovsSAgrHAI_Acc = new Stats();
	public Stats ovsSAgrHAI_NomAcc = new Stats();
	public Stats ovsSAgrHAI_Erg = new Stats();
	public Stats ovsSAgrHAI_Abs = new Stats();
	public Stats ovsSAgrHAI_ErgAbs = new Stats();
	
	public Stats ovsSAgrMNM = new Stats();
	public Stats ovsSAgrMNM_Nom = new Stats();
	public Stats ovsSAgrMNM_Acc = new Stats();
	public Stats ovsSAgrMNM_NomAcc = new Stats();
	public Stats ovsSAgrMNM_Erg = new Stats();
	public Stats ovsSAgrMNM_Abs = new Stats();
	public Stats ovsSAgrMNM_ErgAbs = new Stats();
	
	public Stats ovsOAgrMF = new Stats();
	public Stats ovsOAgrMF_Nom = new Stats();
	public Stats ovsOAgrMF_Acc = new Stats();
	public Stats ovsOAgrMF_NomAcc = new Stats();
	public Stats ovsOAgrMF_Erg = new Stats();
	public Stats ovsOAgrMF_Abs = new Stats();
	public Stats ovsOAgrMF_ErgAbs = new Stats();
	
	public Stats ovsOAgrMFN = new Stats();
	public Stats ovsOAgrMFN_Nom = new Stats();
	public Stats ovsOAgrMFN_Acc = new Stats();
	public Stats ovsOAgrMFN_NomAcc = new Stats();
	public Stats ovsOAgrMFN_Erg = new Stats();
	public Stats ovsOAgrMFN_Abs = new Stats();
	public Stats ovsOAgrMFN_ErgAbs = new Stats();
	
	public Stats ovsOAgrCN = new Stats();
	public Stats ovsOAgrCN_Nom = new Stats();
	public Stats ovsOAgrCN_Acc = new Stats();
	public Stats ovsOAgrCN_NomAcc = new Stats();
	public Stats ovsOAgrCN_Erg = new Stats();
	public Stats ovsOAgrCN_Abs = new Stats();
	public Stats ovsOAgrCN_ErgAbs = new Stats();
	
	public Stats ovsOAgrAI = new Stats();
	public Stats ovsOAgrAI_Nom = new Stats();
	public Stats ovsOAgrAI_Acc = new Stats();
	public Stats ovsOAgrAI_NomAcc = new Stats();
	public Stats ovsOAgrAI_Erg = new Stats();
	public Stats ovsOAgrAI_Abs = new Stats();
	public Stats ovsOAgrAI_ErgAbs = new Stats();
	
	public Stats ovsOAgrHN = new Stats();
	public Stats ovsOAgrHN_Nom = new Stats();
	public Stats ovsOAgrHN_Acc = new Stats();
	public Stats ovsOAgrHN_NomAcc = new Stats();
	public Stats ovsOAgrHN_Erg = new Stats();
	public Stats ovsOAgrHN_Abs = new Stats();
	public Stats ovsOAgrHN_ErgAbs = new Stats();
	
	public Stats ovsOAgrHAI = new Stats();
	public Stats ovsOAgrHAI_Nom = new Stats();
	public Stats ovsOAgrHAI_Acc = new Stats();
	public Stats ovsOAgrHAI_NomAcc = new Stats();
	public Stats ovsOAgrHAI_Erg = new Stats();
	public Stats ovsOAgrHAI_Abs = new Stats();
	public Stats ovsOAgrHAI_ErgAbs = new Stats();
	
	public Stats ovsOAgrMNM = new Stats();
	public Stats ovsOAgrMNM_Nom = new Stats();
	public Stats ovsOAgrMNM_Acc = new Stats();
	public Stats ovsOAgrMNM_NomAcc = new Stats();
	public Stats ovsOAgrMNM_Erg = new Stats();
	public Stats ovsOAgrMNM_Abs = new Stats();
	public Stats ovsOAgrMNM_ErgAbs = new Stats();
	
	public Stats ovsSOAgrMF = new Stats();
	public Stats ovsSOAgrMF_Nom = new Stats();
	public Stats ovsSOAgrMF_Acc = new Stats();
	public Stats ovsSOAgrMF_NomAcc = new Stats();
	public Stats ovsSOAgrMF_Erg = new Stats();
	public Stats ovsSOAgrMF_Abs = new Stats();
	public Stats ovsSOAgrMF_ErgAbs = new Stats();
	
	public Stats ovsSOAgrMFN = new Stats();
	public Stats ovsSOAgrMFN_Nom = new Stats();
	public Stats ovsSOAgrMFN_Acc = new Stats();
	public Stats ovsSOAgrMFN_NomAcc = new Stats();
	public Stats ovsSOAgrMFN_Erg = new Stats();
	public Stats ovsSOAgrMFN_Abs = new Stats();
	public Stats ovsSOAgrMFN_ErgAbs = new Stats();
	
	public Stats ovsSOAgrCN = new Stats();
	public Stats ovsSOAgrCN_Nom = new Stats();
	public Stats ovsSOAgrCN_Acc = new Stats();
	public Stats ovsSOAgrCN_NomAcc = new Stats();
	public Stats ovsSOAgrCN_Erg = new Stats();
	public Stats ovsSOAgrCN_Abs = new Stats();
	public Stats ovsSOAgrCN_ErgAbs = new Stats();
	
	public Stats ovsSOAgrAI = new Stats();
	public Stats ovsSOAgrAI_Nom = new Stats();
	public Stats ovsSOAgrAI_Acc = new Stats();
	public Stats ovsSOAgrAI_NomAcc = new Stats();
	public Stats ovsSOAgrAI_Erg = new Stats();
	public Stats ovsSOAgrAI_Abs = new Stats();
	public Stats ovsSOAgrAI_ErgAbs = new Stats();
	
	public Stats ovsSOAgrHN = new Stats();
	public Stats ovsSOAgrHN_Nom = new Stats();
	public Stats ovsSOAgrHN_Acc = new Stats();
	public Stats ovsSOAgrHN_NomAcc = new Stats();
	public Stats ovsSOAgrHN_Erg = new Stats();
	public Stats ovsSOAgrHN_Abs = new Stats();
	public Stats ovsSOAgrHN_ErgAbs = new Stats();
	
	public Stats ovsSOAgrHAI = new Stats();
	public Stats ovsSOAgrHAI_Nom = new Stats();
	public Stats ovsSOAgrHAI_Acc = new Stats();
	public Stats ovsSOAgrHAI_NomAcc = new Stats();
	public Stats ovsSOAgrHAI_Erg = new Stats();
	public Stats ovsSOAgrHAI_Abs = new Stats();
	public Stats ovsSOAgrHAI_ErgAbs = new Stats();
	
	public Stats ovsSOAgrMNM = new Stats();
	public Stats ovsSOAgrMNM_Nom = new Stats();
	public Stats ovsSOAgrMNM_Acc = new Stats();
	public Stats ovsSOAgrMNM_NomAcc = new Stats();
	public Stats ovsSOAgrMNM_Erg = new Stats();
	public Stats ovsSOAgrMNM_Abs = new Stats();
	public Stats ovsSOAgrMNM_ErgAbs = new Stats();
	
	public Stats ovsSAgr123_SP_MF = new Stats();
	public Stats ovsSAgr123_SP_MF_Nom = new Stats();
	public Stats ovsSAgr123_SP_MF_Acc = new Stats();
	public Stats ovsSAgr123_SP_MF_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_MF_Erg = new Stats();
	public Stats ovsSAgr123_SP_MF_Abs = new Stats();
	public Stats ovsSAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats ovsSAgr123_SP_MFN = new Stats();
	public Stats ovsSAgr123_SP_MFN_Nom = new Stats();
	public Stats ovsSAgr123_SP_MFN_Acc = new Stats();
	public Stats ovsSAgr123_SP_MFN_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_MFN_Erg = new Stats();
	public Stats ovsSAgr123_SP_MFN_Abs = new Stats();
	public Stats ovsSAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats ovsSAgr123_SP_CN = new Stats();
	public Stats ovsSAgr123_SP_CN_Nom = new Stats();
	public Stats ovsSAgr123_SP_CN_Acc = new Stats();
	public Stats ovsSAgr123_SP_CN_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_CN_Erg = new Stats();
	public Stats ovsSAgr123_SP_CN_Abs = new Stats();
	public Stats ovsSAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats ovsSAgr123_SP_AI = new Stats();
	public Stats ovsSAgr123_SP_AI_Nom = new Stats();
	public Stats ovsSAgr123_SP_AI_Acc = new Stats();
	public Stats ovsSAgr123_SP_AI_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_AI_Erg = new Stats();
	public Stats ovsSAgr123_SP_AI_Abs = new Stats();
	public Stats ovsSAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats ovsSAgr123_SP_HN = new Stats();
	public Stats ovsSAgr123_SP_HN_Nom = new Stats();
	public Stats ovsSAgr123_SP_HN_Acc = new Stats();
	public Stats ovsSAgr123_SP_HN_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_HN_Erg = new Stats();
	public Stats ovsSAgr123_SP_HN_Abs = new Stats();
	public Stats ovsSAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats ovsSAgr123_SP_HAI = new Stats();
	public Stats ovsSAgr123_SP_HAI_Nom = new Stats();
	public Stats ovsSAgr123_SP_HAI_Acc = new Stats();
	public Stats ovsSAgr123_SP_HAI_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_HAI_Erg = new Stats();
	public Stats ovsSAgr123_SP_HAI_Abs = new Stats();
	public Stats ovsSAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats ovsSAgr123_SP_MNM = new Stats();
	public Stats ovsSAgr123_SP_MNM_Nom = new Stats();
	public Stats ovsSAgr123_SP_MNM_Acc = new Stats();
	public Stats ovsSAgr123_SP_MNM_NomAcc = new Stats();
	public Stats ovsSAgr123_SP_MNM_Erg = new Stats();
	public Stats ovsSAgr123_SP_MNM_Abs = new Stats();
	public Stats ovsSAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP_MF = new Stats();
	public Stats ovsOAgr123_SP_MF_Nom = new Stats();
	public Stats ovsOAgr123_SP_MF_Acc = new Stats();
	public Stats ovsOAgr123_SP_MF_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_MF_Erg = new Stats();
	public Stats ovsOAgr123_SP_MF_Abs = new Stats();
	public Stats ovsOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP_MFN = new Stats();
	public Stats ovsOAgr123_SP_MFN_Nom = new Stats();
	public Stats ovsOAgr123_SP_MFN_Acc = new Stats();
	public Stats ovsOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_MFN_Erg = new Stats();
	public Stats ovsOAgr123_SP_MFN_Abs = new Stats();
	public Stats ovsOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP_CN = new Stats();
	public Stats ovsOAgr123_SP_CN_Nom = new Stats();
	public Stats ovsOAgr123_SP_CN_Acc = new Stats();
	public Stats ovsOAgr123_SP_CN_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_CN_Erg = new Stats();
	public Stats ovsOAgr123_SP_CN_Abs = new Stats();
	public Stats ovsOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP_AI = new Stats();
	public Stats ovsOAgr123_SP_AI_Nom = new Stats();
	public Stats ovsOAgr123_SP_AI_Acc = new Stats();
	public Stats ovsOAgr123_SP_AI_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_AI_Erg = new Stats();
	public Stats ovsOAgr123_SP_AI_Abs = new Stats();
	public Stats ovsOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP_HN = new Stats();
	public Stats ovsOAgr123_SP_HN_Nom = new Stats();
	public Stats ovsOAgr123_SP_HN_Acc = new Stats();
	public Stats ovsOAgr123_SP_HN_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_HN_Erg = new Stats();
	public Stats ovsOAgr123_SP_HN_Abs = new Stats();
	public Stats ovsOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP_HAI = new Stats();
	public Stats ovsOAgr123_SP_HAI_Nom = new Stats();
	public Stats ovsOAgr123_SP_HAI_Acc = new Stats();
	public Stats ovsOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_HAI_Erg = new Stats();
	public Stats ovsOAgr123_SP_HAI_Abs = new Stats();
	public Stats ovsOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats ovsOAgr123_SP_MNM = new Stats();
	public Stats ovsOAgr123_SP_MNM_Nom = new Stats();
	public Stats ovsOAgr123_SP_MNM_Acc = new Stats();
	public Stats ovsOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats ovsOAgr123_SP_MNM_Erg = new Stats();
	public Stats ovsOAgr123_SP_MNM_Abs = new Stats();
	public Stats ovsOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP_MF = new Stats();
	public Stats ovsSOAgr123_SP_MF_Nom = new Stats();
	public Stats ovsSOAgr123_SP_MF_Acc = new Stats();
	public Stats ovsSOAgr123_SP_MF_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_MF_Erg = new Stats();
	public Stats ovsSOAgr123_SP_MF_Abs = new Stats();
	public Stats ovsSOAgr123_SP_MF_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP_MFN = new Stats();
	public Stats ovsSOAgr123_SP_MFN_Nom = new Stats();
	public Stats ovsSOAgr123_SP_MFN_Acc = new Stats();
	public Stats ovsSOAgr123_SP_MFN_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_MFN_Erg = new Stats();
	public Stats ovsSOAgr123_SP_MFN_Abs = new Stats();
	public Stats ovsSOAgr123_SP_MFN_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP_CN = new Stats();
	public Stats ovsSOAgr123_SP_CN_Nom = new Stats();
	public Stats ovsSOAgr123_SP_CN_Acc = new Stats();
	public Stats ovsSOAgr123_SP_CN_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_CN_Erg = new Stats();
	public Stats ovsSOAgr123_SP_CN_Abs = new Stats();
	public Stats ovsSOAgr123_SP_CN_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP_AI = new Stats();
	public Stats ovsSOAgr123_SP_AI_Nom = new Stats();
	public Stats ovsSOAgr123_SP_AI_Acc = new Stats();
	public Stats ovsSOAgr123_SP_AI_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_AI_Erg = new Stats();
	public Stats ovsSOAgr123_SP_AI_Abs = new Stats();
	public Stats ovsSOAgr123_SP_AI_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP_HN = new Stats();
	public Stats ovsSOAgr123_SP_HN_Nom = new Stats();
	public Stats ovsSOAgr123_SP_HN_Acc = new Stats();
	public Stats ovsSOAgr123_SP_HN_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_HN_Erg = new Stats();
	public Stats ovsSOAgr123_SP_HN_Abs = new Stats();
	public Stats ovsSOAgr123_SP_HN_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP_HAI = new Stats();
	public Stats ovsSOAgr123_SP_HAI_Nom = new Stats();
	public Stats ovsSOAgr123_SP_HAI_Acc = new Stats();
	public Stats ovsSOAgr123_SP_HAI_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_HAI_Erg = new Stats();
	public Stats ovsSOAgr123_SP_HAI_Abs = new Stats();
	public Stats ovsSOAgr123_SP_HAI_ErgAbs = new Stats();
	
	public Stats ovsSOAgr123_SP_MNM = new Stats();
	public Stats ovsSOAgr123_SP_MNM_Nom = new Stats();
	public Stats ovsSOAgr123_SP_MNM_Acc = new Stats();
	public Stats ovsSOAgr123_SP_MNM_NomAcc = new Stats();
	public Stats ovsSOAgr123_SP_MNM_Erg = new Stats();
	public Stats ovsSOAgr123_SP_MNM_Abs = new Stats();
	public Stats ovsSOAgr123_SP_MNM_ErgAbs = new Stats();
	
	public OVSTest() {
		all = new Stats[]{ovs, /*ovsNomOnly, ovsAccOnly, ovsNomAcc, ovsErgOnly, ovsAbsOnly, ovsErgAbs,
				ovsSAgr123, /*ovsSAgrWe, ovsOAgr123, /*ovsOAgrWe, ovsSOAgr123, /*ovsSOAgrWe,
				ovsSAgrSP, ovsOAgrSP, ovsSOAgrSP,
				ovsSAgr123_SP, ovsSAgr123_SP_Nom, ovsSAgr123_SP_Acc, ovsSAgr123_SP_NomAcc, ovsSAgr123_SP_Erg, ovsSAgr123_SP_Abs, ovsSAgr123_SP_ErgAbs,
				ovsOAgr123_SP, ovsOAgr123_SP_Nom, ovsOAgr123_SP_Acc, ovsOAgr123_SP_NomAcc, ovsOAgr123_SP_Erg, ovsOAgr123_SP_Abs, ovsOAgr123_SP_ErgAbs,
				ovsSOAgr123_SP, ovsSOAgr123_SP_Nom, ovsSOAgr123_SP_Acc, ovsSOAgr123_SP_NomAcc, ovsSOAgr123_SP_Erg, ovsSOAgr123_SP_Abs, ovsSOAgr123_SP_ErgAbs,
				ovsSAgrMF, ovsSAgrMF_Nom, ovsSAgrMF_Acc, ovsSAgrMF_NomAcc, ovsSAgrMF_Erg, ovsSAgrMF_Abs, ovsSAgrMF_ErgAbs,
				ovsSAgrMFN, ovsSAgrMFN_Nom, ovsSAgrMFN_Acc, ovsSAgrMFN_NomAcc, ovsSAgrMFN_Erg, ovsSAgrMFN_Abs, ovsSAgrMFN_ErgAbs,
				ovsSAgrCN, ovsSAgrCN_Nom, ovsSAgrCN_Acc, ovsSAgrCN_NomAcc, ovsSAgrCN_Erg, ovsSAgrCN_Abs, ovsSAgrCN_ErgAbs,
				ovsSAgrAI, ovsSAgrAI_Nom, ovsSAgrAI_Acc, ovsSAgrAI_NomAcc, ovsSAgrAI_Erg, ovsSAgrAI_Abs, ovsSAgrAI_ErgAbs,
				ovsSAgrHN, ovsSAgrHN_Nom, ovsSAgrHN_Acc, ovsSAgrHN_NomAcc, ovsSAgrHN_Erg, ovsSAgrHN_Abs, ovsSAgrHN_ErgAbs,
				ovsSAgrHAI, ovsSAgrHAI_Nom, ovsSAgrHAI_Acc, ovsSAgrHAI_NomAcc, ovsSAgrHAI_Erg, ovsSAgrHAI_Abs, ovsSAgrHAI_ErgAbs,
				ovsSAgrMNM, ovsSAgrMNM_Nom, ovsSAgrMNM_Acc, ovsSAgrMNM_NomAcc, ovsSAgrMNM_Erg, ovsSAgrMNM_Abs, ovsSAgrMNM_ErgAbs,
				ovsOAgrMF, ovsOAgrMF_Nom, ovsOAgrMF_Acc, ovsOAgrMF_NomAcc, ovsOAgrMF_Erg, ovsOAgrMF_Abs, ovsOAgrMF_ErgAbs,
				ovsOAgrMFN, ovsOAgrMFN_Nom, ovsOAgrMFN_Acc, ovsOAgrMFN_NomAcc, ovsOAgrMFN_Erg, ovsOAgrMFN_Abs, ovsOAgrMFN_ErgAbs,
				ovsOAgrCN, ovsOAgrCN_Nom, ovsOAgrCN_Acc, ovsOAgrCN_NomAcc, ovsOAgrCN_Erg, ovsOAgrCN_Abs, ovsOAgrCN_ErgAbs,
				ovsOAgrAI, ovsOAgrAI_Nom, ovsOAgrAI_Acc, ovsOAgrAI_NomAcc, ovsOAgrAI_Erg, ovsOAgrAI_Abs, ovsOAgrAI_ErgAbs,
				ovsOAgrHN, ovsOAgrHN_Nom, ovsOAgrHN_Acc, ovsOAgrHN_NomAcc, ovsOAgrHN_Erg, ovsOAgrHN_Abs, ovsOAgrHN_ErgAbs,
				ovsOAgrHAI, ovsOAgrHAI_Nom, ovsOAgrHAI_Acc, ovsOAgrHAI_NomAcc, ovsOAgrHAI_Erg, ovsOAgrHAI_Abs, ovsOAgrHAI_ErgAbs,
				ovsOAgrMNM, ovsOAgrMNM_Nom, ovsOAgrMNM_Acc, ovsOAgrMNM_NomAcc, ovsOAgrMNM_Erg, ovsOAgrMNM_Abs, ovsOAgrMNM_ErgAbs,
				ovsSOAgrMF, ovsSOAgrMF_Nom, ovsSOAgrMF_Acc, ovsSOAgrMF_NomAcc, ovsSOAgrMF_Erg, ovsSOAgrMF_Abs, ovsSOAgrMF_ErgAbs,
				ovsSOAgrMFN, ovsSOAgrMFN_Nom, ovsSOAgrMFN_Acc, ovsSOAgrMFN_NomAcc, ovsSOAgrMFN_Erg, ovsSOAgrMFN_Abs, ovsSOAgrMFN_ErgAbs,
				ovsSOAgrCN, ovsSOAgrCN_Nom, ovsSOAgrCN_Acc, ovsSOAgrCN_NomAcc, ovsSOAgrCN_Erg, ovsSOAgrCN_Abs, ovsSOAgrCN_ErgAbs,
				ovsSOAgrAI, ovsSOAgrAI_Nom, ovsSOAgrAI_Acc, ovsSOAgrAI_NomAcc, ovsSOAgrAI_Erg, ovsSOAgrAI_Abs, ovsSOAgrAI_ErgAbs,
				ovsSOAgrHN, ovsSOAgrHN_Nom, ovsSOAgrHN_Acc, ovsSOAgrHN_NomAcc, ovsSOAgrHN_Erg, ovsSOAgrHN_Abs, ovsSOAgrHN_ErgAbs,
				ovsSOAgrHAI, ovsSOAgrHAI_Nom, ovsSOAgrHAI_Acc, ovsSOAgrHAI_NomAcc, ovsSOAgrHAI_Erg, ovsSOAgrHAI_Abs, ovsSOAgrHAI_ErgAbs,
				ovsSOAgrMNM, ovsSOAgrMNM_Nom, ovsSOAgrMNM_Acc, ovsSOAgrMNM_NomAcc, ovsSOAgrMNM_Erg, ovsSOAgrMNM_Abs, ovsSOAgrMNM_ErgAbs,
				ovsSAgr123_SP_MF, ovsSAgr123_SP_MF_Nom, ovsSAgr123_SP_MF_Acc, ovsSAgr123_SP_MF_NomAcc, ovsSAgr123_SP_MF_Erg, ovsSAgr123_SP_MF_Abs, ovsSAgr123_SP_MF_ErgAbs,
				ovsSAgr123_SP_MFN, ovsSAgr123_SP_MFN_Nom, ovsSAgr123_SP_MFN_Acc, ovsSAgr123_SP_MFN_NomAcc, ovsSAgr123_SP_MFN_Erg, ovsSAgr123_SP_MFN_Abs, ovsSAgr123_SP_MFN_ErgAbs,
				ovsSAgr123_SP_CN, ovsSAgr123_SP_CN_Nom, ovsSAgr123_SP_CN_Acc, ovsSAgr123_SP_CN_NomAcc, ovsSAgr123_SP_CN_Erg, ovsSAgr123_SP_CN_Abs, ovsSAgr123_SP_CN_ErgAbs,
				ovsSAgr123_SP_AI, ovsSAgr123_SP_AI_Nom, ovsSAgr123_SP_AI_Acc, ovsSAgr123_SP_AI_NomAcc, ovsSAgr123_SP_AI_Erg, ovsSAgr123_SP_AI_Abs, ovsSAgr123_SP_AI_ErgAbs,
				ovsSAgr123_SP_HN, ovsSAgr123_SP_HN_Nom, ovsSAgr123_SP_HN_Acc, ovsSAgr123_SP_HN_NomAcc, ovsSAgr123_SP_HN_Erg, ovsSAgr123_SP_HN_Abs, ovsSAgr123_SP_HN_ErgAbs,
				ovsSAgr123_SP_HAI, ovsSAgr123_SP_HAI_Nom, ovsSAgr123_SP_HAI_Acc, ovsSAgr123_SP_HAI_NomAcc, ovsSAgr123_SP_HAI_Erg, ovsSAgr123_SP_HAI_Abs, ovsSAgr123_SP_HAI_ErgAbs,
				ovsSAgr123_SP_MNM, ovsSAgr123_SP_MNM_Nom, ovsSAgr123_SP_MNM_Acc, ovsSAgr123_SP_MNM_NomAcc, ovsSAgr123_SP_MNM_Erg, ovsSAgr123_SP_MNM_Abs, ovsSAgr123_SP_MNM_ErgAbs,
				ovsOAgr123_SP_MF, ovsOAgr123_SP_MF_Nom, ovsOAgr123_SP_MF_Acc, ovsOAgr123_SP_MF_NomAcc, ovsOAgr123_SP_MF_Erg, ovsOAgr123_SP_MF_Abs, ovsOAgr123_SP_MF_ErgAbs,
				ovsOAgr123_SP_MFN, ovsOAgr123_SP_MFN_Nom, ovsOAgr123_SP_MFN_Acc, ovsOAgr123_SP_MFN_NomAcc, ovsOAgr123_SP_MFN_Erg, ovsOAgr123_SP_MFN_Abs, ovsOAgr123_SP_MFN_ErgAbs,
				ovsOAgr123_SP_CN, ovsOAgr123_SP_CN_Nom, ovsOAgr123_SP_CN_Acc, ovsOAgr123_SP_CN_NomAcc, ovsOAgr123_SP_CN_Erg, ovsOAgr123_SP_CN_Abs, ovsOAgr123_SP_CN_ErgAbs,
				ovsOAgr123_SP_AI, ovsOAgr123_SP_AI_Nom, ovsOAgr123_SP_AI_Acc, ovsOAgr123_SP_AI_NomAcc, ovsOAgr123_SP_AI_Erg, ovsOAgr123_SP_AI_Abs, ovsOAgr123_SP_AI_ErgAbs,
				ovsOAgr123_SP_HN, ovsOAgr123_SP_HN_Nom, ovsOAgr123_SP_HN_Acc, ovsOAgr123_SP_HN_NomAcc, ovsOAgr123_SP_HN_Erg, ovsOAgr123_SP_HN_Abs, ovsOAgr123_SP_HN_ErgAbs,
				ovsOAgr123_SP_HAI, ovsOAgr123_SP_HAI_Nom, ovsOAgr123_SP_HAI_Acc, ovsOAgr123_SP_HAI_NomAcc, ovsOAgr123_SP_HAI_Erg, ovsOAgr123_SP_HAI_Abs, ovsOAgr123_SP_HAI_ErgAbs,
				ovsOAgr123_SP_MNM, ovsOAgr123_SP_MNM_Nom, ovsOAgr123_SP_MNM_Acc, ovsOAgr123_SP_MNM_NomAcc, ovsOAgr123_SP_MNM_Erg, ovsOAgr123_SP_MNM_Abs, ovsOAgr123_SP_MNM_ErgAbs,
				ovsSOAgr123_SP_MF, ovsSOAgr123_SP_MF_Nom, ovsSOAgr123_SP_MF_Acc, ovsSOAgr123_SP_MF_NomAcc, ovsSOAgr123_SP_MF_Erg, ovsSOAgr123_SP_MF_Abs, ovsSOAgr123_SP_MF_ErgAbs,
				ovsSOAgr123_SP_MFN, ovsSOAgr123_SP_MFN_Nom, ovsSOAgr123_SP_MFN_Acc, ovsSOAgr123_SP_MFN_NomAcc, ovsSOAgr123_SP_MFN_Erg, ovsSOAgr123_SP_MFN_Abs, ovsSOAgr123_SP_MFN_ErgAbs,
				ovsSOAgr123_SP_CN, ovsSOAgr123_SP_CN_Nom, ovsSOAgr123_SP_CN_Acc, ovsSOAgr123_SP_CN_NomAcc, ovsSOAgr123_SP_CN_Erg, ovsSOAgr123_SP_CN_Abs, ovsSOAgr123_SP_CN_ErgAbs,
				ovsSOAgr123_SP_AI, ovsSOAgr123_SP_AI_Nom, ovsSOAgr123_SP_AI_Acc, ovsSOAgr123_SP_AI_NomAcc, ovsSOAgr123_SP_AI_Erg, ovsSOAgr123_SP_AI_Abs, ovsSOAgr123_SP_AI_ErgAbs,
				ovsSOAgr123_SP_HN, ovsSOAgr123_SP_HN_Nom, ovsSOAgr123_SP_HN_Acc, ovsSOAgr123_SP_HN_NomAcc, ovsSOAgr123_SP_HN_Erg, ovsSOAgr123_SP_HN_Abs, ovsSOAgr123_SP_HN_ErgAbs,
				ovsSOAgr123_SP_HAI, ovsSOAgr123_SP_HAI_Nom, ovsSOAgr123_SP_HAI_Acc, ovsSOAgr123_SP_HAI_NomAcc, ovsSOAgr123_SP_HAI_Erg, ovsSOAgr123_SP_HAI_Abs, ovsSOAgr123_SP_HAI_ErgAbs,
				ovsSOAgr123_SP_MNM, ovsSOAgr123_SP_MNM_Nom, ovsSOAgr123_SP_MNM_Acc, ovsSOAgr123_SP_MNM_NomAcc, ovsSOAgr123_SP_MNM_Erg, ovsSOAgr123_SP_MNM_Abs, ovsSOAgr123_SP_MNM_ErgAbs*/};
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

			all[i].eta1.add(eta1);
			all[i].surprisal1.add(calcSurprisal(probs));
			all[i].eventProbs.add(ev.probability);

			double surprisalNorm = 0;
			for(int j = 0; j < probs.size(); j++) {
				surprisalNorm += probs.get(j);
			}
			
			probs = new ArrayList<>();
			BigDecimal pObjVerb = new BigDecimal(0.0);

			for(Event e:events) {
				if(e.arg2.equalsIgnoreCase(first.get(conditionCode[i]).word) &&
						e.verb.equalsIgnoreCase(second.get(conditionCode[i]).word) &&
						e.probability > 0.0) {
					switch(i) {
						case 7: case 9:
							// verb agrees with the subj (case 7) and the subj&obj (case 9) in 1st/2nd/3rd person
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("person").get(0) == second.get(conditionCode[i]).inflection.get("subj").get(0)) {
								probs.add(e.probability);
								pObjVerb = pObjVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 10: case 12:
							// verb agrees with the subj (case 10) and the subj&obj (case 12) in sing/pl
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("number").get(0) == second.get(conditionCode[i]).inflection.get("subj").get(0)) {
								probs.add(e.probability);
								pObjVerb = pObjVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						case 13: case 14: case 15: case 16: case 17: case 18: case 19:
						case 27: case 28: case 29: case 30: case 31: case 32: case 33:
							// verb agrees with the subj (cases 13-19) and the subj&obj (cases 27-33) in 1st/2nd/3rd person & sing/pl
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("person").get(0) == second.get(conditionCode[i]).inflection.get("subj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("number").get(0) == second.get(conditionCode[i]).inflection.get("subj").get(1)) {
								probs.add(e.probability);
								pObjVerb = pObjVerb.add(BigDecimal.valueOf(e.probability));
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
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("class").get(0) == second.get(conditionCode[i]).inflection.get("subj").get(0)) {
								probs.add(e.probability);
								pObjVerb = pObjVerb.add(BigDecimal.valueOf(e.probability));
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
							if(lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("person").get(0) == second.get(conditionCode[i]).inflection.get("subj").get(0) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("number").get(0) == second.get(conditionCode[i]).inflection.get("subj").get(1) &&
									lexicons.get(lexiconCode.get(conditionCode[i])).get(e.arg1).inflection.get("class").get(0) == second.get(conditionCode[i]).inflection.get("subj").get(2)) {
								probs.add(e.probability);
								pObjVerb = pObjVerb.add(BigDecimal.valueOf(e.probability));
							}
							break;
						default:
							probs.add(e.probability);
							pObjVerb = pObjVerb.add(BigDecimal.valueOf(e.probability));
							break;
					}
				}
			}

			eta2 = calcEntropy(probs, pObjVerb);
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
				if(e.arg2.equalsIgnoreCase(first.get(conditionCode[i]).word) &&
						e.verb.equalsIgnoreCase(second.get(conditionCode[i]).word) &&
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
		BigDecimal pOV = new BigDecimal(0);
		BigDecimal pVS = new BigDecimal(0);
		BigDecimal pS = new BigDecimal(0);
		BigDecimal pV = new BigDecimal(0);
		BigDecimal pO = new BigDecimal(0);
		
		for(Event e:events) {
			if(e.arg1.equalsIgnoreCase(third.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pS = pS.add(BigDecimal.valueOf(e.probability));
			}
			if(e.verb.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pV = pV.add(BigDecimal.valueOf(e.probability));
			}
			if(e.arg2.equalsIgnoreCase(first.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pO = pO.add(BigDecimal.valueOf(e.probability));
			}
			if(e.arg2.equalsIgnoreCase(first.get(conditionCode[0]).word) &&
					e.verb.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pOV = pOV.add(BigDecimal.valueOf(e.probability));
			}
			if(e.verb.equalsIgnoreCase(second.get(conditionCode[0]).word) &&
					e.arg1.equalsIgnoreCase(third.get(conditionCode[0]).word) &&
					e.probability > 0.0) {
				pVS = pVS.add(BigDecimal.valueOf(e.probability));
			}
		}
		
		ovs.mi.add(calcMI(pOV, pO, pV).add(calcMI(pVS, pV, pS)));
	}
}
