// firstly the array is given as parameter to the function binarySearch
// it compares the searchElement to the middleElement of the array
// if it matches it returns the middle element
// first lets try this step
public class BinarySearch {
    // the time comp is = O(n)
    public static void main(String args[])
    {
        BinarySearch B = new BinarySearch();
        int arr[] = {2,3,4,9,11,10,14};
        int n = arr.length;
        int result = B.binarySearch(arr,0,n-1,9);
        System.out.println(result);
    }
    int binarySearch(int arr[],int l , int r, int x)
    {
        int mid = (l+r)/2;
       
        if(arr[mid] == x)
         return mid;
        return 0;
       // firstly let return the integer to satisfy the function
    }
    
}