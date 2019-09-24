package com.had.hadhotel.dao;

import java.util.List;

import com.had.hadhotel.entity.Employee;
import com.had.hadhotel.model.EmployeeInfo;




public interface EmployeeDAO {
	public Employee findEmployee(int id);
	 
    public List<EmployeeInfo> listEmployeeInfos();
 
    public void saveEmployee(EmployeeInfo employeeInfo);
 
    public EmployeeInfo findEmployeeInfo(int id);
 
    public void deleteEmployee(int id);

}
