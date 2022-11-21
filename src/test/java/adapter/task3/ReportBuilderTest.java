package adapter.task3;

import static org.junit.jupiter.api.Assertions.*;

class ReportBuilderTest {

    @org.junit.jupiter.api.Test
    void buildReport() {
        Database db = new Database();
        Authorisaton authorisaton = new Authorisaton();
        if (authorisaton.authorise(db)) {
            ReportBuilder br = new ReportBuilder(db);
            assertEquals("hellohello2", br.buildReport());
        }
    }
}