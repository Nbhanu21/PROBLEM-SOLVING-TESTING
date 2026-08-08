import java.util.*;

public class StreamPipeline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[8];

        for(int i=0;i<8;i++)
            a[i]=sc.nextInt();

        Arrays.stream(a)
            .distinct()
            .filter(x->x>20)
            .map(x->x*2)
            .sorted()
            .forEach(x->System.out.print(x+" "));
    }
}