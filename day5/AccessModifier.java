package pack1;
public class AccessModifier {
    public void publicData(){
        System.out.println("hey i am public data");
    }
    protected void protectedData(){
        System.out.println("Hey i am projected data");
    }
    void defaultData(){
        System.out.println("Hey i am default data");
    }
    private void privateData(){
        System.out.println("Hey i am private data");
    }
    public static void main(String[] args) {
        System.out.println("this is coming from main mathod");
        AccessModifier obj= new AccessModifier();
        obj.publicData();
    }
}
