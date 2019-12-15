package tubessorting;
public class SelectionSortB {
    
    public void selectionSort(int[] arr) {
        int n = arr.length; //length of the array
        System.out.print("The unsorted array: " + '\n');
        printArray(arr);
        for (int i = 0; i < n - 1; i++) {
            int max = i; //set the first position as maximum
            System.out.println("Iteration " + (i + 1));
            //Find the biggest element by comparing with the element in Max position
            for (int j = i + 1; j < n; j++) {
                System.out.println("Comparing " + arr[max] + " and " + arr[j]);
                if (arr[j] > arr[max]) {
                    System.out.println(arr[max] + " \u2264 " + arr[j]);
                    max = j;
                }
            }
            //Swap the biggest element with element in MAX position
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
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
