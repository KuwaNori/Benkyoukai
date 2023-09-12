package com.twitter.mock.model;

import com.twitter.mock.entities.FollowEntity;
import com.twitter.mock.entities.UserRegisterEntity;
import com.twitter.mock.entities.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserModel {
    @Select("SELECT * FROM users WHERE user_id = #{userId}")
    UserEntity findById(String userId);

    @Insert("INSERT INTO users(user_id, name, follower, following, private_lock) VALUES (#{userId}, #{name}, 0, 0, #{private_lock})")
    void registerUser(UserRegisterEntity userRegisterEntity);

    @Update("UPDATE users SET name = #{name}, birth_day = #{birth_day}, bio = #{bio}, icon_dir = #{icon_dir}, private_lock = #{private_lock} WHERE user_id = #{user_id}")
    void updateUser(UserEntity userEntity);

    @Update("UPDATE users SET following = #{following}, follower = #{follower} WHERE user_id = #{user_id}")
    void updateFollow(FollowEntity followEntity);
}
