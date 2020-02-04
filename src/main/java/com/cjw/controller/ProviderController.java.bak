package com.cjw.controller;

import com.cjw.pojo.SmbmsUser;
import com.cjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("providerController")
public class ProviderController {
    @Autowired
    private UserService userService;
    
    
    @RequestMapping("index")
	public String index() {
		return "index";
	}
    
    @RequestMapping(value = "queryProvider",method = RequestMethod.GET)
    public  String queryProvider(Model model){
        List<SmbmsUser> SmbmsUser = userService.queryProvider();
        model.addAttribute("User",SmbmsUser);
        return "provider";
    }
    @RequestMapping(value = "deleteProvider",method = RequestMethod.GET)
    @ResponseBody
    public  Object deleteProvider(@RequestParam("id") Integer id){
       int row = userService.deleteProvider(id);
       return  row==0?false:true;
    }

    @RequestMapping(value = "addProvider",method = RequestMethod.GET)
    public  String queryProvider_id(HttpServletRequest request){
        SmbmsUser smbmsUser = new SmbmsUser();
        smbmsUser.setUserCode(request.getParameter("UserCode"));
        smbmsUser.setUserName(request.getParameter("UserName"));
        smbmsUser.setUserPassword(request.getParameter("UserPassword"));
        userService.addSmbmsUser(smbmsUser);
        return "provider";
    }

    @RequestMapping(value = "updateProvider",method = RequestMethod.POST)
    public  String updateProvider(HttpServletRequest request){
        SmbmsUser smbmsUser = new SmbmsUser();
        smbmsUser.setId(Integer.parseInt(request.getParameter("id")));
        smbmsUser.setUserCode(request.getParameter("UserCode"));
        smbmsUser.setUserName(request.getParameter("UserName"));
        smbmsUser.setUserPassword(request.getParameter("UserPassword"));
        userService.addSmbmsUser(smbmsUser);
        return "provider";

    }
    @RequestMapping(value = "update",method = RequestMethod.GET)
    public  String update(@RequestParam("id") Integer id,Model model){
        SmbmsUser smbmsUser = userService.queryProvider(id);
        model.addAttribute("UserUpdate",smbmsUser);
        return "UpdateProvider";

    }
}