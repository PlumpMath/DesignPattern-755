package transferObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Student business object. Business service which files the transfer object({@link transferObject.StudentVO}) with
 * data.
 */
public class StudentBO {

    /**
     * List is working as a database
     */
    private List<StudentVO> students;

    public StudentBO() {
        students = new ArrayList<>();

        StudentVO student1 = new StudentVO("Robert", 0);
        StudentVO student2 = new StudentVO("John", 1);
        students.add(student1);
        students.add(student2);
    }

    public void deleteStudent(StudentVO studentVO) {
        students.remove(studentVO.getRollNo());
        System.out.println("Student: Roll No " + studentVO.getRollNo() + ", deleted from dastabase.");
    }

    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO studentVO) {
        students.get(studentVO.getRollNo()).setName(studentVO.getName());
        System.out.println("Student: Roll No " + studentVO.getRollNo() + ", updated in the database.");
    }

}
