public class Sorts{

    //original solution had a for loop instead of a while loop, which prevented bubble sort from ending early
    public static void bubbleSort(int[] data){
        boolean complete = false;
        while(!complete){
            complete = true;
            for (int i = 0; i < data.length-1;i++){
                if(data[i] > data[i+1]){
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                    complete = false;
                }
            }
        }
        
    }

    //previous selection sort did multiple swaps, which was less true to the sort type
    public static void selectionSort(int[] data) {

        for(int i = 0; i<data.length;i++){
            int smallerIndex = i;

            for(int a = i;a<data.length;a++){
                if(data[a] < data[smallerIndex]){
                    smallerIndex = a;
                }
            }
            
            int temp = data[i];
            data[i] = data[smallerIndex];
            data[smallerIndex] = temp;
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

            int temp = data[i];

            for(int a = i;a>index;a-- ){
                data[a] = data[a-1];
            }
            data[index] = temp;
        }

    }

}