package oop2;

/**
 *
 * @author Dede Hendri
 */
public class Panggil {
        public static void main (String[] args) {
        Jenishwn hw = new Jenishwn();
        
        hw.setMakanan("Daging&Rumput");
        System.out.println("Makanan Hewan = " +hw.getMakanan());
        hw.setBerkembangbiak("Melahirkan & Menyusui");
        System.out.println("Cara berkembangbiak hewan = " +hw.getBerkembangbiak());
        hw.Tmpljenis();
        hw.Tmplhabitat();
        hw.Berjalan("Hewan Berjalan = " +"dengan 2 kaki");
        hw.Berjalan("Hewan Berjalan = " +"Dengan 4 kaki", "Melata");
    }

    
}
