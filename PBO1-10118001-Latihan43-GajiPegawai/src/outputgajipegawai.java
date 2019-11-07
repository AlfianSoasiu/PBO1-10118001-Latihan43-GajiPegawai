/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi : Menampilkan output gaji pegawai
 */
public class outputgajipegawai {
   
    public static void main(String[] args) {
        
        System.out.println("_________Data Gaji Karyawan PT.KAKATU_________");
        System.out.println("----------------------------------------------");
        GajiPegawai karyawan1 = new GajiPegawai();
        karyawan1.setNama("Alfian Soasiu");
        karyawan1.setAlamat("Jalan Tubagus Ismail Bawah No 51");
        karyawan1.setUangTransport(250000);
        karyawan1.setUangTunjangan(300000);
        karyawan1.setGajiPokok(4500000);
        karyawan1.setTotalGaji(karyawan1.totalGaji(karyawan1.getUangTunjangan()
                ,karyawan1.getUangTransport(),karyawan1.getGajiPokok()));
        karyawan1.tampilData(karyawan1.getNama(),karyawan1.getAlamat(),
                karyawan1.getUangTunjangan(),karyawan1.getUangTransport()
                ,karyawan1.getGajiPokok(),karyawan1.getTotalGaji());
        
    }
}
