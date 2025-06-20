public class Main {

    public static void main(String[] args) {

        Student student = new Student("Minh Du","Pham",34628,"s34628@pjwstk.edu.pl","xyz",new double[] {2, 2.5, 3, 3.5, 4, 4.5, 5});

        Student student2 = new Student("Minh Du","Pham",34628,"s34628@pjwstk.edu.pl","xyz",new double[] {2, 3.5, 5, 2, 2, 1, 2});

        Student student3 = new Student("Minh Du","Pham",34628,"s34628@pjwstk.edu.pl","xyz",new double[] {2, 3.5, 5, 2, 2, 1, 2});

        Teacher teacher = new Teacher("Maciej","Bury");

        System.out.println(student.countAVG(student.grades));

        System.out.println(student2.countAVG(student2.grades));

        StudentGroup studentGroup = new StudentGroup("14c",teacher);

        studentGroup.addstudent(student);

        studentGroup.addstudent(student2);

        studentGroup.addstudent(student3);

    }
}