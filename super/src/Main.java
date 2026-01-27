public class Main {
    public static void main(String[] args) {

        Person person = new Person("tom", "riddle");
        Student student = new Student("harry", "potter", 3.25);

        person.showName();
        student.showName();
        System.out.println(student.gpa);
        student.showGPA();
    }
}
