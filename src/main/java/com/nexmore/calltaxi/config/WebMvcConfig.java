package com.nexmore.calltaxi.config;

import org.apache.catalina.filters.HttpHeaderSecurityFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

import javax.servlet.Filter;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

   /* @Bean
    public FilterRegistrationBean<Filter> getFilterRegistrationBean() {
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<Filter>();

        registrationBean.setOrder(1);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<Filter> httpHeaderSecurityFilter() {
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<Filter>();
        HttpHeaderSecurityFilter httpHeaderSecurityFilter = new HttpHeaderSecurityFilter();
        httpHeaderSecurityFilter.setXssProtectionEnabled(true);
        registrationBean.setFilter(httpHeaderSecurityFilter);
        return registrationBean;
    }
*/

    /*@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**");
    }*/

    /*@Bean
    public SpringResourceTemplateResolver templateResolver(){

        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setPrefix("classpath:static/");
        templateResolver.setSuffix(".html");
        templateResolver.setCharacterEncoding("UTF-8");

        templateResolver.setTemplateMode(TemplateMode.HTML);

        templateResolver.setCacheable(true);
        return templateResolver;
    }*/
    /*@Bean
    public SpringTemplateEngine templateEngine(){

        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        //templateEngine.setTemplateResolver(templateResolver());

        templateEngine.setEnableSpringELCompiler(true);
        return templateEngine;
    }
    @Bean
    public ThymeleafViewResolver viewResolver(){
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());

        viewResolver.setOrder(0);
        viewResolver.setViewNames(new String[] {".html", ".xhtml"});
        return viewResolver;
    }*/
}
