package com.sunrain.dao;

import com.sunrain.entity.User;

/**
 * 测试案例：User的数据访问接口
 * 
 * @author sunrain
 * @email dybarr@qq.com
 * @version 1.0
 */
public interface UserDao {

	int insert(User user);

	int updateBaseInfoById(User user);

	User selectById(int userId);

	User selectByUserName(String userName);

	User selectByUserEmail(String userEmail);
}
