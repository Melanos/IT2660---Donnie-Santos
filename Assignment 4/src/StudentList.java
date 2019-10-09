import java.util.Scanner;

class StudentList
{
    private Scanner scanInt = new Scanner(System.in);
    private Scanner scanStr = new Scanner(System.in);
    private SinglyLinkedList linked = new SinglyLinkedList();
    private Listing list = new Listing();

    StudentList()
    {
        System.out.println("Enter number of students: ");
        int students = scanInt.nextInt();
        System.out.println("Enter # that will be used to store the data about students: ");
        int dataSet = scanInt.nextInt();


        for(int i = 0; i < dataSet; i++)
        {
            Listing list = new Listing();
            list.input();
            linked.insert(list);
        }
        askUser();
    }


    private void exit()
    {
        System.out.println("System shutting down");
        System.exit(0);

    }


    private void askUser()
    {
        int ConvertUserEntry;
        System.out.println("Please make a selection:\n ");
        System.out.println("1. Insert New Student Data\n"
                        + "2. Fetch Student Data\n"
                        + "3. Delete Student Data\n"
                        + "4. Update Student Data\n"
                        + "5. Get All Student Data\n"
                        + "6. Exit the program\n");
        ConvertUserEntry = scanInt.nextInt();

        switch (ConvertUserEntry)
        {
            case 1:
                list.input();
                linked.insert(list.deepCopy());
                linked.showAll();
                askUser();
                break;
            case 2:
                Listing fetchStudent;
                System.out.println(" Enter a name of a student to fetch:");
                String fetchKeyName = scanStr.nextLine();
                fetchStudent = linked.fetch(fetchKeyName);
                System.out.println("The Student fetched is: " + fetchStudent.toString());
                askUser();
                break;
            case 3:
                String deleteStudent;
                System.out.println("Enter a name of a student to delete from the list: ");
                deleteStudent = scanStr.nextLine();
                linked.delete(deleteStudent);
                linked.showAll();
                askUser();
                break;
            case 4:
                String updateStudent;
                System.out.println("Enter name of the students update info: ");
                updateStudent = scanStr.nextLine();
                Listing newNode = new Listing();
                newNode.input();
                linked.update(updateStudent, newNode);
                linked.showAll();
                askUser();
                break;
            case 5:
                System.out.println("List of students: ");
                linked.showAll();
                askUser();
                break;
            case 6:
                exit();
                break;
        }

    }

}

