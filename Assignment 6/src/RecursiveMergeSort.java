class RecursiveMergeSort
{
    void topDownMergeSort(int[] mainArray, int[] copyArray)
    {
        CopyArray(mainArray, copyArray);
        split(copyArray, 0, 100, mainArray);
    }

    private void split(int[] copyArray, int start, int end, int[] mainArray)
    {
        if(end - start < 2)
        {
            return;
        }
        int middle = (end + start) / 2;
        split(mainArray, start, middle, copyArray);
        split(mainArray, middle, end, copyArray);
        combineArray(copyArray, start, middle, end, mainArray);
    }

    private void combineArray(int[] mainArray, int start, int middle, int end, int[] copyArray)
    {
        int s = start;
        int m = middle;

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

    void unsortedArray(int[] unsortedArray)
    {
        for(int i = 0; i < unsortedArray.length; i++)
        {
            int random = (int)Math.floor(Math.random()*100);
            unsortedArray[i] = random;
            System.out.println("\t" + unsortedArray[i]);
        }
    }

    void sortedArray(int[] unsortedArray)
    {
        for (int value : unsortedArray) {
            System.out.println("\t" + value);
        }
    }
}
