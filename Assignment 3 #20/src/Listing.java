public class Listing
{
    private String name;
    private String address;
    private String number;

    public Listing()
    {
        name = "";
        address = "";
        number = "";
    }

    Listing(String n, String a, String _n)
    {
        name = n;
        address = a;
        number = _n;
    }

    public String toString() {
        return (("The name is: " + name + ".") +
                ("The address is: " + address + ("."))
                + ("Number is: ") + number + ("."));
    }

    Listing deepCopy()
    {
        return new Listing(name, address, number);
    }
}
