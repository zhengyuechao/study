package com.study.common;

public class CCVDConst {
	
	public final static String YES = "是";
	public final static String NO = "否";
	public final static String HAVE = "有";
	public final static String LACK = "无";
	public final static String HIHG_RISK = "高危";
	
	public final static String NORMAL = "普通";
	private final static String SBP_120 = "120";
	private final static String SBP_140 = "140";
	public final static String SBP_160 = "160";
	private final static String SBP_180 = "180";
	private final static String SBP = "130";
	private final static String DBP = "90";
	private final static String CHOL = "6.22";// 检测总胆固醇≥6.22 mmol/L (240 mg/dl)
	// private final static String TRIGLYCERIDE = "2.26";// ≥2.26 mmol/L (200
	// mg/dl)
	// private final static String HDL_C = "1.04";// 高密度脂蛋白＜1.04mmol/L (40
	// mg/dl)
	private final static String GLU_VALUE = "11";// 随机血糖≥7.0mmol/
	// private final static String FBG_VALUE = "7";// 空腹血糖≥7.0mmol/
	// private final static String BMI = "28";// 身体质量指数
	private final static String ECG = "是";// 心电图

	private final static String MALE = "M";
	private final static String FEMALE = "F";
	public final static String CV_LDL_C = "4.14";// 心脑血管常量 低密度脂蛋白
	private final static String CV_HDL_C = "0.78";// 心脑血管常量 高密度脂蛋白
	private final static String CV_SBP = "160";// 心脑血管常量 收缩压
	public final static String CV_DBP = "100";// 心脑血管常量 舒张压

	private final static int CHOL_FOUR = 4;
	private final static int CHOL_FIVE = 5;
	private final static int CHOL_SIX = 6;
	private final static int CHOL_SEVEN = 7;
	private final static int CHOL_EIGHT = 8;

	/**
	 * PC端表单获取值，常量定义比对
	 */

	// 脑卒中
	// part 1
	/** 既往病史 hypertension2 高血压 有 无 */
	private final static String HYPERTENSION2 = "有";

	private final static String HYPERTENSION2_NOT = "无";

	/** 体格检查 avg_sbp 收缩压 140 以上 */
	public final static String AVG_SBP_140 = "140";
	/** 体格检查 avg_dbp 舒张压 90 以上 */
	public final static String AVG_DBP_90 = "90";

	// part2

	/** 既往病史 血脂异常： 是 否 */
	private final static String DYSLIPIDEMIA = "有";
	private final static String DYSLIPIDEMIA_NOT = "无";

	/** 本次检测(实验室检查) chol_value总胆固醇≥6.22 mmol/L (240 mg/dl) */
	public final static String CHOL_VALUE = "6.22";
	/** 本次检测(实验室检查) triglyceride 甘油三酯≥2.26 mmol/L (200 mg/dl) */
	public final static String TRIGLYCERIDE = "2.26";
	/** 本次检测(实验室检查) 高密度脂蛋白＜1.04mmol/L (40 mg/dl) */
	public final static String HDL_C = "1.04";

	// part3
	/** 既往史 糖尿病 有 无 */
	private final static String DIABETES2 = "有";
	/** 本次检测(实验室检查) 空腹血糖≥7.0mmol/L */
	public final static String FBG_VALUE = "7";

	// part4
	/** 既往病史 心脏病 有无 */
	private final static String HEART_DISEASE = "有";
	/** 既往病史 房颤 有 无 */
	private final static String HEART_DISEASE_TYPE_FC = "房颤";
	/** 既往病史 瓣膜性心脏病： 有 无 */
	private final static String HEART_DISEASE_TYPE_BM = "瓣膜性心脏病";
	/** 心电图 本次心电图显示房颤： 有 无 */
	private final static String ATRIAL_FABRILLATION = "是";

	// part5
	/** 生活方式 吸烟史 有 无 除了从不 即可判断有吸烟史 */
	private final static String SMOKE_STATUS = "从不";
	// part6
	/** 体格检查 明显超重或肥胖：是 否 */
	private final static String BMI = "28";
	// part7
	/** 生活方式 运动缺乏(必填)：是 否 */
	private final static String SPARE_TIME_SPORT = "缺乏运动 (不符合上述经常运动标准者）";

	// part8
	/** 家族史 脑卒中家族史： 有 无 */
	private final static String APOPLEXY = "有";

	// part9 脑卒中
	/** 既往病史 既往脑卒中 ： 有 无 高危标识 */
	private final static String CEREBRAL_VASCULAR = "有";

	// part10 脑卒中
	/** 既往病史 ：脑血管类型选择短暂性脑缺血发作（TIA） 有 无 是数组类型 高危标识 */
	private final static String FIRST_MAIN_DIAGNOSES = "短暂性脑缺血发作（TIA）";

	// 心血管病高危
	// part 1 既往病史 心脏病 有无 同 part4 coronary_disease
	private final static String CORONARY_DISEASE_CJ = "陈旧性心肌梗死";
	private final static String CORONARY_DISEASE_JX = "急性心肌梗死";

	// part 2 既往病史 心脏病 有无 同 part4
	/** 手术 血管病变的外科手术或介入治疗情况中10.2介入术PCI是否做过 */
	private final static String PCI = "是";
	// part 3 既往病史 心脏病 有无 同 part4
	/** 手术 接受过冠状动脉搭桥手术（CABG） */
	private final static String CABG = "是";

	// part 4 脑卒中病史 心脏病 有无 同 part9 "cerebral_vascular": "有",

	// part 5
	/** 体格检查5.2现测血压平均值 收缩压 */
	public final static String H_AVG_SBP = "160";// 收缩压>= 160 以上
	/** 体格检查5.2现测血压平均值 舒张压 */
	public final static String H_AVG_DBP = "100";// 舒张压>=100 以上

	/** 6.低密度脂蛋白（LDL-C）>=160mg/dl（4.14mmol/L） */
	public final static String H_LDL_C = "4.14";//
	/** 7.高密度脂蛋白（HDL-C)<=30mg/dl（0.78mmol/L） */
	public final static String H_HDL_C = "0.78";
	
	public final static String ZORE = "0";

}
