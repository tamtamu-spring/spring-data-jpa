package com.banun.config;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.banun.service.UserServiceImpl.UserSecurityService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private Environment env;

    @Autowired
    private UserSecurityService userSecurityService;

    private static final String SALT = "salt"; // Salt should be protected carefully

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));
    }
  
    private static final String[] SECURE_AUTHENTICATION_MATCHERS = {
      		
            "/bankingHome",
            "/primaryAccount","/savingsAccount","/deposit","/withdraw",
            "/user/profile",
            "/betweenAccounts","/recipient","/save","/edit","/delete","/toSomeoneElse",
            "/create"
    }; 
    

    private static final String[] PUBLIC_MATCHERS = {
            "/webjars/**",
            "/assets/**",
            "/css/**",
            "/fonts/**",
            "/js/**",
            "/images/**",
            "/",
            "/**",
            "/error/**/*",
            "/console/**"
    };
    
    private static final String[] SECURE_CHANNEL_MATCHERS = {
            "/index",
            "/signup",
            "/login",      		
            "/bankingHome/**","/bankingHome",
            "/primaryAccount","/savingsAccount","/deposit","/withdraw",
            "/user/profile",
            "/betweenAccounts","/recipient","/save","/edit","/delete","/toSomeoneElse",
            "/create",
            "/contact-us","/contact-us-2","/contact-us-3","/contact-us-4",
            "/shop-full-width","/shop-home","/shop-product-full-width","/shop-product-sidebar","/shop-sidebar",            
            "/shop-cart","/shop-cc-pay",            
            
    };     
    
    private static final String[] INSECURE_CHANNEL_MATCHERS = {
    		
      		"/","/home",
            "/blog-full-width","/blog-left-sidebar","/blog-masonry-full-width","/blog-masonry-sidebar","/blog-masonry","/blog-right-sidebar","/blog-single-sidebar-left","/blog-single-sidebar-no","/blog-single-sidebar-right","/blog-timeline",
            "/church-home__","/college-home",
            "/email-template",
            "/feature-animations","/feature-content-carousel","/feature-grid-system","/feature-icons","/feature-pricing-tables","/feature-testimonials","/feature-typograpy",
            "/header-1","/header-2","/header-3","/header-4",
            "/index-dark","/index-extended","/index-minimal","/index-more",
            "/magazine-category","/magazine-home","/magazine-single",
            "/medical-home",
            "/onepage-revolution","/onepage-superslides",
            "/page-about-me","/page-about-us",
            "/page-coming-soon-image","/page-coming-soon-video",
            "/page-empty","/page-faq","/page-full-width",
            "/page-header-basic","/page-header-delayed-parallax","/page-header-image","/page-header-overlay1","/page-header-overlay2","/page-header-overlay3","/page-header-standard-parallax",
            "/page-invoice","/page-pricing-extended","/page-pricing","/page-privacy-policy","/page-terms-and-conditions",
            "/page-left-sidebar","/page-right-sidebar",
            "/page-maintenance",
            "/page-services",
            "/page-sitemap",
            "/page-support",
            "/page-team",
            "/page-testimonials",
            "/portfolio-2-columns","/portfolio-3-columns","/portfolio-4-columns","/portfolio-full-center","/portfolio-full-width","/portfolio-home","/portfolio-lightbox","/portfolio-single-extended","/portfolio-single-full-slider","/portfolio-single-sidebar","/portfolio-single",
            "/realestate-home","/realestate-list","/realestate-single",
            "/revolution-video","/revolution-full-slider","/revolution-half-slider","/revolution-ken-burns","/revolution-official-1","/revolution-official-2","/revolution-official-3","/revolution-official-4","/revolution-official-5","/revolution-official-6","/revolution-official-7","/revolution-official-8","/revolution-official-9","/revolution-official-10","/revolution-official-11","/revolution-official-12","/revolution-official-13","/revolution-official-14","/revolution-official-15","/revolution-official-16","/revolution-official-17",
            "/shortcodes-alerts","/shortcodes-buttons","/shortcodes-callouts","/shortcodes-carousel","/shortcodes-counters","/shortcodes-dividers","/shortcodes-editor","/shortcodes-forms","/shortcodes-icons-and-boxes","/shortcodes-lightbox","/shortcodes-modal-ajax-test","/shortcodes-modals","/shortcodes-progress-bars","/shortcodes-rows","/shortcodes-tables","/shortcodes-tabs-and-accordions","/shortcodes-toggles","shortcodes-tooltips-and-popover","/shortcodes-video",
            "/superslides-slider-full","/superslides-slider-half","/superslides-video-full","/superslides-video"

    };   
    

    @Override
    protected void configure(HttpSecurity http) throws Exception {
            	
    	http  
                .csrf().disable().cors().disable()
                .headers().httpStrictTransportSecurity().disable()
                
                .and().requiresChannel()
                .antMatchers(SECURE_CHANNEL_MATCHERS).requiresSecure()
    	        .antMatchers(INSECURE_CHANNEL_MATCHERS).requiresInsecure()
                
                .and().authorizeRequests()
                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
                .antMatchers(SECURE_AUTHENTICATION_MATCHERS).authenticated()
                .antMatchers(PUBLIC_MATCHERS).permitAll().anyRequest().authenticated()
                
                .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/index?logout").deleteCookies("remember-me").permitAll()
                .and().exceptionHandling().accessDeniedPage("/customError")
                .and().formLogin().loginPage("/index").defaultSuccessUrl("/bankingHome").failureUrl("/index?error").usernameParameter("username").passwordParameter("password").permitAll()
                
                .and().rememberMe();

    }
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userSecurityService).passwordEncoder(passwordEncoder());
    }


}
