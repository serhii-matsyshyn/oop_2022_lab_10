package adapter.task2;

import java.time.LocalDate;

public class FacebookClient implements Client {
    private FacebookUser facebookUser;

    public FacebookClient(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry().toString();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return facebookUser.getGetUserActiveTime();
    }

}
