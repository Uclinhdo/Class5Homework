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
public class Beef extends Meat {
    private String BeefBrand;

    public final String getBeefBrand() {
        return BeefBrand;
    }

    public void setBeefBrand(String BeefBrand) {
        this.BeefBrand = BeefBrand;
    }
    
    
    @Override
    public final void HaveExpDate(){
        System.out.println("The exp date is: 6 months from the produced date.");
        
    }
    
    
    @Override
    public final void HaveNutritionFact(){
        System.out.println("The nutrition fact is: more protein.");
        
    }
    
    
}
