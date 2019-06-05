
package DTO;

import java.util.Date;

public class KHACHHANG {
    
  private String MAKH;
  private String TENKH;
  private Date NGAYSINH;
  private String GIOITINH;
  private String DIACHI;
  private String SDT;
  private String SOCMND;
  private String EMAILKH;
  private String MALOAITHE;
  private float DIEM;
  
  public KHACHHANG(){};
  public KHACHHANG(String m, String t, Date n, String g, String d, String s, String cm, String e,String ma,float di)
  {
      MAKH=m;
      TENKH=t;
      NGAYSINH=n;
      GIOITINH=g;
      DIACHI=d;
      SDT=s;
      SOCMND=cm;
      EMAILKH=e;
      MALOAITHE=ma;
      DIEM = di;
  }    

    public String getMAKH() {
        return MAKH;
    }

    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }

    public String getTENKH() {
        return TENKH;
    }

    public void setTENKH(String TENKH) {
        this.TENKH = TENKH;
    }

    public Date getNGAYSINH() {
        return NGAYSINH;
    }

    public void setNGAYSINH(Date NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public String getGIOITINH() {
        return GIOITINH;
    }

    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getSOCMND() {
        return SOCMND;
    }

    public void setSOCMND(String SOCMND) {
        this.SOCMND = SOCMND;
    }

    public String getEMAILKH() {
        return EMAILKH;
    }

    public void setEMAILKH(String EMAILKH) {
        this.EMAILKH = EMAILKH;
    }

    public String getMALOAITHE() {
        return MALOAITHE;
    }

    public void setMALOAITHE(String MALOAITHE) {
        this.MALOAITHE = MALOAITHE;
    }
    public float getDIEM()
   {
         return DIEM;
   }
    public void setDIEM(float DIEM)
     {
         this.DIEM=DIEM;
     }
}
