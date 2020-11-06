import java.sql.*;

public class DbTest {
    public static void main(String args[]){


    try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection conn = DriverManager.getConnection("jdbc:odbc:Test");
        Statement st = conn.createStatement();
        String sql ="select * from Playlist";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            System.out.println("\n"+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
        }

    }catch(Exception e){

        System.out.println(e.getMessage());
    }

    }

}
