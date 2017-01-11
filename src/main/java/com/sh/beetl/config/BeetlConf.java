package com.sh.beetl.config;

import org.beetl.core.resource.ClasspathResourceLoader;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*@Configuration
public class BeetlConf {

        @Value("${beetl.templatesPath}") String templatesPath;//模板跟目录 
        @Bean(initMethod = "init", name = "beetlConfig")
        public BeetlGroupUtilConfiguration getBeetlGroupUtilConfiguration() {
                BeetlGroupUtilConfiguration beetlGroupUtilConfiguration = new BeetlGroupUtilConfiguration();
                try {
                        ClasspathResourceLoader cploder = new ClasspathResourceLoader();
                        beetlGroupUtilConfiguration.setResourceLoader(cploder);
                        return beetlGroupUtilConfiguration;
                } catch (Exception e) {
                        throw new RuntimeException(e);
                }

        }

        @Bean(name = "beetlViewResolver")
        public BeetlSpringViewResolver getBeetlSpringViewResolver(@Qualifier("beetlConfig") BeetlGroupUtilConfiguration beetlGroupUtilConfiguration) {
                BeetlSpringViewResolver beetlSpringViewResolver = new BeetlSpringViewResolver();
                beetlSpringViewResolver.setPrefix("/");
                beetlSpringViewResolver.setSuffix(".html");
                beetlSpringViewResolver.setContentType("text/html;charset=UTF-8");
                beetlSpringViewResolver.setOrder(0);
                beetlSpringViewResolver.setConfig(beetlGroupUtilConfiguration);
                return beetlSpringViewResolver;
        }

 }
*/