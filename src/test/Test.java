package test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*int[] nums = new int[]{5, 2, 23, 6};
        Arrays.sort(nums);//sort默认升序
        for (int num : nums) {
            System.out.println(num + " ");
        }*/

        /*int[][] arr = new int[][]{{12,11},{9,8},{13,1}};
        System.out.println(arr.length);//测试二维数组长度
        System.out.println(arr[0].length);
        System.out.println(arr[0]);*/

        /**
         * 二维数组按照某一列进行排序
         */
        //二维数组
        //[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
        Integer[][] matrix = new Integer[][]{
                {7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}
        };
        //排序
        Arrays.sort(matrix, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] x, Integer[] y) {
                //x[0]按照第二列,x[1]按照第二列
               if (x[0] == y[0]) {
                   return x[1] - y[1];
               } else {
                   return y[0] - x[0];
               }
            }
        });
        List<Integer[]> queue = new ArrayList<>();
        for (Integer[] p : matrix) {
            System.out.println(p[0] + "  " + p[1]);//二维数组按照维数进行遍历操作
            //queue.add(p[1], p);
        }
        //打印
        for (Integer[] integers : matrix) {
            System.out.println(Arrays.toString(integers));
        }
    }
}
