package com.example.demo;

import java.util.List;

import com.example.demo.repository.VehicleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehicleDatabaseAccessApplication implements CommandLineRunner {
	@Autowired
	private VehicleRepository vehicleRepository;

	public static void main(String[] args) {
		SpringApplication.run(VehicleDatabaseAccessApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// List<Vehicle> vehicles = vehicleRepository.findAll();
		// vehicles.forEach(System.out :: println);
	}
}
