package com.darus.jwtdemospring.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import com.darus.jwtdemospring.security.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class securityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsServiceImpl servicioUsuarioDetallado;
	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
//		auth.inMemoryAuthentication().passwordEncoder(codificador()).withUser("lucas").password("$2a$10$ShwnwGDNRvqaXdnI4GsGFOVjwpx6i.n79XOcdVGsN6fcYepYRtMr6").roles("ADMIN");
		auth.userDetailsService(servicioUsuarioDetallado).passwordEncoder(codificador());
	}
	
/*	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
//		web.ignoring().antMatchers("/css/**", "/js/**");
	} */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
//			.addFilterBefore(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class) //Filtro ANTES
			.authorizeRequests()
			.antMatchers(HttpMethod.POST, "/oauth/token").permitAll()
//			.antMatchers(HttpMethod.POST, "/login").permitAll()
			.anyRequest().authenticated()
			.and()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
            
            
		//        CONFIGURACION CORS FUNCIONA (PERO VOY A PROBAR OTRA)
/*			.and()
			.formLogin().successHandler(new AuthenticationSuccess()); 
		http.cors(c ->{
			CorsConfigurationSource cs = r -> {
				CorsConfiguration cc = new CorsConfiguration();
				cc.setAllowedOrigins(List.of("http://localhost:4200"));
				cc.setAllowedHeaders(List.of("Content-Type","Authorization","Access-Control-Allow-Origin"
						,"Origin","Access-Control-Allow-Methods","Access-Control-Allow-Headers",
						"Access-Control-Max-Age","Access-Control-Expose-Headers", "Set-Cookie"));
				cc.setAllowedMethods(List.of("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS"));
				return cc;
			};
			c.configurationSource(cs);
		});  */
	}
/*	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/*")
				.allowedOrigins("*")
				.allowedHeaders("Authorization","Origin","Access-Control-Allow-Methods","Access-Control-Allow-Headers","Access-Control-Max-Age")
				.allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS");
//				.allowCredentials(false).maxAge(3600);
			}
		};
	} */
	
	@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManager();
	}
	
	
	@Bean public BCryptPasswordEncoder codificador() { 
		return new BCryptPasswordEncoder(); 
	}
	 
	
}
