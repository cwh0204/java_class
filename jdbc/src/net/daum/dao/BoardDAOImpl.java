package net.daum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.daum.dto.BoardDTO;

public class BoardDAOImpl { //tbl_borrd 테이블과 연동되는 jdbc코드가 들어가는 DAO클래스
	
    String driver = "oracle.jdbc.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "week";
    String password = "week";
    
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    String sql = null;
    public BoardDAOImpl() {
    	try {
    		Class.forName(driver);
    	}catch (Exception e) {
			e.printStackTrace();
		}
    }
	public int insertBoard(BoardDTO b) {
		int re = -1;
		try {
			con = DriverManager.getConnection(url,user,password);
			sql = "INSERT INTO tbl_board VALUES (bno_seq.nextval,?,?,?,sysdate)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, b.getBname());
			pstmt.setString(2, b.getBtitle());
			pstmt.setString(3, b.getBcont());
			
			re = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) pstmt.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		return re;
	}
	public List<BoardDTO> getBoardList() {
		List<BoardDTO> blist = new ArrayList();
		
		try {
			con = DriverManager.getConnection(url, user, password);
			sql = "select * from tbl_board order by bno desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDTO b = new BoardDTO();
				
				b.setBno(rs.getInt(1));
				b.setBname(rs.getString(2));
				b.setBtitle(rs.getString("btitle"));
				b.setBcont(rs.getString("bcont"));
				b.setBdate(rs.getString("bdate"));
				
				blist.add(b);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return blist;
	}
	
	//오라클로 부터 번호값 검색
	public BoardDTO getFindNo(int bno) {
		BoardDTO db_no = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			sql = "select bno from tbl_board where bno=?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				db_no = new BoardDTO();
				db_no.setBno(rs.getInt("bno"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return db_no;
	}
	
	public int updateBoard(BoardDTO eb) {
		int re = -1;
		
		
		try {
			con = DriverManager.getConnection(url ,user, password);
			sql = "update tbl_board set bname=? , btitle=?, bcont=? where bno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, eb.getBname());
			pstmt.setString(2, eb.getBtitle());
			pstmt.setString(3, eb.getBcont());
			pstmt.setInt(4, eb.getBno());
			
			re = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return re;
	}
	public void deleteBoard(int bno) {
		
		try {
			con = DriverManager.getConnection(url, user, password);
			sql = "delete from tbl_board where bno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
