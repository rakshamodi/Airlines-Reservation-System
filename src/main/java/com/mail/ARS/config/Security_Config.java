package com.mail.ARS.config;


import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties.Web.Client.ClientRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Security_Config{

	@Bean
	public UserDetailsService getUserDetailsService() {
		return new User_Details_Service_Impl();
	}

	@Bean
	public BCryptPasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider getDaoAuthProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(getUserDetailsService());
		daoAuthenticationProvider.setPasswordEncoder(getPasswordEncoder());

		return daoAuthenticationProvider;
	}

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.authenticationProvider(getDaoAuthProvider());
//	}
//	
	@Configuration
	@Order(1)
	public static class App1ConfigurationAdapter{
	@Bean
	public SecurityFilterChain filterChainApp1(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().antMatchers("/user*").hasRole("USER").and().formLogin().loginPage("/login").loginProcessingUrl("/dologin").defaultSuccessUrl("/user_home").and().csrf().disable();
		return http.build();
//		http.authorizeRequests().antMatchers("/admin*").hasRole("ADMIN").and().formLogin().loginPage("/adlogin").loginProcessingUrl("/doadlogin").defaultSuccessUrl("/admin_home").and().csrf().disable();
//		return http.build();
		
			}}
//	
//	@Configuration
//	@Order(1)
//	public static class App2ConfigurationAdapter{
//	@Bean
//	public SecurityFilterChain filterChainApp2(HttpSecurity http) throws Exception {
//
////		http.authorizeRequests().antMatchers("/user*").hasRole("USER").and().formLogin().loginPage("/login").loginProcessingUrl("/dologin").defaultSuccessUrl("/user_home").and().csrf().disable();
////		return http.build();
//    	http.authorizeRequests().antMatchers("/admin*").hasRole("ADMIN").and().formLogin().loginPage("/adlogin").loginProcessingUrl("/doadlogin").defaultSuccessUrl("/admin_home").and().csrf().disable();
//		return http.build();
//				
//			}}
		

		
	}

