package com.rs.RailwayReservation_161768;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author v2
 *
 */
@SpringBootApplication(scanBasePackages = { "com.rs.bean", "com.rs.dao", "com.rs.service", "com.rs.controller",
		"com.rs.exception" })
public class Client {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Client.class, args);
	}
}
