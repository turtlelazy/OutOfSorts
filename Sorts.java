public class Sorts{

    public static void bubbleSort(int[] data){
        for(int a = 0; a<data.length;a++){
            for (int i = 0; i < data.length-1;i++){
                if(data[i] > data[i+1]){
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                }
            }
    }
    }

    public static void selectionSort(int[] data) {
        for(int i = 0; i<data.length;i++){
            int smallest = data[i];
            for(int a = i;i<data.length;a++){
                if(data[a] < smallest){
                    smallest = data[a];
                }
            }
        }
    }
}