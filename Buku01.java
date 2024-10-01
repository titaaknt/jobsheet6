import java.util.Scanner;

public class Buku01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jenisBuku;
        double diskon = 0;
        int jumlah;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya) = ");
        jenisBuku = input.nextLine();
        System.out.print("jumlah = ");
        jumlah = input.nextInt();
        
        if (jenisBuku.equals("kamus")) {
            diskon = 10.0;
            if (jumlah > 2) {
                diskon += 2.0;
        }

        } else if (jenisBuku.equals("novel")) {
            diskon = 7.0;
            if (jumlah > 3) {
                diskon += 2.0;
            }
        } else if (jenisBuku.equals("lainnya")) {
            if (jumlah > 3) {
                diskon = 5.0;
            }
        }
        double totalDiskon = (diskon / 100);

        System.out.print("total diskon yang diberikan = " + diskon + "%");
    }
}




