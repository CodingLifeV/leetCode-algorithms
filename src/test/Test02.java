package test;

public class Test02 {
    public static void main(String[] args) {
        /*
        c++中substr有2种用法：
        假设：string s = "0123456789";
        //只有一个数字5表示从下标为5开始一直到结尾：sub1 = "56789"
        string sub1 = s.substr(5); 
        //从下标为5开始截取长度为3位：sub2 = "567"
        string sub2 = s.substr(5, 3); 
         */
        String str = "0123456789";
        //
        System.out.println(str.substring(1));
        System.out.println(str.substring(4,7));

    }

}
