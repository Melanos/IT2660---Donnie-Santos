import java.util.Random;
public class RecursiveDriver
{
    public static void main(String[] args)
    {
        int[] randomNumbers = new int[100];
        int[] sorted = new int[100];

        Random ran = new Random();
        int num = ran.nextInt(101);


        RecursiveMergeSort test = new RecursiveMergeSort();
        System.out.println("Unsorted Array:");
        test.unsortedArray(randomNumbers);
        System.out.println("Sorted Array: ");
        test.topDownMergeSort(randomNumbers, sorted);
        test.sortedArray(randomNumbers);
    }
}
