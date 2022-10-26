package test.mypac;

public class PracticeIphonePac {
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	public int num;
	public String name;

	public PracticeIphonePac(Cpu c1, Memory m1, HardDisk h1) {
		this.cpu = c1;
		this.memory = m1;
		this.hardDisk = h1;
	}

	public void doCall(int n, String s) {
		this.num = n;
		String name = s;

		if (this.cpu == null || this.memory == null || this.hardDisk == null) {
			System.out.println("통화 연결이 불가능합니다.");
		} else {
			System.out.println(n + "번째 연결입니다." + s + "님과 통화가 가능합니다. 뚜루루루- 뚜루루루-");
		}
	}

}
