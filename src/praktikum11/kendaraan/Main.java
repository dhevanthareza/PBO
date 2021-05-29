package praktikum11.kendaraan;

public class Main {
    public static void main(String[] args) {
        Sepeda sepedaOtomatis = new Sepeda(true);
        sepedaOtomatis.jenis();
        Sepeda sepedaKayuh = new Sepeda(false);
        sepedaKayuh.jenis();
    }
}
