package com.had.hadhotel.dao;

import java.util.List;

import com.had.hadhotel.entity.Customer;
import com.had.hadhotel.model.CustomerInfo;
//haodqffdf
public interface CustomerDAO {
	
	public Customer findCustomer(int id);
	 
    public List<CustomerInfo> listCustomerInfos();
 
    public void saveCustomer(CustomerInfo customerInfo);
 
    public CustomerInfo findCustomerInfo(int id);
 
    public void deleteCustomer(int id);
    //kk

}
