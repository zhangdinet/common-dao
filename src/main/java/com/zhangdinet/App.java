package com.zhangdinet;

/**
 * User to start demo
 */
public class App {

    public App(){
    }

    public int add(int a, int b) {
        int c = a + b;
        if (c >= 10) {
            int d = 100;
            d++;
        } else {
            int e = 200;
            e++;
        }
        System.out.print(c);
        return c;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}
