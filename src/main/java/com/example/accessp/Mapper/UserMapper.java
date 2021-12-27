package com.example.accessp.Mapper;

import com.example.accessp.entity.Access_Control_Device;
import com.example.accessp.entity.Buiding;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public List<Access_Control_Device> all();
    public int update(@Param("id") Long id,@Param("status") Long status);
    public List<Buiding> getbyname();
}
