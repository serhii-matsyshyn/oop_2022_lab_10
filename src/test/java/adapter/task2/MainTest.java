package adapter.task2;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test @SneakyThrows
    void main() {
        MessageSender messageSender = new MessageSender();
        Client client = messageSender.login(
                "facebook",
                "testfb@testfb.testfb",
                Country.Ukraine,
                "testfb"
        );
        Client client2 = messageSender.login(
                "twitter",
                "test_twitter@test_twitter.test_twitter",
                "Ukraine",
                "test_twitter"
        );
        Client client3 = messageSender.login(
                "facebook",
                "testfb2@testfb.testfb",
                Country.USA,
                "testfb"
        );

        assertEquals(MessageSender.getClients().size(), 3);

        // send message to clients
        messageSender.sendToAll("Hello", "Ukraine");
    }
}