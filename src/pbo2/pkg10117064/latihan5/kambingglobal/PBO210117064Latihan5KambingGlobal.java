/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan5.kambingglobal;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * menambahkan jumlah kambing menjadi kambing global
 */
public class PBO210117064Latihan5KambingGlobal {
//Variabel jumlahkambing menjadi variabel instance
    int jumlahKambing = 88;
        
        //Method untuk menampilkan jumlah kambing
        public void getJumlahKambing() {
            System.out.println("Jumlah kambing: " + jumlahKambing);
        }
        
        public void tambahKambing() {
            jumlahKambing = jumlahKambing + 5;
            System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBO210117064Latihan5KambingGlobal kambingSusu = 
                new PBO210117064Latihan5KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program x berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada 
        kambingSusu.getJumlahKambing();
    }
    
}
