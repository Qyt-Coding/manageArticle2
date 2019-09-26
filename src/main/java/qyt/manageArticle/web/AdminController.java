package qyt.manageArticle.web;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import qyt.manageArticle.pojo.Admin;
import qyt.manageArticle.service.SsoService;
import qyt.manageArticle.utils.E3Result;
import qyt.manageArticle.utils.VerifyCodeUtils;

@Controller
public class AdminController {

	@Autowired
	SsoService ssoService;
	@RequestMapping("index.action")
	public  String  login() {
		System.out.println("+++++++++");
		return  "index";
	}
	
	//跳转后台界面
	@RequestMapping("System.action")
	public  String  System() {
		System.out.println("+++++++++");
		return  "System";
	}
	
	
	
	
	
	
	@RequestMapping(value="register.action",method=RequestMethod.POST)
	@ResponseBody
	public E3Result register(Admin admin) {
		return  ssoService.register(admin);
		     
	}
	
	//生成验证码
	@RequestMapping(value="checkCode.action")
	public void checkCode(HttpServletRequest request,HttpServletResponse response
			,HttpSession session,Model model) throws IOException {
		 //生成验证码字符串和图片
        BufferedImage img = VerifyCodeUtils.paintImage(80, 30);
        String code = VerifyCodeUtils.getCode();
        //把验证码存放到session对象中
		  session.removeAttribute("code"); 
		  session.setAttribute("code",code.toLowerCase());
		  System.out.println(session.getAttribute("code"));
        
        ImageIO.write(img, "jpeg", response.getOutputStream());
	}
	
	
	
	@RequestMapping(value="login.action",method=RequestMethod.POST)
	@ResponseBody
	public  E3Result  loginTo(Admin admin,HttpServletRequest request,HttpSession session) {
		//return  ssoService.login(admin,reCheckCode);
		System.out.println(admin+"               web");
		session.setAttribute("admin", admin);
		return ssoService.login(admin);
	}
	
	
	@RequestMapping(value="checkSession.action")
	@ResponseBody
	public String  checkSession(HttpSession session){
		 System.out.println(session.getAttribute("code"));
		
		 return (String) session.getAttribute("code");
	}
	
}
