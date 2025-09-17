import java.lang.reflect.Array;
import java.util.Arrays;

interface calculator {
    public void add(int a,int b);
    default void sub(int a,int b){
        System.out.println(a-b);
    }
}
public class LamdaEx {
    public static void main(String[] args) {
        // without lamda expression
        /* 
        calculator cal= new calculator() {
            public void add(int a, int b){
                System.out.println(a+b);
            }
        };
        */
        // with lamda expression
        calculator cal=(a,b)->System.out.println(a+b);
        cal.add(4, 5);
        cal.sub(9,4);
        Integer arr[]= {2,1,4,3,6,5};
        // Arrays.sort(arr,(a,b)->a-b); // ascending order
        Arrays.sort(arr,(a,b)->b-a);
        System.out.println(Arrays.toString(arr));
    }
}
