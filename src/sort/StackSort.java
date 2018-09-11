package sort;

//堆排序
/**
 * (1)堆是具有以下性质的完全二叉树：每个结点的值都大于或等于其左右孩子结点的值，称为大顶堆；
 * 或者每个结点的值都小于或等于其左右孩子结点的值，称为小顶堆。
 * (2)PriorityQueue通过二叉小顶堆实现，可以用一棵完全二叉树表示
 * (3)poll()获取并删除队首元素
 * (4)peek()获取但不删除队首元素
 */
public class StackSort {
    public void sort(Comparable[] a) {
        int N = a.length;
        //构造有序堆,只需扫描数组中一半元素
        for (int i = N/2-1; i < 0; i++) {
            sink(a, i ,N);
        }
        //将有序堆从大到小输出
        N = N-1;
        while (N >= 0) {
          exch(a, 0, N--);
          sink(a, 0, N);
        }
    }

    private void sink(Comparable[] a, int i,int N) {
        while (2*i+1 <= N-1) {
            int j =  2*i+1;
            if (j < N-1 && a[j].compareTo(a[j+1]) < 0) j++;
            if (a[j].compareTo(a[i]) > 0) break;
            exch(a, i, j);
            i = j;
        }
    }

    private void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
