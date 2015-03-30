package 己利贸府;

public class CMain {

	public static void main(String[] args) {
		// objects creation 父惦
		CGowamok gwamok = new CGowamok();
		CGangjwa gangjwa = new CGangjwa();
		
		CGyosu gyosu = new CGyosu();
		CHaksaeng haksaeng = new CHaksaeng();
		
		CSeongjuk seongjuk = new CSeongjuk();
		
		// set associations
		gyosu.setGangjwa(gangjwa);
		gyosu.setGwamok(gwamok);
		gyosu.setSeongjuk(seongjuk);

		haksaeng.setSeongjuk(seongjuk);
		
		// logic
		seongjuk.ipreok(45);
		int s = seongjuk.johew();
		
		System.out.println(s);

		
	}

}
