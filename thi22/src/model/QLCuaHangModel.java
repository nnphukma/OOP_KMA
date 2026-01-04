
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class QLCuaHangModel {
    public ArrayList<DienThoai> listPhone;
    public ArrayList<MayTinhBang> listTablet;

    public QLCuaHangModel() {
        this.listPhone = new ArrayList<DienThoai>();
        this.listTablet = new ArrayList<MayTinhBang>();
    }
    
    public void addPhone (DienThoai dt){
        listPhone.add(dt);
    }
    public void addTablet (MayTinhBang mtb){
        listTablet.add(mtb);
    }
    
    public void docFile(String path) throws Exception{
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            
            while((line = br.readLine()) != null){
                String [] parts = line.split(":");
                if(parts.length != 2) {
                    continue;
                }
                
                String type = parts[0].trim();
                String [] data = parts[1].split(",");
                
                String name =  data[0].trim();
                String code = data[1].trim();
                
                double giaNhap = Double.parseDouble(data[2].trim());
                double giaBan = Double.parseDouble(data[3].trim());
                
                if (type.equalsIgnoreCase("Dien Thoai")){
                    double giaSimGhep = Double.parseDouble(data[4].trim());
                    DienThoai dt = new DienThoai(giaSimGhep, name, code, giaNhap, giaBan);
                    
                    listPhone.add(dt);
                } else if (type.equalsIgnoreCase("May Tinh Bang")) {
                    float screenSize = Float.parseFloat(data[4].trim());
                    MayTinhBang mtb = new MayTinhBang(screenSize, name, code, giaNhap, giaBan);
                    listTablet.add(mtb);
                }
                    
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
