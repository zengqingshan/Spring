package cn.com.wscr.data.controller.interceptor;

import java.io.Serializable;

public class LoginUser implements Serializable {
    private static final long serialVersionUID=-200037536103801756L;
    private String umCode;

    public String getUmCode() {
        return umCode;
    }

    public void setUmCode(String umCode) {
        this.umCode = umCode;
    }
}
