package cn.cat.第一章.基础编程模型_1_1;

import junit.framework.TestCase;

import java.util.Arrays;

public class 二分查找Test extends TestCase {
    二分查找 m = new 二分查找();
    int[] array = {12, 16, 18, 19, 23, 26, 29, 31, 32, 36, 38, 39, 41, 43, 46, 49, 52, 57, 59, 69, 70, 76, 79, 88};

    public void testRank() {
        Arrays.sort(array);//排序
        System.out.println(m.rank(array, 38));
        System.out.println(array[10]);
    }

    public void testBinarySort() {
        System.out.println(
                m.binarySortRecursion(array, 38, 0, array.length - 1));
    }

}