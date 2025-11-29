
package javabaitapClassObjects;


public class PhanSo {
    private int tu, mau;

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }
    public PhanSo(){}
    public void setMau(int mau) {
        this.mau = mau;
    }
    public PhanSo (int tu, int mau){
        if (mau == 0){
            System.out.println("Mau so khong hop le ! Nhap lai mau so hoac he thong tu xac dinh mau so = 1");
            mau = 1;
        }
        this.tu = tu;
        this.mau = mau;                
    }
    
    public void printPhanSo(){
        rutGon();
        System.out.print(tu + "/" + mau);
    }
    public void printlnPhanSo(){
        rutGon();
        System.out.println(tu + "/" + mau);
    }
    public int UCLN(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    public void rutGon(){
        int ucln = UCLN(tu, mau);
        this.tu /= ucln;
        this.mau /= ucln;
    }
    
    public PhanSo congPhanSo(PhanSo ps){
        int t = this.tu*ps.mau + ps.tu*this.mau;
        int m = this.mau*ps.mau;
        rutGon();
        return new PhanSo(t, m);
    }
    
    public PhanSo truPhanSo(PhanSo ps){
        int t = this.tu*ps.mau - ps.tu*this.mau;
        int m = this.mau*ps.mau;
        rutGon();
        return new PhanSo(t, m);
    }
    
    public PhanSo nhanPhanSo(PhanSo ps){
        int t = this.tu*ps.tu;
        int m = this.mau*ps.mau;
        rutGon();
        return new PhanSo(t, m);
    }
    
    public PhanSo chiaPhanSo(PhanSo ps){
        int t = this.tu*ps.mau;
        int m = this.mau*ps.tu;
        rutGon();
        return new PhanSo(t, m);
    }
    
    public void hienThiKQ (PhanSo ps, String x){
        this.printPhanSo();
        System.out.print(" " + x + " ");
        ps.printPhanSo();
        System.out.print(" = ");
    }
}
