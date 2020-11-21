
package pbo10119012latihan51;
import java.util.Scanner;
/**
 *  NAMA   : DAMAI SAPUTRA LAOLI
 *  KELAS  : IF-1
 *  NIM    : 10119012
 * @author damai
 */
public class PBO10119012Latihan51 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager buruh1 = new Manager();

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        buruh1.setNik(scanner.nextLine());
        System.out.print("Masukkan Nama : ");
        buruh1.setNama(scanner.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        buruh1.setGolongan(scanner.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        buruh1.setJabatan(scanner.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        buruh1.setKehadiran(scanner.nextInt());
        System.out.println();
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t\t\t: "+buruh1.getNik());
        System.out.println("NAMA\t\t: "+buruh1.getNama());
        System.out.println("GOLONGAN\t: "+ buruh1.getGolongan());
        System.out.println("JABATAN\t\t: "+ buruh1.getJabatan());
        System.out.println();
        System.out.println("TUNJANGAN GOLONGAN\t: "+ buruh1.tunjanganGolongan(buruh1.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: "+ buruh1.tunjanganJabatan(buruh1.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: "+ buruh1.tunjanganKehadiran(buruh1.getKehadiran()));
        System.out.println();
        System.out.println("GAJI TOTAL\t: "+ buruh1.gajiTotal());



    }
}