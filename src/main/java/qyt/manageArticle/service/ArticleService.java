package qyt.manageArticle.service;

import java.util.List;

import qyt.manageArticle.newPojo.LeaveWordReplay;
import qyt.manageArticle.newPojo.LeaveWordReplayAA;
import qyt.manageArticle.pojo.Admin;
import qyt.manageArticle.pojo.Article;
import qyt.manageArticle.pojo.Reply;
import qyt.manageArticle.utils.E3Result;
import qyt.manageArticle.utils.EasyUIDataGridResult;
import qyt.manageArticle.utils.LayUiPageResult;

public interface ArticleService {
	
	public E3Result  articlePublished(Article article);
	
	public LayUiPageResult  articleList(int page,int rows,int flag);

	public E3Result insertLeaveWord(Integer bId, Admin admin,String cContent);

	public Article selectArticle(Integer bId);
	
	public LeaveWordReplay findReplay(Integer bId);
	
	public List<LeaveWordReplayAA> findReplayAA(Integer bId);
	
	public E3Result insertReply(Reply reply);
	
	public E3Result updateArticleWhereVerify(Integer bId);
	
	public E3Result updateManyArticleWhereVerify(List<Article> checkDate,int flag);
	
	public E3Result updateArticle(Article article);
	
	public E3Result  selectArticleWherebVerify();
	public E3Result  deleteManyArticle(List<Article> checkDate);

}
