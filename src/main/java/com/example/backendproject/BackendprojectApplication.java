package com.example.backendproject;

import com.example.backendproject.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class BackendprojectApplication {
    @Autowired
    UserServiceImpl userService;
    public static void main(String[] args) {
        SpringApplication.run(BackendprojectApplication.class, args);
    }
    @Bean
    BCryptPasswordEncoder getBCE() {
        return new BCryptPasswordEncoder();
    }
  /*  @PostConstruct
    void init_users() {
        //ajouter les rôles
        userService.addRole(new Role(null,"ADMIN"));
        userService.addRole(new Role(null,"USER"));

        //ajouter les users
        userService.saveUser(new User(null,"admin","123",true,null));
        userService.saveUser(new User(null,"nadhem","123",true,null));
        userService.saveUser(new User(null,"yassine","123",true,null));

        //ajouter les rôles aux users
        userService.addRoleToUser("admin", "ADMIN");
        userService.addRoleToUser("admin", "USER");
        userService.addRoleToUser("nadhem", "USER");
        userService.addRoleToUser("yassine", "USER");
    }

   */
  @Bean
  public CorsFilter corsFilter() {
      CorsConfiguration corsConfiguration = new CorsConfiguration();
      corsConfiguration.setAllowCredentials(true);
      corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
      corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
              "Accept", "Authorization", "Origin, Accept", "X-Requested-With",
              "Access-Control-Request-Method", "Access-Control-Request-Headers"));
      corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
              "Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
      corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
      UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
      urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
      return new CorsFilter(urlBasedCorsConfigurationSource);
  }


}
