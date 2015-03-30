package 己利贸府;

public class CGyosu extends CHwewon{
	//加己 attribute
	private String name;
	private String juminbeonho;
	
	//associations
	private CSeongjuk seongjuk;
	private CGowamok gwamok;
	private CGangjwa gangjwa;
	
	public CSeongjuk getSeongjuk() {return seongjuk;}
	public void setSeongjuk(CSeongjuk seongjuk) {this.seongjuk = seongjuk;}
	public CGowamok getGwamok() {return gwamok;}
	public void setGwamok(CGowamok gwamok) {this.gwamok = gwamok;}
	public CGangjwa getGangjwa() {return gangjwa;}
	public void setGangjwa(CGangjwa gangjwa) {this.gangjwa = gangjwa;}

}
