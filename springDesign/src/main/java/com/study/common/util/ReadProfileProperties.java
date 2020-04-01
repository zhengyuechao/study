package com.study.common.util;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import lombok.Data;


@PropertySource("classpath:application-prod.yml")
@ConfigurationProperties("my-profile")
@Component
@Validated
@Data
public class ReadProfileProperties {

	@NotEmpty
	private String name;

	@Email
	@NotEmpty
	private String email;

	// 配置文件中没有读取到的话就用默认值 
	private Boolean handsome = Boolean.TRUE;

}
