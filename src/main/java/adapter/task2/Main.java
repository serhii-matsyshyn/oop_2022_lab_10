package adapter.task2;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
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

        // send message to clients
        messageSender.sendToAll("Hello", "Ukraine");
    }
}
