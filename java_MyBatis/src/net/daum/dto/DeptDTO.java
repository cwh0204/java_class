package net.daum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
/*
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 */
public class DeptDTO {
	private int deptno;
	private String dname;
	private String loc;

	/*
	 * 테이블 컬럼명과 DTO의 변수명이 같으면, DB ↔ Mybatis 간 데이터 매핑이 직관적이고 예측 가능해져서 유지 보수 용이하고 빈클래스
	 * 변수명을 무엇으로 할까 고민을 덜하게 해준다. mybatis 프레임웍 등에서 빈클래스 변수명과 컬럼명이 일치하면 일대일 매핑이 되어서
	 * 테이블 컬럼 레코드값을 자동으로 가져올수 있게 된다.그만큼 코드라인이 줄어든다.
	 * 
	 * 매핑(mapping)은 서로 다른 구조나 표현 방식을 가진 두 요소를 서로 연결하거나 대응시키는 작업을 의미 일대일, 일대다, 다대일,
	 * 다대다 대응
	 */
	
	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
