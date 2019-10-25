public class RecursiveMergeSort
{
    private static int[] merge_sort(int[] list)
    {
        if(list.length <= 1)
        {
            return list;
        }
        int mid = list.length/2;
        int[] left = new int[mid];
        int[] right = new int[list.length - mid];
        int[] result;

        System.arraycopy(list, 0, left, 0, mid);

        int x = 0;
        for(int i = mid; i < list.length; i++)
        {
            right[x] = list[i];
            x++;
        }

        left = merge_sort(left);
        right = merge_sort(right);
        result = merge(left, right);
        return result;
    }

    private static int[] merge(int[] left, int[] right)
    {
        int resultLength = left.length + right.length;
        int[] result = new int[resultLength];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < left.length || rightIndex < right.length)
        {
            if (leftIndex < left.length && rightIndex < right.length)
            {
                if (left[leftIndex] <= right[rightIndex])
                {
                    result[resultIndex] = left[leftIndex];
                    leftIndex++;
                    resultIndex++;
                }
                else
                {
                    result[resultIndex] = right[rightIndex];
                    rightIndex++;
                    resultIndex++;
                }
            }
            else if (leftIndex < left.length)
            {
                result[resultIndex] = left[leftIndex];
                leftIndex++;
                resultIndex++;
            }
            else if (rightIndex < right.length)
            {
                result[resultIndex] = right[rightIndex];
                rightIndex++;
                resultIndex++;
            }
        }
        return result;
    }


    private static void printList(int[] list)
    {
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main (String[] args)
    {

        int[] list = new int[100];

        for (int i = 0; i < list.length; i++)
        {
            list[i] = (int) Math.floor(Math.random() * 100) + 1;
        }

        System.out.println("Unsorted List: ");
        printList(list);
        list = merge_sort(list);
        System.out.println("Sorted List: ");
        printList(list);
    }
}

