import java.util.*;

public class CountStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for(int i=0;i<5;i++)
            a[i]=sc.nextInt();

        long count=Arrays.stream(a).filter(x->x>75).count();

        System.out.println("Students above 75: "+count);
    }
}