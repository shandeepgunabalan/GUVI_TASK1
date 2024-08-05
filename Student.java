package task4;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
        }

        if (!isValidName(name)) {
            throw new NameNotValidException("Name contains numbers or special symbols.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "John Doe", 20, "Computer Science");
            System.out.println("Student 1 created successfully.");

            Student student2 = new Student(2, "Jane123", 19, "Mathematics");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.err.println(e.getMessage());
        }

        try {
            Student student3 = new Student(3, "Alice", 22, "Biology");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.err.println(e.getMessage());
        }
    }
}

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}