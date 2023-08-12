package com.practice.restapijpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiJpaApplication implements CommandLineRunner {

	@Autowired
	BankRepository bankRepository;

	@Value("${spring.datasource.password}")
	String pass;

	public static void main(String[] args) {
		SpringApplication.run(RestApiJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Bank bank = new Bank();
		bank.setBankName("SBI");

		//bankRepository.save(bank);

		System.out.println(pass);
		System.out.println(bankRepository.getAllBank());

	}
}
