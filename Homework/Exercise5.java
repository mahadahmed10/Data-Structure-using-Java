package Homework;

public class Exercise5 {
    public static void main(String[] args) {
        Course c1= new Course("Java");
        c1.addStudent("Sureer");
        c1.addStudent("Mahad");
        c1.addStudent("Xafso");
        c1.addStudent("Ali");

        System.out.println("Course Name: "+c1.getCourseName());

        System.out.println("Student add");
        for (int i=0; i < c1.getNumberOfStudents(); i++){
            System.out.print(c1.getStudents()[i]+" ");
        }

        System.out.println();
        System.out.println("Drop student");
        c1.dropStudent("Mahad");
        for (int i=0; i < c1.getNumberOfStudents(); i++){
            System.out.print(c1.getStudents()[i]+" ");
        }
    }
}

class Course{
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course (String courseName){
        this.courseName=courseName;
        students= new String[10];
        numberOfStudents=0;
    }

    public String getCourseName(){
        return courseName;
    }

    public void addStudent(String student){
        if (numberOfStudents == students.length){
            String[] newStudent= new String[students.length * 2];
            for (int i=0; i < students.length; i++){
                newStudent[i]=students[i];
            }

            students= newStudent;
        }
        students[numberOfStudents]=student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {

                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                break;
            }
        }
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String[] getStudents() {
        return students;
    }

}