import java.util.*;



public class Main {

   

   static void Statyczna() {

     System.out.println("Statyczna mozna bez wywolania");

   }

  

   public void Publiczna(){

     System.out.println("Publiczna musisz wywolac");

   }

  

    public static void main(String[] args) {

      

       Main obj= new Main();

      obj.Publiczna();

      Statyczna();

     

    }

}
