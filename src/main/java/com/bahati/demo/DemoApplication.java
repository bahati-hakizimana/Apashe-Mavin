package com.bahati.demo;

import com.bahati.demo.services.ColorPrinter;
import com.bahati.demo.services.impl.ColorPrinterImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private ColorPrinter colorPrinter;

	public DemoApplication (ColorPrinter colorPrinter) {
		this.colorPrinter = colorPrinter;
	}

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		log.info(colorPrinter.print());
	}

}
