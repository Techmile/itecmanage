package com.tecsmile;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j

@SpringBootApplication
public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
		log.info("---Service started successfully, Time: "
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:ms").format(new Date()) + "---");
	}
}
