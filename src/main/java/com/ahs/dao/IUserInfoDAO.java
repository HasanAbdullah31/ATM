package com.ahs.dao;

import com.ahs.entity.Account;
import com.ahs.entity.UserInfo;

import java.util.List;

public interface IUserInfoDAO {
    UserInfo getActiveUser(String userName);

    List<Account> getAllBalances();

    void setChecking(double amt);

    void setSaving(double amt);
}
