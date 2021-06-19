package net.take8.springbootsample.domain.model.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserIdentifier {

    @NotBlank(message = "メールアドレスを入力してください")
    @Email(message = "メールアドレスが正しくありません。")
    String value = "";

    public UserIdentifier() {
    }

    public UserIdentifier(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
