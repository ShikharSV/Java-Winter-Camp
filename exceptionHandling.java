import java.util.*;

public class exceptionHandling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number : ");
            Integer num10 = sc.nextInt();
            System.out.println("The square is " + (num10*num10));
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divided by 0");
        }
        catch(NumberFormatException e){
            System.out.println("Number format exception.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of Bound");
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        sc.close();
    }
}