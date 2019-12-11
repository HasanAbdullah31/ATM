package com.concretepage.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.concretepage.entity.Account;

public interface IUserInfoService {
	 @Secured ({"ROLE_ADMIN"})
     List<Account> getAllBalances();
	 void setChecking(double amt);
	 void setSaving(double amt);
}
