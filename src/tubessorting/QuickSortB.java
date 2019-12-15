package tubessorting;
public class QuickSortB {
    
    int partition(int arr[], int low, int high){ 
    int pivot = arr[high]; 
	int i = (low); // index of smaller element 
	for (int j=low; j<high; j++){ 
            // If current element is bigger than or 
            // equal to pivot 
            if (arr[j] >= pivot){ 
		// swap arr[i] and arr[j] 
		int temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp; 
                i++;
            } 
        }    
        // swap arr[i+1] and arr[high] (or pivot) 
	int temp = arr[i]; 
	arr[i] = arr[high]; 
	arr[high] = temp; 
        return i; 
    }
    int partition_2(int arr[], int low, int high) {
        int pivot = arr[low]; 
	int i = (high); // index of smaller element 
	for (int j=low+1; j<=i; j++){ 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot){ 
		// swap arr[i] and arr[j] 
		int temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp;
                i--;
                j--;
            }
        } 
    // swap arr[i+1] and arr[high] (or pivot) 
    int temp = arr[i]; 
    arr[i] = arr[low]; 
    arr[low] = temp; 
    return i;
    }
    /* The main function that implements QuickSort() 
    arr[] --> Array to be sorted, 
    low --> Starting index, 
    high --> Ending index */
    int i=0;
    void sort_pivot_belakang(int arr[], int low, int high){ 
        if(low < high){ 
            System.out.println("Iterasi ke-"+i);
            printArray(arr);
            System.out.println("");
            i++;
            /* pi is partitioning index, arr[pi] is 
            now at right place */
            int pi = partition(arr, low, high); 
            // Recursively sort elements before 
            // partition and after partition 
            sort_pivot_belakang(arr, low, pi-1); 
            sort_pivot_belakang(arr, pi+1, high); 
        }
    }
    void sort_pivot_depan(int arr[], int low, int high){ 
        if (low < high){ 
            System.out.println("Iterasi ke-"+i);
            printArray(arr);
            System.out.println("");
            i++;
            /* pi is partitioning index, arr[pi] is 
            now at right place */
            int pi = partition_2(arr, low, high); 
            // Recursively sort elements before 
            // partition and after partition 
            sort_pivot_depan(arr, low, pi-1); 
            sort_pivot_depan(arr, pi+1, high); 
        } 
    }
    static void printArray(int arr[]){ 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }
}
