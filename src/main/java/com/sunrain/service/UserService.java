package com.sunrain.service;

import com.sunrain.dto.CheckResult;
import com.sunrain.dto.UserSignInResult;
import com.sunrain.dto.UserSignUpResult;
import com.sunrain.vo.UserSignInForm;
import com.sunrain.vo.UserSignUpForm;

/**
 * 
 * 测试案例：User的业务逻辑接口
 *
 * @author sunrain
 * @date 2017年9月28日
 * @email dybarr@qq.com
 */
public interface UserService {

	UserSignUpResult signUp(UserSignUpForm userSignUpForm);

	CheckResult checkUserNameIsExist(String userName);

	CheckResult checkUserEmailIsExist(String userEmail);

	UserSignInResult signIn(UserSignInForm userSignInForm);

}
