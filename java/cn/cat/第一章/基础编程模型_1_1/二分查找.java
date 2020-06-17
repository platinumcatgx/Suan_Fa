package cn.cat.第一章.基础编程模型_1_1;

public class 二分查找 {
    /**
     * 标准的二分查找算法
     * @param arr 排序后的数组
     * @param key 要找到的数
     * @return 元素的下标
     */
    public int rank(int arr[], int key) {
        int lo = 0;//定义范围头
        int hi = arr.length - 1;//定义范围尾
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;//定位中间的位置
            if (key < arr[mid]) hi = mid - 1;//key小于中间的数,移动尾
            else if (key > arr[mid]) lo = mid + 1;//key大于中间的数,移动头
            else return mid;//key就是中间的数
        }
        return -1;
    }

    /**
     * 递归实现二分查找
     * @param array
     * @param key
     * @param low
     * @param high
     * @return
     */
    public static int binarySortRecursion(int[] array, int key, int low, int high) {
        if (low <= high) {
            int mid = (low + high) >>> 1;
            if (key < array[mid]) {
                return binarySortRecursion(array, key, low, mid - 1);
            } else if (key > array[mid]) {
                return binarySortRecursion(array, key, mid + 1, high);
            } else {
                return mid;
            }
        }
        return -1;
    }
}
