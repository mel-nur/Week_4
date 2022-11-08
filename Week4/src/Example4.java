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
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen alt sayı giriniz");
        int alt_sinir = input.nextInt();
        System.out.println("Lütfen üst sayı giriniz");
        int ust_sinir = input.nextInt();
        
        for (int i = alt_sinir; i <= ust_sinir; i++){
            if (i%3 == 0 || i%4 == 0){
                System.out.println(i);
            }
        }
    }
    
}
