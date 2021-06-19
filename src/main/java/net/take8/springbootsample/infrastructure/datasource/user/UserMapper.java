package net.take8.springbootsample.infrastructure.datasource.user;

import net.take8.springbootsample.domain.model.user.User;
import net.take8.springbootsample.domain.model.user.UserIdentifier;
import net.take8.springbootsample.domain.model.user.UserSummary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    User findBy(@Param("identifier") UserIdentifier id);

    List<UserSummary> list();

    void register(@Param("user") User user);

    void delete(@Param("user") User user);
}
