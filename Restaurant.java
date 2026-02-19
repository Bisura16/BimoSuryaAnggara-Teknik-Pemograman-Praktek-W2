public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public String getNamaMakanan(int id){
        return this.nama_makanan [id];
    }
    public double getHargaMakanan(int id){
        return this.harga_makanan [id];
    }
    public int getStok(int id){
        return this.stok[id];
    }

    

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = (stok < 0) ? 0 : stok;
        this.nextId();
    }


    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]);

            }
        }
    }

    public boolean isOutOfStock(int id) {
        if (stok[id] < 0) {
            return true;
        } else {
            return false;
        }
    }

    public void nextId() {
        id++;
    }
}

class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Pizza", 250000, -1);
        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);
        menu.tampilMenuMakanan();

    }
}   