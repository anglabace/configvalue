package com.configvalue.demo.controller;

import com.configvalue.demo.constant.ConfigValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Resource
    private ConfigValue configValue;

    @Resource
    private Environment environment;

    //读取变量imagesUrlHost
    @Value("${app.goods.imagesUrlHost}")
    private String imagesUrlHost;

    //打印从配置文件中读取到的变量值
    @GetMapping("/home")
    @ResponseBody
    public String home() {

        String res = "第一种方法:"+imagesUrlHost+":<br/>";
        res += "第二种方法:"+configValue.imagesUrlHost+":<br/>";
        res += "第三种方法:"+environment.getProperty("app.goods.imagesUrlHost")+":<br/>";

        return res;
    }
}
