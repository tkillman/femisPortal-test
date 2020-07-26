package com.femis.fctry.cmmn.model;

import java.util.List;

import org.apache.ibatis.type.Alias;

import com.femis.common.model.FileVO;

@Alias("fctryCmmnVO")
public class FctryCmmnVO {

	public String getMyfctryonYn() {
		return myfctryonYn;
	}

	public void setMyfctryonYn(String myfctryonYn) {
		this.myfctryonYn = myfctryonYn;
	}

	public String getPrdctnFcltyTotalCnt() {
		return prdctnFcltyTotalCnt;
	}

	public void setPrdctnFcltyTotalCnt(String prdctnFcltyTotalCnt) {
		this.prdctnFcltyTotalCnt = prdctnFcltyTotalCnt;
	}

	public String getFileIndex() {
		return fileIndex;
	}

	public void setFileIndex(String fileIndex) {
		this.fileIndex = fileIndex;
	}

	public String getPageType() {
		return pageType;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

	public String getMinwonTitle() {
		return minwonTitle;
	}

	public void setMinwonTitle(String minwonTitle) {
		this.minwonTitle = minwonTitle;
	}

	public String getMinwonDesc() {
		return minwonDesc;
	}

	public void setMinwonDesc(String minwonDesc) {
		this.minwonDesc = minwonDesc;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getImsiYn() {
		return imsiYn;
	}

	public void setImsiYn(String imsiYn) {
		this.imsiYn = imsiYn;
	}

	public List<FileVO> getResultFile() {
		return resultFile;
	}

	public void setResultFile(List<FileVO> resultFile) {
		this.resultFile = resultFile;
	}

	public String getFctryManageNo() {
		return fctryManageNo;
	}

	public void setFctryManageNo(String fctryManageNo) {
		this.fctryManageNo = fctryManageNo;
	}

	public String getCvplManageNo() {
		return cvplManageNo;
	}

	public void setCvplManageNo(String cvplManageNo) {
		this.cvplManageNo = cvplManageNo;
	}

	public String getCvplManageNoPrev() {
		return cvplManageNoPrev;
	}

	public void setCvplManageNoPrev(String cvplManageNoPrev) {
		this.cvplManageNoPrev = cvplManageNoPrev;
	}

	public String getMnfctyrFcltyGbn() {
		return mnfctyrFcltyGbn;
	}

	public void setMnfctyrFcltyGbn(String mnfctyrFcltyGbn) {
		this.mnfctyrFcltyGbn = mnfctyrFcltyGbn;
	}

	public String getConfmRegistGbn() {
		return confmRegistGbn;
	}

	public void setConfmRegistGbn(String confmRegistGbn) {
		this.confmRegistGbn = confmRegistGbn;
	}

	public String getCvplProgrsSttusCode() {
		return cvplProgrsSttusCode;
	}

	public void setCvplProgrsSttusCode(String cvplProgrsSttusCode) {
		this.cvplProgrsSttusCode = cvplProgrsSttusCode;
	}

	public String getFctryProgrsSttusCode() {
		return fctryProgrsSttusCode;
	}

	public void setFctryProgrsSttusCode(String fctryProgrsSttusCode) {
		this.fctryProgrsSttusCode = fctryProgrsSttusCode;
	}

	public String getFctryTyCode() {
		return fctryTyCode;
	}

	public void setFctryTyCode(String fctryTyCode) {
		this.fctryTyCode = fctryTyCode;
	}

	public String getBsnsTyCode() {
		return bsnsTyCode;
	}

	public void setBsnsTyCode(String bsnsTyCode) {
		this.bsnsTyCode = bsnsTyCode;
	}

	public String getAdresFacListArr() {
		return adresFacListArr;
	}

	public void setAdresFacListArr(String adresFacListArr) {
		this.adresFacListArr = adresFacListArr;
	}

	public String getFctryAdresFirst() {
		return fctryAdresFirst;
	}

	public void setFctryAdresFirst(String fctryAdresFirst) {
		this.fctryAdresFirst = fctryAdresFirst;
	}

	public String getMberId() {
		return mberId;
	}

	public void setMberId(String mberId) {
		this.mberId = mberId;
	}

	public String getCmpnyNm() {
		return cmpnyNm;
	}

	public void setCmpnyNm(String cmpnyNm) {
		this.cmpnyNm = cmpnyNm;
	}

	public String getEmplyrIdntfcNo() {
		return emplyrIdntfcNo;
	}

	public void setEmplyrIdntfcNo(String emplyrIdntfcNo) {
		this.emplyrIdntfcNo = emplyrIdntfcNo;
	}

	public String getBizrno() {
		return bizrno;
	}

	public void setBizrno(String bizrno) {
		this.bizrno = bizrno;
	}

	public String getRprsntvNm() {
		return rprsntvNm;
	}

	public void setRprsntvNm(String rprsntvNm) {
		this.rprsntvNm = rprsntvNm;
	}

	public String getRprsntvBrthdy() {
		return rprsntvBrthdy;
	}

	public void setRprsntvBrthdy(String rprsntvBrthdy) {
		this.rprsntvBrthdy = rprsntvBrthdy;
	}

	public String getCmpnyTelno() {
		return cmpnyTelno;
	}

	public void setCmpnyTelno(String cmpnyTelno) {
		this.cmpnyTelno = cmpnyTelno;
	}

	public String getCmpnyFxnum() {
		return cmpnyFxnum;
	}

	public void setCmpnyFxnum(String cmpnyFxnum) {
		this.cmpnyFxnum = cmpnyFxnum;
	}

	public String getCorpAddr() {
		return corpAddr;
	}

	public void setCorpAddr(String corpAddr) {
		this.corpAddr = corpAddr;
	}

	public String getFctryAddr() {
		return fctryAddr;
	}

	public void setFctryAddr(String fctryAddr) {
		this.fctryAddr = fctryAddr;
	}

	public String getArrFctryAdresList() {
		return arrFctryAdresList;
	}

	public void setArrFctryAdresList(String arrFctryAdresList) {
		this.arrFctryAdresList = arrFctryAdresList;
	}

	public String getFondConfmNo() {
		return fondConfmNo;
	}

	public void setFondConfmNo(String fondConfmNo) {
		this.fondConfmNo = fondConfmNo;
	}

	public String getIndutyListArr() {
		return indutyListArr;
	}

	public void setIndutyListArr(String indutyListArr) {
		this.indutyListArr = indutyListArr;
	}

	public String getIndutyCode() {
		return indutyCode;
	}

	public void setIndutyCode(String indutyCode) {
		this.indutyCode = indutyCode;
	}

	public String getReprsntIndutyAt() {
		return reprsntIndutyAt;
	}

	public void setReprsntIndutyAt(String reprsntIndutyAt) {
		this.reprsntIndutyAt = reprsntIndutyAt;
	}

	public String getCodeCnvrAt() {
		return codeCnvrAt;
	}

	public void setCodeCnvrAt(String codeCnvrAt) {
		this.codeCnvrAt = codeCnvrAt;
	}

	public String getIndutyOdr() {
		return indutyOdr;
	}

	public void setIndutyOdr(String indutyOdr) {
		this.indutyOdr = indutyOdr;
	}

	public String getProcessDgrmAtchmnflSn() {
		return processDgrmAtchmnflSn;
	}

	public void setProcessDgrmAtchmnflSn(String processDgrmAtchmnflSn) {
		this.processDgrmAtchmnflSn = processDgrmAtchmnflSn;
	}

	public String getPrdctnProcessDgrmCn() {
		return prdctnProcessDgrmCn;
	}

	public void setPrdctnProcessDgrmCn(String prdctnProcessDgrmCn) {
		this.prdctnProcessDgrmCn = prdctnProcessDgrmCn;
	}

	public String getIndutyNm() {
		return indutyNm;
	}

	public void setIndutyNm(String indutyNm) {
		this.indutyNm = indutyNm;
	}

	public String getUptodeIndutyListArr() {
		return uptodeIndutyListArr;
	}

	public void setUptodeIndutyListArr(String uptodeIndutyListArr) {
		this.uptodeIndutyListArr = uptodeIndutyListArr;
	}

	public String getUptodeIndutyCode() {
		return uptodeIndutyCode;
	}

	public void setUptodeIndutyCode(String uptodeIndutyCode) {
		this.uptodeIndutyCode = uptodeIndutyCode;
	}

	public String getMainProductCn() {
		return mainProductCn;
	}

	public void setMainProductCn(String mainProductCn) {
		this.mainProductCn = mainProductCn;
	}

	public String getEmployeesTotal() {
		return employeesTotal;
	}

	public void setEmployeesTotal(String employeesTotal) {
		this.employeesTotal = employeesTotal;
	}

	public String getMaleEmplyCo() {
		return maleEmplyCo;
	}

	public void setMaleEmplyCo(String maleEmplyCo) {
		this.maleEmplyCo = maleEmplyCo;
	}

	public String getFemaleEmplyCo() {
		return femaleEmplyCo;
	}

	public void setFemaleEmplyCo(String femaleEmplyCo) {
		this.femaleEmplyCo = femaleEmplyCo;
	}

	public String getFrgnrMaleEmplyCo() {
		return frgnrMaleEmplyCo;
	}

	public void setFrgnrMaleEmplyCo(String frgnrMaleEmplyCo) {
		this.frgnrMaleEmplyCo = frgnrMaleEmplyCo;
	}

	public String getFrgnrFemaleEmplyCo() {
		return frgnrFemaleEmplyCo;
	}

	public void setFrgnrFemaleEmplyCo(String frgnrFemaleEmplyCo) {
		this.frgnrFemaleEmplyCo = frgnrFemaleEmplyCo;
	}

	public String getComptPrearngeDe() {
		return comptPrearngeDe;
	}

	public void setComptPrearngeDe(String comptPrearngeDe) {
		this.comptPrearngeDe = comptPrearngeDe;
	}

	public String getFctryPlotAr() {
		return fctryPlotAr;
	}

	public void setFctryPlotAr(String fctryPlotAr) {
		this.fctryPlotAr = fctryPlotAr;
	}

	public String getMnfcturFcltyAr() {
		return mnfcturFcltyAr;
	}

	public void setMnfcturFcltyAr(String mnfcturFcltyAr) {
		this.mnfcturFcltyAr = mnfcturFcltyAr;
	}

	public String getSbrsAr() {
		return sbrsAr;
	}

	public void setSbrsAr(String sbrsAr) {
		this.sbrsAr = sbrsAr;
	}

	public String getStdrFctryArrt() {
		return stdrFctryArrt;
	}

	public void setStdrFctryArrt(String stdrFctryArrt) {
		this.stdrFctryArrt = stdrFctryArrt;
	}

	public String getPrdctnFcltyNm() {
		return prdctnFcltyNm;
	}

	public void setPrdctnFcltyNm(String prdctnFcltyNm) {
		this.prdctnFcltyNm = prdctnFcltyNm;
	}

	public String getPrdctnFcltyQy() {
		return prdctnFcltyQy;
	}

	public void setPrdctnFcltyQy(String prdctnFcltyQy) {
		this.prdctnFcltyQy = prdctnFcltyQy;
	}

	public String getCpctyStdrDc() {
		return cpctyStdrDc;
	}

	public void setCpctyStdrDc(String cpctyStdrDc) {
		this.cpctyStdrDc = cpctyStdrDc;
	}

	public String getPrdctnFcltyCo() {
		return prdctnFcltyCo;
	}

	public void setPrdctnFcltyCo(String prdctnFcltyCo) {
		this.prdctnFcltyCo = prdctnFcltyCo;
	}

	public String getExhstSeCode() {
		return exhstSeCode;
	}

	public void setExhstSeCode(String exhstSeCode) {
		this.exhstSeCode = exhstSeCode;
	}

	public String getPrdctnFcltyExhstCn() {
		return prdctnFcltyExhstCn;
	}

	public void setPrdctnFcltyExhstCn(String prdctnFcltyExhstCn) {
		this.prdctnFcltyExhstCn = prdctnFcltyExhstCn;
	}

	public String getPrvnFcltyCn() {
		return prvnFcltyCn;
	}

	public void setPrvnFcltyCn(String prvnFcltyCn) {
		this.prvnFcltyCn = prvnFcltyCn;
	}

	public String getPassingData() {
		return passingData;
	}

	public void setPassingData(String passingData) {
		this.passingData = passingData;
	}

	public String getOnlineRceptSeCode() {
		return onlineRceptSeCode;
	}

	public void setOnlineRceptSeCode(String onlineRceptSeCode) {
		this.onlineRceptSeCode = onlineRceptSeCode;
	}

	public String getNusysRceptNo() {
		return nusysRceptNo;
	}

	public void setNusysRceptNo(String nusysRceptNo) {
		this.nusysRceptNo = nusysRceptNo;
	}

	public String getNusysRceptDe() {
		return nusysRceptDe;
	}

	public void setNusysRceptDe(String nusysRceptDe) {
		this.nusysRceptDe = nusysRceptDe;
	}

	public String getCvplTmlmtDe() {
		return cvplTmlmtDe;
	}

	public void setCvplTmlmtDe(String cvplTmlmtDe) {
		this.cvplTmlmtDe = cvplTmlmtDe;
	}

	public String getNusysApplcntMbtlnumEncpt() {
		return nusysApplcntMbtlnumEncpt;
	}

	public void setNusysApplcntMbtlnumEncpt(String nusysApplcntMbtlnumEncpt) {
		this.nusysApplcntMbtlnumEncpt = nusysApplcntMbtlnumEncpt;
	}

	public String getNusysApplcntNm() {
		return nusysApplcntNm;
	}

	public void setNusysApplcntNm(String nusysApplcntNm) {
		this.nusysApplcntNm = nusysApplcntNm;
	}

	public String getVrscInsttNm() {
		return vrscInsttNm;
	}

	public void setVrscInsttNm(String vrscInsttNm) {
		this.vrscInsttNm = vrscInsttNm;
	}

	public String getVrscEmplyrIdntfcNo() {
		return vrscEmplyrIdntfcNo;
	}

	public void setVrscEmplyrIdntfcNo(String vrscEmplyrIdntfcNo) {
		this.vrscEmplyrIdntfcNo = vrscEmplyrIdntfcNo;
	}

	public String getReqstDe() {
		return reqstDe;
	}

	public void setReqstDe(String reqstDe) {
		this.reqstDe = reqstDe;
	}

	public String getCvplResultSeCode() {
		return cvplResultSeCode;
	}

	public void setCvplResultSeCode(String cvplResultSeCode) {
		this.cvplResultSeCode = cvplResultSeCode;
	}

	public String getEmplyrSeCode() {
		return emplyrSeCode;
	}

	public void setEmplyrSeCode(String emplyrSeCode) {
		this.emplyrSeCode = emplyrSeCode;
	}

	public String getChangeCvplSeCode() {
		return changeCvplSeCode;
	}

	public void setChangeCvplSeCode(String changeCvplSeCode) {
		this.changeCvplSeCode = changeCvplSeCode;
	}

	public String getComptCvplManageNo() {
		return comptCvplManageNo;
	}

	public void setComptCvplManageNo(String comptCvplManageNo) {
		this.comptCvplManageNo = comptCvplManageNo;
	}

	public String getNusysApplcntEmladrEncpt() {
		return nusysApplcntEmladrEncpt;
	}

	public void setNusysApplcntEmladrEncpt(String nusysApplcntEmladrEncpt) {
		this.nusysApplcntEmladrEncpt = nusysApplcntEmladrEncpt;
	}

	public String getReqstMberId() {
		return reqstMberId;
	}

	public void setReqstMberId(String reqstMberId) {
		this.reqstMberId = reqstMberId;
	}

	public String getPsitnOrgnztCode() {
		return psitnOrgnztCode;
	}

	public void setPsitnOrgnztCode(String psitnOrgnztCode) {
		this.psitnOrgnztCode = psitnOrgnztCode;
	}

	public String getCvplSeCode() {
		return cvplSeCode;
	}

	public void setCvplSeCode(String cvplSeCode) {
		this.cvplSeCode = cvplSeCode;
	}

	public String getCvplChargerId() {
		return cvplChargerId;
	}

	public void setCvplChargerId(String cvplChargerId) {
		this.cvplChargerId = cvplChargerId;
	}

	public String getSptExaminChargerId() {
		return sptExaminChargerId;
	}

	public void setSptExaminChargerId(String sptExaminChargerId) {
		this.sptExaminChargerId = sptExaminChargerId;
	}

	public String getSptExaminProcessDt() {
		return sptExaminProcessDt;
	}

	public void setSptExaminProcessDt(String sptExaminProcessDt) {
		this.sptExaminProcessDt = sptExaminProcessDt;
	}

	public String getSptExaminSttusCode() {
		return sptExaminSttusCode;
	}

	public void setSptExaminSttusCode(String sptExaminSttusCode) {
		this.sptExaminSttusCode = sptExaminSttusCode;
	}

	public String getSptExaminResultCn() {
		return sptExaminResultCn;
	}

	public void setSptExaminResultCn(String sptExaminResultCn) {
		this.sptExaminResultCn = sptExaminResultCn;
	}

	public String getSptExaminAtchmnflSn() {
		return sptExaminAtchmnflSn;
	}

	public void setSptExaminAtchmnflSn(String sptExaminAtchmnflSn) {
		this.sptExaminAtchmnflSn = sptExaminAtchmnflSn;
	}

	public String getEtcCvplReqstDe() {
		return etcCvplReqstDe;
	}

	public void setEtcCvplReqstDe(String etcCvplReqstDe) {
		this.etcCvplReqstDe = etcCvplReqstDe;
	}

	public String getBsnsChangeCvplManageNo() {
		return bsnsChangeCvplManageNo;
	}

	public void setBsnsChangeCvplManageNo(String bsnsChangeCvplManageNo) {
		this.bsnsChangeCvplManageNo = bsnsChangeCvplManageNo;
	}

	public String getUpdtResn() {
		return updtResn;
	}

	public void setUpdtResn(String updtResn) {
		this.updtResn = updtResn;
	}

	public String getIrsttSeCode() {
		return irsttSeCode;
	}

	public void setIrsttSeCode(String irsttSeCode) {
		this.irsttSeCode = irsttSeCode;
	}

	public String getIrsttOrgnztCode() {
		return irsttOrgnztCode;
	}

	public void setIrsttOrgnztCode(String irsttOrgnztCode) {
		this.irsttOrgnztCode = irsttOrgnztCode;
	}

	public String getIrsttVrscCn() {
		return irsttVrscCn;
	}

	public void setIrsttVrscCn(String irsttVrscCn) {
		this.irsttVrscCn = irsttVrscCn;
	}

	public String getAtmcHistCvplManageNo() {
		return atmcHistCvplManageNo;
	}

	public void setAtmcHistCvplManageNo(String atmcHistCvplManageNo) {
		this.atmcHistCvplManageNo = atmcHistCvplManageNo;
	}

	public String getCnsltDiaryNo() {
		return cnsltDiaryNo;
	}

	public void setCnsltDiaryNo(String cnsltDiaryNo) {
		this.cnsltDiaryNo = cnsltDiaryNo;
	}

	public String getVrscReqstManageNo() {
		return vrscReqstManageNo;
	}

	public void setVrscReqstManageNo(String vrscReqstManageNo) {
		this.vrscReqstManageNo = vrscReqstManageNo;
	}

	public String getRceptCvplManageNo() {
		return rceptCvplManageNo;
	}

	public void setRceptCvplManageNo(String rceptCvplManageNo) {
		this.rceptCvplManageNo = rceptCvplManageNo;
	}

	public String getConfmRegistSeCode() {
		return confmRegistSeCode;
	}

	public void setConfmRegistSeCode(String confmRegistSeCode) {
		this.confmRegistSeCode = confmRegistSeCode;
	}

	public String getFondChangeReqstCn() {
		return fondChangeReqstCn;
	}

	public void setFondChangeReqstCn(String fondChangeReqstCn) {
		this.fondChangeReqstCn = fondChangeReqstCn;
	}

	public String getChangeSttemntReqstDe() {
		return changeSttemntReqstDe;
	}

	public void setChangeSttemntReqstDe(String changeSttemntReqstDe) {
		this.changeSttemntReqstDe = changeSttemntReqstDe;
	}

	public String getChangeSttemntConfmDe() {
		return changeSttemntConfmDe;
	}

	public void setChangeSttemntConfmDe(String changeSttemntConfmDe) {
		this.changeSttemntConfmDe = changeSttemntConfmDe;
	}

	public String getCvplSanctnSttusCode() {
		return cvplSanctnSttusCode;
	}

	public void setCvplSanctnSttusCode(String cvplSanctnSttusCode) {
		this.cvplSanctnSttusCode = cvplSanctnSttusCode;
	}

	public String getCvplChrgOrgnztCode() {
		return cvplChrgOrgnztCode;
	}

	public void setCvplChrgOrgnztCode(String cvplChrgOrgnztCode) {
		this.cvplChrgOrgnztCode = cvplChrgOrgnztCode;
	}

	public String getFondConfmTyCode() {
		return fondConfmTyCode;
	}

	public void setFondConfmTyCode(String fondConfmTyCode) {
		this.fondConfmTyCode = fondConfmTyCode;
	}

	public String getFondConfmDe() {
		return fondConfmDe;
	}

	public void setFondConfmDe(String fondConfmDe) {
		this.fondConfmDe = fondConfmDe;
	}

	public String getFctryRegistTyCode() {
		return fctryRegistTyCode;
	}

	public void setFctryRegistTyCode(String fctryRegistTyCode) {
		this.fctryRegistTyCode = fctryRegistTyCode;
	}

	public String getFctryRegistNo() {
		return fctryRegistNo;
	}

	public void setFctryRegistNo(String fctryRegistNo) {
		this.fctryRegistNo = fctryRegistNo;
	}

	public String getFctryRegistDe() {
		return fctryRegistDe;
	}

	public void setFctryRegistDe(String fctryRegistDe) {
		this.fctryRegistDe = fctryRegistDe;
	}

	public String getRegistCndSeCode() {
		return registCndSeCode;
	}

	public void setRegistCndSeCode(String registCndSeCode) {
		this.registCndSeCode = registCndSeCode;
	}

	public String getRegistCndAditCn() {
		return registCndAditCn;
	}

	public void setRegistCndAditCn(String registCndAditCn) {
		this.registCndAditCn = registCndAditCn;
	}

	public String getCndlRegistValidBeginDe() {
		return cndlRegistValidBeginDe;
	}

	public void setCndlRegistValidBeginDe(String cndlRegistValidBeginDe) {
		this.cndlRegistValidBeginDe = cndlRegistValidBeginDe;
	}

	public String getCndlRegistValidEndDe() {
		return cndlRegistValidEndDe;
	}

	public void setCndlRegistValidEndDe(String cndlRegistValidEndDe) {
		this.cndlRegistValidEndDe = cndlRegistValidEndDe;
	}

	public String getRegistChangeTyCode() {
		return registChangeTyCode;
	}

	public void setRegistChangeTyCode(String registChangeTyCode) {
		this.registChangeTyCode = registChangeTyCode;
	}

	public String getLastConfmRegistAt() {
		return lastConfmRegistAt;
	}

	public void setLastConfmRegistAt(String lastConfmRegistAt) {
		this.lastConfmRegistAt = lastConfmRegistAt;
	}

	public String getFrstFondConfmDe() {
		return frstFondConfmDe;
	}

	public void setFrstFondConfmDe(String frstFondConfmDe) {
		this.frstFondConfmDe = frstFondConfmDe;
	}

	public String getTmrAt() {
		return tmrAt;
	}

	public void setTmrAt(String tmrAt) {
		this.tmrAt = tmrAt;
	}

	public String getVnentrCrtfcObtainAt() {
		return vnentrCrtfcObtainAt;
	}

	public void setVnentrCrtfcObtainAt(String vnentrCrtfcObtainAt) {
		this.vnentrCrtfcObtainAt = vnentrCrtfcObtainAt;
	}

	public String getIsoCrtfcObtainAt() {
		return isoCrtfcObtainAt;
	}

	public void setIsoCrtfcObtainAt(String isoCrtfcObtainAt) {
		this.isoCrtfcObtainAt = isoCrtfcObtainAt;
	}

	public String getEtcObtainCrtfcCn() {
		return etcObtainCrtfcCn;
	}

	public void setEtcObtainCrtfcCn(String etcObtainCrtfcCn) {
		this.etcObtainCrtfcCn = etcObtainCrtfcCn;
	}

	public String getConfmCanclDe() {
		return confmCanclDe;
	}

	public void setConfmCanclDe(String confmCanclDe) {
		this.confmCanclDe = confmCanclDe;
	}

	public String getConfmCanclResn() {
		return confmCanclResn;
	}

	public void setConfmCanclResn(String confmCanclResn) {
		this.confmCanclResn = confmCanclResn;
	}

	public String getConfmCndFileSn() {
		return confmCndFileSn;
	}

	public void setConfmCndFileSn(String confmCndFileSn) {
		this.confmCndFileSn = confmCndFileSn;
	}

	public String getConfmCndCn() {
		return confmCndCn;
	}

	public void setConfmCndCn(String confmCndCn) {
		this.confmCndCn = confmCndCn;
	}

	public String getRegistCanclSeCode() {
		return registCanclSeCode;
	}

	public void setRegistCanclSeCode(String registCanclSeCode) {
		this.registCanclSeCode = registCanclSeCode;
	}

	public String getRegistCndCn() {
		return registCndCn;
	}

	public void setRegistCndCn(String registCndCn) {
		this.registCndCn = registCndCn;
	}

	public String getRegistCndFileSn() {
		return registCndFileSn;
	}

	public void setRegistCndFileSn(String registCndFileSn) {
		this.registCndFileSn = registCndFileSn;
	}

	public String getFctryTrnsfrAmount() {
		return fctryTrnsfrAmount;
	}

	public void setFctryTrnsfrAmount(String fctryTrnsfrAmount) {
		this.fctryTrnsfrAmount = fctryTrnsfrAmount;
	}

	public String getAtchmnflManageNo() {
		return atchmnflManageNo;
	}

	public void setAtchmnflManageNo(String atchmnflManageNo) {
		this.atchmnflManageNo = atchmnflManageNo;
	}

	public String getExcpAr() {
		return excpAr;
	}

	public void setExcpAr(String excpAr) {
		this.excpAr = excpAr;
	}

	public String getOprrt() {
		return oprrt;
	}

	public void setOprrt(String oprrt) {
		this.oprrt = oprrt;
	}

	public String getPlotEvlAmount() {
		return plotEvlAmount;
	}

	public void setPlotEvlAmount(String plotEvlAmount) {
		this.plotEvlAmount = plotEvlAmount;
	}

	public String getBuldEvlAmount() {
		return buldEvlAmount;
	}

	public void setBuldEvlAmount(String buldEvlAmount) {
		this.buldEvlAmount = buldEvlAmount;
	}

	public String getAcetYear() {
		return acetYear;
	}

	public void setAcetYear(String acetYear) {
		this.acetYear = acetYear;
	}

	public String getChangeCvplManageNo() {
		return changeCvplManageNo;
	}

	public void setChangeCvplManageNo(String changeCvplManageNo) {
		this.changeCvplManageNo = changeCvplManageNo;
	}

	public String getNonMfcrtrBsnsPrposCn() {
		return nonMfcrtrBsnsPrposCn;
	}

	public void setNonMfcrtrBsnsPrposCn(String nonMfcrtrBsnsPrposCn) {
		this.nonMfcrtrBsnsPrposCn = nonMfcrtrBsnsPrposCn;
	}

	public String getNonMfcrtrExpcEffectCn() {
		return nonMfcrtrExpcEffectCn;
	}

	public void setNonMfcrtrExpcEffectCn(String nonMfcrtrExpcEffectCn) {
		this.nonMfcrtrExpcEffectCn = nonMfcrtrExpcEffectCn;
	}

	public String getNonMfcrtrDetailBsnsCn() {
		return nonMfcrtrDetailBsnsCn;
	}

	public void setNonMfcrtrDetailBsnsCn(String nonMfcrtrDetailBsnsCn) {
		this.nonMfcrtrDetailBsnsCn = nonMfcrtrDetailBsnsCn;
	}

	public String getAllPlotAr() {
		return allPlotAr;
	}

	public void setAllPlotAr(String allPlotAr) {
		this.allPlotAr = allPlotAr;
	}

	public String getAllBuldAr() {
		return allBuldAr;
	}

	public void setAllBuldAr(String allBuldAr) {
		this.allBuldAr = allBuldAr;
	}

	public String getAllBuldTotAr() {
		return allBuldTotAr;
	}

	public void setAllBuldTotAr(String allBuldTotAr) {
		this.allBuldTotAr = allBuldTotAr;
	}

	public String getCvplSplemntSttusCode() {
		return cvplSplemntSttusCode;
	}

	public void setCvplSplemntSttusCode(String cvplSplemntSttusCode) {
		this.cvplSplemntSttusCode = cvplSplemntSttusCode;
	}

	public String getCvplResultOpinionCn() {
		return cvplResultOpinionCn;
	}

	public void setCvplResultOpinionCn(String cvplResultOpinionCn) {
		this.cvplResultOpinionCn = cvplResultOpinionCn;
	}

	public String getCvplResultAtchmnflSn() {
		return cvplResultAtchmnflSn;
	}

	public void setCvplResultAtchmnflSn(String cvplResultAtchmnflSn) {
		this.cvplResultAtchmnflSn = cvplResultAtchmnflSn;
	}

	public String getTrnsfrSttusCode() {
		return trnsfrSttusCode;
	}

	public void setTrnsfrSttusCode(String trnsfrSttusCode) {
		this.trnsfrSttusCode = trnsfrSttusCode;
	}

	public String getEtcCvplProcessDe() {
		return etcCvplProcessDe;
	}

	public void setEtcCvplProcessDe(String etcCvplProcessDe) {
		this.etcCvplProcessDe = etcCvplProcessDe;
	}

	public String getValidHistAt() {
		return validHistAt;
	}

	public void setValidHistAt(String validHistAt) {
		this.validHistAt = validHistAt;
	}

	public String getUpdtSeCode() {
		return updtSeCode;
	}

	public void setUpdtSeCode(String updtSeCode) {
		this.updtSeCode = updtSeCode;
	}

	public String getIpadrEncpt() {
		return ipadrEncpt;
	}

	public void setIpadrEncpt(String ipadrEncpt) {
		this.ipadrEncpt = ipadrEncpt;
	}

	public String getUseAt() {
		return useAt;
	}

	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}

	public String getFrstRegisterId() {
		return frstRegisterId;
	}

	public void setFrstRegisterId(String frstRegisterId) {
		this.frstRegisterId = frstRegisterId;
	}

	public String getFctryNm() {
		return fctryNm;
	}

	public void setFctryNm(String fctryNm) {
		this.fctryNm = fctryNm;
	}

	public String getIndvdlCprSeCode() {
		return indvdlCprSeCode;
	}

	public void setIndvdlCprSeCode(String indvdlCprSeCode) {
		this.indvdlCprSeCode = indvdlCprSeCode;
	}

	public String getRprsntvSexdstnSeCode() {
		return rprsntvSexdstnSeCode;
	}

	public void setRprsntvSexdstnSeCode(String rprsntvSexdstnSeCode) {
		this.rprsntvSexdstnSeCode = rprsntvSexdstnSeCode;
	}

	public String getFctryClAt() {
		return fctryClAt;
	}

	public void setFctryClAt(String fctryClAt) {
		this.fctryClAt = fctryClAt;
	}

	public String getFrnnSeCode() {
		return frnnSeCode;
	}

	public void setFrnnSeCode(String frnnSeCode) {
		this.frnnSeCode = frnnSeCode;
	}

	public String getIrsttCode() {
		return irsttCode;
	}

	public void setIrsttCode(String irsttCode) {
		this.irsttCode = irsttCode;
	}

	public String getLndcgrSeCode() {
		return lndcgrSeCode;
	}

	public void setLndcgrSeCode(String lndcgrSeCode) {
		this.lndcgrSeCode = lndcgrSeCode;
	}

	public String getSpfcSeCode() {
		return spfcSeCode;
	}

	public void setSpfcSeCode(String spfcSeCode) {
		this.spfcSeCode = spfcSeCode;
	}

	public String getOffmAr() {
		return offmAr;
	}

	public void setOffmAr(String offmAr) {
		this.offmAr = offmAr;
	}

	public String getWrhousAr() {
		return wrhousAr;
	}

	public void setWrhousAr(String wrhousAr) {
		this.wrhousAr = wrhousAr;
	}

	public String getMainRwmatrCn() {
		return mainRwmatrCn;
	}

	public void setMainRwmatrCn(String mainRwmatrCn) {
		this.mainRwmatrCn = mainRwmatrCn;
	}

	public String getHrzntltyPrjctnAr() {
		return hrzntltyPrjctnAr;
	}

	public void setHrzntltyPrjctnAr(String hrzntltyPrjctnAr) {
		this.hrzntltyPrjctnAr = hrzntltyPrjctnAr;
	}

	public String getMvmnFctryTyCode() {
		return mvmnFctryTyCode;
	}

	public void setMvmnFctryTyCode(String mvmnFctryTyCode) {
		this.mvmnFctryTyCode = mvmnFctryTyCode;
	}

	public String getMvmnFctryManageNo() {
		return mvmnFctryManageNo;
	}

	public void setMvmnFctryManageNo(String mvmnFctryManageNo) {
		this.mvmnFctryManageNo = mvmnFctryManageNo;
	}

	public String getMvmnCvplManageNo() {
		return mvmnCvplManageNo;
	}

	public void setMvmnCvplManageNo(String mvmnCvplManageNo) {
		this.mvmnCvplManageNo = mvmnCvplManageNo;
	}

	public String getMvmnFctrySeCode() {
		return mvmnFctrySeCode;
	}

	public void setMvmnFctrySeCode(String mvmnFctrySeCode) {
		this.mvmnFctrySeCode = mvmnFctrySeCode;
	}

	public String getMvmnFctryHistAt() {
		return mvmnFctryHistAt;
	}

	public void setMvmnFctryHistAt(String mvmnFctryHistAt) {
		this.mvmnFctryHistAt = mvmnFctryHistAt;
	}

	public String getBsnsBeginPrearngeDe() {
		return bsnsBeginPrearngeDe;
	}

	public void setBsnsBeginPrearngeDe(String bsnsBeginPrearngeDe) {
		this.bsnsBeginPrearngeDe = bsnsBeginPrearngeDe;
	}

	public String getBsnsBeginAt() {
		return bsnsBeginAt;
	}

	public void setBsnsBeginAt(String bsnsBeginAt) {
		this.bsnsBeginAt = bsnsBeginAt;
	}

	public String getComptDataAt() {
		return comptDataAt;
	}

	public void setComptDataAt(String comptDataAt) {
		this.comptDataAt = comptDataAt;
	}

	public String getLadUseRightCn() {
		return ladUseRightCn;
	}

	public void setLadUseRightCn(String ladUseRightCn) {
		this.ladUseRightCn = ladUseRightCn;
	}

	public String getCanclCn() {
		return canclCn;
	}

	public void setCanclCn(String canclCn) {
		this.canclCn = canclCn;
	}

	public String getChangeFctryManageNo() {
		return changeFctryManageNo;
	}

	public void setChangeFctryManageNo(String changeFctryManageNo) {
		this.changeFctryManageNo = changeFctryManageNo;
	}

	public String getEtcAr() {
		return etcAr;
	}

	public void setEtcAr(String etcAr) {
		this.etcAr = etcAr;
	}

	public String getFrstBsnsConfmBeginDe() {
		return frstBsnsConfmBeginDe;
	}

	public void setFrstBsnsConfmBeginDe(String frstBsnsConfmBeginDe) {
		this.frstBsnsConfmBeginDe = frstBsnsConfmBeginDe;
	}

	public String getMvmnIrsttAt() {
		return mvmnIrsttAt;
	}

	public void setMvmnIrsttAt(String mvmnIrsttAt) {
		this.mvmnIrsttAt = mvmnIrsttAt;
	}

	public String getLlxSetleAt() {
		return llxSetleAt;
	}

	public void setLlxSetleAt(String llxSetleAt) {
		this.llxSetleAt = llxSetleAt;
	}

	public String getIndvdlInfoPrcuseAgreAt() {
		return indvdlInfoPrcuseAgreAt;
	}

	public void setIndvdlInfoPrcuseAgreAt(String indvdlInfoPrcuseAgreAt) {
		this.indvdlInfoPrcuseAgreAt = indvdlInfoPrcuseAgreAt;
	}

	public String getNtdfnEntrpsAt() {
		return ntdfnEntrpsAt;
	}

	public void setNtdfnEntrpsAt(String ntdfnEntrpsAt) {
		this.ntdfnEntrpsAt = ntdfnEntrpsAt;
	}

	public String getStrwrkPrearngeDe() {
		return strwrkPrearngeDe;
	}

	public void setStrwrkPrearngeDe(String strwrkPrearngeDe) {
		this.strwrkPrearngeDe = strwrkPrearngeDe;
	}

	public String getStrwrkAt() {
		return strwrkAt;
	}

	public void setStrwrkAt(String strwrkAt) {
		this.strwrkAt = strwrkAt;
	}

	public String getComptDe() {
		return comptDe;
	}

	public void setComptDe(String comptDe) {
		this.comptDe = comptDe;
	}

	public String getOpertPrearngeDe() {
		return opertPrearngeDe;
	}

	public void setOpertPrearngeDe(String opertPrearngeDe) {
		this.opertPrearngeDe = opertPrearngeDe;
	}

	public String getFrstFctryRegistDe() {
		return frstFctryRegistDe;
	}

	public void setFrstFctryRegistDe(String frstFctryRegistDe) {
		this.frstFctryRegistDe = frstFctryRegistDe;
	}

	public String getFctryBsnsSttusCode() {
		return fctryBsnsSttusCode;
	}

	public void setFctryBsnsSttusCode(String fctryBsnsSttusCode) {
		this.fctryBsnsSttusCode = fctryBsnsSttusCode;
	}

	public String getFondTyCode() {
		return fondTyCode;
	}

	public void setFondTyCode(String fondTyCode) {
		this.fondTyCode = fondTyCode;
	}

	public String getFctryBuldSeCode() {
		return fctryBuldSeCode;
	}

	public void setFctryBuldSeCode(String fctryBuldSeCode) {
		this.fctryBuldSeCode = fctryBuldSeCode;
	}

	public String getAdministFctryManageNo() {
		return administFctryManageNo;
	}

	public void setAdministFctryManageNo(String administFctryManageNo) {
		this.administFctryManageNo = administFctryManageNo;
	}

	public String getKicFctryManageNo() {
		return kicFctryManageNo;
	}

	public void setKicFctryManageNo(String kicFctryManageNo) {
		this.kicFctryManageNo = kicFctryManageNo;
	}

	public String getKicFctryNm() {
		return KicFctryNm;
	}

	public void setKicFctryNm(String kicFctryNm) {
		KicFctryNm = kicFctryNm;
	}

	public String getPosesnFctryManageNo() {
		return posesnFctryManageNo;
	}

	public void setPosesnFctryManageNo(String posesnFctryManageNo) {
		this.posesnFctryManageNo = posesnFctryManageNo;
	}

	public String getTrnsfrFctryManageNo() {
		return trnsfrFctryManageNo;
	}

	public void setTrnsfrFctryManageNo(String trnsfrFctryManageNo) {
		this.trnsfrFctryManageNo = trnsfrFctryManageNo;
	}

	public String getMvnTyCode() {
		return mvnTyCode;
	}

	public void setMvnTyCode(String mvnTyCode) {
		this.mvnTyCode = mvnTyCode;
	}

	public String getHoldSeCode() {
		return holdSeCode;
	}

	public void setHoldSeCode(String holdSeCode) {
		this.holdSeCode = holdSeCode;
	}

	public String getFctryLndpclCo() {
		return fctryLndpclCo;
	}

	public void setFctryLndpclCo(String fctryLndpclCo) {
		this.fctryLndpclCo = fctryLndpclCo;
	}

	public String getDstrctSeCode() {
		return dstrctSeCode;
	}

	public void setDstrctSeCode(String dstrctSeCode) {
		this.dstrctSeCode = dstrctSeCode;
	}

	public String getGrntyAmount() {
		return grntyAmount;
	}

	public void setGrntyAmount(String grntyAmount) {
		this.grntyAmount = grntyAmount;
	}

	public String getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(String rentAmount) {
		this.rentAmount = rentAmount;
	}

	public String getCnfmPrmisnRegistNo() {
		return cnfmPrmisnRegistNo;
	}

	public void setCnfmPrmisnRegistNo(String cnfmPrmisnRegistNo) {
		this.cnfmPrmisnRegistNo = cnfmPrmisnRegistNo;
	}

	public String getRentTotMntncEntrpsCo() {
		return rentTotMntncEntrpsCo;
	}

	public void setRentTotMntncEntrpsCo(String rentTotMntncEntrpsCo) {
		this.rentTotMntncEntrpsCo = rentTotMntncEntrpsCo;
	}

	public String getRentBuldTotAr() {
		return rentBuldTotAr;
	}

	public void setRentBuldTotAr(String rentBuldTotAr) {
		this.rentBuldTotAr = rentBuldTotAr;
	}

	public String getSafeManageRspnberNm() {
		return safeManageRspnberNm;
	}

	public void setSafeManageRspnberNm(String safeManageRspnberNm) {
		this.safeManageRspnberNm = safeManageRspnberNm;
	}

	public String getSafeManageRspnberTelno() {
		return safeManageRspnberTelno;
	}

	public void setSafeManageRspnberTelno(String safeManageRspnberTelno) {
		this.safeManageRspnberTelno = safeManageRspnberTelno;
	}

	public String getSfmngActplnAtchAt() {
		return sfmngActplnAtchAt;
	}

	public void setSfmngActplnAtchAt(String sfmngActplnAtchAt) {
		this.sfmngActplnAtchAt = sfmngActplnAtchAt;
	}

	public String getVrscSeCode() {
		return vrscSeCode;
	}

	public void setVrscSeCode(String vrscSeCode) {
		this.vrscSeCode = vrscSeCode;
	}

	public String getRprsntvEmladrEncpt() {
		return rprsntvEmladrEncpt;
	}

	public void setRprsntvEmladrEncpt(String rprsntvEmladrEncpt) {
		this.rprsntvEmladrEncpt = rprsntvEmladrEncpt;
	}

	public String getRprsntvMbtlnumEncpt() {
		return rprsntvMbtlnumEncpt;
	}

	public void setRprsntvMbtlnumEncpt(String rprsntvMbtlnumEncpt) {
		this.rprsntvMbtlnumEncpt = rprsntvMbtlnumEncpt;
	}

	public String getRprsntvFxnum() {
		return rprsntvFxnum;
	}

	public void setRprsntvFxnum(String rprsntvFxnum) {
		this.rprsntvFxnum = rprsntvFxnum;
	}

	public String getHmpadr() {
		return hmpadr;
	}

	public void setHmpadr(String hmpadr) {
		this.hmpadr = hmpadr;
	}

	public String getGnrlPwrerEnergyUseQy() {
		return gnrlPwrerEnergyUseQy;
	}

	public void setGnrlPwrerEnergyUseQy(String gnrlPwrerEnergyUseQy) {
		this.gnrlPwrerEnergyUseQy = gnrlPwrerEnergyUseQy;
	}

	public String getPvtusePwrerEnergyUseQy() {
		return pvtusePwrerEnergyUseQy;
	}

	public void setPvtusePwrerEnergyUseQy(String pvtusePwrerEnergyUseQy) {
		this.pvtusePwrerEnergyUseQy = pvtusePwrerEnergyUseQy;
	}

	public String getLvlhUswtrEnergyUseQy() {
		return lvlhUswtrEnergyUseQy;
	}

	public void setLvlhUswtrEnergyUseQy(String lvlhUswtrEnergyUseQy) {
		this.lvlhUswtrEnergyUseQy = lvlhUswtrEnergyUseQy;
	}

	public String getIndustUswtrEnergyUseQy() {
		return industUswtrEnergyUseQy;
	}

	public void setIndustUswtrEnergyUseQy(String industUswtrEnergyUseQy) {
		this.industUswtrEnergyUseQy = industUswtrEnergyUseQy;
	}

	public String getPetrlumEnergyUseQy() {
		return petrlumEnergyUseQy;
	}

	public void setPetrlumEnergyUseQy(String petrlumEnergyUseQy) {
		this.petrlumEnergyUseQy = petrlumEnergyUseQy;
	}

	public String getGasEnergyUseQy() {
		return gasEnergyUseQy;
	}

	public void setGasEnergyUseQy(String gasEnergyUseQy) {
		this.gasEnergyUseQy = gasEnergyUseQy;
	}

	public String getEtcEnergyUseQy() {
		return etcEnergyUseQy;
	}

	public void setEtcEnergyUseQy(String etcEnergyUseQy) {
		this.etcEnergyUseQy = etcEnergyUseQy;
	}

	public String getFrgnrInvtAmount() {
		return frgnrInvtAmount;
	}

	public void setFrgnrInvtAmount(String frgnrInvtAmount) {
		this.frgnrInvtAmount = frgnrInvtAmount;
	}

	public String getFrgnrInvtrt() {
		return frgnrInvtrt;
	}

	public void setFrgnrInvtrt(String frgnrInvtrt) {
		this.frgnrInvtrt = frgnrInvtrt;
	}

	public String getEcptlAmount() {
		return ecptlAmount;
	}

	public void setEcptlAmount(String ecptlAmount) {
		this.ecptlAmount = ecptlAmount;
	}

	public String getOtherCaplAmount() {
		return otherCaplAmount;
	}

	public void setOtherCaplAmount(String otherCaplAmount) {
		this.otherCaplAmount = otherCaplAmount;
	}

	public String getCmpnyAssetsAmount() {
		return cmpnyAssetsAmount;
	}

	public void setCmpnyAssetsAmount(String cmpnyAssetsAmount) {
		this.cmpnyAssetsAmount = cmpnyAssetsAmount;
	}

	public String getCmpnyFondDe() {
		return cmpnyFondDe;
	}

	public void setCmpnyFondDe(String cmpnyFondDe) {
		this.cmpnyFondDe = cmpnyFondDe;
	}

	public String getPostngDgrmAtchmnflSn() {
		return postngDgrmAtchmnflSn;
	}

	public void setPostngDgrmAtchmnflSn(String postngDgrmAtchmnflSn) {
		this.postngDgrmAtchmnflSn = postngDgrmAtchmnflSn;
	}

	public String getDgrmAtchSeCode() {
		return dgrmAtchSeCode;
	}

	public void setDgrmAtchSeCode(String dgrmAtchSeCode) {
		this.dgrmAtchSeCode = dgrmAtchSeCode;
	}

	public String getBsnsBeginDe() {
		return bsnsBeginDe;
	}

	public void setBsnsBeginDe(String bsnsBeginDe) {
		this.bsnsBeginDe = bsnsBeginDe;
	}

	public String getWebNoticeAt() {
		return webNoticeAt;
	}

	public void setWebNoticeAt(String webNoticeAt) {
		this.webNoticeAt = webNoticeAt;
	}

	public String getFctryScaleSeCode() {
		return fctryScaleSeCode;
	}

	public void setFctryScaleSeCode(String fctryScaleSeCode) {
		this.fctryScaleSeCode = fctryScaleSeCode;
	}

	public String getArpltBplcSeCode() {
		return arpltBplcSeCode;
	}

	public void setArpltBplcSeCode(String arpltBplcSeCode) {
		this.arpltBplcSeCode = arpltBplcSeCode;
	}

	public String getWlttsBplcSeCode() {
		return wlttsBplcSeCode;
	}

	public void setWlttsBplcSeCode(String wlttsBplcSeCode) {
		this.wlttsBplcSeCode = wlttsBplcSeCode;
	}

	public String getFyerWaitExhstQy() {
		return fyerWaitExhstQy;
	}

	public void setFyerWaitExhstQy(String fyerWaitExhstQy) {
		this.fyerWaitExhstQy = fyerWaitExhstQy;
	}

	public String getQltwtrExhstQy() {
		return qltwtrExhstQy;
	}

	public void setQltwtrExhstQy(String qltwtrExhstQy) {
		this.qltwtrExhstQy = qltwtrExhstQy;
	}

	public String getNoiseVibratAt() {
		return noiseVibratAt;
	}

	public void setNoiseVibratAt(String noiseVibratAt) {
		this.noiseVibratAt = noiseVibratAt;
	}

	public String getUrbnFctryAt() {
		return urbnFctryAt;
	}

	public void setUrbnFctryAt(String urbnFctryAt) {
		this.urbnFctryAt = urbnFctryAt;
	}

	public String getBtlRt() {
		return btlRt;
	}

	public void setBtlRt(String btlRt) {
		this.btlRt = btlRt;
	}

	public String getMeasrmtrt() {
		return measrmtrt;
	}

	public void setMeasrmtrt(String measrmtrt) {
		this.measrmtrt = measrmtrt;
	}

	public String getFyerSelngAmount() {
		return fyerSelngAmount;
	}

	public void setFyerSelngAmount(String fyerSelngAmount) {
		this.fyerSelngAmount = fyerSelngAmount;
	}

	public String getFyerXportactAmount() {
		return fyerXportactAmount;
	}

	public void setFyerXportactAmount(String fyerXportactAmount) {
		this.fyerXportactAmount = fyerXportactAmount;
	}

	public String getManageSn() {
		return manageSn;
	}

	public void setManageSn(String manageSn) {
		this.manageSn = manageSn;
	}

	public String getAdresSeCode() {
		return adresSeCode;
	}

	public void setAdresSeCode(String adresSeCode) {
		this.adresSeCode = adresSeCode;
	}

	public String getAdresCode() {
		return adresCode;
	}

	public void setAdresCode(String adresCode) {
		this.adresCode = adresCode;
	}

	public String getAdresSn() {
		return adresSn;
	}

	public void setAdresSn(String adresSn) {
		this.adresSn = adresSn;
	}

	public String getReprsntAdresAt() {
		return reprsntAdresAt;
	}

	public void setReprsntAdresAt(String reprsntAdresAt) {
		this.reprsntAdresAt = reprsntAdresAt;
	}

	public String getRnCode() {
		return rnCode;
	}

	public void setRnCode(String rnCode) {
		this.rnCode = rnCode;
	}

	public String getCtprvnNm() {
		return ctprvnNm;
	}

	public void setCtprvnNm(String ctprvnNm) {
		this.ctprvnNm = ctprvnNm;
	}

	public String getSignguNm() {
		return signguNm;
	}

	public void setSignguNm(String signguNm) {
		this.signguNm = signguNm;
	}

	public String getEmdNm() {
		return emdNm;
	}

	public void setEmdNm(String emdNm) {
		this.emdNm = emdNm;
	}

	public String getLegalliNm() {
		return legalliNm;
	}

	public void setLegalliNm(String legalliNm) {
		this.legalliNm = legalliNm;
	}

	public String getRoadNm() {
		return roadNm;
	}

	public void setRoadNm(String roadNm) {
		this.roadNm = roadNm;
	}

	public String getUndgrndAt() {
		return undgrndAt;
	}

	public void setUndgrndAt(String undgrndAt) {
		this.undgrndAt = undgrndAt;
	}

	public String getBuldMnnmAdres() {
		return buldMnnmAdres;
	}

	public void setBuldMnnmAdres(String buldMnnmAdres) {
		this.buldMnnmAdres = buldMnnmAdres;
	}

	public String getBuldSlnoAdres() {
		return buldSlnoAdres;
	}

	public void setBuldSlnoAdres(String buldSlnoAdres) {
		this.buldSlnoAdres = buldSlnoAdres;
	}

	public String getMntnAt() {
		return mntnAt;
	}

	public void setMntnAt(String mntnAt) {
		this.mntnAt = mntnAt;
	}

	public String getMnnmAdres() {
		return mnnmAdres;
	}

	public void setMnnmAdres(String mnnmAdres) {
		this.mnnmAdres = mnnmAdres;
	}

	public String getSlnoAdres() {
		return slnoAdres;
	}

	public void setSlnoAdres(String slnoAdres) {
		this.slnoAdres = slnoAdres;
	}

	public String getEmdSn() {
		return emdSn;
	}

	public void setEmdSn(String emdSn) {
		this.emdSn = emdSn;
	}

	public String getWidthCrdnt() {
		return widthCrdnt;
	}

	public void setWidthCrdnt(String widthCrdnt) {
		this.widthCrdnt = widthCrdnt;
	}

	public String getVrticlCrdnt() {
		return vrticlCrdnt;
	}

	public void setVrticlCrdnt(String vrticlCrdnt) {
		this.vrticlCrdnt = vrticlCrdnt;
	}

	public String getMntnAdres() {
		return mntnAdres;
	}

	public void setMntnAdres(String mntnAdres) {
		this.mntnAdres = mntnAdres;
	}

	public String getLnbrAdres() {
		return lnbrAdres;
	}

	public void setLnbrAdres(String lnbrAdres) {
		this.lnbrAdres = lnbrAdres;
	}

	public String getHoAdres() {
		return hoAdres;
	}

	public void setHoAdres(String hoAdres) {
		this.hoAdres = hoAdres;
	}

	public String getBlckAdres() {
		return blckAdres;
	}

	public void setBlckAdres(String blckAdres) {
		this.blckAdres = blckAdres;
	}

	public String getSpclAdres() {
		return spclAdres;
	}

	public void setSpclAdres(String spclAdres) {
		this.spclAdres = spclAdres;
	}

	public String getSpclDongAdres() {
		return spclDongAdres;
	}

	public void setSpclDongAdres(String spclDongAdres) {
		this.spclDongAdres = spclDongAdres;
	}

	public String getSpclHoAdres() {
		return spclHoAdres;
	}

	public void setSpclHoAdres(String spclHoAdres) {
		this.spclHoAdres = spclHoAdres;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getKicDongAdres() {
		return kicDongAdres;
	}

	public void setKicDongAdres(String kicDongAdres) {
		this.kicDongAdres = kicDongAdres;
	}

	public String getKicFloorAdres() {
		return kicFloorAdres;
	}

	public void setKicFloorAdres(String kicFloorAdres) {
		this.kicFloorAdres = kicFloorAdres;
	}

	public String getKicHoAdres() {
		return kicHoAdres;
	}

	public void setKicHoAdres(String kicHoAdres) {
		this.kicHoAdres = kicHoAdres;
	}

	public String getFctryLndpclAr() {
		return fctryLndpclAr;
	}

	public void setFctryLndpclAr(String fctryLndpclAr) {
		this.fctryLndpclAr = fctryLndpclAr;
	}

	public String getBuldManageNo() {
		return buldManageNo;
	}

	public void setBuldManageNo(String buldManageNo) {
		this.buldManageNo = buldManageNo;
	}

	public String getRnAdres() {
		return rnAdres;
	}

	public void setRnAdres(String rnAdres) {
		this.rnAdres = rnAdres;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getFrstRegistDt() {
		return frstRegistDt;
	}

	public void setFrstRegistDt(String frstRegistDt) {
		this.frstRegistDt = frstRegistDt;
	}

	public String getLastUpdusrId() {
		return lastUpdusrId;
	}

	public void setLastUpdusrId(String lastUpdusrId) {
		this.lastUpdusrId = lastUpdusrId;
	}

	public String getLastUpdtDt() {
		return lastUpdtDt;
	}

	public void setLastUpdtDt(String lastUpdtDt) {
		this.lastUpdtDt = lastUpdtDt;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLndpclSn() {
		return lndpclSn;
	}

	public void setLndpclSn(String lndpclSn) {
		this.lndpclSn = lndpclSn;
	}

	public String getManageClCode() {
		return manageClCode;
	}

	public void setManageClCode(String manageClCode) {
		this.manageClCode = manageClCode;
	}

	public String getManageSeCode() {
		return manageSeCode;
	}

	public void setManageSeCode(String manageSeCode) {
		this.manageSeCode = manageSeCode;
	}

	public String getSpcfcSeCode() {
		return spcfcSeCode;
	}

	public void setSpcfcSeCode(String spcfcSeCode) {
		this.spcfcSeCode = spcfcSeCode;
	}

	public String getReprsntDataAt() {
		return reprsntDataAt;
	}

	public void setReprsntDataAt(String reprsntDataAt) {
		this.reprsntDataAt = reprsntDataAt;
	}

	public String getEtcCn() {
		return etcCn;
	}

	public void setEtcCn(String etcCn) {
		this.etcCn = etcCn;
	}

	public String getMoveFctryAddr() {
		return moveFctryAddr;
	}

	public void setMoveFctryAddr(String moveFctryAddr) {
		this.moveFctryAddr = moveFctryAddr;
	}

	public String getWthdrwReason() {
		return wthdrwReason;
	}

	public void setWthdrwReason(String wthdrwReason) {
		this.wthdrwReason = wthdrwReason;
	}

	public String getFctryAdres() {
		return fctryAdres;
	}

	public void setFctryAdres(String fctryAdres) {
		this.fctryAdres = fctryAdres;
	}

	public String getJrsAdrCd() {
		return jrsAdrCd;
	}

	public void setJrsAdrCd(String jrsAdrCd) {
		this.jrsAdrCd = jrsAdrCd;
	}

	public String getCprAdres() {
		return cprAdres;
	}

	public void setCprAdres(String cprAdres) {
		this.cprAdres = cprAdres;
	}

	public String getCprNationType() {
		return cprNationType;
	}

	public void setCprNationType(String cprNationType) {
		this.cprNationType = cprNationType;
	}

	public String getCprGubun() {
		return cprGubun;
	}

	public void setCprGubun(String cprGubun) {
		this.cprGubun = cprGubun;
	}

	public String getCprZip() {
		return cprZip;
	}

	public void setCprZip(String cprZip) {
		this.cprZip = cprZip;
	}

	public String getCprPnuCd() {
		return cprPnuCd;
	}

	public void setCprPnuCd(String cprPnuCd) {
		this.cprPnuCd = cprPnuCd;
	}

	public String getCprCategory() {
		return cprCategory;
	}

	public void setCprCategory(String cprCategory) {
		this.cprCategory = cprCategory;
	}

	public String getCprJibunAddr() {
		return cprJibunAddr;
	}

	public void setCprJibunAddr(String cprJibunAddr) {
		this.cprJibunAddr = cprJibunAddr;
	}

	public String getCprAddrDetaill() {
		return cprAddrDetaill;
	}

	public void setCprAddrDetaill(String cprAddrDetaill) {
		this.cprAddrDetaill = cprAddrDetaill;
	}

	public String getCprRoadFullAddr() {
		return cprRoadFullAddr;
	}

	public void setCprRoadFullAddr(String cprRoadFullAddr) {
		this.cprRoadFullAddr = cprRoadFullAddr;
	}

	public String getCprCtprvnNm() {
		return cprCtprvnNm;
	}

	public void setCprCtprvnNm(String cprCtprvnNm) {
		this.cprCtprvnNm = cprCtprvnNm;
	}

	public String getCprSignguNm() {
		return cprSignguNm;
	}

	public void setCprSignguNm(String cprSignguNm) {
		this.cprSignguNm = cprSignguNm;
	}

	public String getCprEmdNm() {
		return cprEmdNm;
	}

	public void setCprEmdNm(String cprEmdNm) {
		this.cprEmdNm = cprEmdNm;
	}

	public String getCprAddrDetail() {
		return cprAddrDetail;
	}

	public void setCprAddrDetail(String cprAddrDetail) {
		this.cprAddrDetail = cprAddrDetail;
	}

	public String getCprKicDongAdres() {
		return cprKicDongAdres;
	}

	public void setCprKicDongAdres(String cprKicDongAdres) {
		this.cprKicDongAdres = cprKicDongAdres;
	}

	public String getCprKicFloorAdres() {
		return cprKicFloorAdres;
	}

	public void setCprKicFloorAdres(String cprKicFloorAdres) {
		this.cprKicFloorAdres = cprKicFloorAdres;
	}

	public String getCprKicHoAdres() {
		return cprKicHoAdres;
	}

	public void setCprKicHoAdres(String cprKicHoAdres) {
		this.cprKicHoAdres = cprKicHoAdres;
	}

	public String getMoveAdres() {
		return moveAdres;
	}

	public void setMoveAdres(String moveAdres) {
		this.moveAdres = moveAdres;
	}

	public String getMoveNationType() {
		return moveNationType;
	}

	public void setMoveNationType(String moveNationType) {
		this.moveNationType = moveNationType;
	}

	public String getMoveGubun() {
		return moveGubun;
	}

	public void setMoveGubun(String moveGubun) {
		this.moveGubun = moveGubun;
	}

	public String getMoveZip() {
		return moveZip;
	}

	public void setMoveZip(String moveZip) {
		this.moveZip = moveZip;
	}

	public String getMovePnuCd() {
		return movePnuCd;
	}

	public void setMovePnuCd(String movePnuCd) {
		this.movePnuCd = movePnuCd;
	}

	public String getMoveCategory() {
		return moveCategory;
	}

	public void setMoveCategory(String moveCategory) {
		this.moveCategory = moveCategory;
	}

	public String getMoveJibunAddr() {
		return moveJibunAddr;
	}

	public void setMoveJibunAddr(String moveJibunAddr) {
		this.moveJibunAddr = moveJibunAddr;
	}

	public String getMoveAddrDetaill() {
		return moveAddrDetaill;
	}

	public void setMoveAddrDetaill(String moveAddrDetaill) {
		this.moveAddrDetaill = moveAddrDetaill;
	}

	public String getMoveRoadFullAddr() {
		return moveRoadFullAddr;
	}

	public void setMoveRoadFullAddr(String moveRoadFullAddr) {
		this.moveRoadFullAddr = moveRoadFullAddr;
	}

	public String getMoveCtprvnNm() {
		return moveCtprvnNm;
	}

	public void setMoveCtprvnNm(String moveCtprvnNm) {
		this.moveCtprvnNm = moveCtprvnNm;
	}

	public String getMoveSignguNm() {
		return moveSignguNm;
	}

	public void setMoveSignguNm(String moveSignguNm) {
		this.moveSignguNm = moveSignguNm;
	}

	public String getMoveEmdNm() {
		return moveEmdNm;
	}

	public void setMoveEmdNm(String moveEmdNm) {
		this.moveEmdNm = moveEmdNm;
	}

	public String getMoveAddrDetail() {
		return moveAddrDetail;
	}

	public void setMoveAddrDetail(String moveAddrDetail) {
		this.moveAddrDetail = moveAddrDetail;
	}

	public String getBeforeFctryManageNo() {
		return beforeFctryManageNo;
	}

	public void setBeforeFctryManageNo(String beforeFctryManageNo) {
		this.beforeFctryManageNo = beforeFctryManageNo;
	}

	public String getBeforeFctrySeCode() {
		return beforeFctrySeCode;
	}

	public void setBeforeFctrySeCode(String beforeFctrySeCode) {
		this.beforeFctrySeCode = beforeFctrySeCode;
	}

	public String getBeforeCmpnyNm() {
		return beforeCmpnyNm;
	}

	public void setBeforeCmpnyNm(String beforeCmpnyNm) {
		this.beforeCmpnyNm = beforeCmpnyNm;
	}

	public String getBeforeRprsntvNm() {
		return beforeRprsntvNm;
	}

	public void setBeforeRprsntvNm(String beforeRprsntvNm) {
		this.beforeRprsntvNm = beforeRprsntvNm;
	}

	public String getBeforeFctryAdres() {
		return beforeFctryAdres;
	}

	public void setBeforeFctryAdres(String beforeFctryAdres) {
		this.beforeFctryAdres = beforeFctryAdres;
	}

	public String getBeforeIndutyCode() {
		return beforeIndutyCode;
	}

	public void setBeforeIndutyCode(String beforeIndutyCode) {
		this.beforeIndutyCode = beforeIndutyCode;
	}

	public String getBeforeUptodeIndutyCode() {
		return beforeUptodeIndutyCode;
	}

	public void setBeforeUptodeIndutyCode(String beforeUptodeIndutyCode) {
		this.beforeUptodeIndutyCode = beforeUptodeIndutyCode;
	}

	public String getBeforeFctryPlotAr() {
		return beforeFctryPlotAr;
	}

	public void setBeforeFctryPlotAr(String beforeFctryPlotAr) {
		this.beforeFctryPlotAr = beforeFctryPlotAr;
	}

	public String getBeforeMnfcturFcltyAr() {
		return beforeMnfcturFcltyAr;
	}

	public void setBeforeMnfcturFcltyAr(String beforeMnfcturFcltyAr) {
		this.beforeMnfcturFcltyAr = beforeMnfcturFcltyAr;
	}

	public String getBeforeSbrsAr() {
		return beforeSbrsAr;
	}

	public void setBeforeSbrsAr(String beforeSbrsAr) {
		this.beforeSbrsAr = beforeSbrsAr;
	}

	public String getEngCmpnyNm() {
		return engCmpnyNm;
	}

	public void setEngCmpnyNm(String engCmpnyNm) {
		this.engCmpnyNm = engCmpnyNm;
	}

	public String getEngRprsntvNm() {
		return engRprsntvNm;
	}

	public void setEngRprsntvNm(String engRprsntvNm) {
		this.engRprsntvNm = engRprsntvNm;
	}

	public String getEngRprsntvAdres() {
		return engRprsntvAdres;
	}

	public void setEngRprsntvAdres(String engRprsntvAdres) {
		this.engRprsntvAdres = engRprsntvAdres;
	}

	public String getEngAdres() {
		return engAdres;
	}

	public void setEngAdres(String engAdres) {
		this.engAdres = engAdres;
	}

	public String getEngLndcgrNm() {
		return engLndcgrNm;
	}

	public void setEngLndcgrNm(String engLndcgrNm) {
		this.engLndcgrNm = engLndcgrNm;
	}

	public String getEngIndutyNm() {
		return engIndutyNm;
	}

	public void setEngIndutyNm(String engIndutyNm) {
		this.engIndutyNm = engIndutyNm;
	}

	public String getEngRegistCndCn() {
		return engRegistCndCn;
	}

	public void setEngRegistCndCn(String engRegistCndCn) {
		this.engRegistCndCn = engRegistCndCn;
	}

	public String getEngCn() {
		return engCn;
	}

	public void setEngCn(String engCn) {
		this.engCn = engCn;
	}

	public String getEngIssuOrgnztNm() {
		return engIssuOrgnztNm;
	}

	public void setEngIssuOrgnztNm(String engIssuOrgnztNm) {
		this.engIssuOrgnztNm = engIssuOrgnztNm;
	}

	public String getHireCmpnyNm() {
		return hireCmpnyNm;
	}

	public void setHireCmpnyNm(String hireCmpnyNm) {
		this.hireCmpnyNm = hireCmpnyNm;
	}

	public String getHireReason() {
		return hireReason;
	}

	public void setHireReason(String hireReason) {
		this.hireReason = hireReason;
	}

	public String getRentBeginDe() {
		return rentBeginDe;
	}

	public void setRentBeginDe(String rentBeginDe) {
		this.rentBeginDe = rentBeginDe;
	}

	public String getRentEndDe() {
		return rentEndDe;
	}

	public void setRentEndDe(String rentEndDe) {
		this.rentEndDe = rentEndDe;
	}

	public String getSublsAt() {
		return sublsAt;
	}

	public void setSublsAt(String sublsAt) {
		this.sublsAt = sublsAt;
	}

	public String getInhtrnReason() {
		return inhtrnReason;
	}

	public void setInhtrnReason(String inhtrnReason) {
		this.inhtrnReason = inhtrnReason;
	}

	public String getDspsJobSeCode() {
		return dspsJobSeCode;
	}

	public void setDspsJobSeCode(String dspsJobSeCode) {
		this.dspsJobSeCode = dspsJobSeCode;
	}

	public String getApplcntNm() {
		return applcntNm;
	}

	public void setApplcntNm(String applcntNm) {
		this.applcntNm = applcntNm;
	}

	public String getInhrtnTrnsfrProcessAt() {
		return inhrtnTrnsfrProcessAt;
	}

	public void setInhrtnTrnsfrProcessAt(String inhrtnTrnsfrProcessAt) {
		this.inhrtnTrnsfrProcessAt = inhrtnTrnsfrProcessAt;
	}

	public String getHireRprsntvNm() {
		return hireRprsntvNm;
	}

	public void setHireRprsntvNm(String hireRprsntvNm) {
		this.hireRprsntvNm = hireRprsntvNm;
	}

	public String getHireCmpnyTelno() {
		return hireCmpnyTelno;
	}

	public void setHireCmpnyTelno(String hireCmpnyTelno) {
		this.hireCmpnyTelno = hireCmpnyTelno;
	}

	public String getHireEmplyrIdntfcNo() {
		return hireEmplyrIdntfcNo;
	}

	public void setHireEmplyrIdntfcNo(String hireEmplyrIdntfcNo) {
		this.hireEmplyrIdntfcNo = hireEmplyrIdntfcNo;
	}

	public String getHireCmpnyAdres() {
		return hireCmpnyAdres;
	}

	public void setHireCmpnyAdres(String hireCmpnyAdres) {
		this.hireCmpnyAdres = hireCmpnyAdres;
	}

	public String getBuldAr() {
		return buldAr;
	}

	public void setBuldAr(String buldAr) {
		this.buldAr = buldAr;
	}

	public String getRentPlotAr() {
		return rentPlotAr;
	}

	public void setRentPlotAr(String rentPlotAr) {
		this.rentPlotAr = rentPlotAr;
	}

	public String getRentBuldAr() {
		return rentBuldAr;
	}

	public void setRentBuldAr(String rentBuldAr) {
		this.rentBuldAr = rentBuldAr;
	}

	public String getRentFcltyDc() {
		return rentFcltyDc;
	}

	public void setRentFcltyDc(String rentFcltyDc) {
		this.rentFcltyDc = rentFcltyDc;
	}

	public String getResnResnSeCode() {
		return resnResnSeCode;
	}

	public void setResnResnSeCode(String resnResnSeCode) {
		this.resnResnSeCode = resnResnSeCode;
	}

	public String getHireProductDc() {
		return hireProductDc;
	}

	public void setHireProductDc(String hireProductDc) {
		this.hireProductDc = hireProductDc;
	}

	public String getHireFctryIndutyNm() {
		return hireFctryIndutyNm;
	}

	public void setHireFctryIndutyNm(String hireFctryIndutyNm) {
		this.hireFctryIndutyNm = hireFctryIndutyNm;
	}

	public String getHireFctryClCn() {
		return hireFctryClCn;
	}

	public void setHireFctryClCn(String hireFctryClCn) {
		this.hireFctryClCn = hireFctryClCn;
	}

	public String getRentGrntyAmount() {
		return rentGrntyAmount;
	}

	public void setRentGrntyAmount(String rentGrntyAmount) {
		this.rentGrntyAmount = rentGrntyAmount;
	}

	public String getRentMnfcturFcltyAr() {
		return rentMnfcturFcltyAr;
	}

	public void setRentMnfcturFcltyAr(String rentMnfcturFcltyAr) {
		this.rentMnfcturFcltyAr = rentMnfcturFcltyAr;
	}

	public String getRentSbrsAr() {
		return rentSbrsAr;
	}

	public void setRentSbrsAr(String rentSbrsAr) {
		this.rentSbrsAr = rentSbrsAr;
	}

	public String getRentCode() {
		return rentCode;
	}

	public void setRentCode(String rentCode) {
		this.rentCode = rentCode;
	}

	public String getHireIndvdlCprSecode() {
		return hireIndvdlCprSecode;
	}

	public void setHireIndvdlCprSecode(String hireIndvdlCprSecode) {
		this.hireIndvdlCprSecode = hireIndvdlCprSecode;
	}

	public String getTrnsfrResn() {
		return trnsfrResn;
	}

	public void setTrnsfrResn(String trnsfrResn) {
		this.trnsfrResn = trnsfrResn;
	}

	public String getInhrtnCmpnyNm() {
		return inhrtnCmpnyNm;
	}

	public void setInhrtnCmpnyNm(String inhrtnCmpnyNm) {
		this.inhrtnCmpnyNm = inhrtnCmpnyNm;
	}

	public String getInhrtnCmpnyTelno() {
		return inhrtnCmpnyTelno;
	}

	public void setInhrtnCmpnyTelno(String inhrtnCmpnyTelno) {
		this.inhrtnCmpnyTelno = inhrtnCmpnyTelno;
	}

	public String getInhrtnRprsntvNm() {
		return inhrtnRprsntvNm;
	}

	public void setInhrtnRprsntvNm(String inhrtnRprsntvNm) {
		this.inhrtnRprsntvNm = inhrtnRprsntvNm;
	}

	public String getInhrtnEmplyrIdntfcNo() {
		return inhrtnEmplyrIdntfcNo;
	}

	public void setInhrtnEmplyrIdntfcNo(String inhrtnEmplyrIdntfcNo) {
		this.inhrtnEmplyrIdntfcNo = inhrtnEmplyrIdntfcNo;
	}

	public String getInhrtnRprsntvAdres() {
		return inhrtnRprsntvAdres;
	}

	public void setInhrtnRprsntvAdres(String inhrtnRprsntvAdres) {
		this.inhrtnRprsntvAdres = inhrtnRprsntvAdres;
	}

	public String getInhrtnFctryIndutyNm() {
		return inhrtnFctryIndutyNm;
	}

	public void setInhrtnFctryIndutyNm(String inhrtnFctryIndutyNm) {
		this.inhrtnFctryIndutyNm = inhrtnFctryIndutyNm;
	}

	public String getInhrtnFctryClCn() {
		return inhrtnFctryClCn;
	}

	public void setInhrtnFctryClCn(String inhrtnFctryClCn) {
		this.inhrtnFctryClCn = inhrtnFctryClCn;
	}

	public String getInhrtnFctryPlotAr() {
		return inhrtnFctryPlotAr;
	}

	public void setInhrtnFctryPlotAr(String inhrtnFctryPlotAr) {
		this.inhrtnFctryPlotAr = inhrtnFctryPlotAr;
	}

	public String getInhrtnMnfcturFcltyAr() {
		return inhrtnMnfcturFcltyAr;
	}

	public void setInhrtnMnfcturFcltyAr(String inhrtnMnfcturFcltyAr) {
		this.inhrtnMnfcturFcltyAr = inhrtnMnfcturFcltyAr;
	}

	public String getInhrtnSbrsAr() {
		return inhrtnSbrsAr;
	}

	public void setInhrtnSbrsAr(String inhrtnSbrsAr) {
		this.inhrtnSbrsAr = inhrtnSbrsAr;
	}

	public String getCnstrcPrcrt() {
		return cnstrcPrcrt;
	}

	public void setCnstrcPrcrt(String cnstrcPrcrt) {
		this.cnstrcPrcrt = cnstrcPrcrt;
	}

	public String getArAchivrt() {
		return arAchivrt;
	}

	public void setArAchivrt(String arAchivrt) {
		this.arAchivrt = arAchivrt;
	}

	public String getPcPymntCndCn() {
		return pcPymntCndCn;
	}

	public void setPcPymntCndCn(String pcPymntCndCn) {
		this.pcPymntCndCn = pcPymntCndCn;
	}

	public String getDspsResn() {
		return dspsResn;
	}

	public void setDspsResn(String dspsResn) {
		this.dspsResn = dspsResn;
	}

	public String getPnuCode() {
		return pnuCode;
	}

	public void setPnuCode(String pnuCode) {
		this.pnuCode = pnuCode;
	}

	public String getTrnsfrAmount() {
		return trnsfrAmount;
	}

	public void setTrnsfrAmount(String trnsfrAmount) {
		this.trnsfrAmount = trnsfrAmount;
	}

	public String getAdresSeCode001RnAddr() {
		return adresSeCode001RnAddr;
	}

	public void setAdresSeCode001RnAddr(String adresSeCode001RnAddr) {
		this.adresSeCode001RnAddr = adresSeCode001RnAddr;
	}

	public String getAdresSeCode001Addr() {
		return adresSeCode001Addr;
	}

	public void setAdresSeCode001Addr(String adresSeCode001Addr) {
		this.adresSeCode001Addr = adresSeCode001Addr;
	}

	public String getPnuCd() {
		return pnuCd;
	}

	public void setPnuCd(String pnuCd) {
		this.pnuCd = pnuCd;
	}

	public String getNowYear() {
		return nowYear;
	}

	public void setNowYear(String nowYear) {
		this.nowYear = nowYear;
	}

	public String getOnePlusYear() {
		return onePlusYear;
	}

	public void setOnePlusYear(String onePlusYear) {
		this.onePlusYear = onePlusYear;
	}

	public String getTwoPlusYear() {
		return twoPlusYear;
	}

	public void setTwoPlusYear(String twoPlusYear) {
		this.twoPlusYear = twoPlusYear;
	}

	public String getThreePlusYear() {
		return threePlusYear;
	}

	public void setThreePlusYear(String threePlusYear) {
		this.threePlusYear = threePlusYear;
	}

	public String getPassingData2() {
		return passingData2;
	}

	public void setPassingData2(String passingData2) {
		this.passingData2 = passingData2;
	}

	public String getPlanYear() {
		return planYear;
	}

	public void setPlanYear(String planYear) {
		this.planYear = planYear;
	}

	public String getFctryPlanArNm() {
		return fctryPlanArNm;
	}

	public void setFctryPlanArNm(String fctryPlanArNm) {
		this.fctryPlanArNm = fctryPlanArNm;
	}

	public String getFctryPlanAr() {
		return fctryPlanAr;
	}

	public void setFctryPlanAr(String fctryPlanAr) {
		this.fctryPlanAr = fctryPlanAr;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getIsUploadFile() {
		return isUploadFile;
	}

	public void setIsUploadFile(String isUploadFile) {
		this.isUploadFile = isUploadFile;
	}

	public String getIsUploadFile1() {
		return isUploadFile1;
	}

	public void setIsUploadFile1(String isUploadFile1) {
		this.isUploadFile1 = isUploadFile1;
	}

	public String getIsUploadFile2() {
		return isUploadFile2;
	}

	public void setIsUploadFile2(String isUploadFile2) {
		this.isUploadFile2 = isUploadFile2;
	}

	public String getIsUploadApprFile1() {
		return isUploadApprFile1;
	}

	public void setIsUploadApprFile1(String isUploadApprFile1) {
		this.isUploadApprFile1 = isUploadApprFile1;
	}

	public String getIsUploadApprFile2() {
		return isUploadApprFile2;
	}

	public void setIsUploadApprFile2(String isUploadApprFile2) {
		this.isUploadApprFile2 = isUploadApprFile2;
	}

	public String getIsUploadApprFile3() {
		return isUploadApprFile3;
	}

	public void setIsUploadApprFile3(String isUploadApprFile3) {
		this.isUploadApprFile3 = isUploadApprFile3;
	}

	public String getCvplSeCodeNm() {
		return cvplSeCodeNm;
	}

	public void setCvplSeCodeNm(String cvplSeCodeNm) {
		this.cvplSeCodeNm = cvplSeCodeNm;
	}

	public String getRentArFctryPlotAr() {
		return rentArFctryPlotAr;
	}

	public void setRentArFctryPlotAr(String rentArFctryPlotAr) {
		this.rentArFctryPlotAr = rentArFctryPlotAr;
	}

	public String getPassingData3() {
		return passingData3;
	}

	public void setPassingData3(String passingData3) {
		this.passingData3 = passingData3;
	}

	public String getPrcusePlanNm() {
		return prcusePlanNm;
	}

	public void setPrcusePlanNm(String prcusePlanNm) {
		this.prcusePlanNm = prcusePlanNm;
	}

	public String getPrcusePlanAr() {
		return prcusePlanAr;
	}

	public void setPrcusePlanAr(String prcusePlanAr) {
		this.prcusePlanAr = prcusePlanAr;
	}

	public String getPrcusePlanYm() {
		return prcusePlanYm;
	}

	public void setPrcusePlanYm(String prcusePlanYm) {
		this.prcusePlanYm = prcusePlanYm;
	}

	public String getPrcusePlanCn() {
		return prcusePlanCn;
	}

	public void setPrcusePlanCn(String prcusePlanCn) {
		this.prcusePlanCn = prcusePlanCn;
	}

	public String getServicePlanYear() {
		return servicePlanYear;
	}

	public void setServicePlanYear(String servicePlanYear) {
		this.servicePlanYear = servicePlanYear;
	}

	public String getServicePlanNm() {
		return servicePlanNm;
	}

	public void setServicePlanNm(String servicePlanNm) {
		this.servicePlanNm = servicePlanNm;
	}

	public String getPrcusePlanPc() {
		return prcusePlanPc;
	}

	public void setPrcusePlanPc(String prcusePlanPc) {
		this.prcusePlanPc = prcusePlanPc;
	}

	public String getPrcusePlanCo() {
		return prcusePlanCo;
	}

	public void setPrcusePlanCo(String prcusePlanCo) {
		this.prcusePlanCo = prcusePlanCo;
	}

	public String getPrcusePlanAmount() {
		return prcusePlanAmount;
	}

	public void setPrcusePlanAmount(String prcusePlanAmount) {
		this.prcusePlanAmount = prcusePlanAmount;
	}

	public String getServicePlanPrice() {
		return servicePlanPrice;
	}

	public void setServicePlanPrice(String servicePlanPrice) {
		this.servicePlanPrice = servicePlanPrice;
	}

	public String getServicePlanQy() {
		return servicePlanQy;
	}

	public void setServicePlanQy(String servicePlanQy) {
		this.servicePlanQy = servicePlanQy;
	}

	public String getServicePlanAmount() {
		return servicePlanAmount;
	}

	public void setServicePlanAmount(String servicePlanAmount) {
		this.servicePlanAmount = servicePlanAmount;
	}

	public String getPrcusePlanSeCode() {
		return prcusePlanSeCode;
	}

	public void setPrcusePlanSeCode(String prcusePlanSeCode) {
		this.prcusePlanSeCode = prcusePlanSeCode;
	}

	public String getIsUpdate() {
		return isUpdate;
	}

	public void setIsUpdate(String isUpdate) {
		this.isUpdate = isUpdate;
	}

	public String getCnfmnIndutyCode() {
		return cnfmnIndutyCode;
	}

	public void setCnfmnIndutyCode(String cnfmnIndutyCode) {
		this.cnfmnIndutyCode = cnfmnIndutyCode;
	}

	public String getCnfmnIndutyOdr() {
		return cnfmnIndutyOdr;
	}

	public void setCnfmnIndutyOdr(String cnfmnIndutyOdr) {
		this.cnfmnIndutyOdr = cnfmnIndutyOdr;
	}

	public String getCnfmnEntrpsCo() {
		return cnfmnEntrpsCo;
	}

	public void setCnfmnEntrpsCo(String cnfmnEntrpsCo) {
		this.cnfmnEntrpsCo = cnfmnEntrpsCo;
	}

	public String getRentPrd() {
		return rentPrd;
	}

	public void setRentPrd(String rentPrd) {
		this.rentPrd = rentPrd;
	}

	public String getEntrpsNm() {
		return entrpsNm;
	}

	public void setEntrpsNm(String entrpsNm) {
		this.entrpsNm = entrpsNm;
	}

	public String getRentPlotArFix() {
		return rentPlotArFix;
	}

	public void setRentPlotArFix(String rentPlotArFix) {
		this.rentPlotArFix = rentPlotArFix;
	}

	public String getRentBuldArFix() {
		return rentBuldArFix;
	}

	public void setRentBuldArFix(String rentBuldArFix) {
		this.rentBuldArFix = rentBuldArFix;
	}

	public String getRentGrntyAmountFix() {
		return rentGrntyAmountFix;
	}

	public void setRentGrntyAmountFix(String rentGrntyAmountFix) {
		this.rentGrntyAmountFix = rentGrntyAmountFix;
	}

	public String getRentAmountFix() {
		return rentAmountFix;
	}

	public void setRentAmountFix(String rentAmountFix) {
		this.rentAmountFix = rentAmountFix;
	}

	public String getAtchMasterNo() {
		return atchMasterNo;
	}

	public void setAtchMasterNo(String atchMasterNo) {
		this.atchMasterNo = atchMasterNo;
	}

	public String getHireResnNm() {
		return hireResnNm;
	}

	public void setHireResnNm(String hireResnNm) {
		this.hireResnNm = hireResnNm;
	}

	public String getHireResnCode() {
		return hireResnCode;
	}

	public void setHireResnCode(String hireResnCode) {
		this.hireResnCode = hireResnCode;
	}

	public String getInhrtnResnNm() {
		return inhrtnResnNm;
	}

	public void setInhrtnResnNm(String inhrtnResnNm) {
		this.inhrtnResnNm = inhrtnResnNm;
	}

	public String getInhrtnResnCode() {
		return inhrtnResnCode;
	}

	public void setInhrtnResnCode(String inhrtnResnCode) {
		this.inhrtnResnCode = inhrtnResnCode;
	}

	public String getIrdsSeCode() {
		return irdsSeCode;
	}

	public void setIrdsSeCode(String irdsSeCode) {
		this.irdsSeCode = irdsSeCode;
	}

	public String getIrdsTyCode() {
		return irdsTyCode;
	}

	public void setIrdsTyCode(String irdsTyCode) {
		this.irdsTyCode = irdsTyCode;
	}

	public String getSortSn() {
		return sortSn;
	}

	public void setSortSn(String sortSn) {
		this.sortSn = sortSn;
	}

	public String getEtcEn() {
		return etcEn;
	}

	public void setEtcEn(String etcEn) {
		this.etcEn = etcEn;
	}

	public String getKicRentPlotAr() {
		return kicRentPlotAr;
	}

	public void setKicRentPlotAr(String kicRentPlotAr) {
		this.kicRentPlotAr = kicRentPlotAr;
	}

	public String getInstlrSeCode() {
		return instlrSeCode;
	}

	public void setInstlrSeCode(String instlrSeCode) {
		this.instlrSeCode = instlrSeCode;
	}

	public String getKicConfmSeCode() {
		return kicConfmSeCode;
	}

	public void setKicConfmSeCode(String kicConfmSeCode) {
		this.kicConfmSeCode = kicConfmSeCode;
	}

	public String getKicTotFloorCo() {
		return kicTotFloorCo;
	}

	public void setKicTotFloorCo(String kicTotFloorCo) {
		this.kicTotFloorCo = kicTotFloorCo;
	}

	public String getBuldDongCo() {
		return buldDongCo;
	}

	public void setBuldDongCo(String buldDongCo) {
		this.buldDongCo = buldDongCo;
	}

	public String getLttotTyCode() {
		return lttotTyCode;
	}

	public void setLttotTyCode(String lttotTyCode) {
		this.lttotTyCode = lttotTyCode;
	}

	public String getFctryDongLttotAr() {
		return fctryDongLttotAr;
	}

	public void setFctryDongLttotAr(String fctryDongLttotAr) {
		this.fctryDongLttotAr = fctryDongLttotAr;
	}

	public String getMrnDongLttotAr() {
		return mrnDongLttotAr;
	}

	public void setMrnDongLttotAr(String mrnDongLttotAr) {
		this.mrnDongLttotAr = mrnDongLttotAr;
	}

	public String getFctryDongFctryLttotAr() {
		return fctryDongFctryLttotAr;
	}

	public void setFctryDongFctryLttotAr(String fctryDongFctryLttotAr) {
		this.fctryDongFctryLttotAr = fctryDongFctryLttotAr;
	}

	public String getFctryDongSrnstLttotAr() {
		return fctryDongSrnstLttotAr;
	}

	public void setFctryDongSrnstLttotAr(String fctryDongSrnstLttotAr) {
		this.fctryDongSrnstLttotAr = fctryDongSrnstLttotAr;
	}

	public String getFctryDongEtcLttotAr() {
		return fctryDongEtcLttotAr;
	}

	public void setFctryDongEtcLttotAr(String fctryDongEtcLttotAr) {
		this.fctryDongEtcLttotAr = fctryDongEtcLttotAr;
	}

	public String getFctryDongCopertnLttotAr() {
		return fctryDongCopertnLttotAr;
	}

	public void setFctryDongCopertnLttotAr(String fctryDongCopertnLttotAr) {
		this.fctryDongCopertnLttotAr = fctryDongCopertnLttotAr;
	}

	public String getMrnDongFctryLttotAr() {
		return mrnDongFctryLttotAr;
	}

	public void setMrnDongFctryLttotAr(String mrnDongFctryLttotAr) {
		this.mrnDongFctryLttotAr = mrnDongFctryLttotAr;
	}

	public String getMrnDongSrnstLttotAr() {
		return mrnDongSrnstLttotAr;
	}

	public void setMrnDongSrnstLttotAr(String mrnDongSrnstLttotAr) {
		this.mrnDongSrnstLttotAr = mrnDongSrnstLttotAr;
	}

	public String getMrnDongEtcLttotAr() {
		return mrnDongEtcLttotAr;
	}

	public void setMrnDongEtcLttotAr(String mrnDongEtcLttotAr) {
		this.mrnDongEtcLttotAr = mrnDongEtcLttotAr;
	}

	public String getMrnDongCopertnLttotAr() {
		return mrnDongCopertnLttotAr;
	}

	public void setMrnDongCopertnLttotAr(String mrnDongCopertnLttotAr) {
		this.mrnDongCopertnLttotAr = mrnDongCopertnLttotAr;
	}

	public String getInvtAmount() {
		return invtAmount;
	}

	public void setInvtAmount(String invtAmount) {
		this.invtAmount = invtAmount;
	}

	public String getPrearngePyeongLttotAmount() {
		return prearngePyeongLttotAmount;
	}

	public void setPrearngePyeongLttotAmount(String prearngePyeongLttotAmount) {
		this.prearngePyeongLttotAmount = prearngePyeongLttotAmount;
	}

	public String getMntncEntrpsCo() {
		return mntncEntrpsCo;
	}

	public void setMntncEntrpsCo(String mntncEntrpsCo) {
		this.mntncEntrpsCo = mntncEntrpsCo;
	}

	public String getPlotAr() {
		return plotAr;
	}

	public void setPlotAr(String plotAr) {
		this.plotAr = plotAr;
	}

	public String getFctryDongBuldAr() {
		return fctryDongBuldAr;
	}

	public void setFctryDongBuldAr(String fctryDongBuldAr) {
		this.fctryDongBuldAr = fctryDongBuldAr;
	}

	public String getMrnDongBuldAr() {
		return mrnDongBuldAr;
	}

	public void setMrnDongBuldAr(String mrnDongBuldAr) {
		this.mrnDongBuldAr = mrnDongBuldAr;
	}

	public String getFctryDongLttotFloorCo() {
		return fctryDongLttotFloorCo;
	}

	public void setFctryDongLttotFloorCo(String fctryDongLttotFloorCo) {
		this.fctryDongLttotFloorCo = fctryDongLttotFloorCo;
	}

	public String getMrnDongLttotFloorCo() {
		return mrnDongLttotFloorCo;
	}

	public void setMrnDongLttotFloorCo(String mrnDongLttotFloorCo) {
		this.mrnDongLttotFloorCo = mrnDongLttotFloorCo;
	}

	public String getLttotConfmDe() {
		return lttotConfmDe;
	}

	public void setLttotConfmDe(String lttotConfmDe) {
		this.lttotConfmDe = lttotConfmDe;
	}

	public String getLttotMvnPrearngeDe() {
		return lttotMvnPrearngeDe;
	}

	public void setLttotMvnPrearngeDe(String lttotMvnPrearngeDe) {
		this.lttotMvnPrearngeDe = lttotMvnPrearngeDe;
	}

	public String getLttotConfmCndCn() {
		return lttotConfmCndCn;
	}

	public void setLttotConfmCndCn(String lttotConfmCndCn) {
		this.lttotConfmCndCn = lttotConfmCndCn;
	}

	public String getBuldSttusCode() {
		return buldSttusCode;
	}

	public void setBuldSttusCode(String buldSttusCode) {
		this.buldSttusCode = buldSttusCode;
	}

	public String getLttotSttusCode() {
		return lttotSttusCode;
	}

	public void setLttotSttusCode(String lttotSttusCode) {
		this.lttotSttusCode = lttotSttusCode;
	}

	public String getCvplLegfictCode() {
		return cvplLegfictCode;
	}

	public void setCvplLegfictCode(String cvplLegfictCode) {
		this.cvplLegfictCode = cvplLegfictCode;
	}

	public String getOrgnztCode() {
		return orgnztCode;
	}

	public void setOrgnztCode(String orgnztCode) {
		this.orgnztCode = orgnztCode;
	}

	public String getLegfictProcessInoutSeCode() {
		return legfictProcessInoutSeCode;
	}

	public void setLegfictProcessInoutSeCode(String legfictProcessInoutSeCode) {
		this.legfictProcessInoutSeCode = legfictProcessInoutSeCode;
	}

	public String getLegfictAsignDt() {
		return legfictAsignDt;
	}

	public void setLegfictAsignDt(String legfictAsignDt) {
		this.legfictAsignDt = legfictAsignDt;
	}

	public String getDrftSjNm() {
		return drftSjNm;
	}

	public void setDrftSjNm(String drftSjNm) {
		this.drftSjNm = drftSjNm;
	}

	public String getDrftBdtCn() {
		return drftBdtCn;
	}

	public void setDrftBdtCn(String drftBdtCn) {
		this.drftBdtCn = drftBdtCn;
	}

	public String getLegfictProcessConectCn() {
		return legfictProcessConectCn;
	}

	public void setLegfictProcessConectCn(String legfictProcessConectCn) {
		this.legfictProcessConectCn = legfictProcessConectCn;
	}

	public String getElctrnSanctnTrnsmisAt() {
		return elctrnSanctnTrnsmisAt;
	}

	public void setElctrnSanctnTrnsmisAt(String elctrnSanctnTrnsmisAt) {
		this.elctrnSanctnTrnsmisAt = elctrnSanctnTrnsmisAt;
	}

	public String getLegfictResultSeCode() {
		return legfictResultSeCode;
	}

	public void setLegfictResultSeCode(String legfictResultSeCode) {
		this.legfictResultSeCode = legfictResultSeCode;
	}

	public String getDlbrtCn() {
		return dlbrtCn;
	}

	public void setDlbrtCn(String dlbrtCn) {
		this.dlbrtCn = dlbrtCn;
	}

	public String getLegfictProcessDt() {
		return legfictProcessDt;
	}

	public void setLegfictProcessDt(String legfictProcessDt) {
		this.legfictProcessDt = legfictProcessDt;
	}

	public String getLegfictProcessChrgClsfNm() {
		return legfictProcessChrgClsfNm;
	}

	public void setLegfictProcessChrgClsfNm(String legfictProcessChrgClsfNm) {
		this.legfictProcessChrgClsfNm = legfictProcessChrgClsfNm;
	}

	public String getLegfictProcessChargerNm() {
		return legfictProcessChargerNm;
	}

	public void setLegfictProcessChargerNm(String legfictProcessChargerNm) {
		this.legfictProcessChargerNm = legfictProcessChargerNm;
	}

	public String getLegfictProcessChargerId() {
		return legfictProcessChargerId;
	}

	public void setLegfictProcessChargerId(String legfictProcessChargerId) {
		this.legfictProcessChargerId = legfictProcessChargerId;
	}

	public String getElctrnSanctnResultSeCode() {
		return elctrnSanctnResultSeCode;
	}

	public void setElctrnSanctnResultSeCode(String elctrnSanctnResultSeCode) {
		this.elctrnSanctnResultSeCode = elctrnSanctnResultSeCode;
	}

	public String getElctrnSanctnReqstDe() {
		return elctrnSanctnReqstDe;
	}

	public void setElctrnSanctnReqstDe(String elctrnSanctnReqstDe) {
		this.elctrnSanctnReqstDe = elctrnSanctnReqstDe;
	}

	public String getCvplDlbrtNm() {
		return cvplDlbrtNm;
	}

	public void setCvplDlbrtNm(String cvplDlbrtNm) {
		this.cvplDlbrtNm = cvplDlbrtNm;
	}

	public String getSanctnAtchmnflNm() {
		return sanctnAtchmnflNm;
	}

	public void setSanctnAtchmnflNm(String sanctnAtchmnflNm) {
		this.sanctnAtchmnflNm = sanctnAtchmnflNm;
	}

	public String getLegfictProcessChrgDeptNm() {
		return legfictProcessChrgDeptNm;
	}

	public void setLegfictProcessChrgDeptNm(String legfictProcessChrgDeptNm) {
		this.legfictProcessChrgDeptNm = legfictProcessChrgDeptNm;
	}

	public String getElctrnSanctnEmplyrId() {
		return elctrnSanctnEmplyrId;
	}

	public void setElctrnSanctnEmplyrId(String elctrnSanctnEmplyrId) {
		this.elctrnSanctnEmplyrId = elctrnSanctnEmplyrId;
	}

	public String getElctrnSanctnSttusCode() {
		return elctrnSanctnSttusCode;
	}

	public void setElctrnSanctnSttusCode(String elctrnSanctnSttusCode) {
		this.elctrnSanctnSttusCode = elctrnSanctnSttusCode;
	}

	public String getYongdoListArr() {
		return yongdoListArr;
	}

	public void setYongdoListArr(String yongdoListArr) {
		this.yongdoListArr = yongdoListArr;
	}

	public String getJimokNm() {
		return jimokNm;
	}

	public void setJimokNm(String jimokNm) {
		this.jimokNm = jimokNm;
	}

	public String getJimokCd() {
		return jimokCd;
	}

	public void setJimokCd(String jimokCd) {
		this.jimokCd = jimokCd;
	}

	public String getIndutyChgFlag() {
		return indutyChgFlag;
	}

	public void setIndutyChgFlag(String indutyChgFlag) {
		this.indutyChgFlag = indutyChgFlag;
	}

	public String getArrAdresFac() {
		return arrAdresFac;
	}

	public void setArrAdresFac(String arrAdresFac) {
		this.arrAdresFac = arrAdresFac;
	}

	public String getAtchmnflDocTyCode() {
		return atchmnflDocTyCode;
	}

	public void setAtchmnflDocTyCode(String atchmnflDocTyCode) {
		this.atchmnflDocTyCode = atchmnflDocTyCode;
	}

	public String getAtchmnflDocClCode() {
		return atchmnflDocClCode;
	}

	public void setAtchmnflDocClCode(String atchmnflDocClCode) {
		this.atchmnflDocClCode = atchmnflDocClCode;
	}

	public String getRentResnSeCode() {
		return rentResnSeCode;
	}

	public void setRentResnSeCode(String rentResnSeCode) {
		this.rentResnSeCode = rentResnSeCode;
	}

	public String getCvplLegfictNm() {
		return cvplLegfictNm;
	}

	public void setCvplLegfictNm(String cvplLegfictNm) {
		this.cvplLegfictNm = cvplLegfictNm;
	}

	public String getPapersCode() {
		return papersCode;
	}

	public void setPapersCode(String papersCode) {
		this.papersCode = papersCode;
	}

	public String getPapersCodeNm() {
		return papersCodeNm;
	}

	public void setPapersCodeNm(String papersCodeNm) {
		this.papersCodeNm = papersCodeNm;
	}

	public String getDelAtchmnflSn() {
		return delAtchmnflSn;
	}

	public void setDelAtchmnflSn(String delAtchmnflSn) {
		this.delAtchmnflSn = delAtchmnflSn;
	}

	public String getHoldSeCodeNm() {
		return holdSeCodeNm;
	}

	public void setHoldSeCodeNm(String holdSeCodeNm) {
		this.holdSeCodeNm = holdSeCodeNm;
	}

	public String getMvnTyCodeNm() {
		return mvnTyCodeNm;
	}

	public void setMvnTyCodeNm(String mvnTyCodeNm) {
		this.mvnTyCodeNm = mvnTyCodeNm;
	}

	public String getIrsttCodeNm() {
		return irsttCodeNm;
	}

	public void setIrsttCodeNm(String irsttCodeNm) {
		this.irsttCodeNm = irsttCodeNm;
	}

	public String getIrsttCmptncAt() {
		return irsttCmptncAt;
	}

	public void setIrsttCmptncAt(String irsttCmptncAt) {
		this.irsttCmptncAt = irsttCmptncAt;
	}

	public String getVrscCnsltAt() {
		return vrscCnsltAt;
	}

	public void setVrscCnsltAt(String vrscCnsltAt) {
		this.vrscCnsltAt = vrscCnsltAt;
	}

	public String getCmptncAdresCode() {
		return cmptncAdresCode;
	}

	public void setCmptncAdresCode(String cmptncAdresCode) {
		this.cmptncAdresCode = cmptncAdresCode;
	}

	public String getMberNm() {
		return mberNm;
	}

	public void setMberNm(String mberNm) {
		this.mberNm = mberNm;
	}

	public String getMbtlnumEncpt() {
		return mbtlnumEncpt;
	}

	public void setMbtlnumEncpt(String mbtlnumEncpt) {
		this.mbtlnumEncpt = mbtlnumEncpt;
	}

	public String getIsDeleteFile() {
		return isDeleteFile;
	}

	public void setIsDeleteFile(String isDeleteFile) {
		this.isDeleteFile = isDeleteFile;
	}

	public String getSplemntSn() {
		return splemntSn;
	}

	public void setSplemntSn(String splemntSn) {
		this.splemntSn = splemntSn;
	}

	public String getSplManageSn() {
		return splManageSn;
	}

	public void setSplManageSn(String splManageSn) {
		this.splManageSn = splManageSn;
	}

	public String getExtnSeCode() {
		return extnSeCode;
	}

	public void setExtnSeCode(String extnSeCode) {
		this.extnSeCode = extnSeCode;
	}

	public String getRentArManageSn() {
		return rentArManageSn;
	}

	public void setRentArManageSn(String rentArManageSn) {
		this.rentArManageSn = rentArManageSn;
	}

	public String getRprsntvAdres() {
		return rprsntvAdres;
	}

	public void setRprsntvAdres(String rprsntvAdres) {
		this.rprsntvAdres = rprsntvAdres;
	}

	public String getRprsntvRnAdres() {
		return rprsntvRnAdres;
	}

	public void setRprsntvRnAdres(String rprsntvRnAdres) {
		this.rprsntvRnAdres = rprsntvRnAdres;
	}

	public String getRprsntvPnuCode() {
		return rprsntvPnuCode;
	}

	public void setRprsntvPnuCode(String rprsntvPnuCode) {
		this.rprsntvPnuCode = rprsntvPnuCode;
	}

	public String getRprsntvZip() {
		return rprsntvZip;
	}

	public void setRprsntvZip(String rprsntvZip) {
		this.rprsntvZip = rprsntvZip;
	}

	public String getRprsntvCtprvnNm() {
		return rprsntvCtprvnNm;
	}

	public void setRprsntvCtprvnNm(String rprsntvCtprvnNm) {
		this.rprsntvCtprvnNm = rprsntvCtprvnNm;
	}

	public String getRprsntvSignguNm() {
		return rprsntvSignguNm;
	}

	public void setRprsntvSignguNm(String rprsntvSignguNm) {
		this.rprsntvSignguNm = rprsntvSignguNm;
	}

	public String getRprsntvEmdNm() {
		return rprsntvEmdNm;
	}

	public void setRprsntvEmdNm(String rprsntvEmdNm) {
		this.rprsntvEmdNm = rprsntvEmdNm;
	}

	public String getLawNm() {
		return lawNm;
	}

	public void setLawNm(String lawNm) {
		this.lawNm = lawNm;
	}

	public String[] getCvplLegFictCodeList() {
		return cvplLegFictCodeList;
	}

	public void setCvplLegFictCodeList(String[] cvplLegFictCodeList) {
		this.cvplLegFictCodeList = cvplLegFictCodeList;
	}

	public String getRentArListArr() {
		return rentArListArr;
	}

	public void setRentArListArr(String rentArListArr) {
		this.rentArListArr = rentArListArr;
	}

	public String getFirstDataAt() {
		return firstDataAt;
	}

	public void setFirstDataAt(String firstDataAt) {
		this.firstDataAt = firstDataAt;
	}

	public String getLastCvplManageNo() {
		return lastCvplManageNo;
	}

	public void setLastCvplManageNo(String lastCvplManageNo) {
		this.lastCvplManageNo = lastCvplManageNo;
	}

	/** 민원보완관리 진입여부 */
	private String myfctryonYn = "N";

	/** 제조시설 행 갯수 */
	private String prdctnFcltyTotalCnt;
	/** 파일 행 갯수 */
	private String fileIndex;
	/** 처리구분자 */
	private String pageType;
	/** 페이지별 민원타이틀 */
	private String minwonTitle;
	/** 페이지별 민원안내멘트 */
	private String minwonDesc;
	/** 리턴url */
	private String returnUrl;
	/** 작성중인민원 접근여부 */
	private String imsiYn;
	private List<FileVO> resultFile;

	/** 공장관리번호 */
	private String fctryManageNo;
	/** 민원번호 */
	private String cvplManageNo;
	/** 민원번호 */
	private String cvplManageNoPrev;
	private String mnfctyrFcltyGbn;
	private String confmRegistGbn;
	/** 임시저장여부 */
	private String cvplProgrsSttusCode;
	private String fctryProgrsSttusCode;
	private String fctryTyCode;
	private String bsnsTyCode;
	/** 공장소재지 Array List */
	private String adresFacListArr;
	/** 공장소재지 삭제 구분값 */
	private String fctryAdresFirst;

	/** 회원공장내역-아이디 */
	private String mberId;

	/* 회사명 */ private String cmpnyNm;
	/* 개인식별번호 */ private String emplyrIdntfcNo;
	/* 사업자등록번호 */ private String bizrno;
	/* 대표자성명 */ private String rprsntvNm;
	/* 대표자생일암호화 */ private String rprsntvBrthdy;
	/* 회사전화번호 */ private String cmpnyTelno;
	/* 회사팩스번호 */ private String cmpnyFxnum;

	/* 법인소재지 */ private String corpAddr;
	/* 공장소재지 */ private String fctryAddr;
	/* 공장소재지배열 */ private String arrFctryAdresList;
	/* 공장설립승인번호 */ private String fondConfmNo;

	/* 업종배열 */ private String indutyListArr;

	/* 업종코드 */ private String indutyCode;
	/* 대표업종여부 */ private String reprsntIndutyAt;
	/* 코드변환여부 */ private String codeCnvrAt;
	/* 업종차수 */ private String indutyOdr;
	/* 처리도식첨부파일일련번호 */ private String processDgrmAtchmnflSn;
	/* 생산처리도식내용 */ private String prdctnProcessDgrmCn;
	/* 업종명 */ private String indutyNm;

	/* 첨단업종배열 */ private String uptodeIndutyListArr;
	/* 첨단업종 */ private String uptodeIndutyCode;

	/* 생산품 */ private String mainProductCn;

	/* 총 종업원 수 */ private String employeesTotal;
	/* 국내 남자 종업원 수 */ private String maleEmplyCo;
	/* 국내 여자 종업원 수 */ private String femaleEmplyCo;
	/* 해외 남자 종업원 수 */ private String frgnrMaleEmplyCo;
	/* 해외 여자 종업원 수 */ private String frgnrFemaleEmplyCo;

	/* 공장가동예정일 - 매칭 불가 */

	/* 공장준공일 */ private String comptPrearngeDe;

	/* 규모-공장부지면적 */ private String fctryPlotAr;
	/* 규모-제조시설면적 */ private String mnfcturFcltyAr;
	/* 규모-부대시설면적 */ private String sbrsAr;
	/* 규모-기준공장면적률 */ private String stdrFctryArrt;

	/* 생산시설 - 생산시설명 */ private String prdctnFcltyNm;
	/* 생산시설 - 용량 */ private String prdctnFcltyQy;
	/* 생산시설 - 용량기준설명 */ private String cpctyStdrDc;
	/* 생산시설 - 생산시설량 */ private String prdctnFcltyCo;
	/* 생산시설 - 배출구분코드 */ private String exhstSeCode;
	/* 생산시설 - 생산시설배출량 */ // private String prdctnFcltyExhstQy;
	/* 생산시설 - 생산시설배출량 */ private String prdctnFcltyExhstCn;
	/* 생산시설 - 방지시설내용 */ private String prvnFcltyCn;
	/* 생산시설 - 방지시설내용 */ private String passingData;

	/*
	 * private List<Object> FctryList; private List<Object> yongdoList; private
	 * List<Object> indutyLis; private List<Object> uptodeIndutyList;
	 */

	private String onlineRceptSeCode;
	private String nusysRceptNo;
	private String nusysRceptDe;
	private String cvplTmlmtDe;
	private String nusysApplcntMbtlnumEncpt;
	private String nusysApplcntNm;
	private String vrscInsttNm;
	private String vrscEmplyrIdntfcNo;
	private String reqstDe;
	private String cvplResultSeCode;
	private String emplyrSeCode;
	private String changeCvplSeCode;
	private String comptCvplManageNo;
	private String nusysApplcntEmladrEncpt;
	private String reqstMberId;
	private String psitnOrgnztCode;
	private String cvplSeCode;
	private String cvplChargerId;
	private String sptExaminChargerId;
	private String sptExaminProcessDt;
	private String sptExaminSttusCode;
	private String sptExaminResultCn;
	private String sptExaminAtchmnflSn;
	private String etcCvplReqstDe;
	private String bsnsChangeCvplManageNo;
	private String updtResn;
	private String irsttSeCode;
	private String irsttOrgnztCode;
	private String irsttVrscCn;
	private String atmcHistCvplManageNo;
	private String cnsltDiaryNo;
	private String vrscReqstManageNo;
	private String rceptCvplManageNo;
	private String confmRegistSeCode;
	private String fondChangeReqstCn;
	private String changeSttemntReqstDe;
	private String changeSttemntConfmDe;
	private String cvplSanctnSttusCode;
	private String cvplChrgOrgnztCode;
	private String fondConfmTyCode;
	private String fondConfmDe;
	private String fctryRegistTyCode;
	private String fctryRegistNo;
	private String fctryRegistDe;
	private String registCndSeCode;
	private String registCndAditCn;
	private String cndlRegistValidBeginDe;
	private String cndlRegistValidEndDe;
	private String registChangeTyCode;
	private String lastConfmRegistAt;
	private String frstFondConfmDe;
	private String tmrAt;
	private String vnentrCrtfcObtainAt;
	private String isoCrtfcObtainAt;
	private String etcObtainCrtfcCn;
	private String confmCanclDe;
	private String confmCanclResn;
	private String confmCndFileSn;
	private String confmCndCn;
	private String registCanclSeCode;
	private String registCndCn;
	private String registCndFileSn;
	private String fctryTrnsfrAmount;
	private String atchmnflManageNo;

	private String excpAr;
	private String oprrt;
	private String plotEvlAmount;
	private String buldEvlAmount;
	private String acetYear;
	private String changeCvplManageNo;
	private String nonMfcrtrBsnsPrposCn;
	private String nonMfcrtrExpcEffectCn;
	private String nonMfcrtrDetailBsnsCn;
	private String allPlotAr;
	private String allBuldAr;
	private String allBuldTotAr;
	private String cvplSplemntSttusCode;
	private String cvplResultOpinionCn;
	private String cvplResultAtchmnflSn;
	private String trnsfrSttusCode;
	private String etcCvplProcessDe;
	private String validHistAt;
	private String updtSeCode;
	private String ipadrEncpt;
	private String useAt;
	private String frstRegisterId;
	private String fctryNm;
	private String indvdlCprSeCode;
	private String rprsntvSexdstnSeCode;
	private String fctryClAt;
	private String frnnSeCode;
	private String irsttCode;
	private String lndcgrSeCode;
	private String spfcSeCode;
	private String offmAr;
	private String wrhousAr;
	private String mainRwmatrCn;
	private String hrzntltyPrjctnAr;
	private String mvmnFctryTyCode;
	private String mvmnFctryManageNo;
	private String mvmnCvplManageNo;
	private String mvmnFctrySeCode;
	private String mvmnFctryHistAt;
	private String bsnsBeginPrearngeDe;
	private String bsnsBeginAt;
	private String comptDataAt;
	private String ladUseRightCn;
	private String canclCn;
	private String changeFctryManageNo;
	private String etcAr;
	private String frstBsnsConfmBeginDe;
	private String mvmnIrsttAt;
	private String llxSetleAt;
	private String indvdlInfoPrcuseAgreAt;
	private String ntdfnEntrpsAt;
	private String strwrkPrearngeDe;
	private String strwrkAt;
	private String comptDe;
	private String opertPrearngeDe;
	private String frstFctryRegistDe;
	private String fctryBsnsSttusCode;
	private String fondTyCode;
	private String fctryBuldSeCode;
	private String administFctryManageNo;
	private String kicFctryManageNo;
	private String KicFctryNm;
	private String posesnFctryManageNo;
	private String trnsfrFctryManageNo;
	private String mvnTyCode;
	private String holdSeCode;
	private String fctryLndpclCo;
	private String dstrctSeCode;
	private String grntyAmount;
	private String rentAmount;
	private String cnfmPrmisnRegistNo;
	private String rentTotMntncEntrpsCo;
	private String rentBuldTotAr;
	private String safeManageRspnberNm;
	private String safeManageRspnberTelno;
	private String sfmngActplnAtchAt;
	private String vrscSeCode;
	private String rprsntvEmladrEncpt;
	private String rprsntvMbtlnumEncpt;
	private String rprsntvFxnum;
	private String hmpadr;
	private String gnrlPwrerEnergyUseQy;
	private String pvtusePwrerEnergyUseQy;
	private String lvlhUswtrEnergyUseQy;
	private String industUswtrEnergyUseQy;
	private String petrlumEnergyUseQy;
	private String gasEnergyUseQy;
	private String etcEnergyUseQy;
	private String frgnrInvtAmount;
	private String frgnrInvtrt;
	private String ecptlAmount;
	private String otherCaplAmount;
	private String cmpnyAssetsAmount;
	private String cmpnyFondDe;
	private String postngDgrmAtchmnflSn;
	private String dgrmAtchSeCode;
	private String bsnsBeginDe;
	private String webNoticeAt;
	private String fctryScaleSeCode;
	private String arpltBplcSeCode;
	private String wlttsBplcSeCode;
	private String fyerWaitExhstQy;
	private String qltwtrExhstQy;
	private String noiseVibratAt;
	private String urbnFctryAt;
	private String btlRt;
	private String measrmtrt;
	private String fyerSelngAmount;
	private String fyerXportactAmount;
	private String manageSn;

	/* 민원 필지 정보 */
	private String adresSeCode;
	private String adresCode;
	private String adresSn;
	private String reprsntAdresAt;
	private String rnCode;
	private String ctprvnNm;
	private String signguNm;
	private String emdNm;
	private String legalliNm;
	private String roadNm;
	private String undgrndAt;
	private String buldMnnmAdres;
	private String buldSlnoAdres;
	private String mntnAt;
	private String mnnmAdres;
	private String slnoAdres;
	private String emdSn;
	private String widthCrdnt;
	private String vrticlCrdnt;
	private String mntnAdres;
	private String lnbrAdres;
	private String hoAdres;
	private String blckAdres;
	private String spclAdres;
	private String spclDongAdres;
	private String spclHoAdres;
	private String adres;
	private String kicDongAdres;
	private String kicFloorAdres;
	private String kicHoAdres;
	private String fctryLndpclAr;
	private String buldManageNo;
	private String rnAdres;
	private String zip;
	private String frstRegistDt;
	private String lastUpdusrId;
	private String lastUpdtDt;

	private String category;

	/* 민원 필지 상세 */
	private String lndpclSn;
	private String manageClCode;
	private String manageSeCode;
	private String spcfcSeCode;
	private String reprsntDataAt;
	private String etcCn;

	/* 취소원,취하원 */
	private String moveFctryAddr;
	private String wthdrwReason;

	/* 개별입지 */

	// 공장소재지 (100)
	private String fctryAdres;
	private String jrsAdrCd; // 법정동코드

	// 법인소재지 (000)
	private String cprAdres;
	private String cprNationType;
	private String cprGubun;
	private String cprZip;
	private String cprPnuCd;
	private String cprCategory;
	private String cprJibunAddr;
	private String cprAddrDetaill;
	private String cprRoadFullAddr;
	private String cprCtprvnNm;
	private String cprSignguNm;
	private String cprEmdNm;
	private String cprAddrDetail;
	private String cprKicDongAdres;
	private String cprKicFloorAdres;
	private String cprKicHoAdres;

	// 이전예정주소 (011)
	private String moveAdres;
	private String moveNationType;
	private String moveGubun;
	private String moveZip;
	private String movePnuCd;
	private String moveCategory;
	private String moveJibunAddr;
	private String moveAddrDetaill;
	private String moveRoadFullAddr;
	private String moveCtprvnNm;
	private String moveSignguNm;
	private String moveEmdNm;
	private String moveAddrDetail;

	// 기존공장
	private String beforeFctryManageNo;
	private String beforeFctrySeCode;
	private String beforeCmpnyNm;
	private String beforeRprsntvNm;
	private String beforeFctryAdres;
	private String beforeIndutyCode;
	private String beforeUptodeIndutyCode;
	private String beforeFctryPlotAr;
	private String beforeMnfcturFcltyAr;
	private String beforeSbrsAr;

	/* 영문공장정보 */
	/* 영문회사명 */ private String engCmpnyNm;
	/* 영문대표자명 */ private String engRprsntvNm;
	/* 영문대표자주소 */ private String engRprsntvAdres;
	/* 영문공장주소 */ private String engAdres;
	/* 영문지목명 */ private String engLndcgrNm;
	/* 영문업종명 */ private String engIndutyNm;
	/* 영문등록조건내용 */ private String engRegistCndCn;
	/* 영문내용 */ private String engCn;
	/* 영문발급조직명 */ private String engIssuOrgnztNm;

	/* 임대임차 */
	/* 임차공장명 */ private String hireCmpnyNm;
	/* 임차사유 */ private String hireReason;
	/* 임차시작일 */ private String rentBeginDe;
	/* 임차종료일 */ private String rentEndDe;
	/* 임차사유 */ private String sublsAt;
	/* 임차사유 */ private String inhtrnReason;

	/* 민원임대 신고내역 - TB_CVPL_RENT_STTEMNT_L */
	private String dspsJobSeCode;
	private String applcntNm;
	private String inhrtnTrnsfrProcessAt;
	private String hireRprsntvNm;
	private String hireCmpnyTelno;
	private String hireEmplyrIdntfcNo;
	private String hireCmpnyAdres;
	private String buldAr;
	private String rentPlotAr;
	private String rentBuldAr;
	private String rentFcltyDc;
	private String resnResnSeCode;
	private String hireProductDc;
	private String hireFctryIndutyNm;
	private String hireFctryClCn;
	private String rentGrntyAmount;
	private String rentMnfcturFcltyAr;
	private String rentSbrsAr;
	private String rentCode;
	private String hireIndvdlCprSecode;

	/* 민원 처분 신고 내역 - TB_CVPL_DSPS_STTEMNT_L */
	/** 양도사유 */
	private String trnsfrResn;
	/** 양수회사명 */
	private String inhrtnCmpnyNm;
	/** 양수회사전화번호 */
	private String inhrtnCmpnyTelno;
	/** 양수대표자명 */
	private String inhrtnRprsntvNm;
	/** 양수사용자식별번호 */
	private String inhrtnEmplyrIdntfcNo;
	/** 양수대표자주소 */
	private String inhrtnRprsntvAdres;
	/** 양수공장업종명 */
	private String inhrtnFctryIndutyNm;
	/** 양수공장분류내용 */
	private String inhrtnFctryClCn;
	/** 양수공장대지면적 */
	private String inhrtnFctryPlotAr;
	/** 양수제조시설면적 */
	private String inhrtnMnfcturFcltyAr;
	/** 양수부대시설면적 */
	private String inhrtnSbrsAr;
	/** 건설처리율 */
	private String cnstrcPrcrt;
	/** 면적달성율 */
	private String arAchivrt;
	/** 가격지급조건내용 */
	private String pcPymntCndCn;
	/** 처분사유 */
	private String dspsResn;
	/** pnu코드 */
	private String pnuCode;
	/** 양도금액 */
	private String trnsfrAmount;

	/* 사업계획서 작성용 START */
	/* 대표자 도로명주소 전달 param */ private String adresSeCode001RnAddr;
	/* 대표자 주소 전달 param */ private String adresSeCode001Addr;
	/* pnu code */ private String pnuCd;
	/* 1차년도 */ private String nowYear;
	/* 2차년도 */ private String onePlusYear;
	/* 3차년도 */ private String twoPlusYear;
	/* 4차년도 */ private String threePlusYear;
	/* 공장건설계획jsonPasing */ private String passingData2;
	/* 계획년도 */ private String planYear;
	/* 공장계획면적명 */ private String fctryPlanArNm;
	/* 공장계획면적 */ private String fctryPlanAr;
	/* 최종제출여부(임시저장여부) */ private String param;
	/* 첨부파일 존재하는 sn */ private String isUploadFile;
	/* 첨부파일1존재여부 */ private String isUploadFile1;
	/* 첨부파일2존재여부 */ private String isUploadFile2;
	/* 신청구비서류1존재여부 */ private String isUploadApprFile1;
	/* 신청구비서류2존재여부 */ private String isUploadApprFile2;
	/* 신청구비서류3존재여부 */ private String isUploadApprFile3;
	/* 민원구분코드명 */ private String cvplSeCodeNm;
	/* 민원임대면적의 공장용지면적 */ private String rentArFctryPlotAr;
	/* 서비스계획jsonPasing */ private String passingData3;
	/* 세부용도 */ private String prcusePlanNm;
	/* 건축면적 */ private String prcusePlanAr;
	/* 건축시기 */ private String prcusePlanYm;
	/* 활용계획 */ private String prcusePlanCn;
	/* 해당년도 */ private String servicePlanYear;
	/* 제품 및 서비스명 */ private String servicePlanNm;
	/* 단가 */ private String prcusePlanPc;
	/* 수량 */ private String prcusePlanCo;
	/* 금액 */ private String prcusePlanAmount;
	/* 단가param */ private String servicePlanPrice;
	/* 수량param */ private String servicePlanQy;
	/* 금액param */ private String servicePlanAmount;
	/* 활용계획 구분코드 */ private String prcusePlanSeCode;
	/* update/insert 구분값 */ private String isUpdate;

	/* 사업계획서 step2 임대사업자의 경우 사용 */
	private String cnfmnIndutyCode;
	private String cnfmnIndutyOdr;
	private String cnfmnEntrpsCo;
	private String rentPrd;
	private String entrpsNm;
	private String rentPlotArFix;
	private String rentBuldArFix;
	private String rentGrntyAmountFix;
	private String rentAmountFix;
	private String atchMasterNo;

	/* 사업계획서 작성용 END */

	/** 임차사유명 */
	private String hireResnNm;
	/** 임차사유코드 */
	private String hireResnCode;
	/** 양수사유명 */
	private String inhrtnResnNm;
	/** 양수사유코드 */
	private String inhrtnResnCode;

	/* 민원임대 면적 내역 */
	private String irdsSeCode;
	private String irdsTyCode;
	private String sortSn;
	private String etcEn;

	/** 민원건물계획내역 */
	private String kicRentPlotAr;
	private String instlrSeCode;
	private String kicConfmSeCode;
	private String kicTotFloorCo;
	private String buldDongCo;
	private String lttotTyCode;
	private String fctryDongLttotAr;
	private String mrnDongLttotAr;
	private String fctryDongFctryLttotAr;
	private String fctryDongSrnstLttotAr;
	private String fctryDongEtcLttotAr;
	private String fctryDongCopertnLttotAr;
	private String mrnDongFctryLttotAr;
	private String mrnDongSrnstLttotAr;
	private String mrnDongEtcLttotAr;
	private String mrnDongCopertnLttotAr;
	private String invtAmount;
	private String prearngePyeongLttotAmount;
	private String mntncEntrpsCo;
	private String plotAr;
	private String fctryDongBuldAr;
	private String mrnDongBuldAr;
	private String fctryDongLttotFloorCo;
	private String mrnDongLttotFloorCo;
	private String lttotConfmDe;
	private String lttotMvnPrearngeDe;
	private String lttotConfmCndCn;
	private String buldSttusCode;
	private String lttotSttusCode;

	/** 민원의제처리내역 */
	private String cvplLegfictCode;
	private String orgnztCode;
	private String legfictProcessInoutSeCode;
	private String legfictAsignDt;
	private String drftSjNm;
	private String drftBdtCn;
	private String legfictProcessConectCn;
	private String elctrnSanctnTrnsmisAt;
	private String legfictResultSeCode;
	private String dlbrtCn;
	private String legfictProcessDt;
	private String legfictProcessChrgClsfNm;
	private String legfictProcessChargerNm;
	private String legfictProcessChargerId;
	private String elctrnSanctnResultSeCode;
	private String elctrnSanctnReqstDe;
	private String cvplDlbrtNm;
	private String sanctnAtchmnflNm;
	private String legfictProcessChrgDeptNm;
	private String elctrnSanctnEmplyrId;
	private String elctrnSanctnSttusCode;

	/* 지목코드 */
	private String yongdoListArr;
	private String jimokNm;
	private String jimokCd;

	private String indutyChgFlag;
	private String arrAdresFac;

	/* 첨부파일쪽 추가된 컬럼 */
	/* 첨부파일 문서유형코드 */ private String atchmnflDocTyCode;
	/* 첨부파일 문서분류코드 */ private String atchmnflDocClCode;

	/* 첨부파일 문서분류코드 */ private String rentResnSeCode;

	/* 민원의제처리 */
	/* 민원의제명 */ private String cvplLegfictNm;
	/* 서류코드 */ private String papersCode;
	/* 서류코드명 */ private String papersCodeNm;
	/* 첨부파일삭제 */ private String delAtchmnflSn;

	private String holdSeCodeNm;
	private String mvnTyCodeNm;

	/* 산업단지명 */ private String irsttCodeNm;
	/* 관할구분여부 */ private String irsttCmptncAt;
	/* 대행신청에서 민원신청으로 넘어가는 구분값 */ private String vrscCnsltAt;

	/* 행정구역코드 */ private String cmptncAdresCode;

	/* 단순민원 신청인 이름 */ private String mberNm;
	/* 단순민원 신청인 이동전화 */ private String mbtlnumEncpt;

	/* 삭제할 파일 리스트 */ private String isDeleteFile;

	// 민원 보안 관련
	/* 민원 보안 Sn */ private String splemntSn;
	/* 민원 보안 재보안Sn */ private String splManageSn;
	/* 연장 구분코드 */ private String extnSeCode;

	/* 민원 임대내역 관리일련번호 */ private String rentArManageSn;
	// 단순민원 대표자 주소
	private String rprsntvAdres;
	private String rprsntvRnAdres;
	private String rprsntvPnuCode;
	private String rprsntvZip;
	private String rprsntvCtprvnNm;
	private String rprsntvSignguNm;
	private String rprsntvEmdNm;

	/* 민원의제 법명 */private String lawNm;
	/* 민원의제코드 in */ private String[] cvplLegFictCodeList;

	// 2020-06-16 임대면적내역 list
	private String rentArListArr;
	// 최초입력 (삭제 여부)
	private String firstDataAt;

	// 2020-07-17 최종민원번호 dongg
	private String lastCvplManageNo;

}
