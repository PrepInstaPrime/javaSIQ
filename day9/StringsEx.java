
public class StringsEx {
    public static void main(String[] args) {
        String str1="Hello";
        // String str2="Hello";
        String str2= new String("Hello");
        System.out.println(str1.equals(str2));
        StringBuffer str3= new StringBuffer("hey this is idk");
        str3.reverse();
        str3.append("bye this is bye");
        System.out.println(str3.charAt(0));
        System.out.println(str3.length());
    }
}
