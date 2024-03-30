package edu.penzgtu.ip.builder;

public class UserManager {
    private final UserBuilder builder;

    public UserManager(UserBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("User Manager can't work without User Builder!");
        }
    }

    public User createUser() {
        return builder.setPlace().setRole().setWorkTime().build();
    }

}
