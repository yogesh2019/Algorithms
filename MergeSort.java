public class MergeSort 
{ 
    static int mer = 0;
    static int sor = 0;
    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void merge(int arr[], int l, int m, int r) 
    { 
        mer++;
        System.out.println("merge function is called ====> :" + mer);
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 

        
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
            System.out.println();
            System.out.print("L:");
            for(int x = 0 ; x < L.length ; x++)
            {
                System.out.print(L[x]+" ");
            }
            System.out.println();
            System.out.print("R:");
            for(int x = 0 ; x < R.length ; x++)
            {
                System.out.print(R[x]+" ");;
            }
            System.out.println();

  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            System.out.print(arr[k]+",");;
            k++; 
        } 
        
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            System.out.print(arr[k]+",");;
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            System.out.print(arr[k]+",");;
            k++; 
        } 
        System.out.println(mer+"::::::::::::::::::====> : merge ended");;
       
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    void sort(int arr[], int l, int r) 
    { 
        sor++;
        System.out.println("Sort function is called : ====> "+sor);

        System.out.println("Sorted:");
        for(int x = l ; x <= r ; x++)
        {
            System.out.print(arr[x]+" ");;
        }
        System.out.println();
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
        System.out.println(sor+"::::::::::::::::::====> :sort ended");
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
} 