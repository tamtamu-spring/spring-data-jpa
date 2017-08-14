package com.banun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class BanunProjectApplication extends SpringBootServletInitializer{
	
	

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer(){
		return ( container -> {
			ErrorPage custom404Page = new ErrorPage(HttpStatus.NOT_FOUND,"/404_error_page");
			container.addErrorPages(custom404Page);
		});
	}
	
	
    public static void main(String[] args) throws Exception{
        SpringApplication.run(BanunProjectApplication.class, args);
    }
    
}
