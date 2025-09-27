package net.daum.controller;

import java.util.List;
import java.util.Scanner;

import net.daum.dao.GuestBookDAOImpl;
import net.daum.dto.GuestBookDTO;

public class GuestBook_Writer {
	
	public void insertBook() {
		Scanner scan = new Scanner(System.in);
		GuestBookDTO book= new GuestBookDTO();
		System.out.println("##### 도서 대출 시작 #####");
		System.out.print("글쓴이를 입력>");
		book.setGname(scan.nextLine());
		System.out.print("글제목을 입력>");
		book.setGtitle(scan.nextLine());
		System.out.print("글내용을 입력>");
		book.setGcont(scan.nextLine());
		
		GuestBookDAOImpl bookdao = new GuestBookDAOImpl();
		
		int result = bookdao.insertBook(book);
		
		if(result ==1 ) {
			System.out.println("저장에 성공했습니다!");
		}else {
			System.out.println("저장에 실패했습니다!");
		}
	}
	
	public void selectAll() {
		GuestBookDAOImpl bookdao = new GuestBookDAOImpl();
		List<GuestBookDTO> glist=bookdao.selectAll();
		
		if(glist != null) {
			for(GuestBookDTO i : glist) {
				System.out.print("번호 "+i.getGno()+" 제목 "+i.getGtitle()+" 글쓴이 "+i.getGname()+" 내용 "+i.getGcont()+" 등록날짜 "+i.getGdate()+"\n");
				
			}
		}else {
			System.out.println("방명록이 없습니다!!");
		}
	}
	public void selectBook(int no) {
		GuestBookDAOImpl bookdao = new GuestBookDAOImpl();
		GuestBookDTO book = bookdao.sellectBook(no);
		
		
		if(book.getGname() != null) {
				System.out.print("번호 "+book.getGno()+"제목 "+book.getGtitle()+"글쓴이 "+book.getGname()+"내용 "+book.getGcont()+"등록날짜 "+book.getGdate()+"\n");

		}else {
			System.out.println("방명록이 없습니다!!");
		}
	}
	
	public void oneSellectBook() {
		Scanner scan = new Scanner(System.in);
		GuestBookDAOImpl bookdao = new GuestBookDAOImpl();
		System.out.println("회원번호 입력>>");
		GuestBookDTO book = bookdao.sellectBook(Integer.parseInt(scan.nextLine()));
		Integer b = book.getGno();
		if(b != null) {
			System.out.println("수정은 1번 : 삭제는 2번");
			int a = Integer.parseInt(scan.nextLine());
			if(a == 1) {
				System.out.print("작성자 입력>");
				book.setGname(scan.nextLine());
				System.out.print("글제목 입력>");
				book.setGtitle(scan.nextLine());
				System.out.print("글내용 입력>");
				book.setGcont(scan.nextLine());
				bookdao.upBook(book);
			}else {
				bookdao.delBook(book.getGno());
				System.out.println("방명록 삭제에 성공했습니다.");
			}
		}else {
			System.out.println("없는 사용자입니다");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuestBook_Writer start = new GuestBook_Writer();
		for(;;) {
			System.out.println("1 회원전체 : 2 회원추가 : 3 회원관리 :4 회원검색 :5 종료");
			Scanner scan = new Scanner(System.in);
			int a = Integer.parseInt(scan.nextLine());
			if(a == 1) {
				start.selectAll();
			}else if(a==2){
				start.insertBook();;
			}else if(a==3){
				start.oneSellectBook();
			}else if(a==4) {
				System.out.println("찾을 회원을 입력하세요!");
				start.selectBook(Integer.parseInt(scan.nextLine()));
			}else if(a == 5) {
				System.out.println("종료합니다");
				break;
			}
		}
	}

}
