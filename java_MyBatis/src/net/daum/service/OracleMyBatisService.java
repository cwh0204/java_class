package net.daum.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import net.daum.config.SessionFactory;
import net.daum.dao.OracleMyBatisDAO;
import net.daum.dto.DeptDTO;

public class OracleMyBatisService {
	/*
	 * 컨트롤러와 DAO사이에 service를 넣는 이유는 데이터베이스 작업(여러 DAO 메서드 호출 등)에 트랜잭션(rollback,
	 * commit) 을 걸고 싶을 때 주로 Service 계층에서 처리하기 때문이다. Service 계층이 없으면 Controller이 직접
	 * DB 처리 로직을 호출해야 하므로 코드가 복잡하고 유지보수가 어렵다. Controller 요청 처리, DAO는 DB 처리, Service는
	 * 비즈니스 로직 처리 하고 유지보수성 향상,로직이 분리되어 변경 및 디버깅이 쉬움,테스트 용이 고객의 추가 요구 사항 반영(애프터 서비스라고
	 * 생각하면 쉽다.) 컨트롤러와 DAO사이 중간 매개체 역할
	 * 
	 */

	OracleMyBatisDAO dao = new OracleMyBatisDAO();

	public List<DeptDTO> selectAll() {
		List<DeptDTO> dlist = null;
		SqlSession sqlSession = SessionFactory.getSqlSession();
		// mybatis 쿼리문을 수행하는 SqlSession 인스턴스 반환

		try {
			dlist = this.dao.selectAll(sqlSession);
		} finally {
			sqlSession.close();
		}

		return dlist;
	}

	public void insertDept(DeptDTO dept) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = SessionFactory.getSqlSession();
		try {
			dao.insertDept(dept, sqlSession);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	
	public DeptDTO selectDept(DeptDTO dept) {
		DeptDTO redept = null;
		SqlSession sqlSession = SessionFactory.getSqlSession();
		
		try {
			redept = this.dao.selectDept(dept, sqlSession);
		} finally {
			sqlSession.close();
		}
		return redept;
	}
	
	public void upDept(DeptDTO dept) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		try {
			dao.upDept(dept, sqlSession);
			sqlSession.commit();
		}finally {
			sqlSession.close();
		}
	}
	
	public void delDept(DeptDTO dept) {
		SqlSession sqlSession = SessionFactory.getSqlSession();
		try {
			dao.delDept(dept, sqlSession);
			sqlSession.commit();
		}finally {
			sqlSession.close();
		}
	}
}
