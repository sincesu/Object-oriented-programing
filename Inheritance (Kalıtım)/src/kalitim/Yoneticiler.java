package kalitim;

import java.util.Scanner;

public class Yoneticiler extends Calisan {
    Scanner klavyeScanner = new Scanner(System.in);

    public Yoneticiler(String isim, String departman, int maas, String kidemBilgisi) {
        super(isim, departman, maas);
        setKidemBilgisi(kidemBilgisi);
    }

    public void zamYap(Calisan calisan) {
        System.out.print("Zam Miktarını Giriniz: ");
        int miktar = klavyeScanner.nextInt();
        calisan.maasGuncelle(miktar);
        System.out.println(calisan.getIsım() + " isimli çalışanın " + calisan.getDepartman() +
                " departmanındaki güncellenmiş maaşı: " + calisan.getMaas());
    }

    private String kidemBilgisi;

    // Setter-getter
    public void setKidemBilgisi(String kidemBilgisi) {
        this.kidemBilgisi = kidemBilgisi;
    }

    public String getKidemBilgisi() {
        return kidemBilgisi;
    }
}
