package cn.cat.第一章.基础编程模型_1_1;

import java.util.Scanner;

public class P32 {
    Scanner s = new Scanner(System.in);
    boolean[][] two = {{true, false, true, false}, {true, true, false, true}, {true, false, false, true}, {false, false, true, true}};

//    @Test
//    public void t113() {
//        int i1 = s.nextInt();
//        int i2 = s.nextInt();
//        int i3 = s.nextInt();
//        if (i1 == i2 && i2 == i3)
//            System.out.println("equal");
//        else
//            System.out.println("not");
//    }
//
//    @Test
//    public void t116() {
//        int f = 0;
//        int g = 1;
//        for (int i = 0; i <= 15; i++) {
//            System.out.println(f);
//            f = f + g;
//            g = f - g;
//        }
//    }
//
//    /**
//     * 1.1.11
//     */
//    @Test
//    public void printArray() {
//        for (int i = 0; i < two.length; i++) {
//            if (i == 0) {
//                System.out.printf(" ");
//                for (int j = 0; j < two[i].length; j++) {
//                    System.out.print(j + 1);
//                }
//                System.out.println();
//                continue;
//            }
//            System.out.print(i + 1);
//            for (int j = 0; j < two[i].length; j++) {
//                System.out.printf(two[i][j] ? "*" : " ");
//            }
//            System.out.println();
//        }
//    }
//
//    @Test
//    public void test12() {
//        int[] a = new int[10];
//        for (int i = 0; i < 10; i++) {
//            a[i] = 9 - i;
//        }
//        for (int i = 0; i < 10; i++) {
//            a[i] = a[a[i]];
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//    }
//
//    @Test
//    public void P1_1_13() {
//        int m = 4;
//        int n = 3;
//        int[][] a = new int[m][n];
//        //打印原本的数组,并且为其赋值
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = i + j;
//                StdOut.print(a[i][j]);
//            }
//            StdOut.println();
//        }
//        StdOut.println();//分割
//
//        //用数组b存储a置换后的数组,并打印出来
//        int[][] b = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                b[i][j] = a[j][i];
//                StdOut.print(b[i][j]);
//            }
//            StdOut.println();
//        }
//    }
//
//    public static int[] histogram(int[] a, int M) {
//        int[] newArray = new int[M];//声明长度为M的数组
//        int oldLength = a.length;//得到旧数组的长度
//        for (int i = 0; i < M; i++) {
//            int count = 0;//count的作用是计算整数i在旧数组中出现的次数
//            for (int j = 0; j < oldLength; j++) {
//                if (i == a[j])
//                    count++;//遍历旧数组的每个元素，如若其值与整数i相同则count加1
//            }
//            newArray[i] = count;//赋值给新数组的第i个元元素
//        }
//        return newArray;//返回新数组
//    }
//
//    @Test
//    public void T15() {
//        int a[] = {4, 4, 2, 3, 2, 4, 5, 6, 6};
//        int[] histogram = histogram(a, 5);
//        System.out.println();
//        for (int i : histogram) {
//            System.out.println(i);
//        }
//    }
//
//    public String exR1(int n) {
//        if (n <= 0) return "";
//        return exR1(n - 3) + n + exR1(n - 2) + n;
//    }
//
//    @Test
//    public void T16() {
//        System.out.println(exR1(6));
//    }

}
