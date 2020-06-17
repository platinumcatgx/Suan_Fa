package cn.cat.第一章.one_two;

import java.util.Arrays;

public class t2 {
    private int[] a;

    public t2(int[] key) {
        a = new int[key.length];
        for (int i = 0; i < key.length; i++)
            this.a[i] = key[i];//保护性复制
        Arrays.sort(key);
    }

    public boolean contains(int key) {
        return rank(key) != -1;
    }

    private int rank(int key) {
        int lo = 0;//头
        int hi = a.length - 1;//尾
        while (lo < hi) {//头和尾未重合
            int mid = lo + (hi - lo) / 2;//mid的值为头和尾的中间位置
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] q = new int[]{5, 56, 15, 75, 5, 35, 59, 35, 84, 35, 95, 4, 59, 35, 95, 593, 5, 9};
        Arrays.sort(q);
        t2 t2 = new t2(q);
        cn.cat.第一章.one_two.t2 t3 = new t2(q);
        System.out.println(t2.contains(593));
        System.out.println(t2.rank(75));
    }
}
