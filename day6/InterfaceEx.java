interface contract {
    // abstract method
     public void legacy();
     // from java 8 we can have concrete methods also with the help of default keyword
     default void intro(){
        System.out.println("i am coming from interface");
     }
}

interface contract1  {
    public void work();
}
public class InterfaceEx implements contract,contract1{
    public void legacy(){
        System.out.println("Let's make our customer happy ");
    }
    public void work(){
        System.out.println(" I am software engineer");
    }
    public static void main(String[] args) {
        InterfaceEx obj= new InterfaceEx();
        obj.legacy();
        obj.intro();
    }
}
