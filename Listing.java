import java.util.Scanner;

public class Listing {
    String name;
    int age;


    public Listing() {
        name = " ";
        age = 0;
    }

    public Listing(String n, int a) {
        name = n;
        age = a;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        name = input.nextLine();

        System.out.println("Enter your age: ");
        age = input.nextInt();
    }

    public String toString() {
        return ("The name is: " + name + " and age: " + age);
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Listing[] arrayList = new Listing[3];

        Listing List1 = new Listing();
        Listing List2 = new Listing();
        Listing List3 = new Listing();

        arrayList[0] = List1;
        arrayList[1] = List2;
        arrayList[2] = List3;


        List1.input();
        List2.input();
        List3.input();


        for(int i = 2; i > -1; i--)
            System.out.println(arrayList[i]) ;
    }
    }
