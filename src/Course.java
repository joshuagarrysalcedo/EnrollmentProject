public class Course {
    private String name;
    private double requiredGrade;

    public Course(String name, double requiredGrade) {
        this.name = name;
        this.requiredGrade = requiredGrade;
    }

    public String getName() {
        return name;
    }

    private double getRequiredGrade() {
        return requiredGrade;
    }

    public boolean passed(double grade){
        return (grade >= getRequiredGrade());
    }
}
