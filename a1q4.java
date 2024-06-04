public class a1q4 {
    public static void main(String[] args) {
        int num=10,n1=0,n2=1,fn;
        System.out.print(n1+" "+n2);
        for(int i=2;i<num;i++){
            fn=n1+n2;
            System.out.print(" "+fn);
            n1=n2;
            n2=fn;
        }
    }
}
