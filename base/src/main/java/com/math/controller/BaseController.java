package com.math.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.jnlp.IntegrationService;
import java.lang.reflect.Parameter;

/**
 * @author songabao
 * @date 2019/9/2 11:23
 */
@RestController
@RequestMapping(value = "/base")
public class BaseController {
    private final  static Logger log = LoggerFactory.getLogger(BaseController.class);
    /**
     * 求两个非负整数的最大公约数
     */
    public  Integer getGcd(@RequestParam(value = "p") Integer p, @RequestParam(value = "q") Integer q){
            return gcd(p,q);
    }

    /**
     * 判断一个数是否是素数
     * @return
     */
    public static boolean isPrime(int number){
        if (number < 2){
            return  false;
        }
        for (int i =2 ; i* i <= number; i++){
            if (number % i == 0){
                return  false;
            }
        }
        return  true;
    }
    private Integer gcd(Integer p, Integer q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(p, r);
    }
}
