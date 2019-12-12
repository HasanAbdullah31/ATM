package com.ahs.dao;

import com.ahs.entity.Account;
import com.ahs.entity.UserInfo;

public interface IUserInfoDAO {
    UserInfo getActiveUser(String userName);

    String getFullName();

    Account getAllBalances();

    void setChecking(double amt);

    void setSaving(double amt);

    void checkingToSaving(double amt);

    void savingToChecking(double amt);
}
