package games.highping.mybatisplus00;

import games.highping.mybatisplus00.bean.User;
import games.highping.mybatisplus00.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class Mybatisplus00ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testMybatisPlusInsert() {
        User user = new User();
        user.setUsername("NOOB5");
        user.setEmail("165441@noob.com");
        user.setDateRegistered(LocalDateTime.now());
        System.out.println(userMapper.insert(user));
        System.out.println(user.getId());
    }

    @Test
    void testMybatisPlusDelete() {
        //根据雪花ID删除
        System.out.println(userMapper.deleteById(1724981560511332353L));

        //根据map集合中的条件删除
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("username","NOOB1");
        System.out.println(userMapper.deleteByMap(hashMap));

        //根据多个ID批量删除
        List<Long> list = Arrays.asList(1724979567751348226L,1724979567751348225L);
        userMapper.deleteBatchIds(list);
    }

    @Test
    void testMybatisPlusUpdate() {
        User user = new User();
        user.setId(1724950594103332865L);
        user.setUsername("NOOB000");
        user.setDateRegistered(LocalDateTime.now());
        System.out.println(userMapper.updateById(user));
    }

    @Test
    void testMybatisPlusSelect() {
        User user = new User();
        //根据ID查询
        System.out.println(userMapper.selectById(1L));
        //复数ID查询
        List<Long> list = Arrays.asList(1L, 2L);
        System.out.println(userMapper.selectBatchIds(list));

        //根据map集合中的条件查询
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",4L);
        System.out.println(userMapper.selectByMap(map));

        //查询所有数据
        System.out.println(userMapper.selectList(null));
    }

    @Test
    void testSelectByUserId() {
        System.out.println(userMapper.selectByUserId(1L));
    }

}
