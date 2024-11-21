class Transaksi extends Barang {
    private final String noFaktur;
    private final int jumlahBeli;
    private double total;

    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang); // Menggunakan constructor dari parent class
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
    }

    public void hitungTotal() {
        total = hargaBarang * jumlahBeli;
    }

    public void tampilkanTransaksi() {
       
        System.out.println("Masukkan No Faktur: " + noFaktur);
        tampilkanInfo(); // Memanggil metode dari parent class
        System.out.println("Masukkan Jumlah Beli: " + jumlahBeli);

        System.out.println("--- Informasi Transaksi ---");
        System.out.println("No Faktur: " + noFaktur);
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("harga: " + hargaBarang);
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total: " + total);
    }
}

// Custom exception
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}