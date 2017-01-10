package dao;
/*
 * UserDao接口
 */
import entity.User;

public interface UserDao {
	public boolean findUser(User user);
	public void addUser(User user);
}
