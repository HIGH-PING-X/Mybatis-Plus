package games.highping.mybatisplus00.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import games.highping.mybatisplus00.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper extends BaseMapper<User> {

    //自定义sql
    Map<String, Object> selectByUserId(Long id);

    Page<User> selectPageVo(@Param("page") Page<User> page, @Param("id") Long id);

}
