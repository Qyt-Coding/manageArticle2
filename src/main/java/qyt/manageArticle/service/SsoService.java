package qyt.manageArticle.service;

import qyt.manageArticle.pojo.Admin;
import qyt.manageArticle.utils.E3Result;

public interface SsoService {

	
	public  E3Result register(Admin admin);
	
	public E3Result login(Admin admin );
}
