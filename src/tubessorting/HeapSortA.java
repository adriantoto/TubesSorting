package tubessorting;
public class HeapSortA {
    
    public void HeapSortA(int[] arr) {
        System.out.print("The unsorted array: " + '\n');
        printArray(arr);
        int n = arr.length;
        int iteration = 2;
        System.out.println("");
        int status;
        System.out.println("Iteration 1");
        for (int i=(n/2)-1; i>=0; i--) {
            status = 1;
            heapA(arr,n,i,status); 
        }
        /* One by one extract (Max) an element from heap and replace it 
          with the last element in the array */
       for (int i=n-1; i>=0; i--) {          
            /* arr[0] is a root of the heap and is the max element in heap
             * Move current root to end
             */
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
            System.out.println("");
            // Print the number of the iteration
            System.out.print("Iteration " + iteration + '\n');
            System.out.println("Swapping root:");
            printArray(arr);
            // Call max heap on the reduced heap 
            status = 2;
            heapA(arr,i,0,status); 
            // Iteration goes on
            iteration++;
        } 
       System.out.println("");
       System.out.print("The sorted array: " + '\n');
       printArray(arr);
    } 
    // To heapify a subtree rooted with node i which is an index in arr[] and n is size of heap 
    void heapA(int arr[], int n, int i, int status) {
        int largest = i;  // Initialize largest as root 
        int left = (2*i)+1;
        int right = (2*i)+2;
        // If left child is larger than root 
        if (left < n && arr[left] > arr[largest]) {
            System.out.println("Comparing " + arr[left] + " and " + arr[largest]);
            largest = left;
        }
        // If right child is larger than the largest so far 
        if (right < n && arr[right] > arr[largest]) {
            System.out.println("Comparing " + arr[right] + " and " + arr[largest]);
            largest = right;
        }
        // If the largest is not root
        if (largest != i) {
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
            System.out.println("Swapping result:");
            printArray(arr);
            // Recursive call to heapify the sub-tree
            heapA(arr,n,largest,status);
        } 
        if (status==2) {
            System.out.println("Non-swapping result: ");
            printArray(arr);
        }
    } 
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print('\n');
    }
}
