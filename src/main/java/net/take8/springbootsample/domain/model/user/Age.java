package net.take8.springbootsample.domain.model.user;

public class Age {
    int value;

    Age(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
