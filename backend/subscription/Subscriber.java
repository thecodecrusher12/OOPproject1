package backend.subscription;

import backend.repository.Content;

public class Subscriber {
    private String subscriberEmail;
    private String subscriberPassword;
    private SubscriptionPlan plan;
    private Content[]  watchHistory;
    private boolean active;
    private int watchCount;
    private String[] favoriteGenres;
    private int favoriteCount;

    Subscriber(String email, String password, SubscriptionPlan plan){

    }
}
