package com.math.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author songabao
 * @date 2019/9/2 16:45
 */
@RestController
@RequestMapping(value = "array")
public class ArrayController {
    private static  final Logger log = LoggerFactory.getLogger(ArrayController.class);
    /**
     * 找出数组中最大数
     */
    public Integer arrayMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i]> max){
                max = arr[i];
            }
        }
        return  max;
    }

    /**
     * 求数组平均值
     */
    public Double average(double[] arr){
        Double num = 0D;
        for (int i = 0; i < arr.length; i++){
            num+=arr[i];
        }
        return  num / arr.length;
    }
    /**
     * 赋值数组
     */
    public String copyArray(int[] arr){
       int[] temp = new int[arr.length];
       for (int i =arr.length -1 ; i >= 0; i--){
           temp[i] = arr[i];
       }
        Arrays.sort(temp);
        return Arrays.toString(temp);
    }

    /**
     * 合并数组
     * @return
     */
    public String marge(int[] arr,int[] arr2) {
        int[] temp = new int[arr.length+arr2.length];
        System.arraycopy(arr,0,temp,0,arr.length);
        System.arraycopy(arr2,0,temp,arr.length,arr2.length);
        Arrays.sort(temp);
        return  Arrays.toString(temp);
    }
    /**
     * 颠倒有序数组的顺序
     */
    public String reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return Arrays.toString(arr);
    }
}
