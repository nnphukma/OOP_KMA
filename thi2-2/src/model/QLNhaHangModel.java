package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QLNhaHangModel {

    public ArrayList<MonAnThem> listMonAnThems;
    public ArrayList<DoUong> listDoUong;

    public QLNhaHangModel() {
        listDoUong = new ArrayList<DoUong>();
        listMonAnThems = new ArrayList<MonAnThem>();
    }

    public ArrayList<MonAnThem> getListMonAnThems() {
        return listMonAnThems;
    }

    public void setListMonAnThems(ArrayList<MonAnThem> listMonAnThems) {
        this.listMonAnThems = listMonAnThems;
    }

    public ArrayList<DoUong> getListDoUong() {
        return listDoUong;
    }

    public void setListDoUong(ArrayList<DoUong> listDoUong) {
        this.listDoUong = listDoUong;
    }

    public void insertMonAnThem(MonAnThem monAnThem) {
        listMonAnThems.add(monAnThem);
    }

    public void insertDoUong(DoUong doUong) {
        listDoUong.add(doUong);
    }

    public void docFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(":");
                if (parts.length != 2) {
                    continue;
                }

                String loai = parts[0].trim();
                String[] data = parts[1].split(",");

                String name = data[0].trim();
                String code = data[1].trim();
                double amount = Double.parseDouble(data[2].trim());
                double giaVon = Double.parseDouble(data[3].trim());

                if (loai.equalsIgnoreCase("Mon an them")) {
                    boolean canTrinhBay = parseBooleanStrict(data[4], "Can Trinh Bay");
                    MonAnThem mat = new MonAnThem(
                            canTrinhBay, // canTrinhBay
                            name, code, amount, giaVon
                    );
                    listMonAnThems.add(mat);

                } else if (loai.equalsIgnoreCase("Do uong")) {
                    boolean isHot = parseBooleanStrict(data[4], "Do Uong Nong");
                    DoUong du = new DoUong(
                            isHot, // isHotDrink
                            name, code, amount, giaVon
                    );
                    listDoUong.add(du);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean parseBooleanStrict(String s, String type) {
        s = s.trim().toLowerCase();
        if (s.equals("true")) {
            return true;
        }
        if (s.equals("false")) {
            return false;
        }
        throw new IllegalArgumentException("Gia tri " + type + " khong hop le: " + s);
    }
}
