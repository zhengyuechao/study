package com.study.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.common.util.DateUtils;
import com.study.common.util.HttpUtil;
import com.study.common.util.RandomUtil;
import com.study.entity.Province;



@Controller
public class EchartController {

	@RequestMapping("/getdata")
    @ResponseBody
    public List<Province> showData(){
        List<Province> provinceArrayList = new ArrayList<>();
        provinceArrayList = listPro();
        return provinceArrayList;
    }
    @RequestMapping("/init")
    public String index(){
        return "breakline";
    }
    
    private List<Province> listPro() {
    	List<Province> provinceArrayList = new ArrayList<>();
    	// 根据字符串数组，返回省份
    	String[] provinces = { ("北京"), ("天津"), ("上海"), ("重庆"), ("河北"), ("山西"), ("辽宁"), ("吉林"), ("黑龙江"), ("江苏"), ("浙江"),
    			("安徽"), ("福建"), ("江西"), ("山东"), ("河南"), ("湖北"), ("湖南"), ("广东"), ("海南"), ("四川"), ("贵州"), ("云南"), ("陕西"),
    			("甘肃"), ("青海"), ("台湾"), ("广西"), ("内蒙"), ("西藏"), ("宁夏"), ("新疆") };
    	List<String> listYear = getListYear();
    		for (String province : provinces) {
    			Province obj = new Province();
    			obj.setName(province);
    			obj.setNums(Integer.parseInt(RandomUtil.getRandomInteger(6)));
    			obj.setProvince(province);
    			provinceArrayList.add(obj);
    		}
    	
    	return provinceArrayList;
    	
    }
    @RequestMapping("/getdatayear")
    @ResponseBody
	private List<Province> listProYear(){
		List<Province> provinceArrayList = new ArrayList<>();
		// 根据字符串数组，返回省份
		String[] provinces = { ("北京"), ("天津"), ("上海"), ("重庆"), ("河北"), ("山西"), ("辽宁"), ("吉林"), ("黑龙江"), ("江苏"), ("浙江"),
    			("安徽"), ("福建"), ("江西"), ("山东"), ("河南"), ("湖北"), ("湖南"), ("广东"), ("海南"), ("四川"), ("贵州"), ("云南"), ("陕西"),
    			("甘肃"), ("青海"), ("台湾"), ("广西"), ("内蒙"), ("西藏"), ("宁夏"), ("新疆")  };
		List<String> listYear = getListYear();
		for (String string : listYear) {
			for (String province : provinces) {
				Province obj = new Province();
				obj.setName(province);
				obj.setNums(Integer.parseInt(RandomUtil.getRandomInteger(6)));
				obj.setYear(string);
				obj.setProvince(province);
				provinceArrayList.add(obj);
			}
		}

		return provinceArrayList;

	}
    @RequestMapping("/getyeardata")
    @ResponseBody
	private List<Province> getyeardata(){
		List<Province> provinceArrayList = new ArrayList<>();
		// 根据字符串数组，返回省份
		String[] provinces = { ("北京"), ("天津"), ("上海"), ("重庆"), ("河北"), ("山西"), ("辽宁"), ("吉林"), ("黑龙江"), ("江苏"), ("浙江"),
				("安徽"), ("福建"), ("江西"), ("山东"), ("河南"), ("湖北"), ("湖南"), ("广东"), ("海南"), ("四川"), ("贵州"), ("云南"), ("陕西"),
				("甘肃"), ("青海"), ("台湾"), ("广西"), ("内蒙"), ("西藏"), ("宁夏"), ("新疆") };
		List<String> listYear = getListYear();
		for (String string : listYear) {
			for (String province : provinces) {
				Province obj = new Province();
				obj.setName(province);
				obj.setNums(Integer.parseInt(RandomUtil.getRandomInteger(6)));
				obj.setYear(string);
				obj.setProvince(province);
				provinceArrayList.add(obj);
			}
		}

		return provinceArrayList;

	}
	
	private List<String> getListYear(){
		List<String> listYear = new ArrayList<>();
		
		//String year = DateUtils.getDate(DateUtils.nextYear(1),DateUtils.PUBLIC_YYYY);
		for (int i = 0; i < 50; i++) {
			String year = DateUtils.getDate(DateUtils.nextYear(i),DateUtils.PUBLIC_YYYY);
			listYear.add(year);
		}
		for (String string : listYear) {
			System.out.println(string);
		}
		return listYear;
	}
    
    public static void main(String[] args) throws Exception {
    	//String url = "https://api.xiaohuwei.cn/test.php?type=province";
//    	String url = "https://api.xiaohuwei.cn/test.php?type=city&pid=10120";
//    	String result = HttpUtil.httpGet(url);
//    	System.out.println(result);
    	System.out.println(DateUtils.getDate(DateUtils.nextYear(-100),DateUtils.PUBLIC_YYYY));
    	List<String> listYear = new ArrayList<>();
		
		//String year = DateUtils.getDate(DateUtils.nextYear(1),DateUtils.PUBLIC_YYYY);
		for (int i = 0; i < 50; i++) {
			String year = DateUtils.getDate(DateUtils.nextYear(i),DateUtils.PUBLIC_YYYY);
			listYear.add(year);
		}
		for (String string : listYear) {
			System.out.println(string);
		}
    	List<Province> provinceArrayList = new ArrayList<>();
		// 根据字符串数组，返回省份
		String[] provinces = { ("北京"), ("天津"), ("上海"), ("重庆"), ("河北"), ("山西"), ("辽宁"), ("吉林"), ("黑龙江"), ("江苏"), ("浙江"),
				("安徽"), ("福建"), ("江西"), ("山东"), ("河南"), ("湖北"), ("湖南"), ("广东"), ("海南"), ("四川"), ("贵州"), ("云南"), ("陕西"),
				("甘肃"), ("青海"), ("台湾"), ("广西"), ("内蒙"), ("西藏"), ("宁夏"), ("新疆") };
		for (String string : listYear) {
			for (String province : provinces) {
				Province obj = new Province();
				obj.setName(province);
				obj.setNums(Integer.parseInt(RandomUtil.getRandomInteger(6)));
				obj.setYear(string);
				obj.setProvince(province);
				provinceArrayList.add(obj);
			}
		}
    	
	}
    
}
