class Parent {
    public void intro(){
        System.out.println("hey i am parant");
    }
}
public class PolyMorphism extends Parent {
    // compile time polymorphism
    public int add(int a, int b){
        return a+b;
    }
    public float add(int a,float b){
        return a+b;
    }
    // this intro will be override the parent's intro and this is runtime polymorphim
    public void intro(){
        System.out.println("hey i am child");
    }
    public static void main(String[] args) {
        PolyMorphism obj= new PolyMorphism();
        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(3, 5f));
        obj.intro();
    }
}
