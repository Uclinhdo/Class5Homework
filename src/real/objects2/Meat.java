/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.objects2;

/**
 *
 * @author linhdo
 */
public abstract class Meat extends Food {
    private double RetailPrice;

    @Override

    public double getRetailPrice() {
        return RetailPrice;
    }

    @Override
    public void setRetailPrice(double RetailPrice) {
        this.RetailPrice = RetailPrice;
    }
     
    public void HaveNutritionFact(){
        System.out.println("The nutrition fact is: more protein.");
    }
    
}
