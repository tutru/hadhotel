package com.had.hadhotel.dao;

import java.util.List;

import com.had.hadhotel.entity.Role;
import com.had.hadhotel.model.RoleInfo;

public interface RoleDAO {
    public Role findRole( int id);
	
	public List<RoleInfo> listRoleInfos();
	 
    public void saveRole(RoleInfo RoleInfo);
 
    public RoleInfo findRoleInfo(int id);
 
    public void deleteRole(int id);
}
