class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;

    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    public void tampilkanInfo() {
        System.out.println("Masukkan Kode Barang: " + kodeBarang);
        System.out.println("Masukkan Nama Barang: " + namaBarang);
        System.out.println("Masukkan Harga Barang: " + hargaBarang);
    }
}