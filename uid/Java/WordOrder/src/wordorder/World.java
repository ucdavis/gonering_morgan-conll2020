package wordorder;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class World {
	protected ArrayList<Event> events;
	protected HashMap<String, HashMap<String, Word>> lexicons;
	public BigDecimal etaNought;
	protected String corpusPath = new String();
	
	public Stats ideal = new Stats();
	public SVOTest svoTest = new SVOTest();
	public SOVTest sovTest = new SOVTest();
	public VSOTest vsoTest = new VSOTest();
	public VOSTest vosTest = new VOSTest();
	public OSVTest osvTest = new OSVTest();
	public OVSTest ovsTest = new OVSTest();
	
	protected ArrayList<Utterance> utt = new ArrayList<>();
	protected ArrayList<Utterance> nomUtt = new ArrayList<>();
	protected ArrayList<Utterance> accUtt = new ArrayList<>();
	protected ArrayList<Utterance> nomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> ergUtt = new ArrayList<>();
	protected ArrayList<Utterance> absUtt = new ArrayList<>();
	protected ArrayList<Utterance> ergAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgr123Utt = new ArrayList<>();
//	protected ArrayList<Utterance> sAgrWeUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgr123Utt = new ArrayList<>();
//	protected ArrayList<Utterance> oAgrWeUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgr123Utt = new ArrayList<>();
//	protected ArrayList<Utterance> soAgrWeUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgrSPUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrSPUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrSPUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgr123_SPUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgr123_SPUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgr123_SPUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_ErgAbsUtt = new ArrayList<>();
	
//	protected ArrayList<Utterance> sAgrSDPUtt = new ArrayList<>();
//	protected ArrayList<Utterance> oAgrSDPUtt = new ArrayList<>();
//	protected ArrayList<Utterance> soAgrSDPUtt = new ArrayList<>();
//	
//	protected ArrayList<Utterance> sAgrSDPPUtt = new ArrayList<>();
//	protected ArrayList<Utterance> oAgrSDPPUtt = new ArrayList<>();
//	protected ArrayList<Utterance> soAgrSDPPUtt = new ArrayList<>();

//	protected ArrayList<Utterance> sAgrSCUtt = new ArrayList<>();
//	protected ArrayList<Utterance> oAgrSCUtt = new ArrayList<>();
//	protected ArrayList<Utterance> soAgrSCUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgrMFUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMF_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMF_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMF_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMF_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMF_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMF_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgrMFNUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMFN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMFN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMFN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMFN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMFN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMFN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgrCNUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrCN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrCN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrCN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrCN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrCN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrCN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgrAIUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrAI_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrAI_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrAI_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrAI_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrAI_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrAI_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgrHNUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrHN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrHN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrHN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrHN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrHN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrHN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgrHAIUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrHAI_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrHAI_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrHAI_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrHAI_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrHAI_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrHAI_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgrMNMUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMNM_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMNM_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMNM_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMNM_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMNM_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgrMNM_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgrMFUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMF_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMF_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMF_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMF_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMF_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMF_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgrMFNUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMFN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMFN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMFN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMFN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMFN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMFN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgrCNUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrCN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrCN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrCN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrCN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrCN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrCN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgrAIUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrAI_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrAI_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrAI_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrAI_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrAI_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrAI_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgrHNUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrHN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrHN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrHN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrHN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrHN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrHN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgrHAIUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrHAI_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrHAI_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrHAI_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrHAI_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrHAI_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrHAI_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgrMNMUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMNM_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMNM_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMNM_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMNM_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMNM_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgrMNM_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgrMFUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMF_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMF_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMF_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMF_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMF_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMF_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgrMFNUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMFN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMFN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMFN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMFN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMFN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMFN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgrCNUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrCN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrCN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrCN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrCN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrCN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrCN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgrAIUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrAI_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrAI_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrAI_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrAI_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrAI_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrAI_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgrHNUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrHN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrHN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrHN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrHN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrHN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrHN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgrHAIUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrHAI_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrHAI_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrHAI_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrHAI_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrHAI_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrHAI_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgrMNMUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMNM_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMNM_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMNM_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMNM_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMNM_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgrMNM_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgr123_SP_MFUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MF_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MF_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MF_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MF_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MF_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MF_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgr123_SP_MFNUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MFN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MFN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MFN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MFN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MFN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MFN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgr123_SP_CNUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_CN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_CN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_CN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_CN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_CN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_CN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgr123_SP_AIUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_AI_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_AI_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_AI_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_AI_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_AI_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_AI_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgr123_SP_HNUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_HN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_HN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_HN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_HN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_HN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_HN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgr123_SP_HAIUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_HAI_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_HAI_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_HAI_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_HAI_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_HAI_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_HAI_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> sAgr123_SP_MNMUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MNM_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MNM_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MNM_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MNM_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MNM_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> sAgr123_SP_MNM_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgr123_SP_MFUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MF_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MF_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MF_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MF_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MF_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MF_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgr123_SP_MFNUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MFN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MFN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MFN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MFN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MFN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MFN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgr123_SP_CNUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_CN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_CN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_CN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_CN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_CN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_CN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgr123_SP_AIUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_AI_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_AI_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_AI_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_AI_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_AI_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_AI_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgr123_SP_HNUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_HN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_HN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_HN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_HN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_HN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_HN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgr123_SP_HAIUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_HAI_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_HAI_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_HAI_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_HAI_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_HAI_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_HAI_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> oAgr123_SP_MNMUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MNM_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MNM_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MNM_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MNM_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MNM_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> oAgr123_SP_MNM_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgr123_SP_MFUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MF_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MF_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MF_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MF_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MF_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MF_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgr123_SP_MFNUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MFN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MFN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MFN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MFN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MFN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MFN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgr123_SP_CNUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_CN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_CN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_CN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_CN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_CN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_CN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgr123_SP_AIUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_AI_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_AI_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_AI_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_AI_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_AI_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_AI_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgr123_SP_HNUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_HN_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_HN_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_HN_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_HN_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_HN_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_HN_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgr123_SP_HAIUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_HAI_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_HAI_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_HAI_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_HAI_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_HAI_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_HAI_ErgAbsUtt = new ArrayList<>();
	
	protected ArrayList<Utterance> soAgr123_SP_MNMUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MNM_NomUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MNM_AccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MNM_NomAccUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MNM_ErgUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MNM_AbsUtt = new ArrayList<>();
	protected ArrayList<Utterance> soAgr123_SP_MNM_ErgAbsUtt = new ArrayList<>();
	
	public World() {
		this.events = genEvents();
		this.etaNought = baseEntropy(events);
		this.lexicons = genLexicons();
	}
	
	public World(String path) {
		this.corpusPath = path;
		this.events = genEvents();
		this.etaNought = baseEntropy(events);
		this.lexicons = genLexicons();
	}
	
	protected ArrayList<Event> genEvents() {
		return null;
	}

	protected BigDecimal baseEntropy(ArrayList<Event> events) {
		BigDecimal prob = new BigDecimal(0.0);
		
		for(Event e:events) {
			double p = e.probability;
			if (p > 0.0) {
				prob = prob.add(base2Log(p).multiply(BigDecimal.valueOf(p)));
			}
		}
		return prob.multiply(BigDecimal.valueOf(-1.0));
	}
	
	protected HashMap<String, HashMap<String, Word>> genLexicons() {
		return null;
	}
	
	protected NounClass randomNClass(NounClass[] nC) {
		Random r = new Random();
		int i = r.nextInt(nC.length);
		return nC[i];
	}
	
	protected BigDecimal base2Log(double x) {
		BigDecimal eLog = BigDecimal.valueOf(Math.log(x));
		return eLog.divide(BigDecimal.valueOf(Math.log(2.0D)), MathContext.DECIMAL128);
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
	
	public ArrayList<HashMap<String, BigDecimal>> getStats() {
//		ideal.calcEntTraj();
//		ideal.calcInfoProfiles(etaNought);
//		svoTest.calcSummaryStats(etaNought);
//		sovTest.calcSummaryStats(etaNought);
//		vsoTest.calcSummaryStats(etaNought);
//		vosTest.calcSummaryStats(etaNought);
//		osvTest.calcSummaryStats(etaNought);
//		ovsTest.calcSummaryStats(etaNought);
//		BigDecimal[] idealDevScore = ideal.calcMeanEntDevScore(etaNought);
		
		ArrayList<HashMap<String, BigDecimal>> unranked = new ArrayList<HashMap<String, BigDecimal>>();
		HashMap<String, BigDecimal> scores = new HashMap<String, BigDecimal>();
		scores.put("SVO-ent", svoTest.svo.meanEntDevScore);
		scores.put("SOV-ent", sovTest.sov.meanEntDevScore);
		scores.put("VSO-ent", vsoTest.vso.meanEntDevScore);
		scores.put("VOS-ent", vosTest.vos.meanEntDevScore);
		scores.put("OVS-ent", ovsTest.ovs.meanEntDevScore);
		scores.put("OSV-ent", osvTest.osv.meanEntDevScore);
		unranked.add(scores);
		
		scores = new HashMap<String, BigDecimal>();
		scores.put("SVO-surp", svoTest.svo.meanSurpDevScore);
		scores.put("SOV-surp", sovTest.sov.meanSurpDevScore);
		scores.put("VSO-surp", vsoTest.vso.meanSurpDevScore);
		scores.put("VOS-surp", vosTest.vos.meanSurpDevScore);
		scores.put("OVS-surp", ovsTest.ovs.meanSurpDevScore);
		scores.put("OSV-surp", osvTest.osv.meanSurpDevScore);
		unranked.add(scores);
		
		scores = new HashMap<String, BigDecimal>();
		scores.put("SVO-mi", svoTest.svo.meanMI);
		scores.put("SOV-mi", sovTest.sov.meanMI);
		scores.put("VSO-mi", vsoTest.vso.meanMI);
		scores.put("VOS-mi", vosTest.vos.meanMI);
		scores.put("OVS-mi", ovsTest.ovs.meanMI);
		scores.put("OSV-mi", osvTest.osv.meanMI);
		unranked.add(scores);
		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-nom", svoTest.svoNomOnly.meanDevScore);
//		scores.put("SOV-nom", sovTest.sovNomOnly.meanDevScore);
//		scores.put("VSO-nom", vsoTest.vsoNomOnly.meanDevScore);
//		scores.put("VOS-nom", vosTest.vosNomOnly.meanDevScore);
//		scores.put("OVS-nom", ovsTest.ovsNomOnly.meanDevScore);
//		scores.put("OSV-nom", osvTest.osvNomOnly.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-acc", svoTest.svoAccOnly.meanDevScore);
//		scores.put("SOV-acc", sovTest.sovAccOnly.meanDevScore);
//		scores.put("VSO-acc", vsoTest.vsoAccOnly.meanDevScore);
//		scores.put("VOS-acc", vosTest.vosAccOnly.meanDevScore);
//		scores.put("OVS-acc", ovsTest.ovsAccOnly.meanDevScore);
//		scores.put("OSV-acc", osvTest.osvAccOnly.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-nomacc", svoTest.svoNomAcc.meanDevScore);
//		scores.put("SOV-nomacc", sovTest.sovNomAcc.meanDevScore);
//		scores.put("VSO-nomacc", vsoTest.vsoNomAcc.meanDevScore);
//		scores.put("VOS-nomacc", vosTest.vosNomAcc.meanDevScore);
//		scores.put("OVS-nomacc", ovsTest.ovsNomAcc.meanDevScore);
//		scores.put("OSV-nomacc", osvTest.osvNomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-erg", svoTest.svoErgOnly.meanDevScore);
//		scores.put("SOV-erg", sovTest.sovErgOnly.meanDevScore);
//		scores.put("VSO-erg", vsoTest.vsoErgOnly.meanDevScore);
//		scores.put("VOS-erg", vosTest.vosErgOnly.meanDevScore);
//		scores.put("OVS-erg", ovsTest.ovsErgOnly.meanDevScore);
//		scores.put("OSV-erg", osvTest.osvErgOnly.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-abs", svoTest.svoAbsOnly.meanDevScore);
//		scores.put("SOV-abs", sovTest.sovAbsOnly.meanDevScore);
//		scores.put("VSO-abs", vsoTest.vsoAbsOnly.meanDevScore);
//		scores.put("VOS-abs", vosTest.vosAbsOnly.meanDevScore);
//		scores.put("OVS-abs", ovsTest.ovsAbsOnly.meanDevScore);
//		scores.put("OSV-abs", osvTest.osvAbsOnly.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-ergabs", svoTest.svoErgAbs.meanDevScore);
//		scores.put("SOV-ergabs", sovTest.sovErgAbs.meanDevScore);
//		scores.put("VSO-ergabs", vsoTest.vsoErgAbs.meanDevScore);
//		scores.put("VOS-ergabs", vosTest.vosErgAbs.meanDevScore);
//		scores.put("OVS-ergabs", ovsTest.ovsErgAbs.meanDevScore);
//		scores.put("OSV-ergabs", osvTest.osvErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123", svoTest.svoSAgr123.meanDevScore);
//		scores.put("SOV-s:123", sovTest.sovSAgr123.meanDevScore);
//		scores.put("VSO-s:123", vsoTest.vsoSAgr123.meanDevScore);
//		scores.put("VOS-s:123", vosTest.vosSAgr123.meanDevScore);
//		scores.put("OVS-s:123", ovsTest.ovsSAgr123.meanDevScore);
//		scores.put("OSV-s:123", osvTest.osvSAgr123.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123", svoTest.svoOAgr123.meanDevScore);
//		scores.put("SOV-o:123", sovTest.sovOAgr123.meanDevScore);
//		scores.put("VSO-o:123", vsoTest.vsoOAgr123.meanDevScore);
//		scores.put("VOS-o:123", vosTest.vosOAgr123.meanDevScore);
//		scores.put("OVS-o:123", ovsTest.ovsOAgr123.meanDevScore);
//		scores.put("OSV-o:123", osvTest.osvOAgr123.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123", svoTest.svoSOAgr123.meanDevScore);
//		scores.put("SOV-so:123", sovTest.sovSOAgr123.meanDevScore);
//		scores.put("VSO-so:123", vsoTest.vsoSOAgr123.meanDevScore);
//		scores.put("VOS-so:123", vosTest.vosSOAgr123.meanDevScore);
//		scores.put("OVS-so:123", ovsTest.ovsSOAgr123.meanDevScore);
//		scores.put("OSV-so:123", osvTest.osvSOAgr123.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:sp", svoTest.svoSAgrSP.meanDevScore);
//		scores.put("SOV-s:sp", sovTest.sovSAgrSP.meanDevScore);
//		scores.put("VSO-s:sp", vsoTest.vsoSAgrSP.meanDevScore);
//		scores.put("VOS-s:sp", vosTest.vosSAgrSP.meanDevScore);
//		scores.put("OVS-s:sp", ovsTest.ovsSAgrSP.meanDevScore);
//		scores.put("OSV-s:sp", osvTest.osvSAgrSP.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:sp", svoTest.svoOAgrSP.meanDevScore);
//		scores.put("SOV-o:sp", sovTest.sovOAgrSP.meanDevScore);
//		scores.put("VSO-o:sp", vsoTest.vsoOAgrSP.meanDevScore);
//		scores.put("VOS-o:sp", vosTest.vosOAgrSP.meanDevScore);
//		scores.put("OVS-o:sp", ovsTest.ovsOAgrSP.meanDevScore);
//		scores.put("OSV-o:sp", osvTest.osvOAgrSP.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:sp", svoTest.svoSOAgrSP.meanDevScore);
//		scores.put("SOV-so:sp", sovTest.sovSOAgrSP.meanDevScore);
//		scores.put("VSO-so:sp", vsoTest.vsoSOAgrSP.meanDevScore);
//		scores.put("VOS-so:sp", vosTest.vosSOAgrSP.meanDevScore);
//		scores.put("OVS-so:sp", ovsTest.ovsSOAgrSP.meanDevScore);
//		scores.put("OSV-so:sp", osvTest.osvSOAgrSP.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp", svoTest.svoSAgr123_SP.meanDevScore);
//		scores.put("SOV-s:123+sp", sovTest.sovSAgr123_SP.meanDevScore);
//		scores.put("VSO-s:123+sp", vsoTest.vsoSAgr123_SP.meanDevScore);
//		scores.put("VOS-s:123+sp", vosTest.vosSAgr123_SP.meanDevScore);
//		scores.put("OVS-s:123+sp", ovsTest.ovsSAgr123_SP.meanDevScore);
//		scores.put("OSV-s:123+sp", osvTest.osvSAgr123_SP.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp", svoTest.svoOAgr123_SP.meanDevScore);
//		scores.put("SOV-o:123+sp", sovTest.sovOAgr123_SP.meanDevScore);
//		scores.put("VSO-o:123+sp", vsoTest.vsoOAgr123_SP.meanDevScore);
//		scores.put("VOS-o:123+sp", vosTest.vosOAgr123_SP.meanDevScore);
//		scores.put("OVS-o:123+sp", ovsTest.ovsOAgr123_SP.meanDevScore);
//		scores.put("OSV-o:123+sp", osvTest.osvOAgr123_SP.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp", svoTest.svoSOAgr123_SP.meanDevScore);
//		scores.put("SOV-so:123+sp", sovTest.sovSOAgr123_SP.meanDevScore);
//		scores.put("VSO-so:123+sp", vsoTest.vsoSOAgr123_SP.meanDevScore);
//		scores.put("VOS-so:123+sp", vosTest.vosSOAgr123_SP.meanDevScore);
//		scores.put("OVS-so:123+sp", ovsTest.ovsSOAgr123_SP.meanDevScore);
//		scores.put("OSV-so:123+sp", osvTest.osvSOAgr123_SP.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mf", svoTest.svoSAgrMF.meanDevScore);
//		scores.put("SOV-s:mf", sovTest.sovSAgrMF.meanDevScore);
//		scores.put("VSO-s:mf", vsoTest.vsoSAgrMF.meanDevScore);
//		scores.put("VOS-s:mf", vosTest.vosSAgrMF.meanDevScore);
//		scores.put("OVS-s:mf", ovsTest.ovsSAgrMF.meanDevScore);
//		scores.put("OSV-s:mf", osvTest.osvSAgrMF.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mf+nom", svoTest.svoSAgrMF_Nom.meanDevScore);
//		scores.put("SOV-s:mf+nom", sovTest.sovSAgrMF_Nom.meanDevScore);
//		scores.put("VSO-s:mf+nom", vsoTest.vsoSAgrMF_Nom.meanDevScore);
//		scores.put("VOS-s:mf+nom", vosTest.vosSAgrMF_Nom.meanDevScore);
//		scores.put("OVS-s:mf+nom", ovsTest.ovsSAgrMF_Nom.meanDevScore);
//		scores.put("OSV-s:mf+nom", osvTest.osvSAgrMF_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mf+acc", svoTest.svoSAgrMF_Acc.meanDevScore);
//		scores.put("SOV-s:mf+acc", sovTest.sovSAgrMF_Acc.meanDevScore);
//		scores.put("VSO-s:mf+acc", vsoTest.vsoSAgrMF_Acc.meanDevScore);
//		scores.put("VOS-s:mf+acc", vosTest.vosSAgrMF_Acc.meanDevScore);
//		scores.put("OVS-s:mf+acc", ovsTest.ovsSAgrMF_Acc.meanDevScore);
//		scores.put("OSV-s:mf+acc", osvTest.osvSAgrMF_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mf+nomacc", svoTest.svoSAgrMF_NomAcc.meanDevScore);
//		scores.put("SOV-s:mf+nomacc", sovTest.sovSAgrMF_NomAcc.meanDevScore);
//		scores.put("VSO-s:mf+nomacc", vsoTest.vsoSAgrMF_NomAcc.meanDevScore);
//		scores.put("VOS-s:mf+nomacc", vosTest.vosSAgrMF_NomAcc.meanDevScore);
//		scores.put("OVS-s:mf+nomacc", ovsTest.ovsSAgrMF_NomAcc.meanDevScore);
//		scores.put("OSV-s:mf+nomacc", osvTest.osvSAgrMF_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mf+erg", svoTest.svoSAgrMF_Erg.meanDevScore);
//		scores.put("SOV-s:mf+erg", sovTest.sovSAgrMF_Erg.meanDevScore);
//		scores.put("VSO-s:mf+erg", vsoTest.vsoSAgrMF_Erg.meanDevScore);
//		scores.put("VOS-s:mf+erg", vosTest.vosSAgrMF_Erg.meanDevScore);
//		scores.put("OVS-s:mf+erg", ovsTest.ovsSAgrMF_Erg.meanDevScore);
//		scores.put("OSV-s:mf+erg", osvTest.osvSAgrMF_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mf+abs", svoTest.svoSAgrMF_Abs.meanDevScore);
//		scores.put("SOV-s:mf+abs", sovTest.sovSAgrMF_Abs.meanDevScore);
//		scores.put("VSO-s:mf+abs", vsoTest.vsoSAgrMF_Abs.meanDevScore);
//		scores.put("VOS-s:mf+abs", vosTest.vosSAgrMF_Abs.meanDevScore);
//		scores.put("OVS-s:mf+abs", ovsTest.ovsSAgrMF_Abs.meanDevScore);
//		scores.put("OSV-s:mf+abs", osvTest.osvSAgrMF_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mf+ergabs", svoTest.svoSAgrMF_ErgAbs.meanDevScore);
//		scores.put("SOV-s:mf+ergabs", sovTest.sovSAgrMF_ErgAbs.meanDevScore);
//		scores.put("VSO-s:mf+ergabs", vsoTest.vsoSAgrMF_ErgAbs.meanDevScore);
//		scores.put("VOS-s:mf+ergabs", vosTest.vosSAgrMF_ErgAbs.meanDevScore);
//		scores.put("OVS-s:mf+ergabs", ovsTest.ovsSAgrMF_ErgAbs.meanDevScore);
//		scores.put("OSV-s:mf+ergabs", osvTest.osvSAgrMF_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mfn", svoTest.svoSAgrMFN.meanDevScore);
//		scores.put("SOV-s:mfn", sovTest.sovSAgrMFN.meanDevScore);
//		scores.put("VSO-s:mfn", vsoTest.vsoSAgrMFN.meanDevScore);
//		scores.put("VOS-s:mfn", vosTest.vosSAgrMFN.meanDevScore);
//		scores.put("OVS-s:mfn", ovsTest.ovsSAgrMFN.meanDevScore);
//		scores.put("OSV-s:mfn", osvTest.osvSAgrMFN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mfn+nom", svoTest.svoSAgrMFN_Nom.meanDevScore);
//		scores.put("SOV-s:mfn+nom", sovTest.sovSAgrMFN_Nom.meanDevScore);
//		scores.put("VSO-s:mfn+nom", vsoTest.vsoSAgrMFN_Nom.meanDevScore);
//		scores.put("VOS-s:mfn+nom", vosTest.vosSAgrMFN_Nom.meanDevScore);
//		scores.put("OVS-s:mfn+nom", ovsTest.ovsSAgrMFN_Nom.meanDevScore);
//		scores.put("OSV-s:mfn+nom", osvTest.osvSAgrMFN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mfn+acc", svoTest.svoSAgrMFN_Acc.meanDevScore);
//		scores.put("SOV-s:mfn+acc", sovTest.sovSAgrMFN_Acc.meanDevScore);
//		scores.put("VSO-s:mfn+acc", vsoTest.vsoSAgrMFN_Acc.meanDevScore);
//		scores.put("VOS-s:mfn+acc", vosTest.vosSAgrMFN_Acc.meanDevScore);
//		scores.put("OVS-s:mfn+acc", ovsTest.ovsSAgrMFN_Acc.meanDevScore);
//		scores.put("OSV-s:mfn+acc", osvTest.osvSAgrMFN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mfn+nomacc", svoTest.svoSAgrMFN_NomAcc.meanDevScore);
//		scores.put("SOV-s:mfn+nomacc", sovTest.sovSAgrMFN_NomAcc.meanDevScore);
//		scores.put("VSO-s:mfn+nomacc", vsoTest.vsoSAgrMFN_NomAcc.meanDevScore);
//		scores.put("VOS-s:mfn+nomacc", vosTest.vosSAgrMFN_NomAcc.meanDevScore);
//		scores.put("OVS-s:mfn+nomacc", ovsTest.ovsSAgrMFN_NomAcc.meanDevScore);
//		scores.put("OSV-s:mfn+nomacc", osvTest.osvSAgrMFN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mfn+erg", svoTest.svoSAgrMFN_Erg.meanDevScore);
//		scores.put("SOV-s:mfn+erg", sovTest.sovSAgrMFN_Erg.meanDevScore);
//		scores.put("VSO-s:mfn+erg", vsoTest.vsoSAgrMFN_Erg.meanDevScore);
//		scores.put("VOS-s:mfn+erg", vosTest.vosSAgrMFN_Erg.meanDevScore);
//		scores.put("OVS-s:mfn+erg", ovsTest.ovsSAgrMFN_Erg.meanDevScore);
//		scores.put("OSV-s:mfn+erg", osvTest.osvSAgrMFN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mfn+abs", svoTest.svoSAgrMFN_Abs.meanDevScore);
//		scores.put("SOV-s:mfn+abs", sovTest.sovSAgrMFN_Abs.meanDevScore);
//		scores.put("VSO-s:mfn+abs", vsoTest.vsoSAgrMFN_Abs.meanDevScore);
//		scores.put("VOS-s:mfn+abs", vosTest.vosSAgrMFN_Abs.meanDevScore);
//		scores.put("OVS-s:mfn+abs", ovsTest.ovsSAgrMFN_Abs.meanDevScore);
//		scores.put("OSV-s:mfn+abs", osvTest.osvSAgrMFN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mfn+ergabs", svoTest.svoSAgrMFN_ErgAbs.meanDevScore);
//		scores.put("SOV-s:mfn+ergabs", sovTest.sovSAgrMFN_ErgAbs.meanDevScore);
//		scores.put("VSO-s:mfn+ergabs", vsoTest.vsoSAgrMFN_ErgAbs.meanDevScore);
//		scores.put("VOS-s:mfn+ergabs", vosTest.vosSAgrMFN_ErgAbs.meanDevScore);
//		scores.put("OVS-s:mfn+ergabs", ovsTest.ovsSAgrMFN_ErgAbs.meanDevScore);
//		scores.put("OSV-s:mfn+ergabs", osvTest.osvSAgrMFN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:cn", svoTest.svoSAgrCN.meanDevScore);
//		scores.put("SOV-s:cn", sovTest.sovSAgrCN.meanDevScore);
//		scores.put("VSO-s:cn", vsoTest.vsoSAgrCN.meanDevScore);
//		scores.put("VOS-s:cn", vosTest.vosSAgrCN.meanDevScore);
//		scores.put("OVS-s:cn", ovsTest.ovsSAgrCN.meanDevScore);
//		scores.put("OSV-s:cn", osvTest.osvSAgrCN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:cn+nom", svoTest.svoSAgrCN_Nom.meanDevScore);
//		scores.put("SOV-s:cn+nom", sovTest.sovSAgrCN_Nom.meanDevScore);
//		scores.put("VSO-s:cn+nom", vsoTest.vsoSAgrCN_Nom.meanDevScore);
//		scores.put("VOS-s:cn+nom", vosTest.vosSAgrCN_Nom.meanDevScore);
//		scores.put("OVS-s:cn+nom", ovsTest.ovsSAgrCN_Nom.meanDevScore);
//		scores.put("OSV-s:cn+nom", osvTest.osvSAgrCN_Nom.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:cn+acc", svoTest.svoSAgrCN_Acc.meanDevScore);
//		scores.put("SOV-s:cn+acc", sovTest.sovSAgrCN_Acc.meanDevScore);
//		scores.put("VSO-s:cn+acc", vsoTest.vsoSAgrCN_Acc.meanDevScore);
//		scores.put("VOS-s:cn+acc", vosTest.vosSAgrCN_Acc.meanDevScore);
//		scores.put("OVS-s:cn+acc", ovsTest.ovsSAgrCN_Acc.meanDevScore);
//		scores.put("OSV-s:cn+acc", osvTest.osvSAgrCN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:cn+nomacc", svoTest.svoSAgrCN_NomAcc.meanDevScore);
//		scores.put("SOV-s:cn+nomacc", sovTest.sovSAgrCN_NomAcc.meanDevScore);
//		scores.put("VSO-s:cn+nomacc", vsoTest.vsoSAgrCN_NomAcc.meanDevScore);
//		scores.put("VOS-s:cn+nomacc", vosTest.vosSAgrCN_NomAcc.meanDevScore);
//		scores.put("OVS-s:cn+nomacc", ovsTest.ovsSAgrCN_NomAcc.meanDevScore);
//		scores.put("OSV-s:cn+nomacc", osvTest.osvSAgrCN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:cn+erg", svoTest.svoSAgrCN_Erg.meanDevScore);
//		scores.put("SOV-s:cn+erg", sovTest.sovSAgrCN_Erg.meanDevScore);
//		scores.put("VSO-s:cn+erg", vsoTest.vsoSAgrCN_Erg.meanDevScore);
//		scores.put("VOS-s:cn+erg", vosTest.vosSAgrCN_Erg.meanDevScore);
//		scores.put("OVS-s:cn+erg", ovsTest.ovsSAgrCN_Erg.meanDevScore);
//		scores.put("OSV-s:cn+erg", osvTest.osvSAgrCN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:cn+abs", svoTest.svoSAgrCN_Abs.meanDevScore);
//		scores.put("SOV-s:cn+abs", sovTest.sovSAgrCN_Abs.meanDevScore);
//		scores.put("VSO-s:cn+abs", vsoTest.vsoSAgrCN_Abs.meanDevScore);
//		scores.put("VOS-s:cn+abs", vosTest.vosSAgrCN_Abs.meanDevScore);
//		scores.put("OVS-s:cn+abs", ovsTest.ovsSAgrCN_Abs.meanDevScore);
//		scores.put("OSV-s:cn+abs", osvTest.osvSAgrCN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:cn+ergabs", svoTest.svoSAgrCN_ErgAbs.meanDevScore);
//		scores.put("SOV-s:cn+ergabs", sovTest.sovSAgrCN_ErgAbs.meanDevScore);
//		scores.put("VSO-s:cn+ergabs", vsoTest.vsoSAgrCN_ErgAbs.meanDevScore);
//		scores.put("VOS-s:cn+ergabs", vosTest.vosSAgrCN_ErgAbs.meanDevScore);
//		scores.put("OVS-s:cn+ergabs", ovsTest.ovsSAgrCN_ErgAbs.meanDevScore);
//		scores.put("OSV-s:cn+ergabs", osvTest.osvSAgrCN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:ai", svoTest.svoSAgrAI.meanDevScore);
//		scores.put("SOV-s:ai", sovTest.sovSAgrAI.meanDevScore);
//		scores.put("VSO-s:ai", vsoTest.vsoSAgrAI.meanDevScore);
//		scores.put("VOS-s:ai", vosTest.vosSAgrAI.meanDevScore);
//		scores.put("OVS-s:ai", ovsTest.ovsSAgrAI.meanDevScore);
//		scores.put("OSV-s:ai", osvTest.osvSAgrAI.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:ai+nom", svoTest.svoSAgrAI_Nom.meanDevScore);
//		scores.put("SOV-s:ai+nom", sovTest.sovSAgrAI_Nom.meanDevScore);
//		scores.put("VSO-s:ai+nom", vsoTest.vsoSAgrAI_Nom.meanDevScore);
//		scores.put("VOS-s:ai+nom", vosTest.vosSAgrAI_Nom.meanDevScore);
//		scores.put("OVS-s:ai+nom", ovsTest.ovsSAgrAI_Nom.meanDevScore);
//		scores.put("OSV-s:ai+nom", osvTest.osvSAgrAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:ai+acc", svoTest.svoSAgrAI_Acc.meanDevScore);
//		scores.put("SOV-s:ai+acc", sovTest.sovSAgrAI_Acc.meanDevScore);
//		scores.put("VSO-s:ai+acc", vsoTest.vsoSAgrAI_Acc.meanDevScore);
//		scores.put("VOS-s:ai+acc", vosTest.vosSAgrAI_Acc.meanDevScore);
//		scores.put("OVS-s:ai+acc", ovsTest.ovsSAgrAI_Acc.meanDevScore);
//		scores.put("OSV-s:ai+acc", osvTest.osvSAgrAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:ai+nomacc", svoTest.svoSAgrAI_NomAcc.meanDevScore);
//		scores.put("SOV-s:ai+nomacc", sovTest.sovSAgrAI_NomAcc.meanDevScore);
//		scores.put("VSO-s:ai+nomacc", vsoTest.vsoSAgrAI_NomAcc.meanDevScore);
//		scores.put("VOS-s:ai+nomacc", vosTest.vosSAgrAI_NomAcc.meanDevScore);
//		scores.put("OVS-s:ai+nomacc", ovsTest.ovsSAgrAI_NomAcc.meanDevScore);
//		scores.put("OSV-s:ai+nomacc", osvTest.osvSAgrAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:ai+erg", svoTest.svoSAgrAI_Erg.meanDevScore);
//		scores.put("SOV-s:ai+erg", sovTest.sovSAgrAI_Erg.meanDevScore);
//		scores.put("VSO-s:ai+erg", vsoTest.vsoSAgrAI_Erg.meanDevScore);
//		scores.put("VOS-s:ai+erg", vosTest.vosSAgrAI_Erg.meanDevScore);
//		scores.put("OVS-s:ai+erg", ovsTest.ovsSAgrAI_Erg.meanDevScore);
//		scores.put("OSV-s:ai+erg", osvTest.osvSAgrAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:ai+abs", svoTest.svoSAgrAI_Abs.meanDevScore);
//		scores.put("SOV-s:ai+abs", sovTest.sovSAgrAI_Abs.meanDevScore);
//		scores.put("VSO-s:ai+abs", vsoTest.vsoSAgrAI_Abs.meanDevScore);
//		scores.put("VOS-s:ai+abs", vosTest.vosSAgrAI_Abs.meanDevScore);
//		scores.put("OVS-s:ai+abs", ovsTest.ovsSAgrAI_Abs.meanDevScore);
//		scores.put("OSV-s:ai+abs", osvTest.osvSAgrAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:ai+ergabs", svoTest.svoSAgrAI_ErgAbs.meanDevScore);
//		scores.put("SOV-s:ai+ergabs", sovTest.sovSAgrAI_ErgAbs.meanDevScore);
//		scores.put("VSO-s:ai+ergabs", vsoTest.vsoSAgrAI_ErgAbs.meanDevScore);
//		scores.put("VOS-s:ai+ergabs", vosTest.vosSAgrAI_ErgAbs.meanDevScore);
//		scores.put("OVS-s:ai+ergabs", ovsTest.ovsSAgrAI_ErgAbs.meanDevScore);
//		scores.put("OSV-s:ai+ergabs", osvTest.osvSAgrAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hn", svoTest.svoSAgrHN.meanDevScore);
//		scores.put("SOV-s:hn", sovTest.sovSAgrHN.meanDevScore);
//		scores.put("VSO-s:hn", vsoTest.vsoSAgrHN.meanDevScore);
//		scores.put("VOS-s:hn", vosTest.vosSAgrHN.meanDevScore);
//		scores.put("OVS-s:hn", ovsTest.ovsSAgrHN.meanDevScore);
//		scores.put("OSV-s:hn", osvTest.osvSAgrHN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hn+nom", svoTest.svoSAgrHN_Nom.meanDevScore);
//		scores.put("SOV-s:hn+nom", sovTest.sovSAgrHN_Nom.meanDevScore);
//		scores.put("VSO-s:hn+nom", vsoTest.vsoSAgrHN_Nom.meanDevScore);
//		scores.put("VOS-s:hn+nom", vosTest.vosSAgrHN_Nom.meanDevScore);
//		scores.put("OVS-s:hn+nom", ovsTest.ovsSAgrHN_Nom.meanDevScore);
//		scores.put("OSV-s:hn+nom", osvTest.osvSAgrHN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hn+acc", svoTest.svoSAgrHN_Acc.meanDevScore);
//		scores.put("SOV-s:hn+acc", sovTest.sovSAgrHN_Acc.meanDevScore);
//		scores.put("VSO-s:hn+acc", vsoTest.vsoSAgrHN_Acc.meanDevScore);
//		scores.put("VOS-s:hn+acc", vosTest.vosSAgrHN_Acc.meanDevScore);
//		scores.put("OVS-s:hn+acc", ovsTest.ovsSAgrHN_Acc.meanDevScore);
//		scores.put("OSV-s:hn+acc", osvTest.osvSAgrHN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hn+nomacc", svoTest.svoSAgrHN_NomAcc.meanDevScore);
//		scores.put("SOV-s:hn+nomacc", sovTest.sovSAgrHN_NomAcc.meanDevScore);
//		scores.put("VSO-s:hn+nomacc", vsoTest.vsoSAgrHN_NomAcc.meanDevScore);
//		scores.put("VOS-s:hn+nomacc", vosTest.vosSAgrHN_NomAcc.meanDevScore);
//		scores.put("OVS-s:hn+nomacc", ovsTest.ovsSAgrHN_NomAcc.meanDevScore);
//		scores.put("OSV-s:hn+nomacc", osvTest.osvSAgrHN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hn+erg", svoTest.svoSAgrHN_Erg.meanDevScore);
//		scores.put("SOV-s:hn+erg", sovTest.sovSAgrHN_Erg.meanDevScore);
//		scores.put("VSO-s:hn+erg", vsoTest.vsoSAgrHN_Erg.meanDevScore);
//		scores.put("VOS-s:hn+erg", vosTest.vosSAgrHN_Erg.meanDevScore);
//		scores.put("OVS-s:hn+erg", ovsTest.ovsSAgrHN_Erg.meanDevScore);
//		scores.put("OSV-s:hn+erg", osvTest.osvSAgrHN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hn+abs", svoTest.svoSAgrHN_Abs.meanDevScore);
//		scores.put("SOV-s:hn+abs", sovTest.sovSAgrHN_Abs.meanDevScore);
//		scores.put("VSO-s:hn+abs", vsoTest.vsoSAgrHN_Abs.meanDevScore);
//		scores.put("VOS-s:hn+abs", vosTest.vosSAgrHN_Abs.meanDevScore);
//		scores.put("OVS-s:hn+abs", ovsTest.ovsSAgrHN_Abs.meanDevScore);
//		scores.put("OSV-s:hn+abs", osvTest.osvSAgrHN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hn+ergabs", svoTest.svoSAgrHN_ErgAbs.meanDevScore);
//		scores.put("SOV-s:hn+ergabs", sovTest.sovSAgrHN_ErgAbs.meanDevScore);
//		scores.put("VSO-s:hn+ergabs", vsoTest.vsoSAgrHN_ErgAbs.meanDevScore);
//		scores.put("VOS-s:hn+ergabs", vosTest.vosSAgrHN_ErgAbs.meanDevScore);
//		scores.put("OVS-s:hn+ergabs", ovsTest.ovsSAgrHN_ErgAbs.meanDevScore);
//		scores.put("OSV-s:hn+ergabs", osvTest.osvSAgrHN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hai", svoTest.svoSAgrHAI.meanDevScore);
//		scores.put("SOV-s:hai", sovTest.sovSAgrHAI.meanDevScore);
//		scores.put("VSO-s:hai", vsoTest.vsoSAgrHAI.meanDevScore);
//		scores.put("VOS-s:hai", vosTest.vosSAgrHAI.meanDevScore);
//		scores.put("OVS-s:hai", ovsTest.ovsSAgrHAI.meanDevScore);
//		scores.put("OSV-s:hai", osvTest.osvSAgrHAI.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hai+nom", svoTest.svoSAgrHAI_Nom.meanDevScore);
//		scores.put("SOV-s:hai+nom", sovTest.sovSAgrHAI_Nom.meanDevScore);
//		scores.put("VSO-s:hai+nom", vsoTest.vsoSAgrHAI_Nom.meanDevScore);
//		scores.put("VOS-s:hai+nom", vosTest.vosSAgrHAI_Nom.meanDevScore);
//		scores.put("OVS-s:hai+nom", ovsTest.ovsSAgrHAI_Nom.meanDevScore);
//		scores.put("OSV-s:hai+nom", osvTest.osvSAgrHAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hai+acc", svoTest.svoSAgrHAI_Acc.meanDevScore);
//		scores.put("SOV-s:hai+acc", sovTest.sovSAgrHAI_Acc.meanDevScore);
//		scores.put("VSO-s:hai+acc", vsoTest.vsoSAgrHAI_Acc.meanDevScore);
//		scores.put("VOS-s:hai+acc", vosTest.vosSAgrHAI_Acc.meanDevScore);
//		scores.put("OVS-s:hai+acc", ovsTest.ovsSAgrHAI_Acc.meanDevScore);
//		scores.put("OSV-s:hai+acc", osvTest.osvSAgrHAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hai+nomacc", svoTest.svoSAgrHAI_NomAcc.meanDevScore);
//		scores.put("SOV-s:hai+nomacc", sovTest.sovSAgrHAI_NomAcc.meanDevScore);
//		scores.put("VSO-s:hai+nomacc", vsoTest.vsoSAgrHAI_NomAcc.meanDevScore);
//		scores.put("VOS-s:hai+nomacc", vosTest.vosSAgrHAI_NomAcc.meanDevScore);
//		scores.put("OVS-s:hai+nomacc", ovsTest.ovsSAgrHAI_NomAcc.meanDevScore);
//		scores.put("OSV-s:hai+nomacc", osvTest.osvSAgrHAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hai+erg", svoTest.svoSAgrHAI_Erg.meanDevScore);
//		scores.put("SOV-s:hai+erg", sovTest.sovSAgrHAI_Erg.meanDevScore);
//		scores.put("VSO-s:hai+erg", vsoTest.vsoSAgrHAI_Erg.meanDevScore);
//		scores.put("VOS-s:hai+erg", vosTest.vosSAgrHAI_Erg.meanDevScore);
//		scores.put("OVS-s:hai+erg", ovsTest.ovsSAgrHAI_Erg.meanDevScore);
//		scores.put("OSV-s:hai+erg", osvTest.osvSAgrHAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hai+abs", svoTest.svoSAgrHAI_Abs.meanDevScore);
//		scores.put("SOV-s:hai+abs", sovTest.sovSAgrHAI_Abs.meanDevScore);
//		scores.put("VSO-s:hai+abs", vsoTest.vsoSAgrHAI_Abs.meanDevScore);
//		scores.put("VOS-s:hai+abs", vosTest.vosSAgrHAI_Abs.meanDevScore);
//		scores.put("OVS-s:hai+abs", ovsTest.ovsSAgrHAI_Abs.meanDevScore);
//		scores.put("OSV-s:hai+abs", osvTest.osvSAgrHAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:hai+ergabs", svoTest.svoSAgrHAI_ErgAbs.meanDevScore);
//		scores.put("SOV-s:hai+ergabs", sovTest.sovSAgrHAI_ErgAbs.meanDevScore);
//		scores.put("VSO-s:hai+ergabs", vsoTest.vsoSAgrHAI_ErgAbs.meanDevScore);
//		scores.put("VOS-s:hai+ergabs", vosTest.vosSAgrHAI_ErgAbs.meanDevScore);
//		scores.put("OVS-s:hai+ergabs", ovsTest.ovsSAgrHAI_ErgAbs.meanDevScore);
//		scores.put("OSV-s:hai+ergabs", osvTest.osvSAgrHAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mnm", svoTest.svoSAgrMNM.meanDevScore);
//		scores.put("SOV-s:mnm", sovTest.sovSAgrMNM.meanDevScore);
//		scores.put("VSO-s:mnm", vsoTest.vsoSAgrMNM.meanDevScore);
//		scores.put("VOS-s:mnm", vosTest.vosSAgrMNM.meanDevScore);
//		scores.put("OVS-s:mnm", ovsTest.ovsSAgrMNM.meanDevScore);
//		scores.put("OSV-s:mnm", osvTest.osvSAgrMNM.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mnm+nom", svoTest.svoSAgrMNM_Nom.meanDevScore);
//		scores.put("SOV-s:mnm+nom", sovTest.sovSAgrMNM_Nom.meanDevScore);
//		scores.put("VSO-s:mnm+nom", vsoTest.vsoSAgrMNM_Nom.meanDevScore);
//		scores.put("VOS-s:mnm+nom", vosTest.vosSAgrMNM_Nom.meanDevScore);
//		scores.put("OVS-s:mnm+nom", ovsTest.ovsSAgrMNM_Nom.meanDevScore);
//		scores.put("OSV-s:mnm+nom", osvTest.osvSAgrMNM_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mnm+acc", svoTest.svoSAgrMNM_Acc.meanDevScore);
//		scores.put("SOV-s:mnm+acc", sovTest.sovSAgrMNM_Acc.meanDevScore);
//		scores.put("VSO-s:mnm+acc", vsoTest.vsoSAgrMNM_Acc.meanDevScore);
//		scores.put("VOS-s:mnm+acc", vosTest.vosSAgrMNM_Acc.meanDevScore);
//		scores.put("OVS-s:mnm+acc", ovsTest.ovsSAgrMNM_Acc.meanDevScore);
//		scores.put("OSV-s:mnm+acc", osvTest.osvSAgrMNM_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mnm+nomacc", svoTest.svoSAgrMNM_NomAcc.meanDevScore);
//		scores.put("SOV-s:mnm+nomacc", sovTest.sovSAgrMNM_NomAcc.meanDevScore);
//		scores.put("VSO-s:mnm+nomacc", vsoTest.vsoSAgrMNM_NomAcc.meanDevScore);
//		scores.put("VOS-s:mnm+nomacc", vosTest.vosSAgrMNM_NomAcc.meanDevScore);
//		scores.put("OVS-s:mnm+nomacc", ovsTest.ovsSAgrMNM_NomAcc.meanDevScore);
//		scores.put("OSV-s:mnm+nomacc", osvTest.osvSAgrMNM_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mnm+erg", svoTest.svoSAgrMNM_Erg.meanDevScore);
//		scores.put("SOV-s:mnm+erg", sovTest.sovSAgrMNM_Erg.meanDevScore);
//		scores.put("VSO-s:mnm+erg", vsoTest.vsoSAgrMNM_Erg.meanDevScore);
//		scores.put("VOS-s:mnm+erg", vosTest.vosSAgrMNM_Erg.meanDevScore);
//		scores.put("OVS-s:mnm+erg", ovsTest.ovsSAgrMNM_Erg.meanDevScore);
//		scores.put("OSV-s:mnm+erg", osvTest.osvSAgrMNM_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mnm+abs", svoTest.svoSAgrMNM_Abs.meanDevScore);
//		scores.put("SOV-s:mnm+abs", sovTest.sovSAgrMNM_Abs.meanDevScore);
//		scores.put("VSO-s:mnm+abs", vsoTest.vsoSAgrMNM_Abs.meanDevScore);
//		scores.put("VOS-s:mnm+abs", vosTest.vosSAgrMNM_Abs.meanDevScore);
//		scores.put("OVS-s:mnm+abs", ovsTest.ovsSAgrMNM_Abs.meanDevScore);
//		scores.put("OSV-s:mnm+abs", osvTest.osvSAgrMNM_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:mnm+ergabs", svoTest.svoSAgrMNM_ErgAbs.meanDevScore);
//		scores.put("SOV-s:mnm+ergabs", sovTest.sovSAgrMNM_ErgAbs.meanDevScore);
//		scores.put("VSO-s:mnm+ergabs", vsoTest.vsoSAgrMNM_ErgAbs.meanDevScore);
//		scores.put("VOS-s:mnm+ergabs", vosTest.vosSAgrMNM_ErgAbs.meanDevScore);
//		scores.put("OVS-s:mnm+ergabs", ovsTest.ovsSAgrMNM_ErgAbs.meanDevScore);
//		scores.put("OSV-s:mnm+ergabs", osvTest.osvSAgrMNM_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		////////////////////////////////////////////////////////////////////////////////////////////////////////
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mf", svoTest.svoOAgrMF.meanDevScore);
//		scores.put("SOV-o:mf", sovTest.sovOAgrMF.meanDevScore);
//		scores.put("VSO-o:mf", vsoTest.vsoOAgrMF.meanDevScore);
//		scores.put("VOS-o:mf", vosTest.vosOAgrMF.meanDevScore);
//		scores.put("OVS-o:mf", ovsTest.ovsOAgrMF.meanDevScore);
//		scores.put("OSV-o:mf", osvTest.osvOAgrMF.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mf+nom", svoTest.svoOAgrMF_Nom.meanDevScore);
//		scores.put("SOV-o:mf+nom", sovTest.sovOAgrMF_Nom.meanDevScore);
//		scores.put("VSO-o:mf+nom", vsoTest.vsoOAgrMF_Nom.meanDevScore);
//		scores.put("VOS-o:mf+nom", vosTest.vosOAgrMF_Nom.meanDevScore);
//		scores.put("OVS-o:mf+nom", ovsTest.ovsOAgrMF_Nom.meanDevScore);
//		scores.put("OSV-o:mf+nom", osvTest.osvOAgrMF_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mf+acc", svoTest.svoOAgrMF_Acc.meanDevScore);
//		scores.put("SOV-o:mf+acc", sovTest.sovOAgrMF_Acc.meanDevScore);
//		scores.put("VSO-o:mf+acc", vsoTest.vsoOAgrMF_Acc.meanDevScore);
//		scores.put("VOS-o:mf+acc", vosTest.vosOAgrMF_Acc.meanDevScore);
//		scores.put("OVS-o:mf+acc", ovsTest.ovsOAgrMF_Acc.meanDevScore);
//		scores.put("OSV-o:mf+acc", osvTest.osvOAgrMF_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mf+nomacc", svoTest.svoOAgrMF_NomAcc.meanDevScore);
//		scores.put("SOV-o:mf+nomacc", sovTest.sovOAgrMF_NomAcc.meanDevScore);
//		scores.put("VSO-o:mf+nomacc", vsoTest.vsoOAgrMF_NomAcc.meanDevScore);
//		scores.put("VOS-o:mf+nomacc", vosTest.vosOAgrMF_NomAcc.meanDevScore);
//		scores.put("OVS-o:mf+nomacc", ovsTest.ovsOAgrMF_NomAcc.meanDevScore);
//		scores.put("OSV-o:mf+nomacc", osvTest.osvOAgrMF_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mf+erg", svoTest.svoOAgrMF_Erg.meanDevScore);
//		scores.put("SOV-o:mf+erg", sovTest.sovOAgrMF_Erg.meanDevScore);
//		scores.put("VSO-o:mf+erg", vsoTest.vsoOAgrMF_Erg.meanDevScore);
//		scores.put("VOS-o:mf+erg", vosTest.vosOAgrMF_Erg.meanDevScore);
//		scores.put("OVS-o:mf+erg", ovsTest.ovsOAgrMF_Erg.meanDevScore);
//		scores.put("OSV-o:mf+erg", osvTest.osvOAgrMF_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mf+abs", svoTest.svoOAgrMF_Abs.meanDevScore);
//		scores.put("SOV-o:mf+abs", sovTest.sovOAgrMF_Abs.meanDevScore);
//		scores.put("VSO-o:mf+abs", vsoTest.vsoOAgrMF_Abs.meanDevScore);
//		scores.put("VOS-o:mf+abs", vosTest.vosOAgrMF_Abs.meanDevScore);
//		scores.put("OVS-o:mf+abs", ovsTest.ovsOAgrMF_Abs.meanDevScore);
//		scores.put("OSV-o:mf+abs", osvTest.osvOAgrMF_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mf+ergabs", svoTest.svoOAgrMF_ErgAbs.meanDevScore);
//		scores.put("SOV-o:mf+ergabs", sovTest.sovOAgrMF_ErgAbs.meanDevScore);
//		scores.put("VSO-o:mf+ergabs", vsoTest.vsoOAgrMF_ErgAbs.meanDevScore);
//		scores.put("VOS-o:mf+ergabs", vosTest.vosOAgrMF_ErgAbs.meanDevScore);
//		scores.put("OVS-o:mf+ergabs", ovsTest.ovsOAgrMF_ErgAbs.meanDevScore);
//		scores.put("OSV-o:mf+ergabs", osvTest.osvOAgrMF_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mfn", svoTest.svoOAgrMFN.meanDevScore);
//		scores.put("SOV-o:mfn", sovTest.sovOAgrMFN.meanDevScore);
//		scores.put("VSO-o:mfn", vsoTest.vsoOAgrMFN.meanDevScore);
//		scores.put("VOS-o:mfn", vosTest.vosOAgrMFN.meanDevScore);
//		scores.put("OVS-o:mfn", ovsTest.ovsOAgrMFN.meanDevScore);
//		scores.put("OSV-o:mfn", osvTest.osvOAgrMFN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mfn+nom", svoTest.svoOAgrMFN_Nom.meanDevScore);
//		scores.put("SOV-o:mfn+nom", sovTest.sovOAgrMFN_Nom.meanDevScore);
//		scores.put("VSO-o:mfn+nom", vsoTest.vsoOAgrMFN_Nom.meanDevScore);
//		scores.put("VOS-o:mfn+nom", vosTest.vosOAgrMFN_Nom.meanDevScore);
//		scores.put("OVS-o:mfn+nom", ovsTest.ovsOAgrMFN_Nom.meanDevScore);
//		scores.put("OSV-o:mfn+nom", osvTest.osvOAgrMFN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mfn+acc", svoTest.svoOAgrMFN_Acc.meanDevScore);
//		scores.put("SOV-o:mfn+acc", sovTest.sovOAgrMFN_Acc.meanDevScore);
//		scores.put("VSO-o:mfn+acc", vsoTest.vsoOAgrMFN_Acc.meanDevScore);
//		scores.put("VOS-o:mfn+acc", vosTest.vosOAgrMFN_Acc.meanDevScore);
//		scores.put("OVS-o:mfn+acc", ovsTest.ovsOAgrMFN_Acc.meanDevScore);
//		scores.put("OSV-o:mfn+acc", osvTest.osvOAgrMFN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mfn+nomacc", svoTest.svoOAgrMFN_NomAcc.meanDevScore);
//		scores.put("SOV-o:mfn+nomacc", sovTest.sovOAgrMFN_NomAcc.meanDevScore);
//		scores.put("VSO-o:mfn+nomacc", vsoTest.vsoOAgrMFN_NomAcc.meanDevScore);
//		scores.put("VOS-o:mfn+nomacc", vosTest.vosOAgrMFN_NomAcc.meanDevScore);
//		scores.put("OVS-o:mfn+nomacc", ovsTest.ovsOAgrMFN_NomAcc.meanDevScore);
//		scores.put("OSV-o:mfn+nomacc", osvTest.osvOAgrMFN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mfn+erg", svoTest.svoOAgrMFN_Erg.meanDevScore);
//		scores.put("SOV-o:mfn+erg", sovTest.sovOAgrMFN_Erg.meanDevScore);
//		scores.put("VSO-o:mfn+erg", vsoTest.vsoOAgrMFN_Erg.meanDevScore);
//		scores.put("VOS-o:mfn+erg", vosTest.vosOAgrMFN_Erg.meanDevScore);
//		scores.put("OVS-o:mfn+erg", ovsTest.ovsOAgrMFN_Erg.meanDevScore);
//		scores.put("OSV-o:mfn+erg", osvTest.osvOAgrMFN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mfn+abs", svoTest.svoOAgrMFN_Abs.meanDevScore);
//		scores.put("SOV-o:mfn+abs", sovTest.sovOAgrMFN_Abs.meanDevScore);
//		scores.put("VSO-o:mfn+abs", vsoTest.vsoOAgrMFN_Abs.meanDevScore);
//		scores.put("VOS-o:mfn+abs", vosTest.vosOAgrMFN_Abs.meanDevScore);
//		scores.put("OVS-o:mfn+abs", ovsTest.ovsOAgrMFN_Abs.meanDevScore);
//		scores.put("OSV-o:mfn+abs", osvTest.osvOAgrMFN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mfn+ergabs", svoTest.svoOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("SOV-o:mfn+ergabs", sovTest.sovOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("VSO-o:mfn+ergabs", vsoTest.vsoOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("VOS-o:mfn+ergabs", vosTest.vosOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("OVS-o:mfn+ergabs", ovsTest.ovsOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("OSV-o:mfn+ergabs", osvTest.osvOAgrMFN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:cn", svoTest.svoOAgrCN.meanDevScore);
//		scores.put("SOV-o:cn", sovTest.sovOAgrCN.meanDevScore);
//		scores.put("VSO-o:cn", vsoTest.vsoOAgrCN.meanDevScore);
//		scores.put("VOS-o:cn", vosTest.vosOAgrCN.meanDevScore);
//		scores.put("OVS-o:cn", ovsTest.ovsOAgrCN.meanDevScore);
//		scores.put("OSV-o:cn", osvTest.osvOAgrCN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:cn+nom", svoTest.svoOAgrCN_Nom.meanDevScore);
//		scores.put("SOV-o:cn+nom", sovTest.sovOAgrCN_Nom.meanDevScore);
//		scores.put("VSO-o:cn+nom", vsoTest.vsoOAgrCN_Nom.meanDevScore);
//		scores.put("VOS-o:cn+nom", vosTest.vosOAgrCN_Nom.meanDevScore);
//		scores.put("OVS-o:cn+nom", ovsTest.ovsOAgrCN_Nom.meanDevScore);
//		scores.put("OSV-o:cn+nom", osvTest.osvOAgrCN_Nom.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:cn+acc", svoTest.svoOAgrCN_Acc.meanDevScore);
//		scores.put("SOV-o:cn+acc", sovTest.sovOAgrCN_Acc.meanDevScore);
//		scores.put("VSO-o:cn+acc", vsoTest.vsoOAgrCN_Acc.meanDevScore);
//		scores.put("VOS-o:cn+acc", vosTest.vosOAgrCN_Acc.meanDevScore);
//		scores.put("OVS-o:cn+acc", ovsTest.ovsOAgrCN_Acc.meanDevScore);
//		scores.put("OSV-o:cn+acc", osvTest.osvOAgrCN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:cn+nomacc", svoTest.svoOAgrCN_NomAcc.meanDevScore);
//		scores.put("SOV-o:cn+nomacc", sovTest.sovOAgrCN_NomAcc.meanDevScore);
//		scores.put("VSO-o:cn+nomacc", vsoTest.vsoOAgrCN_NomAcc.meanDevScore);
//		scores.put("VOS-o:cn+nomacc", vosTest.vosOAgrCN_NomAcc.meanDevScore);
//		scores.put("OVS-o:cn+nomacc", ovsTest.ovsOAgrCN_NomAcc.meanDevScore);
//		scores.put("OSV-o:cn+nomacc", osvTest.osvOAgrCN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:cn+erg", svoTest.svoOAgrCN_Erg.meanDevScore);
//		scores.put("SOV-o:cn+erg", sovTest.sovOAgrCN_Erg.meanDevScore);
//		scores.put("VSO-o:cn+erg", vsoTest.vsoOAgrCN_Erg.meanDevScore);
//		scores.put("VOS-o:cn+erg", vosTest.vosOAgrCN_Erg.meanDevScore);
//		scores.put("OVS-o:cn+erg", ovsTest.ovsOAgrCN_Erg.meanDevScore);
//		scores.put("OSV-o:cn+erg", osvTest.osvOAgrCN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:cn+abs", svoTest.svoOAgrCN_Abs.meanDevScore);
//		scores.put("SOV-o:cn+abs", sovTest.sovOAgrCN_Abs.meanDevScore);
//		scores.put("VSO-o:cn+abs", vsoTest.vsoOAgrCN_Abs.meanDevScore);
//		scores.put("VOS-o:cn+abs", vosTest.vosOAgrCN_Abs.meanDevScore);
//		scores.put("OVS-o:cn+abs", ovsTest.ovsOAgrCN_Abs.meanDevScore);
//		scores.put("OSV-o:cn+abs", osvTest.osvOAgrCN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:cn+ergabs", svoTest.svoOAgrCN_ErgAbs.meanDevScore);
//		scores.put("SOV-o:cn+ergabs", sovTest.sovOAgrCN_ErgAbs.meanDevScore);
//		scores.put("VSO-o:cn+ergabs", vsoTest.vsoOAgrCN_ErgAbs.meanDevScore);
//		scores.put("VOS-o:cn+ergabs", vosTest.vosOAgrCN_ErgAbs.meanDevScore);
//		scores.put("OVS-o:cn+ergabs", ovsTest.ovsOAgrCN_ErgAbs.meanDevScore);
//		scores.put("OSV-o:cn+ergabs", osvTest.osvOAgrCN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:ai", svoTest.svoOAgrAI.meanDevScore);
//		scores.put("SOV-o:ai", sovTest.sovOAgrAI.meanDevScore);
//		scores.put("VSO-o:ai", vsoTest.vsoOAgrAI.meanDevScore);
//		scores.put("VOS-o:ai", vosTest.vosOAgrAI.meanDevScore);
//		scores.put("OVS-o:ai", ovsTest.ovsOAgrAI.meanDevScore);
//		scores.put("OSV-o:ai", osvTest.osvOAgrAI.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:ai+nom", svoTest.svoOAgrAI_Nom.meanDevScore);
//		scores.put("SOV-o:ai+nom", sovTest.sovOAgrAI_Nom.meanDevScore);
//		scores.put("VSO-o:ai+nom", vsoTest.vsoOAgrAI_Nom.meanDevScore);
//		scores.put("VOS-o:ai+nom", vosTest.vosOAgrAI_Nom.meanDevScore);
//		scores.put("OVS-o:ai+nom", ovsTest.ovsOAgrAI_Nom.meanDevScore);
//		scores.put("OSV-o:ai+nom", osvTest.osvOAgrAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:ai+acc", svoTest.svoOAgrAI_Acc.meanDevScore);
//		scores.put("SOV-o:ai+acc", sovTest.sovOAgrAI_Acc.meanDevScore);
//		scores.put("VSO-o:ai+acc", vsoTest.vsoOAgrAI_Acc.meanDevScore);
//		scores.put("VOS-o:ai+acc", vosTest.vosOAgrAI_Acc.meanDevScore);
//		scores.put("OVS-o:ai+acc", ovsTest.ovsOAgrAI_Acc.meanDevScore);
//		scores.put("OSV-o:ai+acc", osvTest.osvOAgrAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:ai+nomacc", svoTest.svoOAgrAI_NomAcc.meanDevScore);
//		scores.put("SOV-o:ai+nomacc", sovTest.sovOAgrAI_NomAcc.meanDevScore);
//		scores.put("VSO-o:ai+nomacc", vsoTest.vsoOAgrAI_NomAcc.meanDevScore);
//		scores.put("VOS-o:ai+nomacc", vosTest.vosOAgrAI_NomAcc.meanDevScore);
//		scores.put("OVS-o:ai+nomacc", ovsTest.ovsOAgrAI_NomAcc.meanDevScore);
//		scores.put("OSV-o:ai+nomacc", osvTest.osvOAgrAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:ai+erg", svoTest.svoOAgrAI_Erg.meanDevScore);
//		scores.put("SOV-o:ai+erg", sovTest.sovOAgrAI_Erg.meanDevScore);
//		scores.put("VSO-o:ai+erg", vsoTest.vsoOAgrAI_Erg.meanDevScore);
//		scores.put("VOS-o:ai+erg", vosTest.vosOAgrAI_Erg.meanDevScore);
//		scores.put("OVS-o:ai+erg", ovsTest.ovsOAgrAI_Erg.meanDevScore);
//		scores.put("OSV-o:ai+erg", osvTest.osvOAgrAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:ai+abs", svoTest.svoOAgrAI_Abs.meanDevScore);
//		scores.put("SOV-o:ai+abs", sovTest.sovOAgrAI_Abs.meanDevScore);
//		scores.put("VSO-o:ai+abs", vsoTest.vsoOAgrAI_Abs.meanDevScore);
//		scores.put("VOS-o:ai+abs", vosTest.vosOAgrAI_Abs.meanDevScore);
//		scores.put("OVS-o:ai+abs", ovsTest.ovsOAgrAI_Abs.meanDevScore);
//		scores.put("OSV-o:ai+abs", osvTest.osvOAgrAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:ai+ergabs", svoTest.svoOAgrAI_ErgAbs.meanDevScore);
//		scores.put("SOV-o:ai+ergabs", sovTest.sovOAgrAI_ErgAbs.meanDevScore);
//		scores.put("VSO-o:ai+ergabs", vsoTest.vsoOAgrAI_ErgAbs.meanDevScore);
//		scores.put("VOS-o:ai+ergabs", vosTest.vosOAgrAI_ErgAbs.meanDevScore);
//		scores.put("OVS-o:ai+ergabs", ovsTest.ovsOAgrAI_ErgAbs.meanDevScore);
//		scores.put("OSV-o:ai+ergabs", osvTest.osvOAgrAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hn", svoTest.svoOAgrHN.meanDevScore);
//		scores.put("SOV-o:hn", sovTest.sovOAgrHN.meanDevScore);
//		scores.put("VSO-o:hn", vsoTest.vsoOAgrHN.meanDevScore);
//		scores.put("VOS-o:hn", vosTest.vosOAgrHN.meanDevScore);
//		scores.put("OVS-o:hn", ovsTest.ovsOAgrHN.meanDevScore);
//		scores.put("OSV-o:hn", osvTest.osvOAgrHN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hn+nom", svoTest.svoOAgrHN_Nom.meanDevScore);
//		scores.put("SOV-o:hn+nom", sovTest.sovOAgrHN_Nom.meanDevScore);
//		scores.put("VSO-o:hn+nom", vsoTest.vsoOAgrHN_Nom.meanDevScore);
//		scores.put("VOS-o:hn+nom", vosTest.vosOAgrHN_Nom.meanDevScore);
//		scores.put("OVS-o:hn+nom", ovsTest.ovsOAgrHN_Nom.meanDevScore);
//		scores.put("OSV-o:hn+nom", osvTest.osvOAgrHN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hn+acc", svoTest.svoOAgrHN_Acc.meanDevScore);
//		scores.put("SOV-o:hn+acc", sovTest.sovOAgrHN_Acc.meanDevScore);
//		scores.put("VSO-o:hn+acc", vsoTest.vsoOAgrHN_Acc.meanDevScore);
//		scores.put("VOS-o:hn+acc", vosTest.vosOAgrHN_Acc.meanDevScore);
//		scores.put("OVS-o:hn+acc", ovsTest.ovsOAgrHN_Acc.meanDevScore);
//		scores.put("OSV-o:hn+acc", osvTest.osvOAgrHN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hn+nomacc", svoTest.svoOAgrHN_NomAcc.meanDevScore);
//		scores.put("SOV-o:hn+nomacc", sovTest.sovOAgrHN_NomAcc.meanDevScore);
//		scores.put("VSO-o:hn+nomacc", vsoTest.vsoOAgrHN_NomAcc.meanDevScore);
//		scores.put("VOS-o:hn+nomacc", vosTest.vosOAgrHN_NomAcc.meanDevScore);
//		scores.put("OVS-o:hn+nomacc", ovsTest.ovsOAgrHN_NomAcc.meanDevScore);
//		scores.put("OSV-o:hn+nomacc", osvTest.osvOAgrHN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hn+erg", svoTest.svoOAgrHN_Erg.meanDevScore);
//		scores.put("SOV-o:hn+erg", sovTest.sovOAgrHN_Erg.meanDevScore);
//		scores.put("VSO-o:hn+erg", vsoTest.vsoOAgrHN_Erg.meanDevScore);
//		scores.put("VOS-o:hn+erg", vosTest.vosOAgrHN_Erg.meanDevScore);
//		scores.put("OVS-o:hn+erg", ovsTest.ovsOAgrHN_Erg.meanDevScore);
//		scores.put("OSV-o:hn+erg", osvTest.osvOAgrHN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hn+abs", svoTest.svoOAgrHN_Abs.meanDevScore);
//		scores.put("SOV-o:hn+abs", sovTest.sovOAgrHN_Abs.meanDevScore);
//		scores.put("VSO-o:hn+abs", vsoTest.vsoOAgrHN_Abs.meanDevScore);
//		scores.put("VOS-o:hn+abs", vosTest.vosOAgrHN_Abs.meanDevScore);
//		scores.put("OVS-o:hn+abs", ovsTest.ovsOAgrHN_Abs.meanDevScore);
//		scores.put("OSV-o:hn+abs", osvTest.osvOAgrHN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hn+ergabs", svoTest.svoOAgrHN_ErgAbs.meanDevScore);
//		scores.put("SOV-o:hn+ergabs", sovTest.sovOAgrHN_ErgAbs.meanDevScore);
//		scores.put("VSO-o:hn+ergabs", vsoTest.vsoOAgrHN_ErgAbs.meanDevScore);
//		scores.put("VOS-o:hn+ergabs", vosTest.vosOAgrHN_ErgAbs.meanDevScore);
//		scores.put("OVS-o:hn+ergabs", ovsTest.ovsOAgrHN_ErgAbs.meanDevScore);
//		scores.put("OSV-o:hn+ergabs", osvTest.osvOAgrHN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hai", svoTest.svoOAgrHAI.meanDevScore);
//		scores.put("SOV-o:hai", sovTest.sovOAgrHAI.meanDevScore);
//		scores.put("VSO-o:hai", vsoTest.vsoOAgrHAI.meanDevScore);
//		scores.put("VOS-o:hai", vosTest.vosOAgrHAI.meanDevScore);
//		scores.put("OVS-o:hai", ovsTest.ovsOAgrHAI.meanDevScore);
//		scores.put("OSV-o:hai", osvTest.osvOAgrHAI.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hai+nom", svoTest.svoOAgrHAI_Nom.meanDevScore);
//		scores.put("SOV-o:hai+nom", sovTest.sovOAgrHAI_Nom.meanDevScore);
//		scores.put("VSO-o:hai+nom", vsoTest.vsoOAgrHAI_Nom.meanDevScore);
//		scores.put("VOS-o:hai+nom", vosTest.vosOAgrHAI_Nom.meanDevScore);
//		scores.put("OVS-o:hai+nom", ovsTest.ovsOAgrHAI_Nom.meanDevScore);
//		scores.put("OSV-o:hai+nom", osvTest.osvOAgrHAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hai+acc", svoTest.svoOAgrHAI_Acc.meanDevScore);
//		scores.put("SOV-o:hai+acc", sovTest.sovOAgrHAI_Acc.meanDevScore);
//		scores.put("VSO-o:hai+acc", vsoTest.vsoOAgrHAI_Acc.meanDevScore);
//		scores.put("VOS-o:hai+acc", vosTest.vosOAgrHAI_Acc.meanDevScore);
//		scores.put("OVS-o:hai+acc", ovsTest.ovsOAgrHAI_Acc.meanDevScore);
//		scores.put("OSV-o:hai+acc", osvTest.osvOAgrHAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hai+nomacc", svoTest.svoOAgrHAI_NomAcc.meanDevScore);
//		scores.put("SOV-o:hai+nomacc", sovTest.sovOAgrHAI_NomAcc.meanDevScore);
//		scores.put("VSO-o:hai+nomacc", vsoTest.vsoOAgrHAI_NomAcc.meanDevScore);
//		scores.put("VOS-o:hai+nomacc", vosTest.vosOAgrHAI_NomAcc.meanDevScore);
//		scores.put("OVS-o:hai+nomacc", ovsTest.ovsOAgrHAI_NomAcc.meanDevScore);
//		scores.put("OSV-o:hai+nomacc", osvTest.osvOAgrHAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hai+erg", svoTest.svoOAgrHAI_Erg.meanDevScore);
//		scores.put("SOV-o:hai+erg", sovTest.sovOAgrHAI_Erg.meanDevScore);
//		scores.put("VSO-o:hai+erg", vsoTest.vsoOAgrHAI_Erg.meanDevScore);
//		scores.put("VOS-o:hai+erg", vosTest.vosOAgrHAI_Erg.meanDevScore);
//		scores.put("OVS-o:hai+erg", ovsTest.ovsOAgrHAI_Erg.meanDevScore);
//		scores.put("OSV-o:hai+erg", osvTest.osvOAgrHAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hai+abs", svoTest.svoOAgrHAI_Abs.meanDevScore);
//		scores.put("SOV-o:hai+abs", sovTest.sovOAgrHAI_Abs.meanDevScore);
//		scores.put("VSO-o:hai+abs", vsoTest.vsoOAgrHAI_Abs.meanDevScore);
//		scores.put("VOS-o:hai+abs", vosTest.vosOAgrHAI_Abs.meanDevScore);
//		scores.put("OVS-o:hai+abs", ovsTest.ovsOAgrHAI_Abs.meanDevScore);
//		scores.put("OSV-o:hai+abs", osvTest.osvOAgrHAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:hai+ergabs", svoTest.svoOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("SOV-o:hai+ergabs", sovTest.sovOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("VSO-o:hai+ergabs", vsoTest.vsoOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("VOS-o:hai+ergabs", vosTest.vosOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("OVS-o:hai+ergabs", ovsTest.ovsOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("OSV-o:hai+ergabs", osvTest.osvOAgrHAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mnm", svoTest.svoOAgrMNM.meanDevScore);
//		scores.put("SOV-o:mnm", sovTest.sovOAgrMNM.meanDevScore);
//		scores.put("VSO-o:mnm", vsoTest.vsoOAgrMNM.meanDevScore);
//		scores.put("VOS-o:mnm", vosTest.vosOAgrMNM.meanDevScore);
//		scores.put("OVS-o:mnm", ovsTest.ovsOAgrMNM.meanDevScore);
//		scores.put("OSV-o:mnm", osvTest.osvOAgrMNM.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mnm+nom", svoTest.svoOAgrMNM_Nom.meanDevScore);
//		scores.put("SOV-o:mnm+nom", sovTest.sovOAgrMNM_Nom.meanDevScore);
//		scores.put("VSO-o:mnm+nom", vsoTest.vsoOAgrMNM_Nom.meanDevScore);
//		scores.put("VOS-o:mnm+nom", vosTest.vosOAgrMNM_Nom.meanDevScore);
//		scores.put("OVS-o:mnm+nom", ovsTest.ovsOAgrMNM_Nom.meanDevScore);
//		scores.put("OSV-o:mnm+nom", osvTest.osvOAgrMNM_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mnm+acc", svoTest.svoOAgrMNM_Acc.meanDevScore);
//		scores.put("SOV-o:mnm+acc", sovTest.sovOAgrMNM_Acc.meanDevScore);
//		scores.put("VSO-o:mnm+acc", vsoTest.vsoOAgrMNM_Acc.meanDevScore);
//		scores.put("VOS-o:mnm+acc", vosTest.vosOAgrMNM_Acc.meanDevScore);
//		scores.put("OVS-o:mnm+acc", ovsTest.ovsOAgrMNM_Acc.meanDevScore);
//		scores.put("OSV-o:mnm+acc", osvTest.osvOAgrMNM_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mnm+nomacc", svoTest.svoOAgrMNM_NomAcc.meanDevScore);
//		scores.put("SOV-o:mnm+nomacc", sovTest.sovOAgrMNM_NomAcc.meanDevScore);
//		scores.put("VSO-o:mnm+nomacc", vsoTest.vsoOAgrMNM_NomAcc.meanDevScore);
//		scores.put("VOS-o:mnm+nomacc", vosTest.vosOAgrMNM_NomAcc.meanDevScore);
//		scores.put("OVS-o:mnm+nomacc", ovsTest.ovsOAgrMNM_NomAcc.meanDevScore);
//		scores.put("OSV-o:mnm+nomacc", osvTest.osvOAgrMNM_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mnm+erg", svoTest.svoOAgrMNM_Erg.meanDevScore);
//		scores.put("SOV-o:mnm+erg", sovTest.sovOAgrMNM_Erg.meanDevScore);
//		scores.put("VSO-o:mnm+erg", vsoTest.vsoOAgrMNM_Erg.meanDevScore);
//		scores.put("VOS-o:mnm+erg", vosTest.vosOAgrMNM_Erg.meanDevScore);
//		scores.put("OVS-o:mnm+erg", ovsTest.ovsOAgrMNM_Erg.meanDevScore);
//		scores.put("OSV-o:mnm+erg", osvTest.osvOAgrMNM_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mnm+abs", svoTest.svoOAgrMNM_Abs.meanDevScore);
//		scores.put("SOV-o:mnm+abs", sovTest.sovOAgrMNM_Abs.meanDevScore);
//		scores.put("VSO-o:mnm+abs", vsoTest.vsoOAgrMNM_Abs.meanDevScore);
//		scores.put("VOS-o:mnm+abs", vosTest.vosOAgrMNM_Abs.meanDevScore);
//		scores.put("OVS-o:mnm+abs", ovsTest.ovsOAgrMNM_Abs.meanDevScore);
//		scores.put("OSV-o:mnm+abs", osvTest.osvOAgrMNM_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:mnm+ergabs", svoTest.svoOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("SOV-o:mnm+ergabs", sovTest.sovOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("VSO-o:mnm+ergabs", vsoTest.vsoOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("VOS-o:mnm+ergabs", vosTest.vosOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("OVS-o:mnm+ergabs", ovsTest.ovsOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("OSV-o:mnm+ergabs", osvTest.osvOAgrMNM_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		////////////////////////////////////////////////////////////////////////////////////////////////////////
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mf", svoTest.svoSOAgrMF.meanDevScore);
//		scores.put("SOV-so:mf", sovTest.sovSOAgrMF.meanDevScore);
//		scores.put("VSO-so:mf", vsoTest.vsoSOAgrMF.meanDevScore);
//		scores.put("VOS-so:mf", vosTest.vosSOAgrMF.meanDevScore);
//		scores.put("OVS-so:mf", ovsTest.ovsSOAgrMF.meanDevScore);
//		scores.put("OSV-so:mf", osvTest.osvSOAgrMF.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mf+nom", svoTest.svoSOAgrMF_Nom.meanDevScore);
//		scores.put("SOV-so:mf+nom", sovTest.sovSOAgrMF_Nom.meanDevScore);
//		scores.put("VSO-so:mf+nom", vsoTest.vsoSOAgrMF_Nom.meanDevScore);
//		scores.put("VOS-so:mf+nom", vosTest.vosSOAgrMF_Nom.meanDevScore);
//		scores.put("OVS-so:mf+nom", ovsTest.ovsSOAgrMF_Nom.meanDevScore);
//		scores.put("OSV-so:mf+nom", osvTest.osvSOAgrMF_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mf+acc", svoTest.svoSOAgrMF_Acc.meanDevScore);
//		scores.put("SOV-so:mf+acc", sovTest.sovSOAgrMF_Acc.meanDevScore);
//		scores.put("VSO-so:mf+acc", vsoTest.vsoSOAgrMF_Acc.meanDevScore);
//		scores.put("VOS-so:mf+acc", vosTest.vosSOAgrMF_Acc.meanDevScore);
//		scores.put("OVS-so:mf+acc", ovsTest.ovsSOAgrMF_Acc.meanDevScore);
//		scores.put("OSV-so:mf+acc", osvTest.osvSOAgrMF_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mf+nomacc", svoTest.svoSOAgrMF_NomAcc.meanDevScore);
//		scores.put("SOV-so:mf+nomacc", sovTest.sovSOAgrMF_NomAcc.meanDevScore);
//		scores.put("VSO-so:mf+nomacc", vsoTest.vsoSOAgrMF_NomAcc.meanDevScore);
//		scores.put("VOS-so:mf+nomacc", vosTest.vosSOAgrMF_NomAcc.meanDevScore);
//		scores.put("OVS-so:mf+nomacc", ovsTest.ovsSOAgrMF_NomAcc.meanDevScore);
//		scores.put("OSV-so:mf+nomacc", osvTest.osvSOAgrMF_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mf+erg", svoTest.svoSOAgrMF_Erg.meanDevScore);
//		scores.put("SOV-so:mf+erg", sovTest.sovSOAgrMF_Erg.meanDevScore);
//		scores.put("VSO-so:mf+erg", vsoTest.vsoSOAgrMF_Erg.meanDevScore);
//		scores.put("VOS-so:mf+erg", vosTest.vosSOAgrMF_Erg.meanDevScore);
//		scores.put("OVS-so:mf+erg", ovsTest.ovsSOAgrMF_Erg.meanDevScore);
//		scores.put("OSV-so:mf+erg", osvTest.osvSOAgrMF_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mf+abs", svoTest.svoSOAgrMF_Abs.meanDevScore);
//		scores.put("SOV-so:mf+abs", sovTest.sovSOAgrMF_Abs.meanDevScore);
//		scores.put("VSO-so:mf+abs", vsoTest.vsoSOAgrMF_Abs.meanDevScore);
//		scores.put("VOS-so:mf+abs", vosTest.vosSOAgrMF_Abs.meanDevScore);
//		scores.put("OVS-so:mf+abs", ovsTest.ovsSOAgrMF_Abs.meanDevScore);
//		scores.put("OSV-so:mf+abs", osvTest.osvSOAgrMF_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mf+ergabs", svoTest.svoSOAgrMF_ErgAbs.meanDevScore);
//		scores.put("SOV-so:mf+ergabs", sovTest.sovSOAgrMF_ErgAbs.meanDevScore);
//		scores.put("VSO-so:mf+ergabs", vsoTest.vsoSOAgrMF_ErgAbs.meanDevScore);
//		scores.put("VOS-so:mf+ergabs", vosTest.vosSOAgrMF_ErgAbs.meanDevScore);
//		scores.put("OVS-so:mf+ergabs", ovsTest.ovsSOAgrMF_ErgAbs.meanDevScore);
//		scores.put("OSV-so:mf+ergabs", osvTest.osvSOAgrMF_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mfn", svoTest.svoSOAgrMFN.meanDevScore);
//		scores.put("SOV-so:mfn", sovTest.sovSOAgrMFN.meanDevScore);
//		scores.put("VSO-so:mfn", vsoTest.vsoSOAgrMFN.meanDevScore);
//		scores.put("VOS-so:mfn", vosTest.vosSOAgrMFN.meanDevScore);
//		scores.put("OVS-so:mfn", ovsTest.ovsSOAgrMFN.meanDevScore);
//		scores.put("OSV-so:mfn", osvTest.osvSOAgrMFN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mfn+nom", svoTest.svoSOAgrMFN_Nom.meanDevScore);
//		scores.put("SOV-so:mfn+nom", sovTest.sovSOAgrMFN_Nom.meanDevScore);
//		scores.put("VSO-so:mfn+nom", vsoTest.vsoSOAgrMFN_Nom.meanDevScore);
//		scores.put("VOS-so:mfn+nom", vosTest.vosSOAgrMFN_Nom.meanDevScore);
//		scores.put("OVS-so:mfn+nom", ovsTest.ovsSOAgrMFN_Nom.meanDevScore);
//		scores.put("OSV-so:mfn+nom", osvTest.osvSOAgrMFN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mfn+acc", svoTest.svoSOAgrMFN_Acc.meanDevScore);
//		scores.put("SOV-so:mfn+acc", sovTest.sovSOAgrMFN_Acc.meanDevScore);
//		scores.put("VSO-so:mfn+acc", vsoTest.vsoSOAgrMFN_Acc.meanDevScore);
//		scores.put("VOS-so:mfn+acc", vosTest.vosSOAgrMFN_Acc.meanDevScore);
//		scores.put("OVS-so:mfn+acc", ovsTest.ovsSOAgrMFN_Acc.meanDevScore);
//		scores.put("OSV-so:mfn+acc", osvTest.osvSOAgrMFN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mfn+nomacc", svoTest.svoSOAgrMFN_NomAcc.meanDevScore);
//		scores.put("SOV-so:mfn+nomacc", sovTest.sovSOAgrMFN_NomAcc.meanDevScore);
//		scores.put("VSO-so:mfn+nomacc", vsoTest.vsoSOAgrMFN_NomAcc.meanDevScore);
//		scores.put("VOS-so:mfn+nomacc", vosTest.vosSOAgrMFN_NomAcc.meanDevScore);
//		scores.put("OVS-so:mfn+nomacc", ovsTest.ovsSOAgrMFN_NomAcc.meanDevScore);
//		scores.put("OSV-so:mfn+nomacc", osvTest.osvSOAgrMFN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mfn+erg", svoTest.svoSOAgrMFN_Erg.meanDevScore);
//		scores.put("SOV-so:mfn+erg", sovTest.sovSOAgrMFN_Erg.meanDevScore);
//		scores.put("VSO-so:mfn+erg", vsoTest.vsoSOAgrMFN_Erg.meanDevScore);
//		scores.put("VOS-so:mfn+erg", vosTest.vosSOAgrMFN_Erg.meanDevScore);
//		scores.put("OVS-so:mfn+erg", ovsTest.ovsSOAgrMFN_Erg.meanDevScore);
//		scores.put("OSV-so:mfn+erg", osvTest.osvSOAgrMFN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mfn+abs", svoTest.svoSOAgrMFN_Abs.meanDevScore);
//		scores.put("SOV-so:mfn+abs", sovTest.sovSOAgrMFN_Abs.meanDevScore);
//		scores.put("VSO-so:mfn+abs", vsoTest.vsoSOAgrMFN_Abs.meanDevScore);
//		scores.put("VOS-so:mfn+abs", vosTest.vosSOAgrMFN_Abs.meanDevScore);
//		scores.put("OVS-so:mfn+abs", ovsTest.ovsSOAgrMFN_Abs.meanDevScore);
//		scores.put("OSV-so:mfn+abs", osvTest.osvSOAgrMFN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mfn+ergabs", svoTest.svoSOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("SOV-so:mfn+ergabs", sovTest.sovSOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("VSO-so:mfn+ergabs", vsoTest.vsoSOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("VOS-so:mfn+ergabs", vosTest.vosSOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("OVS-so:mfn+ergabs", ovsTest.ovsSOAgrMFN_ErgAbs.meanDevScore);
//		scores.put("OSV-so:mfn+ergabs", osvTest.osvSOAgrMFN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:cn", svoTest.svoSOAgrCN.meanDevScore);
//		scores.put("SOV-so:cn", sovTest.sovSOAgrCN.meanDevScore);
//		scores.put("VSO-so:cn", vsoTest.vsoSOAgrCN.meanDevScore);
//		scores.put("VOS-so:cn", vosTest.vosSOAgrCN.meanDevScore);
//		scores.put("OVS-so:cn", ovsTest.ovsSOAgrCN.meanDevScore);
//		scores.put("OSV-so:cn", osvTest.osvSOAgrCN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:cn+nom", svoTest.svoSOAgrCN_Nom.meanDevScore);
//		scores.put("SOV-so:cn+nom", sovTest.sovSOAgrCN_Nom.meanDevScore);
//		scores.put("VSO-so:cn+nom", vsoTest.vsoSOAgrCN_Nom.meanDevScore);
//		scores.put("VOS-so:cn+nom", vosTest.vosSOAgrCN_Nom.meanDevScore);
//		scores.put("OVS-so:cn+nom", ovsTest.ovsSOAgrCN_Nom.meanDevScore);
//		scores.put("OSV-so:cn+nom", osvTest.osvSOAgrCN_Nom.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:cn+acc", svoTest.svoSOAgrCN_Acc.meanDevScore);
//		scores.put("SOV-so:cn+acc", sovTest.sovSOAgrCN_Acc.meanDevScore);
//		scores.put("VSO-so:cn+acc", vsoTest.vsoSOAgrCN_Acc.meanDevScore);
//		scores.put("VOS-so:cn+acc", vosTest.vosSOAgrCN_Acc.meanDevScore);
//		scores.put("OVS-so:cn+acc", ovsTest.ovsSOAgrCN_Acc.meanDevScore);
//		scores.put("OSV-so:cn+acc", osvTest.osvSOAgrCN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:cn+nomacc", svoTest.svoSOAgrCN_NomAcc.meanDevScore);
//		scores.put("SOV-so:cn+nomacc", sovTest.sovSOAgrCN_NomAcc.meanDevScore);
//		scores.put("VSO-so:cn+nomacc", vsoTest.vsoSOAgrCN_NomAcc.meanDevScore);
//		scores.put("VOS-so:cn+nomacc", vosTest.vosSOAgrCN_NomAcc.meanDevScore);
//		scores.put("OVS-so:cn+nomacc", ovsTest.ovsSOAgrCN_NomAcc.meanDevScore);
//		scores.put("OSV-so:cn+nomacc", osvTest.osvSOAgrCN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:cn+erg", svoTest.svoSOAgrCN_Erg.meanDevScore);
//		scores.put("SOV-so:cn+erg", sovTest.sovSOAgrCN_Erg.meanDevScore);
//		scores.put("VSO-so:cn+erg", vsoTest.vsoSOAgrCN_Erg.meanDevScore);
//		scores.put("VOS-so:cn+erg", vosTest.vosSOAgrCN_Erg.meanDevScore);
//		scores.put("OVS-so:cn+erg", ovsTest.ovsSOAgrCN_Erg.meanDevScore);
//		scores.put("OSV-so:cn+erg", osvTest.osvSOAgrCN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:cn+abs", svoTest.svoSOAgrCN_Abs.meanDevScore);
//		scores.put("SOV-so:cn+abs", sovTest.sovSOAgrCN_Abs.meanDevScore);
//		scores.put("VSO-so:cn+abs", vsoTest.vsoSOAgrCN_Abs.meanDevScore);
//		scores.put("VOS-so:cn+abs", vosTest.vosSOAgrCN_Abs.meanDevScore);
//		scores.put("OVS-so:cn+abs", ovsTest.ovsSOAgrCN_Abs.meanDevScore);
//		scores.put("OSV-so:cn+abs", osvTest.osvSOAgrCN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:cn+ergabs", svoTest.svoSOAgrCN_ErgAbs.meanDevScore);
//		scores.put("SOV-so:cn+ergabs", sovTest.sovSOAgrCN_ErgAbs.meanDevScore);
//		scores.put("VSO-so:cn+ergabs", vsoTest.vsoSOAgrCN_ErgAbs.meanDevScore);
//		scores.put("VOS-so:cn+ergabs", vosTest.vosSOAgrCN_ErgAbs.meanDevScore);
//		scores.put("OVS-so:cn+ergabs", ovsTest.ovsSOAgrCN_ErgAbs.meanDevScore);
//		scores.put("OSV-so:cn+ergabs", osvTest.osvSOAgrCN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:ai", svoTest.svoSOAgrAI.meanDevScore);
//		scores.put("SOV-so:ai", sovTest.sovSOAgrAI.meanDevScore);
//		scores.put("VSO-so:ai", vsoTest.vsoSOAgrAI.meanDevScore);
//		scores.put("VOS-so:ai", vosTest.vosSOAgrAI.meanDevScore);
//		scores.put("OVS-so:ai", ovsTest.ovsSOAgrAI.meanDevScore);
//		scores.put("OSV-so:ai", osvTest.osvSOAgrAI.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:ai+nom", svoTest.svoSOAgrAI_Nom.meanDevScore);
//		scores.put("SOV-so:ai+nom", sovTest.sovSOAgrAI_Nom.meanDevScore);
//		scores.put("VSO-so:ai+nom", vsoTest.vsoSOAgrAI_Nom.meanDevScore);
//		scores.put("VOS-so:ai+nom", vosTest.vosSOAgrAI_Nom.meanDevScore);
//		scores.put("OVS-so:ai+nom", ovsTest.ovsSOAgrAI_Nom.meanDevScore);
//		scores.put("OSV-so:ai+nom", osvTest.osvSOAgrAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:ai+acc", svoTest.svoSOAgrAI_Acc.meanDevScore);
//		scores.put("SOV-so:ai+acc", sovTest.sovSOAgrAI_Acc.meanDevScore);
//		scores.put("VSO-so:ai+acc", vsoTest.vsoSOAgrAI_Acc.meanDevScore);
//		scores.put("VOS-so:ai+acc", vosTest.vosSOAgrAI_Acc.meanDevScore);
//		scores.put("OVS-so:ai+acc", ovsTest.ovsSOAgrAI_Acc.meanDevScore);
//		scores.put("OSV-so:ai+acc", osvTest.osvSOAgrAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:ai+nomacc", svoTest.svoSOAgrAI_NomAcc.meanDevScore);
//		scores.put("SOV-so:ai+nomacc", sovTest.sovSOAgrAI_NomAcc.meanDevScore);
//		scores.put("VSO-so:ai+nomacc", vsoTest.vsoSOAgrAI_NomAcc.meanDevScore);
//		scores.put("VOS-so:ai+nomacc", vosTest.vosSOAgrAI_NomAcc.meanDevScore);
//		scores.put("OVS-so:ai+nomacc", ovsTest.ovsSOAgrAI_NomAcc.meanDevScore);
//		scores.put("OSV-so:ai+nomacc", osvTest.osvSOAgrAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:ai+erg", svoTest.svoSOAgrAI_Erg.meanDevScore);
//		scores.put("SOV-so:ai+erg", sovTest.sovSOAgrAI_Erg.meanDevScore);
//		scores.put("VSO-so:ai+erg", vsoTest.vsoSOAgrAI_Erg.meanDevScore);
//		scores.put("VOS-so:ai+erg", vosTest.vosSOAgrAI_Erg.meanDevScore);
//		scores.put("OVS-so:ai+erg", ovsTest.ovsSOAgrAI_Erg.meanDevScore);
//		scores.put("OSV-so:ai+erg", osvTest.osvSOAgrAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:ai+abs", svoTest.svoSOAgrAI_Abs.meanDevScore);
//		scores.put("SOV-so:ai+abs", sovTest.sovSOAgrAI_Abs.meanDevScore);
//		scores.put("VSO-so:ai+abs", vsoTest.vsoSOAgrAI_Abs.meanDevScore);
//		scores.put("VOS-so:ai+abs", vosTest.vosSOAgrAI_Abs.meanDevScore);
//		scores.put("OVS-so:ai+abs", ovsTest.ovsSOAgrAI_Abs.meanDevScore);
//		scores.put("OSV-so:ai+abs", osvTest.osvSOAgrAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:ai+ergabs", svoTest.svoSOAgrAI_ErgAbs.meanDevScore);
//		scores.put("SOV-so:ai+ergabs", sovTest.sovSOAgrAI_ErgAbs.meanDevScore);
//		scores.put("VSO-so:ai+ergabs", vsoTest.vsoSOAgrAI_ErgAbs.meanDevScore);
//		scores.put("VOS-so:ai+ergabs", vosTest.vosSOAgrAI_ErgAbs.meanDevScore);
//		scores.put("OVS-so:ai+ergabs", ovsTest.ovsSOAgrAI_ErgAbs.meanDevScore);
//		scores.put("OSV-so:ai+ergabs", osvTest.osvSOAgrAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hn", svoTest.svoSOAgrHN.meanDevScore);
//		scores.put("SOV-so:hn", sovTest.sovSOAgrHN.meanDevScore);
//		scores.put("VSO-so:hn", vsoTest.vsoSOAgrHN.meanDevScore);
//		scores.put("VOS-so:hn", vosTest.vosSOAgrHN.meanDevScore);
//		scores.put("OVS-so:hn", ovsTest.ovsSOAgrHN.meanDevScore);
//		scores.put("OSV-so:hn", osvTest.osvSOAgrHN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hn+nom", svoTest.svoSOAgrHN_Nom.meanDevScore);
//		scores.put("SOV-so:hn+nom", sovTest.sovSOAgrHN_Nom.meanDevScore);
//		scores.put("VSO-so:hn+nom", vsoTest.vsoSOAgrHN_Nom.meanDevScore);
//		scores.put("VOS-so:hn+nom", vosTest.vosSOAgrHN_Nom.meanDevScore);
//		scores.put("OVS-so:hn+nom", ovsTest.ovsSOAgrHN_Nom.meanDevScore);
//		scores.put("OSV-so:hn+nom", osvTest.osvSOAgrHN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hn+acc", svoTest.svoSOAgrHN_Acc.meanDevScore);
//		scores.put("SOV-so:hn+acc", sovTest.sovSOAgrHN_Acc.meanDevScore);
//		scores.put("VSO-so:hn+acc", vsoTest.vsoSOAgrHN_Acc.meanDevScore);
//		scores.put("VOS-so:hn+acc", vosTest.vosSOAgrHN_Acc.meanDevScore);
//		scores.put("OVS-so:hn+acc", ovsTest.ovsSOAgrHN_Acc.meanDevScore);
//		scores.put("OSV-so:hn+acc", osvTest.osvSOAgrHN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hn+nomacc", svoTest.svoSOAgrHN_NomAcc.meanDevScore);
//		scores.put("SOV-so:hn+nomacc", sovTest.sovSOAgrHN_NomAcc.meanDevScore);
//		scores.put("VSO-so:hn+nomacc", vsoTest.vsoSOAgrHN_NomAcc.meanDevScore);
//		scores.put("VOS-so:hn+nomacc", vosTest.vosSOAgrHN_NomAcc.meanDevScore);
//		scores.put("OVS-so:hn+nomacc", ovsTest.ovsSOAgrHN_NomAcc.meanDevScore);
//		scores.put("OSV-so:hn+nomacc", osvTest.osvSOAgrHN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hn+erg", svoTest.svoSOAgrHN_Erg.meanDevScore);
//		scores.put("SOV-so:hn+erg", sovTest.sovSOAgrHN_Erg.meanDevScore);
//		scores.put("VSO-so:hn+erg", vsoTest.vsoSOAgrHN_Erg.meanDevScore);
//		scores.put("VOS-so:hn+erg", vosTest.vosSOAgrHN_Erg.meanDevScore);
//		scores.put("OVS-so:hn+erg", ovsTest.ovsSOAgrHN_Erg.meanDevScore);
//		scores.put("OSV-so:hn+erg", osvTest.osvSOAgrHN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hn+abs", svoTest.svoSOAgrHN_Abs.meanDevScore);
//		scores.put("SOV-so:hn+abs", sovTest.sovSOAgrHN_Abs.meanDevScore);
//		scores.put("VSO-so:hn+abs", vsoTest.vsoSOAgrHN_Abs.meanDevScore);
//		scores.put("VOS-so:hn+abs", vosTest.vosSOAgrHN_Abs.meanDevScore);
//		scores.put("OVS-so:hn+abs", ovsTest.ovsSOAgrHN_Abs.meanDevScore);
//		scores.put("OSV-so:hn+abs", osvTest.osvSOAgrHN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hn+ergabs", svoTest.svoSOAgrHN_ErgAbs.meanDevScore);
//		scores.put("SOV-so:hn+ergabs", sovTest.sovSOAgrHN_ErgAbs.meanDevScore);
//		scores.put("VSO-so:hn+ergabs", vsoTest.vsoSOAgrHN_ErgAbs.meanDevScore);
//		scores.put("VOS-so:hn+ergabs", vosTest.vosSOAgrHN_ErgAbs.meanDevScore);
//		scores.put("OVS-so:hn+ergabs", ovsTest.ovsSOAgrHN_ErgAbs.meanDevScore);
//		scores.put("OSV-so:hn+ergabs", osvTest.osvSOAgrHN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hai", svoTest.svoSOAgrHAI.meanDevScore);
//		scores.put("SOV-so:hai", sovTest.sovSOAgrHAI.meanDevScore);
//		scores.put("VSO-so:hai", vsoTest.vsoSOAgrHAI.meanDevScore);
//		scores.put("VOS-so:hai", vosTest.vosSOAgrHAI.meanDevScore);
//		scores.put("OVS-so:hai", ovsTest.ovsSOAgrHAI.meanDevScore);
//		scores.put("OSV-so:hai", osvTest.osvSOAgrHAI.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hai+nom", svoTest.svoSOAgrHAI_Nom.meanDevScore);
//		scores.put("SOV-so:hai+nom", sovTest.sovSOAgrHAI_Nom.meanDevScore);
//		scores.put("VSO-so:hai+nom", vsoTest.vsoSOAgrHAI_Nom.meanDevScore);
//		scores.put("VOS-so:hai+nom", vosTest.vosSOAgrHAI_Nom.meanDevScore);
//		scores.put("OVS-so:hai+nom", ovsTest.ovsSOAgrHAI_Nom.meanDevScore);
//		scores.put("OSV-so:hai+nom", osvTest.osvSOAgrHAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hai+acc", svoTest.svoSOAgrHAI_Acc.meanDevScore);
//		scores.put("SOV-so:hai+acc", sovTest.sovSOAgrHAI_Acc.meanDevScore);
//		scores.put("VSO-so:hai+acc", vsoTest.vsoSOAgrHAI_Acc.meanDevScore);
//		scores.put("VOS-so:hai+acc", vosTest.vosSOAgrHAI_Acc.meanDevScore);
//		scores.put("OVS-so:hai+acc", ovsTest.ovsSOAgrHAI_Acc.meanDevScore);
//		scores.put("OSV-so:hai+acc", osvTest.osvSOAgrHAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hai+nomacc", svoTest.svoSOAgrHAI_NomAcc.meanDevScore);
//		scores.put("SOV-so:hai+nomacc", sovTest.sovSOAgrHAI_NomAcc.meanDevScore);
//		scores.put("VSO-so:hai+nomacc", vsoTest.vsoSOAgrHAI_NomAcc.meanDevScore);
//		scores.put("VOS-so:hai+nomacc", vosTest.vosSOAgrHAI_NomAcc.meanDevScore);
//		scores.put("OVS-so:hai+nomacc", ovsTest.ovsSOAgrHAI_NomAcc.meanDevScore);
//		scores.put("OSV-so:hai+nomacc", osvTest.osvSOAgrHAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hai+erg", svoTest.svoSOAgrHAI_Erg.meanDevScore);
//		scores.put("SOV-so:hai+erg", sovTest.sovSOAgrHAI_Erg.meanDevScore);
//		scores.put("VSO-so:hai+erg", vsoTest.vsoSOAgrHAI_Erg.meanDevScore);
//		scores.put("VOS-so:hai+erg", vosTest.vosSOAgrHAI_Erg.meanDevScore);
//		scores.put("OVS-so:hai+erg", ovsTest.ovsSOAgrHAI_Erg.meanDevScore);
//		scores.put("OSV-so:hai+erg", osvTest.osvSOAgrHAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hai+abs", svoTest.svoSOAgrHAI_Abs.meanDevScore);
//		scores.put("SOV-so:hai+abs", sovTest.sovSOAgrHAI_Abs.meanDevScore);
//		scores.put("VSO-so:hai+abs", vsoTest.vsoSOAgrHAI_Abs.meanDevScore);
//		scores.put("VOS-so:hai+abs", vosTest.vosSOAgrHAI_Abs.meanDevScore);
//		scores.put("OVS-so:hai+abs", ovsTest.ovsSOAgrHAI_Abs.meanDevScore);
//		scores.put("OSV-so:hai+abs", osvTest.osvSOAgrHAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:hai+ergabs", svoTest.svoSOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("SOV-so:hai+ergabs", sovTest.sovSOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("VSO-so:hai+ergabs", vsoTest.vsoSOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("VOS-so:hai+ergabs", vosTest.vosSOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("OVS-so:hai+ergabs", ovsTest.ovsSOAgrHAI_ErgAbs.meanDevScore);
//		scores.put("OSV-so:hai+ergabs", osvTest.osvSOAgrHAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mnm", svoTest.svoSOAgrMNM.meanDevScore);
//		scores.put("SOV-so:mnm", sovTest.sovSOAgrMNM.meanDevScore);
//		scores.put("VSO-so:mnm", vsoTest.vsoSOAgrMNM.meanDevScore);
//		scores.put("VOS-so:mnm", vosTest.vosSOAgrMNM.meanDevScore);
//		scores.put("OVS-so:mnm", ovsTest.ovsSOAgrMNM.meanDevScore);
//		scores.put("OSV-so:mnm", osvTest.osvSOAgrMNM.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mnm+nom", svoTest.svoSOAgrMNM_Nom.meanDevScore);
//		scores.put("SOV-so:mnm+nom", sovTest.sovSOAgrMNM_Nom.meanDevScore);
//		scores.put("VSO-so:mnm+nom", vsoTest.vsoSOAgrMNM_Nom.meanDevScore);
//		scores.put("VOS-so:mnm+nom", vosTest.vosSOAgrMNM_Nom.meanDevScore);
//		scores.put("OVS-so:mnm+nom", ovsTest.ovsSOAgrMNM_Nom.meanDevScore);
//		scores.put("OSV-so:mnm+nom", osvTest.osvSOAgrMNM_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mnm+acc", svoTest.svoSOAgrMNM_Acc.meanDevScore);
//		scores.put("SOV-so:mnm+acc", sovTest.sovSOAgrMNM_Acc.meanDevScore);
//		scores.put("VSO-so:mnm+acc", vsoTest.vsoSOAgrMNM_Acc.meanDevScore);
//		scores.put("VOS-so:mnm+acc", vosTest.vosSOAgrMNM_Acc.meanDevScore);
//		scores.put("OVS-so:mnm+acc", ovsTest.ovsSOAgrMNM_Acc.meanDevScore);
//		scores.put("OSV-so:mnm+acc", osvTest.osvSOAgrMNM_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mnm+nomacc", svoTest.svoSOAgrMNM_NomAcc.meanDevScore);
//		scores.put("SOV-so:mnm+nomacc", sovTest.sovSOAgrMNM_NomAcc.meanDevScore);
//		scores.put("VSO-so:mnm+nomacc", vsoTest.vsoSOAgrMNM_NomAcc.meanDevScore);
//		scores.put("VOS-so:mnm+nomacc", vosTest.vosSOAgrMNM_NomAcc.meanDevScore);
//		scores.put("OVS-so:mnm+nomacc", ovsTest.ovsSOAgrMNM_NomAcc.meanDevScore);
//		scores.put("OSV-so:mnm+nomacc", osvTest.osvSOAgrMNM_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mnm+erg", svoTest.svoSOAgrMNM_Erg.meanDevScore);
//		scores.put("SOV-so:mnm+erg", sovTest.sovSOAgrMNM_Erg.meanDevScore);
//		scores.put("VSO-so:mnm+erg", vsoTest.vsoSOAgrMNM_Erg.meanDevScore);
//		scores.put("VOS-so:mnm+erg", vosTest.vosSOAgrMNM_Erg.meanDevScore);
//		scores.put("OVS-so:mnm+erg", ovsTest.ovsSOAgrMNM_Erg.meanDevScore);
//		scores.put("OSV-so:mnm+erg", osvTest.osvSOAgrMNM_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mnm+abs", svoTest.svoSOAgrMNM_Abs.meanDevScore);
//		scores.put("SOV-so:mnm+abs", sovTest.sovSOAgrMNM_Abs.meanDevScore);
//		scores.put("VSO-so:mnm+abs", vsoTest.vsoSOAgrMNM_Abs.meanDevScore);
//		scores.put("VOS-so:mnm+abs", vosTest.vosSOAgrMNM_Abs.meanDevScore);
//		scores.put("OVS-so:mnm+abs", ovsTest.ovsSOAgrMNM_Abs.meanDevScore);
//		scores.put("OSV-so:mnm+abs", osvTest.osvSOAgrMNM_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:mnm+ergabs", svoTest.svoSOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("SOV-so:mnm+ergabs", sovTest.sovSOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("VSO-so:mnm+ergabs", vsoTest.vsoSOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("VOS-so:mnm+ergabs", vosTest.vosSOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("OVS-so:mnm+ergabs", ovsTest.ovsSOAgrMNM_ErgAbs.meanDevScore);
//		scores.put("OSV-so:mnm+ergabs", osvTest.osvSOAgrMNM_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		////////////////////////////////////////////////////////////////////////////////////////////////////////
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mf", svoTest.svoSAgr123_SP_MF.meanDevScore);
//		scores.put("SOV-s:123+sp+mf", sovTest.sovSAgr123_SP_MF.meanDevScore);
//		scores.put("VSO-s:123+sp+mf", vsoTest.vsoSAgr123_SP_MF.meanDevScore);
//		scores.put("VOS-s:123+sp+mf", vosTest.vosSAgr123_SP_MF.meanDevScore);
//		scores.put("OVS-s:123+sp+mf", ovsTest.ovsSAgr123_SP_MF.meanDevScore);
//		scores.put("OSV-s:123+sp+mf", osvTest.osvSAgr123_SP_MF.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mf+nom", svoTest.svoSAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("SOV-s:123+sp+mf+nom", sovTest.sovSAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("VSO-s:123+sp+mf+nom", vsoTest.vsoSAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("VOS-s:123+sp+mf+nom", vosTest.vosSAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("OVS-s:123+sp+mf+nom", ovsTest.ovsSAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("OSV-s:123+sp+mf+nom", osvTest.osvSAgr123_SP_MF_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mf+acc", svoTest.svoSAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("SOV-s:123+sp+mf+acc", sovTest.sovSAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("VSO-s:123+sp+mf+acc", vsoTest.vsoSAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("VOS-s:123+sp+mf+acc", vosTest.vosSAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("OVS-s:123+sp+mf+acc", ovsTest.ovsSAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("OSV-s:123+sp+mf+acc", osvTest.osvSAgr123_SP_MF_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mf+nomacc", svoTest.svoSAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("SOV-s:123+sp+mf+nomacc", sovTest.sovSAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("VSO-s:123+sp+mf+nomacc", vsoTest.vsoSAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("VOS-s:123+sp+mf+nomacc", vosTest.vosSAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("OVS-s:123+sp+mf+nomacc", ovsTest.ovsSAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("OSV-s:123+sp+mf+nomacc", osvTest.osvSAgr123_SP_MF_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mf+erg", svoTest.svoSAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("SOV-s:123+sp+mf+erg", sovTest.sovSAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("VSO-s:123+sp+mf+erg", vsoTest.vsoSAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("VOS-s:123+sp+mf+erg", vosTest.vosSAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("OVS-s:123+sp+mf+erg", ovsTest.ovsSAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("OSV-s:123+sp+mf+erg", osvTest.osvSAgr123_SP_MF_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mf+abs", svoTest.svoSAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("SOV-s:123+sp+mf+abs", sovTest.sovSAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("VSO-s:123+sp+mf+abs", vsoTest.vsoSAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("VOS-s:123+sp+mf+abs", vosTest.vosSAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("OVS-s:123+sp+mf+abs", ovsTest.ovsSAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("OSV-s:123+sp+mf+abs", osvTest.osvSAgr123_SP_MF_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mf+ergabs", svoTest.svoSAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("SOV-s:123+sp+mf+ergabs", sovTest.sovSAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("VSO-s:123+sp+mf+ergabs", vsoTest.vsoSAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("VOS-s:123+sp+mf+ergabs", vosTest.vosSAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("OVS-s:123+sp+mf+ergabs", ovsTest.ovsSAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("OSV-s:123+sp+mf+ergabs", osvTest.osvSAgr123_SP_MF_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mfn", svoTest.svoSAgr123_SP_MFN.meanDevScore);
//		scores.put("SOV-s:123+sp+mfn", sovTest.sovSAgr123_SP_MFN.meanDevScore);
//		scores.put("VSO-s:123+sp+mfn", vsoTest.vsoSAgr123_SP_MFN.meanDevScore);
//		scores.put("VOS-s:123+sp+mfn", vosTest.vosSAgr123_SP_MFN.meanDevScore);
//		scores.put("OVS-s:123+sp+mfn", ovsTest.ovsSAgr123_SP_MFN.meanDevScore);
//		scores.put("OSV-s:123+sp+mfn", osvTest.osvSAgr123_SP_MFN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mfn+nom", svoTest.svoSAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("SOV-s:123+sp+mfn+nom", sovTest.sovSAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("VSO-s:123+sp+mfn+nom", vsoTest.vsoSAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("VOS-s:123+sp+mfn+nom", vosTest.vosSAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("OVS-s:123+sp+mfn+nom", ovsTest.ovsSAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("OSV-s:123+sp+mfn+nom", osvTest.osvSAgr123_SP_MFN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mfn+acc", svoTest.svoSAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("SOV-s:123+sp+mfn+acc", sovTest.sovSAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("VSO-s:123+sp+mfn+acc", vsoTest.vsoSAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("VOS-s:123+sp+mfn+acc", vosTest.vosSAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("OVS-s:123+sp+mfn+acc", ovsTest.ovsSAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("OSV-s:123+sp+mfn+acc", osvTest.osvSAgr123_SP_MFN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mfn+nomacc", svoTest.svoSAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("SOV-s:123+sp+mfn+nomacc", sovTest.sovSAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("VSO-s:123+sp+mfn+nomacc", vsoTest.vsoSAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("VOS-s:123+sp+mfn+nomacc", vosTest.vosSAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("OVS-s:123+sp+mfn+nomacc", ovsTest.ovsSAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("OSV-s:123+sp+mfn+nomacc", osvTest.osvSAgr123_SP_MFN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mfn+erg", svoTest.svoSAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("SOV-s:123+sp+mfn+erg", sovTest.sovSAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("VSO-s:123+sp+mfn+erg", vsoTest.vsoSAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("VOS-s:123+sp+mfn+erg", vosTest.vosSAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("OVS-s:123+sp+mfn+erg", ovsTest.ovsSAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("OSV-s:123+sp+mfn+erg", osvTest.osvSAgr123_SP_MFN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mfn+abs", svoTest.svoSAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("SOV-s:123+sp+mfn+abs", sovTest.sovSAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("VSO-s:123+sp+mfn+abs", vsoTest.vsoSAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("VOS-s:123+sp+mfn+abs", vosTest.vosSAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("OVS-s:123+sp+mfn+abs", ovsTest.ovsSAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("OSV-s:123+sp+mfn+abs", osvTest.osvSAgr123_SP_MFN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mfn+ergabs", svoTest.svoSAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("SOV-s:123+sp+mfn+ergabs", sovTest.sovSAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("VSO-s:123+sp+mfn+ergabs", vsoTest.vsoSAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("VOS-s:123+sp+mfn+ergabs", vosTest.vosSAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("OVS-s:123+sp+mfn+ergabs", ovsTest.ovsSAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("OSV-s:123+sp+mfn+ergabs", osvTest.osvSAgr123_SP_MFN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+cn", svoTest.svoSAgr123_SP_CN.meanDevScore);
//		scores.put("SOV-s:123+sp+cn", sovTest.sovSAgr123_SP_CN.meanDevScore);
//		scores.put("VSO-s:123+sp+cn", vsoTest.vsoSAgr123_SP_CN.meanDevScore);
//		scores.put("VOS-s:123+sp+cn", vosTest.vosSAgr123_SP_CN.meanDevScore);
//		scores.put("OVS-s:123+sp+cn", ovsTest.ovsSAgr123_SP_CN.meanDevScore);
//		scores.put("OSV-s:123+sp+cn", osvTest.osvSAgr123_SP_CN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+cn+nom", svoTest.svoSAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("SOV-s:123+sp+cn+nom", sovTest.sovSAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("VSO-s:123+sp+cn+nom", vsoTest.vsoSAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("VOS-s:123+sp+cn+nom", vosTest.vosSAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("OVS-s:123+sp+cn+nom", ovsTest.ovsSAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("OSV-s:123+sp+cn+nom", osvTest.osvSAgr123_SP_CN_Nom.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+cn+acc", svoTest.svoSAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("SOV-s:123+sp+cn+acc", sovTest.sovSAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("VSO-s:123+sp+cn+acc", vsoTest.vsoSAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("VOS-s:123+sp+cn+acc", vosTest.vosSAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("OVS-s:123+sp+cn+acc", ovsTest.ovsSAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("OSV-s:123+sp+cn+acc", osvTest.osvSAgr123_SP_CN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+cn+nomacc", svoTest.svoSAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("SOV-s:123+sp+cn+nomacc", sovTest.sovSAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("VSO-s:123+sp+cn+nomacc", vsoTest.vsoSAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("VOS-s:123+sp+cn+nomacc", vosTest.vosSAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("OVS-s:123+sp+cn+nomacc", ovsTest.ovsSAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("OSV-s:123+sp+cn+nomacc", osvTest.osvSAgr123_SP_CN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+cn+erg", svoTest.svoSAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("SOV-s:123+sp+cn+erg", sovTest.sovSAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("VSO-s:123+sp+cn+erg", vsoTest.vsoSAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("VOS-s:123+sp+cn+erg", vosTest.vosSAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("OVS-s:123+sp+cn+erg", ovsTest.ovsSAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("OSV-s:123+sp+cn+erg", osvTest.osvSAgr123_SP_CN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+cn+abs", svoTest.svoSAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("SOV-s:123+sp+cn+abs", sovTest.sovSAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("VSO-s:123+sp+cn+abs", vsoTest.vsoSAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("VOS-s:123+sp+cn+abs", vosTest.vosSAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("OVS-s:123+sp+cn+abs", ovsTest.ovsSAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("OSV-s:123+sp+cn+abs", osvTest.osvSAgr123_SP_CN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+cn+ergabs", svoTest.svoSAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("SOV-s:123+sp+cn+ergabs", sovTest.sovSAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("VSO-s:123+sp+cn+ergabs", vsoTest.vsoSAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("VOS-s:123+sp+cn+ergabs", vosTest.vosSAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("OVS-s:123+sp+cn+ergabs", ovsTest.ovsSAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("OSV-s:123+sp+cn+ergabs", osvTest.osvSAgr123_SP_CN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+ai", svoTest.svoSAgr123_SP_AI.meanDevScore);
//		scores.put("SOV-s:123+sp+ai", sovTest.sovSAgr123_SP_AI.meanDevScore);
//		scores.put("VSO-s:123+sp+ai", vsoTest.vsoSAgr123_SP_AI.meanDevScore);
//		scores.put("VOS-s:123+sp+ai", vosTest.vosSAgr123_SP_AI.meanDevScore);
//		scores.put("OVS-s:123+sp+ai", ovsTest.ovsSAgr123_SP_AI.meanDevScore);
//		scores.put("OSV-s:123+sp+ai", osvTest.osvSAgr123_SP_AI.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+ai+nom", svoTest.svoSAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("SOV-s:123+sp+ai+nom", sovTest.sovSAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("VSO-s:123+sp+ai+nom", vsoTest.vsoSAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("VOS-s:123+sp+ai+nom", vosTest.vosSAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("OVS-s:123+sp+ai+nom", ovsTest.ovsSAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("OSV-s:123+sp+ai+nom", osvTest.osvSAgr123_SP_AI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+ai+acc", svoTest.svoSAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("SOV-s:123+sp+ai+acc", sovTest.sovSAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("VSO-s:123+sp+ai+acc", vsoTest.vsoSAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("VOS-s:123+sp+ai+acc", vosTest.vosSAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("OVS-s:123+sp+ai+acc", ovsTest.ovsSAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("OSV-s:123+sp+ai+acc", osvTest.osvSAgr123_SP_AI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+ai+nomacc", svoTest.svoSAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("SOV-s:123+sp+ai+nomacc", sovTest.sovSAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("VSO-s:123+sp+ai+nomacc", vsoTest.vsoSAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("VOS-s:123+sp+ai+nomacc", vosTest.vosSAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("OVS-s:123+sp+ai+nomacc", ovsTest.ovsSAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("OSV-s:123+sp+ai+nomacc", osvTest.osvSAgr123_SP_AI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+ai+erg", svoTest.svoSAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("SOV-s:123+sp+ai+erg", sovTest.sovSAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("VSO-s:123+sp+ai+erg", vsoTest.vsoSAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("VOS-s:123+sp+ai+erg", vosTest.vosSAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("OVS-s:123+sp+ai+erg", ovsTest.ovsSAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("OSV-s:123+sp+ai+erg", osvTest.osvSAgr123_SP_AI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+ai+abs", svoTest.svoSAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("SOV-s:123+sp+ai+abs", sovTest.sovSAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("VSO-s:123+sp+ai+abs", vsoTest.vsoSAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("VOS-s:123+sp+ai+abs", vosTest.vosSAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("OVS-s:123+sp+ai+abs", ovsTest.ovsSAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("OSV-s:123+sp+ai+abs", osvTest.osvSAgr123_SP_AI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+ai+ergabs", svoTest.svoSAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("SOV-s:123+sp+ai+ergabs", sovTest.sovSAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("VSO-s:123+sp+ai+ergabs", vsoTest.vsoSAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("VOS-s:123+sp+ai+ergabs", vosTest.vosSAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("OVS-s:123+sp+ai+ergabs", ovsTest.ovsSAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("OSV-s:123+sp+ai+ergabs", osvTest.osvSAgr123_SP_AI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hn", svoTest.svoSAgr123_SP_HN.meanDevScore);
//		scores.put("SOV-s:123+sp+hn", sovTest.sovSAgr123_SP_HN.meanDevScore);
//		scores.put("VSO-s:123+sp+hn", vsoTest.vsoSAgr123_SP_HN.meanDevScore);
//		scores.put("VOS-s:123+sp+hn", vosTest.vosSAgr123_SP_HN.meanDevScore);
//		scores.put("OVS-s:123+sp+hn", ovsTest.ovsSAgr123_SP_HN.meanDevScore);
//		scores.put("OSV-s:123+sp+hn", osvTest.osvSAgr123_SP_HN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hn+nom", svoTest.svoSAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("SOV-s:123+sp+hn+nom", sovTest.sovSAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("VSO-s:123+sp+hn+nom", vsoTest.vsoSAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("VOS-s:123+sp+hn+nom", vosTest.vosSAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("OVS-s:123+sp+hn+nom", ovsTest.ovsSAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("OSV-s:123+sp+hn+nom", osvTest.osvSAgr123_SP_HN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hn+acc", svoTest.svoSAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("SOV-s:123+sp+hn+acc", sovTest.sovSAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("VSO-s:123+sp+hn+acc", vsoTest.vsoSAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("VOS-s:123+sp+hn+acc", vosTest.vosSAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("OVS-s:123+sp+hn+acc", ovsTest.ovsSAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("OSV-s:123+sp+hn+acc", osvTest.osvSAgr123_SP_HN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hn+nomacc", svoTest.svoSAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("SOV-s:123+sp+hn+nomacc", sovTest.sovSAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("VSO-s:123+sp+hn+nomacc", vsoTest.vsoSAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("VOS-s:123+sp+hn+nomacc", vosTest.vosSAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("OVS-s:123+sp+hn+nomacc", ovsTest.ovsSAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("OSV-s:123+sp+hn+nomacc", osvTest.osvSAgr123_SP_HN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hn+erg", svoTest.svoSAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("SOV-s:123+sp+hn+erg", sovTest.sovSAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("VSO-s:123+sp+hn+erg", vsoTest.vsoSAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("VOS-s:123+sp+hn+erg", vosTest.vosSAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("OVS-s:123+sp+hn+erg", ovsTest.ovsSAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("OSV-s:123+sp+hn+erg", osvTest.osvSAgr123_SP_HN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hn+abs", svoTest.svoSAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("SOV-s:123+sp+hn+abs", sovTest.sovSAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("VSO-s:123+sp+hn+abs", vsoTest.vsoSAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("VOS-s:123+sp+hn+abs", vosTest.vosSAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("OVS-s:123+sp+hn+abs", ovsTest.ovsSAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("OSV-s:123+sp+hn+abs", osvTest.osvSAgr123_SP_HN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hn+ergabs", svoTest.svoSAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("SOV-s:123+sp+hn+ergabs", sovTest.sovSAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("VSO-s:123+sp+hn+ergabs", vsoTest.vsoSAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("VOS-s:123+sp+hn+ergabs", vosTest.vosSAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("OVS-s:123+sp+hn+ergabs", ovsTest.ovsSAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("OSV-s:123+sp+hn+ergabs", osvTest.osvSAgr123_SP_HN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hai", svoTest.svoSAgr123_SP_HAI.meanDevScore);
//		scores.put("SOV-s:123+sp+hai", sovTest.sovSAgr123_SP_HAI.meanDevScore);
//		scores.put("VSO-s:123+sp+hai", vsoTest.vsoSAgr123_SP_HAI.meanDevScore);
//		scores.put("VOS-s:123+sp+hai", vosTest.vosSAgr123_SP_HAI.meanDevScore);
//		scores.put("OVS-s:123+sp+hai", ovsTest.ovsSAgr123_SP_HAI.meanDevScore);
//		scores.put("OSV-s:123+sp+hai", osvTest.osvSAgr123_SP_HAI.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hai+nom", svoTest.svoSAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("SOV-s:123+sp+hai+nom", sovTest.sovSAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("VSO-s:123+sp+hai+nom", vsoTest.vsoSAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("VOS-s:123+sp+hai+nom", vosTest.vosSAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("OVS-s:123+sp+hai+nom", ovsTest.ovsSAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("OSV-s:123+sp+hai+nom", osvTest.osvSAgr123_SP_HAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hai+acc", svoTest.svoSAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("SOV-s:123+sp+hai+acc", sovTest.sovSAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("VSO-s:123+sp+hai+acc", vsoTest.vsoSAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("VOS-s:123+sp+hai+acc", vosTest.vosSAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("OVS-s:123+sp+hai+acc", ovsTest.ovsSAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("OSV-s:123+sp+hai+acc", osvTest.osvSAgr123_SP_HAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hai+nomacc", svoTest.svoSAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("SOV-s:123+sp+hai+nomacc", sovTest.sovSAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("VSO-s:123+sp+hai+nomacc", vsoTest.vsoSAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("VOS-s:123+sp+hai+nomacc", vosTest.vosSAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("OVS-s:123+sp+hai+nomacc", ovsTest.ovsSAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("OSV-s:123+sp+hai+nomacc", osvTest.osvSAgr123_SP_HAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hai+erg", svoTest.svoSAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("SOV-s:123+sp+hai+erg", sovTest.sovSAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("VSO-s:123+sp+hai+erg", vsoTest.vsoSAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("VOS-s:123+sp+hai+erg", vosTest.vosSAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("OVS-s:123+sp+hai+erg", ovsTest.ovsSAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("OSV-s:123+sp+hai+erg", osvTest.osvSAgr123_SP_HAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hai+abs", svoTest.svoSAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("SOV-s:123+sp+hai+abs", sovTest.sovSAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("VSO-s:123+sp+hai+abs", vsoTest.vsoSAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("VOS-s:123+sp+hai+abs", vosTest.vosSAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("OVS-s:123+sp+hai+abs", ovsTest.ovsSAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("OSV-s:123+sp+hai+abs", osvTest.osvSAgr123_SP_HAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+hai+ergabs", svoTest.svoSAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("SOV-s:123+sp+hai+ergabs", sovTest.sovSAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("VSO-s:123+sp+hai+ergabs", vsoTest.vsoSAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("VOS-s:123+sp+hai+ergabs", vosTest.vosSAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("OVS-s:123+sp+hai+ergabs", ovsTest.ovsSAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("OSV-s:123+sp+hai+ergabs", osvTest.osvSAgr123_SP_HAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mnm", svoTest.svoSAgr123_SP_MNM.meanDevScore);
//		scores.put("SOV-s:123+sp+mnm", sovTest.sovSAgr123_SP_MNM.meanDevScore);
//		scores.put("VSO-s:123+sp+mnm", vsoTest.vsoSAgr123_SP_MNM.meanDevScore);
//		scores.put("VOS-s:123+sp+mnm", vosTest.vosSAgr123_SP_MNM.meanDevScore);
//		scores.put("OVS-s:123+sp+mnm", ovsTest.ovsSAgr123_SP_MNM.meanDevScore);
//		scores.put("OSV-s:123+sp+mnm", osvTest.osvSAgr123_SP_MNM.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mnm+nom", svoTest.svoSAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("SOV-s:123+sp+mnm+nom", sovTest.sovSAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("VSO-s:123+sp+mnm+nom", vsoTest.vsoSAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("VOS-s:123+sp+mnm+nom", vosTest.vosSAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("OVS-s:123+sp+mnm+nom", ovsTest.ovsSAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("OSV-s:123+sp+mnm+nom", osvTest.osvSAgr123_SP_MNM_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mnm+acc", svoTest.svoSAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("SOV-s:123+sp+mnm+acc", sovTest.sovSAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("VSO-s:123+sp+mnm+acc", vsoTest.vsoSAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("VOS-s:123+sp+mnm+acc", vosTest.vosSAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("OVS-s:123+sp+mnm+acc", ovsTest.ovsSAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("OSV-s:123+sp+mnm+acc", osvTest.osvSAgr123_SP_MNM_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mnm+nomacc", svoTest.svoSAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("SOV-s:123+sp+mnm+nomacc", sovTest.sovSAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("VSO-s:123+sp+mnm+nomacc", vsoTest.vsoSAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("VOS-s:123+sp+mnm+nomacc", vosTest.vosSAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("OVS-s:123+sp+mnm+nomacc", ovsTest.ovsSAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("OSV-s:123+sp+mnm+nomacc", osvTest.osvSAgr123_SP_MNM_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mnm+erg", svoTest.svoSAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("SOV-s:123+sp+mnm+erg", sovTest.sovSAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("VSO-s:123+sp+mnm+erg", vsoTest.vsoSAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("VOS-s:123+sp+mnm+erg", vosTest.vosSAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("OVS-s:123+sp+mnm+erg", ovsTest.ovsSAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("OSV-s:123+sp+mnm+erg", osvTest.osvSAgr123_SP_MNM_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mnm+abs", svoTest.svoSAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("SOV-s:123+sp+mnm+abs", sovTest.sovSAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("VSO-s:123+sp+mnm+abs", vsoTest.vsoSAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("VOS-s:123+sp+mnm+abs", vosTest.vosSAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("OVS-s:123+sp+mnm+abs", ovsTest.ovsSAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("OSV-s:123+sp+mnm+abs", osvTest.osvSAgr123_SP_MNM_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-s:123+sp+mnm+ergabs", svoTest.svoSAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("SOV-s:123+sp+mnm+ergabs", sovTest.sovSAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("VSO-s:123+sp+mnm+ergabs", vsoTest.vsoSAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("VOS-s:123+sp+mnm+ergabs", vosTest.vosSAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("OVS-s:123+sp+mnm+ergabs", ovsTest.ovsSAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("OSV-s:123+sp+mnm+ergabs", osvTest.osvSAgr123_SP_MNM_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mf", svoTest.svoOAgr123_SP_MF.meanDevScore);
//		scores.put("SOV-o:123+sp+mf", sovTest.sovOAgr123_SP_MF.meanDevScore);
//		scores.put("VSO-o:123+sp+mf", vsoTest.vsoOAgr123_SP_MF.meanDevScore);
//		scores.put("VOS-o:123+sp+mf", vosTest.vosOAgr123_SP_MF.meanDevScore);
//		scores.put("OVS-o:123+sp+mf", ovsTest.ovsOAgr123_SP_MF.meanDevScore);
//		scores.put("OSV-o:123+sp+mf", osvTest.osvOAgr123_SP_MF.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mf+nom", svoTest.svoOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("SOV-o:123+sp+mf+nom", sovTest.sovOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("VSO-o:123+sp+mf+nom", vsoTest.vsoOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("VOS-o:123+sp+mf+nom", vosTest.vosOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("OVS-o:123+sp+mf+nom", ovsTest.ovsOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("OSV-o:123+sp+mf+nom", osvTest.osvOAgr123_SP_MF_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mf+acc", svoTest.svoOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("SOV-o:123+sp+mf+acc", sovTest.sovOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("VSO-o:123+sp+mf+acc", vsoTest.vsoOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("VOS-o:123+sp+mf+acc", vosTest.vosOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("OVS-o:123+sp+mf+acc", ovsTest.ovsOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("OSV-o:123+sp+mf+acc", osvTest.osvOAgr123_SP_MF_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mf+nomacc", svoTest.svoOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("SOV-o:123+sp+mf+nomacc", sovTest.sovOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("VSO-o:123+sp+mf+nomacc", vsoTest.vsoOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("VOS-o:123+sp+mf+nomacc", vosTest.vosOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("OVS-o:123+sp+mf+nomacc", ovsTest.ovsOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("OSV-o:123+sp+mf+nomacc", osvTest.osvOAgr123_SP_MF_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mf+erg", svoTest.svoOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("SOV-o:123+sp+mf+erg", sovTest.sovOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("VSO-o:123+sp+mf+erg", vsoTest.vsoOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("VOS-o:123+sp+mf+erg", vosTest.vosOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("OVS-o:123+sp+mf+erg", ovsTest.ovsOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("OSV-o:123+sp+mf+erg", osvTest.osvOAgr123_SP_MF_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mf+abs", svoTest.svoOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("SOV-o:123+sp+mf+abs", sovTest.sovOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("VSO-o:123+sp+mf+abs", vsoTest.vsoOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("VOS-o:123+sp+mf+abs", vosTest.vosOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("OVS-o:123+sp+mf+abs", ovsTest.ovsOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("OSV-o:123+sp+mf+abs", osvTest.osvOAgr123_SP_MF_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mf+ergabs", svoTest.svoOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("SOV-o:123+sp+mf+ergabs", sovTest.sovOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("VSO-o:123+sp+mf+ergabs", vsoTest.vsoOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("VOS-o:123+sp+mf+ergabs", vosTest.vosOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("OVS-o:123+sp+mf+ergabs", ovsTest.ovsOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("OSV-o:123+sp+mf+ergabs", osvTest.osvOAgr123_SP_MF_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mfn", svoTest.svoOAgr123_SP_MFN.meanDevScore);
//		scores.put("SOV-o:123+sp+mfn", sovTest.sovOAgr123_SP_MFN.meanDevScore);
//		scores.put("VSO-o:123+sp+mfn", vsoTest.vsoOAgr123_SP_MFN.meanDevScore);
//		scores.put("VOS-o:123+sp+mfn", vosTest.vosOAgr123_SP_MFN.meanDevScore);
//		scores.put("OVS-o:123+sp+mfn", ovsTest.ovsOAgr123_SP_MFN.meanDevScore);
//		scores.put("OSV-o:123+sp+mfn", osvTest.osvOAgr123_SP_MFN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mfn+nom", svoTest.svoOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("SOV-o:123+sp+mfn+nom", sovTest.sovOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("VSO-o:123+sp+mfn+nom", vsoTest.vsoOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("VOS-o:123+sp+mfn+nom", vosTest.vosOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("OVS-o:123+sp+mfn+nom", ovsTest.ovsOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("OSV-o:123+sp+mfn+nom", osvTest.osvOAgr123_SP_MFN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mfn+acc", svoTest.svoOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("SOV-o:123+sp+mfn+acc", sovTest.sovOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("VSO-o:123+sp+mfn+acc", vsoTest.vsoOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("VOS-o:123+sp+mfn+acc", vosTest.vosOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("OVS-o:123+sp+mfn+acc", ovsTest.ovsOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("OSV-o:123+sp+mfn+acc", osvTest.osvOAgr123_SP_MFN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mfn+nomacc", svoTest.svoOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("SOV-o:123+sp+mfn+nomacc", sovTest.sovOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("VSO-o:123+sp+mfn+nomacc", vsoTest.vsoOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("VOS-o:123+sp+mfn+nomacc", vosTest.vosOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("OVS-o:123+sp+mfn+nomacc", ovsTest.ovsOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("OSV-o:123+sp+mfn+nomacc", osvTest.osvOAgr123_SP_MFN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mfn+erg", svoTest.svoOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("SOV-o:123+sp+mfn+erg", sovTest.sovOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("VSO-o:123+sp+mfn+erg", vsoTest.vsoOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("VOS-o:123+sp+mfn+erg", vosTest.vosOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("OVS-o:123+sp+mfn+erg", ovsTest.ovsOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("OSV-o:123+sp+mfn+erg", osvTest.osvOAgr123_SP_MFN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mfn+abs", svoTest.svoOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("SOV-o:123+sp+mfn+abs", sovTest.sovOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("VSO-o:123+sp+mfn+abs", vsoTest.vsoOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("VOS-o:123+sp+mfn+abs", vosTest.vosOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("OVS-o:123+sp+mfn+abs", ovsTest.ovsOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("OSV-o:123+sp+mfn+abs", osvTest.osvOAgr123_SP_MFN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mfn+ergabs", svoTest.svoOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("SOV-o:123+sp+mfn+ergabs", sovTest.sovOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("VSO-o:123+sp+mfn+ergabs", vsoTest.vsoOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("VOS-o:123+sp+mfn+ergabs", vosTest.vosOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("OVS-o:123+sp+mfn+ergabs", ovsTest.ovsOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("OSV-o:123+sp+mfn+ergabs", osvTest.osvOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+cn", svoTest.svoOAgr123_SP_CN.meanDevScore);
//		scores.put("SOV-o:123+sp+cn", sovTest.sovOAgr123_SP_CN.meanDevScore);
//		scores.put("VSO-o:123+sp+cn", vsoTest.vsoOAgr123_SP_CN.meanDevScore);
//		scores.put("VOS-o:123+sp+cn", vosTest.vosOAgr123_SP_CN.meanDevScore);
//		scores.put("OVS-o:123+sp+cn", ovsTest.ovsOAgr123_SP_CN.meanDevScore);
//		scores.put("OSV-o:123+sp+cn", osvTest.osvOAgr123_SP_CN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+cn+nom", svoTest.svoOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("SOV-o:123+sp+cn+nom", sovTest.sovOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("VSO-o:123+sp+cn+nom", vsoTest.vsoOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("VOS-o:123+sp+cn+nom", vosTest.vosOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("OVS-o:123+sp+cn+nom", ovsTest.ovsOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("OSV-o:123+sp+cn+nom", osvTest.osvOAgr123_SP_CN_Nom.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+cn+acc", svoTest.svoOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("SOV-o:123+sp+cn+acc", sovTest.sovOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("VSO-o:123+sp+cn+acc", vsoTest.vsoOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("VOS-o:123+sp+cn+acc", vosTest.vosOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("OVS-o:123+sp+cn+acc", ovsTest.ovsOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("OSV-o:123+sp+cn+acc", osvTest.osvOAgr123_SP_CN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+cn+nomacc", svoTest.svoOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("SOV-o:123+sp+cn+nomacc", sovTest.sovOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("VSO-o:123+sp+cn+nomacc", vsoTest.vsoOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("VOS-o:123+sp+cn+nomacc", vosTest.vosOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("OVS-o:123+sp+cn+nomacc", ovsTest.ovsOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("OSV-o:123+sp+cn+nomacc", osvTest.osvOAgr123_SP_CN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+cn+erg", svoTest.svoOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("SOV-o:123+sp+cn+erg", sovTest.sovOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("VSO-o:123+sp+cn+erg", vsoTest.vsoOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("VOS-o:123+sp+cn+erg", vosTest.vosOAgr123_SP_CN_Erg.meanDevScore);		
//		scores.put("OVS-o:123+sp+cn+erg", ovsTest.ovsOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("OSV-o:123+sp+cn+erg", osvTest.osvOAgr123_SP_CN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+cn+abs", svoTest.svoOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("SOV-o:123+sp+cn+abs", sovTest.sovOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("VSO-o:123+sp+cn+abs", vsoTest.vsoOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("VOS-o:123+sp+cn+abs", vosTest.vosOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("OVS-o:123+sp+cn+abs", ovsTest.ovsOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("OSV-o:123+sp+cn+abs", osvTest.osvOAgr123_SP_CN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+cn+ergabs", svoTest.svoOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("SOV-o:123+sp+cn+ergabs", sovTest.sovOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("VSO-o:123+sp+cn+ergabs", vsoTest.vsoOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("VOS-o:123+sp+cn+ergabs", vosTest.vosOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("OVS-o:123+sp+cn+ergabs", ovsTest.ovsOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("OSV-o:123+sp+cn+ergabs", osvTest.osvOAgr123_SP_CN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+ai", svoTest.svoOAgr123_SP_AI.meanDevScore);
//		scores.put("SOV-o:123+sp+ai", sovTest.sovOAgr123_SP_AI.meanDevScore);
//		scores.put("VSO-o:123+sp+ai", vsoTest.vsoOAgr123_SP_AI.meanDevScore);
//		scores.put("VOS-o:123+sp+ai", vosTest.vosOAgr123_SP_AI.meanDevScore);
//		scores.put("OVS-o:123+sp+ai", ovsTest.ovsOAgr123_SP_AI.meanDevScore);
//		scores.put("OSV-o:123+sp+ai", osvTest.osvOAgr123_SP_AI.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+ai+nom", svoTest.svoOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("SOV-o:123+sp+ai+nom", sovTest.sovOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("VSO-o:123+sp+ai+nom", vsoTest.vsoOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("VOS-o:123+sp+ai+nom", vosTest.vosOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("OVS-o:123+sp+ai+nom", ovsTest.ovsOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("OSV-o:123+sp+ai+nom", osvTest.osvOAgr123_SP_AI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+ai+acc", svoTest.svoOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("SOV-o:123+sp+ai+acc", sovTest.sovOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("VSO-o:123+sp+ai+acc", vsoTest.vsoOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("VOS-o:123+sp+ai+acc", vosTest.vosOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("OVS-o:123+sp+ai+acc", ovsTest.ovsOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("OSV-o:123+sp+ai+acc", osvTest.osvOAgr123_SP_AI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+ai+nomacc", svoTest.svoOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("SOV-o:123+sp+ai+nomacc", sovTest.sovOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("VSO-o:123+sp+ai+nomacc", vsoTest.vsoOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("VOS-o:123+sp+ai+nomacc", vosTest.vosOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("OVS-o:123+sp+ai+nomacc", ovsTest.ovsOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("OSV-o:123+sp+ai+nomacc", osvTest.osvOAgr123_SP_AI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+ai+erg", svoTest.svoOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("SOV-o:123+sp+ai+erg", sovTest.sovOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("VSO-o:123+sp+ai+erg", vsoTest.vsoOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("VOS-o:123+sp+ai+erg", vosTest.vosOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("OVS-o:123+sp+ai+erg", ovsTest.ovsOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("OSV-o:123+sp+ai+erg", osvTest.osvOAgr123_SP_AI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+ai+abs", svoTest.svoOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("SOV-o:123+sp+ai+abs", sovTest.sovOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("VSO-o:123+sp+ai+abs", vsoTest.vsoOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("VOS-o:123+sp+ai+abs", vosTest.vosOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("OVS-o:123+sp+ai+abs", ovsTest.ovsOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("OSV-o:123+sp+ai+abs", osvTest.osvOAgr123_SP_AI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+ai+ergabs", svoTest.svoOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("SOV-o:123+sp+ai+ergabs", sovTest.sovOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("VSO-o:123+sp+ai+ergabs", vsoTest.vsoOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("VOS-o:123+sp+ai+ergabs", vosTest.vosOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("OVS-o:123+sp+ai+ergabs", ovsTest.ovsOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("OSV-o:123+sp+ai+ergabs", osvTest.osvOAgr123_SP_AI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hn", svoTest.svoOAgr123_SP_HN.meanDevScore);
//		scores.put("SOV-o:123+sp+hn", sovTest.sovOAgr123_SP_HN.meanDevScore);
//		scores.put("VSO-o:123+sp+hn", vsoTest.vsoOAgr123_SP_HN.meanDevScore);
//		scores.put("VOS-o:123+sp+hn", vosTest.vosOAgr123_SP_HN.meanDevScore);
//		scores.put("OVS-o:123+sp+hn", ovsTest.ovsOAgr123_SP_HN.meanDevScore);
//		scores.put("OSV-o:123+sp+hn", osvTest.osvOAgr123_SP_HN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hn+nom", svoTest.svoOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("SOV-o:123+sp+hn+nom", sovTest.sovOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("VSO-o:123+sp+hn+nom", vsoTest.vsoOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("VOS-o:123+sp+hn+nom", vosTest.vosOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("OVS-o:123+sp+hn+nom", ovsTest.ovsOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("OSV-o:123+sp+hn+nom", osvTest.osvOAgr123_SP_HN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hn+acc", svoTest.svoOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("SOV-o:123+sp+hn+acc", sovTest.sovOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("VSO-o:123+sp+hn+acc", vsoTest.vsoOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("VOS-o:123+sp+hn+acc", vosTest.vosOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("OVS-o:123+sp+hn+acc", ovsTest.ovsOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("OSV-o:123+sp+hn+acc", osvTest.osvOAgr123_SP_HN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hn+nomacc", svoTest.svoOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("SOV-o:123+sp+hn+nomacc", sovTest.sovOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("VSO-o:123+sp+hn+nomacc", vsoTest.vsoOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("VOS-o:123+sp+hn+nomacc", vosTest.vosOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("OVS-o:123+sp+hn+nomacc", ovsTest.ovsOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("OSV-o:123+sp+hn+nomacc", osvTest.osvOAgr123_SP_HN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hn+erg", svoTest.svoOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("SOV-o:123+sp+hn+erg", sovTest.sovOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("VSO-o:123+sp+hn+erg", vsoTest.vsoOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("VOS-o:123+sp+hn+erg", vosTest.vosOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("OVS-o:123+sp+hn+erg", ovsTest.ovsOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("OSV-o:123+sp+hn+erg", osvTest.osvOAgr123_SP_HN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hn+abs", svoTest.svoOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("SOV-o:123+sp+hn+abs", sovTest.sovOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("VSO-o:123+sp+hn+abs", vsoTest.vsoOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("VOS-o:123+sp+hn+abs", vosTest.vosOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("OVS-o:123+sp+hn+abs", ovsTest.ovsOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("OSV-o:123+sp+hn+abs", osvTest.osvOAgr123_SP_HN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hn+ergabs", svoTest.svoOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("SOV-o:123+sp+hn+ergabs", sovTest.sovOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("VSO-o:123+sp+hn+ergabs", vsoTest.vsoOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("VOS-o:123+sp+hn+ergabs", vosTest.vosOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("OVS-o:123+sp+hn+ergabs", ovsTest.ovsOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("OSV-o:123+sp+hn+ergabs", osvTest.osvOAgr123_SP_HN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hai", svoTest.svoOAgr123_SP_HAI.meanDevScore);
//		scores.put("SOV-o:123+sp+hai", sovTest.sovOAgr123_SP_HAI.meanDevScore);
//		scores.put("VSO-o:123+sp+hai", vsoTest.vsoOAgr123_SP_HAI.meanDevScore);
//		scores.put("VOS-o:123+sp+hai", vosTest.vosOAgr123_SP_HAI.meanDevScore);
//		scores.put("OVS-o:123+sp+hai", ovsTest.ovsOAgr123_SP_HAI.meanDevScore);
//		scores.put("OSV-o:123+sp+hai", osvTest.osvOAgr123_SP_HAI.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hai+nom", svoTest.svoOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("SOV-o:123+sp+hai+nom", sovTest.sovOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("VSO-o:123+sp+hai+nom", vsoTest.vsoOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("VOS-o:123+sp+hai+nom", vosTest.vosOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("OVS-o:123+sp+hai+nom", ovsTest.ovsOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("OSV-o:123+sp+hai+nom", osvTest.osvOAgr123_SP_HAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hai+acc", svoTest.svoOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("SOV-o:123+sp+hai+acc", sovTest.sovOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("VSO-o:123+sp+hai+acc", vsoTest.vsoOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("VOS-o:123+sp+hai+acc", vosTest.vosOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("OVS-o:123+sp+hai+acc", ovsTest.ovsOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("OSV-o:123+sp+hai+acc", osvTest.osvOAgr123_SP_HAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hai+nomacc", svoTest.svoOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("SOV-o:123+sp+hai+nomacc", sovTest.sovOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("VSO-o:123+sp+hai+nomacc", vsoTest.vsoOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("VOS-o:123+sp+hai+nomacc", vosTest.vosOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("OVS-o:123+sp+hai+nomacc", ovsTest.ovsOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("OSV-o:123+sp+hai+nomacc", osvTest.osvOAgr123_SP_HAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hai+erg", svoTest.svoOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("SOV-o:123+sp+hai+erg", sovTest.sovOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("VSO-o:123+sp+hai+erg", vsoTest.vsoOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("VOS-o:123+sp+hai+erg", vosTest.vosOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("OVS-o:123+sp+hai+erg", ovsTest.ovsOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("OSV-o:123+sp+hai+erg", osvTest.osvOAgr123_SP_HAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hai+abs", svoTest.svoOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("SOV-o:123+sp+hai+abs", sovTest.sovOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("VSO-o:123+sp+hai+abs", vsoTest.vsoOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("VOS-o:123+sp+hai+abs", vosTest.vosOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("OVS-o:123+sp+hai+abs", ovsTest.ovsOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("OSV-o:123+sp+hai+abs", osvTest.osvOAgr123_SP_HAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+hai+ergabs", svoTest.svoOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("SOV-o:123+sp+hai+ergabs", sovTest.sovOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("VSO-o:123+sp+hai+ergabs", vsoTest.vsoOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("VOS-o:123+sp+hai+ergabs", vosTest.vosOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("OVS-o:123+sp+hai+ergabs", ovsTest.ovsOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("OSV-o:123+sp+hai+ergabs", osvTest.osvOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mnm", svoTest.svoOAgr123_SP_MNM.meanDevScore);
//		scores.put("SOV-o:123+sp+mnm", sovTest.sovOAgr123_SP_MNM.meanDevScore);
//		scores.put("VSO-o:123+sp+mnm", vsoTest.vsoOAgr123_SP_MNM.meanDevScore);
//		scores.put("VOS-o:123+sp+mnm", vosTest.vosOAgr123_SP_MNM.meanDevScore);
//		scores.put("OVS-o:123+sp+mnm", ovsTest.ovsOAgr123_SP_MNM.meanDevScore);
//		scores.put("OSV-o:123+sp+mnm", osvTest.osvOAgr123_SP_MNM.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mnm+nom", svoTest.svoOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("SOV-o:123+sp+mnm+nom", sovTest.sovOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("VSO-o:123+sp+mnm+nom", vsoTest.vsoOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("VOS-o:123+sp+mnm+nom", vosTest.vosOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("OVS-o:123+sp+mnm+nom", ovsTest.ovsOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("OSV-o:123+sp+mnm+nom", osvTest.osvOAgr123_SP_MNM_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mnm+acc", svoTest.svoOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("SOV-o:123+sp+mnm+acc", sovTest.sovOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("VSO-o:123+sp+mnm+acc", vsoTest.vsoOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("VOS-o:123+sp+mnm+acc", vosTest.vosOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("OVS-o:123+sp+mnm+acc", ovsTest.ovsOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("OSV-o:123+sp+mnm+acc", osvTest.osvOAgr123_SP_MNM_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mnm+nomacc", svoTest.svoOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("SOV-o:123+sp+mnm+nomacc", sovTest.sovOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("VSO-o:123+sp+mnm+nomacc", vsoTest.vsoOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("VOS-o:123+sp+mnm+nomacc", vosTest.vosOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("OVS-o:123+sp+mnm+nomacc", ovsTest.ovsOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("OSV-o:123+sp+mnm+nomacc", osvTest.osvOAgr123_SP_MNM_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mnm+erg", svoTest.svoOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("SOV-o:123+sp+mnm+erg", sovTest.sovOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("VSO-o:123+sp+mnm+erg", vsoTest.vsoOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("VOS-o:123+sp+mnm+erg", vosTest.vosOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("OVS-o:123+sp+mnm+erg", ovsTest.ovsOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("OSV-o:123+sp+mnm+erg", osvTest.osvOAgr123_SP_MNM_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mnm+abs", svoTest.svoOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("SOV-o:123+sp+mnm+abs", sovTest.sovOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("VSO-o:123+sp+mnm+abs", vsoTest.vsoOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("VOS-o:123+sp+mnm+abs", vosTest.vosOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("OVS-o:123+sp+mnm+abs", ovsTest.ovsOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("OSV-o:123+sp+mnm+abs", osvTest.osvOAgr123_SP_MNM_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-o:123+sp+mnm+ergabs", svoTest.svoOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("SOV-o:123+sp+mnm+ergabs", sovTest.sovOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("VSO-o:123+sp+mnm+ergabs", vsoTest.vsoOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("VOS-o:123+sp+mnm+ergabs", vosTest.vosOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("OVS-o:123+sp+mnm+ergabs", ovsTest.ovsOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("OSV-o:123+sp+mnm+ergabs", osvTest.osvOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mf", svoTest.svoSOAgr123_SP_MF.meanDevScore);
//		scores.put("SOV-so:123+sp+mf", sovTest.sovSOAgr123_SP_MF.meanDevScore);
//		scores.put("VSO-so:123+sp+mf", vsoTest.vsoSOAgr123_SP_MF.meanDevScore);
//		scores.put("VOS-so:123+sp+mf", vosTest.vosSOAgr123_SP_MF.meanDevScore);
//		scores.put("OVS-so:123+sp+mf", ovsTest.ovsSOAgr123_SP_MF.meanDevScore);
//		scores.put("OSV-so:123+sp+mf", osvTest.osvSOAgr123_SP_MF.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mf+nom", svoTest.svoSOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("SOV-so:123+sp+mf+nom", sovTest.sovSOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("VSO-so:123+sp+mf+nom", vsoTest.vsoSOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("VOS-so:123+sp+mf+nom", vosTest.vosSOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("OVS-so:123+sp+mf+nom", ovsTest.ovsSOAgr123_SP_MF_Nom.meanDevScore);
//		scores.put("OSV-so:123+sp+mf+nom", osvTest.osvSOAgr123_SP_MF_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mf+acc", svoTest.svoSOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("SOV-so:123+sp+mf+acc", sovTest.sovSOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("VSO-so:123+sp+mf+acc", vsoTest.vsoSOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("VOS-so:123+sp+mf+acc", vosTest.vosSOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("OVS-so:123+sp+mf+acc", ovsTest.ovsSOAgr123_SP_MF_Acc.meanDevScore);
//		scores.put("OSV-so:123+sp+mf+acc", osvTest.osvSOAgr123_SP_MF_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mf+nomacc", svoTest.svoSOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("SOV-so:123+sp+mf+nomacc", sovTest.sovSOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("VSO-so:123+sp+mf+nomacc", vsoTest.vsoSOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("VOS-so:123+sp+mf+nomacc", vosTest.vosSOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("OVS-so:123+sp+mf+nomacc", ovsTest.ovsSOAgr123_SP_MF_NomAcc.meanDevScore);
//		scores.put("OSV-so:123+sp+mf+nomacc", osvTest.osvSOAgr123_SP_MF_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mf+erg", svoTest.svoSOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("SOV-so:123+sp+mf+erg", sovTest.sovSOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("VSO-so:123+sp+mf+erg", vsoTest.vsoSOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("VOS-so:123+sp+mf+erg", vosTest.vosSOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("OVS-so:123+sp+mf+erg", ovsTest.ovsSOAgr123_SP_MF_Erg.meanDevScore);
//		scores.put("OSV-so:123+sp+mf+erg", osvTest.osvSOAgr123_SP_MF_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mf+abs", svoTest.svoSOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("SOV-so:123+sp+mf+abs", sovTest.sovSOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("VSO-so:123+sp+mf+abs", vsoTest.vsoSOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("VOS-so:123+sp+mf+abs", vosTest.vosSOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("OVS-so:123+sp+mf+abs", ovsTest.ovsSOAgr123_SP_MF_Abs.meanDevScore);
//		scores.put("OSV-so:123+sp+mf+abs", osvTest.osvSOAgr123_SP_MF_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mf+ergabs", svoTest.svoSOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("SOV-so:123+sp+mf+ergabs", sovTest.sovSOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("VSO-so:123+sp+mf+ergabs", vsoTest.vsoSOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("VOS-so:123+sp+mf+ergabs", vosTest.vosSOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("OVS-so:123+sp+mf+ergabs", ovsTest.ovsSOAgr123_SP_MF_ErgAbs.meanDevScore);
//		scores.put("OSV-so:123+sp+mf+ergabs", osvTest.osvSOAgr123_SP_MF_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mfn", svoTest.svoSOAgr123_SP_MFN.meanDevScore);
//		scores.put("SOV-so:123+sp+mfn", sovTest.sovSOAgr123_SP_MFN.meanDevScore);
//		scores.put("VSO-so:123+sp+mfn", vsoTest.vsoSOAgr123_SP_MFN.meanDevScore);
//		scores.put("VOS-so:123+sp+mfn", vosTest.vosSOAgr123_SP_MFN.meanDevScore);
//		scores.put("OVS-so:123+sp+mfn", ovsTest.ovsSOAgr123_SP_MFN.meanDevScore);
//		scores.put("OSV-so:123+sp+mfn", osvTest.osvSOAgr123_SP_MFN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mfn+nom", svoTest.svoSOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("SOV-so:123+sp+mfn+nom", sovTest.sovSOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("VSO-so:123+sp+mfn+nom", vsoTest.vsoSOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("VOS-so:123+sp+mfn+nom", vosTest.vosSOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("OVS-so:123+sp+mfn+nom", ovsTest.ovsSOAgr123_SP_MFN_Nom.meanDevScore);
//		scores.put("OSV-so:123+sp+mfn+nom", osvTest.osvSOAgr123_SP_MFN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mfn+acc", svoTest.svoSOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("SOV-so:123+sp+mfn+acc", sovTest.sovSOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("VSO-so:123+sp+mfn+acc", vsoTest.vsoSOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("VOS-so:123+sp+mfn+acc", vosTest.vosSOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("OVS-so:123+sp+mfn+acc", ovsTest.ovsSOAgr123_SP_MFN_Acc.meanDevScore);
//		scores.put("OSV-so:123+sp+mfn+acc", osvTest.osvSOAgr123_SP_MFN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mfn+nomacc", svoTest.svoSOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("SOV-so:123+sp+mfn+nomacc", sovTest.sovSOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("VSO-so:123+sp+mfn+nomacc", vsoTest.vsoSOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("VOS-so:123+sp+mfn+nomacc", vosTest.vosSOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("OVS-so:123+sp+mfn+nomacc", ovsTest.ovsSOAgr123_SP_MFN_NomAcc.meanDevScore);
//		scores.put("OSV-so:123+sp+mfn+nomacc", osvTest.osvSOAgr123_SP_MFN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mfn+erg", svoTest.svoSOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("SOV-so:123+sp+mfn+erg", sovTest.sovSOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("VSO-so:123+sp+mfn+erg", vsoTest.vsoSOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("VOS-so:123+sp+mfn+erg", vosTest.vosSOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("OVS-so:123+sp+mfn+erg", ovsTest.ovsSOAgr123_SP_MFN_Erg.meanDevScore);
//		scores.put("OSV-so:123+sp+mfn+erg", osvTest.osvSOAgr123_SP_MFN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mfn+abs", svoTest.svoSOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("SOV-so:123+sp+mfn+abs", sovTest.sovSOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("VSO-so:123+sp+mfn+abs", vsoTest.vsoSOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("VOS-so:123+sp+mfn+abs", vosTest.vosSOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("OVS-so:123+sp+mfn+abs", ovsTest.ovsSOAgr123_SP_MFN_Abs.meanDevScore);
//		scores.put("OSV-so:123+sp+mfn+abs", osvTest.osvSOAgr123_SP_MFN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mfn+ergabs", svoTest.svoSOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("SOV-so:123+sp+mfn+ergabs", sovTest.sovSOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("VSO-so:123+sp+mfn+ergabs", vsoTest.vsoSOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("VOS-so:123+sp+mfn+ergabs", vosTest.vosSOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("OVS-so:123+sp+mfn+ergabs", ovsTest.ovsSOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		scores.put("OSV-so:123+sp+mfn+ergabs", osvTest.osvSOAgr123_SP_MFN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+cn", svoTest.svoSOAgr123_SP_CN.meanDevScore);
//		scores.put("SOV-so:123+sp+cn", sovTest.sovSOAgr123_SP_CN.meanDevScore);
//		scores.put("VSO-so:123+sp+cn", vsoTest.vsoSOAgr123_SP_CN.meanDevScore);
//		scores.put("VOS-so:123+sp+cn", vosTest.vosSOAgr123_SP_CN.meanDevScore);
//		scores.put("OVS-so:123+sp+cn", ovsTest.ovsSOAgr123_SP_CN.meanDevScore);
//		scores.put("OSV-so:123+sp+cn", osvTest.osvSOAgr123_SP_CN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+cn+nom", svoTest.svoSOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("SOV-so:123+sp+cn+nom", sovTest.sovSOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("VSO-so:123+sp+cn+nom", vsoTest.vsoSOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("VOS-so:123+sp+cn+nom", vosTest.vosSOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("OVS-so:123+sp+cn+nom", ovsTest.ovsSOAgr123_SP_CN_Nom.meanDevScore);
//		scores.put("OSV-so:123+sp+cn+nom", osvTest.osvSOAgr123_SP_CN_Nom.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+cn+acc", svoTest.svoSOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("SOV-so:123+sp+cn+acc", sovTest.sovSOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("VSO-so:123+sp+cn+acc", vsoTest.vsoSOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("VOS-so:123+sp+cn+acc", vosTest.vosSOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("OVS-so:123+sp+cn+acc", ovsTest.ovsSOAgr123_SP_CN_Acc.meanDevScore);
//		scores.put("OSV-so:123+sp+cn+acc", osvTest.osvSOAgr123_SP_CN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+cn+nomacc", svoTest.svoSOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("SOV-so:123+sp+cn+nomacc", sovTest.sovSOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("VSO-so:123+sp+cn+nomacc", vsoTest.vsoSOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("VOS-so:123+sp+cn+nomacc", vosTest.vosSOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("OVS-so:123+sp+cn+nomacc", ovsTest.ovsSOAgr123_SP_CN_NomAcc.meanDevScore);
//		scores.put("OSV-so:123+sp+cn+nomacc", osvTest.osvSOAgr123_SP_CN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+cn+erg", svoTest.svoSOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("SOV-so:123+sp+cn+erg", sovTest.sovSOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("VSO-so:123+sp+cn+erg", vsoTest.vsoSOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("VOS-so:123+sp+cn+erg", vosTest.vosSOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("OVS-so:123+sp+cn+erg", ovsTest.ovsSOAgr123_SP_CN_Erg.meanDevScore);
//		scores.put("OSV-so:123+sp+cn+erg", osvTest.osvSOAgr123_SP_CN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+cn+abs", svoTest.svoSOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("SOV-so:123+sp+cn+abs", sovTest.sovSOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("VSO-so:123+sp+cn+abs", vsoTest.vsoSOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("VOS-so:123+sp+cn+abs", vosTest.vosSOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("OVS-so:123+sp+cn+abs", ovsTest.ovsSOAgr123_SP_CN_Abs.meanDevScore);
//		scores.put("OSV-so:123+sp+cn+abs", osvTest.osvSOAgr123_SP_CN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+cn+ergabs", svoTest.svoSOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("SOV-so:123+sp+cn+ergabs", sovTest.sovSOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("VSO-so:123+sp+cn+ergabs", vsoTest.vsoSOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("VOS-so:123+sp+cn+ergabs", vosTest.vosSOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("OVS-so:123+sp+cn+ergabs", ovsTest.ovsSOAgr123_SP_CN_ErgAbs.meanDevScore);
//		scores.put("OSV-so:123+sp+cn+ergabs", osvTest.osvSOAgr123_SP_CN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+ai", svoTest.svoSOAgr123_SP_AI.meanDevScore);
//		scores.put("SOV-so:123+sp+ai", sovTest.sovSOAgr123_SP_AI.meanDevScore);
//		scores.put("VSO-so:123+sp+ai", vsoTest.vsoSOAgr123_SP_AI.meanDevScore);
//		scores.put("VOS-so:123+sp+ai", vosTest.vosSOAgr123_SP_AI.meanDevScore);
//		scores.put("OVS-so:123+sp+ai", ovsTest.ovsSOAgr123_SP_AI.meanDevScore);
//		scores.put("OSV-so:123+sp+ai", osvTest.osvSOAgr123_SP_AI.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+ai+nom", svoTest.svoSOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("SOV-so:123+sp+ai+nom", sovTest.sovSOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("VSO-so:123+sp+ai+nom", vsoTest.vsoSOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("VOS-so:123+sp+ai+nom", vosTest.vosSOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("OVS-so:123+sp+ai+nom", ovsTest.ovsSOAgr123_SP_AI_Nom.meanDevScore);
//		scores.put("OSV-so:123+sp+ai+nom", osvTest.osvSOAgr123_SP_AI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+ai+acc", svoTest.svoSOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("SOV-so:123+sp+ai+acc", sovTest.sovSOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("VSO-so:123+sp+ai+acc", vsoTest.vsoSOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("VOS-so:123+sp+ai+acc", vosTest.vosSOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("OVS-so:123+sp+ai+acc", ovsTest.ovsSOAgr123_SP_AI_Acc.meanDevScore);
//		scores.put("OSV-so:123+sp+ai+acc", osvTest.osvSOAgr123_SP_AI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+ai+nomacc", svoTest.svoSOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("SOV-so:123+sp+ai+nomacc", sovTest.sovSOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("VSO-so:123+sp+ai+nomacc", vsoTest.vsoSOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("VOS-so:123+sp+ai+nomacc", vosTest.vosSOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("OVS-so:123+sp+ai+nomacc", ovsTest.ovsSOAgr123_SP_AI_NomAcc.meanDevScore);
//		scores.put("OSV-so:123+sp+ai+nomacc", osvTest.osvSOAgr123_SP_AI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+ai+erg", svoTest.svoSOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("SOV-so:123+sp+ai+erg", sovTest.sovSOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("VSO-so:123+sp+ai+erg", vsoTest.vsoSOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("VOS-so:123+sp+ai+erg", vosTest.vosSOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("OVS-so:123+sp+ai+erg", ovsTest.ovsSOAgr123_SP_AI_Erg.meanDevScore);
//		scores.put("OSV-so:123+sp+ai+erg", osvTest.osvSOAgr123_SP_AI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+ai+abs", svoTest.svoSOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("SOV-so:123+sp+ai+abs", sovTest.sovSOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("VSO-so:123+sp+ai+abs", vsoTest.vsoSOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("VOS-so:123+sp+ai+abs", vosTest.vosSOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("OVS-so:123+sp+ai+abs", ovsTest.ovsSOAgr123_SP_AI_Abs.meanDevScore);
//		scores.put("OSV-so:123+sp+ai+abs", osvTest.osvSOAgr123_SP_AI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+ai+ergabs", svoTest.svoSOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("SOV-so:123+sp+ai+ergabs", sovTest.sovSOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("VSO-so:123+sp+ai+ergabs", vsoTest.vsoSOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("VOS-so:123+sp+ai+ergabs", vosTest.vosSOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("OVS-so:123+sp+ai+ergabs", ovsTest.ovsSOAgr123_SP_AI_ErgAbs.meanDevScore);
//		scores.put("OSV-so:123+sp+ai+ergabs", osvTest.osvSOAgr123_SP_AI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hn", svoTest.svoSOAgr123_SP_HN.meanDevScore);
//		scores.put("SOV-so:123+sp+hn", sovTest.sovSOAgr123_SP_HN.meanDevScore);
//		scores.put("VSO-so:123+sp+hn", vsoTest.vsoSOAgr123_SP_HN.meanDevScore);
//		scores.put("VOS-so:123+sp+hn", vosTest.vosSOAgr123_SP_HN.meanDevScore);
//		scores.put("OVS-so:123+sp+hn", ovsTest.ovsSOAgr123_SP_HN.meanDevScore);
//		scores.put("OSV-so:123+sp+hn", osvTest.osvSOAgr123_SP_HN.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hn+nom", svoTest.svoSOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("SOV-so:123+sp+hn+nom", sovTest.sovSOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("VSO-so:123+sp+hn+nom", vsoTest.vsoSOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("VOS-so:123+sp+hn+nom", vosTest.vosSOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("OVS-so:123+sp+hn+nom", ovsTest.ovsSOAgr123_SP_HN_Nom.meanDevScore);
//		scores.put("OSV-so:123+sp+hn+nom", osvTest.osvSOAgr123_SP_HN_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hn+acc", svoTest.svoSOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("SOV-so:123+sp+hn+acc", sovTest.sovSOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("VSO-so:123+sp+hn+acc", vsoTest.vsoSOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("VOS-so:123+sp+hn+acc", vosTest.vosSOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("OVS-so:123+sp+hn+acc", ovsTest.ovsSOAgr123_SP_HN_Acc.meanDevScore);
//		scores.put("OSV-so:123+sp+hn+acc", osvTest.osvSOAgr123_SP_HN_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hn+nomacc", svoTest.svoSOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("SOV-so:123+sp+hn+nomacc", sovTest.sovSOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("VSO-so:123+sp+hn+nomacc", vsoTest.vsoSOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("VOS-so:123+sp+hn+nomacc", vosTest.vosSOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("OVS-so:123+sp+hn+nomacc", ovsTest.ovsSOAgr123_SP_HN_NomAcc.meanDevScore);
//		scores.put("OSV-so:123+sp+hn+nomacc", osvTest.osvSOAgr123_SP_HN_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hn+erg", svoTest.svoSOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("SOV-so:123+sp+hn+erg", sovTest.sovSOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("VSO-so:123+sp+hn+erg", vsoTest.vsoSOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("VOS-so:123+sp+hn+erg", vosTest.vosSOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("OVS-so:123+sp+hn+erg", ovsTest.ovsSOAgr123_SP_HN_Erg.meanDevScore);
//		scores.put("OSV-so:123+sp+hn+erg", osvTest.osvSOAgr123_SP_HN_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hn+abs", svoTest.svoSOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("SOV-so:123+sp+hn+abs", sovTest.sovSOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("VSO-so:123+sp+hn+abs", vsoTest.vsoSOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("VOS-so:123+sp+hn+abs", vosTest.vosSOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("OVS-so:123+sp+hn+abs", ovsTest.ovsSOAgr123_SP_HN_Abs.meanDevScore);
//		scores.put("OSV-so:123+sp+hn+abs", osvTest.osvSOAgr123_SP_HN_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hn+ergabs", svoTest.svoSOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("SOV-so:123+sp+hn+ergabs", sovTest.sovSOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("VSO-so:123+sp+hn+ergabs", vsoTest.vsoSOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("VOS-so:123+sp+hn+ergabs", vosTest.vosSOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("OVS-so:123+sp+hn+ergabs", ovsTest.ovsSOAgr123_SP_HN_ErgAbs.meanDevScore);
//		scores.put("OSV-so:123+sp+hn+ergabs", osvTest.osvSOAgr123_SP_HN_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hai", svoTest.svoSOAgr123_SP_HAI.meanDevScore);
//		scores.put("SOV-so:123+sp+hai", sovTest.sovSOAgr123_SP_HAI.meanDevScore);
//		scores.put("VSO-so:123+sp+hai", vsoTest.vsoSOAgr123_SP_HAI.meanDevScore);
//		scores.put("VOS-so:123+sp+hai", vosTest.vosSOAgr123_SP_HAI.meanDevScore);
//		scores.put("OVS-so:123+sp+hai", ovsTest.ovsSOAgr123_SP_HAI.meanDevScore);
//		scores.put("OSV-so:123+sp+hai", osvTest.osvSOAgr123_SP_HAI.meanDevScore);
//		unranked.add(scores);
//
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hai+nom", svoTest.svoSOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("SOV-so:123+sp+hai+nom", sovTest.sovSOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("VSO-so:123+sp+hai+nom", vsoTest.vsoSOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("VOS-so:123+sp+hai+nom", vosTest.vosSOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("OVS-so:123+sp+hai+nom", ovsTest.ovsSOAgr123_SP_HAI_Nom.meanDevScore);
//		scores.put("OSV-so:123+sp+hai+nom", osvTest.osvSOAgr123_SP_HAI_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hai+acc", svoTest.svoSOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("SOV-so:123+sp+hai+acc", sovTest.sovSOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("VSO-so:123+sp+hai+acc", vsoTest.vsoSOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("VOS-so:123+sp+hai+acc", vosTest.vosSOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("OVS-so:123+sp+hai+acc", ovsTest.ovsSOAgr123_SP_HAI_Acc.meanDevScore);
//		scores.put("OSV-so:123+sp+hai+acc", osvTest.osvSOAgr123_SP_HAI_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hai+nomacc", svoTest.svoSOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("SOV-so:123+sp+hai+nomacc", sovTest.sovSOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("VSO-so:123+sp+hai+nomacc", vsoTest.vsoSOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("VOS-so:123+sp+hai+nomacc", vosTest.vosSOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("OVS-so:123+sp+hai+nomacc", ovsTest.ovsSOAgr123_SP_HAI_NomAcc.meanDevScore);
//		scores.put("OSV-so:123+sp+hai+nomacc", osvTest.osvSOAgr123_SP_HAI_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hai+erg", svoTest.svoSOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("SOV-so:123+sp+hai+erg", sovTest.sovSOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("VSO-so:123+sp+hai+erg", vsoTest.vsoSOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("VOS-so:123+sp+hai+erg", vosTest.vosSOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("OVS-so:123+sp+hai+erg", ovsTest.ovsSOAgr123_SP_HAI_Erg.meanDevScore);
//		scores.put("OSV-so:123+sp+hai+erg", osvTest.osvSOAgr123_SP_HAI_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hai+abs", svoTest.svoSOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("SOV-so:123+sp+hai+abs", sovTest.sovSOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("VSO-so:123+sp+hai+abs", vsoTest.vsoSOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("VOS-so:123+sp+hai+abs", vosTest.vosSOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("OVS-so:123+sp+hai+abs", ovsTest.ovsSOAgr123_SP_HAI_Abs.meanDevScore);
//		scores.put("OSV-so:123+sp+hai+abs", osvTest.osvSOAgr123_SP_HAI_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+hai+ergabs", svoTest.svoSOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("SOV-so:123+sp+hai+ergabs", sovTest.sovSOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("VSO-so:123+sp+hai+ergabs", vsoTest.vsoSOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("VOS-so:123+sp+hai+ergabs", vosTest.vosSOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("OVS-so:123+sp+hai+ergabs", ovsTest.ovsSOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		scores.put("OSV-so:123+sp+hai+ergabs", osvTest.osvSOAgr123_SP_HAI_ErgAbs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mnm", svoTest.svoSOAgr123_SP_MNM.meanDevScore);
//		scores.put("SOV-so:123+sp+mnm", sovTest.sovSOAgr123_SP_MNM.meanDevScore);
//		scores.put("VSO-so:123+sp+mnm", vsoTest.vsoSOAgr123_SP_MNM.meanDevScore);
//		scores.put("VOS-so:123+sp+mnm", vosTest.vosSOAgr123_SP_MNM.meanDevScore);
//		scores.put("OVS-so:123+sp+mnm", ovsTest.ovsSOAgr123_SP_MNM.meanDevScore);
//		scores.put("OSV-so:123+sp+mnm", osvTest.osvSOAgr123_SP_MNM.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mnm+nom", svoTest.svoSOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("SOV-so:123+sp+mnm+nom", sovTest.sovSOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("VSO-so:123+sp+mnm+nom", vsoTest.vsoSOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("VOS-so:123+sp+mnm+nom", vosTest.vosSOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("OVS-so:123+sp+mnm+nom", ovsTest.ovsSOAgr123_SP_MNM_Nom.meanDevScore);
//		scores.put("OSV-so:123+sp+mnm+nom", osvTest.osvSOAgr123_SP_MNM_Nom.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mnm+acc", svoTest.svoSOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("SOV-so:123+sp+mnm+acc", sovTest.sovSOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("VSO-so:123+sp+mnm+acc", vsoTest.vsoSOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("VOS-so:123+sp+mnm+acc", vosTest.vosSOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("OVS-so:123+sp+mnm+acc", ovsTest.ovsSOAgr123_SP_MNM_Acc.meanDevScore);
//		scores.put("OSV-so:123+sp+mnm+acc", osvTest.osvSOAgr123_SP_MNM_Acc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mnm+nomacc", svoTest.svoSOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("SOV-so:123+sp+mnm+nomacc", sovTest.sovSOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("VSO-so:123+sp+mnm+nomacc", vsoTest.vsoSOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("VOS-so:123+sp+mnm+nomacc", vosTest.vosSOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("OVS-so:123+sp+mnm+nomacc", ovsTest.ovsSOAgr123_SP_MNM_NomAcc.meanDevScore);
//		scores.put("OSV-so:123+sp+mnm+nomacc", osvTest.osvSOAgr123_SP_MNM_NomAcc.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mnm+erg", svoTest.svoSOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("SOV-so:123+sp+mnm+erg", sovTest.sovSOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("VSO-so:123+sp+mnm+erg", vsoTest.vsoSOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("VOS-so:123+sp+mnm+erg", vosTest.vosSOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("OVS-so:123+sp+mnm+erg", ovsTest.ovsSOAgr123_SP_MNM_Erg.meanDevScore);
//		scores.put("OSV-so:123+sp+mnm+erg", osvTest.osvSOAgr123_SP_MNM_Erg.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mnm+abs", svoTest.svoSOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("SOV-so:123+sp+mnm+abs", sovTest.sovSOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("VSO-so:123+sp+mnm+abs", vsoTest.vsoSOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("VOS-so:123+sp+mnm+abs", vosTest.vosSOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("OVS-so:123+sp+mnm+abs", ovsTest.ovsSOAgr123_SP_MNM_Abs.meanDevScore);
//		scores.put("OSV-so:123+sp+mnm+abs", osvTest.osvSOAgr123_SP_MNM_Abs.meanDevScore);
//		unranked.add(scores);
//		
//		scores = new HashMap<String, BigDecimal>();
//		scores.put("SVO-so:123+sp+mnm+ergabs", svoTest.svoSOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("SOV-so:123+sp+mnm+ergabs", sovTest.sovSOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("VSO-so:123+sp+mnm+ergabs", vsoTest.vsoSOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("VOS-so:123+sp+mnm+ergabs", vosTest.vosSOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("OVS-so:123+sp+mnm+ergabs", ovsTest.ovsSOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		scores.put("OSV-so:123+sp+mnm+ergabs", osvTest.osvSOAgr123_SP_MNM_ErgAbs.meanDevScore);
//		unranked.add(scores);
		/////////////////////////////////////////////////////////////////////////////////////
		return unranked;
	}
	
	public boolean writeToCSV(String fn) {
		FileWriter csvWriter;
		try {
			csvWriter = new FileWriter(fn);
			csvWriter.append("Event");
			csvWriter.append(",");
			csvWriter.append("Probability");
			csvWriter.append(",");
			csvWriter.append("Word_Order");
			csvWriter.append(",");
			csvWriter.append("Eta0");
			csvWriter.append(",");
			csvWriter.append("Eta1");
			csvWriter.append(",");
			csvWriter.append("Eta2");
			csvWriter.append(",");
			csvWriter.append("I1");
			csvWriter.append(",");
			csvWriter.append("I2");
			csvWriter.append(",");
			csvWriter.append("Entropy_Deviation_Score");
			csvWriter.append(",");
			csvWriter.append("Surprisal1");
			csvWriter.append(",");
			csvWriter.append("Surprisal2");
			csvWriter.append(",");
			csvWriter.append("Surprisal3");
			csvWriter.append(",");
			csvWriter.append("Surprisal_Deviation_Score");
			csvWriter.append(",");
			csvWriter.append("Mutual_Information");
			csvWriter.append("\n");
			for(int k = 0; k < events.size(); k++) {
				if(events.get(k).probability > 0.0) {
					csvWriter.append(events.get(k).arg1 + " " + events.get(k).verb + " " + events.get(k).arg2);
					csvWriter.append(",");
					csvWriter.append(String.valueOf(events.get(k).probability));
					csvWriter.append(",");
					csvWriter.append("SVO");
					csvWriter.append(",");
					csvWriter.append(String.valueOf(this.etaNought));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(svoTest.svo.eta1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(svoTest.svo.eta2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(svoTest.svo.i1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(svoTest.svo.i2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(svoTest.svo.entDevScores.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(svoTest.svo.surprisal1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(svoTest.svo.surprisal2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(svoTest.svo.surprisal3.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(svoTest.svo.surpDevScores.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(svoTest.svo.mi.get(k)));
					csvWriter.append("\n");
					
					csvWriter.append(events.get(k).arg1 + " " + events.get(k).verb + " " + events.get(k).arg2);
					csvWriter.append(",");
					csvWriter.append(String.valueOf(events.get(k).probability));
					csvWriter.append(",");
					csvWriter.append("SOV");
					csvWriter.append(",");
					csvWriter.append(String.valueOf(this.etaNought));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(sovTest.sov.eta1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(sovTest.sov.eta2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(sovTest.sov.i1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(sovTest.sov.i2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(sovTest.sov.entDevScores.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(sovTest.sov.surprisal1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(sovTest.sov.surprisal2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(sovTest.sov.surprisal3.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(sovTest.sov.surpDevScores.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(sovTest.sov.mi.get(k)));
					csvWriter.append("\n");
					
					csvWriter.append(events.get(k).arg1 + " " + events.get(k).verb + " " + events.get(k).arg2);
					csvWriter.append(",");
					csvWriter.append(String.valueOf(events.get(k).probability));
					csvWriter.append(",");
					csvWriter.append("VSO");
					csvWriter.append(",");
					csvWriter.append(String.valueOf(this.etaNought));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vsoTest.vso.eta1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vsoTest.vso.eta2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vsoTest.vso.i1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vsoTest.vso.i2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vsoTest.vso.entDevScores.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vsoTest.vso.surprisal1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vsoTest.vso.surprisal2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vsoTest.vso.surprisal3.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vsoTest.vso.surpDevScores.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vsoTest.vso.mi.get(k)));
					csvWriter.append("\n");
					
					csvWriter.append(events.get(k).arg1 + " " + events.get(k).verb + " " + events.get(k).arg2);
					csvWriter.append(",");
					csvWriter.append(String.valueOf(events.get(k).probability));
					csvWriter.append(",");
					csvWriter.append("VOS");
					csvWriter.append(",");
					csvWriter.append(String.valueOf(this.etaNought));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vosTest.vos.eta1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vosTest.vos.eta2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vosTest.vos.i1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vosTest.vos.i2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vosTest.vos.entDevScores.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vosTest.vos.surprisal1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vosTest.vos.surprisal2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vosTest.vos.surprisal3.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vosTest.vos.surpDevScores.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(vosTest.vos.mi.get(k)));
					csvWriter.append("\n");
					
					csvWriter.append(events.get(k).arg1 + " " + events.get(k).verb + " " + events.get(k).arg2);
					csvWriter.append(",");
					csvWriter.append(String.valueOf(events.get(k).probability));
					csvWriter.append(",");
					csvWriter.append("OVS");
					csvWriter.append(",");
					csvWriter.append(String.valueOf(this.etaNought));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(ovsTest.ovs.eta1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(ovsTest.ovs.eta2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(ovsTest.ovs.i1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(ovsTest.ovs.i2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(ovsTest.ovs.entDevScores.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(ovsTest.ovs.surprisal1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(ovsTest.ovs.surprisal2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(ovsTest.ovs.surprisal3.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(ovsTest.ovs.surpDevScores.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(ovsTest.ovs.mi.get(k)));
					csvWriter.append("\n");
					
					csvWriter.append(events.get(k).arg1 + " " + events.get(k).verb + " " + events.get(k).arg2);
					csvWriter.append(",");
					csvWriter.append(String.valueOf(events.get(k).probability));
					csvWriter.append(",");
					csvWriter.append("OSV");
					csvWriter.append(",");
					csvWriter.append(String.valueOf(this.etaNought));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(osvTest.osv.eta1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(osvTest.osv.eta2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(osvTest.osv.i1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(osvTest.osv.i2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(osvTest.osv.entDevScores.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(osvTest.osv.surprisal1.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(osvTest.osv.surprisal2.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(osvTest.osv.surprisal3.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(osvTest.osv.surpDevScores.get(k)));
					csvWriter.append(",");
					csvWriter.append(String.valueOf(osvTest.osv.mi.get(k)));
					csvWriter.append("\n");
				}
			}
			csvWriter.flush();
			csvWriter.close();
			return true;
		} catch (IOException e) {
			return false;
		}
		
	}
}
