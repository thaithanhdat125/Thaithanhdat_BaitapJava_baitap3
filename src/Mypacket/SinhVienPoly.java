/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypacket;

/**
 *
 * @author Admin
 */
public abstract class SinhVienPoly
{
    String HoTen;
    String Nganh;

    public SinhVienPoly(String HoTen, String Nganh) {
        this.HoTen = HoTen;
        this.Nganh = Nganh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }
    public double getDiem()
    {
        return 0;
    }
    public String getHocLuc()
    {
        String n="";
        if(getDiem()<5) n="Học Sinh Yếu";
        if(getDiem()>=5&&getDiem()<6.5) n="Học Sinh Trung Bình";
        if(getDiem()>=6.5&&getDiem()<7.5) n="Học Sinh Khá";
        if(getDiem()>=7.5&&getDiem()<9) n="Học Sinh Giỏi";
        if(getDiem()>=9&&getDiem()<10) n="Học Sinh Xuất Sắc";
        return n;
    }
    public String Xuat()
    {
        return "Họ Tên: "+HoTen+"\n"+
                 "Ngành: "+ Nganh;
    }
}
