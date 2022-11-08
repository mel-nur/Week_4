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
public class Example14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pay kısmındaki sayıyı giriniz:");
        int a = input.nextInt();
        System.out.println("Lütfen payda kısmındaki sayıyı giriniz:");
        int b = input.nextInt();
        System.out.println("Hangi basamak istediğinizi giriniz:");
        int c = 0;
        int n = input.nextInt();
        
        for(int i=1; i<=n; i++){
            a = b*10;
            c = a/b;
            a = a%b;
        }
        System.out.println("Basamak değeri" +c);
    }
    
}
