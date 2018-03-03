package com.qdum.yunos.usersDemo.mapper;

import com.qdum.yunos.usersDemo.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author taven
 * @date 18/3/4
 */
@Component
public interface UserMapper {

    @Select("SELECT * FROM users WHERE id = #{userId}")
    User getUser(@Param("userId") String userId);

}
