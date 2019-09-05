package com.math.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


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

    /**
     * 计算平方根（牛顿迭代法）
     * @return
     */
    public static  double sqrt( double number){
        if (number < 0){
            return  Double.NaN;
        }
        double err = 0.001;//精确度
        double t = number;
        while (Math.abs(t-number/t) > err*t){
            t = (number/t+t)/2.0;
        }
        return t;
    }

    /**
     * 求直角三角形斜边
     * @return
     */
    public static double hypotenuse(double a, double b){
        return Math.sqrt(a*a+b*b);
    }

    /**
     * 输出a和b之前的随机数
     */
    @GetMapping(value = "random")
    public static double uniform(int a,int b){
        return Math.random();
    }

    /**
     * 计算出调和级数
     */
    public static double harmoniceries(int a){
        if (a<= 0) {
            return  (double) a;
        }
        double sum = 0.0;
        for (int i = 1; i <= a; i ++){
            sum += 1.0/i;
        }
        return  sum;
    }
































    private Integer gcd(Integer p, Integer q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(p, r);
    }


}
