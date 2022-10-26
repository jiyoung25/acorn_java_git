package test.mypac;

public class Machine {
	public Electric electric;
	public Part part;
	public Power power;
	
	public Machine (Electric e1, Part pa1, Power po1) {
		Electric electric=e1;
		Part part=pa1;
		Power power=po1;
	}
	
	public int num(int a, int b) {
		return a+b;
	}
	
	public String str(String c, String d) {
		return c+"가 "+d+"를 담당합니다." ;
	}
	
}
