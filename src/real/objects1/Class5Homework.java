/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package real.objects1;
import java.util.Scanner;
/**
 *
 * @author linhdo
 */
public class Class5Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the kind of beef you want to purchase: ");
        String answer = keyboard.nextLine();
        
        
        Beef b1 = new Beef();
        b1.setBeefBrand(answer);
        b1.setRetailPrice(10.99);
        System.out.println("The price of " + b1.getBeefBrand() + " is " +
                b1.getRetailPrice() + " included item info below : ");
        
        
        Food b2 = new Beef();
        b2.ExpDate();
        
        Meat b3 = new Beef();
        b3.NutritionFact();
        
        
        
        
        
        
        
    }
    
}
