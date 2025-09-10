package lecture3;

public class Conditional {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18) {
            System.out.println("You are eligibile to vote");
        } else {
            System.out.println("You are not eligibile to vote");
        }

        // grading system
        int marks = 5;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

        // switch case example
        String choice = "Apple";
        switch (choice) {
            case "Apple":
                System.out.println("Apple : Rs. 50");
                break;
            case "Orange":
                System.out.println("Orange : Rs. 50");
                break;
            case "Mango":
                System.out.println("Mango : Rs. 50");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
