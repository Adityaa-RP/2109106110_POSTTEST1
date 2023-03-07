
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // Array list isinya bisa campuran int string
        ArrayList voucher = new ArrayList<>();

        String nama;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true) {
            System.out.println("[1] Tambah");
            System.out.println("[2] Lihat");
            System.out.println("[3] Memperbaharui");
            System.out.println("[4] Hapus");
            System.out.println("[5] Keluar\n");

            System.out.print("Masukkan Pilihan: ");
            int menu = Integer.parseInt(br.readLine());
            if (menu == 1) {
                // CREATE
                System.out.print("Masukkan Nama Voucher: ");
                nama = br.readLine();
                voucher.add(nama);

            } else if (menu == 2) {
                // READ
                for (int i = 0; i < voucher.size(); i++) {
                    System.out.println(voucher.get(i));
                }
            } else if (menu == 3) {
                // UPDATE
                System.out.print("Mau ganti indeks berapa: ");
                int ind = Integer.parseInt(br.readLine());
                int indeks = ind - 1;

                System.out.print("Nama voucher: ");
                String namaGanti = br.readLine();

                voucher.set(indeks, namaGanti);

            } else if (menu == 4) {
                // DELETE
                System.out.print("Delete indeks berapa: ");
                int indDel = Integer.parseInt((br.readLine()));

                voucher.remove(indDel);
            } else if(menu == 5){
                break;
            }else {
                System.out.println("Ketikan Dengan Benar!");
            }
        }
    }
}