package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user WHERE id = #{id}")
    User userFindById(@Param("id") long id);

    @Select("SELECT * FROM user")
    List<User> findAllUser();

    @Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
    int addUser(User user);

    @Update("UPDATE user SET name=#{name}, age=#{age} WHERE id = #{id}")
    int updateUser(User user);

    @Delete("DELETE FROM user WHERE id = #{id}")
    int deleteUser(@Param("id") long id);

}
