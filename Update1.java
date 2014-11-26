import java.sql.*;
import java.util.Scanner;

public class Update1 {
  private String _user = "s13003";
  private String _pass = "password";
  private String _host = "172.16.40.4";
  private String _sid = "db11";

  public static void main(String[] args){

    Update1 sample = new Update1();
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
    String ename = "";
    String yomi = "";
    String job = "";
    String mgr = "";
    String hiredate = "";
    String sal = "";
    String comm = "";
    String deptno = "";
      System.out.print("社員番号を入力してください:");
    int empno = new Scanner(System.in).nextInt();


    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      conn = DriverManager.getConnection(
          "jdbc:oracle:thin:@" + _host + ":1521:" + _sid, _user, _pass);

      st = conn.createStatement();


      ps = conn.prepareStatement("SELECT ename, yomi, job, mgr, hiredate, sal, comm, deptno FROM employees WHERE empno = ?");

      ps.setInt(1, empno);
      rs = ps.executeQuery();

      while(rs.next()){
        ename = rs.getString(1);
        yomi = rs.getString(2);
        job = rs.getString(3);
        mgr = rs.getString(4);
        hiredate = rs.getString(5).substring(0,10);
        sal = rs.getString(6);
        comm = rs.getString(7);
        deptno = rs.getString(8);

        System.out.printf("社員名： %s\tよみ： %s\t職:  %s\t上司: %s\t雇用日: %s\t給料  %s\t歩合給  %s\t部署番号  %s\n", ename, yomi, job, mgr, hiredate, sal, comm, deptno);
      }
      System.out.print("変更しますか? (yes / no):");

      String Answer = new Scanner(System.in).next();

      if(Answer.equals("yes")) {
        System.out.print("社員名を変更しますか? (yes / no):");
        Answer = new Scanner(System.in).next();
        if(Answer.equals("yes")) {
          System.out.print("社員名を入力してください:");
          String nEname = new Scanner(System.in).next();
          if(nEname.equals("null")) {
            ps.setObject(1, null);
          }else{
          ps = conn.prepareStatement("UPDATE employees SET ename = ? WHERE empno = ?");
          System.out.printf("変更前:  %s\t変更後:  %s\n", ename, nEname);
          ps.setString(1, nEname);
          ps.setInt(2, empno);
          ps.executeQuery();
          }

        }else if(Answer.equals("no")) {
          System.out.println("社員名を変更せず次の変更に移ります。");
        }

        System.out.println("よみを変更しますか?(yes / no)");
        Answer = new Scanner(System.in).next();
        if(Answer.equals("yes")) {
          System.out.print("よみを入力してください:");
          String nYomi = new Scanner(System.in).next();
          if(nYomi.equals("null")) {
            ps.setObject(1, null);
          }else{
          ps = conn.prepareStatement("UPDATE employees SET yomi = ? WHERE empno = ?");
          System.out.printf("変更前:  %s\t変更後:  %s\n", yomi, nYomi);
          ps.setString(1, nYomi);
          ps.setInt(2, empno);
          ps.executeQuery();
          }

        }else if(Answer.equals("no")) {
          System.out.println("よみを変更せず次の変更に移ります。");
        }

        System.out.println("職を変更しますか?(yes / no)");
        Answer = new Scanner(System.in).next();
        if(Answer.equals("yes")) {
          System.out.print("職を入力してください:");
          String nJob = new Scanner(System.in).next();
          if(nJob.equals("null")) {
            ps.setObject(1, null);
          }else{
          ps = conn.prepareStatement("UPDATE employees SET job = ? WHERE empno = ?");
          System.out.printf("変更前:  %s\t変更後:  %s\n", job, nJob);
          ps.setString(1, nJob);
          ps.setInt(2, empno);
          ps.executeQuery();
          }
        }else if(Answer.equals("no")) {
          System.out.println("職を変更せず次の変更に移ります。");
        }

        System.out.println("上司を変更しますか?(yes / no)");
        Answer = new Scanner(System.in).next();
        if(Answer.equals("yes")) {
          System.out.print("上司を入力してください:");
          String nMgr = new Scanner(System.in).next();
          if(nMgr.equals("null")) {
            ps.setObject(1, null);
          }else{
          ps = conn.prepareStatement("UPDATE employees SET mgr = ? WHERE empno = ?");
          System.out.printf("変更前:  %s\t変更後:  %s\n", mgr, nMgr);
          ps.setString(1, nMgr);
          ps.setInt(2, empno);
          ps.executeQuery();
          }
        }else if(Answer.equals("no")) {
          System.out.println("上司を変更せず次の変更に移ります。");
        }

        System.out.println("雇用日を変更しますか?(yes / no)");
        Answer = new Scanner(System.in).next();
        if(Answer.equals("yes")) {
          System.out.print("雇用日を入力してください:");
          String nHiredate = new Scanner(System.in).next();
          if(nHiredate.equals("null")) {
            ps.setObject(1, null);
          }else{
          ps = conn.prepareStatement("UPDATE employees SET hiredate = ? WHERE empno = ?");
          System.out.printf("変更前:  %s\t変更後:  %s\n", hiredate, nHiredate);
          ps.setString(1, nHiredate);
          ps.setInt(2, empno);
          ps.executeQuery();
          }

        }else if(Answer.equals("no")) {
          System.out.println("雇用日を変更せず次の変更に移ります。");
        }

        System.out.println("歩合給を変更しますか?(yes / no)");
        Answer = new Scanner(System.in).next();
        if(Answer.equals("yes")) {
          System.out.print("歩合給を入力してください:");
          String nComm = new Scanner(System.in).next();
          if(nComm.equals("null")) {
            ps.setObject(1, null);
          }else{
          ps = conn.prepareStatement("UPDATE employees SET comm = ? WHERE empno = ?");
          System.out.printf("変更前:  %s\t変更後:  %s\n", comm, nComm);
          ps.setString(1, nComm);
          ps.setInt(2, empno);
          ps.executeQuery();
          }
        }else if(Answer.equals("no")) {
          System.out.println("歩合給を変更せず次の変更に移ります。");
        }
        System.out.println("部署番号を変更しますか?(yes / no)");
        Answer = new Scanner(System.in).next();
        if(Answer.equals("yes")) {
          System.out.print("給料を入力してください:");
          String nDeptno = new Scanner(System.in).next();
          if(nDeptno.equals("null")) {
            ps.setObject(1, null);
          }else{
          ps = conn.prepareStatement("UPDATE employees SET deptno = ? WHERE empno = ?");
          System.out.printf("変更前:  %s\t変更後:  %s\n", deptno, nDeptno);
          ps.setString(1, nDeptno);
          ps.setInt(2, empno);
          ps.executeQuery();
          }
        }else if(Answer.equals("no")) {
          System.out.println("よみを変更せず次の変更に移ります。");
        }
        System.out.println("変更を完了します。");
      ps = conn.prepareStatement("SELECT ename, yomi, job, mgr, hiredate, sal, comm, deptno FROM employees WHERE empno = ?");

      ps.setInt(1, empno);
      rs = ps.executeQuery();

      while(rs.next()){
        ename = rs.getString(1);
        yomi = rs.getString(2);
        job = rs.getString(3);
        mgr = rs.getString(4);
        hiredate = rs.getString(5);
        sal = rs.getString(6);
        comm = rs.getString(7);
        deptno = rs.getString(8);

        System.out.printf("社員名： %s\tよみ： %s\t職:  %s\t上司: %s\t雇用日: %s\t給料  %s\t歩合給  %s\t部署番号  %s\n", ename, yomi, job, mgr, hiredate, sal, comm, deptno);
 

      }
      }
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
