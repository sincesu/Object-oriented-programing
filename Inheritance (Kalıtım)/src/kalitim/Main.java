package kalitim;

public class Main {

	public static void main(String[] args) {
		
			Calisan calisan = new Calisan("Ahmet", "Ofis Çalışanı", 10000);
			
			Yoneticiler yoneticiler = new Yoneticiler("Samet", "Yönetici", 15000, "Kıdemli"); 
			yoneticiler.zamYap(calisan);
			
			TemizlikPersoneli tPersoneli = new TemizlikPersoneli("Ali", "Temizlik Personeli", 7000, 30);
			tPersoneli.ekMesaiUcreti(tPersoneli,4);

	}

}