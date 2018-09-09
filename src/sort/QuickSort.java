package sort;

//快速排序
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
            while (a[++i].compareTo(re) < 0) ;
            while (a[--j].compareTo(re) > 0) ;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }
    private void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[j] = a[i];
        a[i] = temp;
    }
}
