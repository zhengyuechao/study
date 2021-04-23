package com.study.controller;

import java.io.File;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.User;
import com.study.exception.BizException;

@RestController
public class TestExceptionController {

	@PostMapping("/add")
	public boolean add(@RequestBody User user) {
	    //如果姓名为空就手动抛出一个自定义的异常！
	    if(user.getUsername()==null){
	        throw  new BizException("-1","用户姓名不能为空！");
	    }
	    return true;
	}
	
	 @PutMapping("/update")
	 public boolean update(@RequestBody User user) {
	     //这里故意造成一个空指针的异常，并且不进行处理
	     String str = null;
	     str.equals("111");
	     return true;
	 }

	 @DeleteMapping("/delete")
	 public boolean delete(@RequestBody User user)  {
	     //这里故意造成一个异常，并且不进行处理
	     Integer.parseInt("abc123");
	     return true;
	 }
	 

	 @DeleteMapping("/delDouble")
	 public boolean delDouble(@RequestBody User user)  {
	     //这里故意造成一个异常，并且不进行处理
	     Double.parseDouble("abc123");
	     return true;
	 }
	 @DeleteMapping("/delFile")
	 public boolean delFile(@RequestBody User user)  {
	     //这里故意造成一个异常，并且不进行处理
	     File file = new File(user.getAddress());
	     return true;
	 }


}
