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
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir n değeri giriniz");
        int n = input.nextInt();
        int S = 0;
        int tek_toplam = 0;
        int cift_toplam = 0;
        
        while (S<=n){
            if (S%2 == 0){
                cift_toplam = cift_toplam + S;
            }
            else{
                tek_toplam = tek_toplam + S;
            }
            S = S+1;
        }
        System.out.println("Tek toplam=" +tek_toplam+ "Çift toplam=" +cift_toplam);
    }
    
}
