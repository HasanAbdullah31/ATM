package com.ahs.service;

import com.ahs.dao.IUserInfoDAO;
import com.ahs.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService implements IUserInfoService {
    @Autowired
    private IUserInfoDAO userInfoDAO;

    @Override
    public List<Account> getAllBalances() {
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
