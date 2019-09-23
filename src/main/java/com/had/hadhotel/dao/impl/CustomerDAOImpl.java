package com.had.hadhotel.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.had.hadhotel.dao.CustomerDAO;
import com.had.hadhotel.entity.Customer;
import com.had.hadhotel.model.CustomerInfo;

public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
    private SessionFactory sessionFactory;
 
    @Override
    public Customer findCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
        Criteria crit = session.createCriteria(Customer.class);
        crit.add(Restrictions.eq("id", id));
        return (Customer) crit.uniqueResult();
    }
 //ll
    @Override
    public CustomerInfo findCustomerInfo(int id) {
        Customer customer = this.findCustomer(id);
        if (customer == null) {
            return null;
        }
        return new CustomerInfo(customer.getCustomerid(), customer.getCustomername(),customer.getGovernmentid(),
        		customer.getCustomeraddress(), customer.getPhone(),customer.getEmail(),customer.getCcnumber());
    }
 
    @Override
    public List<CustomerInfo> listCustomerInfos() {
        String sql = "Select * from Customer";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(sql);
        return query.list();
    }
 
    public void saveCustomer(CustomerInfo customerInfo) {
        Integer id = customerInfo.getCustomerid();
        Customer customer = null;
        if (id != null) {
            customer = this.findCustomer(id);
        }
        boolean isNew = false;
        if (customer == null) {
            isNew = true;
            customer = new Customer();
            customer.setCustomerid(customerInfo.getCustomerid());
        }
        customer.setCustomername(customerInfo.getCustomername());
        customer.setGovernmentid(customerInfo.getGovernmentid());
        customer.setCustomeraddress(customerInfo.getCustomeraddress());
        customer.setPhone(customerInfo.getPhone());
        customer.setEmail(customerInfo.getEmail());
        customer.setCcnumber(customerInfo.getCcnumber());
 
        if (isNew) {
            Session session = this.sessionFactory.getCurrentSession();
            session.persist(customer);
        }
    }
 
    @Override
    public void deleteCustomer(int id) {
        Customer customer = this.findCustomer(id);
        if (customer != null) {
            this.sessionFactory.getCurrentSession().delete(customer);
        }
    }
}
