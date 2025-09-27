package net.daum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import net.daum.dto.GuestBookDTO;

public class GuestBookDAOImpl{
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "week";
	String password = "week";

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	String sql = null;

    public GuestBookDAOImpl() {
    	try {
    		Class.forName(driver);
    	}catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public int insertBook(GuestBookDTO book) {
    	int re = -1;
    	try {
			con = DriverManager.getConnection(url,user,password);
			sql = "insert into tbl_guestbook (gno,gname,gtitle,gcont,gdate)VALUES (gno_seq.NEXTVAL ,?,?,?,sysdate)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, book.getGname());
			pstmt.setString(2, book.getGtitle());
			pstmt.setString(3, book.getGcont());
			
			re = pstmt.executeUpdate();
    	}catch(Exception e) {
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
    
    public List<GuestBookDTO> selectAll(){
    	List<GuestBookDTO> bookList = new ArrayList<>();
    	
    	try {
			con = DriverManager.getConnection(url, user, password);
			sql = "select * from tbl_guestbook order by GNO DESC";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				GuestBookDTO book = new GuestBookDTO();
				book.setGno(rs.getInt(1));
				book.setGname(rs.getString(2));
				book.setGtitle(rs.getString(3));
				book.setGcont(rs.getString(4));
				book.setGdate(rs.getString(5));
				
				bookList.add(book);
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
    	
    	return bookList;
    }
    
    public GuestBookDTO sellectBook(int no){
    	GuestBookDTO oneBook = new GuestBookDTO();
    	
    	try {
			con = DriverManager.getConnection(url, user, password);
			sql = "select * from tbl_guestbook where GNO = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				oneBook.setGno(rs.getInt("GNO"));
				oneBook.setGname(rs.getString("GNAME"));
				oneBook.setGtitle(rs.getString("GTITLE"));
				oneBook.setGcont(rs.getString("GCONT"));
				oneBook.setGdate(rs.getString("GDATE"));
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
    	return oneBook;
    }
    
    public int upBook(GuestBookDTO book) {
    	int re = -1;
    	
    	try {
			con = DriverManager.getConnection(url, user, password);
			sql = "UPDATE tbl_guestbook SET GNAME = ?, GTITLE = ?, GCONT = ? WHERE GNO = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, book.getGname());
			pstmt.setString(2, book.getGtitle());
			pstmt.setString(3, book.getGcont());
			pstmt.setInt(4, book.getGno());
			
			re = pstmt.executeUpdate();
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
    	
    	return re;
    }
    
    public void delBook(int no) {
		try {
			con = DriverManager.getConnection(url, user, password);
			sql = "DELETE from tbl_guestbook where gno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
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
