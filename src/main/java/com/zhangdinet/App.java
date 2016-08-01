package com.zhangdinet;

import sun.util.resources.cldr.so.CurrencyNames_so;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println(args.length);
        for(String s:args){
            System.out.println(s);
        }
    }

    public static int add(int a,int b){
        int c = a+b;
        System.out.print(c);
        return c;
    }

    public static int sub(int a,int b){
        return a-b;
    }
}
