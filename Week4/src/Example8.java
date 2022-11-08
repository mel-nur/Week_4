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
public class Example8 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz:");
        int n = input.nextInt();
        int i;
        
        for(i = 1; i<=n; i++){
            int t1 = i;
        }
        for(i=1; i<=n; i+=2){
            int t2 = i;
        }
        for(i=2; i<=n; i+=2){
            int t3 = i;
        }
        String t1 = null;
        System.out.println("/n1 den " +n+ "e kadar olan sayıların toplamı:" +t1);
        String t2 = null;
        System.out.println("1 den" +n+ "e kadar olan sayıların toplamı:" +t2);
        String t3 = null;
        System.out.println("1 den " +n+ " e kadar çift olan sayıların toplamı:" +t3);
    }
    
    
}
