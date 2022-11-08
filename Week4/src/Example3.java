/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n değeri giriniz");
        int n = input.nextInt();
        int S = 1;
        int faktöriyel = 1;
        while (S<=n){
            faktöriyel = faktöriyel*S;
            S=S+1;
        }
        System.out.println("Faktöriyel=" +faktöriyel);
    }
    
}
