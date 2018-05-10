package com.habilmohammed.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.habilmohammed.spring.basics.springin5steps.scope.PersonDao;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	
	public static void main(String[] args) {
	
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		PersonDao personDao = applicationContext.getBean(PersonDao.class);
		PersonDao personDao2 = applicationContext.getBean(PersonDao.class);
		
		logger.info("{}", personDao);
		logger.info("{}", personDao.getJdbcConnection());
		
		logger.info("{}", personDao2);
		logger.info("{}", personDao2.getJdbcConnection());
				
	}
}
