import java.io.*;
import java.util.*;
public class que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="Hello";
        s.concat("World");
        StringBuffer str=new StringBuffer("hello");
        StringBuffer str2=new StringBuffer("hello");
        System.out.println(str==str2);
        System.out.println(str.equals(str2));
    }
}
