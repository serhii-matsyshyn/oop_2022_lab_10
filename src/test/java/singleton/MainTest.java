package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        DBConnection db = DBConnection.getInstance();
        db.executeQuery("DELETE FROM user");

        User user = new User();
        user.setName("Test");
        user.setEmail("test@test.test");
        user.setAge(30);
        user.save();

        String name = db.executeQueryWithAnswer("SELECT name FROM user WHERE email = 'test@test.test'");

        assertEquals("Test", name);

        assertEquals("Test", user.getName());
        assertEquals("test@test.test", user.getEmail());
        assertEquals(30, user.getAge());
    }
}