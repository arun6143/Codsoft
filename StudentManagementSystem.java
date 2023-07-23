import java.util.Scanner;

public class StudentManagementSystem {
    static String[] roll_no = new String[30];
    static String[] name = new String[30];
    static String[] Class = new String[30];
    static String[] course = new String[30];
    static String[] mobile_no = new String[30];
    static String[] admission_year = new String[30];
    static int total = 0;

    public static void enter() {
        int ch = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many students do you want to enter?");
        ch = input.nextInt();

        if (total == 0) {
            total += ch;
            for (int i = 0; i < ch; i++) {
                System.out.println("\nEnter the Data of student " + (i + 1) + "\n");
                System.out.println("Enter Roll NO:");
                roll_no[i] = input.next();
                System.out.println("Enter Name:");
                name[i] = input.next();
                System.out.println("Enter Class:");
                Class[i] = input.next();
                System.out.println("Enter Course:");
                course[i] = input.next();
                System.out.println("Enter Mobile NO:");
                mobile_no[i] = input.next();
                System.out.println("Enter Admission Year:");
                admission_year[i] = input.next();
            }
        } else {
            for (int i = total; i < ch + total; i++) {
                System.out.println("\nEnter the Data of student " + (i + 1) + "\n");
                System.out.println("Enter Roll NO:");
                roll_no[i] = input.next();
                System.out.println("Enter Name:");
                name[i] = input.next();
                System.out.println("Enter Class:");
                Class[i] = input.next();
                System.out.println("Enter Course:");
                course[i] = input.next();
                System.out.println("Enter Mobile NO:");
                mobile_no[i] = input.next();
                System.out.println("Enter Admission Year:");
                admission_year[i] = input.next();
            }
            total += ch;
        }
    }

    public static void show() {
        if (total == 0) {
            System.out.println("No Data is Entered");
        } else {
            for (int i = 0; i < total; i++) {
                System.out.println("\nData of Student " + (i + 1) + "\n");
                System.out.println("Roll NO: " + roll_no[i]);
                System.out.println("Name: " + name[i]);
                System.out.println("Class: " + Class[i]);
                System.out.println("Course: " + course[i]);
                System.out.println("Mobile NO: " + mobile_no[i]);
                System.out.println("Admission Year: " + admission_year[i]);
            }
        }
    }

    public static void search() {
        if (total == 0) {
            System.out.println("No data is entered");
        } else {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the roll no of student");
            String rollno = input.next();
            for (int i = 0; i < total; i++) {
                if (rollno.equals(roll_no[i])) {
                    System.out.println("Roll NO: " + roll_no[i]);
                    System.out.println("Name: " + name[i]);
                    System.out.println("Class: " + Class[i]);
                    System.out.println("Course: " + course[i]);
                    System.out.println("Mobile NO: " + mobile_no[i]);
                    System.out.println("Admission Year: " + admission_year[i]);
                }
            }
        }
    }

    public static void update() {
        if (total == 0) {
            System.out.println("No data is entered");
        } else {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the roll no of student which you want to update");
            String rollno = input.next();
            for (int i = 0; i < total; i++) {
                if (rollno.equals(roll_no[i])) {
                    System.out.println("\nPrevious data\n");
                    System.out.println("Data of Student " + (i + 1));
                    System.out.println("Roll NO: " + roll_no[i]);
                    System.out.println("Name: " + name[i]);
                    System.out.println("Class: " + Class[i]);
                    System.out.println("Course: " + course[i]);
                    System.out.println("Mobile NO: " + mobile_no[i]);
                    System.out.println("Admission Year: " + admission_year[i]);
                    System.out.println("\nEnter new data\n");
                    System.out.println("Enter Roll NO:");
                    roll_no[i] = input.next();
                    System.out.println("Enter Name:");
                    name[i] = input.next();
                    System.out.println("Enter Class:");
                    Class[i] = input.next();
                    System.out.println("Enter Course:");
                    course[i] = input.next();
                    System.out.println("Enter Mobile NO:");
                    mobile_no[i] = input.next();
                    System.out.println("Enter Admission Year:");
                    admission_year[i] = input.next();
                }
            }
        }
    }

    public static void delete() {
        if (total == 0) {
            System.out.println("No data is entered yet");
        } else {
            Scanner input = new Scanner(System.in);
            System.out.println("Are you Sure to Delete Data?");
            System.out.println("Press 1 to delete all record");
            int a = input.nextInt();
            if (a == 1) {
                total = 0;
                System.out.println("All record is deleted..!!");
            } else {
                System.out.println("Please Press 1 to Delete All Record");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;
        while (true) {
            System.out.println("\nPress 1 to Enter data");
            System.out.println("Press 2 to Show data");
            System.out.println("Press 3 to Search data");
            System.out.println("Press 4 to Update data");
            System.out.println("Press 5 to Delete data");
            System.out.println("Press 6 to Quit");
            value = input.nextInt();
            switch (value) {
                case 1:
                    enter();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}