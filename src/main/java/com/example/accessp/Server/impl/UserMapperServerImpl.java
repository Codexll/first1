package com.example.accessp.Server.impl;

import com.example.accessp.Mapper.UserMapper;
import com.example.accessp.Server.UserMapperServer;
import com.example.accessp.entity.Access_Control_Device;
import com.example.accessp.entity.Buiding;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserMapperServerImpl implements UserMapperServer {
    @Resource
   private UserMapper userMapper;

    @Override
    public List<Access_Control_Device> all() {
        return userMapper.all();
    }

    @Override
    public int update(Long id, Long status) {
        return userMapper.update(id,status);
    }

    @Override
    public List<Buiding> getbyname() {
        return userMapper.getbyname();
    }
}
