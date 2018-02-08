/**
 * 
 */
package com.doc.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.doc.spring.bean.SimpleBean;

/**
 * @author Elmehdi.zangui
 *
 */
@Configuration
@ComponentScan(basePackages = "com.doc.spring")
//@Profile("default")
@PropertySource("classpath:main.properties")
public class Application {


	@Bean
	public PropertySourcesPlaceholderConfigurer oropertySourcesPlaceholderConfigurer() {
		PropertySourcesPlaceholderConfigurer ps = new PropertySourcesPlaceholderConfigurer();
		return ps;
	}

}