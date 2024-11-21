public class Main {
    public static void main(String[] args) {
        try {
            // Input data
            String noFaktur = "A281";
            String kodeBarang = "A204";
            String namaBarang = "Baju";
            double hargaBarang = -120000; // Harga per unit
            int jumlahBeli = -2;

            // Validasi input
            if (hargaBarang <= 0 || jumlahBeli <= 0) {
                throw new InvalidInputException("Harga dan jumlah beli harus lebih dari 0.");
            }

            // Proses transaksi
            Transaksi transaksi = new Transaksi(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);
            transaksi.hitungTotal();
            transaksi.tampilkanTransaksi();
        } catch (InvalidInputException e) {
            System.err.println("Terjadi kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Kesalahan tidak terduga: " + e.getMessage());
        }
    }
}