package tubessorting;
public class InsertionSortB {

    public void insertionSort(int arr[]){ 
        // variables declaration
        int iteration = 1;
        int n = arr.length; 
        // Print the unsorted array
        System.out.print("The unsorted array: " + '\n');
        printArray(arr);
        // Start the sorting process
        for (int i = 1; i < n; i++) {
            // Print the number of the iteration
            System.out.print("Iteration " + iteration + '\n');
            // Choose the element of the array as the key
            int key = arr[i];
            int j = i-1;
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while((j > -1) && (arr[j] < key)){
                System.out.println("Comparing "+ key  + " and " + arr [j]); 
                arr [j+1] = arr [j];  
                j--;  
            }       
            arr[j+1] = key; 
            //System.out.println("Swapping Elements:");
            printArray(arr);
            iteration++;
        }
        // Print the sorted array
        System.out.print("The sorted array: " + '\n');
        printArray(arr);
     }
     // Method for print array
     public void printArray(int[] array){
	    for(int i=0; i < array.length; i++){  
                System.out.print(array[i] + " ");  
            } 
	    System.out.println('\n');
	}
}
