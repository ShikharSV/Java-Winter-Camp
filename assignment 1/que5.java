import java.util.Scanner;
public class que5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        System.out.println("---------Sample Output----------");
        while(t!=0){
            String str=sc.next();
            int n=sc.nextInt();
            System.out.print(str+"\t");
            if(n>=100)
                System.out.print(n);
            else if(n>=10 && n<100)
                System.out.print("0"+n);
            else
                System.out.print("00"+n);
            System.out.println();
            t--;
        }
        sc.close();
    }
}
