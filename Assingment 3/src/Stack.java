public class Stack {
    private Listing[] data;
    private int top;
    private int size;

    public Stack()
    {
        top = 1;
        size = 100;
        data = new Listing[100];
    }

    Stack(int n)
    {
        top = -1;
        size = n;
        data = new Listing[n];
    }

    private boolean isStackFull()
    {
        return top == size - 1;
    }

    boolean isStackEmpty()
    {
        return top == -1;
    }

    boolean push(Listing newNode) {
        if (isStackFull()) {
            System.out.println("Stack is Full");
            return false;
        } else {
            top = top + 1;
            data[top] = newNode.deepCopy();
            return true;
        }
    }

    Listing pop()
    {
        int topLocation;
        if(isStackEmpty())
        {
            System.out.println("Stack is empty");
            return null;
        }
        else
        {
            topLocation = top;
            top = top - 1;
            return data[topLocation];
        }
    }

    void showAll()
    {
        for(int i = top; i >= 0; i--)
            System.out.println(data[i].toString());
    }

    Listing peek()
    {
        if (isStackEmpty())
        {
            System.out.println("Stack is empty");
            return null;
        }
        else
        {
            return data[top];
        }


    }

    void expandStack()
    {
        Listing[] buff;
        buff = new Listing[size * 2];
        if (size >= 0) System.arraycopy(data, 0, buff, 0, size);
        size = size*2;
        data = buff;
    }



}
