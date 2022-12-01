
public class asalSayý {

	public static void main(String[] args) {
		
		for (int sayi=2; sayi<=100; sayi++)
		{
			int bolum;
			for (bolum=2; bolum<sayi; bolum++)
				{
					//eðer küsürat 0 ise tam olarak bölünmüþ demektir
					if (sayi%bolum==0)
						break; //yeni bir sayýya geç
				}
			
			//gözcü kontrolüne hiç takýlmadan çýkan sayý asal sayýdýr
			if (bolum==sayi)
			System.out.println(sayi);
		}
	}

}
