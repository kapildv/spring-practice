package com.habilmohammed.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:app.properties")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	@Value("${external.hello.test}")
	private String property;
	
	public int binarySearch(int[] numbers, int numberToSearch) {
		System.out.println(sortAlgorithm);
		return sortAlgorithm.sort();
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("Inside post construct!!!");
		logger.debug("properties from app.properties - {}", property);
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("Inside pre destroy!!!");
	}
	
}
