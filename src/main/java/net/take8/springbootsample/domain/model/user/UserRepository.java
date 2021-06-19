package net.take8.springbootsample.domain.model.user;

public interface UserRepository {
    User findBy(UserIdentifier id);

    Boolean isExist(User user);

    UserSummaries list();

    User prototype();

    void register(User user);

    void update(User user);

    void delete(User user);
}
