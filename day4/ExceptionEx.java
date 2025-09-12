
public class ExceptionEx {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        try {
            // int a=10;
            // int res= a/0;
            // System.out.println(res);
            String name= args[0];
            System.out.println("My name is "+ name);
        } catch (IndexOutOfBoundsException e) {
          System.out.println(e.getMessage());
        }
        /* 
        int a=10;
        int res= a/0;
        System.out.println(res);
        */
        System.out.println("hey this is new code");
    }
}
