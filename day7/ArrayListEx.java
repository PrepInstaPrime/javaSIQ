import java.util.*;
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.set(0, 4);
         System.out.println(list);
         list.remove(1);
          System.out.println(list);
        // clear to remove everything
        System.out.println(list.size());
        for(int val:list){
            System.out.println(val);
        }
    }

}
