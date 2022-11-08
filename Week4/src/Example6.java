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
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir N değeri giriniz");
        int N = input.nextInt();
        boolean asalmi = true;
        for(int i=2; i<N; i++){
            if(N%1 == 0){
                asalmi = false;
            }
        }
        if(asalmi = true && N!=1){
            System.out.println("Sayı asaldır.");
        }
        else {
            System.out.println("Sayı asal değildir.");
        }
    }
    
}
