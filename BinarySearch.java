// changing for the test

public class BinarySearch {
    // the time comp is = O(n)
    public static void main(String args[])
    {
        BinarySearch B = new BinarySearch();
        int arr[] = {2,3,4,9,11,10,14};
        int n = arr.length;
        int result = B.binarySearch(arr,0,n-1,10);
        System.out.println(result);
    }
    int binarySearch(int arr[],int l , int r, int x)
    {
        for(int i = l ;i <=r ; i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();
      if(r>=l)
      {
          int mid = l + (r-l)/2;
          System.out.println(mid);

          if(arr[mid] == x)
            return mid;

         if(arr[mid]>x)
         {
             binarySearch(arr, l, mid-1, x);
         }

         return binarySearch(arr, mid+1, r, x);
          
      }
      return -1;
    }
    
}