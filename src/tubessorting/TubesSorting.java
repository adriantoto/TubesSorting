package tubessorting;
import java.util.Scanner;
public class TubesSorting {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] arr = {7, 5, 12, 3, 8, 0, -1};
        int length = arr.length;
        System.out.println("The input array: ");
        printArray(arr);
        
        int menu;
        do{
            System.out.println("Menu Sorting");
            System.out.println("1. Bubble Sort Ascending");
            System.out.println("2. Bubble Sort Descending");
            System.out.println("3. Insertion Sort Ascending");
            System.out.println("4. Insertion Sort Descending");
	    System.out.println("5. Selection Sort Ascending");
            System.out.println("6. Selection Sort Descending");
            System.out.println("7. Heap Sort Ascending");
            System.out.println("8. Heap Sort Descending");
            System.out.println("9. Quick Sort Ascending");
            System.out.println("10. Quick Sort Descending");
            System.out.print("Pilih : ");
            menu = scan.nextInt();
            switch(menu){
                case 1:
                    System.out.println("-----Bubble Sort Ascending-----");
                    BubbleSort bubble = new BubbleSort();
                    bubble.bubbleSort(arr);
                    menu = 0;
                    break;
                case 2:
                    System.out.println("-----Bubble Sort Descending-----");
                    BubbleSortB bubbleFastB = new BubbleSortB();
                    bubbleFastB.bubbleSort(arr);
                    menu = 0;
                    break;
                case 3:
                    System.out.println("-----Insertion Sort Ascending-----");
                    InsertionSort insertion = new InsertionSort();
                    insertion.insertionSort(arr);
                    menu = 0;
                    break;
                case 4:
                    System.out.println("-----Insertion Sort Descending-----");
                    InsertionSortB insertionB = new InsertionSortB();
                    insertionB.insertionSort(arr);
                    menu = 0;
                    break;    
		case 5:
                    System.out.println("-----Selection Sort Ascending-----");
                    SelectionSort selection = new SelectionSort();
                    selection.selectionSort(arr);
                    menu = 0;
                    break;
                case 6:
                    System.out.println("-----Selection Sort Descending-----");
                    SelectionSortB selectionB = new SelectionSortB();
                    selectionB.selectionSort(arr);
                    menu = 0;
                    break;    
                case 7:
                    System.out.println("---Heap Sort Ascending---");
                    HeapSortA heapA = new HeapSortA();
                    heapA.HeapSortA(arr);
                    menu = 0;
                    break;
                case 8:
                    System.out.println("---Heap Sort Descending---");
                    HeapSortB heapB = new HeapSortB();
                    heapB.HeapSortB(arr);
                    menu = 0;
                    break;
                case 9:
                    System.out.println("-----Quick Sort Ascending-----");
                    QuickSort quick = new QuickSort();
                    int n =0;
                    while(n==0){
                    System.out.print("Pilih pivot yang ingin digunakan\n"
                            +"1. Pivot Depan\n"
                            +"2. Pivot Belakang\n"
                            +"Pilihan Anda : ");
                    int k = scan.nextInt();
                    if(k==1)
                    {quick.sort_pivot_depan(arr, 0, length-1);
                    n=1;}
                    else if(k==2){
                        quick.sort_pivot_belakang(arr, 0, length-1);
                        n=1;
                    }
                    else
                        n=0;}
                    menu = 0;
                    System.out.println("The Sorted Array:");
                    printArray(arr);
                    break;
                case 10:
                    System.out.println("-----Quick Sort Descending-----");
                    QuickSortB quickB = new QuickSortB();
                    int y=0;
                    while(y==0){
                    System.out.print("Pilih pivot yang ingin digunakan\n"
                            +"1. Pivot Depan\n"
                            +"2. Pivot Belakang\n"
                            +"Pilihan Anda : ");
                    int k = scan.nextInt();
                    if(k==1)
                    {quickB.sort_pivot_depan(arr, 0, length-1);
                    y=1;}
                    else if(k==2){
                        quickB.sort_pivot_belakang(arr, 0, length-1);
                        y=1;
                    }
                    else
                        y=0;}
                    menu = 0;
                    System.out.println("The Sorted Array:");
                    printArray(arr);
                    break;    
                default:
                    System.out.println("Error");    
            }
        } while(menu != 0);
    }
    // Method for print array
     public static void printArray(int[] array){
	    for(int i=0; i < array.length; i++){  
                System.out.print(array[i] + " ");  
            } 
	    System.out.println('\n');
	}
}
