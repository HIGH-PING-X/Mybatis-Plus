package games.highping.mybatisplus00.enums;

import com.baomidou.mybatisplus.annotation.IEnum;
import games.highping.mybatisplus00.bean.User;
import lombok.Getter;

@Getter
public enum SexEnum implements IEnum<User> {
    MALE(1,"男"),
    FEMALE(2,"女");

    private Integer sex;
    private String sexName;

    SexEnum(Integer sex, String sexName) {
        this.sex = sex;
        this.sexName = sexName;
    }

    @Override
    public User getValue() {
        return null;
    }
}
