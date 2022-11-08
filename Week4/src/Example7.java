/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */ import java.util.Scanner;
public class Example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir pozitif tam sayı giriniz");
        int a = input.nextInt();
        
        for(int i= 1; i<=a; i++){
            if(a%i == 0){
                System.out.println(i);
            }
        }
        System.out.println(a + "Tamsayının tam bölenleri");
    }
    
}
