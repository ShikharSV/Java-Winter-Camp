import java.util.Scanner;
public class que6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int a=sc.nextInt();
        int b=sc.nextInt();
        String s=str.substring(a,b);
        System.out.println(s);
        sc.close();
    }
}