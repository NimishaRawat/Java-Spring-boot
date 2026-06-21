import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        * import packages
        * load and register drivers -  now this step is automatic
        * establish connection
        * create statement
        * execute statement
        * process the results
        * close connection
        * */
        String url = "jdbc:postgresql://localhost:5432/users";
        String uname = "postgres";
        String pass = "0000";
        String sql = "update customer set name = 'Nirved' where id = '7';";

        // Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        Boolean status = st.execute(sql);
        System.out.println(status);
        con.close();
        System.out.println("Connection Closed");
    }
}