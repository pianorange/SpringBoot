package com.apress.spring;

import com.apress.spring.domain.Journal;
import com.apress.spring.repository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJournalApplication {

	@Bean
	InitializingBean saveData(JournalRepository repo){
		return () -> {
			repo.save(new Journal("스프링부트 입문","오늘부터 스프링 공부를 시작했다","02/20/2017"));
			repo.save(new Journal("할일이 아주많다","많이 졸리다","02/20/2017"));
			repo.save(new Journal("빨리끝내라","언제끝나냐","02/20/2017"));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJournalApplication.class, args);
	}
}
