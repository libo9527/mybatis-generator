package com.example.mybatisgenerator.mapper;

import com.example.mybatisgenerator.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    @Delete({
        "delete from user",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);

    @Insert({
        "insert into user (user_id, open_id, ",
        "union_id, nick_name, ",
        "gender, avatar_url, ",
        "coin_amount, red_envelope_amount, ",
        "scene_code, channel_id, ",
        "create_time, update_time)",
        "values (#{userId,jdbcType=INTEGER}, #{openId,jdbcType=VARCHAR}, ",
        "#{unionId,jdbcType=VARCHAR}, #{nickName,jdbcType=VARCHAR}, ",
        "#{gender,jdbcType=TINYINT}, #{avatarUrl,jdbcType=VARCHAR}, ",
        "#{coinAmount,jdbcType=INTEGER}, #{redEnvelopeAmount,jdbcType=DECIMAL}, ",
        "#{sceneCode,jdbcType=INTEGER}, #{channelId,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(User record);

    int insertSelective(User record);

    @Select({
        "select",
        "user_id, open_id, union_id, nick_name, gender, avatar_url, coin_amount, red_envelope_amount, ",
        "scene_code, channel_id, create_time, update_time",
        "from user",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user",
        "set open_id = #{openId,jdbcType=VARCHAR},",
          "union_id = #{unionId,jdbcType=VARCHAR},",
          "nick_name = #{nickName,jdbcType=VARCHAR},",
          "gender = #{gender,jdbcType=TINYINT},",
          "avatar_url = #{avatarUrl,jdbcType=VARCHAR},",
          "coin_amount = #{coinAmount,jdbcType=INTEGER},",
          "red_envelope_amount = #{redEnvelopeAmount,jdbcType=DECIMAL},",
          "scene_code = #{sceneCode,jdbcType=INTEGER},",
          "channel_id = #{channelId,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}