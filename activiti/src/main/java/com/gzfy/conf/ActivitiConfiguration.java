package com.gzfy.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;

/**
 * Created by gac on 2017/1/10.
 */
@Configuration
@ImportResource(value = {"classpath:spring-activiti.xml"})
public class ActivitiConfiguration extends AnnotationMethodHandlerAdapter {

    @Bean
    public FormHttpMessageConverter formHttpMessageConverter() {
        FormHttpMessageConverter formHttpMessageConverter = new FormHttpMessageConverter();
        return formHttpMessageConverter;
    }

}
