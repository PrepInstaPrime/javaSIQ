class A{
    String money="10lakhs";
}
// inheritance
class B extends A {
    String expense= "5Lakhs";
}
public class Inheritance {
    public static void main(String[] args) {
        B obj= new B();
        System.out.println(obj.expense);
        System.out.println(obj.money);
    }
}
