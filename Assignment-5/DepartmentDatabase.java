import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepartmentDatabase {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/departments";
    private static final String USERNAME = "root"; // Corrected username
    private static final String PASSWORD = "root";

    // JDBC variables for opening and managing connection
    private static Connection connection;

    public static void main(String[] args) {
        // Connect to MySQL database
        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD); // Corrected username and password

            // Create a new department
            Department department = new Department(1, "Engineering");

            // Insert department into database
            insertDepartment(department);

            System.out.println("Department inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Insert department into the database
    private static void insertDepartment(Department department) throws SQLException {
        String sql = "INSERT INTO department (id, name) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, department.getId());
            statement.setString(2, department.getName());
            statement.executeUpdate();
        }
    }
}

class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
