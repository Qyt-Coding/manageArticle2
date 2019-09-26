package manageArticle2;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import qyt.manageArticle.mapper.ArticleMapper;
import qyt.manageArticle.newPojo.LeaveWordReplayAA;
import qyt.manageArticle.pojo.Article;
import qyt.manageArticle.service.ArticleService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/*.xml")
public class xxx {
	
	@Autowired 
	ArticleService articleServiceimpl;
	
	@Autowired 
	ArticleMapper articleMapper;
	
	@Test
	public void  text11() {
		 articleServiceimpl.selectArticleWherebVerify();
		 
	}

}
