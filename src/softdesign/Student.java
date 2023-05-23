

package softdesign;

class Student {
    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void sayName() {
        System.out.println("My name is " + name);
    }
}