package praktikum6;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        TemanKuw temanKuw = new TemanKuw();
        while (true) {
            String namaTeman = temanKuw.tambahTeman();
            if(namaTeman.equals("done")) {
                break;
            }
        }
        if(!temanKuw.cekTeman()){
            return;
        }
        temanKuw.temanPalingBaru();
        temanKuw.hapusTeman();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukan nama teman (isikan done saat selesai) = ");
            String namaTeman = scanner.nextLine();
            if(namaTeman.equals("done")) {
                break;
            }
            temanKuw.cariTeman(namaTeman);
        }
    }
}
