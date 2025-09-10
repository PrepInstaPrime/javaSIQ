
public class MethodEx {
    void add (int a, int b){
        System.out.println(a+b);
    }
    int mul(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        MethodEx obj = new MethodEx();
        obj.add(5, 3);
        obj.add(7, 3);
        obj.add(51, 3);
        int multiplication= obj.mul(4, 5);
        System.out.println(multiplication);
        obj.add(multiplication, multiplication);

    }
}
