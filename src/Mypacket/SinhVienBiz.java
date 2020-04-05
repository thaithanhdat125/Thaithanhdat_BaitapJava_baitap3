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
public class SinhVienBiz extends SinhVienPoly
{
    double DiemMarketing;
    double DiemSales;

    public SinhVienBiz( String HoTen, String Nganh,double DiemMarketing, double DiemSales) {
        super(HoTen, Nganh);
        this.DiemMarketing = DiemMarketing;
        this.DiemSales = DiemSales;
    }

    public double getDiemMarketing() {
        return DiemMarketing;
    }

    public void setDiemMarketing(double DiemMarketing) {
        this.DiemMarketing = DiemMarketing;
    }

    public double getDiemSales() {
        return DiemSales;
    }

    public void setDiemSales(double DiemSales) {
        this.DiemSales = DiemSales;
    }

    @Override
    public double getDiem() {
        return (2*DiemMarketing+DiemSales)/3;
    }
        @Override
    public String getHocLuc() {
        return super.getHocLuc(); 
    }
    @Override
    public String Xuat() {
        return super.Xuat()+"\n"+
                 "ĐiểmTB: "+getDiem()+"\n"+
                 "Học Lực: "+getHocLuc()
                 +"\n-------------------------\n";
    }
}
