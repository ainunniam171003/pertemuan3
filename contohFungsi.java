/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author User
 */
public class contohFungsi {
    int A = 12;
    int T = 5;
    
    int hitungluasSegitiga(){
        int luas = (int) (0.5*A*T);
        System.out.println("A = " + A);
        System.out.println("T = " + T);
        return luas;
    }
    
    public static void main(String[] args){
        contohFungsi F = new contohFungsi();
        System.out.println("Luas Segitiga = "+ F.hitungluasSegitiga() );    
        

    }
    
}