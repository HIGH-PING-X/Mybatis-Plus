package games.highping.mybatisplus00;

import games.highping.mybatisplus00.bean.User;
import games.highping.mybatisplus00.enums.SexEnum;
import games.highping.mybatisplus00.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class MybatisPlusEnumTest {

    @Autowired
    UserMapper userMapper;

    @Test
    void testEnum() {
        User user = new User();
        user.setUsername("高平");
        user.setEmail("asdf@noob.com");
        user.setDateRegistered(LocalDateTime.now());
        user.setSex(SexEnum.MALE);
        System.out.println(userMapper.insert(user));
    }

}
