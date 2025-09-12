

class  InvalidAge extends Exception{
   // constructor
   public InvalidAge(String message){
      super(message);
   }
}
public class CustomException {
    public static void main(String[] args) {
        try {
            int age = 17;
            if (age < 18) {
                throw new InvalidAge("Invalid Age") ;
            }
            System.out.println("Your age " + age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("hey i am finally");
        }
    }
}
