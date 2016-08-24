package com.zhangdinet;

/**
 * User: hzzhangdi3
 * Date: 2016-08-24 09:50
 */
public class DemoClass {

    static int sa;

    public int a;
    public int b;

    public DemoClass(){};

    public DemoClass(int a,int b){
        this.a = a;
        this.b = b;
    }

    public int add(int a,int b){
        return a+b;
    }

    private void print(){
        System.out.println(a+b);
    }

    public static void printInfo(){
        System.out.println("Static method");
    }
}
