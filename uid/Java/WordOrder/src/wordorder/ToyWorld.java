package wordorder;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;

public class ToyWorld extends World{

	public void run() {
		for(int i = 0; i < this.events.size(); i++) {
			Event ev = this.events.get(i);
			
//			ArrayList<Word> protoUttS_123 = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_123 = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_123 = new ArrayList<Word>();
//			
//			protoUttS_123.add(lexicons.get("s-123").get(ev.arg1));
//			protoUttO_123.add(lexicons.get("o-123").get(ev.arg1));
//			protoUttSO_123.add(lexicons.get("so-123").get(ev.arg1));
//			
//			protoUttS_123.add(lexicons.get("s-123").get(ev.verb));
//			protoUttO_123.add(lexicons.get("o-123").get(ev.verb));
//			protoUttSO_123.add(lexicons.get("so-123").get(ev.verb));
//			
//			protoUttS_123.add(lexicons.get("s-123").get(ev.arg2));
//			protoUttO_123.add(lexicons.get("o-123").get(ev.arg2));
//			protoUttSO_123.add(lexicons.get("so-123").get(ev.arg2));
//		
//			ArrayList<Word> protoUttS_SP = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_SP = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_SP = new ArrayList<Word>();
//
//			protoUttS_SP.add(lexicons.get("s-sp").get(ev.arg1));
//			protoUttO_SP.add(lexicons.get("o-sp").get(ev.arg1));
//			protoUttSO_SP.add(lexicons.get("so-sp").get(ev.arg1));
//
//			protoUttS_SP.add(lexicons.get("s-sp").get(ev.verb));
//			protoUttO_SP.add(lexicons.get("o-sp").get(ev.verb));
//			protoUttSO_SP.add(lexicons.get("so-sp").get(ev.verb));
//
//			protoUttS_SP.add(lexicons.get("s-sp").get(ev.arg2));
//			protoUttO_SP.add(lexicons.get("o-sp").get(ev.arg2));
//			protoUttSO_SP.add(lexicons.get("so-sp").get(ev.arg2));
//
//			ArrayList<Word> protoUttS_We = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_We = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_We = new ArrayList<Word>();
//
//			protoUttS_We.add(lexicons.get("s-we").get(ev.arg1));
//			protoUttO_We.add(lexicons.get("o-we").get(ev.arg1));
//			protoUttSO_We.add(lexicons.get("so-we").get(ev.arg1));
//
//			protoUttS_We.add(lexicons.get("s-we").get(ev.verb));
//			protoUttO_We.add(lexicons.get("o-we").get(ev.verb));
//			protoUttSO_We.add(lexicons.get("so-we").get(ev.verb));
//
//			protoUttS_We.add(lexicons.get("s-we").get(ev.arg2));
//			protoUttO_We.add(lexicons.get("o-we").get(ev.arg2));
//			protoUttSO_We.add(lexicons.get("so-we").get(ev.arg2));
//			
//			ArrayList<Word> protoUttS_123SP = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_123SP = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_123SP = new ArrayList<Word>();
//
//			protoUttS_123SP.add(lexicons.get("s-123+sp").get(ev.arg1));
//			protoUttO_123SP.add(lexicons.get("o-123+sp").get(ev.arg1));
//			protoUttSO_123SP.add(lexicons.get("so-123+sp").get(ev.arg1));
//
//			protoUttS_123SP.add(lexicons.get("s-123+sp").get(ev.verb));
//			protoUttO_123SP.add(lexicons.get("o-123+sp").get(ev.verb));
//			protoUttSO_123SP.add(lexicons.get("so-123+sp").get(ev.verb));
//
//			protoUttS_123SP.add(lexicons.get("s-123+sp").get(ev.arg2));
//			protoUttO_123SP.add(lexicons.get("o-123+sp").get(ev.arg2));
//			protoUttSO_123SP.add(lexicons.get("so-123+sp").get(ev.arg2));
//			
//			ArrayList<Word> protoUttS_MF = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_MF = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_MF = new ArrayList<Word>();
//			
//			protoUttS_MF.add(lexicons.get("s-mf").get(ev.arg1));
//			protoUttO_MF.add(lexicons.get("o-mf").get(ev.arg1));
//			protoUttSO_MF.add(lexicons.get("so-mf").get(ev.arg1));
//			
//			protoUttS_MF.add(lexicons.get("s-mf").get(ev.verb));
//			protoUttO_MF.add(lexicons.get("o-mf").get(ev.verb));
//			protoUttSO_MF.add(lexicons.get("so-mf").get(ev.verb));
//			
//			protoUttS_MF.add(lexicons.get("s-mf").get(ev.arg2));
//			protoUttO_MF.add(lexicons.get("o-mf").get(ev.arg2));
//			protoUttSO_MF.add(lexicons.get("so-mf").get(ev.arg2));
//
//			ArrayList<Word> protoUttS_123SPMF = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_123SPMF = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_123SPMF = new ArrayList<Word>();
//
//			protoUttS_123SPMF.add(lexicons.get("s-123+sp+mf").get(ev.arg1));
//			protoUttO_123SPMF.add(lexicons.get("o-123+sp+mf").get(ev.arg1));
//			protoUttSO_123SPMF.add(lexicons.get("so-123+sp+mf").get(ev.arg1));
//
//			protoUttS_123SPMF.add(lexicons.get("s-123+sp+mf").get(ev.verb));
//			protoUttO_123SPMF.add(lexicons.get("o-123+sp+mf").get(ev.verb));
//			protoUttSO_123SPMF.add(lexicons.get("so-123+sp+mf").get(ev.verb));
//
//			protoUttS_123SPMF.add(lexicons.get("s-123+sp+mf").get(ev.arg2));
//			protoUttO_123SPMF.add(lexicons.get("o-123+sp+mf").get(ev.arg2));
//			protoUttSO_123SPMF.add(lexicons.get("so-123+sp+mf").get(ev.arg2));
//			
//			ArrayList<Word> protoUttS_MFN = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_MFN = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_MFN = new ArrayList<Word>();
//			
//			protoUttS_MFN.add(lexicons.get("s-mfn").get(ev.arg1));
//			protoUttO_MFN.add(lexicons.get("o-mfn").get(ev.arg1));
//			protoUttSO_MFN.add(lexicons.get("so-mfn").get(ev.arg1));
//			
//			protoUttS_MFN.add(lexicons.get("s-mfn").get(ev.verb));
//			protoUttO_MFN.add(lexicons.get("o-mfn").get(ev.verb));
//			protoUttSO_MFN.add(lexicons.get("so-mfn").get(ev.verb));
//			
//			protoUttS_MFN.add(lexicons.get("s-mfn").get(ev.arg2));
//			protoUttO_MFN.add(lexicons.get("o-mfn").get(ev.arg2));
//			protoUttSO_MFN.add(lexicons.get("so-mfn").get(ev.arg2));
//
//			ArrayList<Word> protoUttS_123SPMFN = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_123SPMFN = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_123SPMFN = new ArrayList<Word>();
//
//			protoUttS_123SPMFN.add(lexicons.get("s-123+sp+mfn").get(ev.arg1));
//			protoUttO_123SPMFN.add(lexicons.get("o-123+sp+mfn").get(ev.arg1));
//			protoUttSO_123SPMFN.add(lexicons.get("so-123+sp+mfn").get(ev.arg1));
//
//			protoUttS_123SPMFN.add(lexicons.get("s-123+sp+mfn").get(ev.verb));
//			protoUttO_123SPMFN.add(lexicons.get("o-123+sp+mfn").get(ev.verb));
//			protoUttSO_123SPMFN.add(lexicons.get("so-123+sp+mfn").get(ev.verb));
//
//			protoUttS_123SPMFN.add(lexicons.get("s-123+sp+mfn").get(ev.arg2));
//			protoUttO_123SPMFN.add(lexicons.get("o-123+sp+mfn").get(ev.arg2));
//			protoUttSO_123SPMFN.add(lexicons.get("so-123+sp+mfn").get(ev.arg2));
//						
//			ArrayList<Word> protoUttS_CN = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_CN = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_CN = new ArrayList<Word>();
//			
//			protoUttS_CN.add(lexicons.get("s-cn").get(ev.arg1));
//			protoUttO_CN.add(lexicons.get("o-cn").get(ev.arg1));
//			protoUttSO_CN.add(lexicons.get("so-cn").get(ev.arg1));
//			
//			protoUttS_CN.add(lexicons.get("s-cn").get(ev.verb));
//			protoUttO_CN.add(lexicons.get("o-cn").get(ev.verb));
//			protoUttSO_CN.add(lexicons.get("so-cn").get(ev.verb));
//			
//			protoUttS_CN.add(lexicons.get("s-cn").get(ev.arg2));
//			protoUttO_CN.add(lexicons.get("o-cn").get(ev.arg2));
//			protoUttSO_CN.add(lexicons.get("so-cn").get(ev.arg2));
//
//			ArrayList<Word> protoUttS_123SPCN = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_123SPCN = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_123SPCN = new ArrayList<Word>();
//
//			protoUttS_123SPCN.add(lexicons.get("s-123+sp+cn").get(ev.arg1));
//			protoUttO_123SPCN.add(lexicons.get("o-123+sp+cn").get(ev.arg1));
//			protoUttSO_123SPCN.add(lexicons.get("so-123+sp+cn").get(ev.arg1));
//
//			protoUttS_123SPCN.add(lexicons.get("s-123+sp+cn").get(ev.verb));
//			protoUttO_123SPCN.add(lexicons.get("o-123+sp+cn").get(ev.verb));
//			protoUttSO_123SPCN.add(lexicons.get("so-123+sp+cn").get(ev.verb));
//
//			protoUttS_123SPCN.add(lexicons.get("s-123+sp+cn").get(ev.arg2));
//			protoUttO_123SPCN.add(lexicons.get("o-123+sp+cn").get(ev.arg2));
//			protoUttSO_123SPCN.add(lexicons.get("so-123+sp+cn").get(ev.arg2));		
//						
//			ArrayList<Word> protoUttS_AI = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_AI = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_AI = new ArrayList<Word>();
//			
//			protoUttS_AI.add(lexicons.get("s-ai").get(ev.arg1));
//			protoUttO_AI.add(lexicons.get("o-ai").get(ev.arg1));
//			protoUttSO_AI.add(lexicons.get("so-ai").get(ev.arg1));
//			
//			protoUttS_AI.add(lexicons.get("s-ai").get(ev.verb));
//			protoUttO_AI.add(lexicons.get("o-ai").get(ev.verb));
//			protoUttSO_AI.add(lexicons.get("so-ai").get(ev.verb));
//			
//			protoUttS_AI.add(lexicons.get("s-ai").get(ev.arg2));
//			protoUttO_AI.add(lexicons.get("o-ai").get(ev.arg2));
//			protoUttSO_AI.add(lexicons.get("so-ai").get(ev.arg2));
//
//			ArrayList<Word> protoUttS_123SPAI = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_123SPAI = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_123SPAI = new ArrayList<Word>();
//
//			protoUttS_123SPAI.add(lexicons.get("s-123+sp+ai").get(ev.arg1));
//			protoUttO_123SPAI.add(lexicons.get("o-123+sp+ai").get(ev.arg1));
//			protoUttSO_123SPAI.add(lexicons.get("so-123+sp+ai").get(ev.arg1));
//
//			protoUttS_123SPAI.add(lexicons.get("s-123+sp+ai").get(ev.verb));
//			protoUttO_123SPAI.add(lexicons.get("o-123+sp+ai").get(ev.verb));
//			protoUttSO_123SPAI.add(lexicons.get("so-123+sp+ai").get(ev.verb));
//
//			protoUttS_123SPAI.add(lexicons.get("s-123+sp+ai").get(ev.arg2));
//			protoUttO_123SPAI.add(lexicons.get("o-123+sp+ai").get(ev.arg2));
//			protoUttSO_123SPAI.add(lexicons.get("so-123+sp+ai").get(ev.arg2));
//			
//			ArrayList<Word> protoUttS_HN = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_HN = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_HN = new ArrayList<Word>();
//			
//			protoUttS_HN.add(lexicons.get("s-hn").get(ev.arg1));
//			protoUttO_HN.add(lexicons.get("o-hn").get(ev.arg1));
//			protoUttSO_HN.add(lexicons.get("so-hn").get(ev.arg1));
//			
//			protoUttS_HN.add(lexicons.get("s-hn").get(ev.verb));
//			protoUttO_HN.add(lexicons.get("o-hn").get(ev.verb));
//			protoUttSO_HN.add(lexicons.get("so-hn").get(ev.verb));
//			
//			protoUttS_HN.add(lexicons.get("s-hn").get(ev.arg2));
//			protoUttO_HN.add(lexicons.get("o-hn").get(ev.arg2));
//			protoUttSO_HN.add(lexicons.get("so-hn").get(ev.arg2));
//			
//			ArrayList<Word> protoUttS_123SPHN = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_123SPHN = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_123SPHN = new ArrayList<Word>();
//
//			protoUttS_123SPHN.add(lexicons.get("s-123+sp+hn").get(ev.arg1));
//			protoUttO_123SPHN.add(lexicons.get("o-123+sp+hn").get(ev.arg1));
//			protoUttSO_123SPHN.add(lexicons.get("so-123+sp+hn").get(ev.arg1));
//
//			protoUttS_123SPHN.add(lexicons.get("s-123+sp+hn").get(ev.verb));
//			protoUttO_123SPHN.add(lexicons.get("o-123+sp+hn").get(ev.verb));
//			protoUttSO_123SPHN.add(lexicons.get("so-123+sp+hn").get(ev.verb));
//
//			protoUttS_123SPHN.add(lexicons.get("s-123+sp+hn").get(ev.arg2));
//			protoUttO_123SPHN.add(lexicons.get("o-123+sp+hn").get(ev.arg2));
//			protoUttSO_123SPHN.add(lexicons.get("so-123+sp+hn").get(ev.arg2));
//			
//			ArrayList<Word> protoUttS_HAI = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_HAI = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_HAI = new ArrayList<Word>();
//			
//			protoUttS_HAI.add(lexicons.get("s-hai").get(ev.arg1));
//			protoUttO_HAI.add(lexicons.get("o-hai").get(ev.arg1));
//			protoUttSO_HAI.add(lexicons.get("so-hai").get(ev.arg1));
//			
//			protoUttS_HAI.add(lexicons.get("s-hai").get(ev.verb));
//			protoUttO_HAI.add(lexicons.get("o-hai").get(ev.verb));
//			protoUttSO_HAI.add(lexicons.get("so-hai").get(ev.verb));
//			
//			protoUttS_HAI.add(lexicons.get("s-hai").get(ev.arg2));
//			protoUttO_HAI.add(lexicons.get("o-hai").get(ev.arg2));
//			protoUttSO_HAI.add(lexicons.get("so-hai").get(ev.arg2));
//
//			ArrayList<Word> protoUttS_123SPHAI = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_123SPHAI = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_123SPHAI = new ArrayList<Word>();
//
//			protoUttS_123SPHAI.add(lexicons.get("s-123+sp+hai").get(ev.arg1));
//			protoUttO_123SPHAI.add(lexicons.get("o-123+sp+hai").get(ev.arg1));
//			protoUttSO_123SPHAI.add(lexicons.get("so-123+sp+hai").get(ev.arg1));
//
//			protoUttS_123SPHAI.add(lexicons.get("s-123+sp+hai").get(ev.verb));
//			protoUttO_123SPHAI.add(lexicons.get("o-123+sp+hai").get(ev.verb));
//			protoUttSO_123SPHAI.add(lexicons.get("so-123+sp+hai").get(ev.verb));
//
//			protoUttS_123SPHAI.add(lexicons.get("s-123+sp+hai").get(ev.arg2));
//			protoUttO_123SPHAI.add(lexicons.get("o-123+sp+hai").get(ev.arg2));
//			protoUttSO_123SPHAI.add(lexicons.get("so-123+sp+hai").get(ev.arg2));
//			
//			ArrayList<Word> protoUttS_MNM = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_MNM = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_MNM = new ArrayList<Word>();
//			
//			protoUttS_MNM.add(lexicons.get("s-mnm").get(ev.arg1));
//			protoUttO_MNM.add(lexicons.get("o-mnm").get(ev.arg1));
//			protoUttSO_MNM.add(lexicons.get("so-mnm").get(ev.arg1));
//			
//			protoUttS_MNM.add(lexicons.get("s-mnm").get(ev.verb));
//			protoUttO_MNM.add(lexicons.get("o-mnm").get(ev.verb));
//			protoUttSO_MNM.add(lexicons.get("so-mnm").get(ev.verb));
//			
//			protoUttS_MNM.add(lexicons.get("s-mnm").get(ev.arg2));
//			protoUttO_MNM.add(lexicons.get("o-mnm").get(ev.arg2));
//			protoUttSO_MNM.add(lexicons.get("so-mnm").get(ev.arg2));
//
//			ArrayList<Word> protoUttS_123SPMNM = new ArrayList<Word>();
//			ArrayList<Word> protoUttO_123SPMNM = new ArrayList<Word>();
//			ArrayList<Word> protoUttSO_123SPMNM = new ArrayList<Word>();
//
//			protoUttS_123SPMNM.add(lexicons.get("s-123+sp+mnm").get(ev.arg1));
//			protoUttO_123SPMNM.add(lexicons.get("o-123+sp+mnm").get(ev.arg1));
//			protoUttSO_123SPMNM.add(lexicons.get("so-123+sp+mnm").get(ev.arg1));
//
//			protoUttS_123SPMNM.add(lexicons.get("s-123+sp+mnm").get(ev.verb));
//			protoUttO_123SPMNM.add(lexicons.get("o-123+sp+mnm").get(ev.verb));
//			protoUttSO_123SPMNM.add(lexicons.get("so-123+sp+mnm").get(ev.verb));
//
//			protoUttS_123SPMNM.add(lexicons.get("s-123+sp+mnm").get(ev.arg2));
//			protoUttO_123SPMNM.add(lexicons.get("o-123+sp+mnm").get(ev.arg2));
//			protoUttSO_123SPMNM.add(lexicons.get("so-123+sp+mnm").get(ev.arg2));

			for(int j = 0; j < 6; j++) {
				this.utt.add(new Utterance(ev, j));
//				this.nomUtt.add(new Utterance(ev,j, 1));
//				this.accUtt.add(new Utterance(ev, j, 2));
//				this.nomAccUtt.add(new Utterance(ev, j, 3));
//				this.ergUtt.add(new Utterance(ev, j, 4));
//				this.absUtt.add(new Utterance(ev, j, 5));
//				this.ergAbsUtt.add(new Utterance(ev, j, 6));
//				
//				this.sAgr123Utt.add(new Utterance(protoUttS_123, j, 0, 2));
//				this.sAgrWeUtt.add(new Utterance(protoUttS_We, j, 0, 2));
				
//				this.oAgr123Utt.add(new Utterance(protoUttO_123, j, 0, 4));
////				this.oAgrMFUtt.add(new Utterance(protoUttO_We, j, 0, 4));
//				
//				this.soAgr123Utt.add(new Utterance(protoUttSO_123, j, 0, 6));
////				this.soAgrMFUtt.add(new Utterance(protoUttSO_We, j, 0, 6));
//				
//				this.sAgrSPUtt.add(new Utterance(protoUttS_SP, j, 0, 7));
//				this.oAgrSPUtt.add(new Utterance(protoUttO_SP, j, 0, 8));
//				this.soAgrSPUtt.add(new Utterance(protoUttSO_SP, j, 0, 9));
//				
//				this.sAgr123_SPUtt.add(new Utterance(protoUttS_123SP, j, 0, 10));
//				this.sAgr123_SP_NomUtt.add(new Utterance(protoUttS_123SP, j, 1, 10));
//				this.sAgr123_SP_AccUtt.add(new Utterance(protoUttS_123SP, j, 2, 10));
//				this.sAgr123_SP_NomAccUtt.add(new Utterance(protoUttS_123SP, j, 3, 10));
//				this.sAgr123_SP_ErgUtt.add(new Utterance(protoUttS_123SP, j, 4, 10));
//				this.sAgr123_SP_AbsUtt.add(new Utterance(protoUttS_123SP, j, 5, 10));
//				this.sAgr123_SP_ErgAbsUtt.add(new Utterance(protoUttS_123SP, j, 6, 10));
//				
//				this.oAgr123_SPUtt.add(new Utterance(protoUttO_123SP, j, 0, 11));
//				this.oAgr123_SP_NomUtt.add(new Utterance(protoUttO_123SP, j, 1, 11));
//				this.oAgr123_SP_AccUtt.add(new Utterance(protoUttO_123SP, j, 2, 11));
//				this.oAgr123_SP_NomAccUtt.add(new Utterance(protoUttO_123SP, j, 3, 11));
//				this.oAgr123_SP_ErgUtt.add(new Utterance(protoUttO_123SP, j, 4, 11));
//				this.oAgr123_SP_AbsUtt.add(new Utterance(protoUttO_123SP, j, 5, 11));
//				this.oAgr123_SP_ErgAbsUtt.add(new Utterance(protoUttO_123SP, j, 6, 11));
//				
//				this.soAgr123_SPUtt.add(new Utterance(protoUttSO_123SP, j, 0, 12));
//				this.soAgr123_SP_NomUtt.add(new Utterance(protoUttSO_123SP, j, 1, 12));
//				this.soAgr123_SP_AccUtt.add(new Utterance(protoUttSO_123SP, j, 2, 12));
//				this.soAgr123_SP_NomAccUtt.add(new Utterance(protoUttSO_123SP, j, 3, 12));
//				this.soAgr123_SP_ErgUtt.add(new Utterance(protoUttSO_123SP, j, 4, 12));
//				this.soAgr123_SP_AbsUtt.add(new Utterance(protoUttSO_123SP, j, 5, 12));
//				this.soAgr123_SP_ErgAbsUtt.add(new Utterance(protoUttSO_123SP, j, 6, 12));
//				
//				this.sAgrMFUtt.add(new Utterance(protoUttS_MF, j, 0, 1));
//				this.sAgrMF_NomUtt.add(new Utterance(protoUttS_MF, j, 1, 1));
//				this.sAgrMF_AccUtt.add(new Utterance(protoUttS_MF, j, 2, 1));
//				this.sAgrMF_NomAccUtt.add(new Utterance(protoUttS_MF, j, 3, 1));
//				this.sAgrMF_ErgUtt.add(new Utterance(protoUttS_MF, j, 4, 1));
//				this.sAgrMF_AbsUtt.add(new Utterance(protoUttS_MF, j, 5, 1));
//				this.sAgrMF_ErgAbsUtt.add(new Utterance(protoUttS_MF, j, 6, 1));
//				
//				this.sAgrMFNUtt.add(new Utterance(protoUttS_MFN, j, 0, 1));
//				this.sAgrMFN_NomUtt.add(new Utterance(protoUttS_MFN, j, 1, 1));
//				this.sAgrMFN_AccUtt.add(new Utterance(protoUttS_MFN, j, 2, 1));
//				this.sAgrMFN_NomAccUtt.add(new Utterance(protoUttS_MFN, j, 3, 1));
//				this.sAgrMFN_ErgUtt.add(new Utterance(protoUttS_MFN, j, 4, 1));
//				this.sAgrMFN_AbsUtt.add(new Utterance(protoUttS_MFN, j, 5, 1));
//				this.sAgrMFN_ErgAbsUtt.add(new Utterance(protoUttS_MFN, j, 6, 1));
//				
//				this.sAgrCNUtt.add(new Utterance(protoUttS_CN, j, 0, 1));
//				this.sAgrCN_NomUtt.add(new Utterance(protoUttS_CN, j, 1, 1));
//				this.sAgrCN_AccUtt.add(new Utterance(protoUttS_CN, j, 2, 1));
//				this.sAgrCN_NomAccUtt.add(new Utterance(protoUttS_CN, j, 3, 1));
//				this.sAgrCN_ErgUtt.add(new Utterance(protoUttS_CN, j, 4, 1));
//				this.sAgrCN_AbsUtt.add(new Utterance(protoUttS_CN, j, 5, 1));
//				this.sAgrCN_ErgAbsUtt.add(new Utterance(protoUttS_CN, j, 6, 1));
//				
//				this.sAgrAIUtt.add(new Utterance(protoUttS_AI, j, 0, 1));
//				this.sAgrAI_NomUtt.add(new Utterance(protoUttS_AI, j, 1, 1));
//				this.sAgrAI_AccUtt.add(new Utterance(protoUttS_AI, j, 2, 1));
//				this.sAgrAI_NomAccUtt.add(new Utterance(protoUttS_AI, j, 3, 1));
//				this.sAgrAI_ErgUtt.add(new Utterance(protoUttS_AI, j, 4, 1));
//				this.sAgrAI_AbsUtt.add(new Utterance(protoUttS_AI, j, 5, 1));
//				this.sAgrAI_ErgAbsUtt.add(new Utterance(protoUttS_AI, j, 6, 1));
//				
//				this.sAgrHNUtt.add(new Utterance(protoUttS_HN, j, 0, 1));
//				this.sAgrHN_NomUtt.add(new Utterance(protoUttS_HN, j, 1, 1));
//				this.sAgrHN_AccUtt.add(new Utterance(protoUttS_HN, j, 2, 1));
//				this.sAgrHN_NomAccUtt.add(new Utterance(protoUttS_HN, j, 3, 1));
//				this.sAgrHN_ErgUtt.add(new Utterance(protoUttS_HN, j, 4, 1));
//				this.sAgrHN_AbsUtt.add(new Utterance(protoUttS_HN, j, 5, 1));
//				this.sAgrHN_ErgAbsUtt.add(new Utterance(protoUttS_HN, j, 6, 1));
//				
//				this.sAgrHAIUtt.add(new Utterance(protoUttS_HAI, j, 0, 1));
//				this.sAgrHAI_NomUtt.add(new Utterance(protoUttS_HAI, j, 1, 1));
//				this.sAgrHAI_AccUtt.add(new Utterance(protoUttS_HAI, j, 2, 1));
//				this.sAgrHAI_NomAccUtt.add(new Utterance(protoUttS_HAI, j, 3, 1));
//				this.sAgrHAI_ErgUtt.add(new Utterance(protoUttS_HAI, j, 4, 1));
//				this.sAgrHAI_AbsUtt.add(new Utterance(protoUttS_HAI, j, 5, 1));
//				this.sAgrHAI_ErgAbsUtt.add(new Utterance(protoUttS_HAI, j, 6, 1));
//				
//				this.sAgrMNMUtt.add(new Utterance(protoUttS_MNM, j, 0, 1));
//				this.sAgrMNM_NomUtt.add(new Utterance(protoUttS_MNM, j, 1, 1));
//				this.sAgrMNM_AccUtt.add(new Utterance(protoUttS_MNM, j, 2, 1));
//				this.sAgrMNM_NomAccUtt.add(new Utterance(protoUttS_MNM, j, 3, 1));
//				this.sAgrMNM_ErgUtt.add(new Utterance(protoUttS_MNM, j, 4, 1));
//				this.sAgrMNM_AbsUtt.add(new Utterance(protoUttS_MNM, j, 5, 1));
//				this.sAgrMNM_ErgAbsUtt.add(new Utterance(protoUttS_MNM, j, 6, 1));
//				
//				this.oAgrMFUtt.add(new Utterance(protoUttO_MF, j, 0, 3));
//				this.oAgrMF_NomUtt.add(new Utterance(protoUttO_MF, j, 1, 3));
//				this.oAgrMF_AccUtt.add(new Utterance(protoUttO_MF, j, 2, 3));
//				this.oAgrMF_NomAccUtt.add(new Utterance(protoUttO_MF, j, 3, 3));
//				this.oAgrMF_ErgUtt.add(new Utterance(protoUttO_MF, j, 4, 3));
//				this.oAgrMF_AbsUtt.add(new Utterance(protoUttO_MF, j, 5, 3));
//				this.oAgrMF_ErgAbsUtt.add(new Utterance(protoUttO_MF, j, 6, 3));
//				
//				this.oAgrMFNUtt.add(new Utterance(protoUttO_MFN, j, 0, 3));
//				this.oAgrMFN_NomUtt.add(new Utterance(protoUttO_MFN, j, 1, 3));
//				this.oAgrMFN_AccUtt.add(new Utterance(protoUttO_MFN, j, 2, 3));
//				this.oAgrMFN_NomAccUtt.add(new Utterance(protoUttO_MFN, j, 3, 3));
//				this.oAgrMFN_ErgUtt.add(new Utterance(protoUttO_MFN, j, 4, 3));
//				this.oAgrMFN_AbsUtt.add(new Utterance(protoUttO_MFN, j, 5, 3));
//				this.oAgrMFN_ErgAbsUtt.add(new Utterance(protoUttO_MFN, j, 6, 3));
//				
//				this.oAgrCNUtt.add(new Utterance(protoUttO_CN, j, 0, 3));
//				this.oAgrCN_NomUtt.add(new Utterance(protoUttO_CN, j, 1, 3));
//				this.oAgrCN_AccUtt.add(new Utterance(protoUttO_CN, j, 2, 3));
//				this.oAgrCN_NomAccUtt.add(new Utterance(protoUttO_CN, j, 3, 3));
//				this.oAgrCN_ErgUtt.add(new Utterance(protoUttO_CN, j, 4, 3));
//				this.oAgrCN_AbsUtt.add(new Utterance(protoUttO_CN, j, 5, 3));
//				this.oAgrCN_ErgAbsUtt.add(new Utterance(protoUttO_CN, j, 6, 3));
//				
//				this.oAgrAIUtt.add(new Utterance(protoUttO_AI, j, 0, 3));
//				this.oAgrAI_NomUtt.add(new Utterance(protoUttO_AI, j, 1, 3));
//				this.oAgrAI_AccUtt.add(new Utterance(protoUttO_AI, j, 2, 3));
//				this.oAgrAI_NomAccUtt.add(new Utterance(protoUttO_AI, j, 3, 3));
//				this.oAgrAI_ErgUtt.add(new Utterance(protoUttO_AI, j, 4, 3));
//				this.oAgrAI_AbsUtt.add(new Utterance(protoUttO_AI, j, 5, 3));
//				this.oAgrAI_ErgAbsUtt.add(new Utterance(protoUttO_AI, j, 6, 3));
//				
//				this.oAgrHNUtt.add(new Utterance(protoUttO_HN, j, 0, 3));
//				this.oAgrHN_NomUtt.add(new Utterance(protoUttO_HN, j, 1, 3));
//				this.oAgrHN_AccUtt.add(new Utterance(protoUttO_HN, j, 2, 3));
//				this.oAgrHN_NomAccUtt.add(new Utterance(protoUttO_HN, j, 3, 3));
//				this.oAgrHN_ErgUtt.add(new Utterance(protoUttO_HN, j, 4, 3));
//				this.oAgrHN_AbsUtt.add(new Utterance(protoUttO_HN, j, 5, 3));
//				this.oAgrHN_ErgAbsUtt.add(new Utterance(protoUttO_HN, j, 6, 3));
//				
//				this.oAgrHAIUtt.add(new Utterance(protoUttO_HAI, j, 0, 3));
//				this.oAgrHAI_NomUtt.add(new Utterance(protoUttO_HAI, j, 1, 3));
//				this.oAgrHAI_AccUtt.add(new Utterance(protoUttO_HAI, j, 2, 3));
//				this.oAgrHAI_NomAccUtt.add(new Utterance(protoUttO_HAI, j, 3, 3));
//				this.oAgrHAI_ErgUtt.add(new Utterance(protoUttO_HAI, j, 4, 3));
//				this.oAgrHAI_AbsUtt.add(new Utterance(protoUttO_HAI, j, 5, 3));
//				this.oAgrHAI_ErgAbsUtt.add(new Utterance(protoUttO_HAI, j, 6, 3));
//				
//				this.oAgrMNMUtt.add(new Utterance(protoUttO_MNM, j, 0, 3));
//				this.oAgrMNM_NomUtt.add(new Utterance(protoUttO_MNM, j, 1, 3));
//				this.oAgrMNM_AccUtt.add(new Utterance(protoUttO_MNM, j, 2, 3));
//				this.oAgrMNM_NomAccUtt.add(new Utterance(protoUttO_MNM, j, 3, 3));
//				this.oAgrMNM_ErgUtt.add(new Utterance(protoUttO_MNM, j, 4, 3));
//				this.oAgrMNM_AbsUtt.add(new Utterance(protoUttO_MNM, j, 5, 3));
//				this.oAgrMNM_ErgAbsUtt.add(new Utterance(protoUttO_MNM, j, 6, 3));
//				
//				this.soAgrMFUtt.add(new Utterance(protoUttS_MF, j, 0, 5));
//				this.soAgrMF_NomUtt.add(new Utterance(protoUttS_MF, j, 1, 5));
//				this.soAgrMF_AccUtt.add(new Utterance(protoUttS_MF, j, 2, 5));
//				this.soAgrMF_NomAccUtt.add(new Utterance(protoUttS_MF, j, 3, 5));
//				this.soAgrMF_ErgUtt.add(new Utterance(protoUttS_MF, j, 4, 5));
//				this.soAgrMF_AbsUtt.add(new Utterance(protoUttS_MF, j, 5, 5));
//				this.soAgrMF_ErgAbsUtt.add(new Utterance(protoUttS_MF, j, 6, 5));
//				
//				this.soAgrMFNUtt.add(new Utterance(protoUttS_MFN, j, 0, 5));
//				this.soAgrMFN_NomUtt.add(new Utterance(protoUttS_MFN, j, 1, 5));
//				this.soAgrMFN_AccUtt.add(new Utterance(protoUttS_MFN, j, 2, 5));
//				this.soAgrMFN_NomAccUtt.add(new Utterance(protoUttS_MFN, j, 3, 5));
//				this.soAgrMFN_ErgUtt.add(new Utterance(protoUttS_MFN, j, 4, 5));
//				this.soAgrMFN_AbsUtt.add(new Utterance(protoUttS_MFN, j, 5, 5));
//				this.soAgrMFN_ErgAbsUtt.add(new Utterance(protoUttS_MFN, j, 6, 5));
//				
//				this.soAgrCNUtt.add(new Utterance(protoUttS_CN, j, 0, 5));
//				this.soAgrCN_NomUtt.add(new Utterance(protoUttS_CN, j, 1, 5));
//				this.soAgrCN_AccUtt.add(new Utterance(protoUttS_CN, j, 2, 5));
//				this.soAgrCN_NomAccUtt.add(new Utterance(protoUttS_CN, j, 3, 5));
//				this.soAgrCN_ErgUtt.add(new Utterance(protoUttS_CN, j, 4, 5));
//				this.soAgrCN_AbsUtt.add(new Utterance(protoUttS_CN, j, 5, 5));
//				this.soAgrCN_ErgAbsUtt.add(new Utterance(protoUttS_CN, j, 6, 5));
//				
//				this.soAgrAIUtt.add(new Utterance(protoUttS_AI, j, 0, 5));
//				this.soAgrAI_NomUtt.add(new Utterance(protoUttS_AI, j, 1, 5));
//				this.soAgrAI_AccUtt.add(new Utterance(protoUttS_AI, j, 2, 5));
//				this.soAgrAI_NomAccUtt.add(new Utterance(protoUttS_AI, j, 3, 5));
//				this.soAgrAI_ErgUtt.add(new Utterance(protoUttS_AI, j, 4, 5));
//				this.soAgrAI_AbsUtt.add(new Utterance(protoUttS_AI, j, 5, 5));
//				this.soAgrAI_ErgAbsUtt.add(new Utterance(protoUttS_AI, j, 6, 5));
//				
//				this.soAgrHNUtt.add(new Utterance(protoUttS_HN, j, 0, 5));
//				this.soAgrHN_NomUtt.add(new Utterance(protoUttS_HN, j, 1, 5));
//				this.soAgrHN_AccUtt.add(new Utterance(protoUttS_HN, j, 2, 5));
//				this.soAgrHN_NomAccUtt.add(new Utterance(protoUttS_HN, j, 3, 5));
//				this.soAgrHN_ErgUtt.add(new Utterance(protoUttS_HN, j, 4, 5));
//				this.soAgrHN_AbsUtt.add(new Utterance(protoUttS_HN, j, 5, 5));
//				this.soAgrHN_ErgAbsUtt.add(new Utterance(protoUttS_HN, j, 6, 5));
//				
//				this.soAgrHAIUtt.add(new Utterance(protoUttS_HAI, j, 0, 5));
//				this.soAgrHAI_NomUtt.add(new Utterance(protoUttS_HAI, j, 1, 5));
//				this.soAgrHAI_AccUtt.add(new Utterance(protoUttS_HAI, j, 2, 5));
//				this.soAgrHAI_NomAccUtt.add(new Utterance(protoUttS_HAI, j, 3, 5));
//				this.soAgrHAI_ErgUtt.add(new Utterance(protoUttS_HAI, j, 4, 5));
//				this.soAgrHAI_AbsUtt.add(new Utterance(protoUttS_HAI, j, 5, 5));
//				this.soAgrHAI_ErgAbsUtt.add(new Utterance(protoUttS_HAI, j, 6, 5));
//				
//				this.soAgrMNMUtt.add(new Utterance(protoUttS_MNM, j, 0, 5));
//				this.soAgrMNM_NomUtt.add(new Utterance(protoUttS_MNM, j, 1, 5));
//				this.soAgrMNM_AccUtt.add(new Utterance(protoUttS_MNM, j, 2, 5));
//				this.soAgrMNM_NomAccUtt.add(new Utterance(protoUttS_MNM, j, 3, 5));
//				this.soAgrMNM_ErgUtt.add(new Utterance(protoUttS_MNM, j, 4, 5));
//				this.soAgrMNM_AbsUtt.add(new Utterance(protoUttS_MNM, j, 5, 5));
//				this.soAgrMNM_ErgAbsUtt.add(new Utterance(protoUttS_MNM, j, 6, 5));
//				
//				this.sAgr123_SP_MFUtt.add(new Utterance(protoUttS_123SPMF, j, 0, 13));
//				this.sAgr123_SP_MF_NomUtt.add(new Utterance(protoUttS_123SPMF, j, 1, 13));
//				this.sAgr123_SP_MF_AccUtt.add(new Utterance(protoUttS_123SPMF, j, 2, 13));
//				this.sAgr123_SP_MF_NomAccUtt.add(new Utterance(protoUttS_123SPMF, j, 3, 13));
//				this.sAgr123_SP_MF_ErgUtt.add(new Utterance(protoUttS_123SPMF, j, 4, 13));
//				this.sAgr123_SP_MF_AbsUtt.add(new Utterance(protoUttS_123SPMF, j, 5, 13));
//				this.sAgr123_SP_MF_ErgAbsUtt.add(new Utterance(protoUttS_123SPMF, j, 6, 13));
//				
//				this.oAgr123_SP_MFUtt.add(new Utterance(protoUttO_123SPMF, j, 0, 14));
//				this.oAgr123_SP_MF_NomUtt.add(new Utterance(protoUttO_123SPMF, j, 1, 14));
//				this.oAgr123_SP_MF_AccUtt.add(new Utterance(protoUttO_123SPMF, j, 2, 14));
//				this.oAgr123_SP_MF_NomAccUtt.add(new Utterance(protoUttO_123SPMF, j, 3, 14));
//				this.oAgr123_SP_MF_ErgUtt.add(new Utterance(protoUttO_123SPMF, j, 4, 14));
//				this.oAgr123_SP_MF_AbsUtt.add(new Utterance(protoUttO_123SPMF, j, 5, 14));
//				this.oAgr123_SP_MF_ErgAbsUtt.add(new Utterance(protoUttO_123SPMF, j, 6, 14));
//				
//				this.soAgr123_SP_MFUtt.add(new Utterance(protoUttSO_123SPMF, j, 0, 15));
//				this.soAgr123_SP_MF_NomUtt.add(new Utterance(protoUttSO_123SPMF, j, 1, 15));
//				this.soAgr123_SP_MF_AccUtt.add(new Utterance(protoUttSO_123SPMF, j, 2, 15));
//				this.soAgr123_SP_MF_NomAccUtt.add(new Utterance(protoUttSO_123SPMF, j, 3, 15));
//				this.soAgr123_SP_MF_ErgUtt.add(new Utterance(protoUttSO_123SPMF, j, 4, 15));
//				this.soAgr123_SP_MF_AbsUtt.add(new Utterance(protoUttSO_123SPMF, j, 5, 15));
//				this.soAgr123_SP_MF_ErgAbsUtt.add(new Utterance(protoUttSO_123SPMF, j, 6, 15));
//				
//				this.sAgr123_SP_MFNUtt.add(new Utterance(protoUttS_123SPMFN, j, 0, 13));
//				this.sAgr123_SP_MFN_NomUtt.add(new Utterance(protoUttS_123SPMFN, j, 1, 13));
//				this.sAgr123_SP_MFN_AccUtt.add(new Utterance(protoUttS_123SPMFN, j, 2, 13));
//				this.sAgr123_SP_MFN_NomAccUtt.add(new Utterance(protoUttS_123SPMFN, j, 3, 13));
//				this.sAgr123_SP_MFN_ErgUtt.add(new Utterance(protoUttS_123SPMFN, j, 4, 13));
//				this.sAgr123_SP_MFN_AbsUtt.add(new Utterance(protoUttS_123SPMFN, j, 5, 13));
//				this.sAgr123_SP_MFN_ErgAbsUtt.add(new Utterance(protoUttS_123SPMFN, j, 6, 13));
//				
//				this.oAgr123_SP_MFNUtt.add(new Utterance(protoUttO_123SPMFN, j, 0, 14));
//				this.oAgr123_SP_MFN_NomUtt.add(new Utterance(protoUttO_123SPMFN, j, 1, 14));
//				this.oAgr123_SP_MFN_AccUtt.add(new Utterance(protoUttO_123SPMFN, j, 2, 14));
//				this.oAgr123_SP_MFN_NomAccUtt.add(new Utterance(protoUttO_123SPMFN, j, 3, 14));
//				this.oAgr123_SP_MFN_ErgUtt.add(new Utterance(protoUttO_123SPMFN, j, 4, 14));
//				this.oAgr123_SP_MFN_AbsUtt.add(new Utterance(protoUttO_123SPMFN, j, 5, 14));
//				this.oAgr123_SP_MFN_ErgAbsUtt.add(new Utterance(protoUttO_123SPMFN, j, 6, 14));
//				
//				this.soAgr123_SP_MFNUtt.add(new Utterance(protoUttSO_123SPMFN, j, 0, 15));
//				this.soAgr123_SP_MFN_NomUtt.add(new Utterance(protoUttSO_123SPMFN, j, 1, 15));
//				this.soAgr123_SP_MFN_AccUtt.add(new Utterance(protoUttSO_123SPMFN, j, 2, 15));
//				this.soAgr123_SP_MFN_NomAccUtt.add(new Utterance(protoUttSO_123SPMFN, j, 3, 15));
//				this.soAgr123_SP_MFN_ErgUtt.add(new Utterance(protoUttSO_123SPMFN, j, 4, 15));
//				this.soAgr123_SP_MFN_AbsUtt.add(new Utterance(protoUttSO_123SPMFN, j, 5, 15));
//				this.soAgr123_SP_MFN_ErgAbsUtt.add(new Utterance(protoUttSO_123SPMFN, j, 6, 15));
//				
//				this.sAgr123_SP_CNUtt.add(new Utterance(protoUttS_123SPCN, j, 0, 13));
//				this.sAgr123_SP_CN_NomUtt.add(new Utterance(protoUttS_123SPCN, j, 1, 13));
//				this.sAgr123_SP_CN_AccUtt.add(new Utterance(protoUttS_123SPCN, j, 2, 13));
//				this.sAgr123_SP_CN_NomAccUtt.add(new Utterance(protoUttS_123SPCN, j, 3, 13));
//				this.sAgr123_SP_CN_ErgUtt.add(new Utterance(protoUttS_123SPCN, j, 4, 13));
//				this.sAgr123_SP_CN_AbsUtt.add(new Utterance(protoUttS_123SPCN, j, 5, 13));
//				this.sAgr123_SP_CN_ErgAbsUtt.add(new Utterance(protoUttS_123SPCN, j, 6, 13));
//				
//				this.oAgr123_SP_CNUtt.add(new Utterance(protoUttO_123SPCN, j, 0, 14));
//				this.oAgr123_SP_CN_NomUtt.add(new Utterance(protoUttO_123SPCN, j, 1, 14));
//				this.oAgr123_SP_CN_AccUtt.add(new Utterance(protoUttO_123SPCN, j, 2, 14));
//				this.oAgr123_SP_CN_NomAccUtt.add(new Utterance(protoUttO_123SPCN, j, 3, 14));
//				this.oAgr123_SP_CN_ErgUtt.add(new Utterance(protoUttO_123SPCN, j, 4, 14));
//				this.oAgr123_SP_CN_AbsUtt.add(new Utterance(protoUttO_123SPCN, j, 5, 14));
//				this.oAgr123_SP_CN_ErgAbsUtt.add(new Utterance(protoUttO_123SPCN, j, 6, 14));
//				
//				this.soAgr123_SP_CNUtt.add(new Utterance(protoUttSO_123SPCN, j, 0, 15));
//				this.soAgr123_SP_CN_NomUtt.add(new Utterance(protoUttSO_123SPCN, j, 1, 15));
//				this.soAgr123_SP_CN_AccUtt.add(new Utterance(protoUttSO_123SPCN, j, 2, 15));
//				this.soAgr123_SP_CN_NomAccUtt.add(new Utterance(protoUttSO_123SPCN, j, 3, 15));
//				this.soAgr123_SP_CN_ErgUtt.add(new Utterance(protoUttSO_123SPCN, j, 4, 15));
//				this.soAgr123_SP_CN_AbsUtt.add(new Utterance(protoUttSO_123SPCN, j, 5, 15));
//				this.soAgr123_SP_CN_ErgAbsUtt.add(new Utterance(protoUttSO_123SPCN, j, 6, 15));
//				
//				this.sAgr123_SP_AIUtt.add(new Utterance(protoUttS_123SPAI, j, 0, 13));
//				this.sAgr123_SP_AI_NomUtt.add(new Utterance(protoUttS_123SPAI, j, 1, 13));
//				this.sAgr123_SP_AI_AccUtt.add(new Utterance(protoUttS_123SPAI, j, 2, 13));
//				this.sAgr123_SP_AI_NomAccUtt.add(new Utterance(protoUttS_123SPAI, j, 3, 13));
//				this.sAgr123_SP_AI_ErgUtt.add(new Utterance(protoUttS_123SPAI, j, 4, 13));
//				this.sAgr123_SP_AI_AbsUtt.add(new Utterance(protoUttS_123SPAI, j, 5, 13));
//				this.sAgr123_SP_AI_ErgAbsUtt.add(new Utterance(protoUttS_123SPAI, j, 6, 13));
//				
//				this.oAgr123_SP_AIUtt.add(new Utterance(protoUttO_123SPAI, j, 0, 14));
//				this.oAgr123_SP_AI_NomUtt.add(new Utterance(protoUttO_123SPAI, j, 1, 14));
//				this.oAgr123_SP_AI_AccUtt.add(new Utterance(protoUttO_123SPAI, j, 2, 14));
//				this.oAgr123_SP_AI_NomAccUtt.add(new Utterance(protoUttO_123SPAI, j, 3, 14));
//				this.oAgr123_SP_AI_ErgUtt.add(new Utterance(protoUttO_123SPAI, j, 4, 14));
//				this.oAgr123_SP_AI_AbsUtt.add(new Utterance(protoUttO_123SPAI, j, 5, 14));
//				this.oAgr123_SP_AI_ErgAbsUtt.add(new Utterance(protoUttO_123SPAI, j, 6, 14));
//				
//				this.soAgr123_SP_AIUtt.add(new Utterance(protoUttSO_123SPAI, j, 0, 15));
//				this.soAgr123_SP_AI_NomUtt.add(new Utterance(protoUttSO_123SPAI, j, 1, 15));
//				this.soAgr123_SP_AI_AccUtt.add(new Utterance(protoUttSO_123SPAI, j, 2, 15));
//				this.soAgr123_SP_AI_NomAccUtt.add(new Utterance(protoUttSO_123SPAI, j, 3, 15));
//				this.soAgr123_SP_AI_ErgUtt.add(new Utterance(protoUttSO_123SPAI, j, 4, 15));
//				this.soAgr123_SP_AI_AbsUtt.add(new Utterance(protoUttSO_123SPAI, j, 5, 15));
//				this.soAgr123_SP_AI_ErgAbsUtt.add(new Utterance(protoUttSO_123SPAI, j, 6, 15));
//				
//				this.sAgr123_SP_HNUtt.add(new Utterance(protoUttS_123SPHN, j, 0, 13));
//				this.sAgr123_SP_HN_NomUtt.add(new Utterance(protoUttS_123SPHN, j, 1, 13));
//				this.sAgr123_SP_HN_AccUtt.add(new Utterance(protoUttS_123SPHN, j, 2, 13));
//				this.sAgr123_SP_HN_NomAccUtt.add(new Utterance(protoUttS_123SPHN, j, 3, 13));
//				this.sAgr123_SP_HN_ErgUtt.add(new Utterance(protoUttS_123SPHN, j, 4, 13));
//				this.sAgr123_SP_HN_AbsUtt.add(new Utterance(protoUttS_123SPHN, j, 5, 13));
//				this.sAgr123_SP_HN_ErgAbsUtt.add(new Utterance(protoUttS_123SPHN, j, 6, 13));
//				
//				this.oAgr123_SP_HNUtt.add(new Utterance(protoUttO_123SPHN, j, 0, 14));
//				this.oAgr123_SP_HN_NomUtt.add(new Utterance(protoUttO_123SPHN, j, 1, 14));
//				this.oAgr123_SP_HN_AccUtt.add(new Utterance(protoUttO_123SPHN, j, 2, 14));
//				this.oAgr123_SP_HN_NomAccUtt.add(new Utterance(protoUttO_123SPHN, j, 3, 14));
//				this.oAgr123_SP_HN_ErgUtt.add(new Utterance(protoUttO_123SPHN, j, 4, 14));
//				this.oAgr123_SP_HN_AbsUtt.add(new Utterance(protoUttO_123SPHN, j, 5, 14));
//				this.oAgr123_SP_HN_ErgAbsUtt.add(new Utterance(protoUttO_123SPHN, j, 6, 14));
//				
//				this.soAgr123_SP_HNUtt.add(new Utterance(protoUttSO_123SPHN, j, 0, 15));
//				this.soAgr123_SP_HN_NomUtt.add(new Utterance(protoUttSO_123SPHN, j, 1, 15));
//				this.soAgr123_SP_HN_AccUtt.add(new Utterance(protoUttSO_123SPHN, j, 2, 15));
//				this.soAgr123_SP_HN_NomAccUtt.add(new Utterance(protoUttSO_123SPHN, j, 3, 15));
//				this.soAgr123_SP_HN_ErgUtt.add(new Utterance(protoUttSO_123SPHN, j, 4, 15));
//				this.soAgr123_SP_HN_AbsUtt.add(new Utterance(protoUttSO_123SPHN, j, 5, 15));
//				this.soAgr123_SP_HN_ErgAbsUtt.add(new Utterance(protoUttSO_123SPHN, j, 6, 15));
//				
//				this.sAgr123_SP_HAIUtt.add(new Utterance(protoUttS_123SPHAI, j, 0, 13));
//				this.sAgr123_SP_HAI_NomUtt.add(new Utterance(protoUttS_123SPHAI, j, 1, 13));
//				this.sAgr123_SP_HAI_AccUtt.add(new Utterance(protoUttS_123SPHAI, j, 2, 13));
//				this.sAgr123_SP_HAI_NomAccUtt.add(new Utterance(protoUttS_123SPHAI, j, 3, 13));
//				this.sAgr123_SP_HAI_ErgUtt.add(new Utterance(protoUttS_123SPHAI, j, 4, 13));
//				this.sAgr123_SP_HAI_AbsUtt.add(new Utterance(protoUttS_123SPHAI, j, 5, 13));
//				this.sAgr123_SP_HAI_ErgAbsUtt.add(new Utterance(protoUttS_123SPHAI, j, 6, 13));
//				
//				this.oAgr123_SP_HAIUtt.add(new Utterance(protoUttO_123SPHAI, j, 0, 14));
//				this.oAgr123_SP_HAI_NomUtt.add(new Utterance(protoUttO_123SPHAI, j, 1, 14));
//				this.oAgr123_SP_HAI_AccUtt.add(new Utterance(protoUttO_123SPHAI, j, 2, 14));
//				this.oAgr123_SP_HAI_NomAccUtt.add(new Utterance(protoUttO_123SPHAI, j, 3, 14));
//				this.oAgr123_SP_HAI_ErgUtt.add(new Utterance(protoUttO_123SPHAI, j, 4, 14));
//				this.oAgr123_SP_HAI_AbsUtt.add(new Utterance(protoUttO_123SPHAI, j, 5, 14));
//				this.oAgr123_SP_HAI_ErgAbsUtt.add(new Utterance(protoUttO_123SPHAI, j, 6, 14));
//				
//				this.soAgr123_SP_HAIUtt.add(new Utterance(protoUttSO_123SPHAI, j, 0, 15));
//				this.soAgr123_SP_HAI_NomUtt.add(new Utterance(protoUttSO_123SPHAI, j, 1, 15));
//				this.soAgr123_SP_HAI_AccUtt.add(new Utterance(protoUttSO_123SPHAI, j, 2, 15));
//				this.soAgr123_SP_HAI_NomAccUtt.add(new Utterance(protoUttSO_123SPHAI, j, 3, 15));
//				this.soAgr123_SP_HAI_ErgUtt.add(new Utterance(protoUttSO_123SPHAI, j, 4, 15));
//				this.soAgr123_SP_HAI_AbsUtt.add(new Utterance(protoUttSO_123SPHAI, j, 5, 15));
//				this.soAgr123_SP_HAI_ErgAbsUtt.add(new Utterance(protoUttSO_123SPHAI, j, 6, 15));
//				
//				this.sAgr123_SP_MNMUtt.add(new Utterance(protoUttS_123SPMNM, j, 0, 13));
//				this.sAgr123_SP_MNM_NomUtt.add(new Utterance(protoUttS_123SPMNM, j, 1, 13));
//				this.sAgr123_SP_MNM_AccUtt.add(new Utterance(protoUttS_123SPMNM, j, 2, 13));
//				this.sAgr123_SP_MNM_NomAccUtt.add(new Utterance(protoUttS_123SPMNM, j, 3, 13));
//				this.sAgr123_SP_MNM_ErgUtt.add(new Utterance(protoUttS_123SPMNM, j, 4, 13));
//				this.sAgr123_SP_MNM_AbsUtt.add(new Utterance(protoUttS_123SPMNM, j, 5, 13));
//				this.sAgr123_SP_MNM_ErgAbsUtt.add(new Utterance(protoUttS_123SPMNM, j, 6, 13));
//				
//				this.oAgr123_SP_MNMUtt.add(new Utterance(protoUttO_123SPMNM, j, 0, 14));
//				this.oAgr123_SP_MNM_NomUtt.add(new Utterance(protoUttO_123SPMNM, j, 1, 14));
//				this.oAgr123_SP_MNM_AccUtt.add(new Utterance(protoUttO_123SPMNM, j, 2, 14));
//				this.oAgr123_SP_MNM_NomAccUtt.add(new Utterance(protoUttO_123SPMNM, j, 3, 14));
//				this.oAgr123_SP_MNM_ErgUtt.add(new Utterance(protoUttO_123SPMNM, j, 4, 14));
//				this.oAgr123_SP_MNM_AbsUtt.add(new Utterance(protoUttO_123SPMNM, j, 5, 14));
//				this.oAgr123_SP_MNM_ErgAbsUtt.add(new Utterance(protoUttO_123SPMNM, j, 6, 14));
//				
//				this.soAgr123_SP_MNMUtt.add(new Utterance(protoUttSO_123SPMNM, j, 0, 15));
//				this.soAgr123_SP_MNM_NomUtt.add(new Utterance(protoUttSO_123SPMNM, j, 1, 15));
//				this.soAgr123_SP_MNM_AccUtt.add(new Utterance(protoUttSO_123SPMNM, j, 2, 15));
//				this.soAgr123_SP_MNM_NomAccUtt.add(new Utterance(protoUttSO_123SPMNM, j, 3, 15));
//				this.soAgr123_SP_MNM_ErgUtt.add(new Utterance(protoUttSO_123SPMNM, j, 4, 15));
//				this.soAgr123_SP_MNM_AbsUtt.add(new Utterance(protoUttSO_123SPMNM, j, 5, 15));
//				this.soAgr123_SP_MNM_ErgAbsUtt.add(new Utterance(protoUttSO_123SPMNM, j, 6, 15));
			}
			for(int j = 0; j < 6; j++) {
				HashMap<String, Word> first = new HashMap<>();
				first.put("caseless", this.utt.get((i*6)+j).firstWord);
//				first.put("nom", this.nomUtt.get((i*6)+j).firstWord);
//				first.put("acc", this.accUtt.get((i*6)+j).firstWord);
//				first.put("nomacc", this.nomAccUtt.get((i*6)+j).firstWord);
//				first.put("erg", this.ergUtt.get((i*6)+j).firstWord);
//				first.put("abs", this.absUtt.get((i*6)+j).firstWord);
//				first.put("ergabs", this.ergAbsUtt.get((i*6)+j).firstWord);
//				
//				first.put("s-123", this.sAgr123Utt.get((i*6)+j).firstWord);
//	//			first.put("s-we", this.sAgrWeUtt.get((i*6)+j).firstWord);
//				
//				first.put("o-123", this.oAgr123Utt.get((i*6)+j).firstWord);
//	//			first.put("o-we", this.oAgrWeUtt.get((i*6)+j).firstWord);
//				
//				first.put("so-123", this.soAgr123Utt.get((i*6)+j).firstWord);
//	//			first.put("s-we", this.soAgrWeUtt.get((i*6)+j).firstWord);
//				
//				first.put("s-sp", this.sAgrSPUtt.get((i*6)+j).firstWord);
//				first.put("o-sp", this.oAgrSPUtt.get((i*6)+j).firstWord);
//				first.put("so-sp", this.soAgrSPUtt.get((i*6)+j).firstWord);
//				
//				first.put("s-123+sp", this.sAgr123_SPUtt.get((i*6)+j).firstWord);
//				first.put("s-123+sp+nom", this.sAgr123_SP_NomUtt.get(j).firstWord);
//				first.put("s-123+sp+acc", this.sAgr123_SP_AccUtt.get(j).firstWord);
//				first.put("s-123+sp+nomacc", this.sAgr123_SP_NomAccUtt.get(j).firstWord);
//				first.put("s-123+sp+erg", this.sAgr123_SP_ErgUtt.get(j).firstWord);
//				first.put("s-123+sp+abs", this.sAgr123_SP_AbsUtt.get(j).firstWord);
//				first.put("s-123+sp+ergabs", this.sAgr123_SP_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("o-123+sp", this.oAgr123_SPUtt.get(j).firstWord);
//				first.put("o-123+sp+nom", this.oAgr123_SP_NomUtt.get(j).firstWord);
//				first.put("o-123+sp+acc", this.oAgr123_SP_AccUtt.get(j).firstWord);
//				first.put("o-123+sp+nomacc", this.oAgr123_SP_NomAccUtt.get(j).firstWord);
//				first.put("o-123+sp+erg", this.oAgr123_SP_ErgUtt.get(j).firstWord);
//				first.put("o-123+sp+abs", this.oAgr123_SP_AbsUtt.get(j).firstWord);
//				first.put("o-123+sp+ergabs", this.oAgr123_SP_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("so-123+sp", this.soAgr123_SPUtt.get(j).firstWord);
//				first.put("so-123+sp+nom", this.soAgr123_SP_NomUtt.get(j).firstWord);
//				first.put("so-123+sp+acc", this.soAgr123_SP_AccUtt.get(j).firstWord);
//				first.put("so-123+sp+nomacc", this.soAgr123_SP_NomAccUtt.get(j).firstWord);
//				first.put("so-123+sp+erg", this.soAgr123_SP_ErgUtt.get(j).firstWord);
//				first.put("so-123+sp+abs", this.soAgr123_SP_AbsUtt.get(j).firstWord);
//				first.put("so-123+sp+ergabs", this.soAgr123_SP_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("s-mf", this.sAgrMFUtt.get(j).firstWord);
//				first.put("s-mf+nom", this.sAgrMF_NomUtt.get(j).firstWord);
//				first.put("s-mf+acc", this.sAgrMF_AccUtt.get(j).firstWord);
//				first.put("s-mf+nomacc", this.sAgrMF_NomAccUtt.get(j).firstWord);
//				first.put("s-mf+erg", this.sAgrMF_ErgUtt.get(j).firstWord);
//				first.put("s-mf+abs", this.sAgrMF_AbsUtt.get(j).firstWord);
//				first.put("s-mf+ergabs", this.sAgrMF_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("s-mfn", this.sAgrMFNUtt.get(j).firstWord);
//				first.put("s-mfn+nom", this.sAgrMFN_NomUtt.get(j).firstWord);
//				first.put("s-mfn+acc", this.sAgrMFN_AccUtt.get(j).firstWord);
//				first.put("s-mfn+nomacc", this.sAgrMFN_NomAccUtt.get(j).firstWord);
//				first.put("s-mfn+erg", this.sAgrMFN_ErgUtt.get(j).firstWord);
//				first.put("s-mfn+abs", this.sAgrMFN_AbsUtt.get(j).firstWord);
//				first.put("s-mfn+ergabs", this.sAgrMFN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("s-cn", this.sAgrCNUtt.get(j).firstWord);
//				first.put("s-cn+nom", this.sAgrCN_NomUtt.get(j).firstWord);
//				first.put("s-cn+acc", this.sAgrCN_AccUtt.get(j).firstWord);
//				first.put("s-cn+nomacc", this.sAgrCN_NomAccUtt.get(j).firstWord);
//				first.put("s-cn+erg", this.sAgrCN_ErgUtt.get(j).firstWord);
//				first.put("s-cn+abs", this.sAgrCN_AbsUtt.get(j).firstWord);
//				first.put("s-cn+ergabs", this.sAgrCN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("s-ai", this.sAgrAIUtt.get(j).firstWord);
//				first.put("s-ai+nom", this.sAgrAI_NomUtt.get(j).firstWord);
//				first.put("s-ai+acc", this.sAgrAI_AccUtt.get(j).firstWord);
//				first.put("s-ai+nomacc", this.sAgrAI_NomAccUtt.get(j).firstWord);
//				first.put("s-ai+erg", this.sAgrAI_ErgUtt.get(j).firstWord);
//				first.put("s-ai+abs", this.sAgrAI_AbsUtt.get(j).firstWord);
//				first.put("s-ai+ergabs", this.sAgrAI_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("s-hn", this.sAgrHNUtt.get(j).firstWord);
//				first.put("s-hn+nom", this.sAgrHN_NomUtt.get(j).firstWord);
//				first.put("s-hn+acc", this.sAgrHN_AccUtt.get(j).firstWord);
//				first.put("s-hn+nomacc", this.sAgrHN_NomAccUtt.get(j).firstWord);
//				first.put("s-hn+erg", this.sAgrHN_ErgUtt.get(j).firstWord);
//				first.put("s-hn+abs", this.sAgrHN_AbsUtt.get(j).firstWord);
//				first.put("s-hn+ergabs", this.sAgrHN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("s-hai", this.sAgrHAIUtt.get(j).firstWord);
//				first.put("s-hai+nom", this.sAgrHAI_NomUtt.get(j).firstWord);
//				first.put("s-hai+acc", this.sAgrHAI_AccUtt.get(j).firstWord);
//				first.put("s-hai+nomacc", this.sAgrHAI_NomAccUtt.get(j).firstWord);
//				first.put("s-hai+erg", this.sAgrHAI_ErgUtt.get(j).firstWord);
//				first.put("s-hai+abs", this.sAgrHAI_AbsUtt.get(j).firstWord);
//				first.put("s-hai+ergabs", this.sAgrHAI_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("s-mnm", this.sAgrMNMUtt.get(j).firstWord);
//				first.put("s-mnm+nom", this.sAgrMNM_NomUtt.get(j).firstWord);
//				first.put("s-mnm+acc", this.sAgrMNM_AccUtt.get(j).firstWord);
//				first.put("s-mnm+nomacc", this.sAgrMNM_NomAccUtt.get(j).firstWord);
//				first.put("s-mnm+erg", this.sAgrMNM_ErgUtt.get(j).firstWord);
//				first.put("s-mnm+abs", this.sAgrMNM_AbsUtt.get(j).firstWord);
//				first.put("s-mnm+ergabs", this.sAgrMNM_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("o-mf", oAgrMFUtt.get(j).firstWord);
//				first.put("o-mf+nom", oAgrMF_NomUtt.get(j).firstWord);
//				first.put("o-mf+acc", oAgrMF_AccUtt.get(j).firstWord);
//				first.put("o-mf+nomacc", oAgrMF_NomAccUtt.get(j).firstWord);
//				first.put("o-mf+erg", oAgrMF_ErgUtt.get(j).firstWord);
//				first.put("o-mf+abs", oAgrMF_AbsUtt.get(j).firstWord);
//				first.put("o-mf+ergabs", oAgrMF_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("o-mfn", oAgrMFNUtt.get(j).firstWord);
//				first.put("o-mfn+nom", oAgrMFN_NomUtt.get(j).firstWord);
//				first.put("o-mfn+acc", oAgrMFN_AccUtt.get(j).firstWord);
//				first.put("o-mfn+nomacc", oAgrMFN_NomAccUtt.get(j).firstWord);
//				first.put("o-mfn+erg", oAgrMFN_ErgUtt.get(j).firstWord);
//				first.put("o-mfn+abs", oAgrMFN_AbsUtt.get(j).firstWord);
//				first.put("o-mfn+ergabs", oAgrMFN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("o-cn", oAgrCNUtt.get(j).firstWord);
//				first.put("o-cn+nom", oAgrCN_NomUtt.get(j).firstWord);
//				first.put("o-cn+acc", oAgrCN_AccUtt.get(j).firstWord);
//				first.put("o-cn+nomacc", oAgrCN_NomAccUtt.get(j).firstWord);
//				first.put("o-cn+erg", oAgrCN_ErgUtt.get(j).firstWord);
//				first.put("o-cn+abs", oAgrCN_AbsUtt.get(j).firstWord);
//				first.put("o-cn+ergabs", oAgrCN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("o-ai", oAgrAIUtt.get(j).firstWord);
//				first.put("o-ai+nom", oAgrAI_NomUtt.get(j).firstWord);
//				first.put("o-ai+acc", oAgrAI_AccUtt.get(j).firstWord);
//				first.put("o-ai+nomacc", oAgrAI_NomAccUtt.get(j).firstWord);
//				first.put("o-ai+erg", oAgrAI_ErgUtt.get(j).firstWord);
//				first.put("o-ai+abs", oAgrAI_AbsUtt.get(j).firstWord);
//				first.put("o-ai+ergabs", oAgrAI_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("o-hn", oAgrHNUtt.get(j).firstWord);
//				first.put("o-hn+nom", oAgrHN_NomUtt.get(j).firstWord);
//				first.put("o-hn+acc", oAgrHN_AccUtt.get(j).firstWord);
//				first.put("o-hn+nomacc", oAgrHN_NomAccUtt.get(j).firstWord);
//				first.put("o-hn+erg", oAgrHN_ErgUtt.get(j).firstWord);
//				first.put("o-hn+abs", oAgrHN_AbsUtt.get(j).firstWord);
//				first.put("o-hn+ergabs", oAgrHN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("o-hai", oAgrHAIUtt.get(j).firstWord);
//				first.put("o-hai+nom", oAgrHAI_NomUtt.get(j).firstWord);
//				first.put("o-hai+acc", oAgrHAI_AccUtt.get(j).firstWord);
//				first.put("o-hai+nomacc", oAgrHAI_NomAccUtt.get(j).firstWord);
//				first.put("o-hai+erg", oAgrHAI_ErgUtt.get(j).firstWord);
//				first.put("o-hai+abs", oAgrHAI_AbsUtt.get(j).firstWord);
//				first.put("o-hai+ergabs", oAgrHAI_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("o-mnm", oAgrMNMUtt.get(j).firstWord);
//				first.put("o-mnm+nom", oAgrMNM_NomUtt.get(j).firstWord);
//				first.put("o-mnm+acc", oAgrMNM_AccUtt.get(j).firstWord);
//				first.put("o-mnm+nomacc", oAgrMNM_NomAccUtt.get(j).firstWord);
//				first.put("o-mnm+erg", oAgrMNM_ErgUtt.get(j).firstWord);
//				first.put("o-mnm+abs", oAgrMNM_AbsUtt.get(j).firstWord);
//				first.put("o-mnm+ergabs", oAgrMNM_ErgAbsUtt.get(j).firstWord);
//								
//				first.put("so-mf", soAgrMFUtt.get(j).firstWord);
//				first.put("so-mf+nom", soAgrMF_NomUtt.get(j).firstWord);
//				first.put("so-mf+acc", soAgrMF_AccUtt.get(j).firstWord);
//				first.put("so-mf+nomacc", soAgrMF_NomAccUtt.get(j).firstWord);
//				first.put("so-mf+erg", soAgrMF_ErgUtt.get(j).firstWord);
//				first.put("so-mf+abs", soAgrMF_AbsUtt.get(j).firstWord);
//				first.put("so-mf+ergabs", soAgrMF_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("so-mfn", soAgrMFNUtt.get(j).firstWord);
//				first.put("so-mfn+nom", soAgrMFN_NomUtt.get(j).firstWord);
//				first.put("so-mfn+acc", soAgrMFN_AccUtt.get(j).firstWord);
//				first.put("so-mfn+nomacc", soAgrMFN_NomAccUtt.get(j).firstWord);
//				first.put("so-mfn+erg", soAgrMFN_ErgUtt.get(j).firstWord);
//				first.put("so-mfn+abs", soAgrMFN_AbsUtt.get(j).firstWord);
//				first.put("so-mfn+ergabs", soAgrMFN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("so-cn", soAgrCNUtt.get(j).firstWord);
//				first.put("so-cn+nom", soAgrCN_NomUtt.get(j).firstWord);
//				first.put("so-cn+acc", soAgrCN_AccUtt.get(j).firstWord);
//				first.put("so-cn+nomacc", soAgrCN_NomAccUtt.get(j).firstWord);
//				first.put("so-cn+erg", soAgrCN_ErgUtt.get(j).firstWord);
//				first.put("so-cn+abs", soAgrCN_AbsUtt.get(j).firstWord);
//				first.put("so-cn+ergabs", soAgrCN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("so-ai", soAgrAIUtt.get(j).firstWord);
//				first.put("so-ai+nom", soAgrAI_NomUtt.get(j).firstWord);
//				first.put("so-ai+acc", soAgrAI_AccUtt.get(j).firstWord);
//				first.put("so-ai+nomacc", soAgrAI_NomAccUtt.get(j).firstWord);
//				first.put("so-ai+erg", soAgrAI_ErgUtt.get(j).firstWord);
//				first.put("so-ai+abs", soAgrAI_AbsUtt.get(j).firstWord);
//				first.put("so-ai+ergabs", soAgrAI_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("so-hn", soAgrHNUtt.get(j).firstWord);
//				first.put("so-hn+nom", soAgrHN_NomUtt.get(j).firstWord);
//				first.put("so-hn+acc", soAgrHN_AccUtt.get(j).firstWord);
//				first.put("so-hn+nomacc", soAgrHN_NomAccUtt.get(j).firstWord);
//				first.put("so-hn+erg", soAgrHN_ErgUtt.get(j).firstWord);
//				first.put("so-hn+abs", soAgrHN_AbsUtt.get(j).firstWord);
//				first.put("so-hn+ergabs", soAgrHN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("so-hai", soAgrHAIUtt.get(j).firstWord);
//				first.put("so-hai+nom", soAgrHAI_NomUtt.get(j).firstWord);
//				first.put("so-hai+acc", soAgrHAI_AccUtt.get(j).firstWord);
//				first.put("so-hai+nomacc", soAgrHAI_NomAccUtt.get(j).firstWord);
//				first.put("so-hai+erg", soAgrHAI_ErgUtt.get(j).firstWord);
//				first.put("so-hai+abs", soAgrHAI_AbsUtt.get(j).firstWord);
//				first.put("so-hai+ergabs", soAgrHAI_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("so-mnm", soAgrMNMUtt.get(j).firstWord);
//				first.put("so-mnm+nom", soAgrMNM_NomUtt.get(j).firstWord);
//				first.put("so-mnm+acc", soAgrMNM_AccUtt.get(j).firstWord);
//				first.put("so-mnm+nomacc", soAgrMNM_NomAccUtt.get(j).firstWord);
//				first.put("so-mnm+erg", soAgrMNM_ErgUtt.get(j).firstWord);
//				first.put("so-mnm+abs", soAgrMNM_AbsUtt.get(j).firstWord);
//				first.put("so-mnm+ergabs", soAgrMNM_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("s-123+sp+mf", sAgr123_SP_MFUtt.get(j).firstWord);
//				first.put("s-123+sp+mf+nom", sAgr123_SP_MF_NomUtt.get(j).firstWord);
//				first.put("s-123+sp+mf+acc", sAgr123_SP_MF_AccUtt.get(j).firstWord);
//				first.put("s-123+sp+mf+nomacc", sAgr123_SP_MF_NomAccUtt.get(j).firstWord);
//				first.put("s-123+sp+mf+erg", sAgr123_SP_MF_ErgUtt.get(j).firstWord);
//				first.put("s-123+sp+mf+abs", sAgr123_SP_MF_AbsUtt.get(j).firstWord);
//				first.put("s-123+sp+mf+ergabs", sAgr123_SP_MF_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("s-123+sp+mfn", sAgr123_SP_MFNUtt.get(j).firstWord);
//				first.put("s-123+sp+mfn+nom", sAgr123_SP_MFN_NomUtt.get(j).firstWord);
//				first.put("s-123+sp+mfn+acc", sAgr123_SP_MFN_AccUtt.get(j).firstWord);
//				first.put("s-123+sp+mfn+nomacc", sAgr123_SP_MFN_NomAccUtt.get(j).firstWord);
//				first.put("s-123+sp+mfn+erg", sAgr123_SP_MFN_ErgUtt.get(j).firstWord);
//				first.put("s-123+sp+mfn+abs", sAgr123_SP_MFN_AbsUtt.get(j).firstWord);
//				first.put("s-123+sp+mfn+ergabs", sAgr123_SP_MFN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("s-123+sp+cn", sAgr123_SP_CNUtt.get(j).firstWord);
//				first.put("s-123+sp+cn+nom", sAgr123_SP_CN_NomUtt.get(j).firstWord);
//				first.put("s-123+sp+cn+acc", sAgr123_SP_CN_AccUtt.get(j).firstWord);
//				first.put("s-123+sp+cn+nomacc", sAgr123_SP_CN_NomAccUtt.get(j).firstWord);
//				first.put("s-123+sp+cn+erg", sAgr123_SP_CN_ErgUtt.get(j).firstWord);
//				first.put("s-123+sp+cn+abs", sAgr123_SP_CN_AbsUtt.get(j).firstWord);
//				first.put("s-123+sp+cn+ergabs", sAgr123_SP_CN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("s-123+sp+ai", sAgr123_SP_AIUtt.get(j).firstWord);
//				first.put("s-123+sp+ai+nom", sAgr123_SP_AI_NomUtt.get(j).firstWord);
//				first.put("s-123+sp+ai+acc", sAgr123_SP_AI_AccUtt.get(j).firstWord);
//				first.put("s-123+sp+ai+nomacc", sAgr123_SP_AI_NomAccUtt.get(j).firstWord);
//				first.put("s-123+sp+ai+erg", sAgr123_SP_AI_ErgUtt.get(j).firstWord);
//				first.put("s-123+sp+ai+abs", sAgr123_SP_AI_AbsUtt.get(j).firstWord);
//				first.put("s-123+sp+ai+ergabs", sAgr123_SP_AI_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("s-123+sp+hn", sAgr123_SP_HNUtt.get(j).firstWord);
//				first.put("s-123+sp+hn+nom", sAgr123_SP_HN_NomUtt.get(j).firstWord);
//				first.put("s-123+sp+hn+acc", sAgr123_SP_HN_AccUtt.get(j).firstWord);
//				first.put("s-123+sp+hn+nomacc", sAgr123_SP_HN_NomAccUtt.get(j).firstWord);
//				first.put("s-123+sp+hn+erg", sAgr123_SP_HN_ErgUtt.get(j).firstWord);
//				first.put("s-123+sp+hn+abs", sAgr123_SP_HN_AbsUtt.get(j).firstWord);
//				first.put("s-123+sp+hn+ergabs", sAgr123_SP_HN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("s-123+sp+hai", sAgr123_SP_HAIUtt.get(j).firstWord);
//				first.put("s-123+sp+hai+nom", sAgr123_SP_HAI_NomUtt.get(j).firstWord);
//				first.put("s-123+sp+hai+acc", sAgr123_SP_HAI_AccUtt.get(j).firstWord);
//				first.put("s-123+sp+hai+nomacc", sAgr123_SP_HAI_NomAccUtt.get(j).firstWord);
//				first.put("s-123+sp+hai+erg", sAgr123_SP_HAI_ErgUtt.get(j).firstWord);
//				first.put("s-123+sp+hai+abs", sAgr123_SP_HAI_AbsUtt.get(j).firstWord);
//				first.put("s-123+sp+hai+ergabs", sAgr123_SP_HAI_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("s-123+sp+mnm", sAgr123_SP_MNMUtt.get(j).firstWord);
//				first.put("s-123+sp+mnm+nom", sAgr123_SP_MNM_NomUtt.get(j).firstWord);
//				first.put("s-123+sp+mnm+acc", sAgr123_SP_MNM_AccUtt.get(j).firstWord);
//				first.put("s-123+sp+mnm+nomacc", sAgr123_SP_MNM_NomAccUtt.get(j).firstWord);
//				first.put("s-123+sp+mnm+erg", sAgr123_SP_MNM_ErgUtt.get(j).firstWord);
//				first.put("s-123+sp+mnm+abs", sAgr123_SP_MNM_AbsUtt.get(j).firstWord);
//				first.put("s-123+sp+mnm+ergabs", sAgr123_SP_MNM_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("o-123+sp+mf", oAgr123_SP_MFUtt.get(j).firstWord);
//				first.put("o-123+sp+mf+nom", oAgr123_SP_MF_NomUtt.get(j).firstWord);
//				first.put("o-123+sp+mf+acc", oAgr123_SP_MF_AccUtt.get(j).firstWord);
//				first.put("o-123+sp+mf+nomacc", oAgr123_SP_MF_NomAccUtt.get(j).firstWord);
//				first.put("o-123+sp+mf+erg", oAgr123_SP_MF_ErgUtt.get(j).firstWord);
//				first.put("o-123+sp+mf+abs", oAgr123_SP_MF_AbsUtt.get(j).firstWord);
//				first.put("o-123+sp+mf+ergabs", oAgr123_SP_MF_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("o-123+sp+mfn", oAgr123_SP_MFNUtt.get(j).firstWord);
//				first.put("o-123+sp+mfn+nom", oAgr123_SP_MFN_NomUtt.get(j).firstWord);
//				first.put("o-123+sp+mfn+acc", oAgr123_SP_MFN_AccUtt.get(j).firstWord);
//				first.put("o-123+sp+mfn+nomacc", oAgr123_SP_MFN_NomAccUtt.get(j).firstWord);
//				first.put("o-123+sp+mfn+erg", oAgr123_SP_MFN_ErgUtt.get(j).firstWord);
//				first.put("o-123+sp+mfn+abs", oAgr123_SP_MFN_AbsUtt.get(j).firstWord);
//				first.put("o-123+sp+mfn+ergabs", oAgr123_SP_MFN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("o-123+sp+cn", oAgr123_SP_CNUtt.get(j).firstWord);
//				first.put("o-123+sp+cn+nom", oAgr123_SP_CN_NomUtt.get(j).firstWord);
//				first.put("o-123+sp+cn+acc", oAgr123_SP_CN_AccUtt.get(j).firstWord);
//				first.put("o-123+sp+cn+nomacc", oAgr123_SP_CN_NomAccUtt.get(j).firstWord);
//				first.put("o-123+sp+cn+erg", oAgr123_SP_CN_ErgUtt.get(j).firstWord);
//				first.put("o-123+sp+cn+abs", oAgr123_SP_CN_AbsUtt.get(j).firstWord);
//				first.put("o-123+sp+cn+ergabs", oAgr123_SP_CN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("o-123+sp+ai", oAgr123_SP_AIUtt.get(j).firstWord);
//				first.put("o-123+sp+ai+nom", oAgr123_SP_AI_NomUtt.get(j).firstWord);
//				first.put("o-123+sp+ai+acc", oAgr123_SP_AI_AccUtt.get(j).firstWord);
//				first.put("o-123+sp+ai+nomacc", oAgr123_SP_AI_NomAccUtt.get(j).firstWord);
//				first.put("o-123+sp+ai+erg", oAgr123_SP_AI_ErgUtt.get(j).firstWord);
//				first.put("o-123+sp+ai+abs", oAgr123_SP_AI_AbsUtt.get(j).firstWord);
//				first.put("o-123+sp+ai+ergabs", oAgr123_SP_AI_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("o-123+sp+hn", oAgr123_SP_HNUtt.get(j).firstWord);
//				first.put("o-123+sp+hn+nom", oAgr123_SP_HN_NomUtt.get(j).firstWord);
//				first.put("o-123+sp+hn+acc", oAgr123_SP_HN_AccUtt.get(j).firstWord);
//				first.put("o-123+sp+hn+nomacc", oAgr123_SP_HN_NomAccUtt.get(j).firstWord);
//				first.put("o-123+sp+hn+erg", oAgr123_SP_HN_ErgUtt.get(j).firstWord);
//				first.put("o-123+sp+hn+abs", oAgr123_SP_HN_AbsUtt.get(j).firstWord);
//				first.put("o-123+sp+hn+ergabs", oAgr123_SP_HN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("o-123+sp+hai", oAgr123_SP_HAIUtt.get(j).firstWord);
//				first.put("o-123+sp+hai+nom", oAgr123_SP_HAI_NomUtt.get(j).firstWord);
//				first.put("o-123+sp+hai+acc", oAgr123_SP_HAI_AccUtt.get(j).firstWord);
//				first.put("o-123+sp+hai+nomacc", oAgr123_SP_HAI_NomAccUtt.get(j).firstWord);
//				first.put("o-123+sp+hai+erg", oAgr123_SP_HAI_ErgUtt.get(j).firstWord);
//				first.put("o-123+sp+hai+abs", oAgr123_SP_HAI_AbsUtt.get(j).firstWord);
//				first.put("o-123+sp+hai+ergabs", oAgr123_SP_HAI_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("o-123+sp+mnm", oAgr123_SP_MNMUtt.get(j).firstWord);
//				first.put("o-123+sp+mnm+nom", oAgr123_SP_MNM_NomUtt.get(j).firstWord);
//				first.put("o-123+sp+mnm+acc", oAgr123_SP_MNM_AccUtt.get(j).firstWord);
//				first.put("o-123+sp+mnm+nomacc", oAgr123_SP_MNM_NomAccUtt.get(j).firstWord);
//				first.put("o-123+sp+mnm+erg", oAgr123_SP_MNM_ErgUtt.get(j).firstWord);
//				first.put("o-123+sp+mnm+abs", oAgr123_SP_MNM_AbsUtt.get(j).firstWord);
//				first.put("o-123+sp+mnm+ergabs", oAgr123_SP_MNM_ErgAbsUtt.get(j).firstWord);
//								
//				first.put("so-123+sp+mf", soAgr123_SP_MFUtt.get(j).firstWord);
//				first.put("so-123+sp+mf+nom", soAgr123_SP_MF_NomUtt.get(j).firstWord);
//				first.put("so-123+sp+mf+acc", soAgr123_SP_MF_AccUtt.get(j).firstWord);
//				first.put("so-123+sp+mf+nomacc", soAgr123_SP_MF_NomAccUtt.get(j).firstWord);
//				first.put("so-123+sp+mf+erg", soAgr123_SP_MF_ErgUtt.get(j).firstWord);
//				first.put("so-123+sp+mf+abs", soAgr123_SP_MF_AbsUtt.get(j).firstWord);
//				first.put("so-123+sp+mf+ergabs", soAgr123_SP_MF_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("so-123+sp+mfn", soAgr123_SP_MFNUtt.get(j).firstWord);
//				first.put("so-123+sp+mfn+nom", soAgr123_SP_MFN_NomUtt.get(j).firstWord);
//				first.put("so-123+sp+mfn+acc", soAgr123_SP_MFN_AccUtt.get(j).firstWord);
//				first.put("so-123+sp+mfn+nomacc", soAgr123_SP_MFN_NomAccUtt.get(j).firstWord);
//				first.put("so-123+sp+mfn+erg", soAgr123_SP_MFN_ErgUtt.get(j).firstWord);
//				first.put("so-123+sp+mfn+abs", soAgr123_SP_MFN_AbsUtt.get(j).firstWord);
//				first.put("so-123+sp+mfn+ergabs", soAgr123_SP_MFN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("so-123+sp+cn", soAgr123_SP_CNUtt.get(j).firstWord);
//				first.put("so-123+sp+cn+nom", soAgr123_SP_CN_NomUtt.get(j).firstWord);
//				first.put("so-123+sp+cn+acc", soAgr123_SP_CN_AccUtt.get(j).firstWord);
//				first.put("so-123+sp+cn+nomacc", soAgr123_SP_CN_NomAccUtt.get(j).firstWord);
//				first.put("so-123+sp+cn+erg", soAgr123_SP_CN_ErgUtt.get(j).firstWord);
//				first.put("so-123+sp+cn+abs", soAgr123_SP_CN_AbsUtt.get(j).firstWord);
//				first.put("so-123+sp+cn+ergabs", soAgr123_SP_CN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("so-123+sp+ai", soAgr123_SP_AIUtt.get(j).firstWord);
//				first.put("so-123+sp+ai+nom", soAgr123_SP_AI_NomUtt.get(j).firstWord);
//				first.put("so-123+sp+ai+acc", soAgr123_SP_AI_AccUtt.get(j).firstWord);
//				first.put("so-123+sp+ai+nomacc", soAgr123_SP_AI_NomAccUtt.get(j).firstWord);
//				first.put("so-123+sp+ai+erg", soAgr123_SP_AI_ErgUtt.get(j).firstWord);
//				first.put("so-123+sp+ai+abs", soAgr123_SP_AI_AbsUtt.get(j).firstWord);
//				first.put("so-123+sp+ai+ergabs", soAgr123_SP_AI_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("so-123+sp+hn", soAgr123_SP_HNUtt.get(j).firstWord);
//				first.put("so-123+sp+hn+nom", soAgr123_SP_HN_NomUtt.get(j).firstWord);
//				first.put("so-123+sp+hn+acc", soAgr123_SP_HN_AccUtt.get(j).firstWord);
//				first.put("so-123+sp+hn+nomacc", soAgr123_SP_HN_NomAccUtt.get(j).firstWord);
//				first.put("so-123+sp+hn+erg", soAgr123_SP_HN_ErgUtt.get(j).firstWord);
//				first.put("so-123+sp+hn+abs", soAgr123_SP_HN_AbsUtt.get(j).firstWord);
//				first.put("so-123+sp+hn+ergabs", soAgr123_SP_HN_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("so-123+sp+hai", soAgr123_SP_HAIUtt.get(j).firstWord);
//				first.put("so-123+sp+hai+nom", soAgr123_SP_HAI_NomUtt.get(j).firstWord);
//				first.put("so-123+sp+hai+acc", soAgr123_SP_HAI_AccUtt.get(j).firstWord);
//				first.put("so-123+sp+hai+nomacc", soAgr123_SP_HAI_NomAccUtt.get(j).firstWord);
//				first.put("so-123+sp+hai+erg", soAgr123_SP_HAI_ErgUtt.get(j).firstWord);
//				first.put("so-123+sp+hai+abs", soAgr123_SP_HAI_AbsUtt.get(j).firstWord);
//				first.put("so-123+sp+hai+ergabs", soAgr123_SP_HAI_ErgAbsUtt.get(j).firstWord);
//				
//				first.put("so-123+sp+mnm", soAgr123_SP_MNMUtt.get(j).firstWord);
//				first.put("so-123+sp+mnm+nom", soAgr123_SP_MNM_NomUtt.get(j).firstWord);
//				first.put("so-123+sp+mnm+acc", soAgr123_SP_MNM_AccUtt.get(j).firstWord);
//				first.put("so-123+sp+mnm+nomacc", soAgr123_SP_MNM_NomAccUtt.get(j).firstWord);
//				first.put("so-123+sp+mnm+erg", soAgr123_SP_MNM_ErgUtt.get(j).firstWord);
//				first.put("so-123+sp+mnm+abs", soAgr123_SP_MNM_AbsUtt.get(j).firstWord);
//				first.put("so-123+sp+mnm+ergabs", soAgr123_SP_MNM_ErgAbsUtt.get(j).firstWord);
				
				HashMap<String, Word> second = new HashMap<>();
				second.put("caseless", this.utt.get((i*6)+j).secondWord);
//				second.put("nom", this.nomUtt.get((i*6)+j).secondWord);
//				second.put("acc", this.accUtt.get((i*6)+j).secondWord);
//				second.put("nomacc", this.nomAccUtt.get((i*6)+j).secondWord);
//				second.put("erg", this.ergUtt.get((i*6)+j).secondWord);
//				second.put("abs", this.absUtt.get((i*6)+j).secondWord);
//				second.put("ergabs", this.ergAbsUtt.get((i*6)+j).secondWord);
//				
//				second.put("s-123", sAgr123Utt.get(j).secondWord);
//	//			second.put("s-we", sAgrWeUtt.get(j).secondWord);
//				
//				second.put("o-123", oAgr123Utt.get(j).secondWord);
//	//			second.put("o-we", oAgrWeUtt.get(j).secondWord);
//				
//				second.put("so-123", soAgr123Utt.get(j).secondWord);
//	//			second.put("so-we", soAgrWeUtt.get(j).secondWord);
//				
//				second.put("s-sp", sAgrSPUtt.get(j).secondWord);
//				second.put("o-sp", oAgrSPUtt.get(j).secondWord);
//				second.put("so-sp", soAgrSPUtt.get(j).secondWord);
//				
//				second.put("s-123+sp", sAgr123_SPUtt.get(j).secondWord);
//				second.put("s-123+sp+nom", sAgr123_SP_NomUtt.get(j).secondWord);
//				second.put("s-123+sp+acc", sAgr123_SP_AccUtt.get(j).secondWord);
//				second.put("s-123+sp+nomacc", sAgr123_SP_NomAccUtt.get(j).secondWord);
//				second.put("s-123+sp+erg", sAgr123_SP_ErgUtt.get(j).secondWord);
//				second.put("s-123+sp+abs", sAgr123_SP_AbsUtt.get(j).secondWord);
//				second.put("s-123+sp+ergabs", sAgr123_SP_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("o-123+sp", oAgr123_SPUtt.get(j).secondWord);
//				second.put("o-123+sp+nom", oAgr123_SP_NomUtt.get(j).secondWord);
//				second.put("o-123+sp+acc", oAgr123_SP_AccUtt.get(j).secondWord);
//				second.put("o-123+sp+nomacc", oAgr123_SP_NomAccUtt.get(j).secondWord);
//				second.put("o-123+sp+erg", oAgr123_SP_ErgUtt.get(j).secondWord);
//				second.put("o-123+sp+abs", oAgr123_SP_AbsUtt.get(j).secondWord);
//				second.put("o-123+sp+ergabs", oAgr123_SP_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("so-123+sp", soAgr123_SPUtt.get(j).secondWord);
//				second.put("so-123+sp+nom", soAgr123_SP_NomUtt.get(j).secondWord);
//				second.put("so-123+sp+acc", soAgr123_SP_AccUtt.get(j).secondWord);
//				second.put("so-123+sp+nomacc", soAgr123_SP_NomAccUtt.get(j).secondWord);
//				second.put("so-123+sp+erg", soAgr123_SP_ErgUtt.get(j).secondWord);
//				second.put("so-123+sp+abs", soAgr123_SP_AbsUtt.get(j).secondWord);
//				second.put("so-123+sp+ergabs", soAgr123_SP_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("s-mf", sAgrMFUtt.get(j).secondWord);
//				second.put("s-mf+nom", sAgrMF_NomUtt.get(j).secondWord);
//				second.put("s-mf+acc", sAgrMF_AccUtt.get(j).secondWord);
//				second.put("s-mf+nomacc", sAgrMF_NomAccUtt.get(j).secondWord);
//				second.put("s-mf+erg", sAgrMF_ErgUtt.get(j).secondWord);
//				second.put("s-mf+abs", sAgrMF_AbsUtt.get(j).secondWord);
//				second.put("s-mf+ergabs", sAgrMF_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("s-mfn", sAgrMFNUtt.get(j).secondWord);
//				second.put("s-mfn+nom", sAgrMFN_NomUtt.get(j).secondWord);
//				second.put("s-mfn+acc", sAgrMFN_AccUtt.get(j).secondWord);
//				second.put("s-mfn+nomacc", sAgrMFN_NomAccUtt.get(j).secondWord);
//				second.put("s-mfn+erg", sAgrMFN_ErgUtt.get(j).secondWord);
//				second.put("s-mfn+abs", sAgrMFN_AbsUtt.get(j).secondWord);
//				second.put("s-mfn+ergabs", sAgrMFN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("s-cn", sAgrCNUtt.get(j).secondWord);
//				second.put("s-cn+nom", sAgrCN_NomUtt.get(j).secondWord);
//				second.put("s-cn+acc", sAgrCN_AccUtt.get(j).secondWord);
//				second.put("s-cn+nomacc", sAgrCN_NomAccUtt.get(j).secondWord);
//				second.put("s-cn+erg", sAgrCN_ErgUtt.get(j).secondWord);
//				second.put("s-cn+abs", sAgrCN_AbsUtt.get(j).secondWord);
//				second.put("s-cn+ergabs", sAgrCN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("s-ai", sAgrAIUtt.get(j).secondWord);
//				second.put("s-ai+nom", sAgrAI_NomUtt.get(j).secondWord);
//				second.put("s-ai+acc", sAgrAI_AccUtt.get(j).secondWord);
//				second.put("s-ai+nomacc", sAgrAI_NomAccUtt.get(j).secondWord);
//				second.put("s-ai+erg", sAgrAI_ErgUtt.get(j).secondWord);
//				second.put("s-ai+abs", sAgrAI_AbsUtt.get(j).secondWord);
//				second.put("s-ai+ergabs", sAgrAI_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("s-hn", sAgrHNUtt.get(j).secondWord);
//				second.put("s-hn+nom", sAgrHN_NomUtt.get(j).secondWord);
//				second.put("s-hn+acc", sAgrHN_AccUtt.get(j).secondWord);
//				second.put("s-hn+nomacc", sAgrHN_NomAccUtt.get(j).secondWord);
//				second.put("s-hn+erg", sAgrHN_ErgUtt.get(j).secondWord);
//				second.put("s-hn+abs", sAgrHN_AbsUtt.get(j).secondWord);
//				second.put("s-hn+ergabs", sAgrHN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("s-hai", sAgrHAIUtt.get(j).secondWord);
//				second.put("s-hai+nom", sAgrHAI_NomUtt.get(j).secondWord);
//				second.put("s-hai+acc", sAgrHAI_AccUtt.get(j).secondWord);
//				second.put("s-hai+nomacc", sAgrHAI_NomAccUtt.get(j).secondWord);
//				second.put("s-hai+erg", sAgrHAI_ErgUtt.get(j).secondWord);
//				second.put("s-hai+abs", sAgrHAI_AbsUtt.get(j).secondWord);
//				second.put("s-hai+ergabs", sAgrHAI_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("s-mnm", sAgrMNMUtt.get(j).secondWord);
//				second.put("s-mnm+nom", sAgrMNM_NomUtt.get(j).secondWord);
//				second.put("s-mnm+acc", sAgrMNM_AccUtt.get(j).secondWord);
//				second.put("s-mnm+nomacc", sAgrMNM_NomAccUtt.get(j).secondWord);
//				second.put("s-mnm+erg", sAgrMNM_ErgUtt.get(j).secondWord);
//				second.put("s-mnm+abs", sAgrMNM_AbsUtt.get(j).secondWord);
//				second.put("s-mnm+ergabs", sAgrMNM_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("o-mf", oAgrMFUtt.get(j).secondWord);
//				second.put("o-mf+nom", oAgrMF_NomUtt.get(j).secondWord);
//				second.put("o-mf+acc", oAgrMF_AccUtt.get(j).secondWord);
//				second.put("o-mf+nomacc", oAgrMF_NomAccUtt.get(j).secondWord);
//				second.put("o-mf+erg", oAgrMF_ErgUtt.get(j).secondWord);
//				second.put("o-mf+abs", oAgrMF_AbsUtt.get(j).secondWord);
//				second.put("o-mf+ergabs", oAgrMF_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("o-mfn", oAgrMFNUtt.get(j).secondWord);
//				second.put("o-mfn+nom", oAgrMFN_NomUtt.get(j).secondWord);
//				second.put("o-mfn+acc", oAgrMFN_AccUtt.get(j).secondWord);
//				second.put("o-mfn+nomacc", oAgrMFN_NomAccUtt.get(j).secondWord);
//				second.put("o-mfn+erg", oAgrMFN_ErgUtt.get(j).secondWord);
//				second.put("o-mfn+abs", oAgrMFN_AbsUtt.get(j).secondWord);
//				second.put("o-mfn+ergabs", oAgrMFN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("o-cn", oAgrCNUtt.get(j).secondWord);
//				second.put("o-cn+nom", oAgrCN_NomUtt.get(j).secondWord);
//				second.put("o-cn+acc", oAgrCN_AccUtt.get(j).secondWord);
//				second.put("o-cn+nomacc", oAgrCN_NomAccUtt.get(j).secondWord);
//				second.put("o-cn+erg", oAgrCN_ErgUtt.get(j).secondWord);
//				second.put("o-cn+abs", oAgrCN_AbsUtt.get(j).secondWord);
//				second.put("o-cn+ergabs", oAgrCN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("o-ai", oAgrAIUtt.get(j).secondWord);
//				second.put("o-ai+nom", oAgrAI_NomUtt.get(j).secondWord);
//				second.put("o-ai+acc", oAgrAI_AccUtt.get(j).secondWord);
//				second.put("o-ai+nomacc", oAgrAI_NomAccUtt.get(j).secondWord);
//				second.put("o-ai+erg", oAgrAI_ErgUtt.get(j).secondWord);
//				second.put("o-ai+abs", oAgrAI_AbsUtt.get(j).secondWord);
//				second.put("o-ai+ergabs", oAgrAI_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("o-hn", oAgrHNUtt.get(j).secondWord);
//				second.put("o-hn+nom", oAgrHN_NomUtt.get(j).secondWord);
//				second.put("o-hn+acc", oAgrHN_AccUtt.get(j).secondWord);
//				second.put("o-hn+nomacc", oAgrHN_NomAccUtt.get(j).secondWord);
//				second.put("o-hn+erg", oAgrHN_ErgUtt.get(j).secondWord);
//				second.put("o-hn+abs", oAgrHN_AbsUtt.get(j).secondWord);
//				second.put("o-hn+ergabs", oAgrHN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("o-hai", oAgrHAIUtt.get(j).secondWord);
//				second.put("o-hai+nom", oAgrHAI_NomUtt.get(j).secondWord);
//				second.put("o-hai+acc", oAgrHAI_AccUtt.get(j).secondWord);
//				second.put("o-hai+nomacc", oAgrHAI_NomAccUtt.get(j).secondWord);
//				second.put("o-hai+erg", oAgrHAI_ErgUtt.get(j).secondWord);
//				second.put("o-hai+abs", oAgrHAI_AbsUtt.get(j).secondWord);
//				second.put("o-hai+ergabs", oAgrHAI_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("o-mnm", oAgrMNMUtt.get(j).secondWord);
//				second.put("o-mnm+nom", oAgrMNM_NomUtt.get(j).secondWord);
//				second.put("o-mnm+acc", oAgrMNM_AccUtt.get(j).secondWord);
//				second.put("o-mnm+nomacc", oAgrMNM_NomAccUtt.get(j).secondWord);
//				second.put("o-mnm+erg", oAgrMNM_ErgUtt.get(j).secondWord);
//				second.put("o-mnm+abs", oAgrMNM_AbsUtt.get(j).secondWord);
//				second.put("o-mnm+ergabs", oAgrMNM_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("so-mf", soAgrMFUtt.get(j).secondWord);
//				second.put("so-mf+nom", soAgrMF_NomUtt.get(j).secondWord);
//				second.put("so-mf+acc", soAgrMF_AccUtt.get(j).secondWord);
//				second.put("so-mf+nomacc", soAgrMF_NomAccUtt.get(j).secondWord);
//				second.put("so-mf+erg", soAgrMF_ErgUtt.get(j).secondWord);
//				second.put("so-mf+abs", soAgrMF_AbsUtt.get(j).secondWord);
//				second.put("so-mf+ergabs", soAgrMF_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("so-mfn", soAgrMFNUtt.get(j).secondWord);
//				second.put("so-mfn+nom", soAgrMFN_NomUtt.get(j).secondWord);
//				second.put("so-mfn+acc", soAgrMFN_AccUtt.get(j).secondWord);
//				second.put("so-mfn+nomacc", soAgrMFN_NomAccUtt.get(j).secondWord);
//				second.put("so-mfn+erg", soAgrMFN_ErgUtt.get(j).secondWord);
//				second.put("so-mfn+abs", soAgrMFN_AbsUtt.get(j).secondWord);
//				second.put("so-mfn+ergabs", soAgrMFN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("so-cn", soAgrCNUtt.get(j).secondWord);
//				second.put("so-cn+nom", soAgrCN_NomUtt.get(j).secondWord);
//				second.put("so-cn+acc", soAgrCN_AccUtt.get(j).secondWord);
//				second.put("so-cn+nomacc", soAgrCN_NomAccUtt.get(j).secondWord);
//				second.put("so-cn+erg", soAgrCN_ErgUtt.get(j).secondWord);
//				second.put("so-cn+abs", soAgrCN_AbsUtt.get(j).secondWord);
//				second.put("so-cn+ergabs", soAgrCN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("so-ai", soAgrAIUtt.get(j).secondWord);
//				second.put("so-ai+nom", soAgrAI_NomUtt.get(j).secondWord);
//				second.put("so-ai+acc", soAgrAI_AccUtt.get(j).secondWord);
//				second.put("so-ai+nomacc", soAgrAI_NomAccUtt.get(j).secondWord);
//				second.put("so-ai+erg", soAgrAI_ErgUtt.get(j).secondWord);
//				second.put("so-ai+abs", soAgrAI_AbsUtt.get(j).secondWord);
//				second.put("so-ai+ergabs", soAgrAI_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("so-hn", soAgrHNUtt.get(j).secondWord);
//				second.put("so-hn+nom", soAgrHN_NomUtt.get(j).secondWord);
//				second.put("so-hn+acc", soAgrHN_AccUtt.get(j).secondWord);
//				second.put("so-hn+nomacc", soAgrHN_NomAccUtt.get(j).secondWord);
//				second.put("so-hn+erg", soAgrHN_ErgUtt.get(j).secondWord);
//				second.put("so-hn+abs", soAgrHN_AbsUtt.get(j).secondWord);
//				second.put("so-hn+ergabs", soAgrHN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("so-hai", soAgrHAIUtt.get(j).secondWord);
//				second.put("so-hai+nom", soAgrHAI_NomUtt.get(j).secondWord);
//				second.put("so-hai+acc", soAgrHAI_AccUtt.get(j).secondWord);
//				second.put("so-hai+nomacc", soAgrHAI_NomAccUtt.get(j).secondWord);
//				second.put("so-hai+erg", soAgrHAI_ErgUtt.get(j).secondWord);
//				second.put("so-hai+abs", soAgrHAI_AbsUtt.get(j).secondWord);
//				second.put("so-hai+ergabs", soAgrHAI_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("so-mnm", soAgrMNMUtt.get(j).secondWord);
//				second.put("so-mnm+nom", soAgrMNM_NomUtt.get(j).secondWord);
//				second.put("so-mnm+acc", soAgrMNM_AccUtt.get(j).secondWord);
//				second.put("so-mnm+nomacc", soAgrMNM_NomAccUtt.get(j).secondWord);
//				second.put("so-mnm+erg", soAgrMNM_ErgUtt.get(j).secondWord);
//				second.put("so-mnm+abs", soAgrMNM_AbsUtt.get(j).secondWord);
//				second.put("so-mnm+ergabs", soAgrMNM_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("s-123+sp+mf", sAgr123_SP_MFUtt.get(j).secondWord);
//				second.put("s-123+sp+mf+nom", sAgr123_SP_MF_NomUtt.get(j).secondWord);
//				second.put("s-123+sp+mf+acc", sAgr123_SP_MF_AccUtt.get(j).secondWord);
//				second.put("s-123+sp+mf+nomacc", sAgr123_SP_MF_NomAccUtt.get(j).secondWord);
//				second.put("s-123+sp+mf+erg", sAgr123_SP_MF_ErgUtt.get(j).secondWord);
//				second.put("s-123+sp+mf+abs", sAgr123_SP_MF_AbsUtt.get(j).secondWord);
//				second.put("s-123+sp+mf+ergabs", sAgr123_SP_MF_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("s-123+sp+mfn", sAgr123_SP_MFNUtt.get(j).secondWord);
//				second.put("s-123+sp+mfn+nom", sAgr123_SP_MFN_NomUtt.get(j).secondWord);
//				second.put("s-123+sp+mfn+acc", sAgr123_SP_MFN_AccUtt.get(j).secondWord);
//				second.put("s-123+sp+mfn+nomacc", sAgr123_SP_MFN_NomAccUtt.get(j).secondWord);
//				second.put("s-123+sp+mfn+erg", sAgr123_SP_MFN_ErgUtt.get(j).secondWord);
//				second.put("s-123+sp+mfn+abs", sAgr123_SP_MFN_AbsUtt.get(j).secondWord);
//				second.put("s-123+sp+mfn+ergabs", sAgr123_SP_MFN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("s-123+sp+cn", sAgr123_SP_CNUtt.get(j).secondWord);
//				second.put("s-123+sp+cn+nom", sAgr123_SP_CN_NomUtt.get(j).secondWord);
//				second.put("s-123+sp+cn+acc", sAgr123_SP_CN_AccUtt.get(j).secondWord);
//				second.put("s-123+sp+cn+nomacc", sAgr123_SP_CN_NomAccUtt.get(j).secondWord);
//				second.put("s-123+sp+cn+erg", sAgr123_SP_CN_ErgUtt.get(j).secondWord);
//				second.put("s-123+sp+cn+abs", sAgr123_SP_CN_AbsUtt.get(j).secondWord);
//				second.put("s-123+sp+cn+ergabs", sAgr123_SP_CN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("s-123+sp+ai", sAgr123_SP_AIUtt.get(j).secondWord);
//				second.put("s-123+sp+ai+nom", sAgr123_SP_AI_NomUtt.get(j).secondWord);
//				second.put("s-123+sp+ai+acc", sAgr123_SP_AI_AccUtt.get(j).secondWord);
//				second.put("s-123+sp+ai+nomacc", sAgr123_SP_AI_NomAccUtt.get(j).secondWord);
//				second.put("s-123+sp+ai+erg", sAgr123_SP_AI_ErgUtt.get(j).secondWord);
//				second.put("s-123+sp+ai+abs", sAgr123_SP_AI_AbsUtt.get(j).secondWord);
//				second.put("s-123+sp+ai+ergabs", sAgr123_SP_AI_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("s-123+sp+hn", sAgr123_SP_HNUtt.get(j).secondWord);
//				second.put("s-123+sp+hn+nom", sAgr123_SP_HN_NomUtt.get(j).secondWord);
//				second.put("s-123+sp+hn+acc", sAgr123_SP_HN_AccUtt.get(j).secondWord);
//				second.put("s-123+sp+hn+nomacc", sAgr123_SP_HN_NomAccUtt.get(j).secondWord);
//				second.put("s-123+sp+hn+erg", sAgr123_SP_HN_ErgUtt.get(j).secondWord);
//				second.put("s-123+sp+hn+abs", sAgr123_SP_HN_AbsUtt.get(j).secondWord);
//				second.put("s-123+sp+hn+ergabs", sAgr123_SP_HN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("s-123+sp+hai", sAgr123_SP_HAIUtt.get(j).secondWord);
//				second.put("s-123+sp+hai+nom", sAgr123_SP_HAI_NomUtt.get(j).secondWord);
//				second.put("s-123+sp+hai+acc", sAgr123_SP_HAI_AccUtt.get(j).secondWord);
//				second.put("s-123+sp+hai+nomacc", sAgr123_SP_HAI_NomAccUtt.get(j).secondWord);
//				second.put("s-123+sp+hai+erg", sAgr123_SP_HAI_ErgUtt.get(j).secondWord);
//				second.put("s-123+sp+hai+abs", sAgr123_SP_HAI_AbsUtt.get(j).secondWord);
//				second.put("s-123+sp+hai+ergabs", sAgr123_SP_HAI_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("s-123+sp+mnm", sAgr123_SP_MNMUtt.get(j).secondWord);
//				second.put("s-123+sp+mnm+nom", sAgr123_SP_MNM_NomUtt.get(j).secondWord);
//				second.put("s-123+sp+mnm+acc", sAgr123_SP_MNM_AccUtt.get(j).secondWord);
//				second.put("s-123+sp+mnm+nomacc", sAgr123_SP_MNM_NomAccUtt.get(j).secondWord);
//				second.put("s-123+sp+mnm+erg", sAgr123_SP_MNM_ErgUtt.get(j).secondWord);
//				second.put("s-123+sp+mnm+abs", sAgr123_SP_MNM_AbsUtt.get(j).secondWord);
//				second.put("s-123+sp+mnm+ergabs", sAgr123_SP_MNM_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("o-123+sp+mf", oAgr123_SP_MFUtt.get(j).secondWord);
//				second.put("o-123+sp+mf+nom", oAgr123_SP_MF_NomUtt.get(j).secondWord);
//				second.put("o-123+sp+mf+acc", oAgr123_SP_MF_AccUtt.get(j).secondWord);
//				second.put("o-123+sp+mf+nomacc", oAgr123_SP_MF_NomAccUtt.get(j).secondWord);
//				second.put("o-123+sp+mf+erg", oAgr123_SP_MF_ErgUtt.get(j).secondWord);
//				second.put("o-123+sp+mf+abs", oAgr123_SP_MF_AbsUtt.get(j).secondWord);
//				second.put("o-123+sp+mf+ergabs", oAgr123_SP_MF_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("o-123+sp+mfn", oAgr123_SP_MFNUtt.get(j).secondWord);
//				second.put("o-123+sp+mfn+nom", oAgr123_SP_MFN_NomUtt.get(j).secondWord);
//				second.put("o-123+sp+mfn+acc", oAgr123_SP_MFN_AccUtt.get(j).secondWord);
//				second.put("o-123+sp+mfn+nomacc", oAgr123_SP_MFN_NomAccUtt.get(j).secondWord);
//				second.put("o-123+sp+mfn+erg", oAgr123_SP_MFN_ErgUtt.get(j).secondWord);
//				second.put("o-123+sp+mfn+abs", oAgr123_SP_MFN_AbsUtt.get(j).secondWord);
//				second.put("o-123+sp+mfn+ergabs", oAgr123_SP_MFN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("o-123+sp+cn", oAgr123_SP_CNUtt.get(j).secondWord);
//				second.put("o-123+sp+cn+nom", oAgr123_SP_CN_NomUtt.get(j).secondWord);
//				second.put("o-123+sp+cn+acc", oAgr123_SP_CN_AccUtt.get(j).secondWord);
//				second.put("o-123+sp+cn+nomacc", oAgr123_SP_CN_NomAccUtt.get(j).secondWord);
//				second.put("o-123+sp+cn+erg", oAgr123_SP_CN_ErgUtt.get(j).secondWord);
//				second.put("o-123+sp+cn+abs", oAgr123_SP_CN_AbsUtt.get(j).secondWord);
//				second.put("o-123+sp+cn+ergabs", oAgr123_SP_CN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("o-123+sp+ai", oAgr123_SP_AIUtt.get(j).secondWord);
//				second.put("o-123+sp+ai+nom", oAgr123_SP_AI_NomUtt.get(j).secondWord);
//				second.put("o-123+sp+ai+acc", oAgr123_SP_AI_AccUtt.get(j).secondWord);
//				second.put("o-123+sp+ai+nomacc", oAgr123_SP_AI_NomAccUtt.get(j).secondWord);
//				second.put("o-123+sp+ai+erg", oAgr123_SP_AI_ErgUtt.get(j).secondWord);
//				second.put("o-123+sp+ai+abs", oAgr123_SP_AI_AbsUtt.get(j).secondWord);
//				second.put("o-123+sp+ai+ergabs", oAgr123_SP_AI_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("o-123+sp+hn", oAgr123_SP_HNUtt.get(j).secondWord);
//				second.put("o-123+sp+hn+nom", oAgr123_SP_HN_NomUtt.get(j).secondWord);
//				second.put("o-123+sp+hn+acc", oAgr123_SP_HN_AccUtt.get(j).secondWord);
//				second.put("o-123+sp+hn+nomacc", oAgr123_SP_HN_NomAccUtt.get(j).secondWord);
//				second.put("o-123+sp+hn+erg", oAgr123_SP_HN_ErgUtt.get(j).secondWord);
//				second.put("o-123+sp+hn+abs", oAgr123_SP_HN_AbsUtt.get(j).secondWord);
//				second.put("o-123+sp+hn+ergabs", oAgr123_SP_HN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("o-123+sp+hai", oAgr123_SP_HAIUtt.get(j).secondWord);
//				second.put("o-123+sp+hai+nom", oAgr123_SP_HAI_NomUtt.get(j).secondWord);
//				second.put("o-123+sp+hai+acc", oAgr123_SP_HAI_AccUtt.get(j).secondWord);
//				second.put("o-123+sp+hai+nomacc", oAgr123_SP_HAI_NomAccUtt.get(j).secondWord);
//				second.put("o-123+sp+hai+erg", oAgr123_SP_HAI_ErgUtt.get(j).secondWord);
//				second.put("o-123+sp+hai+abs", oAgr123_SP_HAI_AbsUtt.get(j).secondWord);
//				second.put("o-123+sp+hai+ergabs", oAgr123_SP_HAI_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("o-123+sp+mnm", oAgr123_SP_MNMUtt.get(j).secondWord);
//				second.put("o-123+sp+mnm+nom", oAgr123_SP_MNM_NomUtt.get(j).secondWord);
//				second.put("o-123+sp+mnm+acc", oAgr123_SP_MNM_AccUtt.get(j).secondWord);
//				second.put("o-123+sp+mnm+nomacc", oAgr123_SP_MNM_NomAccUtt.get(j).secondWord);
//				second.put("o-123+sp+mnm+erg", oAgr123_SP_MNM_ErgUtt.get(j).secondWord);
//				second.put("o-123+sp+mnm+abs", oAgr123_SP_MNM_AbsUtt.get(j).secondWord);
//				second.put("o-123+sp+mnm+ergabs", oAgr123_SP_MNM_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("so-123+sp+mf", soAgr123_SP_MFUtt.get(j).secondWord);
//				second.put("so-123+sp+mf+nom", soAgr123_SP_MF_NomUtt.get(j).secondWord);
//				second.put("so-123+sp+mf+acc", soAgr123_SP_MF_AccUtt.get(j).secondWord);
//				second.put("so-123+sp+mf+nomacc", soAgr123_SP_MF_NomAccUtt.get(j).secondWord);
//				second.put("so-123+sp+mf+erg", soAgr123_SP_MF_ErgUtt.get(j).secondWord);
//				second.put("so-123+sp+mf+abs", soAgr123_SP_MF_AbsUtt.get(j).secondWord);
//				second.put("so-123+sp+mf+ergabs", soAgr123_SP_MF_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("so-123+sp+mfn", soAgr123_SP_MFNUtt.get(j).secondWord);
//				second.put("so-123+sp+mfn+nom", soAgr123_SP_MFN_NomUtt.get(j).secondWord);
//				second.put("so-123+sp+mfn+acc", soAgr123_SP_MFN_AccUtt.get(j).secondWord);
//				second.put("so-123+sp+mfn+nomacc", soAgr123_SP_MFN_NomAccUtt.get(j).secondWord);
//				second.put("so-123+sp+mfn+erg", soAgr123_SP_MFN_ErgUtt.get(j).secondWord);
//				second.put("so-123+sp+mfn+abs", soAgr123_SP_MFN_AbsUtt.get(j).secondWord);
//				second.put("so-123+sp+mfn+ergabs", soAgr123_SP_MFN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("so-123+sp+cn", soAgr123_SP_CNUtt.get(j).secondWord);
//				second.put("so-123+sp+cn+nom", soAgr123_SP_CN_NomUtt.get(j).secondWord);
//				second.put("so-123+sp+cn+acc", soAgr123_SP_CN_AccUtt.get(j).secondWord);
//				second.put("so-123+sp+cn+nomacc", soAgr123_SP_CN_NomAccUtt.get(j).secondWord);
//				second.put("so-123+sp+cn+erg", soAgr123_SP_CN_ErgUtt.get(j).secondWord);
//				second.put("so-123+sp+cn+abs", soAgr123_SP_CN_AbsUtt.get(j).secondWord);
//				second.put("so-123+sp+cn+ergabs", soAgr123_SP_CN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("so-123+sp+ai", soAgr123_SP_AIUtt.get(j).secondWord);
//				second.put("so-123+sp+ai+nom", soAgr123_SP_AI_NomUtt.get(j).secondWord);
//				second.put("so-123+sp+ai+acc", soAgr123_SP_AI_AccUtt.get(j).secondWord);
//				second.put("so-123+sp+ai+nomacc", soAgr123_SP_AI_NomAccUtt.get(j).secondWord);
//				second.put("so-123+sp+ai+erg", soAgr123_SP_AI_ErgUtt.get(j).secondWord);
//				second.put("so-123+sp+ai+abs", soAgr123_SP_AI_AbsUtt.get(j).secondWord);
//				second.put("so-123+sp+ai+ergabs", soAgr123_SP_AI_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("so-123+sp+hn", soAgr123_SP_HNUtt.get(j).secondWord);
//				second.put("so-123+sp+hn+nom", soAgr123_SP_HN_NomUtt.get(j).secondWord);
//				second.put("so-123+sp+hn+acc", soAgr123_SP_HN_AccUtt.get(j).secondWord);
//				second.put("so-123+sp+hn+nomacc", soAgr123_SP_HN_NomAccUtt.get(j).secondWord);
//				second.put("so-123+sp+hn+erg", soAgr123_SP_HN_ErgUtt.get(j).secondWord);
//				second.put("so-123+sp+hn+abs", soAgr123_SP_HN_AbsUtt.get(j).secondWord);
//				second.put("so-123+sp+hn+ergabs", soAgr123_SP_HN_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("so-123+sp+hai", soAgr123_SP_HAIUtt.get(j).secondWord);
//				second.put("so-123+sp+hai+nom", soAgr123_SP_HAI_NomUtt.get(j).secondWord);
//				second.put("so-123+sp+hai+acc", soAgr123_SP_HAI_AccUtt.get(j).secondWord);
//				second.put("so-123+sp+hai+nomacc", soAgr123_SP_HAI_NomAccUtt.get(j).secondWord);
//				second.put("so-123+sp+hai+erg", soAgr123_SP_HAI_ErgUtt.get(j).secondWord);
//				second.put("so-123+sp+hai+abs", soAgr123_SP_HAI_AbsUtt.get(j).secondWord);
//				second.put("so-123+sp+hai+ergabs", soAgr123_SP_HAI_ErgAbsUtt.get(j).secondWord);
//				
//				second.put("so-123+sp+mnm", soAgr123_SP_MNMUtt.get(j).secondWord);
//				second.put("so-123+sp+mnm+nom", soAgr123_SP_MNM_NomUtt.get(j).secondWord);
//				second.put("so-123+sp+mnm+acc", soAgr123_SP_MNM_AccUtt.get(j).secondWord);
//				second.put("so-123+sp+mnm+nomacc", soAgr123_SP_MNM_NomAccUtt.get(j).secondWord);
//				second.put("so-123+sp+mnm+erg", soAgr123_SP_MNM_ErgUtt.get(j).secondWord);
//				second.put("so-123+sp+mnm+abs", soAgr123_SP_MNM_AbsUtt.get(j).secondWord);
//				second.put("so-123+sp+mnm+ergabs", soAgr123_SP_MNM_ErgAbsUtt.get(j).secondWord);
				
				HashMap<String, Word> third = new HashMap<>();
				third.put("caseless", this.utt.get((i*6)+j).thirdWord);
//				third.put("nom", this.nomUtt.get((i*6)+j).thirdWord);
//				third.put("acc", this.accUtt.get((i*6)+j).thirdWord);
//				third.put("nomacc", this.nomAccUtt.get((i*6)+j).thirdWord);
//				third.put("erg", this.ergUtt.get((i*6)+j).thirdWord);
//				third.put("abs", this.absUtt.get((i*6)+j).thirdWord);
//				third.put("ergabs", this.ergAbsUtt.get((i*6)+j).thirdWord);
//				
//				third.put("s-123", sAgr123Utt.get(j).thirdWord);
//	//			third.put("s-we", sAgrWeUtt.get(j).thirdWord);
//				
//				third.put("o-123", oAgr123Utt.get(j).thirdWord);
//	//			third.put("o-we", oAgrWeUtt.get(j).thirdWord);
//				
//				third.put("so-123", soAgr123Utt.get(j).thirdWord);
//	//			third.put("so-we", soAgrWeUtt.get(j).thirdWord);
//				
//				third.put("s-sp", sAgrSPUtt.get(j).thirdWord);
//				third.put("o-sp", oAgrSPUtt.get(j).thirdWord);
//				third.put("so-sp", soAgrSPUtt.get(j).thirdWord);
//				
//				third.put("s-123+sp", sAgr123_SPUtt.get(j).thirdWord);
//				third.put("s-123+sp+nom", sAgr123_SP_NomUtt.get(j).thirdWord);
//				third.put("s-123+sp+acc", sAgr123_SP_AccUtt.get(j).thirdWord);
//				third.put("s-123+sp+nomacc", sAgr123_SP_NomAccUtt.get(j).thirdWord);
//				third.put("s-123+sp+erg", sAgr123_SP_ErgUtt.get(j).thirdWord);
//				third.put("s-123+sp+abs", sAgr123_SP_AbsUtt.get(j).thirdWord);
//				third.put("s-123+sp+ergabs", sAgr123_SP_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("o-123+sp", oAgr123_SPUtt.get(j).thirdWord);
//				third.put("o-123+sp+nom", oAgr123_SP_NomUtt.get(j).thirdWord);
//				third.put("o-123+sp+acc", oAgr123_SP_AccUtt.get(j).thirdWord);
//				third.put("o-123+sp+nomacc", oAgr123_SP_NomAccUtt.get(j).thirdWord);
//				third.put("o-123+sp+erg", oAgr123_SP_ErgUtt.get(j).thirdWord);
//				third.put("o-123+sp+abs", oAgr123_SP_AbsUtt.get(j).thirdWord);
//				third.put("o-123+sp+ergabs", oAgr123_SP_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("so-123+sp", soAgr123_SPUtt.get(j).thirdWord);
//				third.put("so-123+sp+nom", soAgr123_SP_NomUtt.get(j).thirdWord);
//				third.put("so-123+sp+acc", soAgr123_SP_AccUtt.get(j).thirdWord);
//				third.put("so-123+sp+nomacc", soAgr123_SP_NomAccUtt.get(j).thirdWord);
//				third.put("so-123+sp+erg", soAgr123_SP_ErgUtt.get(j).thirdWord);
//				third.put("so-123+sp+abs", soAgr123_SP_AbsUtt.get(j).thirdWord);
//				third.put("so-123+sp+ergabs", soAgr123_SP_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("s-mf", sAgrMFUtt.get(j).thirdWord);
//				third.put("s-mf+nom", sAgrMF_NomUtt.get(j).thirdWord);
//				third.put("s-mf+acc", sAgrMF_AccUtt.get(j).thirdWord);
//				third.put("s-mf+nomacc", sAgrMF_NomAccUtt.get(j).thirdWord);
//				third.put("s-mf+erg", sAgrMF_ErgUtt.get(j).thirdWord);
//				third.put("s-mf+abs", sAgrMF_AbsUtt.get(j).thirdWord);
//				third.put("s-mf+ergabs", sAgrMF_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("s-mfn", sAgrMFNUtt.get(j).thirdWord);
//				third.put("s-mfn+nom", sAgrMFN_NomUtt.get(j).thirdWord);
//				third.put("s-mfn+acc", sAgrMFN_AccUtt.get(j).thirdWord);
//				third.put("s-mfn+nomacc", sAgrMFN_NomAccUtt.get(j).thirdWord);
//				third.put("s-mfn+erg", sAgrMFN_ErgUtt.get(j).thirdWord);
//				third.put("s-mfn+abs", sAgrMFN_AbsUtt.get(j).thirdWord);
//				third.put("s-mfn+ergabs", sAgrMFN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("s-cn", sAgrCNUtt.get(j).thirdWord);
//				third.put("s-cn+nom", sAgrCN_NomUtt.get(j).thirdWord);
//				third.put("s-cn+acc", sAgrCN_AccUtt.get(j).thirdWord);
//				third.put("s-cn+nomacc", sAgrCN_NomAccUtt.get(j).thirdWord);
//				third.put("s-cn+erg", sAgrCN_ErgUtt.get(j).thirdWord);
//				third.put("s-cn+abs", sAgrCN_AbsUtt.get(j).thirdWord);
//				third.put("s-cn+ergabs", sAgrCN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("s-ai", sAgrAIUtt.get(j).thirdWord);
//				third.put("s-ai+nom", sAgrAI_NomUtt.get(j).thirdWord);
//				third.put("s-ai+acc", sAgrAI_AccUtt.get(j).thirdWord);
//				third.put("s-ai+nomacc", sAgrAI_NomAccUtt.get(j).thirdWord);
//				third.put("s-ai+erg", sAgrAI_ErgUtt.get(j).thirdWord);
//				third.put("s-ai+abs", sAgrAI_AbsUtt.get(j).thirdWord);
//				third.put("s-ai+ergabs", sAgrAI_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("s-hn", sAgrHNUtt.get(j).thirdWord);
//				third.put("s-hn+nom", sAgrHN_NomUtt.get(j).thirdWord);
//				third.put("s-hn+acc", sAgrHN_AccUtt.get(j).thirdWord);
//				third.put("s-hn+nomacc", sAgrHN_NomAccUtt.get(j).thirdWord);
//				third.put("s-hn+erg", sAgrHN_ErgUtt.get(j).thirdWord);
//				third.put("s-hn+abs", sAgrHN_AbsUtt.get(j).thirdWord);
//				third.put("s-hn+ergabs", sAgrHN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("s-hai", sAgrHAIUtt.get(j).thirdWord);
//				third.put("s-hai+nom", sAgrHAI_NomUtt.get(j).thirdWord);
//				third.put("s-hai+acc", sAgrHAI_AccUtt.get(j).thirdWord);
//				third.put("s-hai+nomacc", sAgrHAI_NomAccUtt.get(j).thirdWord);
//				third.put("s-hai+erg", sAgrHAI_ErgUtt.get(j).thirdWord);
//				third.put("s-hai+abs", sAgrHAI_AbsUtt.get(j).thirdWord);
//				third.put("s-hai+ergabs", sAgrHAI_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("s-mnm", sAgrMNMUtt.get(j).thirdWord);
//				third.put("s-mnm+nom", sAgrMNM_NomUtt.get(j).thirdWord);
//				third.put("s-mnm+acc", sAgrMNM_AccUtt.get(j).thirdWord);
//				third.put("s-mnm+nomacc", sAgrMNM_NomAccUtt.get(j).thirdWord);
//				third.put("s-mnm+erg", sAgrMNM_ErgUtt.get(j).thirdWord);
//				third.put("s-mnm+abs", sAgrMNM_AbsUtt.get(j).thirdWord);
//				third.put("s-mnm+ergabs", sAgrMNM_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("o-mf", oAgrMFUtt.get(j).thirdWord);
//				third.put("o-mf+nom", oAgrMF_NomUtt.get(j).thirdWord);
//				third.put("o-mf+acc", oAgrMF_AccUtt.get(j).thirdWord);
//				third.put("o-mf+nomacc", oAgrMF_NomAccUtt.get(j).thirdWord);
//				third.put("o-mf+erg", oAgrMF_ErgUtt.get(j).thirdWord);
//				third.put("o-mf+abs", oAgrMF_AbsUtt.get(j).thirdWord);
//				third.put("o-mf+ergabs", oAgrMF_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("o-mfn", oAgrMFNUtt.get(j).thirdWord);
//				third.put("o-mfn+nom", oAgrMFN_NomUtt.get(j).thirdWord);
//				third.put("o-mfn+acc", oAgrMFN_AccUtt.get(j).thirdWord);
//				third.put("o-mfn+nomacc", oAgrMFN_NomAccUtt.get(j).thirdWord);
//				third.put("o-mfn+erg", oAgrMFN_ErgUtt.get(j).thirdWord);
//				third.put("o-mfn+abs", oAgrMFN_AbsUtt.get(j).thirdWord);
//				third.put("o-mfn+ergabs", oAgrMFN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("o-cn", oAgrCNUtt.get(j).thirdWord);
//				third.put("o-cn+nom", oAgrCN_NomUtt.get(j).thirdWord);
//				third.put("o-cn+acc", oAgrCN_AccUtt.get(j).thirdWord);
//				third.put("o-cn+nomacc", oAgrCN_NomAccUtt.get(j).thirdWord);
//				third.put("o-cn+erg", oAgrCN_ErgUtt.get(j).thirdWord);
//				third.put("o-cn+abs", oAgrCN_AbsUtt.get(j).thirdWord);
//				third.put("o-cn+ergabs", oAgrCN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("o-ai", oAgrAIUtt.get(j).thirdWord);
//				third.put("o-ai+nom", oAgrAI_NomUtt.get(j).thirdWord);
//				third.put("o-ai+acc", oAgrAI_AccUtt.get(j).thirdWord);
//				third.put("o-ai+nomacc", oAgrAI_NomAccUtt.get(j).thirdWord);
//				third.put("o-ai+erg", oAgrAI_ErgUtt.get(j).thirdWord);
//				third.put("o-ai+abs", oAgrAI_AbsUtt.get(j).thirdWord);
//				third.put("o-ai+ergabs", oAgrAI_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("o-hn", oAgrHNUtt.get(j).thirdWord);
//				third.put("o-hn+nom", oAgrHN_NomUtt.get(j).thirdWord);
//				third.put("o-hn+acc", oAgrHN_AccUtt.get(j).thirdWord);
//				third.put("o-hn+nomacc", oAgrHN_NomAccUtt.get(j).thirdWord);
//				third.put("o-hn+erg", oAgrHN_ErgUtt.get(j).thirdWord);
//				third.put("o-hn+abs", oAgrHN_AbsUtt.get(j).thirdWord);
//				third.put("o-hn+ergabs", oAgrHN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("o-hai", oAgrHAIUtt.get(j).thirdWord);
//				third.put("o-hai+nom", oAgrHAI_NomUtt.get(j).thirdWord);
//				third.put("o-hai+acc", oAgrHAI_AccUtt.get(j).thirdWord);
//				third.put("o-hai+nomacc", oAgrHAI_NomAccUtt.get(j).thirdWord);
//				third.put("o-hai+erg", oAgrHAI_ErgUtt.get(j).thirdWord);
//				third.put("o-hai+abs", oAgrHAI_AbsUtt.get(j).thirdWord);
//				third.put("o-hai+ergabs", oAgrHAI_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("o-mnm", oAgrMNMUtt.get(j).thirdWord);
//				third.put("o-mnm+nom", oAgrMNM_NomUtt.get(j).thirdWord);
//				third.put("o-mnm+acc", oAgrMNM_AccUtt.get(j).thirdWord);
//				third.put("o-mnm+nomacc", oAgrMNM_NomAccUtt.get(j).thirdWord);
//				third.put("o-mnm+erg", oAgrMNM_ErgUtt.get(j).thirdWord);
//				third.put("o-mnm+abs", oAgrMNM_AbsUtt.get(j).thirdWord);
//				third.put("o-mnm+ergabs", oAgrMNM_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("so-mf", soAgrMFUtt.get(j).thirdWord);
//				third.put("so-mf+nom", soAgrMF_NomUtt.get(j).thirdWord);
//				third.put("so-mf+acc", soAgrMF_AccUtt.get(j).thirdWord);
//				third.put("so-mf+nomacc", soAgrMF_NomAccUtt.get(j).thirdWord);
//				third.put("so-mf+erg", soAgrMF_ErgUtt.get(j).thirdWord);
//				third.put("so-mf+abs", soAgrMF_AbsUtt.get(j).thirdWord);
//				third.put("so-mf+ergabs", soAgrMF_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("so-mfn", soAgrMFNUtt.get(j).thirdWord);
//				third.put("so-mfn+nom", soAgrMFN_NomUtt.get(j).thirdWord);
//				third.put("so-mfn+acc", soAgrMFN_AccUtt.get(j).thirdWord);
//				third.put("so-mfn+nomacc", soAgrMFN_NomAccUtt.get(j).thirdWord);
//				third.put("so-mfn+erg", soAgrMFN_ErgUtt.get(j).thirdWord);
//				third.put("so-mfn+abs", soAgrMFN_AbsUtt.get(j).thirdWord);
//				third.put("so-mfn+ergabs", soAgrMFN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("so-cn", soAgrCNUtt.get(j).thirdWord);
//				third.put("so-cn+nom", soAgrCN_NomUtt.get(j).thirdWord);
//				third.put("so-cn+acc", soAgrCN_AccUtt.get(j).thirdWord);
//				third.put("so-cn+nomacc", soAgrCN_NomAccUtt.get(j).thirdWord);
//				third.put("so-cn+erg", soAgrCN_ErgUtt.get(j).thirdWord);
//				third.put("so-cn+abs", soAgrCN_AbsUtt.get(j).thirdWord);
//				third.put("so-cn+ergabs", soAgrCN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("so-ai", soAgrAIUtt.get(j).thirdWord);
//				third.put("so-ai+nom", soAgrAI_NomUtt.get(j).thirdWord);
//				third.put("so-ai+acc", soAgrAI_AccUtt.get(j).thirdWord);
//				third.put("so-ai+nomacc", soAgrAI_NomAccUtt.get(j).thirdWord);
//				third.put("so-ai+erg", soAgrAI_ErgUtt.get(j).thirdWord);
//				third.put("so-ai+abs", soAgrAI_AbsUtt.get(j).thirdWord);
//				third.put("so-ai+ergabs", soAgrAI_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("so-hn", soAgrHNUtt.get(j).thirdWord);
//				third.put("so-hn+nom", soAgrHN_NomUtt.get(j).thirdWord);
//				third.put("so-hn+acc", soAgrHN_AccUtt.get(j).thirdWord);
//				third.put("so-hn+nomacc", soAgrHN_NomAccUtt.get(j).thirdWord);
//				third.put("so-hn+erg", soAgrHN_ErgUtt.get(j).thirdWord);
//				third.put("so-hn+abs", soAgrHN_AbsUtt.get(j).thirdWord);
//				third.put("so-hn+ergabs", soAgrHN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("so-hai", soAgrHAIUtt.get(j).thirdWord);
//				third.put("so-hai+nom", soAgrHAI_NomUtt.get(j).thirdWord);
//				third.put("so-hai+acc", soAgrHAI_AccUtt.get(j).thirdWord);
//				third.put("so-hai+nomacc", soAgrHAI_NomAccUtt.get(j).thirdWord);
//				third.put("so-hai+erg", soAgrHAI_ErgUtt.get(j).thirdWord);
//				third.put("so-hai+abs", soAgrHAI_AbsUtt.get(j).thirdWord);
//				third.put("so-hai+ergabs", soAgrHAI_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("so-mnm", soAgrMNMUtt.get(j).thirdWord);
//				third.put("so-mnm+nom", soAgrMNM_NomUtt.get(j).thirdWord);
//				third.put("so-mnm+acc", soAgrMNM_AccUtt.get(j).thirdWord);
//				third.put("so-mnm+nomacc", soAgrMNM_NomAccUtt.get(j).thirdWord);
//				third.put("so-mnm+erg", soAgrMNM_ErgUtt.get(j).thirdWord);
//				third.put("so-mnm+abs", soAgrMNM_AbsUtt.get(j).thirdWord);
//				third.put("so-mnm+ergabs", soAgrMNM_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("s-123+sp+mf", sAgr123_SP_MFUtt.get(j).thirdWord);
//				third.put("s-123+sp+mf+nom", sAgr123_SP_MF_NomUtt.get(j).thirdWord);
//				third.put("s-123+sp+mf+acc", sAgr123_SP_MF_AccUtt.get(j).thirdWord);
//				third.put("s-123+sp+mf+nomacc", sAgr123_SP_MF_NomAccUtt.get(j).thirdWord);
//				third.put("s-123+sp+mf+erg", sAgr123_SP_MF_ErgUtt.get(j).thirdWord);
//				third.put("s-123+sp+mf+abs", sAgr123_SP_MF_AbsUtt.get(j).thirdWord);
//				third.put("s-123+sp+mf+ergabs", sAgr123_SP_MF_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("s-123+sp+mfn", sAgr123_SP_MFNUtt.get(j).thirdWord);
//				third.put("s-123+sp+mfn+nom", sAgr123_SP_MFN_NomUtt.get(j).thirdWord);
//				third.put("s-123+sp+mfn+acc", sAgr123_SP_MFN_AccUtt.get(j).thirdWord);
//				third.put("s-123+sp+mfn+nomacc", sAgr123_SP_MFN_NomAccUtt.get(j).thirdWord);
//				third.put("s-123+sp+mfn+erg", sAgr123_SP_MFN_ErgUtt.get(j).thirdWord);
//				third.put("s-123+sp+mfn+abs", sAgr123_SP_MFN_AbsUtt.get(j).thirdWord);
//				third.put("s-123+sp+mfn+ergabs", sAgr123_SP_MFN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("s-123+sp+cn", sAgr123_SP_CNUtt.get(j).thirdWord);
//				third.put("s-123+sp+cn+nom", sAgr123_SP_CN_NomUtt.get(j).thirdWord);
//				third.put("s-123+sp+cn+acc", sAgr123_SP_CN_AccUtt.get(j).thirdWord);
//				third.put("s-123+sp+cn+nomacc", sAgr123_SP_CN_NomAccUtt.get(j).thirdWord);
//				third.put("s-123+sp+cn+erg", sAgr123_SP_CN_ErgUtt.get(j).thirdWord);
//				third.put("s-123+sp+cn+abs", sAgr123_SP_CN_AbsUtt.get(j).thirdWord);
//				third.put("s-123+sp+cn+ergabs", sAgr123_SP_CN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("s-123+sp+ai", sAgr123_SP_AIUtt.get(j).thirdWord);
//				third.put("s-123+sp+ai+nom", sAgr123_SP_AI_NomUtt.get(j).thirdWord);
//				third.put("s-123+sp+ai+acc", sAgr123_SP_AI_AccUtt.get(j).thirdWord);
//				third.put("s-123+sp+ai+nomacc", sAgr123_SP_AI_NomAccUtt.get(j).thirdWord);
//				third.put("s-123+sp+ai+erg", sAgr123_SP_AI_ErgUtt.get(j).thirdWord);
//				third.put("s-123+sp+ai+abs", sAgr123_SP_AI_AbsUtt.get(j).thirdWord);
//				third.put("s-123+sp+ai+ergabs", sAgr123_SP_AI_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("s-123+sp+hn", sAgr123_SP_HNUtt.get(j).thirdWord);
//				third.put("s-123+sp+hn+nom", sAgr123_SP_HN_NomUtt.get(j).thirdWord);
//				third.put("s-123+sp+hn+acc", sAgr123_SP_HN_AccUtt.get(j).thirdWord);
//				third.put("s-123+sp+hn+nomacc", sAgr123_SP_HN_NomAccUtt.get(j).thirdWord);
//				third.put("s-123+sp+hn+erg", sAgr123_SP_HN_ErgUtt.get(j).thirdWord);
//				third.put("s-123+sp+hn+abs", sAgr123_SP_HN_AbsUtt.get(j).thirdWord);
//				third.put("s-123+sp+hn+ergabs", sAgr123_SP_HN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("s-123+sp+hai", sAgr123_SP_HAIUtt.get(j).thirdWord);
//				third.put("s-123+sp+hai+nom", sAgr123_SP_HAI_NomUtt.get(j).thirdWord);
//				third.put("s-123+sp+hai+acc", sAgr123_SP_HAI_AccUtt.get(j).thirdWord);
//				third.put("s-123+sp+hai+nomacc", sAgr123_SP_HAI_NomAccUtt.get(j).thirdWord);
//				third.put("s-123+sp+hai+erg", sAgr123_SP_HAI_ErgUtt.get(j).thirdWord);
//				third.put("s-123+sp+hai+abs", sAgr123_SP_HAI_AbsUtt.get(j).thirdWord);
//				third.put("s-123+sp+hai+ergabs", sAgr123_SP_HAI_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("s-123+sp+mnm", sAgr123_SP_MNMUtt.get(j).thirdWord);
//				third.put("s-123+sp+mnm+nom", sAgr123_SP_MNM_NomUtt.get(j).thirdWord);
//				third.put("s-123+sp+mnm+acc", sAgr123_SP_MNM_AccUtt.get(j).thirdWord);
//				third.put("s-123+sp+mnm+nomacc", sAgr123_SP_MNM_NomAccUtt.get(j).thirdWord);
//				third.put("s-123+sp+mnm+erg", sAgr123_SP_MNM_ErgUtt.get(j).thirdWord);
//				third.put("s-123+sp+mnm+abs", sAgr123_SP_MNM_AbsUtt.get(j).thirdWord);
//				third.put("s-123+sp+mnm+ergabs", sAgr123_SP_MNM_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("o-123+sp+mf", oAgr123_SP_MFUtt.get(j).thirdWord);
//				third.put("o-123+sp+mf+nom", oAgr123_SP_MF_NomUtt.get(j).thirdWord);
//				third.put("o-123+sp+mf+acc", oAgr123_SP_MF_AccUtt.get(j).thirdWord);
//				third.put("o-123+sp+mf+nomacc", oAgr123_SP_MF_NomAccUtt.get(j).thirdWord);
//				third.put("o-123+sp+mf+erg", oAgr123_SP_MF_ErgUtt.get(j).thirdWord);
//				third.put("o-123+sp+mf+abs", oAgr123_SP_MF_AbsUtt.get(j).thirdWord);
//				third.put("o-123+sp+mf+ergabs", oAgr123_SP_MF_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("o-123+sp+mfn", oAgr123_SP_MFNUtt.get(j).thirdWord);
//				third.put("o-123+sp+mfn+nom", oAgr123_SP_MFN_NomUtt.get(j).thirdWord);
//				third.put("o-123+sp+mfn+acc", oAgr123_SP_MFN_AccUtt.get(j).thirdWord);
//				third.put("o-123+sp+mfn+nomacc", oAgr123_SP_MFN_NomAccUtt.get(j).thirdWord);
//				third.put("o-123+sp+mfn+erg", oAgr123_SP_MFN_ErgUtt.get(j).thirdWord);
//				third.put("o-123+sp+mfn+abs", oAgr123_SP_MFN_AbsUtt.get(j).thirdWord);
//				third.put("o-123+sp+mfn+ergabs", oAgr123_SP_MFN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("o-123+sp+cn", oAgr123_SP_CNUtt.get(j).thirdWord);
//				third.put("o-123+sp+cn+nom", oAgr123_SP_CN_NomUtt.get(j).thirdWord);
//				third.put("o-123+sp+cn+acc", oAgr123_SP_CN_AccUtt.get(j).thirdWord);
//				third.put("o-123+sp+cn+nomacc", oAgr123_SP_CN_NomAccUtt.get(j).thirdWord);
//				third.put("o-123+sp+cn+erg", oAgr123_SP_CN_ErgUtt.get(j).thirdWord);
//				third.put("o-123+sp+cn+abs", oAgr123_SP_CN_AbsUtt.get(j).thirdWord);
//				third.put("o-123+sp+cn+ergabs", oAgr123_SP_CN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("o-123+sp+ai", oAgr123_SP_AIUtt.get(j).thirdWord);
//				third.put("o-123+sp+ai+nom", oAgr123_SP_AI_NomUtt.get(j).thirdWord);
//				third.put("o-123+sp+ai+acc", oAgr123_SP_AI_AccUtt.get(j).thirdWord);
//				third.put("o-123+sp+ai+nomacc", oAgr123_SP_AI_NomAccUtt.get(j).thirdWord);
//				third.put("o-123+sp+ai+erg", oAgr123_SP_AI_ErgUtt.get(j).thirdWord);
//				third.put("o-123+sp+ai+abs", oAgr123_SP_AI_AbsUtt.get(j).thirdWord);
//				third.put("o-123+sp+ai+ergabs", oAgr123_SP_AI_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("o-123+sp+hn", oAgr123_SP_HNUtt.get(j).thirdWord);
//				third.put("o-123+sp+hn+nom", oAgr123_SP_HN_NomUtt.get(j).thirdWord);
//				third.put("o-123+sp+hn+acc", oAgr123_SP_HN_AccUtt.get(j).thirdWord);
//				third.put("o-123+sp+hn+nomacc", oAgr123_SP_HN_NomAccUtt.get(j).thirdWord);
//				third.put("o-123+sp+hn+erg", oAgr123_SP_HN_ErgUtt.get(j).thirdWord);
//				third.put("o-123+sp+hn+abs", oAgr123_SP_HN_AbsUtt.get(j).thirdWord);
//				third.put("o-123+sp+hn+ergabs", oAgr123_SP_HN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("o-123+sp+hai", oAgr123_SP_HAIUtt.get(j).thirdWord);
//				third.put("o-123+sp+hai+nom", oAgr123_SP_HAI_NomUtt.get(j).thirdWord);
//				third.put("o-123+sp+hai+acc", oAgr123_SP_HAI_AccUtt.get(j).thirdWord);
//				third.put("o-123+sp+hai+nomacc", oAgr123_SP_HAI_NomAccUtt.get(j).thirdWord);
//				third.put("o-123+sp+hai+erg", oAgr123_SP_HAI_ErgUtt.get(j).thirdWord);
//				third.put("o-123+sp+hai+abs", oAgr123_SP_HAI_AbsUtt.get(j).thirdWord);
//				third.put("o-123+sp+hai+ergabs", oAgr123_SP_HAI_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("o-123+sp+mnm", oAgr123_SP_MNMUtt.get(j).thirdWord);
//				third.put("o-123+sp+mnm+nom", oAgr123_SP_MNM_NomUtt.get(j).thirdWord);
//				third.put("o-123+sp+mnm+acc", oAgr123_SP_MNM_AccUtt.get(j).thirdWord);
//				third.put("o-123+sp+mnm+nomacc", oAgr123_SP_MNM_NomAccUtt.get(j).thirdWord);
//				third.put("o-123+sp+mnm+erg", oAgr123_SP_MNM_ErgUtt.get(j).thirdWord);
//				third.put("o-123+sp+mnm+abs", oAgr123_SP_MNM_AbsUtt.get(j).thirdWord);
//				third.put("o-123+sp+mnm+ergabs", oAgr123_SP_MNM_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("so-123+sp+mf", soAgr123_SP_MFUtt.get(j).thirdWord);
//				third.put("so-123+sp+mf+nom", soAgr123_SP_MF_NomUtt.get(j).thirdWord);
//				third.put("so-123+sp+mf+acc", soAgr123_SP_MF_AccUtt.get(j).thirdWord);
//				third.put("so-123+sp+mf+nomacc", soAgr123_SP_MF_NomAccUtt.get(j).thirdWord);
//				third.put("so-123+sp+mf+erg", soAgr123_SP_MF_ErgUtt.get(j).thirdWord);
//				third.put("so-123+sp+mf+abs", soAgr123_SP_MF_AbsUtt.get(j).thirdWord);
//				third.put("so-123+sp+mf+ergabs", soAgr123_SP_MF_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("so-123+sp+mfn", soAgr123_SP_MFNUtt.get(j).thirdWord);
//				third.put("so-123+sp+mfn+nom", soAgr123_SP_MFN_NomUtt.get(j).thirdWord);
//				third.put("so-123+sp+mfn+acc", soAgr123_SP_MFN_AccUtt.get(j).thirdWord);
//				third.put("so-123+sp+mfn+nomacc", soAgr123_SP_MFN_NomAccUtt.get(j).thirdWord);
//				third.put("so-123+sp+mfn+erg", soAgr123_SP_MFN_ErgUtt.get(j).thirdWord);
//				third.put("so-123+sp+mfn+abs", soAgr123_SP_MFN_AbsUtt.get(j).thirdWord);
//				third.put("so-123+sp+mfn+ergabs", soAgr123_SP_MFN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("so-123+sp+cn", soAgr123_SP_CNUtt.get(j).thirdWord);
//				third.put("so-123+sp+cn+nom", soAgr123_SP_CN_NomUtt.get(j).thirdWord);
//				third.put("so-123+sp+cn+acc", soAgr123_SP_CN_AccUtt.get(j).thirdWord);
//				third.put("so-123+sp+cn+nomacc", soAgr123_SP_CN_NomAccUtt.get(j).thirdWord);
//				third.put("so-123+sp+cn+erg", soAgr123_SP_CN_ErgUtt.get(j).thirdWord);
//				third.put("so-123+sp+cn+abs", soAgr123_SP_CN_AbsUtt.get(j).thirdWord);
//				third.put("so-123+sp+cn+ergabs", soAgr123_SP_CN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("so-123+sp+ai", soAgr123_SP_AIUtt.get(j).thirdWord);
//				third.put("so-123+sp+ai+nom", soAgr123_SP_AI_NomUtt.get(j).thirdWord);
//				third.put("so-123+sp+ai+acc", soAgr123_SP_AI_AccUtt.get(j).thirdWord);
//				third.put("so-123+sp+ai+nomacc", soAgr123_SP_AI_NomAccUtt.get(j).thirdWord);
//				third.put("so-123+sp+ai+erg", soAgr123_SP_AI_ErgUtt.get(j).thirdWord);
//				third.put("so-123+sp+ai+abs", soAgr123_SP_AI_AbsUtt.get(j).thirdWord);
//				third.put("so-123+sp+ai+ergabs", soAgr123_SP_AI_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("so-123+sp+hn", soAgr123_SP_HNUtt.get(j).thirdWord);
//				third.put("so-123+sp+hn+nom", soAgr123_SP_HN_NomUtt.get(j).thirdWord);
//				third.put("so-123+sp+hn+acc", soAgr123_SP_HN_AccUtt.get(j).thirdWord);
//				third.put("so-123+sp+hn+nomacc", soAgr123_SP_HN_NomAccUtt.get(j).thirdWord);
//				third.put("so-123+sp+hn+erg", soAgr123_SP_HN_ErgUtt.get(j).thirdWord);
//				third.put("so-123+sp+hn+abs", soAgr123_SP_HN_AbsUtt.get(j).thirdWord);
//				third.put("so-123+sp+hn+ergabs", soAgr123_SP_HN_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("so-123+sp+hai", soAgr123_SP_HAIUtt.get(j).thirdWord);
//				third.put("so-123+sp+hai+nom", soAgr123_SP_HAI_NomUtt.get(j).thirdWord);
//				third.put("so-123+sp+hai+acc", soAgr123_SP_HAI_AccUtt.get(j).thirdWord);
//				third.put("so-123+sp+hai+nomacc", soAgr123_SP_HAI_NomAccUtt.get(j).thirdWord);
//				third.put("so-123+sp+hai+erg", soAgr123_SP_HAI_ErgUtt.get(j).thirdWord);
//				third.put("so-123+sp+hai+abs", soAgr123_SP_HAI_AbsUtt.get(j).thirdWord);
//				third.put("so-123+sp+hai+ergabs", soAgr123_SP_HAI_ErgAbsUtt.get(j).thirdWord);
//				
//				third.put("so-123+sp+mnm", soAgr123_SP_MNMUtt.get(j).thirdWord);
//				third.put("so-123+sp+mnm+nom", soAgr123_SP_MNM_NomUtt.get(j).thirdWord);
//				third.put("so-123+sp+mnm+acc", soAgr123_SP_MNM_AccUtt.get(j).thirdWord);
//				third.put("so-123+sp+mnm+nomacc", soAgr123_SP_MNM_NomAccUtt.get(j).thirdWord);
//				third.put("so-123+sp+mnm+erg", soAgr123_SP_MNM_ErgUtt.get(j).thirdWord);
//				third.put("so-123+sp+mnm+abs", soAgr123_SP_MNM_AbsUtt.get(j).thirdWord);
//				third.put("so-123+sp+mnm+ergabs", soAgr123_SP_MNM_ErgAbsUtt.get(j).thirdWord);
				
				switch(j) {
	//-----------------------------------------------------------------------------------------------------------------------------//
	//------SVO----------------------------------------------------------------------------------------------------------------------//
				case 0:	
				{
					this.svoTest.first = first;
					this.svoTest.second = second;
					this.svoTest.third = third;
					this.svoTest.calculate(this.events, ev, this.lexicons);
					
					this.ideal.count++;
					BigDecimal twoThirds = BigDecimal.valueOf(2.0);
					twoThirds = twoThirds.divide(BigDecimal.valueOf(3.0), MathContext.DECIMAL128);
					this.ideal.eta1.add(etaNought.multiply(twoThirds));
					this.ideal.eventProbs.add(ev.probability);
					BigDecimal oneThird = BigDecimal.valueOf(1.0);
					oneThird = oneThird.divide(BigDecimal.valueOf(3.0), MathContext.DECIMAL128);
					this.ideal.eta2.add(etaNought.multiply(oneThird));
				}
					break;
	//-----------------------------------------------------------------------------------------------------------------------------//
	//-----SOV---------------------------------------------------------------------------------------------------------------------//
				case 1:
				{
					this.sovTest.first = first;
					this.sovTest.second = second;
					this.sovTest.third = third;
					this.sovTest.calculate(this.events, ev, this.lexicons);
				}
					break;
	//-----------------------------------------------------------------------------------------------------------------------------//
	//-----VSO---------------------------------------------------------------------------------------------------------------------//
				case 2:
				{
					this.vsoTest.first = first;
					this.vsoTest.second = second;
					this.vsoTest.third = third;
					this.vsoTest.calculate(this.events, ev, this.lexicons);					
				}
					break;
	//-----------------------------------------------------------------------------------------------------------------------------//
	//-----VOS---------------------------------------------------------------------------------------------------------------------//
				case 3:
				{
					this.vosTest.first = first;
					this.vosTest.second = second;
					this.vosTest.third = third;
					this.vosTest.calculate(this.events, ev, this.lexicons);
				}
					break;
	//-----------------------------------------------------------------------------------------------------------------------------//
	//-----OSV---------------------------------------------------------------------------------------------------------------------//
				case 4:
				{
					this.osvTest.first = first;
					this.osvTest.second = second;
					this.osvTest.third = third;
					this.osvTest.calculate(this.events, ev, this.lexicons);				
				}
				break;
	//----------------------------------------------------------------------------------------------------------------------------//
	//-----OVS--------------------------------------------------------------------------------------------------------------------//
				case 5:
				{
					this.ovsTest.first = first;
					this.ovsTest.second = second;
					this.ovsTest.third = third;
					this.ovsTest.calculate(this.events, ev, this.lexicons);
				}
					break;
				default:
					break;
				}
			}
		}
	}
	
