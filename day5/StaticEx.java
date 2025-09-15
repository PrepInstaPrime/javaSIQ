
public class StaticEx {
    static String name="example";
    public static void intro(){
        System.out.println("hey this is intro");
    }
    public static void main(String[] args) {
        // StaticEx obj = new StaticEx();
        // System.out.println(obj.name);
        System.out.println(name);
        intro();
    }
}
