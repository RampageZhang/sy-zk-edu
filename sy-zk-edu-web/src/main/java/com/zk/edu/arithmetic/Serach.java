package com.zk.edu.arithmetic;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by zhangkun on 2019-11-20.
 */
public class Serach {

    public static void main(String[] args) {
         /* int[] a={};
         int i =(int)(Math.random()*10000)+1;*/

       /* int[] a= new int[1000] ;
        Random rf = new Random();
        for (int i=0;i<1000;i++){
            a[i] =rf.nextInt(100+1);
        }*/

        // 先排序 再查找 二分法


        int[] arr={10,8,5,6,7};
        System.out.println(Arrays.toString(arr));
        long start = System.currentTimeMillis();
        sort(arr,0,arr.length-1);
        long end = System.currentTimeMillis()-start;
        //System.out.println(end);
        System.out.println(Arrays.toString(arr));

    }



    public static void sort(int[] a,int low,int high){

        int i =low;
        int j =high;

        if(i>j){
            return;
        }
        int k = a[low];
        while (i<j){
            //找出最小的
            while(i<j&&a[j]>k){
                j--;
            }
            //找出最大的
            while(i<j&&a[i]<=k){
                i++;
            }
            if(i<j){
                int swap=a[i];
                a[i] = a[j];
                a[j] = swap;
            }
        }
        //交换K
        k=a[i];
        a[i]=a[low];
        a[low]=k;
        //对左边进行排序,递归算法
        sort(a, low, i-1);
        //对右边进行排序
        sort(a,i+1,high);
    }


    public static  void mySort(int[] a , int low ,  int hight){

        int i = low ;
        int j = hight;
        if(i>j){
            return;
        }
        int k = a[low];
        while (i<j){
            while (i<j&&a[i]>=k) {i++;}
            while (i<j&&a[j]<k) {j--;}
            if(i<j) {
                int swap = a[i];
                a[i]= a[j];
                a[j]=swap;
            }
        }
        k = a[i];
        a[i] = a[low];
        a[low] = k;
        mySort(a ,low ,i-1);
        mySort(a ,i+1 ,hight);
    }

}
