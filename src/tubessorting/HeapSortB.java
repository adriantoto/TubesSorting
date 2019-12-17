package tubessorting;
public class HeapSortB {
    
    public void HeapSortB(int[] arr) {
        System.out.print("The unsorted array: " + '\n');
        printArray(arr);
        int n = arr.length;
        int iteration = 1;
        System.out.println("");
        int status;
        System.out.println("Build Heap");
        for (int i=(n/2)-1; i>=0; i--) {
            status = 1;
            heapA(arr,n,i); 
        }
        // One by one extract (Max) an element from heap and replace it with the last element in the array
        for (int i=n-1; i>0; i--) {          
            // arr[0] is a root of the heap and is the min element in heap, move current root to end
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
            System.out.println("");
            // Print the number of the iteration
            System.out.print("Iteration " + iteration + '\n');
            System.out.println("Extract root:");
            printArray(arr);
            // Call max heap on the reduced heap 
            status = 2;
            heapA(arr,i,0); 
            // Iteration goes on
            iteration++;
        } 
        System.out.println("");
        System.out.print("The sorted array: " + '\n');
        printArray(arr);
    } 
    // To heapify a subtree rooted with node i which is an index in arr[] and n is size of heap 
    void heapA(int arr[], int n, int i) {
        int smallest = i;  // Initialize smallest as root 
        int left = (2*i)+1;
        int right = (2*i)+2;
        // If left child is smaller than root 
        if (left < n && arr[left] < arr[smallest]) {
            System.out.println("Comparing " + arr[left] + " and " + arr[smallest]);
            smallest = left;
        }
        // If right child is smaller than the smallest so far 
        if (right < n && arr[right] < arr[smallest]) {
            System.out.println("Comparing " + arr[right] + " and " + arr[smallest]);
            smallest = right;
        }
        // If the smallest is not root
        if (smallest != i) {
            int swap = arr[i]; 
            arr[i] = arr[smallest]; 
            arr[smallest] = swap; 
            System.out.println("Swapping result:");
            printArray(arr);
            // Recursive call to heapify the sub-tree
            heapA(arr,n,smallest);
        } 
    } 
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print('\n');
    }
}
