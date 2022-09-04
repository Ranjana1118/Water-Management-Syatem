/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watersupplymanagementsystem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ranja
 */
public class WaterSupplyManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        
        
        
        
         Splash s=new Splash();
    s.setVisible(true);
    for(int i=1;i<=100;i++)
    {
       s.jLabel2.setText(i+" %");
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(WaterSupplyManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    s.setVisible(false);
    new Login().setVisible(true);
        
        
        
        
        
    }
    
}
