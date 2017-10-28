package Domain;

public class user {
    private  Integer userid;
    private  String username;
    private  String usersex;
    private  Integer loginpwd;
    private  Integer telphone;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public Integer getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(Integer loginpwd) {
        this.loginpwd = loginpwd;
    }

    public Integer getTelphone() {
        return telphone;
    }

    public void setTelphone(Integer telphone) {
        this.telphone = telphone;
    }
}
