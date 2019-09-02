package com.songabao;

import com.math.controller.ArrayController;
import com.math.controller.BaseController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseApplicationTests {

	/**
	 * 两个非负整数的最大公约数
	 */
	@Test
	public void gcd() {
        BaseController baseController = new BaseController();
        Integer gcd = baseController.getGcd(20, 30);
        System.out.println(gcd);
    }

    /**
     * 数组的声明
     */
    @Test
    public void array() {
        //先声明后后赋值
        int[] arr;
        arr = new int[10];
        System.out.println("先声明后赋值的数组长度："+arr.length);
        //简化写法
        int[] arr1 = new int[10];
        System.out.println("数组简化写法："+arr1.length);
        //声明并初始化
        int[] arr2={1,2,3,4,5,6};
        System.out.println("数组声明并初始化："+arr2.length);
    }
    /**
     * 求数组最大值
     */
    @Test
    public void arrayMax() {
        int[] arr = {1,2,3,4,12,6,7,8,9,13};
        ArrayController arrayController = new ArrayController();
        System.out.println("数组最大值："+arrayController.arrayMax(arr));
    }
    /**
     * 求数组平均值
     */
    @Test
    public void arrayAverage() {
        double[] arr = {1,2,3,4,12,6,7,8,9};
        ArrayController arrayController = new ArrayController();
        System.out.println("数组平均数："+arrayController.average(arr));
    }
    /**
     * 复制数组
     */
    @Test
    public void copyArray(){
        int[] arr = {1,9,10,44,22,33};
        ArrayController arrayController = new ArrayController();
        System.out.println("复制数组并把值反转："+arrayController.copyArray(arr));
    }
    /**
     * 两个数组合并成一个
     */
    @Test
    public void margeArray(){
        int[] arr ={1,2,34,56};
        int[] arr2 = {23,65,78,96,32};
        ArrayController arrayController = new ArrayController();
        System.out.println("合并的新数组是："+arrayController.marge(arr,arr2));
    }

    /**
     * 颠倒数组的顺序
     */
    @Test
    public void reverseArray(){
        int[] arr ={1,2,34,56};
        ArrayController arrayController = new ArrayController();
        System.out.println("颠倒数组顺序："+arrayController.reverse(arr));
    }
    /**
     * 判断一个数是否是素数
     */
    @Test
    public void isPrime(){
        System.out.println(BaseController.isPrime(5));
    }

    /**
     * 计算平方根
     */
    @Test
    public void sqrt(){
        System.out.println(BaseController.sqrt(5));
    }
}
