package com.idat.MicroservicioHospedaje;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EfBrianAlbitesMicroservicioHospedajeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfBrianAlbitesMicroservicioHospedajeApplication.class, args);
	}

}
