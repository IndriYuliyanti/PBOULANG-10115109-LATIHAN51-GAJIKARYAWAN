/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan51.gajikaryawan;
import java.util.Scanner;
/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 5 menghitung gaji karyawan berdasarkan jabatan dan kehadiran
 */
public class Pboulang10115109Latihan51Gajikaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Manager karyawan;
        karyawan = new Manager();
        System.out.println("--- PROGRAM MENGHITUNG GARI KARYAWAB---");
        System.out.print("Masukan nik :");
        Scanner snik = new Scanner(System.in);
        String nik = snik.nextLine();
        karyawan.setNik(nik);
        
        System.out.print("masukan nama :");
        Scanner snm = new Scanner(System.in);
        String nama = snm.nextLine();
        karyawan.setNama(nama);
        
        System.out.println("masukan golongan ( 1/ 2/ 3):");
        Scanner sgol = new Scanner(System.in);
        int gol = sgol.nextInt();
        karyawan.setGolongan(gol);
        
        System.out.print("masukan jabatan (manager/kabag) :");
        Scanner sjb = new Scanner(System.in);
        String jabatan = sjb.nextLine();
        karyawan.setJabatan(jabatan);
        
        System.out.print("jumlah kehadiran :");
        Scanner skh = new Scanner(System.in);
        int hadir = skh.nextInt();
        karyawan.setKehadiran(hadir);
        
        System.out.println("--- HASIL PERHITUNGAN --");
        System.out.println("NIK :  "+karyawan.getNik());
        System.out.println("NAMA :"+karyawan.getNama());
        System.out.println("GOLONGAN :"+karyawan.getGolongan());
        System.out.println("JABATAN :"+karyawan.getJabatan());
        System.out.println("TUNJANGAN GOLONGAN :"+karyawan.Tunjangangolongan(gol));
        System.out.println("TUNJANGAN JABATAN:"+karyawan.Tunjanganjabatan(jabatan));
        System.out.println("TUNJANGAN KEHADIRAN :"+karyawan.Tunjangankehadiran(hadir));
        
        
        
    }
    
}
