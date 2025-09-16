import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={1,5,4,2,3};
        // System.out.println(arr[0]);
        // System.out.println(arr[2]);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // for each 
        for(int val:arr){
            System.out.println(val);
        }
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        char letters []= new char[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the next character :");
            letters[i]=sc.next().charAt(0);
        }
        // letters[0]='a';
        // letters[1]='b';
        // letters[2]='c';
        for(char c:letters){
            System.out.println(c);
        }
    }
}
