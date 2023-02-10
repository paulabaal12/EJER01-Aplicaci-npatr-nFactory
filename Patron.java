/*Programo uso del patrón, Factory Patron */
import java.util.Scanner;


public class Patron {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int op1=0;
        Boolean continuar=true;
        cafeFactory cafe= new cafeFactory();
        cafes c = new cafes(); 
        //CoffeeFactory cafe= new CoffeeFactory();
        while(continuar){
            System.out.println("Bienvenido al Cafe");
            System.out.println("Ingrese la opción que desea");
            System.out.println("1. Americano \n2. Capuccino \n3. Caramel Mocchiato \n4. Expreso \n5. Frappe \n6. Helado \n7. Latte \n8. Mocca \n9. Salir");
            op1= sc.nextInt();
            sc.nextLine();
            if (op1==9){
                continuar=false;
            }
            else{
               c = cafe.createCoffee(op1);
               c.makecofee(); 
            }
            
        }
        



    }
}
