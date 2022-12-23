package Arrays;

public class BinarySearch {
    public static int binarysearch(int numbers[],int key){
    int start=0 , end = numbers.length - 1 ;
    while (start <= end){
        int mid = (start+end)/2;

        if(numbers[mid]==key){
            return mid;
        }
        if(numbers[mid]>key){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
    }
    return -1;
} 
    public static void main(String args[]){
        int numbers[] = {3,4,5,6,7,8,9};
        int key = 9;
        System.out.println("the key element found at index " + binarysearch(numbers,key));
    }
    
}
