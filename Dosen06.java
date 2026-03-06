public class Dosen06 {

    String nidn;
    String nama;
    int tahunMasuk;
    String jenjangPendidikan;
    String prodi;

    Dosen06(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }
    void tampilkanInfo() {
        System.out.println("NIDN : " + nidn);
        System.out.println("Nama : " + nama);
        System.out.println("Tahun Masuk : " + tahunMasuk);
        System.out.println("Jenjang Pendidikan : " + jenjangPendidikan);
        System.out.println("Prodi : " + prodi);
        System.out.println();
    }
    void ubahProdi(String prodiBaru) {
        prodi = prodiBaru;
    }
    void ubahPendidikan(String pendidikanBaru) {
        jenjangPendidikan = pendidikanBaru;
    }
}