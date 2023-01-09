import java.util.*;
public class que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
        int[]arr=new int[10];
        for(int i=0;i<10;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        for(int i=0;i<10;i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
