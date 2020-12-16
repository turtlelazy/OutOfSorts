import java.util.Arrays;
import java.util.Random;
public class RandomTester{
    public static void main(String[]args){
        for(int i = 0; i < 100; i++){
            Random rngBase = new Random(0); 
            int[] x = new int[Math.abs(rngBase.nextInt() % 1000)];
            int[] y = new int[x.length];

            for (int z = 0; z < x.length; z++) {
                x[z] = rngBase.nextInt() % 1000;
            }
            x = y;
            Sorts.bubbleSort(x);
            Arrays.sort(x);

            System.out.println(x.equals(y) + "Seed number " + i);

        }
    }
}