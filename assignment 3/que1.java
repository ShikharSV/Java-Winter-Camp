import java.util.Arrays;
import java.util.Scanner;
class Function{
    public static void sortArray01(int []arr,int n){
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]==0 && arr[j]==0){
                i++;
            }
            else if(arr[i]==0 && arr[j]==1){
                i++;
                j--;
            }
            else if(arr[i]==1 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else{
                j--;
            }
        }
    }
    public static void rotateArrayKTimes(int[] arr,int n,int k){
        if(k==0)
            return;
        else if(k>0){
            for(int i=0;i<k;i++){
                int temp=arr[n-1];
                for(int j=n-1;j>0;j--){
                    arr[j]=arr[j-1];
                }
                arr[i]=temp;
            }
        }
        else{
            int abs=Math.abs(k);
            for(int i=abs;i>0;i--){
                int temp=arr[0];
                for(int j=0;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[n-1-i]=temp;
            }
        }
    }
    public static void SmallestLargest(int[] arr,int n){
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[n-1]);
    }
    public static void secondLargestSmallest(int[]arr,int n){
        Arrays.sort(arr);
        System.out.println("Second largest: "+arr[n-2]);
        System.out.println("Second smallest: "+arr[1]);
    }
    static int minimumDistance(int[] array,int x,int y){
        int prev,i=0;
        prev = 0;
        int dist = Integer.MAX_VALUE;
        for(i=0; i<array.length; i++){
            if(array[i] == x || array[i] == y){
                prev  = i;
                break;
            }
        }
        for(i=prev+1; i<array.length; i++){
            if(array[i] == x || array[i] == y){
                if(array[i] != array[prev] && (i-prev) < dist)
                {
                    dist = i-prev;
                    prev = i;
                }
                else{
                    prev = i;
                }
            }
        }
        return dist;
    }
    

}

public class que1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Function obj=new Function();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        // obj.sortArray01(arr, n);
        obj.rotateArrayKTimes(arr, n, k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}