package Sorting;

public class mergeSort {

    public static void mergeSort(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);

    }

    public static void merge(int arr[], int start, int mid, int end){
        int temp[] = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
            
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=end){
            temp[k++] = arr[j++];
        }

        int l = start;
        for(k = 0; k<temp.length; k++){
            arr[l++] = temp[k];
        }

    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {3,23,4,6,7,2,5,1};
        int start = 0;
        int end = arr.length-1;
        mergeSort(arr, start, end);
        print(arr);
    }
}
