package br.com.globalti.servicecep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@EnableFeignClients
@SpringBootApplication
@EnableHystrixDashboard
public class ServiceCepApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceCepApplication.class, args);
	}
}
