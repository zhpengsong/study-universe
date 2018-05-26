package com.zhang.service;

import com.zhang.dao.UserMapper;
import com.zhang.domain.entity.User;
import com.zhang.domain.entity.UserExample;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/5/26 0026.
 */
@Service
public class LoginService {
    @Resource
    private UserMapper userMapper;

    public User getById(){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(1L);
        List<User> userList = userMapper.selectByExample(userExample);

        if(CollectionUtils.isEmpty(userList)) {
            return null;
        }
        return userList.get(0);
    }

}
