package edu.penzgtu.ip.builder;

public class AdminUserBuilder implements UserBuilder {
    private String workTime;
    private String place;
    private String role;

    @Override
    public AdminUserBuilder setPlace() {
        this.place = "office";

        return this;
    }

    @Override
    public AdminUserBuilder setWorkTime() {
        this.workTime = "9am-18pm";

        return this;
    }

    @Override
    public AdminUserBuilder setRole() {
        this.role = "admin";

        return this;
    }

    @Override
    public User build() {
        return new User(workTime, place, role);
    }
}
