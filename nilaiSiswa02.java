import java.util.Scanner;
public class nilaiSiswa02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlSiswa = 0, diAtasRataRata = 0, diBawahRataRata = 0;
        double totNilai = 0;

        while (true) {
            System.out.print("Masukkan nama siswa: ");
            String nama = sc.nextLine();
            if (nama.equalsIgnoreCase("selesai")) 
            break;

            System.out.print("Masukkan nilai untuk " + nama + ": ");
            double nilai = sc.nextDouble();
            sc.nextLine();

            jmlSiswa++;
            totNilai += nilai;

            double rataRata = totNilai / jmlSiswa;
            if (nilai > rataRata) diAtasRataRata++;
            else diBawahRataRata++;
        }

        double rataRataAkhir = totNilai / jmlSiswa;
        boolean mayoritasDiAtas = diAtasRataRata > (jmlSiswa / 2.0);

        System.out.println("Rata-rata kelas: " + rataRataAkhir);
        System.out.println("Jumlah siswa di atas rata-rata: " + diAtasRataRata);
        System.out.println("Jumlah siswa di bawah rata-rata: " + diBawahRataRata);

        if (mayoritasDiAtas) {
            System.out.println("Mayoritas siswa di atas rata-rata   : Ya");
        } else {
            System.out.println("Mayoritas siswa di atas rata-rata   : Tidak");
        }

        sc.close();
    }
}