import java.util.*;
import java.io.*;
public class Sorter{
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

    public static int[] n_range(int n, int s, int e)
    {
        Random generator = new Random();
        int[] outArray = new int[n];
        int range = e - s;
        for(int i = 0; i < n; i++)
        {
            outArray[i] = s + generator.nextInt(range+1);
        }
        return outArray;
    }

    public static int[] n_ascending(int n)
    {
        int[] outArray = new int[n];
        for(int i = 0; i < n; i++)
        {
            outArray[i] = i;
        }
        return outArray;
    }

    public static int[] n_decending(int n)
    {
        int[] outArray = new int[n];
        int num = 0;
        for(int i = n-1; i >= 0; i--)
        {
            outArray[num] = i;
            num++;
        }
        return outArray;
    }

    public static int[] n_nearly(int n, int swaps)
    {
        int[] outArray = n_ascending(n);
        Random generator = new Random();
        for(int i = 0; i < swaps; i++)
        {
            int a = 0;
            int b = 0;
            while( a == b)
            {
                a = generator.nextInt(n);
                b = generator.nextInt(n);
            }
            int hold = outArray[a];
            outArray[a] = outArray[b];
            outArray[b] = hold;
        }
        return outArray;
    }

    public static void main (String[] args){
        final String [] sortingMethods = new String [] {"bubble","selection","insert","merge","quick"};
        final String [] typeOfArray = new String [] {"assending","decending","near","random"};

        int start = 128 ; 
        int n = 2;
        int swaps = 1; 
        while(n<1048756){
            int [] ass = n_ascending(n);
            int [] dec = n_decending(n);
            int [] nearly = n_nearly(n,swaps);
            int [] rand = n_range(n,0,(n*2));

            int [][] all = new int [][]{ass,dec,nearly,rand};
            //System.out.println("BEFORE : "+ Arrays.toString(arr));
            for(int j =0 ; j< sortingMethods.length;j++)
                for(int k =0 ; k< typeOfArray.length;k++)
                    runTimeSave(all[k].clone(),typeOfArray[k],sortingMethods[j]);

            System.out.println("\n----------------------------------------\n");
            n*=2;
            swaps+=2 ; 
        }

    }

    public static void runTimeSave(int[] arr, String arrType, String sortingMethod){
        System.out.print("running "+ sortingMethod + " on "+arrType+" of size "+arr.length);
        final String [] sortingMethods = new String [] {"bubble","selection","insert","merge","quick"};
        long start =0 ; 
        long finish =0;
        long elapsedTime;
        if(sortingMethod.equals("bubble")){
            start = System.currentTimeMillis();
            bubble_sort(arr);
            finish = System.currentTimeMillis();
        }else if (sortingMethod.equals("selection")){
            start = System.currentTimeMillis();
            selection_sort(arr);
            finish = System.currentTimeMillis();
        }else if (sortingMethod.equals("insert")){
            start = System.currentTimeMillis();
            insertion_sort(arr);
            finish = System.currentTimeMillis();
        }else if (sortingMethod.equals("merge")){
            start = System.currentTimeMillis();
            merge_sort(arr);
            finish = System.currentTimeMillis();
        }
        else if (sortingMethod.equals("quick")){
            start = System.currentTimeMillis();
            quick_sort(arr,0,arr.length-1);
            finish = System.currentTimeMillis();
        }
        elapsedTime = finish-start;
        System.out.println(" elapsed time: "+ elapsedTime);
        
        String fileName = sortingMethod+arrType;
        writeData(fileName,arr.length,elapsedTime);
    }

    public static void writeData(String fileName, int size , long time){
        try{
            File file = new File("outputs",fileName+".csv");
            PrintWriter pw =  new PrintWriter(new FileOutputStream(file, true));
            StringBuilder sb = new StringBuilder();
            sb.append(size+","+time);
            sb.append('\n');
            pw.append(sb.toString());
            pw.close();
        } catch(Exception e ){
            System.err.println(e.getMessage());
        }
        finally{
            System.out.println("done!");
        }

    }

}