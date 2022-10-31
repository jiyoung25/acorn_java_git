package test.mypac;

//추상 메소드를 1개만 만들도록 강제하는 역할
@FunctionalInterface
public interface Joinner {
	public String join(String one, String two);

}
