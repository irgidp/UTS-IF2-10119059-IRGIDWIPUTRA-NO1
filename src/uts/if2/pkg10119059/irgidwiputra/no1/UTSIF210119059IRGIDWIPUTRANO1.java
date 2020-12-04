/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : UTS Tandanya Kamu
 */
package uts.if2.pkg10119059.irgidwiputra.no1;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Corazon
 */
public class UTSIF210119059IRGIDWIPUTRANO1 {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Age umur = new Age(Calendar.getInstance().get(Calendar.YEAR));
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        umur.setYearBirth(input.nextInt());
        System.out.println("");
        
        System.out.println("===== Hasil Perhitungan Umur =====");
        System.out.println("Tahun lahir anda : " +umur.getYearBirth());
        System.out.println("Hari ini tahun : " +umur.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " +umur.hitungUmur() +" Tahun");
        System.out.println("Tandanya Kamu " +umur.tandanyaKamu(umur.hitungUmur()));
    }
    
}
