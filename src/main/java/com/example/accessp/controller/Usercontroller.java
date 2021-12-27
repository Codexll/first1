package com.example.accessp.controller;

import com.alibaba.fastjson.JSON;
import com.example.accessp.Server.UserMapperServer;
import com.example.accessp.entity.Access_Control_Device;
import com.example.accessp.entity.Buiding;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class Usercontroller {
    @Resource
    private UserMapperServer userMapperServer;
@RequestMapping("/all")
    public String all(Model model)
    {
        List<Access_Control_Device> list=userMapperServer.all();
        model.addAttribute("list",list);
        return "index";
    }
    @RequestMapping("/update")
    @ResponseBody
    public String update(@RequestParam("id") String id,@RequestParam("status") String status)
    {
        Long ids=Long.parseLong(id);
        Long statuss=Long.parseLong(status);
        int count=userMapperServer.update(ids,statuss);
        if (count>0)
        {
            return JSON.toJSONString("true");
        }
        else {
            return JSON.toJSONString("false");
        }
    }
    @RequestMapping("/getbyname")
    @ResponseBody
    public String getbyname()
    {
        List<Buiding> list=userMapperServer.getbyname();
        return JSON.toJSONString(list);
    }
}
