import java.util.Scanner;
import java.util.ArrayList;

//-----Using Array List-----

public class main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      ArrayList<Person> List = new ArrayList<>();
      
      String name="";
      String gender="";
      int age=0;
      String again="yes";
      
      do{
         System.out.print("enter a name: ");
         name=sc.nextLine();
         
         System.out.print("enter gender: ");
         gender=sc.nextLine();
         
         System.out.print("enter age: ");
         age=sc.nextInt();        
         sc.nextLine(); 
         
         Person person = new Person(name,gender,age);
         List.add(person);
         
         System.out.print("Add more? yes / no: ");
         again=sc.nextLine();
      }while(again.equalsIgnoreCase("yes"));
      
      for(Person p : List){
         System.out.println("--------------");
         System.out.println("Name: "+p.getName());
         System.out.println("Gender: "+p.getGender());
         System.out.println("Age: "+p.getAge());
      }
      
   }
}