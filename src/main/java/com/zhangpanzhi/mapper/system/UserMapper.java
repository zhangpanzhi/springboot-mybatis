package com.zhangpanzhi.mapper.system;

import com.zhangpanzhi.model.system.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户dao 接口
 */
public interface UserMapper {

    /**
     * 插入用户，并将主键设置到user中
     * 注意：返回的是数据库影响条数，即1
     */
    public int insertUserWithBackId(User user);
}
