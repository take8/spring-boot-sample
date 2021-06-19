package net.take8.springbootsample.infrastructure.datasource.user;

import net.take8.springbootsample.domain.model.user.User;
import net.take8.springbootsample.domain.model.user.UserIdentifier;
import net.take8.springbootsample.domain.model.user.UserRepository;
import net.take8.springbootsample.domain.model.user.UserSummaries;
import org.springframework.stereotype.Repository;

@Repository
public class UserDatasource implements UserRepository {
    UserMapper mapper;

    @Override
    public User findBy(UserIdentifier id) {
        return mapper.findBy(id);
    }

    @Override
    public Boolean isExist(User user) {
        if (findBy(user.identifier()) == null) return false;
        return true;
    }

    @Override
    public UserSummaries list() {
        return new UserSummaries(mapper.list());
    }

    @Override
    public User prototype() {
        return new User();
    }

    @Override
    public void register(User user) {
        mapper.register(user);
    }

    @Override
    public void update(User user) {
        mapper.delete(user);
        mapper.register(user);
    }

    @Override
    public void delete(User user) {
        mapper.delete(user);
    }

    public UserDatasource(UserMapper mapper) {
        this.mapper = mapper;
    }
}
