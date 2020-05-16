package com.zk.edu.arithmetic;

/**
 * Created by zhangkun on 2019-08-13.
 * 约瑟夫环
 * 约瑟夫问题是个著名的问题：N个人围成一圈，第一个人从1开始报数，报M的将被杀掉，下一个人接着从1开始报。如此反复，最后剩下一个，求最后的胜利者。
 * 例如只有三个人，把他们叫做A、B、C，他们围成一圈，从A开始报数，假设报2的人被杀掉。
 * 首先A开始报数，他报1。侥幸逃过一劫。
 * 然后轮到B报数，他报2。非常惨，他被杀了
 * C接着从1开始报数
 * 接着轮到A报数，他报2。也被杀死了。
 * 最终胜利者是C
 * https://blog.csdn.net/u011500062/article/details/72855826
*/
public class YSFH {

    public static void main(String[] args) {

        System.out.println(cir(10,3));
    }

    //f(N,M)=(f(N−1,M)+M)%n
   static int cir(int n,int m)
    {
        int p=0;
        for(int i=2;i<=n;i++)
        {
            p=(p+m)%i;
        }
        return p+1;
    }
}
