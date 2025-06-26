package Sorting;

public class SelectionSort {

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,23,4,6,7,2,5,1};
        selectionSort(arr);
    }
    
}
