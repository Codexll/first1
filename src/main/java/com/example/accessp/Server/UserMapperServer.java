package com.example.accessp.Server;

import com.example.accessp.entity.Access_Control_Device;
import com.example.accessp.entity.Buiding;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapperServer {
    public List<Access_Control_Device> all();
    public int update(@Param("id") Long id, @Param("status") Long status);
    public List<Buiding> getbyname();
}
