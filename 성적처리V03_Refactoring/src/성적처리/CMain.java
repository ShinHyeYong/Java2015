package 성적처리;

import java.io.IOException;

import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;
import DAO.CGangjwaDAO;
import DAO.CGwamokDAO;
import DAO.CMemberDAO;
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
		CMemberDAO memberDAO = new CMemberDAO();
		memberDAO.write(member);
		
		// 과목개설
		CGwamokView gwamokView = new CGwamokView();
		CGwamok gwamok = gwamokView.getGwaomok();
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = CGwamokControl.processGwaomok(gwamok);
		CGwamokDAO gwamokDAO = new CGwamokDAO();
		gwamokDAO.write(gwamok);
		
		// 강좌개설
		CGangjwaView gangjwaView = new CGangjwaView();
		CGangjwa gangjwa = gangjwaView.getGangjwa();
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = CGangjwaControl.processGangjwa(gangjwa);
		CGangjwaDAO gangjwaDAO = new CGangjwaDAO();
		gangjwaDAO.write(gangjwa);
			
	}

}
