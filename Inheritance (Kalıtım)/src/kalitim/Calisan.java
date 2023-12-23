package kalitim;

public class Calisan {
	private String isim;
	private String departman;
	private int maas;
	
	public Calisan(String isim, String departman, int maas) {
		this.isim=isim;
		this.departman=departman;
		this.maas=maas;
	}
	
	
	//setter-getter
	
	public void setIsım(String isim) {
		this.isim=isim;
	}
	
	public String getIsım() {
		return isim;
	}
	
	public void setDepartman(String departman) {
		this.departman=departman;
	}
	
	public String getDepartman() {
		return departman;
	}
	
	public void setMaas(int maas) {
		this.maas=maas;
	}
	
	public int getMaas() {
		return maas;
	}
	
	public void maasGuncelle(int miktar) {
        this.maas += miktar;
    }
}