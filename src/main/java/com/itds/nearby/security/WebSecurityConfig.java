//package com.itds.nearby.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private UserDetailsService myUserDetailService;
//
//    @Autowired
//    public WebSecurityConfig(UserDetailsService myUserDetailService) {
//        this.myUserDetailService = myUserDetailService;
//    }
//
//    @Bean
//    public AuthenticationProvider authProvider() {
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        provider.setUserDetailsService(myUserDetailService);
//        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//        return provider;
//    }
//
////    final
////    UserDetailsService userDetailsService;
////
////    public WebSecurityConfig(@Qualifier("customUserDetailsService") UserDetailsService userDetailsService) {
////        this.userDetailsService = userDetailsService;
////    }
////
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////
////        auth.inMemoryAuthentication()
////                .withUser("user").password("{noop}password").roles("USER")
////                .and()
////                .withUser("admin").password("{noop}password").roles("USER", "ADMIN");
////
////    }
////
////    @Bean
////    public DaoAuthenticationProvider authenticationProvider() {
////        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
////        authenticationProvider.setUserDetailsService(userDetailsService);
////        return authenticationProvider;
////    }
////
////
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests().antMatchers("/", "/clients")
////                .access("hasRole('USER') or hasRole('ADMIN') or hasRole('DBA')").antMatchers("/**", "/clients")
////                .access("hasRole('ADMIN')").antMatchers("/edit-user-*")
////                .access("hasRole('ADMIN') or hasRole('DBA')").and().formLogin().loginPage("/login")
////                .loginProcessingUrl("/login").usernameParameter("idCli").passwordParameter("password");
////    }
//}
