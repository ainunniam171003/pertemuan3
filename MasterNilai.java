/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author WINDOWS 10
 */
public class MasterNilai {
    void nilailulus(String nama,int nilai){
        System.out.println("Nama : "+nama);
        System.out.println("Nilai : "+nilai);
    
        if ( nilai >= 90 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 70 ){
            System.out.println("Grade = B");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
        
        if (nilai >= 70){
            System.out.println("\t\tAnda Lulus");
        }
        else{
            System.out.println("\t\tMaaf Anda Belum Lulus");
    }
        }

 String nilailulusan( String nama, int nilai, String ket){
        System.out.println("Nama : "+nama);
        System.out.println("Nilai : "+nilai);
         if ( nilai >= 90 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 70 ){
            System.out.println("Grade =B");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
         if ( nilai >= 70 ){
            ket ="\t\tAnda Lulus";
        }else {
            ket ="\t\tMaaf Anda Belum Lulus";
        }
        return ket;
}
 static void hasilkelulusan(String nama,int nilai){
        System.out.println("Nama : "+nama);
        System.out.println("Nilai : "+nilai);
    
        if ( nilai >= 90 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 70 ){
            System.out.println("Grade =B");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
        
        if (nilai >= 70){
            System.out.println("\t\tAnda Lulus");
        }
        else{
            System.out.println("\t\tMaaf Anda Belum Lulus");
    }
        }

 static String nilaikelulusan( String nama, int nilai,String ket){
System.out.println("Nama : "+nama);
        System.out.println("Nilai : "+nilai);
         if ( nilai >= 90 ){
            System.out.println("Grade = A");
        }else if ( nilai >= 80 ){
            System.out.println("Grade = B+");
        }else if ( nilai >= 70 ){
            System.out.println("Grade =B");
        }else if ( nilai >= 60 ){
            System.out.println("Grade = C+");
        }else if ( nilai >= 50 ){
            System.out.println("Grade = C");
        }else if ( nilai >= 40 ){
            System.out.println("Grade = D");
        }else {
            System.out.println("Grade = E");
        }
         if ( nilai >= 70 ){
            ket ="\t\tAnda Lulus";
        }else {
            ket ="\t\tMaaf Anda Belum Lulus";
        }
        return ket;
} 
}
