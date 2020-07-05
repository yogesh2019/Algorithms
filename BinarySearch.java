// now lets see what if the middle element is not our search element
// in this case we would go for recursion of the function with the left or right
// Modified with middle according to which is greater
// now lets see the condition where the searchElement is greater than the middle
public class BinarySearch {
    // the time comp is = O(n)
    public static void main(String args[])
    {
        BinarySearch B = new BinarySearch();
        int arr[] = {2,3,4,9,10,11,14};
        int n = arr.length;
        int result = B.binarySearch(arr,0,n-1,10);
        System.out.println(result);
    }
    static int count = 0;
    int binarySearch(int arr[],int l , int r, int x)
    {
        count ++;
        int mid = (l+r)/2;
        
        if(arr[mid] == x)
         return mid;
        
        if(arr[mid] < x)
        { 

           // just to keep track of recursion
           if(count==2)
            return 0;
           int temp = binarySearch(arr, mid, r, x);
           return temp;
        }
        return 0;
       // firstly let return the integer to satisfy the function
    }
    
}