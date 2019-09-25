package com.had.hadhotel.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.had.hadhotel.dao.AccountDAO;
import com.had.hadhotel.entity.Account;
import com.had.hadhotel.entity.Customer;
import com.had.hadhotel.model.AccountInfo;

public class AccountDAOlmpl implements AccountDAO {
	@Autowired
    private SessionFactory sessionFactory;
 
    @Override
    public Account findaccount(int id) {
        Session session = sessionFactory.getCurrentSession();
        Criteria crit = session.createCriteria(Account.class);
        crit.add(Restrictions.eq("id", id));
        return (Account) crit.uniqueResult();
    }
 //ll
    @Override
    public AccountInfo findAccountInfo(int id) {
        Account account = this.findaccount(id);
        if (account == null) {
            return null;
        }
        return new AccountInfo(account.getAccount_id(), account.getEmployee_id(),account.getRole_id(),
        		account.getUsername(), account.getPassword());
    }
 
    @Override
    public List<AccountInfo> listAccountInfos() {
        String sql = "Select * from ACCOUNT";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(sql);
        return query.list();
    }
 
    public void saveAccount(AccountInfo accountInfo) {
        Integer id = accountInfo.getaccount_id();
        Account Account = null;
        if (id != null) {
        	Account = this.findaccount(id);
        }
        boolean isNew = false;
        if (Account == null) {
            isNew = true;
            Account = new Account();
            Account.setAccount_id(accountInfo.getaccount_id());
        }
        Account.setEmployee_id(accountInfo.getEmployee_id());
        Account.setRole_id(accountInfo.getRole_id());
        Account.setUsername(accountInfo.getUsername());
        Account.setPassword(accountInfo.getPassword());
        
 
        if (isNew) {
            Session session = this.sessionFactory.getCurrentSession();
            session.persist(Account);
        }
    }@Override
    public void deleteAccount(int id) {
        Account account = this.findaccount(id);
        if (account != null) {
            this.sessionFactory.getCurrentSession().delete(account);
        }
    }
 
   

}
