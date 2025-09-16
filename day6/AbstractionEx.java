abstract class Parent {
    // abstract method
     abstract void legacy();
     // concrete method
     public void Intro(){
        System.out.println("i am parent method");
     }
     public void money(){
        System.out.println("1cr");
     }
     // constructor 
     public Parent(){
        System.out.println("hey i am construtor of parent");
     }
}
public class AbstractionEx extends Parent {
    public void legacy(){
        System.out.println("Be kind to everyone");
    }
    public static void main(String[] args) {
        AbstractionEx obj = new AbstractionEx();
        obj.legacy();
        obj.money();
    }
}
