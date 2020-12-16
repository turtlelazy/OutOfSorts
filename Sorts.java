public class Sorts{
    public static void bubbleSort(int[] data){
        for (int i = 0; i < data.length-1;i++){
            if(data[i] > data[i+1]){
                int temp = data[i];
                data[i] = data[i+1];
                data[i+1] = temp;
            }
        }
    }
}