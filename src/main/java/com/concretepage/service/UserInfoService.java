package com.concretepage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.IUserInfoDAO;
import com.concretepage.entity.Account;
@Service
public class UserInfoService implements IUserInfoService {
	@Autowired
	private IUserInfoDAO userInfoDAO;
	@Override
	public List<Account> getAllBalances(){
		return userInfoDAO.getAllBalances();
	}
	@Override
	public void setChecking(double amt) {
		userInfoDAO.setChecking(amt);
	}
	@Override
	public void setSaving(double amt) {
		userInfoDAO.setSaving(amt);
	}
}
