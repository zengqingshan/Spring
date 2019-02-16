package cn.com.wscr.data.controller.interceptor;

public class UserContainer {
    private static ThreadLocal<LoginUser> userThreadLocal = new ThreadLocal<>();

    public static LoginUser getUser() {
        return userThreadLocal.get();
    }

    public static void setUser(LoginUser loginUser) {
        userThreadLocal.set(loginUser);
    }
}
