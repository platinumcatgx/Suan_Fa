package cn.cat.第一章.基础编程模型_1_1;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class 练习题 extends TestCase {
    Random random = new Random();

    public void test1_1() {
        System.out.println((0 + 15) / 2);
        System.out.println(2.0e6 * 1000000000.1);
        System.out.println(true && false || true && true);
    }

    public void test1_2() {
        double a = (1 + 2.236) / 2;
        double b = 1 + 2 + 3 + 4.0;
        boolean c = 4.1 >= 4;
        String d = 1 + 2 + "3";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public void test1_3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入三个数字");
        int i = scanner.nextInt();
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        System.out.println(i == i1 && i1 == i2 ? "equal" : "not equal");
    }

    public void test1_4() {
        int a = 1, b = 1, c = 0;
//        if (a>b) then c =0; then不是关键字
        if (a > b) {
            c = 0;
        }
        if (a > b) c = 0;
        if (a > b) c = 0;
        else b = 0;
    }

    public void test1_5() {
        double x = 1;
        double y = 0.9999999;
        System.out.println(x + y);
        System.out.println(x < 1 && y < 1 && x > 0 && y > 0);
    }

    public void test1_6() {
        int f = 0, g = 1;
        for (int i = 0; i < 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }

    public void test1_7() {
        double t = 9;
        while (Math.abs(t - 9 / t) > .001)
            t = ((9 / t) + t) / 2.0;
        System.out.println(t);

        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);

        int sum2 = 0;
        for (int i = 0; i < 1000; i += 2) {
            for (int j = 0; j < 1000; j++) {
                sum2++;
            }
        }
        System.out.println(sum2);
    }

    public void test1_8() {
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));
    }

    public void test1_9() {
        int N = 30;
        String s = "";
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        System.out.println(s);
    }

    public void test1_11() {

        boolean[][] bx = new boolean[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                bx[i][j] =random.nextBoolean();
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(bx[i][j]?"*":" ");
            }
            System.out.println("\n");
        }
    }

    public void test1_12(){
        int[] a=new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=9-i;
        }
        for (int i = 0; i < 10; i++) {
            a[i]=a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }

    public void test1_13(){
        int M = 10;
        int N = 10;
        //赋值
        int[][] nums = new int[M][N];
        for (int i = 0; i < M ; i++) {
            for (int j = 0; j < N; j++) {
                nums[i][j] = random.nextInt(100);
            }
        }
        //置换
        int[][] nums2 =new int[M][N];
        for (int i = 0; i < M ; i++) {
            for (int j = 0; j < N ; j++) {
                nums2[i][j]=nums[j][i];
            }
        }
        //对比输出
        System.out.println("原本的数组");
        for (int i = 0; i < M ; i++) {
            for (int j = 0; j < N ; j++) {
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println("\n");
        }

        System.out.println("现在的数组");
        for (int i = 0; i < M ; i++) {
            for (int j = 0; j < N ; j++) {
                System.out.print(nums2[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }

    /**
     * 接收一个整形N, 返回一个不大于log2N的最大整数, 不用Math库, 未写
     */
    public void test1_14(){

    }

    public void test1_15(){
        int a[] = new int[10];
        int M = 4;
        //返回数组, 第I个元素的值为整数I在参数在数组的次数, 如果a[]中的值均在0-M-1之间, 返回数组中所有元素之和应和a.length想等

    }



}