	protected ArrayList<Event> genEvents() {
		ArrayList<Event> events = new ArrayList<>();
		// Set probabilities of alice eating things
		events.add(new Event("alice", "eat", "apple", 0.05));
		events.add(new Event("alice", "eat", "bread", 0.00));
		events.add(new Event("alice", "eat", "cake", 0.03));
		events.add(new Event("alice", "eat", "rice", 0.02));
		// Set probabilities of alice drinking things
		events.add(new Event("alice", "drink", "coffee", 0.07));
		events.add(new Event("alice", "drink", "cola", 0.03));
		events.add(new Event("alice", "drink", "juice", 0.00));
		events.add(new Event("alice", "drink", "water", 0.00));
		//
		//
		// Set probabilities of bob eating things
		events.add(new Event("bob", "eat", "apple", 0.02));
		events.add(new Event("bob", "eat", "bread", 0.00));
		events.add(new Event("bob", "eat", "cake", 0.04));
		events.add(new Event("bob", "eat", "rice", 0.04));
		// Set probabilities of bob drinking things
		events.add(new Event("bob", "drink", "coffee", 0.02));
		events.add(new Event("bob", "drink", "cola", 0.04));
		events.add(new Event("bob", "drink", "juice", 0.02));
		events.add(new Event("bob", "drink", "water", 0.02));
		//
		//
		// Set probabilities of eve eating things
		events.add(new Event("eve", "eat", "apple", 0.00));
		events.add(new Event("eve", "eat", "bread", 0.01));
		events.add(new Event("eve", "eat", "cake", 0.00));
		events.add(new Event("eve", "eat", "rice", 0.09));
		// Set probabilities of eve drinking things
		events.add(new Event("eve", "drink", "coffee", 0.03));
		events.add(new Event("eve", "drink", "cola", 0.01));
		events.add(new Event("eve", "drink", "juice", 0.00));
		events.add(new Event("eve", "drink", "water", 0.06));
		//
		//
		// Set probabilities of mallory eating things
		events.add(new Event("mallory", "eat", "apple", 0.04));
		events.add(new Event("mallory", "eat", "bread", 0.04));
		events.add(new Event("mallory", "eat", "cake", 0.01));
		events.add(new Event("mallory", "eat", "rice", 0.01));
		// Set probabilities of mallory drinking things
		events.add(new Event("mallory", "drink", "coffee", 0.00));
		events.add(new Event("mallory", "drink", "cola", 0.01));
		events.add(new Event("mallory", "drink", "juice", 0.09));
		events.add(new Event("mallory", "drink", "water", 0.00));
		//
		//
		// Set probabilities of trent eating things
		events.add(new Event("trent", "eat", "apple", 0.02));
		events.add(new Event("trent", "eat", "bread", 0.00));
		events.add(new Event("trent", "eat", "cake", 0.01));
		events.add(new Event("trent", "eat", "rice", 0.07));
		// Set probabilities of trent drinking things
		events.add(new Event("trent", "drink", "coffee", 0.02));
		events.add(new Event("trent", "drink", "cola", 0.03));
		events.add(new Event("trent", "drink", "juice", 0.03));
		events.add(new Event("trent", "drink", "water", 0.02));
		
		return events;
	}
	
