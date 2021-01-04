import java.util.Arrays;
import java.util.Random;
public class RandomTester{
    public static void main(String[]args){
        Random rngBase = new Random(0);
        for(int i = 0; i < 100; i++){

            int[] x = new int[Math.abs(rngBase.nextInt() % 1000)];
            int[] y = new int[x.length];

            for (int z = 0; z < x.length; z++) {
                int temp = rngBase.nextInt() % 1000;
                x[z] = temp;
                y[z] = temp;
            }

            Sorts.bubbleSort(y);
            Arrays.sort(x);

            System.out.println(Arrays.equals(x,y) + "Seed number " + i);

        }
    }
}