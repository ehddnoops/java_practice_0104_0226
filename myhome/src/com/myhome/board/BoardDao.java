package com.myhome.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.myhome.common.CommonUtil;

//DataAccessObject = 디비에 데이터 읽고 쓰는 일을 담당
public class BoardDao {
   List<BoardDto> list = new ArrayList<BoardDto>();
   

   //생성자
   public BoardDao() {
      
      try 
      {
         Class.forName(CommonUtil.driver);// ojdbc14.jar, ojdbc로 시작하는 jar파일, jar파일을 메모리로 로딩한다
         System.out.println("드라이브 로딩 성공");
      }
      catch(Exception ex) 
      {
         System.out.println(ex.getMessage());
      }
   }
   
   List<BoardDto> getList() {
      
      Connection conn = null;//db연결
      Statement stmt = null;//db에 쿼리실행하는 클래스
      ResultSet rs = null;//실행한 결과를 담아오는 클래스
      
      List<BoardDto> list = new ArrayList<BoardDto>();
      try
      {
    	  //1.db접속
         conn = DriverManager.getConnection(CommonUtil.url, CommonUtil.userid, CommonUtil.password);
         //2.쿼리 실행객체 만들기
         stmt = conn.createStatement();
         String sql = "select * from board";
         rs = stmt.executeQuery(sql);//쿼리 실행 후 결과를 ResultSet 형태로 되돌려준다
         
         while(rs.next())//다음 데이터 위치로 이동하면서 더이상 데이터가 없으면 false를 반환
         {
            BoardDto dto = new BoardDto();
            dto.setId(rs.getInt("id"));
            dto.setTitle(rs.getString("title"));
            dto.setContents(rs.getString("contents"));
            dto.setWriter(rs.getString("writer"));
            dto.setWdate(rs.getString("wdate"));
            
            list.add(dto); ///////////
         }
         
         rs.close();
         stmt.close();
         conn.close();
      }
      catch(Exception ex)
      {
         ex.printStackTrace();//error 출력
         try
         {
            if( rs!=null) rs.close();
            if( stmt!=null) stmt.close();
            if( conn!=null) conn.close();
         } catch(Exception e) {}
      }
      return list;
   }
}