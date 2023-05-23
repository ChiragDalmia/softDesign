package softdesign;

public class SoftDesign {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[5];

        // Populate the array with classmates' names
        students[0] = new Student("John", 1001);
        students[1] = new Student("Alice", 1002);
        students[2] = new Student("Bob", 1003);
        students[3] = new Student("Emily", 1004);
        students[4] = new Student("David", 1005);

        // Iterate over the array and print each student's name
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

    }
    
}
