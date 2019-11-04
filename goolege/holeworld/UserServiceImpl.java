package src.com.google.user;

/**Description:µÇÂ¼ÏµÍ³
 * author:caixiaoting
 * date:2019/11/03
 */
public class UserServiceImpl implements Userservice {

	/* (non-Javadoc)
	 * @see src.com.google.user.Userservice#login(src.com.google.user.User)
	 */
	@Override
	public int login(User user) {
		// TODO Auto-generated method stub
		int result = 3;
		if(DefaultValue.USERNAME.equals(user.getUsername())) {
			if(DefaultValue.USERPASSWORD.equals(user.getUserpassword())){
				result = 1;
				System.out.println("welcome" + user.getUsername());
			}else {
				result = 2;
				System.out.println("password incorrect");
			}
		}else {		
		return 0;
		System.out.println("username incorrect");
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see src.com.google.user.Userservice#register(src.com.google.user.User)
	 */
	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
