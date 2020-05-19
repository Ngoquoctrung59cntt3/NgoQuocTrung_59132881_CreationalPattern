/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Trung_PC
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hd = new HoaDon.HoaDonBuilder().addMaHD("N212125724")
                .addNgayBan("13/05/2020")
                .addTenKH("Ngô Quốc Trung")
                .build();
        CTHD cthd1 = new CTHD.CTHDBuilder().addTenSP("Tai Nghe Nhét Tai Thể Thao Dalugi K1 Bass - Hàng Chính Hãng - Xanh")
                .addSoLuong(1)
                .addDonGia(168000)
                .addChietKhau("5%")
                .build();
        CTHD cthd2 = new CTHD.CTHDBuilder().addTenSP("Bàn Phím Cơ Có Dây K890")
                .addSoLuong(1)
                .addDonGia(440000)
                .addChietKhau("5%")
                .build();
        hd.addCTHD(cthd2);
        hd.addCTHD(cthd1);
        hd.xuatHoaDon();
    }
    
}
