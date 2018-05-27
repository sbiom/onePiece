/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytutorialapp1;

import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author Φερνάντα
 */
public class MyTutorialApp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Άθροισμα δύο αριθμών");
        System.out.println("Δώστε τον έναν προσθεταίο και πατήστε Enter");
        Double num1 = in.nextDouble();
        System.out.println("Δώστε τον δεύτερο προσθεταίο και πατήστε Enter");
        Double num2 = in.nextDouble();
        System.out.println(String.valueOf(num1 + num2));
        //άλλαξε κάτι, π.χ. το λεκτικό και ανέβασε το πάλι
    }

}
