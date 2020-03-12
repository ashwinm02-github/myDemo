package com.myApp.MyDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDemoApplication.class, args);
		//int ans = myfun("100110");
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}


//	public static int myfun(String s) {
//		int count = 0,i=0,j=0;
//		char[] c=s.toCharArray();
//		char[] temp=new char[s.length()];
//
//		for (int i=0;i<temp.length;i++){
//			temp[i]='0';
//		}
//		while(i!=temp.length){
//			if(c[i]!=temp[j]){
//
//			}
//		}
//
//		return count;
//	}
}