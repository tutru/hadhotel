package com.had.hadhotel.dao;

import java.util.List;

import com.had.hadhotel.entity.Account;
import com.had.hadhotel.model.AccountInfo;



public interface AccountDAO {
	public Account findaccount(int id);

	public List<AccountInfo> listAccountInfos();

	public void saveAccount(AccountInfo accountInfo);

	public AccountInfo findAccountInfo(int id);

	public void deleteAccount(int id);
	// kk



}
