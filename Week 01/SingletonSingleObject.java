/*
Question 2 – demonstration of singleton pattern
In SingletonSingleObject.java:
*/
public class SingletonSingleObject {
   //create an object of SingletonSingleObject
   String name;

   private static SingletonSingleObject instance = null;

   //make the constructor private so that this class cannot be
   //instantiated
   private SingletonSingleObject(String n){
       name = n;
   }

   //Get the only object available
   public static SingletonSingleObject getInstance(String n){

       if (instance == null) {
           instance = new SingletonSingleObject(n);
       }

       return instance;
   }

   public void setName(String n) {
       name = n;
   }

   public void showMessage(){
      System.out.println(name+ " says Hello World!");
   }
}
