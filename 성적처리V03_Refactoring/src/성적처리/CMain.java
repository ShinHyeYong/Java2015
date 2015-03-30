package 성적처리;
//주석추가
import java.io.IOException;

import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;
import DAO.CGangjwaDAO;
import DAO.CMemberDAO;
import DAO.DAO;
import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import entity.CGangjwa;
import entity.CGwamok;
import entity.CMember;

public class CMain {

	public static void main(String[] args) throws IOException {
		
		// login
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();
		CLoginControl logincontrol = new CLoginControl();
		member = logincontrol.login(member);
		DAO memberDAO = new DAO();
		memberDAO.write(member,"member");
		member = (CMember) memberDAO.read("member");
		
		// 과목개설
		CGwamokView gwamokView = new CGwamokView();
		CGwamok gwamok = gwamokView.getGwaomok();
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = CGwamokControl.processGwaomok(gwamok);
		DAO gwamokDAO = new DAO();
		gwamokDAO.write(gwamok,"gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");
		
		// 강좌개설
		CGangjwaView gangjwaView = new CGangjwaView();
		CGangjwa gangjwa = gangjwaView.getGangjwa();
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = CGangjwaControl.processGangjwa(gangjwa);
		DAO gangjwaDAO = new DAO();
		gangjwaDAO.write(gangjwa, "gangjwa");
		gangjwa = (CGangjwa) gangjwaDAO.read("gangjwa");
			
	}

}
