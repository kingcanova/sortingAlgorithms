import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
        int[] a = {1,9,7,3,2,4,8,5,6,15,11,14,12,10};

        //Get Number List 
        int[] numList = new int[100000];
        File file = new File("numList.txt");

        try{
            Scanner sc = new Scanner(file);
            int i = 0; 
            while(sc.hasNextLine()){
                numList[i] = sc.nextInt();
                i++;
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

        //*******Unsorted*******************

        System.out.println("**Unsorted Tests: Sort 100,000 Random Ints**"); 
        System.out.println();

        //Bubble Sort 
        System.out.println("Bubble Sort");
        long start = System.currentTimeMillis();
        bubble_sort(numList.clone());
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Selection Sort
        System.out.println("Selection Sort");
        start = System.currentTimeMillis();
        selection_sort(numList.clone());
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Insertion Sort
        System.out.println("Insertion Sort");
        start = System.currentTimeMillis();
        int[] test = numList.clone();
        insertion_sort(test);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Quick Sort 
        System.out.println("Quick Sort");
        start = System.currentTimeMillis();
        int[] qsList = numList.clone();
        quick_sort(qsList,0,qsList.length-1);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Merge Sort 
        System.out.println("Merge Sort");
        start = System.currentTimeMillis();
        merge_sort(numList.clone());
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Heap Sort 
        System.out.println("Heap Sort");
        start = System.currentTimeMillis();
        int[] sorted = numList.clone();
        heap_sort(sorted);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        // Sorted Tests *******************************
        System.out.println("**Sorted Tests: Sort 100,000 Sorted Ints**"); 

        System.out.println();

        //Bubble Sort 
        System.out.println("Bubble Sort");
        start = System.currentTimeMillis();
        bubble_sort(sorted);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Selection Sort
        System.out.println("Selection Sort");
        start = System.currentTimeMillis();
        selection_sort(sorted);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Insertion Sort
        System.out.println("Insertion Sort");
        start = System.currentTimeMillis();
        insertion_sort(sorted);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Quick Sort 
        System.out.println("Quick Sort");
        start = System.currentTimeMillis();
        quick_sort(sorted,0,sorted.length-1);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Merge Sort 
        System.out.println("Merge Sort");
        start = System.currentTimeMillis();
        merge_sort(sorted);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Heap Sort 
        System.out.println("Heap Sort");
        start = System.currentTimeMillis();
        heap_sort(sorted);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

    }
    public static void mainNLGN(String[] args)
    {
        int[] a = {1,9,7,3,2,4,8,5,6,15,11,14,12,10};

        //Get Number List 
        int[] numList = new int[5000000];
        File file = new File("milList.txt");

        try{
            Scanner sc = new Scanner(file);
            int i = 0; 
            while(sc.hasNextLine()){
                numList[i] = sc.nextInt();
                i++;
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

        //Clone 

        int[] heapUn = numList.clone();
        int[] quickUn = numList.clone();
        int[] qsm3Un = numList.clone();
        int[] mergeUn = numList.clone();

        //*******Unsorted*******************
        System.out.println("**Unsorted Tests: Sort 5,000,000 Random Ints**"); 
        System.out.println();

        //Heap Sort 
        System.out.println("Heap Sort");
        long start = System.currentTimeMillis();
        heap_sort(heapUn);
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Quick Sort 
        System.out.println("Quick Sort");
        start = System.currentTimeMillis();
        quick_sort(quickUn,0,quickUn.length-1);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Quick Sort M3
        System.out.println("Quick Sort M3");
        start = System.currentTimeMillis();
        qsm3(qsm3Un);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Merge Sort 
        System.out.println("Merge Sort");
        start = System.currentTimeMillis();
        merge_sort(mergeUn);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //clone sorted 
        int[] heapSorted = mergeUn.clone();
        int[] quickSorted = mergeUn.clone();
        int[] qsm3Sorted = mergeUn.clone();
        int[] mergeSorted = mergeUn.clone();

        // Sorted Tests *******************************
        System.out.println("**Sorted Tests: Sort 5,000,000 Sorted Ints**"); 

        System.out.println();

        //Heap Sort 
        System.out.println("Heap Sort");
        start = System.currentTimeMillis();
        heap_sort(heapSorted);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Quick Sort 
        System.out.println("Quick Sort");
        start = System.currentTimeMillis();
        quick_sort(quickSorted,0,quickSorted.length-1);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Quick Sort M3
        System.out.println("Quick Sort M3");
        start = System.currentTimeMillis();
        qsm3(qsm3Sorted);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        //Merge Sort 
        System.out.println("Merge Sort");
        start = System.currentTimeMillis();
        merge_sort(mergeSorted);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start)/1000.000 + " seconds");
        System.out.println();

        
    }

    
    /**
     * Bubble Sort
     * Runs in O(n^2) time. 
     * Compares pairs of numbers over the whole array and swaps when 
     * the 1st number is bigger than the 2nd. 
     */
    public static void bubble_sort(int[] x)
    {
        //x represents an array of random numbers 

        //System.out.println(Arrays.toString(x));
        for(int i = 0; i < x.length-1; i++) //i represents first num in pair 
        {
            for(int j = i+1; j < x.length; j++) //j represents second num in pair 
            {
                if(x[i] > x[j]) //if the 1st num is bigger than 2nd 
                {
                    int place = x[j]; //placeholder for swapping. 
                    x[j] = x[i];//Swap the pair
                    x[i] = place; 
                }
                //System.out.println(Arrays.toString(x));
            }
        }
    }

    /**
     * Selection Sort - O(n^2) 
     * 
     * This sort finds the min value in the list, 
     * and swaps it with the index i as you're going 
     * through the array. 
     */
    public static void selection_sort(int[] x)
    {
        //System.out.println(Arrays.toString(x));
        for(int i = 0; i < x.length; i++) //i keeps track of where you are in the list
        {
            int min = i; //set min to the first index in list 
            for(int j = i+1; j < x.length; j++) //goes through rest of list and finds a new min
            {
                if(x[j] < x[min])//If what you're looking at is less than min
                {
                    min = j; //set new min 
                }
            }
            if(min != i)
            {
                //Swap
                int place = x[i];  
                x[i] = x[min];
                x[min] = place;
            }
            //System.out.println(Arrays.toString(x));

        }
    }

    /**
     * Non-recursive Insertion Sort 
     * You have a cur index (i) and a j index that is paired
     * with j-1 for swapping numbers all around the list. 
     * 
     * The outer for loop keeps track of where you are in the list. 
     * 
     * The inner while loop initially looks at the cur value
     * (i or initially j) and the value right before it(j-1), 
     * and if the value of arr[j-1] is > arr[j] then you SWAP. 
     * the while loop continues backwards swapping all values 
     * until 0 - i is sorted. then i is incremented and the process
     * is repeated. 
     */
    public static void insertion_sort(int[] arr){

        for(int i=0; i<arr.length; i++){
            int j=i; 
            while(j>0 && arr[j-1] > arr[j]){ //Shift all values up 
                //swap
                int place = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = place; 

                j--; 
            }

        }
    }

    /**
     * Quick Sort O(nlgn) in most cases: 
     * Find a pivot value (in this case the middle value) 
     * and split the array. Iterate through the array from bottom and 
     * from the top with two counters. i from bottom and j from top. 
     * when i finds a value that is > than the pivot, swap it when j 
     * finds a value that is less than the pivot. 
     * 
     * You now have 2 somewhat sorted lists, so now recursively 
     * call quick sort on each list. 
     */
    public static void quick_sort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot (partition) 
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                //Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quick_sort(arr, low, j);

        if (high > i)
            quick_sort(arr, i, high);
    }

    /**
     * Merge Sort O(nlgn) 
     *  Continuously divide list in half until you are 
     *  looking at single integers, repopulate the list in order 
     *  by comparing each list with 2 counters. 
     */
    public static void merge_sort(int[] inputArray) {
        int size = inputArray.length;
        if (size < 2)
            return;
        int mid = size / 2;
        int leftSize = mid; //size of left is equal to index of the mid
        int rightSize = size - mid;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        //populate left array 
        for (int i = 0; i < mid; i++) {
            left[i] = inputArray[i];

        }
        //populate right array 
        for (int i = mid; i < size; i++) {
            right[i - mid] = inputArray[i];
        }
        //recurse on the left and right 
        merge_sort(left);
        merge_sort(right);
        //start putting the lists back together 
        merge(left, right, inputArray);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0; //i == left index // j == right index // k == index of new array
        while (i < leftSize && j < rightSize) { //this loop searches through both lists, and terminates when one reaches the end. 
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        //these loops take care of the remaining list when the top loop finishes
        //only one will trigger. it just puts the rest of the numbers in left or right
        //for example, right has reached the end, so left must be in order. proceed 
        //to put all of left into answer 
        while (i < leftSize) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < rightSize) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }

    //**
    //**
    //**Heap Sort 
    //**
    //**
    //**

    private static int N;
    /* Sort Function */
    public static void heap_sort(int arr[])
    {       
        heapify(arr);        
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
    }     

    /* Function to build a heap */   
    public static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }

    /* Function to swap largest element in heap */        
    public static void maxheap(int arr[], int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])        
            max = right;

        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }    

    /* Function to swap two numbers in an array */
    public static void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
    }    

    /* Main method */
    public static void mainheap(String[] args) 
    {
        Scanner scan = new Scanner( System.in );        
        System.out.println("Heap Sort Test\n");
        int n, i;    
        /* Accept number of elements */
        System.out.println("Enter number of integer elements");
        n = scan.nextInt();    
        /* Make array of n elements */
        int arr[] = new int[ n ];
        /* Accept elements */
        System.out.println("\nEnter "+ n +" integer elements");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        /* Call method sort */
        heap_sort(arr);
        /* Print sorted Array */
        System.out.println("\nElements after sorting ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();            
    }

    
    
    
    
    
    
    ///NOT COMMMENT QSM3 CODE

    public static void qsm3(int[] intArray) {
        recQuickSort(intArray, 0, intArray.length - 1);
    }

    public static void recQuickSort(int[] intArray, int left, int right) {
        int size = right - left + 1;
        if (size <= 3)
            manualSort(intArray, left, right);
        else {
            double median = medianOf3(intArray, left, right);
            int partition = partitionIt(intArray, left, right, median);
            recQuickSort(intArray, left, partition - 1);
            recQuickSort(intArray, partition + 1, right);
        }
    }

    public static int medianOf3(int[] intArray, int left, int right) {
        int center = (left + right) / 2;

        if (intArray[left] > intArray[center])
            swap(intArray, left, center);

        if (intArray[left] > intArray[right])
            swap(intArray, left, right);

        if (intArray[center] > intArray[right])
            swap(intArray, center, right);

        swap(intArray, center, right - 1);
        return intArray[right - 1];
    }    

    public static int partitionIt(int[] intArray, int left, int right, double pivot) {
        int leftPtr = left;
        int rightPtr = right - 1;

        while (true) {
            while (intArray[++leftPtr] < pivot)
                ;
            while (intArray[--rightPtr] > pivot)
                ;
            if (leftPtr >= rightPtr)
                break;
            else
                swap(intArray, leftPtr, rightPtr);
        }
        swap(intArray, leftPtr, right - 1);
        return leftPtr;
    }

    public static void manualSort(int[] intArray, int left, int right) {
        int size = right - left + 1;
        if (size <= 1)
            return;
        if (size == 2) {
            if (intArray[left] > intArray[right])
                swap(intArray, left, right);
            return;
        } else {
            if (intArray[left] > intArray[right - 1])
                swap(intArray, left, right - 1);
            if (intArray[left] > intArray[right])
                swap(intArray, left, right);
            if (intArray[right - 1] > intArray[right])
                swap(intArray, right - 1, right);
        }
    }

}