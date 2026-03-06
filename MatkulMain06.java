public class MatkulMain06 {
    public static void main(String[] args) {
        Dosen06 d1 = new Dosen06("001", "Muhammad Zainudin", 2018, "S2", "TI");
        Dosen06 d2 = new Dosen06("002", "Siti Komariyah", 2016, "S3", "SIB");

        Matkul06 mk1 = new Matkul06("MK01", "Algoritma dan Struktur Data", 3);

        mk1.tambahDosen(d1);
        mk1.tambahDosen(d2);

        System.out.println("Data Mata Kuliah:");
        mk1.tampilkanInfo();

        mk1.ubahNamaMK("Basis Data");
        mk1.ubahSKS(4);

        System.out.println("Setelah diubah:");
        mk1.tampilkanInfo();
    }
}