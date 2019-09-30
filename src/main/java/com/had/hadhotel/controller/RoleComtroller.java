package com.had.hadhotel.controller;

import java.util.List;

import javax.management.relation.RoleList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.had.hadhotel.dao.RoleDAO;
import com.had.hadhotel.model.CustomerInfo;
import com.had.hadhotel.model.RoleInfo;

@Controller
@RequestMapping("/")
public class RoleComtroller {
	@Autowired
	private RoleDAO role;
	
	@RequestMapping("/roleList")
	public String roleList(Model model) {
		List<RoleInfo> list = role.listRoleInfos();
		model.addAttribute("list", list);
		return "rolelist";
	}
}
