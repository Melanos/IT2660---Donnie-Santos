import java.util.Scanner;

public class Listing {
    private String name;
    private String address;
    private String number;

    Listing() {
        name = "";
        address = "";
        number = "";
    }

    private Listing(String n, String a, String _n) {
        name = n;
        address = a;
        number = _n;
    }

    public String toString() {
        return (("The name is: " + name + ".") +
                ("The address is: " + address + ("."))
                + ("Number is: ") + number + ("."));
    }

    Listing deepCopy() {
        return new Listing(name, address, number);
    }

    int compareTo(String Name) {
        return (name.compareTo(Name));
    }

    void input() {
        Scanner intM = new Scanner(System.in);
        Scanner StringM = new Scanner(System.in);
        System.out.println(" Enter a name ");
        name = StringM.nextLine();
        System.out.println(" Enter student ID: ");
        number = intM.nextLine();
        System.out.println(" Enter student street address: ");
        address = intM.nextLine();
    }
    public static void main(String[] args) {
        StudentList student = new StudentList();

    }
}


