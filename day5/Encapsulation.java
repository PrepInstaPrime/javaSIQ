// here Intro class is an example of encapsulation
class Intro{
  private String name="Guarav Pandey";
  // getter method : used to access private properties outside the class
  public String getName(){
    return this.name;
  }
  // setter method : used to update the private properties outside the class
  public void setName(String newName){
    this.name=newName;
  }
}
public class Encapsulation {
    public static void main(String[] args) {
        // Encapsulation obj= new Encapsulation();
        Intro obj= new Intro();
        System.out.println(obj.getName());
        obj.setName("Learner");
        System.out.println(obj.getName());
    }
}
