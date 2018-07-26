package com.ajay.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ajay.Bean.Account;

public class AccountDaoImpl implements AccountDao {
private HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
	this.ht = ht;
}

	@Override
	public void saveAccount(Account e) {
		// TODO Auto-generated method stub
ht.save(e);
	}

	@Override
	public void updateAccount(Account e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAccount(Account e) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account getById(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		DetachedCriteria criteria= DetachedCriteria.forClass(Account.class);

		List<Account> acclist =(List<Account>) ht.findByCriteria(criteria);

		return acclist;
	}

}
