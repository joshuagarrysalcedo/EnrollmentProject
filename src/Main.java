import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static AdmissionsOffice admissionsOffice = new AdmissionsOffice();

    public static void main(String[] args) {
            runProgram();
    }//end of main


    public static void runProgram(){
        boolean start = true;
        while(start){
            System.out.println("Enter Action: (5 to show available action)\r");
            int action = sc.nextInt();
            sc.nextLine();

            switch(action){
                case 1:
                    addApplicant();
                    break;
                case 2:
                    admissionsOffice.displayList(admissionsOffice.applicantList);
                    break;
                case 3:
                    admissionsOffice.displayList(admissionsOffice.approvedList);
                    break;
                case 4:
                    admissionsOffice.displayList(admissionsOffice.rejectedList);
                    break;
                case 5:
                    admissionsOffice.displayOptions();
                    break;
                case 6:
                    System.out.println("Program will now Exit!!!");
                    start = false;
                    break;
                default:
                    System.out.println("Invalid Selection try again!");
                    runProgram();
            }//end of switch
        }//end of while loop
    }//end of method


    public static void addApplicant(){
        System.out.print("Enter First name :");
        String firstName = sc.nextLine();
        System.out.print("Enter Last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        admissionsOffice.displayCourse();
        int course = sc.nextInt(); // this will be passed to courses.get(course)

        sc.nextLine();
        System.out.println("Enter Average Grade: ");
        double avgGrade = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter previous School: ");
        String prevSchool = sc.nextLine();

        Applicant applicant = Applicant.getApplicant(firstName, lastName, age, admissionsOffice.courses.get(course-1),
                avgGrade, prevSchool);
        if(admissionsOffice.addNewApplicant(applicant)){
            System.out.println("Applicant Successfully Added!");
        }else{
            System.out.println("Applicant Already Submitted!");
        }


    }
}
