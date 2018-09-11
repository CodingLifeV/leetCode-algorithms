package sort;

//快速排序

/**
 * 快速排序的基本思想是，通过一轮的排序将序列分割成独立的两部分，
 * 其中一部分序列的关键字（这里主要用值来表示）均比另一部分关键字小
 */
public class QuickSort {
    public void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }
    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi+1;
        //int mid = lo + (lo + hi)/2;
        Comparable re = a[lo];
        //以下代码错误:
        /*while (i < j) {
                if (a[i].compareTo(re) < 0) {
                    i++;
                } else if (a[j].compareTo(re) > 0) {
                    j--;
                } else {
                    exch(a, i, j);
                }
        }*/
        while (true) {
            while (a[++i].compareTo(re) < 0 && i < hi) ;//&&后面代码不能省略
            while (a[--j].compareTo(re) > 0 && j > lo) ;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }
    private void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}



