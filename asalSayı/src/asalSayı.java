
public class asalSay� {

	public static void main(String[] args) {
		
		for (int sayi=2; sayi<=100; sayi++)
		{
			int bolum;
			for (bolum=2; bolum<sayi; bolum++)
				{
					//e�er k�s�rat 0 ise tam olarak b�l�nm�� demektir
					if (sayi%bolum==0)
						break; //yeni bir say�ya ge�
				}
			
			//g�zc� kontrol�ne hi� tak�lmadan ��kan say� asal say�d�r
			if (bolum==sayi)
			System.out.println(sayi);
		}
	}

}
