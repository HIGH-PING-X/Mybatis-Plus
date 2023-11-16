package games.highping.mybatisplus00;

import games.highping.mybatisplus00.bean.User;
import games.highping.mybatisplus00.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MybatisPlusServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void testCount() {
        //查询总记录数
        System.out.println(userService.count());
    }

    @Test
    void testInsert() {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            User user = new User();
            user.setUsername("NOOB" + i);
            user.setEmail(i + "146@noob.com");
            user.setDateRegistered(LocalDateTime.now());
            list.add(user);
        }
        System.out.println(userService.saveBatch(list));
    }

}
