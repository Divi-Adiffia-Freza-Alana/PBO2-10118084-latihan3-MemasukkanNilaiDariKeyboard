/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan3.memasukkannilaidarikeyboard;
import java.util.Scanner;
/**
 *
 * @author
 * Nama  : Divi Adiffia Freza Alana
 * Kelas : PBO2
 * Nim   : 10118084
 * Deskripsi Program : Program ini berisi program untuk menampilkan Nilai dari keyboard
 * 
 */
public class PBO210118084Latihan3MemasukkanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Masukkan Nama Anda: ");
        Scanner Scanner = new Scanner (System.in);
                
        String nama = Scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
    
}
