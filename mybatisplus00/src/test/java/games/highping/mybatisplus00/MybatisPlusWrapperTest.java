package games.highping.mybatisplus00;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import games.highping.mybatisplus00.bean.User;
import games.highping.mybatisplus00.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisPlusWrapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testWrapperSelectList() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("username","NOOB").isNotNull("email");
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }

    @Test
    //排序
    void testWrapperRank() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("username").orderByAsc("id");
        List<User> list = userMapper.selectList(wrapper);
        list.forEach(System.out::println);
    }

    @Test
    void testWrapperDelete() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.isNull("username");
        System.out.println(userMapper.delete(wrapper));
    }

    @Test
    void testWrapperUpdate() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username","NOOB0");
        User user = new User();
        user.setEmail("0000@noob.com");
        System.out.println(userMapper.update(user, wrapper));
    }



}
