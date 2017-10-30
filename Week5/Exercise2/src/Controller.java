import java.sql.*;

public class Controller {
    public static void main(String[] args) {
        showAllCustomers();
        System.out.println();

        showAllOrders();
        System.out.println();

        showOrdersForCustomer(1);
        System.out.println();

        showProductOrders();
    }

    private static Connection getDBConnection() {
        Connection conn = null;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch(ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            String url = "jdbc:sqlite:Shop.sqlite";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    private static void showAllCustomers() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        String query = "SELECT * FROM Customers;";

        try {
            conn = getDBConnection();
            stmt = conn.prepareStatement(query);
            result = stmt.executeQuery();

            while(result.next()) {
                System.out.println("ID: " + result.getString("CustomerID") + ", Name: " + result.getString("CustomerName")
                + ", Email: " + result.getString("CustomerEmail"));

            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Always attempt to close resources
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

    private static void showAllOrders() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        String query = "SELECT * FROM Orders;";

        try {
            conn = getDBConnection();
            stmt = conn.prepareStatement(query);
            result = stmt.executeQuery();

            while(result.next()) {
                System.out.println("O/ID: " + result.getString("OrderID") + ", P/ID: " + result.getString("ProductID")
                        + ", C/ID: " + result.getString("CustomerID") + ", Date: " + result.getString("OrderDate"));

            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Always attempt to close resources
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

    private static void showOrdersForCustomer(int customerID) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        String query = "SELECT * FROM Orders JOIN Customers USING(customerID) WHERE customerID = ?;";

        try {
            conn = getDBConnection();
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, customerID);
            result = stmt.executeQuery();

            while(result.next()) {
                System.out.println("O/ID: " + result.getString("OrderID") + ", P/ID: " + result.getString("ProductID")
                        + ", C: " + result.getString("CustomerName") + ", Date: " + result.getString("OrderDate"));

            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Always attempt to close resources
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

    private static void showProductOrders() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        String query = "SELECT * FROM Orders JOIN Customers USING(customerID);";

        try {
            conn = getDBConnection();
            stmt = conn.prepareStatement(query);
            result = stmt.executeQuery();

            while(result.next()) {
                System.out.println("O/ID: " + result.getString("OrderID") + ", P/ID: " + result.getString("ProductID")
                        + ", C: " + result.getString("CustomerName") + ", Date: " + result.getString("OrderDate"));

            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Always attempt to close resources
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
}
