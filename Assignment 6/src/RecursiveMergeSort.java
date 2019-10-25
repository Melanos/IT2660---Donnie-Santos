class RecursiveMergeSort
{
    void TopDownMergeSort(int[] mainArray, int[] copyArray) // mainArray, copyArray, int n
    {
        CopyArray(mainArray, copyArray);
        Split(copyArray, 0, 100, mainArray);
    }

    private void Split(int[] copyArray, int start, int end, int[] mainArray)
    {
        if(end - start < 2)
        {
            return;
        }
        int middle = (end + start) / 2;
        Split(mainArray, start, middle, copyArray);
        Split(mainArray, start, end, copyArray);
        CombineArray(copyArray, start, middle, end, mainArray);
    }

    private void CombineArray(int[] mainArray, int start, int middle, int end, int[] copyArray)
    {
        int s = start; //a
        int m = middle; //b

        for (int i = start; i < end; i++)
        {
            if(s < middle && (m >= end || mainArray[s] <= mainArray[m]))
            {
                copyArray[i] = mainArray[s];
                s = s + 1;
            }
            else
            {
                copyArray[i] = mainArray [m];
                        m = m + 1;
            }
        }

    }

    private void CopyArray(int[] mainArray, int[] copyArray)
    {
        System.arraycopy(mainArray, 0, copyArray, 0, 100);
    }

    void UnsortedArray(int[] unsortedArray)
    {
        for(int i = 0; i < unsortedArray.length; i++)
        {
            int random = (int)Math.floor(Math.random() * 101) ;
            unsortedArray[i] = random;
            System.out.println("\t" + i + unsortedArray[i]);
        }
    }

    void SortedArray(int[] unsortedArray)
    {
        for(int i = 0; i < unsortedArray.length; i++)
        {
            System.out.println("\t: " + i + unsortedArray[i]);
        }
    }
}
