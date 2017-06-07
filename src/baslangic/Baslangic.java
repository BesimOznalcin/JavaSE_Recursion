
package baslangic;

public class Baslangic {

    
    public static void main(String[] args) {
       
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
