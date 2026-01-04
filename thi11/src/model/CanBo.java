
package model;


public class CanBo {
    private String name;
    private int dateOfBirth;
    private boolean sex;
    private String address;
    private double heSoLuonng;
    public static final double LUONG_CO_BAN = 2000000;

    public CanBo() {
    }

    public CanBo(String name, int dateOfBirth, boolean sex, String address, double heSoLuonng) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.address = address;
        this.heSoLuonng = heSoLuonng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
    
    public String getSexString(){
        if(sex) {
            return "Nam";
        } else return "Nữ";
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getHeSoLuonng() {
        return heSoLuonng;
    }

    public void setHeSoLuonng(double heSoLuonng) {
        this.heSoLuonng = heSoLuonng;
    }
    
    @Override
    public String toString() {
        return "Ho va ten:" + name + ", Nam Sinh: " + dateOfBirth + ", Gioi Tinh:" + sex + ", Dia Chi: " + address + ", He So Luong: " + heSoLuonng ;
    }
}
