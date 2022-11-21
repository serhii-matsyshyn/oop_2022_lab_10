package adapter.task3;

public class ReportBuilder {
    private Database db;

    public ReportBuilder(Database db) {
        this.db = db;
    }

    public String buildReport() {
        return db.getData() + db.getStatistics();
    }
}
