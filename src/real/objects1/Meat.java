/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.objects1;

/**
 *
 * @author linhdo
 */
public abstract class Meat implements Food{
    private double RetailPrice;

    @Override
    public double getRetailPrice() {
        return RetailPrice;
    }

    @Override
    public void setRetailPrice(double RetailPrice) {
        this.RetailPrice = RetailPrice;
    }
    
    public void NutritionFact(){
        System.out.println("The nutrition fact is: more protein.");
    }
    
    
}
