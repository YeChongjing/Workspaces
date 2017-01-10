package biz.impl;

import dao.UserDao;
import entity.User;
import biz.UserBiz;
import dao.impl.UserDaoImpl;

public class UserBizImpl implements UserBiz{
	private UserDao userDao = new UserDaoImpl();
	public boolean login(User user){
		boolean flag = userDao.findUser(user);
		return flag;
	}
}
