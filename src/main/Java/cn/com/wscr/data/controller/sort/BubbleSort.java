package cn.com.wscr.data.controller.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 时间复杂度依然为O(n2）
 * 稳定性:稳定
 * 复杂度:简单
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] a) {
        System.out.println(Arrays.toString(a) + "冒泡排序最开始的数组:");
        int max;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    max = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = max;
                }
            }
            System.out.println(Arrays.toString(a) + "第" + (i + 1) + "次排序后的数组");
        }
        System.out.println(Arrays.toString(a) + "冒泡排序最后的数组:");
        return a;
    }

    public static int[] InsertionSort(int[] a) {
        System.out.println(Arrays.toString(a) + "直接插入排序最开始的数组:");
        int tem;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    tem = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tem;
                }
            }
            System.out.println(Arrays.toString(a) + "第" + (i) + "次排序后的数组");
        }
        System.out.println(Arrays.toString(a) + "直接插入排序最后的数组:");
        return a;
    }

    public static int[] SelectionSort(int[] a) {
        System.out.println(Arrays.toString(a) + "选择排序最开始的数组:");
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;

            System.out.println(Arrays.toString(a) + "第" + (i) + "次排序后的数组");
        }
        System.out.println(Arrays.toString(a) + "选择排序最后的数组:");
        return a;
    }

    /**
     * 快速排序
     */
    public static int[] QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            //找寻基准数据的正确索引
            int index = getIndex(arr, low, high);
            //基准数据左边重复该操作
            QuickSort(arr, 0, index - 1);
            //基准数据右边重复该操作
            QuickSort(arr, index + 1, arr.length);
        }
        return arr;
    }

    //找寻基准数据的正确索引
    private static int getIndex(int[] arr, int low, int high) {
        System.out.println(Arrays.toString(arr) + "快速排序开始");
        //以数组的第一个元素为基准数据
        int tep=arr[low];
        while (low<high){
            // 当队尾的元素大于等于基准数据时,向前挪动high指针
            while (low<high && arr[high]>=tep){
                    high--;
            }
            // 如果队尾元素小于tmp了,需要将其赋值给low
            arr[low]=arr[high];
            System.out.println(Arrays.toString(arr) + "快速排序high");
            // 当队首元素小于等于tmp时,向前挪动low指针
            while (low<high && arr[low]<=tep){
                low++;
            }
            // 当队首元素大于tmp时,需要将其赋值给high
            arr[high]=arr[low];
            System.out.println(Arrays.toString(arr) + "快速排序low");
        }
        // 跳出循环时low和high相等,此时的low或high就是tmp的正确索引位置
        // 由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
        arr[low] = tep;
        System.out.println(Arrays.toString(arr) + "快速排序结束");
        return low;
    }

    public static void main(String[] args) {
//        int[] a = {100, 20, 200, 50, 10, 4, 16, 78};
//        System.out.println(Arrays.toString(bubbleSort(a)));
//        System.out.println("<************************>");
//        int[] b = {100, 20, 200, 50, 10, 4, 16, 78};
//        System.out.println(Arrays.toString(InsertionSort(b)));
//        System.out.println("<************************>");
//        int[] c = {100, 20, 200, 50, 10, 4, 16, 78};
//        System.out.println(Arrays.toString(SelectionSort(c)));
        System.out.println("<************************>");
        int[] d = {100, 20, 200, 50, 10, 4, 16, 78};
        System.out.println(Arrays.toString(QuickSort(d,0,d.length-1)));
    }
}
