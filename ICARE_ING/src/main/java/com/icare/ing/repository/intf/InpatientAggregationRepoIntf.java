package com.icare.ing.repository.intf;

// TODO: Auto-generated Javadoc
/**
 * The Interface InpatientAggregationRepoIntf.
 */
public interface InpatientAggregationRepoIntf {
	
	/** The Constant aggregateQuery. */
	public static final StringBuilder aggregateQuery = new StringBuilder()
	.append("SELECT cd.inDate, cd.prncplPrcdrCd,")
	.append("  cd.prncplDgnsCd,")
	.append("  CAST(cd.mdc AS INT),")
	.append("  SUM(CAST(cd.totalBilledAmount AS INT)) AS label,")
	.append("  SUM(CAST(cd.paidAmount AS        INT)) AS paidAmount,")
	.append("  cd.patientStatusLkpcd, cd.admissionDate,")
	.append("  cd.dischargeDate,")
	.append("  CAST(cd.drgCode AS INT),")
	.append("  cd.admtDiagCd,")
	.append("  cd.admtDiagCdPoa,")
	.append("  cd.prncplDgnsCd,")
	.append("  cd.prncplDgnsPoa,")
	.append("  cd.mbrIdentifier,")
	.append("  cd.prncplPrcdrCd,")
	.append("  cd.prncplPrcdrCdDate,")
	.append("  cd.de1,")
	.append("  cd.de1_poa,")
	.append("  cd.de2,")
	.append("  cd.de2_poa,")
	.append("  cd.de3,")
	.append("  cd.de3_poa,")
	.append("  cd.de4,")
	.append("  cd.de4_poa,")
	.append("  cd.de5,")
	.append("  cd.de5_poa,")
	.append("  cd.de6,")
	.append("  cd.de6_poa,")
	.append("  cd.de7,")
	.append("  cd.de7_poa,")
	.append("  cd.de8,")
	.append("  cd.de8_poa,")
	.append("  cd.de9,")
	.append("  cd.de9_poa,")
	.append("  cd.de10,")
	.append("  cd.de10_poa,")
	.append("  cd.d1,")
	.append("  cd.d1_poa,")
	.append("  cd.d2,")
	.append("  cd.d2_poa,")
	.append("  cd.d3,")
	.append("  cd.d3_poa,")
	.append("  cd.d4,")
	.append("  cd.d4_poa,")
	.append("  cd.d5,")
	.append("  cd.d5_poa,")
	.append("  cd.d6,")
	.append("  cd.d6_poa,")
	.append("  cd.d7,")
	.append("  cd.d7_poa,")
	.append("  cd.d8,")
	.append("  cd.d8_poa,")
	.append("  cd.d9,")
	.append("  cd.d9_poa,")
	.append("  cd.d10,")
	.append("  cd.d10_poa,")
	.append("  cd.d11,")
	.append("  cd.d11_poa,")
	.append("  cd.d12,")
	.append("  cd.d12_poa,")
	.append("  cd.d13,")
	.append("  cd.d13_poa,")
	.append("  cd.d14,")
	.append("  cd.d14_poa,")
	.append("  cd.d15,")
	.append("  cd.d15_poa,")
	.append("  cd.d16,")
	.append("  cd.d16_poa,")
	.append("  cd.d17,")
	.append("  cd.d17_poa,")
	.append("  cd.d18,")
	.append("  cd.d18_poa,")
	.append("  cd.d19,")
	.append("  cd.d19_poa,")
	.append("  cd.d20,")
	.append("  cd.d20_poa,")
	.append("  cd.d21,")
	.append("  cd.d21_poa,")
	.append("  cd.d22,")
	.append("  cd.d22_poa,")
	.append("  cd.d23,")
	.append("  cd.d23_poa,")
	.append("  cd.d24,")
	.append("  cd.d24_poa,")
	.append("  cd.p1 ,")
	.append("  cd.p1_dt ,")
	.append("  cd.p2 ,")
	.append("  cd.p2_dt ,")
	.append("  cd.p3 ,")
	.append("  cd.p3_dt ,")
	.append("  cd.p4 ,")
	.append("  cd.p4_dt ,")
	.append("  cd.p5 ,")
	.append("  cd.p5_dt ,")
	.append("  cd.p6 ,")
	.append("  cd.p6_dt ,")
	.append("  cd.p7 ,")
	.append("  cd.p7_dt ,")
	.append("  cd.p8 ,")
	.append("  cd.p8_dt ,")
	.append("  cd.p9 ,")
	.append("  cd.p9_dt ,")
	.append("  cd.p10 ,")
	.append("  cd.p10_dt ,")
	.append("  cd.p11 ,")
	.append("  cd.p11_dt ,")
	.append("  cd.p12 ,")
	.append("  cd.p12_dt ,")
	.append("  cd.p13 ,")
	.append("  cd.p13_dt ,")
	.append("  cd.p14 ,")
	.append("  cd.p14_dt ,")
	.append("  cd.p15 ,")
	.append("  cd.p15_dt ,")
	.append("  cd.p16 ,")
	.append("  cd.p16_dt ,")
	.append("  cd.p17 ,")
	.append("  cd.p17_dt ,")
	.append("  cd.p18 ,")
	.append("  cd.p18_dt ,")
	.append("  cd.p19 ,")
	.append("  cd.p19_dt ,")
	.append("  cd.p20 ,")
	.append("  cd.p20_dt ,")
	.append("  cd.p21 ,")
	.append("  cd.p21_dt ,")
	.append("  cd.p22 ,")
	.append("  cd.p22_dt ,")
	.append("  cd.p23 ,")
	.append("  cd.p23_dt ,")
	.append("  cd.p24 ,")
	.append("  cd.p24_dt ,")
	.append("  cd.cnd1 ,")
	.append("  cd.cnd2 ,")
	.append("  cd.cnd3 ,")
	.append("  cd.cnd4 ,")
	.append("  cd.cnd5 ,")
	.append("  cd.ocr1 ,")
	.append("  cd.ocr1_dt ,")
	.append("  cd.ocr2 ,")
	.append("  cd.ocr2_dt ,")
	.append("  cd.ocr3 ,")
	.append("  cd.ocr3_dt ,")
	.append("  cd.ocr4 ,")
	.append("  cd.ocr4_dt ,")
	.append("  cd.ocr5 ,")
	.append("  cd.ocr5_dt ,")
	.append("  cd.val1 ,")
	.append("  cd.val1_amt ,")
	.append("  cd.val2 ,")
	.append("  cd.val2_amt ,")
	.append("  cd.val3 ,")
	.append("  cd.val3_amt ,")
	.append("  cd.val4 ,")
	.append("  cd.val4_amt ,")
	.append("  cd.val5 ,")
	.append("  cd.val5_amt ,")
	.append("  cd.val6 ,")
	.append("  cd.val6_amt ,")
	.append("  cd.val7 ,")
	.append("  cd.val7_amt ,")
	.append("  cd.val8 ,")
	.append("  cd.val8_amt ,")
	.append("  cd.val9 ,")
	.append("  cd.val9_amt ,")
	.append("  cd.val10 ,")
	.append("  cd.val10_amt, ")
	.append("  cd.patientGender, ")
	.append("  datediff(TO_DATE(CAST(UNIX_TIMESTAMP(cd.dischargeDate,'yyyy-MM-dd') AS TIMESTAMP)), TO_DATE(CAST(UNIX_TIMESTAMP(cd.admissionDate,'yyyy-MM-dd') AS TIMESTAMP))) as los,")
	.append("  datediff(current_date(), TO_DATE(CAST(UNIX_TIMESTAMP(cd.patientBirthDate,'yyyy-MM-dd') AS TIMESTAMP)))/365 as age")
	.append(" FROM CD cd ")
	.append(" GROUP BY cd.mdc,cd.inDate,")
	.append("  cd.prncplPrcdrCd,")
	.append("  cd.prncplDgnsCd,")
	.append("  cd.admissionDate,")
	.append("  cd.dischargeDate,")
	.append("  cd.drgCode,")
	.append("  cd.admtDiagCd,cd.admtDiagCdPoa,")
	.append("  cd.prncplDgnsCd,")
	.append("  cd.prncplDgnsPoa,")
	.append("  cd.mbrIdentifier,")
	.append("  cd.prncplPrcdrCd,")
	.append("  cd.prncplPrcdrCdDate,cd.patientStatusLkpcd,cd.patientGender, cd.patientBirthDate ,")
	.append("  cd.de1,")
	.append("  cd.de1_poa,")
	.append("  cd.de2,")
	.append("  cd.de2_poa,")
	.append("  cd.de3,")
	.append("  cd.de3_poa,")
	.append("  cd.de4,")
	.append("  cd.de4_poa,")
	.append("  cd.de5,")
	.append("  cd.de5_poa,")
	.append("  cd.de6,")
	.append("  cd.de6_poa,")
	.append("  cd.de7,")
	.append("  cd.de7_poa,")
	.append("  cd.de8,")
	.append("  cd.de8_poa,")
	.append("  cd.de9,")
	.append("  cd.de9_poa,")
	.append("  cd.de10,")
	.append("  cd.de10_poa,")
	.append("  cd.d1,")
	.append("  cd.d1_poa,")
	.append("  cd.d2,")
	.append("  cd.d2_poa,")
	.append("  cd.d3,")
	.append("  cd.d3_poa,")
	.append("  cd.d4,")
	.append("  cd.d4_poa,")
	.append("  cd.d5,")
	.append("  cd.d5_poa,")
	.append("  cd.d6,")
	.append("  cd.d6_poa,")
	.append("  cd.d7,")
	.append("  cd.d7_poa,")
	.append("  cd.d8,")
	.append("  cd.d8_poa,")
	.append("  cd.d9,")
	.append("  cd.d9_poa,")
	.append("  cd.d10,")
	.append("  cd.d10_poa,")
	.append("  cd.d11,")
	.append("  cd.d11_poa,")
	.append("  cd.d12,")
	.append("  cd.d12_poa,")
	.append("  cd.d13,")
	.append("  cd.d13_poa,")
	.append("  cd.d14,")
	.append("  cd.d14_poa,")
	.append("  cd.d15,")
	.append("  cd.d15_poa,")
	.append("  cd.d16,")
	.append("  cd.d16_poa,")
	.append("  cd.d17,")
	.append("  cd.d17_poa,")
	.append("  cd.d18,")
	.append("  cd.d18_poa,")
	.append("  cd.d19,")
	.append("  cd.d19_poa,")
	.append("  cd.d20,")
	.append("  cd.d20_poa,")
	.append("  cd.d21,")
	.append("  cd.d21_poa,")
	.append("  cd.d22,")
	.append("  cd.d22_poa,")
	.append("  cd.d23,")
	.append("  cd.d23_poa,")
	.append("  cd.d24,")
	.append("  cd.d24_poa,")
	.append("  cd.p1 ,")
	.append("  cd.p1_dt ,")
	.append("  cd.p2 ,")
	.append("  cd.p2_dt ,")
	.append("  cd.p3 ,")
	.append("  cd.p3_dt ,")
	.append("  cd.p4 ,")
	.append("  cd.p4_dt ,")
	.append("  cd.p5 ,")
	.append("  cd.p5_dt ,")
	.append("  cd.p6 ,")
	.append("  cd.p6_dt ,")
	.append("  cd.p7 ,")
	.append("  cd.p7_dt ,")
	.append("  cd.p8 ,")
	.append("  cd.p8_dt ,")
	.append("  cd.p9 ,")
	.append("  cd.p9_dt ,")
	.append("  cd.p10 ,")
	.append("  cd.p10_dt ,")
	.append("  cd.p11 ,")
	.append("  cd.p11_dt ,")
	.append("  cd.p12 ,")
	.append("  cd.p12_dt ,")
	.append("  cd.p13 ,")
	.append("  cd.p13_dt ,")
	.append("  cd.p14 ,")
	.append("  cd.p14_dt ,")
	.append("  cd.p15 ,")
	.append("  cd.p15_dt ,")
	.append("  cd.p16 ,")
	.append("  cd.p16_dt ,")
	.append("  cd.p17 ,")
	.append("  cd.p17_dt ,")
	.append("  cd.p18 ,")
	.append("  cd.p18_dt ,")
	.append("  cd.p19 ,")
	.append("  cd.p19_dt ,")
	.append("  cd.p20 ,")
	.append("  cd.p20_dt ,")
	.append("  cd.p21 ,")
	.append("  cd.p21_dt ,")
	.append("  cd.p22 ,")
	.append("  cd.p22_dt ,")
	.append("  cd.p23 ,")
	.append("  cd.p23_dt ,")
	.append("  cd.p24 ,")
	.append("  cd.p24_dt ,")
	.append("  cd.cnd1 ,")
	.append("  cd.cnd2 ,")
	.append("  cd.cnd3 ,")
	.append("  cd.cnd4 ,")
	.append("  cd.cnd5 ,")
	.append("  cd.ocr1 ,")
	.append("  cd.ocr1_dt ,")
	.append("  cd.ocr2 ,")
	.append("  cd.ocr2_dt ,")
	.append("  cd.ocr3 ,")
	.append("  cd.ocr3_dt ,")
	.append("  cd.ocr4 ,")
	.append("  cd.ocr4_dt ,")
	.append("  cd.ocr5 ,")
	.append("  cd.ocr5_dt ,")
	.append("  cd.val1 ,")
	.append("  cd.val1_amt ,")
	.append("  cd.val2 ,")
	.append("  cd.val2_amt ,")
	.append("  cd.val3 ,")
	.append("  cd.val3_amt ,")
	.append("  cd.val4 ,")
	.append("  cd.val4_amt ,")
	.append("  cd.val5 ,")
	.append("  cd.val5_amt ,")
	.append("  cd.val6 ,")
	.append("  cd.val6_amt ,")
	.append("  cd.val7 ,")
	.append("  cd.val7_amt ,")
	.append("  cd.val8 ,")
	.append("  cd.val8_amt ,")
	.append("  cd.val9 ,")
	.append("  cd.val9_amt ,")
	.append("  cd.val10 ,")
	.append("  cd.val10_amt  ");
	//.append("ORDER BY totalBilledAmount DESC   ");

/**
 * Save.
 *
 * @param <T> the generic type
 * @param dataSet the data set
 */
public <T> void save(T dataSet);

public <T,C> T load(C context);
}
