public class Student {
    public String fname;
    public String Iname;
    public int indexNumber;
    public String email;
    public String adress;
    public double[] grades;
    public Student(String fname, String Iname, int indexNumber, String email, String adress, double[] grades) {

        this.fname = fname;

        this.Iname = Iname;

        this.indexNumber = indexNumber;

        this.email = email;

        this.adress = adress;

        this.grades = grades;

    }
    public double countAVG(double[] grades) {

        double sum = 0;

        double avarage = 0;

        for (double grade : grades) {

            if (grades.length == 0) {

                throw new IllegalArgumentException("Student nie ma żadnej oceny");

            } else if (grades.length > 20) {

                throw new IllegalArgumentException("Student nie może mieć więcej niż 20 ocen");

            }
            if (grade <= 6 && grade >= 1) {

                sum += grade;

                avarage = sum / grades.length;

            } else {

                System.out.println("Invalid grade");

            }
        }
        return avarage;
    }
}