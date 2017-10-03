/*
 *Johan Chandra
 *10116522
 */
package tugas3_pbo12_10116522_johanchandra;

class Mahasiswa {

    String nama;
    String nim;
    private double kuis;
    private double uts;
    private double uas;
    
    public double getKuis() {
        return kuis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setKuis(double kuis) {
        this.kuis = kuis;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
}

public class TUGAS3_PBO12_10116522_JohanChandra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Johan Chandra");
        mhs.setNim("1.0.11.65.22");
        mhs.setKuis(75);
        mhs.setUts(45);
        mhs.setUas(34);
        
        int i;
        i = 1;
        while (i <= 4) {
            System.out.println("NAMA ke " + i + " = " + mhs.getNama());
            i++;
        }
        i = 8;
        while (i >= 1) {
            System.out.println("NIM ke " + i + "  = " + mhs.getNim());
            i--;
        } 
        System.out.println("\nKUIS = "+ mhs.getKuis());
        System.out.println("UTS  = "+ mhs.getUts());
        System.out.println("UAS  = "+ mhs.getUas());
        
        double nKuis = 0.2 * mhs.getKuis();
        double nUts = 0.3 * mhs.getUts();
        double nUas = 0.5 * mhs.getUas();
        double nilai = nKuis + nUts + nUas;
        System.out.println("\nNilai Akhir = "+nilai);
        char index = 0;
        if (nilai > 80 && nilai <= 100) {
            index = 'A';
        } else if (nilai > 68 && nilai <= 80) {
            index = 'B';
        } else if (nilai > 56 && nilai <= 68) {
            index = 'C';
        } else if (nilai > 45 && nilai <= 56) {
            index = 'D';
        } else if (nilai <= 45) {
            index = 'E';
        }

        switch (index) {
            case 'A':

                System.out.println("\nIndex = " + index);
                System.out.println("Sangat Baik");
                break;
            case 'B':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Baik");
                break;
            case 'C':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Cukup");
                break;
            case 'D':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Kurang");
                break;
            case 'E':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Sangat Kurang");
                break;
            default:
                System.out.println("\nUNRECOGNIZE");
       
    }
}
}