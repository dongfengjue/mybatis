package com.chenbing;

import com.chenbing.mapper.UserMapper;
import com.chenbing.model.User;

public class TestMybatis {

    public static void main(String[] args) {
        MySqlsession sqlsession=new MySqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = mapper.getUserById("1");
        System.out.println(user);
    }
}
