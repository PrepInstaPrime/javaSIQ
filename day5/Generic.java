class Intro<N,A,S>{
    N name;
    A age;
    S salary;
    Intro(N name, A age, S salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public void myIntro(){
        System.out.println("My name is "+name+" and i am "+age+ " Years old and my salary is "+salary);
    }
    public <T> void arrayValue(T arr[]){
        for(T val:arr){
            System.out.println(val);
        }
    }
}
public class Generic {
    public static void main(String[] args) {
        Intro<String,Integer, String> obj= new Intro<>("Gaurav Pandey", 29, "30LPA");
        Intro<String,Integer, Integer> obj1= new Intro<>("Leaner", 19,30);
        obj.myIntro();
        obj1.myIntro();
        Integer arr[]={1,2,3,4,5};
        String str[]={"Gaurav","Pandey","Mentor"};
        obj.arrayValue(arr);
        obj.arrayValue(str);
    }
}
