package org.perscholas.stevealexbowman;


// Creating a class called AnotherStudent
public class AnotherStudent {
    private int stId;
    // String formattedNumber
    private String stFName;
    private String stLName;
    private String stEmail;
    private int stPhoneNumber;

    // Creating the constructor for AnotherStudent class
    public AnotherStudent(int stId, String stFName, String stLName, String stEmail, int stPhoneNumber) {
        this.stId = stId;
        this.stFName = stFName;
        this.stLName = stLName;
        this.stEmail = stEmail;
        this.stPhoneNumber = stPhoneNumber;
    }

    // Creating a getter/accessor (StId) to receive the information to be used with setter/mutator
    public int getStId() {
        return stId;
    }
    // Creating a setter/mutator (StId) to set/store the information that was obtained using the  getter/accessor
    public void setStId(int stId) {
        this.stId = stId;
    }

    public String getStFName() {
        return stFName;
    }

    public void setStFName(String stFName) {
        this.stFName = stFName;
    }

    public String getStLName() {
        return stLName;
    }

    public void setStLName(String stLName) {
        this.stLName = stLName;
    }

    public String getStEmail() {
        return stEmail;
    }

    // Code continues .............

    public void setStEmail(String stEmail) {
        this.stEmail = stEmail;
    }

    public int getStAge() {
        return stPhoneNumber;
    }

    public void setStAge(int stAge) {
        this.stPhoneNumber = stAge;
    }

    // Creating a method to display the information for the student
    public void printStudent() {
        System.out.printf("Student ID:%03d\n" , this.stId);  // %03d used to format
        System.out.println("First Name: " + this.stFName);
        System.out.println("Last Name: " + this.stLName);
        System.out.println("Email: " + this.stEmail);
        System.out.println("Phone: " + this.stPhoneNumber);

    }
    // Main method --> entry point of the program
    public static void main(String[] args) {
        AnotherStudent st1 = new AnotherStudent(1, "John", "Doe", "john@doe.com", 123-123-1231);
        st1.printStudent();  // invoking the printStudent() method to display the student information to the console
    }
  }

