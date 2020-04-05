/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thaithanhdat_baitapjava_baitap3;

import Mypacket.SinhVienBiz;
import Mypacket.SinhVienIT;
import Mypacket.SinhVienPoly;

/**
 *
 * @author Admin
 */
public class Thaithanhdat_Baitapjava_Baitap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienPoly Nhac = new SinhVienIT("Phạm Vương Lam Nhạc","Công Nghệ Thông Tin",8,7, 7.5);
        SinhVienPoly Long= new SinhVienBiz("Nguyễn Hoàng Long","Quản Trị Kinh Doanh",6,7);
//        Theo Đề yêu cầu còn 1 SinhVienPoly nhưng SinhVienPoly là class trừu tượng không tạo được hay sao ấy ạ
        System.err.println("---Thông Tin Sinh Viên---");
        System.out.println(Nhac.Xuat());
        System.out.println(Long.Xuat());
        
                 
    }
    
}
