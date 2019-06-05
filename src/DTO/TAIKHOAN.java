
package DTO;

public class TAIKHOAN {
    private String MaNV;
    private String TenNV;
    private String Matkhau;
    private String Maquyen;
    private String Email;
    
    public TAIKHOAN(){};
    public TAIKHOAN(String ma, String ten, String matkhau, String maquyen, String email)
    {
        MaNV=ma;
        TenNV=ten;
        Matkhau=matkhau;
        Maquyen=maquyen;
        Email=email;
    }
    
    public String getMaNV() {
        return MaNV;
    }
    public void setMaNV(String ma) {
        this.MaNV = ma;
    }
   
     public String getTenNV() {
        return TenNV;
    }
    public void setTenNV(String ten) {
        this.TenNV = ten;
    }
    
     public String getMatkhau() {
        return Matkhau;
    }
    public void setMatkhau(String mk) {
        this.Matkhau = mk;
    }
    
     public String getMaquyen() {
        return Maquyen;
    }
    public void setMaquyen(String maquyen) {
        this.Maquyen = maquyen;
    }
    
     public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
}
