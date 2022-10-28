package test.main;

import test.mypac.StudyComputer;
import test.mypac.StudyJava;
import test.mypac.StudyAbstract;

public class review_20221028 {

	public static void main(String[] args) {
		StudyComputer computer = new StudyComputer();
		StudyJava sj = new StudyAbstract();

		StudyAbstract sa = (StudyAbstract) sj;
		
		sj.num=1;
		
		sj.subject(sj.num);
		sj.Java(3);
		sa.subject(sj.num);
		sa.Java(sa.num);
		
	}

}
