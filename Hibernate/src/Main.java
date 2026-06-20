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
        String sql = "select * from customer;";

        // Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            System.out.print("Id - " + rs.getInt("id") + "    ");
            System.out.print("Name - " + rs.getString("name") + "    ");
            System.out.println("Age - "+ rs.getInt("age"));
        }
        con.close();
        System.out.println("Connection Closed");
    }
}