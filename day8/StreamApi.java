import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Guarav","Mohan","Karan","","raju");
        // names.stream().filter(name->!name.isEmpty()).forEach(name->System.out.println(name));
        List<String> res= names.stream().filter(name->!name.isEmpty()).map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(res);

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // square of all even numbers 
        List<Integer> out= list.stream().filter(num->(num%2==0)).map(num->(num*num)).collect(Collectors.toList());
        System.out.println(out);
    }
}
