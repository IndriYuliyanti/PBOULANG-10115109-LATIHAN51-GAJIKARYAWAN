/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan51.gajikaryawan;

/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 5 menghitung gaji karyawan berdasarkan jabatan dan kehadiran
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float Tunjangangolongan;
    private float Tunjanganjabatan;
    private float Tunjangankehadiran;
    
    public int getKehadiran() {
        return kehadiran;
    }
    
    public void setKehadiran(int kehadiran){
        this.kehadiran = kehadiran;
    }
    
    public float Tunjangankehadiran(int hadir){
        Tunjangankehadiran = hadir*10000;
        return Tunjangankehadiran;
    }
    
    public float Tunjanganjabatan(String jabatan){
        
        switch (jabatan){
            case "Manager":
                Tunjanganjabatan = 2000000;
                break;
                case"manager":
                    Tunjanganjabatan = 2000000;
                    break;
                case"Kabag":
                    Tunjanganjabatan = 1000000;
                    break;
                case "kabag":
                    Tunjanganjabatan = 1000000;
                    break;
                default:
                            Tunjanganjabatan = 0;
                        break;
        }
        return Tunjanganjabatan;
    }
    
    public float Tunjangangolongan(int golongan){
        switch(golongan){
            case 1:
                Tunjangangolongan = 500000;
                break;
                
            case 2:
                Tunjangangolongan = 1000000;
                break;
                
            case 3: Tunjangangolongan = 1500000;
                break;
            default:
                Tunjangangolongan = 0;
                break;
                
        }
        return Tunjangangolongan;
                    
        
    }
    
    
    
    
    
}
