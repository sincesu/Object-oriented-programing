package kalitim;

import java.util.Scanner;

public class TemizlikPersoneli extends Calisan {
	Scanner klavScanner = new Scanner(System.in);
	
	public TemizlikPersoneli(String isim,String departman,int maas, int yas) {
		super(isim, departman, maas);
		setyas(yas);
	}

	private int yas;
	
	
	public void ekMesaiUcreti(TemizlikPersoneli tPersoneli,int saat) {
		tPersoneli.setMaas(getMaas()+ saat * 60);
		System.out.println(tPersoneli.getIsım() + " isimli çalışanın " + tPersoneli.getDepartman() +
                " departmanındaki mesaili maaşı: " + tPersoneli.getMaas());
	}
	
	//setter-getter
	public void setyas(int yas) {
		this.yas=yas;
	}
	
	public int getyas() {
		return yas;
	}
}
