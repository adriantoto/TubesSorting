package tubessorting;
public class SelectionSort {
    
    public void selectionSort(int[] arr) {
        int n = arr.length; //length of the array
        System.out.print("The unsorted array: " + '\n');
        printArray(arr);
        for (int i = 0; i < n - 1; i++) {
            int min = i; //set the first position as minimum
            System.out.println("Iteration " + (i + 1));
            //Find the smallest element by comparing with the element in Min position
            for (int j = i + 1; j < n; j++) {
                System.out.println("Comparing " + arr[min] + " and " + arr[j]);
                if (arr[j] < arr[min]) {
                    System.out.println(arr[min] + " \u2265 " + arr[j]);
                    min = j;
                }
            }
            //Swap the smallest element with element in MIN position
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            System.out.println("Swapping Element :");
            printArray(arr);       
        }
        System.out.print("The sorted array: " + '\n');
        printArray(arr);
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println('\n');
    }
}
