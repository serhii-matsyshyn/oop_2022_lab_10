package adapter.task3;

public class Database extends БазаДаних {
    public String getData() {
        return super.отриматиДаніКористувача();
    }

    public String getStatistics() {
        return super.отриматиСтатистичніДані();
    }
}
