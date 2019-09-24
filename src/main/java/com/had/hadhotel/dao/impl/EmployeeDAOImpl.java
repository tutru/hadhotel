package com.had.hadhotel.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.had.hadhotel.dao.EmployeeDAO;
import com.had.hadhotel.entity.Employee;
import com.had.hadhotel.model.EmployeeInfo;


public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
    private SessionFactory sessionFactory;
 
    @Override
    public Employee findEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Criteria crit = session.createCriteria(Employee.class);
        crit.add(Restrictions.eq("id", id));
        return (Employee) crit.uniqueResult();
    }
 
    @Override
    public EmployeeInfo findEmployeeInfo(int id) {
    	Employee employee = this.findEmployee(id);
        if (employee == null) {
            return null;
        }
        return new EmployeeInfo(employee.getEmployeeid(), employee.getName(),employee.getBirthday(),employee.getGovernmentid(),employee.getPhone(),
        	employee.getEmail(),employee.getAddress(), employee.getImage(),employee.getSalary()	);
    }
 
    @Override
    public List<EmployeeInfo> listEmployeeInfos() {
        String sql = "Select * from Employee";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(sql);
        return query.list();
    }
 
    public void saveEmployee(EmployeeInfo eployeeInfo) {
        Integer id = eployeeInfo.getEmployeeid();
        Employee employee = null;
        if (id != null) {
        	employee = this.findEmployee(id);
        }
        boolean isNew = false;
        if (employee == null) {
            isNew = true;
            employee = new Employee();
            employee.setEmployeeid(eployeeInfo.getEmployeeid());
        }
        employee.setName(eployeeInfo.getName());
        employee.setBirthday(eployeeInfo.getBirthday());
        employee.setGovernmentid(eployeeInfo.getGovernmentid());
        employee.setPhone(eployeeInfo.getPhone());
        employee.setEmail(eployeeInfo.getEmail());
        employee.setAddress(eployeeInfo.getAddress());
        employee.setImage(eployeeInfo.getImage());
        employee.setSalary(eployeeInfo.getSalary());
 
        if (isNew) {
            Session session = this.sessionFactory.getCurrentSession();
            session.persist(employee);
        }
    }
 
    @Override
    public void deleteEmployee(int id) {
        Employee employee = this.findEmployee(id);
        if (employee != null) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }
    }

}
