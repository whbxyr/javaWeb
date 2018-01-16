package cn.whbxyr.controller;

import cn.whbxyr.user.UserDetail;
import com.alibaba.fastjson.JSON;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/login")
public class Login extends HttpServlet {

    public UserDetail getUser() {
        UserDetail user = new UserDetail();
        user.setName("ray");
        user.setAge(22);
        user.setGrade(16);
        return user;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // 设置返回类型
        res.setContentType("text/json; charset=utf-8");
        res.setCharacterEncoding("UTF-8");

        req.getSession().setAttribute("isLogin","yes");
        String userJson = JSON.toJSONString(getUser());
        HttpSession session = req.getSession();
        session.setAttribute("userName", "ray");
        OutputStream out = res.getOutputStream();
        out.write(userJson.getBytes("UTF-8"));
        out.flush();
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
