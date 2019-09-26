package qyt.manageArticle.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import qyt.manageArticle.mapper.ArticleMapper;
import qyt.manageArticle.mapper.LeaveWordsMapper;
import qyt.manageArticle.mapper.ReplyMapper;
import qyt.manageArticle.newPojo.LeaveWordReplay;
import qyt.manageArticle.newPojo.LeaveWordReplayAA;
import qyt.manageArticle.pojo.Admin;
import qyt.manageArticle.pojo.Article;
import qyt.manageArticle.pojo.ArticleExample;
import qyt.manageArticle.pojo.LeaveWords;
import qyt.manageArticle.pojo.LeaveWordsExample;
import qyt.manageArticle.pojo.LeaveWordsExample.Criteria;
import qyt.manageArticle.pojo.LeaveWordsExample.Criterion;
import qyt.manageArticle.pojo.Reply;
import qyt.manageArticle.pojo.ReplyExample;
import qyt.manageArticle.service.ArticleService;
import qyt.manageArticle.utils.E3Result;
import qyt.manageArticle.utils.EasyUIDataGridResult;
import qyt.manageArticle.utils.LayUiPageResult;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleMapper articleMapper;

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date date = new Date();
	String nowDate = sdf.format(date);

	@Override
	public E3Result articlePublished(Article article) {
		/**
		 * Admin里面只有3个参数 名字 name 简介 summary 内容 content
		 */

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String nowDate = sdf.format(date);

		article.setbDate(nowDate);
		article.setbId(null);
		// 1 是检查 0是未检查
		article.setbVerify(1);
		// 1是发布 0是未发布
		article.setbPublish(1);
		// 1是存在
		article.setbStatus(1);
		articleMapper.insert(article);

		return E3Result.ok();
	}

	@Override
	public LayUiPageResult articleList(int page, int rows,int flag) {
		PageHelper.startPage(page, rows);
		// 执行查询
		ArticleExample example = new ArticleExample();
		
		qyt.manageArticle.pojo.ArticleExample.Criteria cr=example.createCriteria();
		
		if(flag==1) {
			cr.andBVerifyEqualTo(1);
			cr.andBPublishEqualTo(1);
			cr.andBStatusEqualTo(1);
		}else {
			cr.andBVerifyEqualTo(0);
			cr.andBPublishEqualTo(0);
			cr.andBStatusEqualTo(0);
		}
	
		// 这里的List显示10条数据
		List<Article> list = articleMapper.selectByExampleWithBLOBs(example);
		//List<Article> list =articleMapper.selectArticle1();
		for(Article l:list) {
			System.out.println(l.getbId()+"--------------------test  ---9/18");
		}
		PageInfo<Article> pageInfo = new PageInfo<>(list);
		
		
		
		
		// 创建返回结果对象
		LayUiPageResult result = new LayUiPageResult();
		Long i = pageInfo.getTotal();
		Integer j = i.intValue();
		result.setCount(j);
		result.setCode(0);
		result.setData(list);
		result.setMsg("");

		/*
		 * result.setTotal(j); result.setRows(list);
		 */
		return result;
	}

	@Override
	public Article selectArticle(Integer bId) {
		Article article = articleMapper.selectByPrimaryKey(bId);
		return article;
	}

	@Autowired
	LeaveWordsMapper leaveWordsMapper;

	@Override
	public E3Result insertLeaveWord(Integer bId, Admin admin, String cContent) {
		// 先通过bId去找文章
		Article article = articleMapper.selectByPrimaryKey(bId);
		// 首先admin里面已经是有name了
		LeaveWords leaveWord = new LeaveWords();
		// 这个是留言的文本
		leaveWord.setcContent(cContent);
		leaveWord.setcDate(nowDate);
		leaveWord.setcForArticleId(article.getbId().toString());
		leaveWord.setcForName(article.getbAuthor());
		leaveWord.setcId(null);
		leaveWord.setcName(admin.getaName());
		leaveWordsMapper.insert(leaveWord);
		return E3Result.ok();
	}

	@Autowired
	ReplyMapper replyMapper;

	// 回复逻辑

	@Override
	public LeaveWordReplay findReplay(Integer bId) {
//		LeaveWordReplay leaveWordReplay = new LeaveWordReplay();
//
//		// 首先先根据文章的id去找到回复的类
//		LeaveWordsExample example1 = new LeaveWordsExample();
//		// 设置查询条件 //把LeaveWords对象提取出来 
//		Criteria criteria =example1.createCriteria();
//		criteria.andCForArticleIdEqualTo(bId.toString());
//		List<LeaveWords> leaveWordslist = leaveWordsMapper.selectByExample(example1);
//
//		List<LeaveWordReplayAA> xiao = new ArrayList<LeaveWordReplayAA>();
//
//		for (LeaveWords leaveWord : leaveWordslist) {
//			LeaveWordReplayAA leaveWordReplayAA = new LeaveWordReplayAA();
//			leaveWordReplayAA.setLeaveWords(leaveWord);
//
//			// 开始找回复的类 
//			ReplyExample example2 = new ReplyExample();
//			qyt.manageArticle.pojo.ReplyExample.Criteria criteria2 = new qyt.manageArticle.pojo.ReplyExample.Criteria();
//			criteria2.andDForReplyEqualTo(leaveWord.getcId().toString());
//			criteria2.andDForArticleIdEqualTo(bId.toString());
//			List<Reply> replyList = replyMapper.selectByExample(example2);
//			leaveWordReplayAA.setReplyList(replyList);
//
//			// 把这些小的添加到大类里面去
//			xiao.add(leaveWordReplayAA);
//		}
//		leaveWordReplay.setList(xiao);
	return null;
	}

	@Override
	public List<LeaveWordReplayAA> findReplayAA(Integer bId) {
		LeaveWordsExample example1 = new LeaveWordsExample();
		Criteria criteria =example1.createCriteria();
		criteria.andCForArticleIdEqualTo(bId.toString());
		List<LeaveWords> leaveWordslist = leaveWordsMapper.selectByExample(example1);
		
		List<LeaveWordReplayAA> leaveWordReplayAAlist=new ArrayList<LeaveWordReplayAA>();
		
		for (LeaveWords leaveWord : leaveWordslist) {
			LeaveWordReplayAA leaveWordReplayAA = new LeaveWordReplayAA();
			leaveWordReplayAA.setLeaveWords(leaveWord);

			// 开始找回复的类 
			ReplyExample example2 = new ReplyExample();
			qyt.manageArticle.pojo.ReplyExample.Criteria criteriaReply= example2.createCriteria();
			criteriaReply.andDForArticleIdEqualTo(bId.toString());
			criteriaReply.andDForReplyEqualTo(leaveWord.getcId().toString());
			List<Reply> replyList=replyMapper.selectByExample(example2);
			leaveWordReplayAA.setReplyList(replyList);
			
			System.out.println("replyList++++++++++" +replyList);
			leaveWordReplayAAlist.add(leaveWordReplayAA);
		}
		return leaveWordReplayAAlist;
	}

	
	
	
	
	@Override
	public E3Result insertReply(Reply reply) {
		replyMapper.insert(reply);
		return E3Result.ok();
	}

	@Override
	public E3Result updateArticleWhereVerify(Integer bId) {
		ArticleExample example = new ArticleExample();
		qyt.manageArticle.pojo.ArticleExample.Criteria cr=example.createCriteria();
		Article article=new Article();
		article.setbStatus(0);
		article.setbPublish(0);
		article.setbVerify(0);
		cr.andBIdEqualTo(bId);
		// 这里的List显示10条数据
		
		articleMapper.updateByExampleSelective(article,example);
		return E3Result.ok();
	}
	
	
	
	//多篇文章
	@Override
	public E3Result updateManyArticleWhereVerify(List<Article> checkDate,int flag) {
	
		Article article=new Article();
		if(flag==0) {
			article.setbStatus(0);
			article.setbPublish(0);
			article.setbVerify(0);
		}else {
			article.setbStatus(1);
			article.setbPublish(1);
			article.setbVerify(1);
		}
		
		
		for(Article ar:checkDate) {
			ArticleExample example = new ArticleExample();
			qyt.manageArticle.pojo.ArticleExample.Criteria cr=example.createCriteria();
			cr.andBIdEqualTo(ar.getbId());
			articleMapper.updateByExampleSelective(article,example);
		}
		return E3Result.ok();
	}

	@Override
	public E3Result updateArticle(Article article) {
		ArticleExample ar=new ArticleExample();
		//LeaveWordsExample example1 = new LeaveWordsExample();
		//Criteria criteria =example1.createCriteria();
		article.setbDate(nowDate);
		article.setbPublish(1);
		article.setbStatus(1);
		article.setbVerify(1);
		qyt.manageArticle.pojo.ArticleExample.Criteria cr =ar.createCriteria();
		//articleMapper
		cr.andBIdEqualTo(article.getbId());
		articleMapper.updateByExampleSelective(article, ar);
		return E3Result.ok();
	}

	@Override
	public E3Result selectArticleWherebVerify() {
		List<Article> arList=articleMapper.selectArticle1();
		for(Article article:arList) {
			articleMapper.deleteByPrimaryKey(article.getbId());
		}
		
		return E3Result.ok();
	}

	@Override
	public E3Result deleteManyArticle(List<Article> checkDate) {
		for(Article article:checkDate) {
			articleMapper.deleteByPrimaryKey(article.getbId());
		}
		return E3Result.ok();
	}

}
