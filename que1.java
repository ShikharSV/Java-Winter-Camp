import java.util.*;
public class que1{
    // reverese string
    public static void reverseString(String str){
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s=s+str.charAt(i);
        }
        System.out.println(s);
    }
    // remove duplicates
    public static void removeDuplicates(String str){
        HashSet<Character> s=new HashSet<>();
        for(int i=0;i<str.length();i++){
            s.add(str.charAt(i));
        }
        System.out.println(s);
    }
    //Upper and Lower Case
    public static void UpperLower(String str){
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //  Substring
        String str="Compare to string";
        System.out.println(str.substring(11,17));

        // Split
        String[] arr=str.split(" ");
        System.out.println(arr[2]);

        //hashcode
        System.out.println(str.hashCode());
        
        sc.close();
    }
}