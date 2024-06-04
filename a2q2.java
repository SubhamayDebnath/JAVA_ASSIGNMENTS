import java.util.*;
class A{
    void fun(int arr[]){
        if (arr==null || arr.length==0){
            System.out.println("Array is empty");
        }else{
            int l=arr[0];
            int s=arr[0];
            for (int i=1;i<arr.length;i++){
                if (arr[i] > l){
                    l=arr[i];
                }
                if (arr[i] < s){
                    s=arr[i];
                }
            }
            System.out.println("the largest value:"+l);
            System.out.println("the smallest value:"+s);
        }

    }
}
public class a2q2 {
    public static void main(String[] args) {
        int arr[]={102,378,434,9964,12};
        A r = new A();
        r.fun(arr);
    }
}
