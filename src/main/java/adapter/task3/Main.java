package adapter.task3;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorisaton authorisaton = new Authorisaton();
        if (authorisaton.authorise(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
