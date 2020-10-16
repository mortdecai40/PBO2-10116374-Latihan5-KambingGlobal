package pbo2.pkg10116374.latihan5.kambingglobal;

/**
 * @author
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk memasukan jumlah kambing secara global
 */
public class KambingGlobal {
    
    // Variabel jumlahkambing menjad: variabel instance
    int jumlahKambing = 88;
    
    // Method untuk menamp1lkan jumlah kambing
    public void getJumlahKambing () {
        System.out.println ("Jumlah kambing: " + jumlahKambing) ;
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : " + jumlahKambing);
        
    }
public static void main(String[] args) {
    KambingGlobal kambingSusu = new KambingGlobal();
       
      //Menampi1kan jumlah kambing yang ada saat program pertama x berjalan
      kambingSusu.getJumlahKambing();
        
      // Menambah satu kambing
      kambingSusu.tambahKambing();
      
      // Menampilkan jumlah kambing yand ada
      kambingSusu.getJumlahKambing();
        
    }

}
