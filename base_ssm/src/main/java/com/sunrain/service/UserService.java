package com.sunrain.service;

import com.sunrain.dto.CheckResult;
import com.sunrain.dto.UserSignInResult;
import com.sunrain.dto.UserSignUpResult;
import com.sunrain.vo.UserSignInForm;
import com.sunrain.vo.UserSignUpForm;

/**
 * 测试案例：User的业务逻辑接口
 * @author panhainan
 * @email panhainan@yeah.net
 * @version 1.0
 */
public interface UserService {

    UserSignUpResult signUp(UserSignUpForm userSignUpForm);
    CheckResult checkUserNameIsExist(String userName);
    CheckResult checkUserEmailIsExist(String userEmail);

    UserSignInResult signIn(UserSignInForm userSignInForm);

}
