/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.objects3;

/**
 *
 * @author linhdo
 */
public class Food {
    private double RetailPrice;

    public final double getRetailPrice() {
        return RetailPrice;
    }

    public final void setRetailPrice(double RetailPrice) {
        this.RetailPrice = RetailPrice;
    }
    
    public final void HaveExpDate(){
        System.out.println("The exp date is: 6 months from the produced date.");
    }
    
}
