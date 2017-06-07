/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baslangic;

/**
 *
 * @author besim
 */
public class Baslangic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(faktoriyel(5));
    }

    private static int faktoriyel(int i) {
        if (i==1) {
            return 1;
        }
        else
            return (i*(faktoriyel(i-1)));
    }
    
}
