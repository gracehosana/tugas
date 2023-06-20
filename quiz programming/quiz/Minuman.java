package quiz;

public abstract class Minuman {
    private String nama;
    private String harga;

    public Minuman(String nama, String harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }
}
