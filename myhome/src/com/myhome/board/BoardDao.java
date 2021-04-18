package com.myhome.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.myhome.common.CommonUtil;

//DataAccessObject = ��� ������ �а� ���� ���� ���
public class BoardDao {
   List<BoardDto> list = new ArrayList<BoardDto>();
   

   //������
   public BoardDao() {
      
      try 
      {
         Class.forName(CommonUtil.driver);// ojdbc14.jar, ojdbc�� �����ϴ� jar����, jar������ �޸𸮷� �ε��Ѵ�
         System.out.println("����̺� �ε� ����");
      }
      catch(Exception ex) 
      {
         System.out.println(ex.getMessage());
      }
   }
   
   List<BoardDto> getList() {
      
      Connection conn = null;//db����
      Statement stmt = null;//db�� ���������ϴ� Ŭ����
      ResultSet rs = null;//������ ����� ��ƿ��� Ŭ����
      
      List<BoardDto> list = new ArrayList<BoardDto>();
      try
      {
    	  //1.db����
         conn = DriverManager.getConnection(CommonUtil.url, CommonUtil.userid, CommonUtil.password);
         //2.���� ���ఴü �����
         stmt = conn.createStatement();
         String sql = "select * from board";
         rs = stmt.executeQuery(sql);//���� ���� �� ����� ResultSet ���·� �ǵ����ش�
         
         while(rs.next())//���� ������ ��ġ�� �̵��ϸ鼭 ���̻� �����Ͱ� ������ false�� ��ȯ
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
         ex.printStackTrace();//error ���
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