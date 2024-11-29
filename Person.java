public class Person{
   String name;
   String gender;
   int age;
   
   Person(String name, String gender, int age){
      this.name=name;
      this.gender=gender;
      this.age=age;
   }
   
   public String getName(){
      return name;
   }
   
   public String getGender(){
      return gender;
   }
   
   public int getAge(){
      return age;
   }
}