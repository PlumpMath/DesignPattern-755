package dataAccessObject;

/**
 * Demonstrates data access object
 */
public class Demo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        studentDao.getAllStudents().stream().forEach(s -> System.out.println("Student: [RollNo : " + s.getRollNo() +
                ", Name: " + s.getName() + " ]"));

        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}
