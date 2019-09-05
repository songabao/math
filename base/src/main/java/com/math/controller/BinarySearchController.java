package com.math.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>说明：二分查找法</b>
 * @author songabao
 * @date 2019/9/5 14:20
 */
public class BinarySearchController {
    private static  final Logger log = LoggerFactory.getLogger(BinarySearchController.class);

    /**
     * 递归实现二分查找法(数组时有序的)
     */
    public static  Integer binarySearch(int key,int[] arr,int min,int max){
        if (min > max) {
            return -1;
        }
        int temp = min + (max - min) / 2;
        if (key < arr[temp]) {
            return binarySearch(key, arr, min, temp - 1);
        } else if (key > arr[temp]) {
            return binarySearch(key, arr, temp + 1, max);
        } else {
            return temp;
        }
    }
}
