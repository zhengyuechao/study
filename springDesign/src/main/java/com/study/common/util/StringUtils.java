package com.study.common.util;

import java.util.ArrayList;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
/**
 * 
 * @author z
 *
 */
public class StringUtils {
	
	
	public static void main(String[] args) {
		String a = "20201118|752|752201113751510009|18026579517|YD4G03-463-1-4|支付宝|83000334488093|199|(后付费)5G畅享融合199元套餐|1|20201114|20201114|4G|华为|HW-RNE AL00||||||||";
		ArrayList<String> out = splitVerticalBar(a);
		System.out.println(out);
		System.out.println(out.size());
		
	}
	/**
	 * 竖线分解 20201126
	 * @param str
	 * @return
	 */
	public static ArrayList<String> splitVerticalBar(String str) {
		ArrayList<String> strings = Lists.newArrayList(Splitter.on("|").omitEmptyStrings().trimResults().split(str));
		return strings;
		
	}

}
