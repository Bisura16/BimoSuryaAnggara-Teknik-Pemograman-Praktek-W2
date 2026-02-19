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

    public String getNamaMakanan(int id) {
        return this.nama_makanan[id];
    }

    public double getHargaMakanan(int id) {
        return this.harga_makanan[id];
    }

    public int getStok(int id) {
        return this.stok[id];
    }

    public void setNamaMakanan(int id, String nama) {
        this.nama_makanan[id] = nama;
    }

    public void setHargaMakanan(int id, double harga) {
        this.harga_makanan[id] = harga;
    }

    public void setStok(int id, int stok) {
        if (stok >= 0) {
            this.stok[id] = stok;
        } else {
            System.out.println("Jumlah stok tidak boleh negatif");
        }
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        setNamaMakanan(id, nama);
        setHargaMakanan(id, harga);
        if (stok >= 0) {
            setStok(id, stok);
            this.nextId();
        } else {
            System.out.println("Jumlah stok tidak boleh negatif");
        }
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]);

            }
        }
    }

    public void pesanMenu(int id, int jumlah) {
        if (!isOutOfStock(id)) {
            if (getStok(id) >= jumlah) {
                setStok(id, getStok(id) - jumlah);
                System.out.println("Pesanan " + jumlah + " " + getNamaMakanan(id) + " berhasil!");
            } else {
                System.out.println("Stok " + getNamaMakanan(id) + " tidak cukup untuk memenuhi pesanan.");
            }
        }
    }

    public boolean isOutOfStock(int id) {
        if (getStok(id) <= 0) {
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
        menu.tambahMenuMakanan("Pizza", 250000, 10);
        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);
        System.out.println("\nDaftar Menu Makanan");
        menu.tampilMenuMakanan();
        System.out.println("\nPesanan Pelanggan: ");
        menu.pesanMenu(0, 3);
        menu.pesanMenu(1, 5);
        menu.pesanMenu(2, 35);
        System.out.println("\nmenu makanan setelah pemesanan");
        menu.tampilMenuMakanan();
    }
}
