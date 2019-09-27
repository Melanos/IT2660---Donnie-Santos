public class Main
{
    public static void main(String[] args)
    {

        Stack s = new Stack(3);
        Listing list1 = new Listing("Donnie", "Progressive St.", "440-326-6234");
        Listing list2 = new Listing("Madan", "Rancho St.","216-001-0002");
        Listing list3 = new Listing("Josephine", "Mayfield Rd.","786-001-0002");
        Listing list4 = new Listing("Alexis", "Summit St.","381-001-0002");
        s.push(list1);
        s.push(list2);

        System.out.println("Top element: \n" +s.peek());
        s.push(list3);
        System.out.println("Current stack: ");
        s.showAll();
        s.expandStack();
        s.push(list3);
        System.out.println("Current Stack: ");
        s.showAll();
        s.pop();
        s.pop();
        System.out.println("Current Stack: ");
        s.showAll();
        s.pop();
        s.pop();
        s.isStackEmpty();
        s.push(list4);
        System.out.println("Current Stack: ");
        s.showAll();

    }

}
