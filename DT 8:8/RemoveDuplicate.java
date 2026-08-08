import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];

        for(int i=0;i<6;i++)
            a[i]=sc.nextInt();

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int x:a)
            set.add(x);

        for(int x:set)
            System.out.print(x+" ");
    }
}