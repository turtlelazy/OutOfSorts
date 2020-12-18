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
            int temp = data[i];
            for(int a = i;a<data.length;a++){
                if(data[a] < temp){
                    temp = data[a];
                    data[a] = data[i];
                    data[i] = temp;
                }
            }
        }

    }

    public static void insertionSort(int[] data) {
        for(int i = 0; i<data.length;i++){
            int index = i;
            for(int a = i; a>=0;a--){
                if(data[a] > data[i]){
                    index = a;
                }
            }
            data[index] = data[i];
            for(int a = index;a<i-1;a++ ){
                data[a+1] = data[a];
            }
        }

    }

}