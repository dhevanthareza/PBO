package praktikum11.kendaraan;

public class Sepeda {
    private boolean isAuto;
    public Sepeda(boolean isAuto) {
        this.isAuto = isAuto;
    }
    public void jenis() {
        System.out.println(isAuto == true ? "Sepeda Otomatis" : "Sepeda Kayuh");
    }
}
