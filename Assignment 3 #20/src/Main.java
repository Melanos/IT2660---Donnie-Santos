public class Main
{
    public static void main(String[] args)
    {

        StackExpanded s = new StackExpanded(3, 3);
        Listing list1 = new Listing("Donnie", "Progressive St.", "440-326-6234");
        Listing list2 = new Listing("Madan", "Rancho St.","216-001-0002");
        Listing list3 = new Listing("Josephine", "Mayfield Rd.","786-001-0002");
        Listing list4 = new Listing("Alexis", "Summit St.","381-001-0002");

        System.out.println("Current stack: ");
        s.showAll();
        System.out.println("Is stack empty? ");
        System.out.println(s.isStackEmpty());
        System.out.println("Is stack full? ");
        System.out.println(s.isStackFull() + "\n");

        System.out.println(s.pop() + "\n");

        System.out.println("Pushing 3 lists: Donnie, Josephine and Alexis: ");
        System.out.println(s.push(list1));
        System.out.println(s.push(list3));
        System.out.println(s.push(list4));

        System.out.println("This should display our newly pushed lists:" );
        s.showAll();

        System.out.println("Resetting stack");
        s.isStackFull();
        System.out.println("Current stack: ");
        s.showAll();

        System.out.println("Pushing list 2 to the stack: ");
        System.out.println(s.push(list2));
        s.showAll();





    }
}
