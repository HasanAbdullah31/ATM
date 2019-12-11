package com.concretepage.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.entity.Account;
import com.concretepage.entity.UserInfo;
@Repository
@Transactional
public class UserInfoDAO implements IUserInfoDAO {
	private int userId;
	@PersistenceContext	
	private EntityManager entityManager;
	public UserInfo getActiveUser(String userName) {
		UserInfo activeUserInfo = new UserInfo();
		List<?> list = entityManager.createQuery("SELECT u FROM UserInfo u WHERE userName=?")
				.setParameter(1, userName).getResultList();
		if(!list.isEmpty()) {
			activeUserInfo = (UserInfo)list.get(0);
		}
		this.userId = activeUserInfo.getUserId();
		return activeUserInfo;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Account> getAllBalances() {
		String hql = "FROM Account as atcl WHERE atcl.accountId="+userId;
		return (List<Account>) entityManager.createQuery(hql).getResultList();
	}
	@Override
	public void setChecking(double amt) {
		String hql = "UPDATE Account as atcl SET atcl.checking="+amt+" where atcl.accountId="+userId;
		entityManager.createNativeQuery(hql);
	}
	@Override
	public void setSaving(double amt) {
		String hql = "UPDATE Account as atcl SET atcl.saving="+amt+" where atcl.accountId="+userId;
		entityManager.createNativeQuery(hql);
	}
}