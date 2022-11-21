package singleton;

import lombok.Data;

@Data
public class User {
    private String name;
    private String email;
    private int age;

    public void save() {
        DBConnection dbConnection = DBConnection.getInstance();
        String query = "INSERT INTO user (name, email, age) VALUES ('" + name + "', '" + email + "', " + age + ")";
        dbConnection.executeQuery(query);
        System.out.println("User saved");
    }
}
