package games.highping.mybatisplus00.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import games.highping.mybatisplus00.bean.User;
import games.highping.mybatisplus00.mapper.UserMapper;
import games.highping.mybatisplus00.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
