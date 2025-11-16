package upcasting;

public class Main1 {
	
	public static void main(String[] args) {
		
		//contoh downcasting
		CEO c = new CEO();
		Pekerja p = new CEO();
		c = (CEO)p;
		c.tanyaPendapatan();
	}
}
