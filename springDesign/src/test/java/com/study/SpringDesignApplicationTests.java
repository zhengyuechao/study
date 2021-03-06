package com.study;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.study.common.util.ReadWeixinConfig;
import com.study.demo.springPublishEvent.MyService;
import com.study.service.buy.OrderService;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import cn.smallbun.screw.core.Configuration;
import cn.smallbun.screw.core.engine.EngineConfig;
import cn.smallbun.screw.core.engine.EngineFileType;
import cn.smallbun.screw.core.engine.EngineTemplateType;
import cn.smallbun.screw.core.execute.DocumentationExecute;
import cn.smallbun.screw.core.process.ProcessConfig;

@SpringBootTest
class SpringDesignApplicationTests {

	/*
	 * https://github.com/pingfangushi/screw  参考网址
	 */
	
	@Autowired
	MyService myservice;

	@Autowired
	OrderService orderService;
	@Autowired
    private ReadWeixinConfig weiXinPayConfig;
	@Autowired
	private com.study.common.util.ReadProfileProperties profileProperties;

	@Autowired
    ApplicationContext applicationContext;
	@Test
	public void contextLoads()   {
		/*
		 * myservice.read("hello world"); OrderInfo o =new
		 * OrderInfo("20191231","phone","1000$"); orderService.prepareOrder(o,
		 * "promotion3");
		 */
		//personService.sayHello();
//		System.out.println(weiXinPayConfig);
//		System.out.println(weiXinPayConfig.getAppid());
//		System.out.println(weiXinPayConfig.getMch_id());
//		System.out.println(weiXinPayConfig.getSign_key());
//		System.out.println(profileProperties);
//        System.out.println(profileProperties.getName());
//        System.out.println(profileProperties.getEmail());
//        
//        System.out.println(profileProperties.getHandsome());
		 
		
		//数据源
	    HikariConfig hikariConfig = new HikariConfig();
	    //Mysql
	    //hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    //hikariConfig.setJdbcUrl("jdbc:mysql://172.16.140.130:3306/senyint_sick_platform?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC");
	    //hikariConfig.setUsername("root");
	    //hikariConfig.setPassword("root");
	    
	    //ORACLE
	    hikariConfig.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	    hikariConfig.setJdbcUrl("jdbc:oracle:thin:@172.16.140.130:1521:orcl");
	    hikariConfig.setUsername("senyintccvd");
	    hikariConfig.setPassword("senyintccvd");
	    //设置可以获取tables remarks信息
	    hikariConfig.addDataSourceProperty("useInformationSchema", "true");
	    hikariConfig.setMinimumIdle(2);
	    hikariConfig.setMaximumPoolSize(5);
	    DataSource dataSource = new HikariDataSource(hikariConfig);

	    //生成配置
	    EngineConfig engineConfig = EngineConfig.builder()
	            //生成文件路径
	            .fileOutputDir("F://oraclehtml")
	            //打开目录
	            .openOutputDir(true)
	            //生成文件类型：HTML
	            .fileType(EngineFileType.HTML)
	            //生成模板实现
	            .produceType(EngineTemplateType.freemarker)
	            .build();

	    //忽略表
	    ArrayList<String> ignoreTableName = new ArrayList<>();
	    ignoreTableName.add("test_user");
	    ignoreTableName.add("test_group");
	    //忽略表前缀
	    ArrayList<String> ignorePrefix = new ArrayList<>();
	    ignorePrefix.add("test_");
	    //忽略表后缀
	    ArrayList<String> ignoreSuffix = new ArrayList<>();
	    ignoreSuffix.add("_test");
	    ProcessConfig processConfig = ProcessConfig.builder()
	            //指定生成逻辑、当存在指定表、指定表前缀、指定表后缀时，将生成指定表，其余表不生成、并跳过忽略表配置
	            //根据名称指定表生成
	            .designatedTableName(new ArrayList<>())
	            //根据表前缀生成
	            .designatedTablePrefix(new ArrayList<>())
	            //根据表后缀生成
	            .designatedTableSuffix(new ArrayList<>())
	            //忽略表名
	            .ignoreTableName(ignoreTableName)
	            //忽略表前缀
	            .ignoreTablePrefix(ignorePrefix)
	            //忽略表后缀
	            .ignoreTableSuffix(ignoreSuffix).build();
	    //配置
	    Configuration config = Configuration.builder()
	            //版本
	            .version("1.0.0")
	            //描述,文档名称
	            .description("数据库设计文档生成")
	            //数据源
	            .dataSource(dataSource)
	            //生成配置
	            .engineConfig(engineConfig)
	            //生成配置
	            .produceConfig(processConfig)
	            .build();
	    //执行生成
	    new DocumentationExecute(config).execute();
	}
	/**
     * 配置想要生成的表+ 配置想要忽略的表
     *
     * @return 生成表配置
     */
    public static ProcessConfig getProcessConfig() {
        // 忽略表名
        List<String> ignoreTableName = Arrays.asList("a", "test_group");
        // 忽略表前缀，如忽略a开头的数据库表
        List<String> ignorePrefix = Arrays.asList("a", "t");
        // 忽略表后缀
        List<String> ignoreSuffix = Arrays.asList("_test", "czb_");
        return ProcessConfig.builder()
                //根据名称指定表生成
                .designatedTableName(Arrays.asList("fire_user"))
                //根据表前缀生成
                .designatedTablePrefix(new ArrayList<>())
                //根据表后缀生成
                .designatedTableSuffix(new ArrayList<>())
                //忽略表名
                .ignoreTableName(ignoreTableName)
                //忽略表前缀
                .ignoreTablePrefix(ignorePrefix)
                //忽略表后缀
                .ignoreTableSuffix(ignoreSuffix).build();
    }

}
