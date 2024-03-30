package edu.penzgtu.ip.builder;

public interface UserBuilder {
    public UserBuilder setPlace();
    public UserBuilder setWorkTime();
    public UserBuilder setRole();
    public User build();
}
