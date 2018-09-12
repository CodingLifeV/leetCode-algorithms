package sort;

/**
 * 三向切分的快速排序 ：
 * 对于每次切分：从数组的左边到右边遍历一次，维护三个指针，
 * lt指针使得元素（arr[0]-arr[lt-1]）的值均小于切分元素；
 * gt指针使得元素（arr[gt+1]-arr[N-1]）的值均大于切分元素；
 * i指针使得元素（arr[lt]-arr[i-1]）的值均等于切分元素，
 * （arr[i]-arr[gt]）的元素还没被扫描，切分算法执行到i>gt为止。
 * 每次切分之后，位于gt指针和lt指针之间的元素的位置都已经被排定，
 * 不需要再去处理了。之后将（lo,lt-1）,（gt+1,hi）分别作为处理左
 * 子数组和右子数组的递归函数的参数传入，递归结束，整个算法也就结束。
 */
public class Quick3way {
    public void sort(Comparable[] a, int lo, int hi) {
        int lt = lo, i = lo + 1, gt = hi;
        while (i >= gt) {
            if (a[i].compareTo(a[lo]) < 0) {
                exch(a, i++, lt++);
            } else if (a[i].compareTo(a[lo]) > 0) {
                exch(a, i, gt--);
            } else {
                i++;
            }
        }
        sort(a, lo, lt-1);
        sort(a, gt+1, hi);
    }
    private void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
