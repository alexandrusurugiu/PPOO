import java.sql.*;

public class SQLiteConnection {

    public static final String DRIVER = "jdbc:sqlite:C:\\Users\\surug\\ExempluSQLITE";
//    public static final String USERNAME = "admin";
//    public static final String PASSWORD = "admin";

    public static void main(String[] args) {

        Connection conn = null;
        Statement statement = null;

        try {
//            conn = DriverManager.getConnection(DRIVER, USERNAME, PASSWORD);
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(DRIVER);
            System.out.println("Connected to the database successfully.");

            statement = conn.createStatement();
            String sqlCreate = "CREATE TABLE student(COD INT PRIMARY KEY, NUME VARCHAR(10), VARSTA INT, SEX VARCHAR(10), CNP VARCHAR(13))";
            //statement.executeUpdate(sqlCreate);
            System.out.println("Table 'student' created successfully.");

            String sqlInsert = "INSERT INTO student VALUES(100, 'Gigel', 23, 'M', '1234567890123')";
            //statement.executeUpdate(sqlInsert);
            System.out.println("Data inserted successfully.");

            String sqlUpdate = "UPDATE student SET NUME='Ionel' WHERE COD=100";
            statement.executeUpdate(sqlUpdate);


            String sqlDelete = "DELETE FROM student WHERE COD=100";
            statement.executeUpdate(sqlDelete);
            System.out.println("Data updated and deleted successfully.");

            String sqlInsert2 = "INSERT INTO student VALUES(200, 'Ionel', 24, 'M', '1234567890123')";
            //statement.executeUpdate(sqlInsert2);
            System.out.println("Data inserted successfully.");

            ResultSet rs = statement.executeQuery("SELECT * FROM student");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Number of columns: " + rsmd.getColumnCount());
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.println("Column " + i + ": " + rsmd.getColumnName(i) + " of type " + rsmd.getColumnTypeName(i));
            }
            int nr = 0;

            while (rs.next()) {
                System.out.println(++nr + " Nume: " + rs.getString("NUME") + ", Varsta: " + rs.getInt("VARSTA"));
            }

            rs.close();
        } catch (SQLException ex) {
            System.out.println("Connection failed: " + ex.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error closing resources: " + ex.getMessage());
            }
        }
    }
}
