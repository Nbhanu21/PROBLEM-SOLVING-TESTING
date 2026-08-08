import java.util.*;

public class CalculateAVG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int total=0,max,min;

        for(int i=0;i<5;i++) {
            a[i]=sc.nextInt();
            total+=a[i];
        }

        max=a[0];
        min=a[0];

        for(int i=1;i<5;i++) {
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }

        double average=(double)total/5;

        System.out.println("Total: "+total);
        System.out.println("Average: "+average);
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}