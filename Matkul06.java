public class Matkul06 {

    String kodeMK;
    String namaMK;
    int sks;

    Dosen06[] dosenPengampu = new Dosen06[3];
    int jumlahDosen = 0;

    Matkul06(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }
    void tampilkanInfo() {

        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama MK : " + namaMK);
        System.out.println("SKS : " + sks);

        System.out.println("Dosen Pengampu :");

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("- " + dosenPengampu[i].nama);
        }
        System.out.println();
    }
    void ubahNamaMK(String namaBaru) {
        namaMK = namaBaru;
    }
    void ubahSKS(int sksBaru) {

        if (sksBaru >= 2) {
            sks = sksBaru;
        } else {
            System.out.println("SKS tidak boleh kurang dari 2");
        }
    }
    void tambahDosen(Dosen06 d) {

        if (jumlahDosen < dosenPengampu.length) {
            dosenPengampu[jumlahDosen] = d;
            jumlahDosen++;
        } else {
            System.out.println("Dosen pengampu sudah penuh");
        }

    }
}