package cn.hxzy;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("你要生成的表名：");
        String ne = sc.next();
        System.out.println("你要生成的表名：");
        String next = sc.next();
        //创建generator对象
        AutoGenerator autoGenerator=new AutoGenerator();
//配置数据源 DataSourceConfig
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/"+ne+"?useUnicode=true&useSSL=false&characterEncoding=utf8");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("root");
        autoGenerator.setDataSource(dataSourceConfig);

//全局配置 GlobalConfig
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setAuthor("shujun.Meng");
        globalConfig.setOpen(false); //创建好后打开文件夹
        globalConfig.setFileOverride(false);//是否覆盖原来生成的代码
        globalConfig.setServiceName("%sService");//生成的service里面没有I的前缀
        globalConfig.setSwagger2(true);
        globalConfig.setDateType(DateType.ONLY_DATE);
        autoGenerator.setGlobalConfig(globalConfig);

//包信息
        PackageConfig packageConfig=new PackageConfig();
        packageConfig.setParent("cn.hxzy");
        packageConfig.setModuleName(null);
        packageConfig.setController("controller");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setMapper("mapper");
        packageConfig.setEntity("pojo");
//packageConfig.setXml("mapper.xml");
        autoGenerator.setPackageInfo(packageConfig);
//配置策略
        StrategyConfig strategyConfig=new StrategyConfig();
        strategyConfig.setEntityLombokModel(true);//添加Lombok注解
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);//下划线转驼峰
        strategyConfig.setInclude(next);
        autoGenerator.setStrategy(strategyConfig);
//执行
        autoGenerator.execute();
    }
}
