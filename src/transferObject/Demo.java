package transferObject;

/**
 *  Demonstrates transfer object pattern. This pattern is used when we want to pass data with multiple attributes in
 *  one shot from client to server. Transfer object is also known as Value Object. Transfer Object is a simple POJO
 *  class having getter/setter methods and is serializable so that it can be transferred over the network. It do not
 *  have any behavior. Server side business class normally fetches data from the database and fills the POJO and send
 *  it to the client or pass it by value. For client, transfer object is read-only. Client can create its own
 *  transfer object and pass it ot server to update values in database in one shot.
 */
public class Demo {
    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();

        studentBO.getAllStudents().stream().forEach(student -> {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        });

        StudentVO student = studentBO.getAllStudents().get(0);
        student.setName("Micheal");
        studentBO.updateStudent(student);

        student = studentBO.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}
