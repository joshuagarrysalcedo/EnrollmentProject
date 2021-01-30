public class Applicant {
    private String firstName;
    private String lastName;
    private int age;
    private Course course;
    private double aveGrade;
    private String previousSchool;

    public Applicant(String firstName, String lastName, int age, Course course, double aveGrade, String previousSchool) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
        this.aveGrade = aveGrade;
        this.previousSchool = previousSchool;
    }

    public static Applicant getApplicant(String firstName, String lastName, int age, Course course, double aveGrade, String previousSchool){
            return new Applicant(firstName, lastName, age, course, aveGrade, previousSchool);
    }
    public boolean status(){
        return this.course.passed(this.aveGrade);
    }
    public void displayDetails(){
        System.out.printf("\n%20s\t%20s\t%2d\t%20s\t%5.2f%%\t%s\n", getLastName(), getFirstName(), getAge(),
                getCourse().getName(),
                getAveGrade(), getPreviousSchool());
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Course getCourse() {
        return course;
    }

    public double getAveGrade() {
        return aveGrade;
    }

    public String getPreviousSchool() {
        return previousSchool;
    }
}
