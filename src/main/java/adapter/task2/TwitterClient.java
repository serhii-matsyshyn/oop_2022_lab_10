package adapter.task2;

import java.time.LocalDate;

public class TwitterClient implements Client {
    private TwitterUser twitterUser;

    public TwitterClient(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return LocalDate.parse(twitterUser.getLastActiveTime());
    }
}

