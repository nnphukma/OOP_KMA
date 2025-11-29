package javabaitapClassObjects;

public class QuanLyKho {
    // ============================
    //        CLASS PRODUCT
    // ============================
    static class Product {
        private final String productID;
        private String name;
        private double price;
        private int quantity = 0;

        public String getProductID() {
            return productID;
        }
        
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        
        public Product(String productID, String name, double price, int quantity){
            this.productID = productID;
            this.price = price;
            this.name = name;
            this.quantity = quantity;
        }

        public Product(String productID, String name, double price){
            this.productID = productID;
            this.price = price;
            this.name = name;
        }
        
        public void updateQuantity(int change){
            int newQuantity = this.getQuantity() + change;
            this.setQuantity(newQuantity);
        }
        
        @Override
        public String toString() {
            return String.format(
                "MaSP: %s - Ten SP: %s - Gia: %.2f - SoLuong: %d",
                this.getProductID(),
                this.getName(),
                this.getPrice(),
                this.getQuantity()
            );
        }
    }

    // ============================
    //   CLASS INVENTORY MANAGER
    // ============================
    static class InventoryManager {
        private static final int MAX_PRODUCTS = 20; 
        private static Product[] inventory = new Product[MAX_PRODUCTS]; 
        private static int productCount = 0;

        /*
        - Phương thức: public static boolean addProduct(String productId, String name, double price) để:
            + Kiểm tra xem kho còn chỗ không (productCount < MAX_PRODUCTS).
            + Kiểm tra xem productId đã tồn tại chưa (duyệt qua mảng inventory). Nếu đã tồn tại, trả về false.
            + Nếu hợp lệ, tạo đối tượng Product mới và thêm vào mảng inventory tại vị trí productCount.
            + Tăng productCount.
            + Trả về true nếu thêm thành công.
        */
        public static boolean addProduct(String productId, String name, double price){
            if (productCount >= MAX_PRODUCTS) return false;
            for (int i = 0; i < productCount; i++) {
                if (inventory[i].getProductID().equals(productId)){
                    return false; 
                }
            }
            Product newProduct = new Product(productId, name, price);
            inventory[productCount] = newProduct;
            productCount++;
            return true;
        }

        /*
        - Phương thức: public static Product findProductById(String productId) để:
            + Tìm và trả về đối tượng Product có productId tương ứng. Trả về null nếu không tìm thấy.
        */
        public static Product findProductById(String productId){
            for(int i = 0; i < productCount; i++){
                if (inventory[i].getProductID().equals(productId))
                    return inventory[i];
            }
            return null;
        }
        
        /*
        - Phương thức: public static void updateProductQuantity(String productId, int change) để:
            + Tìm sản phẩm bằng productId.
            + Nếu tìm thấy, gọi phương thức updateQuantity(change) của đối tượng Product để thay đổi số lượng qua tham số change .
        */
        
        public static void updateProductQuantity(String productId, int change) {
            Product p = findProductById(productId);
            if (p != null){
                p.updateQuantity(change);
            } else {
                System.out.println("Khong tim thay san pham !");
            }
        }

        /*
        - Phương thức: public static void displayInventory() để:
            + In ra danh sách tất cả các sản phẩm trong kho (sử dụng toString() của Product).
        */
        
        public static void displayInventory(){
            System.out.println("=== DANH SACH SAN PHAM TRONG KHO ===");
            for (int i = 0; i < productCount; i++) {
                System.out.println(inventory[i].toString());
            }
        }
    }

    // ============================
    //             MAIN
    // ============================
    
    /*
    Tạo lớp Store có phương thức main() để Test với nội sau:
        - Thêm một vài sản phẩm vào kho bằng InventoryManager.addProduct().
        - Hiển thị danh sách kho hàng.
        - Cập nhật số lượng cho một sản phẩm.
        - Tìm kiếm một sản phẩm.
        - Thử thêm sản phẩm đã tồn tại hoặc khi kho đầy để kiểm tra các trường hợp biên
    */
    static class Store {
        public static void main(String[] args) {

            InventoryManager.addProduct("SP01", "Sua", 15000);
            InventoryManager.addProduct("SP02", "Mi tom", 5000);
            InventoryManager.addProduct("SP03", "Banh mi", 7000);

            InventoryManager.displayInventory();
            System.out.println();

            InventoryManager.updateProductQuantity("SP02", 10);
            InventoryManager.updateProductQuantity("SP01", 5);

            System.out.println("\nSau khi cap nhat so luong:");
            InventoryManager.displayInventory();

            Product p = InventoryManager.findProductById("SP02");
            if (p != null) {
                System.out.println("\nTim thay: " + p.toString());
            }

            System.out.println("\nThem SP01 lan nua: " +
                InventoryManager.addProduct("SP01", "Sua", 15000));

            for (int i = 4; i < 25; i++){
                InventoryManager.addProduct("SPX" + i, "Hang", 1000);
            }

            System.out.println("\nHien thi kho cuoi cung:");
            InventoryManager.displayInventory();
        }
    }
}
