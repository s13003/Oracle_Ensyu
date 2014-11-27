import java.util.Scanner;
import java.io.*;
import java.sql.*;

public class Insert1 {
  private String _user = "s13003";
  private String _pass = "password";
  private String _host = "172.16.40.4";
  private String _sid = "db11";

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args){
    Insert1 sample = new Insert1();
    try {
      sample.select();
    }catch(Exception e){
      e.printStackTrace();
    }
  }

  private void select() throws Exception{
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    String empno = "";
    String ename = "";
    String yomi = "";
    String job = "";
    String mgr = "";
    String hiredate = "";
    String sal = "";
    String comm = "";
    String deptno = "";

    

    System.out.println("社員名を入力してください:");
    ename = br.readLine();

    System.out.println("よみを入力してください:");
    yomi = br.readLine();

    System.out.println("職を入力してください:");
    job = br.readLine();

    System.out.println("上司を入力してください:");
    mgr = br.readLine();

    System.out.println("雇用日を入力してください:");
    hiredate = br.readLine();

    System.out.println("給料を入力してください:");
    sal = br.readLine();

    System.out.println("歩合給を入力してください:");
    comm = br.readLine();

    System.out.println("部署番号を入力してください:");
    deptno = br.readLine();


    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      conn = DriverManager.getConnection(
          "jdbc:oracle:thin:@" + _host + ":1521:" + _sid, _user, _pass);

      ps = conn.prepareStatement("SELECT MAX(empno) FROM employees");
      rs = ps.executeQuery();
      while(rs.next()) {
      empno = rs.getString(1);
      }
      int mEmpno = Integer.parseInt(empno) + 1;



      st = conn.createStatement();

      ps = conn.prepareStatement("INSERT INTO employees(empno, ename, yomi, job, mgr, hiredate, sal, comm, deptno) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");

      ps.setInt(1, mEmpno);

      if(ename.equals("")) {
        ps.setObject(2, null);
      } else{
        ps.setString(2,ename);
      }

      if(yomi.equals("")) {
        ps.setObject(3, null);
      } else{
        ps.setString(3, yomi);
      }

      if(job.equals("")) {
        ps.setObject(4, null);
      } else{
        ps.setString(4, job);
      }

      if(mgr.equals("")) {
        ps.setObject(5, null);
      } else{
        ps.setString(5, mgr);
      }

      if(hiredate.equals("")) {
        ps.setObject(6, null);
      } else{
        ps.setString(6,hiredate);
      }

      if(sal.equals("")) {
        ps.setObject(7, null);
      } else{
        ps.setString(7,sal);
      }

      if(comm.equals("")) {
        ps.setObject(8, null);
      } else{
        ps.setString(8,comm);
      }

      if(deptno.equals("")) {
        ps.setObject(9, null);
      } else{
        ps.setString(9,deptno);
      }

      ps.executeUpdate();
        System.out.println("社員番号" + mEmpno + "社員名:" + ename + "よみ:" + yomi + "職:" + job + "上司:" + mgr + "雇用日" + hiredate + "給料:" + sal + "歩合給:" + comm + "部署番号:" + deptno + "で登録しました。");
      
    }catch(ClassNotFoundException e){
      throw e;
    }catch(SQLException e){
      throw e;
    }catch(Exception e){
      throw e;
    }finally{
      if(conn != null){
        conn.close();
      }
      if(st != null){
        st.close();
        st = null;
      }
      if(rs != null){
        rs.close();
        rs = null;
      }
    }
  }
}
