package qyt.manageArticle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import qyt.manageArticle.mapper.AdminMapper;
import qyt.manageArticle.pojo.Admin;
import qyt.manageArticle.pojo.AdminExample;
import qyt.manageArticle.pojo.AdminExample.Criteria;
import qyt.manageArticle.service.SsoService;
import qyt.manageArticle.utils.E3Result;
@Service
public class SsoServiceImpl  implements SsoService{
	
	@Autowired
	AdminMapper adminMapper;

	public  E3Result register(Admin admin) {
		//admin里面什么都有了，现在用工具类去加密password
		
		System.out.println(admin   +"service");
		String md5Pass=  DigestUtils.md5DigestAsHex(admin.getaPassword().getBytes());
		//完成
		admin.setaPassword(md5Pass);
		admin.setaId(null);
		
		
		adminMapper.insert(admin);
		System.out.println(admin+"aaa");
		
		return E3Result.ok();
	}

	
	
	
	//验证账号密码是否正确
	@Override
	public E3Result login(Admin admin ) {
		AdminExample  tb =new AdminExample();
		Criteria cr =tb.createCriteria();
		cr.andANameEqualTo(admin.getaName());
		List<Admin> list=adminMapper.selectByExample(tb);
		if(list==null || list.size()==0)
		{
			return E3Result.build(400, "用户名错误");
		}
		
		Admin admin2=list.get(0);
		
		if(!admin2.getaPassword().equals(DigestUtils.md5DigestAsHex(admin.getaPassword().getBytes())))
		{
			return E3Result.build(400, "密码错误");
		}
		
		return E3Result.ok();
	}
	
}
