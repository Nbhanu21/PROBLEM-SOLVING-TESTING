import java.util.*;

public class SquareOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for(int i=0;i<5;i++)
            a[i]=sc.nextInt();

        for(int i=0;i<5;i++)
            System.out.print(a[i]*a[i]+" ");
    }
}