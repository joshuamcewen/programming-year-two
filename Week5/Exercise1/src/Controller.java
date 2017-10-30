import java.sql.*;

public class Controller {
    public static void main(String[] args) {
        showAllRecords();
        System.out.println();

        insertMovie(5, "Goodfellas", "Crime", 1990);
        showAllRecords();
    }

    private static Connection getDBConnection() {
        Connection conn = null;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch(ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            String url = "jdbc:sqlite:dvd.sqlite";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    private static void showAllRecords() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        String query = "SELECT * FROM Collection;";

        try {
            conn = getDBConnection();
            stmt = conn.prepareStatement(query);
            result = stmt.executeQuery();

            while(result.next()) {
                System.out.println(result.getString("ID") + ", " + result.getString("Title") + ", " + result.getString("Genre") + ", " + result.getString("Year"));
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static boolean insertMovie(int id, String title, String genre, int year) {
        Connection conn = null;
        PreparedStatement stmt = null;
        String query = "INSERT INTO Collection(ID, Title, Genre, Year) VALUES(?,?,?,?);";

        try {
            conn = getDBConnection();
            conn.setAutoCommit(false); // Transaction start

            stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.setString(2, title);
            stmt.setString(3, genre);
            stmt.setInt(4, year);
            stmt.executeUpdate();

            return true;
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Always attempt to close resources
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.commit(); // Transaction end
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        return false;
    }
}
