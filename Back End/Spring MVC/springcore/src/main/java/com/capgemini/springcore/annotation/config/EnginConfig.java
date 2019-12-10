package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotation.beans.Isuzu;
import com.capgemini.springcore.annotation.beans.VolsWagon;
import com.capgemini.springcore.interfaces.Engine;

@Configuration
public class EnginConfig {

		@Bean(name="iSuzu")
		@Primary
		public Engine getIsuzu() {
			return new Isuzu();
		}
		
		@Bean(name="vw")
		public Engine getVW() {
			return new VolsWagon();
		}
}//End of class
