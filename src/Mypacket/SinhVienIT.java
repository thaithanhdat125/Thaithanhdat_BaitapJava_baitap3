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
public class SinhVienIT extends SinhVienPoly
{
    double DiemJava;
    double DiemHTML;
    double DiemCSS;

    public SinhVienIT(String HoTen, String Nganh,double DiemJava, double DiemHTML, double DiemCSS) {
        super(HoTen, Nganh);
        this.DiemJava = DiemJava;
        this.DiemHTML = DiemHTML;
        this.DiemCSS = DiemCSS;
    }

    public double getDiemJava() {
        return DiemJava;
    }

    public void setDiemJava(double DiemJava) {
        this.DiemJava = DiemJava;
    }

    public double getDiemHTML() {
        return DiemHTML;
    }

    public void setDiemHTML(double DiemHTML) {
        this.DiemHTML = DiemHTML;
    }

    public double getDiemCSS() {
        return DiemCSS;
    }

    public void setDiemCSS(double DiemCSS) {
        this.DiemCSS = DiemCSS;
    }

    @Override
    public double getDiem() {
        return (2*DiemJava+DiemCSS+DiemHTML)/4;
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
