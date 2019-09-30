package com.had.hadhotel.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import com.had.hadhotel.dao.RoleDAO;
import com.had.hadhotel.entity.Role;
import com.had.hadhotel.model.RoleInfo;

public class RoleDAOimpl implements RoleDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Role findRole(int id) {
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Role.class);
		crit.add(Restrictions.eq("id", id));
		return (Role) crit.uniqueResult();
	}

	@Override
	public List<RoleInfo> listRoleInfos() {
		String sql = "Select * from Role";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(sql);
		return query.list();

	}

	@Override
	public void saveRole(RoleInfo roleInfo) {
		Integer id = roleInfo.getRole_id();
		Role role = null;
		if (id != null) {
			role = this.findRole(id);
		}
		boolean isNew = false;
		if (role == null) {
			isNew = true;
			role = new Role();
			role.setRole_id(roleInfo.getRole_id());
		}
		role.setRole_id(roleInfo.getRole_id());
		role.setRole_name(roleInfo.getRole_name());
		role.setRole_desc(roleInfo.getRole_desc());

		if (isNew) {
			Session session = this.sessionFactory.getCurrentSession();
			session.persist(role);
		}

	}

	@Override
	public RoleInfo findRoleInfo(int id) {
		Role role = this.findRole(id);
		if (role == null) {
			return null;
		}
		return new RoleInfo(role.getRole_id(), role.getRole_name(), role.getRole_desc());

	}

	@Override
	public void deleteRole(int id) {
		Role role = this.findRole(id);
		if (role != null) {
			this.sessionFactory.getCurrentSession().delete(role);
		}

	}
}
