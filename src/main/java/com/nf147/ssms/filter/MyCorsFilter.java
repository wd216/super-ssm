package com.nf147.ssms.filter;


import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Collections;

public class MyCorsFilter extends CorsFilter {
    public MyCorsFilter() {
        super(configurationSource());
    }

    private static UrlBasedCorsConfigurationSource configurationSource() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration config = new CorsConfiguration();
        config.setAllowedOrigins(Collections.singletonList("http://domain.com"));
        config.setAllowCredentials(true);

        CorsConfiguration config2 = new CorsConfiguration();
        config2.setAllowedOrigins(Collections.singletonList("http://domain.com"));
        config2.setAllowCredentials(true);

        source.registerCorsConfiguration("/**", config);
        source.registerCorsConfiguration("/xxx", config2);

        return source;
    }
}