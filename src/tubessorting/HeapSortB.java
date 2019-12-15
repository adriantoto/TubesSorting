package tubessorting;
public class HeapSortB {
    
    public void HeapSortB(int[] arr) {
        System.out.print("The unsorted array: " + '\n');
        printArray(arr);
        int n = arr.length;
        int iteration = 2;
        System.out.println("");
        int status;
        System.out.println("Iteration 1");
        for (int i=(n/2)-1; i>=0; i--) {
            status = 1;
            heapD(arr,n,i,status); 
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
            System.out.print("Swapping root:\n");
            printArray(arr);
            // Call max heap on the reduced heap 
            status = 2;
            heapD(arr,i,0,status); 
            // Iteration goes on
            iteration++;
        } 
       System.out.println("");
       System.out.print("The sorted array: " + '\n');
       printArray(arr);
    } 
    // To heapify a subtree rooted with node i which is an index in arr[] and n is size of heap 
    void heapD(int arr[], int n, int i, int status) {
        int smallest = i;  // Initialize largest as root 
        int left = (2*i)+1;
        int right = (2*i)+2;
        // If left child is larger than root 
        if (left < n && arr[left] < arr[smallest]) {
            System.out.println("Comparing " + arr[left] + " and " + arr[smallest]);
            smallest = left;
        }
        // If right child is larger than the largest so far 
        if (right < n && arr[right] < arr[smallest]) {
            System.out.println("Comparing " + arr[right] + " and " + arr[smallest]);
            smallest = right;
        }
        // If the largest is not root
        if (smallest != i) {
            int swap = arr[i]; 
            arr[i] = arr[smallest]; 
            arr[smallest] = swap; 
            System.out.print("Swapping result:\n");
            printArray(arr);
            // Recursive call to heapify the sub-tree
            heapD(arr,n,smallest,status);
        } 
        if (status==2) {
            System.out.print("Non-swapping result: " + '\n');
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
