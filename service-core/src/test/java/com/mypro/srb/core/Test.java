package com.mypro.srb.core;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.core
 * @ClassName: Test
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/13 21:57
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {
//        Double i1 = 100.0;
//        Double i2 = 100.0;
//        Double i3 = 200.0;
//        Double i4 = 200.0;
//        System.out.println(i1 == i2);
//        System.out.println(i3 == i4);
//
//        byte a = 127;
//        byte b = 127;
////        b = a + b; // 报编译错误:cannot convert from int to byte
//        b += a;
        System.out.println("测试分支");
        System.out.println("测试分支2");
        System.out.println("测试分支3");
        System.out.println("测试分支3");
        System.out.println("测试分支3");
        System.out.println("测试分支3");
        System.out.println(test());
    }

    static int test() {
        int x = 1;
        try {
            return x;
        } finally {
            ++x;
        }
    }
}
