package view;
import entity.CMember;


public class CLoginView {
	public CMember login(){
		CMember member = new CMember();

	//	input from file using  scanner	
		
		System.out.println("ID를 입력하세요: ");
		member.setUesrID("userID");
		
		System.out.println("password를 입력하세요: ");
		member.setPassword("password");
		
		return member;
	}
}
