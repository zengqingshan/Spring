package cn.com.wscr.data.controller.test;

import cn.com.wscr.data.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping("/add")
    public void test(){
        String a="";
        StringBuffer sb=new StringBuffer();
        StringBuilder sbd=new StringBuilder();
    }
}
