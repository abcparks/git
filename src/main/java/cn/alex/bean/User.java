package cn.alex.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by WCY on 2021/8/19
 */
@ToString
@Getter
@Setter
public class User {
    private Long userId;

    private String name;

    private Integer age;

    public User() {
    }

    public User(Long userId, String name, Integer age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        return userId != null ? userId.equals(user.userId) : user.userId == null;
    }

    @Override
    public int hashCode() {
        return userId != null ? userId.hashCode() : 0;
    }
}
