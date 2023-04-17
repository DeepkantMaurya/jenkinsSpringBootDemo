package com.deepkant.jenkinsSpringBootDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/application")
@CacheConfig(cacheNames = {"default"})
public class ApplicationRestContoller {

	private static final Logger log = LoggerFactory.getLogger(ApplicationRestContoller.class);

	@Cacheable(value ="default" ,key = "#name")
	@GetMapping("/{name}")
	public String getApplication(@PathVariable String name) {

		log.info("ApplicationRestContoller::getApplication:called");

		return "Hello " + name;
	}

}
