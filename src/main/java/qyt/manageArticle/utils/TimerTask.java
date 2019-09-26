package qyt.manageArticle.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import qyt.manageArticle.service.ArticleService;
 
@Controller
public class TimerTask {
	
	
	@Autowired 
	ArticleService articleServiceimpl;
	
	
	//@Scheduled(cron="0/5 * *  * * ? ")
	@Scheduled(cron = "0 0 0 * * ?")//每天凌晨2点开始执行
    public void test2()
    {
	  articleServiceimpl.selectArticleWherebVerify();
      //System.out.println("每五秒执行一次------------------------------------------------------------------");
    }
}
