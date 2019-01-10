package cn.qctj.igo.controller;

import cn.qctj.igo.domain.Employee;
import cn.qctj.igo.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if (employee.getUsername().equals("admin") && employee.getPassword().equals("admin")){
            return AjaxResult.msg();//默认为成功
        }
        return AjaxResult.msg().setSuccess(false).setMessage("登录失败");
    }
}
