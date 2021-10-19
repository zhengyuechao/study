package com.study.common.enums;

public enum CCVDEnum {

	YES("是", 1),
    NO("否", 2),
    HAVE("有",3),
    LACK("无", 4),
    
    //数值
    HIHG_RISK("高危"),
	NORMAL("普通"),
	SBP_120("120"),
	SBP_140("140"),
	SBP_160("160"),
	SBP_180("180"),
	SBP("130"),
	DBP("90"),
	CHOL("6.22"),// 检测总胆固醇≥6.22 mmol/L (240 mg/dl)
	// TRIGLYCERIDE("2.26"),// ≥2.26 mmol/L (200
	// mg/dl)
	// HDL_C("1.04"),// 高密度脂蛋白＜1.04mmol/L (40
	// mg/dl)
	GLU_VALUE("11"),// 随机血糖≥7.0mmol/
	// FBG_VALUE("7"),// 空腹血糖≥7.0mmol/
	// BMI("28"),// 身体质量指数
	ECG("是"),// 心电图

	MALE("M"),
	FEMALE("F"),
	CV_LDL_C("4.14"),// 心脑血管常量 低密度脂蛋白
	CV_HDL_C("0.78"),// 心脑血管常量 高密度脂蛋白
	CV_SBP("160"),// 心脑血管常量 收缩压
	CV_DBP("100"),// 心脑血管常量 舒张压

	CHOL_FOUR(4),
	CHOL_FIVE(5),
	CHOL_SIX(6),
	CHOL_SEVEN(7),
	CHOL_EIGHT(8),

	/**
	 * PC端表单获取值，常量定义比对
	 */

	// 脑卒中
	// part 1
	/** 既往病史 hypertension2 高血压 有 无 */
	HYPERTENSION2("有"),

	HYPERTENSION2_NOT("无"),

	/** 体格检查 avg_sbp 收缩压 140 以上 */
	AVG_SBP_140("140"),
	/** 体格检查 avg_dbp 舒张压 90 以上 */
	AVG_DBP_90("90"),

	// part2

	/** 既往病史 血脂异常： 是 否 */
	DYSLIPIDEMIA("有"),
	DYSLIPIDEMIA_NOT("无"),

	/** 本次检测(实验室检查) chol_value总胆固醇≥6.22 mmol/L (240 mg/dl) */
	CHOL_VALUE("6.22"),
	/** 本次检测(实验室检查) triglyceride 甘油三酯≥2.26 mmol/L (200 mg/dl) */
	TRIGLYCERIDE("2.26"),
	/** 本次检测(实验室检查) 高密度脂蛋白＜1.04mmol/L (40 mg/dl) */
	HDL_C("1.04"),

	// part3
	/** 既往史 糖尿病 有 无 */
	DIABETES2("有"),
	/** 本次检测(实验室检查) 空腹血糖≥7.0mmol/L */
	FBG_VALUE("7"),

	// part4
	/** 既往病史 心脏病 有无 */
	HEART_DISEASE("有"),
	/** 既往病史 房颤 有 无 */
	HEART_DISEASE_TYPE_FC("房颤"),
	/** 既往病史 瓣膜性心脏病： 有 无 */
	HEART_DISEASE_TYPE_BM("瓣膜性心脏病"),
	/** 心电图 本次心电图显示房颤： 有 无 */
	ATRIAL_FABRILLATION("是"),

	// part5
	/** 生活方式 吸烟史 有 无 除了从不 即可判断有吸烟史 */
	SMOKE_STATUS("从不"),
	// part6
	/** 体格检查 明显超重或肥胖：是 否 */
	BMI("28"),
	// part7
	/** 生活方式 运动缺乏(必填)：是 否 */
	SPARE_TIME_SPORT("缺乏运动 (不符合上述经常运动标准者）"),

	// part8
	/** 家族史 脑卒中家族史： 有 无 */
	APOPLEXY("有"),

	// part9 脑卒中
	/** 既往病史 既往脑卒中 ： 有 无 高危标识 */
	CEREBRAL_VASCULAR("有"),

	// part10 脑卒中
	/** 既往病史 ：脑血管类型选择短暂性脑缺血发作（TIA） 有 无 是数组类型 高危标识 */
	FIRST_MAIN_DIAGNOSES("短暂性脑缺血发作（TIA）"),

	// 心血管病高危
	// part 1 既往病史 心脏病 有无 同 part4 coronary_disease
	CORONARY_DISEASE_CJ("陈旧性心肌梗死"),
	CORONARY_DISEASE_JX("急性心肌梗死"),

	// part 2 既往病史 心脏病 有无 同 part4
	/** 手术 血管病变的外科手术或介入治疗情况中10.2介入术PCI是否做过 */
	PCI("是"),
	// part 3 既往病史 心脏病 有无 同 part4
	/** 手术 接受过冠状动脉搭桥手术（CABG） */
	CABG("是"),

	// part 4 脑卒中病史 心脏病 有无 同 part9 "cerebral_vascular": "有",

	// part 5
	/** 体格检查5.2现测血压平均值 收缩压 */
	H_AVG_SBP("160"),// 收缩压>= 160 以上
	/** 体格检查5.2现测血压平均值 舒张压 */
	H_AVG_DBP("100"),// 舒张压>=100 以上

	/** 6.低密度脂蛋白（LDL-C）>=160mg/dl（4.14mmol/L） */
	H_LDL_C("4.14"),//
	/** 7.高密度脂蛋白（HDL-C)<=30mg/dl（0.78mmol/L） */
	H_HDL_C("0.78"),
	
	ZORE("0");


    // 成员变量
    private String name;
    private int index;

    // 构造方法
    private CCVDEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }

    // 普通方法
    public static String getName(int index) {
        for (CCVDEnum c : CCVDEnum.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
