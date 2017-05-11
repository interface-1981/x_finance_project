package web.action.product;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import web.action.AbstractAction;

@Results({
@Result(name = "success", location = "login.jsp"),
@Result(name = "error", location = "login.jsp"),
@Result(name="main", location="/main", type="redirect")
})
public class LoginAction extends AbstractAction {

    private static final long serialVersionUID = 1L;

    public String errmsg;
    public String userId;
    public String password;


    @Action("/login")
    public String execute() throws Exception {
        this.sessionMap.put("userId", null);
        this.userId = "Struts2";
        return "success";
    }

    @Action("/dologin")
    public String login() throws Exception {
        if(this.password == null || !this.password.equals("pass")){
            this.password = null;
            this.errmsg = "PASSWORDは「pass」と入力してください";
            return "error";
        }
        this.sessionMap.put("userId", this.userId);
        return "main";
    }
}
