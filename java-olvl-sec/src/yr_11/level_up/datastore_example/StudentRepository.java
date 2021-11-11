package yr_11.level_up.datastore_example;

import java.sql.*;

public class StudentRepository extends AppDataSource {

    public static final String table = "student";
    
    public static int[] studentIds = new int[10];
    
    public static String[] fullNames = new String[10];
    
    public static int[] yearLevels = new int[10];

    public static void all() {
        String query = "SELECT * FROM " + table;
        try {
            AppDataSource.connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            int index = 0;
            while (resultSet.next()) {
                studentIds[index] = resultSet.getInt("student_id");
                
                fullNames[index] = resultSet.getString("full_name");
                
                yearLevels[index] = resultSet.getInt("year_level");
                
                index++;
            }
            connection.close();
        } catch (Exception e) {
            // TODO CHALLENGE LEVEL UP
            // Display a user friendly message here but the put stack trace in a log file (text file)
            e.printStackTrace();
        }
    }
}
