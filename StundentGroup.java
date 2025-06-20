public class StudentGroup {
    public String nazwa;
    Teacher teacher;
    Student[] students;

    public StudentGroup(String nazwa, Teacher teacher) {

        this.nazwa = nazwa;

        this.teacher = teacher;

        this.students = new Student[15];

    }
    public void addstudent(Student student) {

        boolean isFull = true;

        for (int i = 0; i < students.length; i++) {

            if (students[i] == null) {

                isFull = false;

            } else if (students[i].indexNumber == student.indexNumber) {

                throw new IllegalStateException("Student figuruje już na liście");

            }
        }
        if (isFull) {

            throw new IllegalStateException("Grupa studencka jest już pełna");

        }
        for (int i = 0; i < students.length; i++) {

            if (students[i] == null) {

                students[i] = student;

            }
        }
    }
}