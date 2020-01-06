package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Permission;
import com.accp.domain.Users;
import com.accp.domain.UsersExample;
import com.accp.mapper.PermissionMapper;
import com.accp.mapper.UsersMapper;

@Service
@Transactional
public class MaintainService {

	@Autowired
	UsersMapper um;
	
	@Autowired
	PermissionMapper pm;
	
	
	//登陆
	public Users login(String username,String pwd) {
		UsersExample example=new UsersExample();
		example.createCriteria().andUnameEqualTo(username).andUpwdEqualTo(pwd);
		List<Users> list=um.selectByExample(example);
		if(list!=null&&list.size()>0)
			return list.get(0);
		return null;
	}
	//查询该人员的所有权限
	public List<Permission> queryPer(Integer uid){
		return pm.queryUid(uid);
	}
	//查询该权限下的所有权限
	
}
