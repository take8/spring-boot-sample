package net.take8.springbootsample.domain.model.user;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {
  @Test
  public void constructor() {
    User user = new User();
    assertThat(user).isNotNull();
  }
}
