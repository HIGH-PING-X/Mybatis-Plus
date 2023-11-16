package games.highping.mybatisplus00;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import games.highping.mybatisplus00.bean.User;
import games.highping.mybatisplus00.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybatisPlusPluginsTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testMybatisPlusPlugins() {
        Page<User> page = new Page<>(4,3);
        userMapper.selectPage(page, null);
        //当前页
        System.out.println(page);
        //每页显示的记录数
        System.out.println(page.getRecords());
        //总记录数
        System.out.println(page.getTotal());
        //每页显示的记录数
        System.out.println(page.getSize());
        //是否有下一页
        System.out.println(page.hasNext());
        //是否有上一页
        System.out.println(page.hasPrevious());
        //下一页
        System.out.println(page.getPages());
    }

    @Test
    void testSelectPageVo() {
        Page<User> page = new Page<>(1,3);
        userMapper.selectPageVo(page,6L);
        System.out.println(page);
        System.out.println(page.getRecords());
        System.out.println(page.getTotal());
        System.out.println(page.getSize());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
        System.out.println(page.getPages());
    }

}
