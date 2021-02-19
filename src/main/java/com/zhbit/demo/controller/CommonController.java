package com.zhbit.demo.controller;


import com.zhbit.demo.pojo.Stu;
import com.zhbit.demo.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class CommonController {

    @Autowired
    CommonService commonService;

    @RequestMapping(value = "/", method = {RequestMethod.POST})
    public Stu Login(HttpServletRequest request, HttpServletResponse response) {
        String sno = request.getParameter("sno");
        System.out.println("输入的sno："+sno);
        String sname = commonService.Login(sno);
        Stu stu = new Stu();
        stu.setSname(sname);
        return stu;
    }
}
