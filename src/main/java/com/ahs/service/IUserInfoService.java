package com.ahs.service;

import com.ahs.entity.Account;
import org.springframework.security.access.annotation.Secured;

import java.util.List;

public interface IUserInfoService {
    @Secured({"ROLE_ADMIN"})
    List<Account> getAllBalances();

    void setChecking(double amt);

    void setSaving(double amt);
}
