package com.ahs.service;

import com.ahs.dao.IUserInfoDAO;
import com.ahs.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService implements IUserInfoService {
    @Autowired
    private IUserInfoDAO userInfoDAO;

    @Override
    public String getFullName() {
        return userInfoDAO.getFullName();
    }

    @Override
    public Account getAllBalances() {
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

    @Override
    public void checkingToSaving(double amt) {
        userInfoDAO.checkingToSaving(amt);
    }

    @Override
    public void savingToChecking(double amt) {
        userInfoDAO.savingToChecking(amt);
    }
}
