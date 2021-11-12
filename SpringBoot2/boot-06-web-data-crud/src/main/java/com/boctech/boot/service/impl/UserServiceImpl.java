package com.boctech.boot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boctech.boot.bean.User;
import com.boctech.boot.mapper.UserMapper;
import com.boctech.boot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/11- 18:48
 * Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