	protected HashMap<String, HashMap<String, Word>> genLexicons() {
		HashMap<String, HashMap<String, Word>> lexicons = new HashMap<>();
		HashMap<String, Word> lex = new HashMap<String, Word>();
		ArrayList<Enum> al = new ArrayList<Enum>();
		al.add(NounClass.NONE);

	// 1st/2nd/3rd person subject agreement
		lex.put("alice", new Word("alice", "person", Person.THIRD));
		lex.put("bob", new Word("bob", "person", Person.THIRD));
		lex.put("eve", new Word("eve", "person", Person.THIRD));
		lex.put("mallory", new Word("mallory", "person", Person.THIRD));
		lex.put("trent", new Word("trent", "person", Person.THIRD));
		lex.put("apple", new Word("apple", "person", Person.THIRD));
		lex.put("bread", new Word("bread", "person", Person.THIRD));
		lex.put("cake", new Word("cake", "person", Person.THIRD));
		lex.put("rice", new Word("rice", "person", Person.THIRD));
		lex.put("coffee", new Word("coffee", "person", Person.THIRD));
		lex.put("cola", new Word("cola", "person", Person.THIRD));
		lex.put("juice", new Word("juice", "person", Person.THIRD));
		lex.put("water", new Word("water", "person", Person.THIRD));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123", lex);
		
		HashMap<String, Word> olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123", olex);
		
		HashMap<String, Word> solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123", solex);
		
		// Singular/plural_two agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "number", Number.SINGULAR));
		lex.put("bob", new Word("bob", "number", Number.SINGULAR));
		lex.put("eve", new Word("eve", "number", Number.SINGULAR));
		lex.put("mallory", new Word("mallory", "number", Number.SINGULAR));
		lex.put("trent", new Word("trent", "number", Number.SINGULAR));
		lex.put("apple", new Word("apple", "number", Number.SINGULAR));
		lex.put("bread", new Word("bread", "number", Number.SINGULAR));
		lex.put("cake", new Word("cake", "number", Number.SINGULAR));
		lex.put("rice", new Word("rice", "number", Number.SINGULAR));
		lex.put("coffee", new Word("coffee", "number", Number.SINGULAR));
		lex.put("cola", new Word("cola", "number", Number.SINGULAR));
		lex.put("juice", new Word("juice", "number", Number.SINGULAR));
		lex.put("water", new Word("water", "number", Number.SINGULAR));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-sp", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-sp", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-sp", solex);

		// inclusive/exclusive we person subject agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "person", Person.THIRD));
		lex.put("bob", new Word("bob", "person", Person.THIRD));
		lex.put("eve", new Word("eve", "person", Person.THIRD));
		lex.put("mallory", new Word("mallory", "person", Person.THIRD));
		lex.put("trent", new Word("trent", "person", Person.THIRD));
		lex.put("apple", new Word("apple", "person", Person.THIRD));
		lex.put("bread", new Word("bread", "person", Person.THIRD));
		lex.put("cake", new Word("cake", "person", Person.THIRD));
		lex.put("rice", new Word("rice", "person", Person.THIRD));
		lex.put("coffee", new Word("coffee", "person", Person.THIRD));
		lex.put("cola", new Word("cola", "person", Person.THIRD));
		lex.put("juice", new Word("juice", "person", Person.THIRD));
		lex.put("water", new Word("water", "person", Person.THIRD));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-we", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-we", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-we", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement
		lex = new HashMap<String, Word>();
		String[] inflKeys = {"person", "number"};
		Enum[] infls = {Person.THIRD, Number.SINGULAR};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));
		lex.put("apple", new Word("apple", inflKeys, infls));
		lex.put("bread", new Word("bread", inflKeys, infls));
		lex.put("cake", new Word("cake", inflKeys, infls));
		lex.put("rice", new Word("rice", inflKeys, infls));
		lex.put("coffee", new Word("coffee", inflKeys, infls));
		lex.put("cola", new Word("cola", inflKeys, infls));
		lex.put("juice", new Word("juice", inflKeys, infls));
		lex.put("water", new Word("water", inflKeys, infls));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp", solex);

		// MF subject agreement
		lex = new HashMap<String, Word>();
		al.add(NounClass.NONE);
		lex.put("alice", new Word("alice", "class", NounClass.FEMININE));
		lex.put("bob", new Word("bob", "class", NounClass.MASCULINE));
		lex.put("eve", new Word("eve", "class", NounClass.FEMININE));
		lex.put("mallory", new Word("mallory", "class", NounClass.FEMININE));
		lex.put("trent", new Word("trent", "class", NounClass.MASCULINE));
		lex.put("apple", new Word("apple", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("bread", new Word("bread", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("cake", new Word("cake", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("rice", new Word("rice", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("coffee", new Word("coffee", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("cola", new Word("cola", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("juice", new Word("juice", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("water", new Word("water", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-mf", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-mf", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-mf", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement + MF agr
		lex = new HashMap<String, Word>();
		inflKeys = new String[]{"person", "number", "class"};
		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.FEMININE};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.MASCULINE};
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("apple", new Word("apple", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("bread", new Word("bread", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("cake", new Word("cake", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("rice", new Word("rice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("coffee", new Word("coffee", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("cola", new Word("cola", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("juice", new Word("juice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE})};
		lex.put("water", new Word("water", inflKeys, infls));

		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp+mf", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp+mf", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp+mf", solex);

		// MFN subject agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "class", NounClass.FEMININE));
		lex.put("bob", new Word("bob", "class", NounClass.MASCULINE));
		lex.put("eve", new Word("eve", "class", NounClass.FEMININE));
		lex.put("mallory", new Word("mallory", "class", NounClass.FEMININE));
		lex.put("trent", new Word("trent", "class", NounClass.MASCULINE));
		lex.put("apple", new Word("apple", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("bread", new Word("bread", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("cake", new Word("cake", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("rice", new Word("rice", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("coffee", new Word("coffee", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("cola", new Word("cola", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("juice", new Word("juice", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("water", new Word("water", "class", randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-mfn", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-mfn", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-mfn", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement + MFN agr
		lex = new HashMap<String, Word>();
		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.FEMININE};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.MASCULINE};
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("apple", new Word("apple", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("bread", new Word("bread", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("cake", new Word("cake", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("rice", new Word("rice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("coffee", new Word("coffee", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("cola", new Word("cola", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("juice", new Word("juice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MASCULINE, NounClass.FEMININE, NounClass.NEUTER})};
		lex.put("water", new Word("water", inflKeys, infls));

		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp+mfn", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp+mfn", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp+mfn", solex);

		// Common vs Neuter subject agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "class", NounClass.COMMON));
		lex.put("bob", new Word("bob", "class", NounClass.COMMON));
		lex.put("eve", new Word("eve", "class", NounClass.COMMON));
		lex.put("mallory", new Word("mallory", "class", NounClass.COMMON));
		lex.put("trent", new Word("trent", "class", NounClass.COMMON));
		lex.put("apple", new Word("apple", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("bread", new Word("bread", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("cake", new Word("cake", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("rice", new Word("rice", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("coffee", new Word("coffee", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("cola", new Word("cola", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("juice", new Word("juice", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("water", new Word("water", "class", randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-cn", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-cn", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-cn", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement + CN agr
		lex = new HashMap<String, Word>();
		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.COMMON};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("apple", new Word("apple", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("bread", new Word("bread", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("cake", new Word("cake", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("rice", new Word("rice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("coffee", new Word("coffee", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("cola", new Word("cola", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("juice", new Word("juice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.COMMON, NounClass.NEUTER})};
		lex.put("water", new Word("water", inflKeys, infls));

		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp+cn", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp+cn", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp+cn", solex);

		// Animate vs inanimate subject agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "class", NounClass.ANIMATE));
		lex.put("bob", new Word("bob", "class", NounClass.ANIMATE));
		lex.put("eve", new Word("eve", "class", NounClass.ANIMATE));
		lex.put("mallory", new Word("mallory", "class", NounClass.ANIMATE));
		lex.put("trent", new Word("trent", "class", NounClass.ANIMATE));
		lex.put("apple", new Word("apple", "class", NounClass.INANIMATE));
		lex.put("bread", new Word("bread", "class", NounClass.INANIMATE));
		lex.put("cake", new Word("cake", "class", NounClass.INANIMATE));
		lex.put("rice", new Word("rice", "class", NounClass.INANIMATE));
		lex.put("coffee", new Word("coffee", "class", NounClass.INANIMATE));
		lex.put("cola", new Word("cola", "class", NounClass.INANIMATE));
		lex.put("juice", new Word("juice", "class", NounClass.INANIMATE));
		lex.put("water", new Word("water", "class", NounClass.INANIMATE));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-ai", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-ai", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-ai", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement + AI agr
		lex = new HashMap<String, Word>();
		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.ANIMATE};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.INANIMATE};
		lex.put("apple", new Word("apple", inflKeys, infls));
		lex.put("bread", new Word("bread", inflKeys, infls));
		lex.put("cake", new Word("cake", inflKeys, infls));
		lex.put("rice", new Word("rice", inflKeys, infls));
		lex.put("coffee", new Word("coffee", inflKeys, infls));
		lex.put("cola", new Word("cola", inflKeys, infls));
		lex.put("juice", new Word("juice", inflKeys, infls));
		lex.put("water", new Word("water", inflKeys, infls));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp+ai", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp+ai", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp+ai", solex);

		// Human vs nonhuman subject agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "class", NounClass.HUMAN));
		lex.put("bob", new Word("bob", "class", NounClass.HUMAN));
		lex.put("eve", new Word("eve", "class", NounClass.HUMAN));
		lex.put("mallory", new Word("mallory", "class", NounClass.HUMAN));
		lex.put("trent", new Word("trent", "class", NounClass.HUMAN));
		lex.put("apple", new Word("apple", "class", NounClass.NONHUMAN));
		lex.put("bread", new Word("bread", "class", NounClass.NONHUMAN));
		lex.put("cake", new Word("cake", "class", NounClass.NONHUMAN));
		lex.put("rice", new Word("rice", "class", NounClass.NONHUMAN));
		lex.put("coffee", new Word("coffee", "class", NounClass.NONHUMAN));
		lex.put("cola", new Word("cola", "class", NounClass.NONHUMAN));
		lex.put("juice", new Word("juice", "class", NounClass.NONHUMAN));
		lex.put("water", new Word("water", "class", NounClass.NONHUMAN));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-hn", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-hn", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-hn", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement + HN agr
		lex = new HashMap<String, Word>();
		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.HUMAN};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.NONHUMAN};
		lex.put("apple", new Word("apple", inflKeys, infls));
		lex.put("bread", new Word("bread", inflKeys, infls));
		lex.put("cake", new Word("cake", inflKeys, infls));
		lex.put("rice", new Word("rice", inflKeys, infls));
		lex.put("coffee", new Word("coffee", inflKeys, infls));
		lex.put("cola", new Word("cola", inflKeys, infls));
		lex.put("juice", new Word("juice", inflKeys, infls));
		lex.put("water", new Word("water", inflKeys, infls));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp+hn", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp+hn", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp+hn", solex);

		// Human vs animal vs inanimate subject agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "class", NounClass.HUMAN));
		lex.put("bob", new Word("bob", "class", NounClass.HUMAN));
		lex.put("eve", new Word("eve", "class", NounClass.HUMAN));
		lex.put("mallory", new Word("mallory", "class", NounClass.HUMAN));
		lex.put("trent", new Word("trent", "class", NounClass.HUMAN));
		lex.put("apple", new Word("apple", "class", NounClass.INANIMATE));
		lex.put("bread", new Word("bread", "class", NounClass.INANIMATE));
		lex.put("cake", new Word("cake", "class", NounClass.INANIMATE));
		lex.put("rice", new Word("rice", "class", NounClass.INANIMATE));
		lex.put("coffee", new Word("coffee", "class", NounClass.INANIMATE));
		lex.put("cola", new Word("cola", "class", NounClass.INANIMATE));
		lex.put("juice", new Word("juice", "class", NounClass.INANIMATE));
		lex.put("water", new Word("water", "class", NounClass.INANIMATE));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-hai", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-hai", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-hai", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement + HAI agr
		lex = new HashMap<String, Word>();
		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.HUMAN};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.INANIMATE};
		lex.put("apple", new Word("apple", inflKeys, infls));
		lex.put("bread", new Word("bread", inflKeys, infls));
		lex.put("cake", new Word("cake", inflKeys, infls));
		lex.put("rice", new Word("rice", inflKeys, infls));
		lex.put("coffee", new Word("coffee", inflKeys, infls));
		lex.put("cola", new Word("cola", inflKeys, infls));
		lex.put("juice", new Word("juice", inflKeys, infls));
		lex.put("water", new Word("water", inflKeys, infls));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp+hai", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp+hai", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp+hai", solex);

		// Male vs nonmale subject agreement
		lex = new HashMap<String, Word>();
		lex.put("alice", new Word("alice", "class", NounClass.NONMALE));
		lex.put("bob", new Word("bob", "class", NounClass.MALE));
		lex.put("eve", new Word("eve", "class", NounClass.NONMALE));
		lex.put("mallory", new Word("mallory", "class", NounClass.NONMALE));
		lex.put("trent", new Word("trent", "class", NounClass.MALE));
		lex.put("apple", new Word("apple", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("bread", new Word("bread", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("cake", new Word("cake", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("rice", new Word("rice", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("coffee", new Word("coffee", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("cola", new Word("cola", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("juice", new Word("juice", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("water", new Word("water", "class", randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})));
		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-mnm", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-mnm", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-mnm", solex);

		// 1st/2nd/3rd person + Singular/plural_two agreement + MNM agr
		lex = new HashMap<String, Word>();
		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.NONMALE};
		lex.put("alice", new Word("alice", inflKeys, infls));
		lex.put("eve", new Word("eve", inflKeys, infls));
		lex.put("mallory", new Word("mallory", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, NounClass.MALE};
		lex.put("bob", new Word("bob", inflKeys, infls));
		lex.put("trent", new Word("trent", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("apple", new Word("apple", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("bread", new Word("bread", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("cake", new Word("cake", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("rice", new Word("rice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("coffee", new Word("coffee", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("cola", new Word("cola", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("juice", new Word("juice", inflKeys, infls));

		infls = new Enum[]{Person.THIRD, Number.SINGULAR, randomNClass(new NounClass[] {NounClass.MALE, NounClass.NONMALE})};
		lex.put("water", new Word("water", inflKeys, infls));

		lex.put("drink", new Word("drink", "subj", al));
		lex.get("drink").agree("obj", al);
		lex.put("eat", new Word("eat", "subj", al));
		lex.get("eat").agree("obj", al);
		lexicons.put("s-123+sp+mnm", lex);

		olex = (HashMap<String, Word>) lex.clone();
		olex.put("drink", new Word("drink", "subj", al));
		olex.get("drink").agree("obj", al);
		olex.put("eat", new Word("eat", "subj", al));
		olex.get("eat").agree("obj", al);
		lexicons.put("o-123+sp+mnm", olex);

		solex = (HashMap<String, Word>) lex.clone();
		solex.put("drink", new Word("drink", "subj", al));
		solex.get("drink").agree("obj", al);
		solex.put("eat", new Word("eat", "subj", al));
		solex.get("eat").agree("obj", al);
		lexicons.put("so-123+sp+mnm", solex);
					
		return lexicons;
	}
}
