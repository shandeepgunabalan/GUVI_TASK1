package task4;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Voter {
    private String voterId;
    private String name;
    private int age;

    public Voter(String voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
     public String getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter("V001", "Alice", 20);
            System.out.println("Voter1 created: " + voter1.getName() + ", Age: " + voter1.getAge());

            Voter voter2 = new Voter("V002", "Bob", 17);
            System.out.println("Voter2 created: " + voter2.getName() + ", Age: " + voter2.getAge());
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}