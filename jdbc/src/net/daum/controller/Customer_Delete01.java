package net.daum.controller;

import java.util.Scanner;

import net.daum.dao.CustomerDAOImpl;
import net.daum.dto.CustomerDTO;

/*
 * 스캐너로 고객번호를 입력받아서 오라클 db로 부터 검색한 다음 고객번호가 있는 경우 고객번호를 기준으로 고객정보를 삭제되게 하고, 해당 고객번호가
 * 없다면 유효성 검증 경고 메시지를 띄운다.
 */

public class Customer_Delete01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		CustomerDAOImpl cdao = new CustomerDAOImpl();
		
		System.out.println(">>>>고객정보 삭제<<<<");
		System.out.println("검색할 고객번호 입력>>");
		int cus_no = Integer.parseInt(scan.nextLine());
		
		CustomerDTO db_cusNo = cdao.getFindCusNo(cus_no);
		
		if(db_cusNo != null) {
			int result = cdao.delCus(cus_no);
			
			if(result == 1) {
				System.out.println("고객번호 삭제에 성공했습니다!");
			}
		}else {
			System.out.println("해당 고객번호가 없어서 삭제 못합니다! 올바른 고객번호를 입력하세요!");
		}
	}

}
