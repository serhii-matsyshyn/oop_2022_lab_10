package singleton;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Test");
        user.setEmail("test@test.test");
        user.setAge(30);
        user.save();
    }
}
