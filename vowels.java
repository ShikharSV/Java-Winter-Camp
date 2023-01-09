import java.util.*;
import java.io.*;
public class vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int vowels=0,consonents=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isDigit(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    vowels++;
                }
                else{
                    consonents++;
                }
            }
        }
        System.out.println(vowels+ " "+ consonents);
        sc.close();
    }
}
