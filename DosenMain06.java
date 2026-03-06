public class DosenMain06 {
    public static void main(String[] args) {

        Dosen06 d1 = new Dosen06("001", "Muhammad Zainudin", 2018, "S2", "TI");

        System.out.println("Data Dosen:");
        d1.tampilkanInfo();

        d1.ubahProdi("SI");
        d1.ubahPendidikan("S3");

        System.out.println("Setelah diubah:");
        d1.tampilkanInfo();
    }
}