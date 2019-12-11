package com.concretepage.dao;
import java.util.List;

import com.concretepage.entity.Account;
import com.concretepage.entity.UserInfo;
public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
	List<Account> getAllBalances();
	void setChecking(double amt);
	void setSaving(double amt);
}