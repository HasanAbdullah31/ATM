package com.ahs.service;

import com.ahs.entity.Account;
import org.springframework.security.access.annotation.Secured;

public interface IUserInfoService {
    String getFullName();

    @Secured({"ROLE_ADMIN"})
    Account getAllBalances();

    void setChecking(double amt);

    void setSaving(double amt);

    void checkingToSaving(double amt);

    void savingToChecking(double amt);
}
