package adapter.task2;

import lombok.Getter;

import javax.security.auth.login.LoginException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;

public class MessageSender {
    // list with all clients
    @Getter
    private static HashMap<String, Client> clients = new HashMap<>();

    public Client login(String loginMethod, String email, Object country, String password) throws LoginException {
        Client client = null;
        if (loginMethod.equals("facebook")){
            client = new FacebookClient(new FacebookUser(email, (Country) country, LocalDate.now()));
        } else if (loginMethod.equals("twitter")){
            client = new TwitterClient(new TwitterUser(email, (String) country, LocalDate.now().toString()));
        } else {
             throw new LoginException("Login method is not supported");
        }
        clients.put(email, client);
        return client;
    }

    public boolean send(String text, Client user, String country) {
        if (user.getCountry().equals(country) && user.getLastActiveTime().isAfter(LocalDate.now().minus(Period.ofDays(1)))){
            System.out.println("Sending message to " + user.getEmail() + ": " + text);
            return true;
        } else {
            System.out.println("Message not sent to " + user.getEmail());
            return false;
        }
    }

    public void sendToAll(String text, String country) {
        for (Client client : clients.values()) {
            send(text, client, country);
        }
    }
}
