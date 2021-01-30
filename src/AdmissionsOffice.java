import java.util.ArrayList;

public class AdmissionsOffice {
    ArrayList<Applicant> applicantList;
    ArrayList<Applicant> rejectedList;
    ArrayList<Applicant> approvedList;
    ArrayList<Course> courses;


    public AdmissionsOffice() {
        this.applicantList =new ArrayList<>();
        this.rejectedList =new ArrayList<>();
        this.approvedList =new ArrayList<>();
        this.courses = new ArrayList<>();
        // Everytime AdmissionsOffice class is created there is a list of objects under course name!
        CS cs = new CS();
        Educ educ = new Educ();
        Nursing nursing = new Nursing();

        courses.add(cs);
        courses.add(educ);
        courses.add(nursing);
    }

    public void displayCourse(){
        System.out.println("Select a course");
        for(int i = 0; i < courses.size(); i++){
            System.out.println((i+1) + " ----->> " + courses.get(i).getName());
        }
    }
    public void displayOptions(){
        System.out.println("1 ----->> ADD Applicant");
        System.out.println("2 ----->> View Applicant List");
        System.out.println("3 ----->> View Accepted List");
        System.out.println("4 ----->> View Rejected List");
        System.out.println("5 ----->> View Options");
        System.out.println("6 ----->> Exit Program");
    }

    public void displayList(ArrayList<Applicant> list){
        for (Applicant applicant : list) {
            applicant.displayDetails();
        }//end of for loop
    }

    public boolean addNewApplicant(Applicant applicant){
        if(findApplicant(applicant.getLastName(), applicant.getFirstName()) >= 0){ // if it is greater than or equal to
            // mean it means
            // that the
            // applicant already submitted the application.
            return false;
        }
        applicantList.add(applicant);
        if(applicationStatus(applicant)){
            approvedList.add(applicant);
        }else{
            rejectedList.add(applicant);
        }
        return true;
    }//end of boolean

        //double check if applicant has already submitted!
    private int findApplicant(String lastName, String firstName){
        for(int i=0; i<applicantList.size(); i++){
            Applicant applicant = this.applicantList.get(i);
            if(applicant.getLastName().equalsIgnoreCase(lastName) && applicant.getFirstName().equalsIgnoreCase(firstName)){
                return i;
            }
        }
        return -1;
    }//end of findApplicant

    private boolean applicationStatus(Applicant applicant){
        return applicant.status();
    }
}
