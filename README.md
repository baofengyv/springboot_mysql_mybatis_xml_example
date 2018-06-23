# springboot_mysql_mybatis_xml_example
spring boot mysql mybatis xml example

极简化的 

    spring boot + 
    mybatis(使用XML mapper) +
    mysql + 
    maven mybatis generator plugin

> 打war包部署到Tomcat说明
    
    1 使用 mvn package 命令打成war包。
    2 直接部署到Tomcat 8+ 上即可。
      ！如果是部署到Tomcat 7 上需要下载javax.el-api-3.0.0，添加到Tomcat的lib中。