package com.zawadal.plurarsightspringcloudm2configservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PlurarsightSpringcloudM2ConfigserverGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlurarsightSpringcloudM2ConfigserverGitApplication.class, args);
	}

}

