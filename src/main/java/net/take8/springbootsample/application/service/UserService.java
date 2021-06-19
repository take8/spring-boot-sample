package net.take8.springbootsample.application.service;

import net.take8.springbootsample.domain.model.user.User;
import net.take8.springbootsample.domain.model.user.UserIdentifier;
import net.take8.springbootsample.domain.model.user.UserRepository;
import net.take8.springbootsample.domain.model.user.UserSummaries;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    public User findById(UserIdentifier id) {
        return userRepository.findBy(id);
    }

    public Boolean isExist(User user) {
        return userRepository.isExist(user);
    }

    public UserSummaries list() {
        return userRepository.list();
    }

    public User prototype() {
        return userRepository.prototype();
    }

    public void register(User user) {
        userRepository.register(user);
    }

    public void update(User user) {
        userRepository.update(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
