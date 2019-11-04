package src.com.google.user;
/**Description:登录系统
 * author:caixiaoting
 * date:2019/11/03
 */
public interface Userservice {
	//0-用户不存在，1-登录成功，2-密码错误，3-登录异常
		public int login(User user);
		
		//注册
		public int register(User user);
}
