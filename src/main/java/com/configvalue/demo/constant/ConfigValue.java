package com.configvalue.demo.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class ConfigValue {

    @Value("${app.goods.imagesUrlHost}")
    public String imagesUrlHost;

    @Value("${app.goods.imagesOrigDir}")
    public String imagesOrigDir;

    @Value("${app.goods.imagesTmbDir}")
    public String imagesTmbDir;

}