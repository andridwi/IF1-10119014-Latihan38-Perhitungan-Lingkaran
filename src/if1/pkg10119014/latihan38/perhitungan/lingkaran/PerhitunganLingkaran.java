/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan38.perhitungan.lingkaran;

/**
 *
 * @author USER
 */
class PerhitunganLingkaran {

    static double jarijari;
 private static double luas,keliling;
 public static double diameter;
 public static final double PHI = 3.14;
 
 public static double hitungJariJari(){
     jarijari = diameter /2;
     return jarijari;
 }
 public static double hitungLuas(){
     luas = PHI * jarijari * jarijari;
     return luas;
 }
 public static double hitungkeliling(){
     keliling = PHI * diameter;
     return keliling;
 }
 
}
