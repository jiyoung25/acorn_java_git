package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	
	//Anonymous inner class를 이용해서 interface type의 참조값 얻기
	//interface의 메소드를 anonymous Inner class로 만들어 변수를 만들어낼 수 있다.
	//Anonymous Inner class이므로 static이 붙어있어야 오류가 나지 않는다.
	static Remocon r1=new Remocon() {
		public void up() {
			System.out.println("온도를 올려요");
		}

		public void down() {
			System.out.println("온도를 내려요");
		}
	};
	
	public static void main(String[] args) {
		useRemocon(r1);
		
		//Anonymous local inner class를 이용해서 interface type의 참조값 얻어내기
		Remocon r2=new Remocon() {
			public void up() {
				System.out.println("속도를 올려요");
			}

			public void down() {
				System.out.println("속도를 내려요");
			}
		};
		
		useRemocon(r2);
		
		useRemocon(new Remocon() {
			public void up() {
				System.out.println("고도를 높여요.");
			}
			public void down() {
				System.out.println("고도를 줄여요.");
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}

}
