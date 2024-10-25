import java.util.Scanner;
public class stokBarang02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean selesai = false;

        while (!selesai) {
            System.out.print("Masukkan nama barang: ");
            String namaBarang = sc.nextLine();

            System.out.print("Masukkan jumlah stok untuk " + namaBarang + ": ");
            int jmlStok = sc.nextInt();

            System.out.print("Masukkan harga per unit untuk " + namaBarang + ": ");
            double hargaPerUnit = sc.nextDouble();

            double totalNilaiStok = jmlStok * hargaPerUnit;
            System.out.println("Total nilai stok " + namaBarang + ": Rp " + totalNilaiStok);

            System.out.print("Masukkan jumlah permintaan untuk " + namaBarang + ": ");
            int permintaan = sc.nextInt();

            if (permintaan <= jmlStok) {
                jmlStok -= permintaan;
                System.out.println("Permintaan dapat dipenuhi. Stok tersisa untuk " + namaBarang + ": " + jmlStok);
            } else {
                System.out.println("Permintaan melebihi stok. Stok tidak mencukupi.");
            }

            System.out.println("Setelah diproses, stok tersisa untuk " + namaBarang + ": " + jmlStok);

            System.out.println("=============== Informasi Barang ===============");
            System.out.println("Nama Barang                 : " + namaBarang);
            System.out.println("Sisa Stok                   : " + jmlStok);
            totalNilaiStok = jmlStok * hargaPerUnit;
            System.out.println("Total Nilai Stok Sekarang   : Rp " + totalNilaiStok);
            System.out.println("================================================");

            System.out.println("Apakah Anda ingin memasukkan barang lain? Ketik 'selesai' untuk berhenti, atau 'ya' untuk melanjutkan.");
            sc.nextLine();
            String lanjutkan = sc.nextLine();

            if (lanjutkan.equalsIgnoreCase("selesai")) {
                selesai = true;
            }
        }

        sc.close();
        System.out.println("Program selesai.");
    }
}