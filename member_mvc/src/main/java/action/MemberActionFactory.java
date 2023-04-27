package action;

public class MemberActionFactory {
	
	private static MemberActionFactory maf;
	private MemberActionFactory() {}
	public static MemberActionFactory getInstance() {
		if(maf == null) {
			maf = new MemberActionFactory();
		}
		return maf;
	}
	
	public Action action(String cmd) {
		Action action = null;
		
		if(cmd.equals("/login.do")) {
			action = new MemberLoginAction();
		}else if(cmd.equals("/logout.do")) {
			action = new MemberLogoutAction();
		}else if(cmd.equals("/register.do")) {
			action = new MemberRegisterAction();
		}
		
		return action;
	}
}
