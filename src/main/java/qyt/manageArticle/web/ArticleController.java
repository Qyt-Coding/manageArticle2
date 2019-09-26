package qyt.manageArticle.web;

import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.pool.PreparedStatementPool.MethodType;

import qyt.manageArticle.mapper.ReplyMapper;
import qyt.manageArticle.newPojo.LeaveArticleNew;
import qyt.manageArticle.newPojo.LeaveWordReplayAA;
import qyt.manageArticle.pojo.Admin;
import qyt.manageArticle.pojo.Article;
import qyt.manageArticle.pojo.Reply;
import qyt.manageArticle.service.ArticleService;
import qyt.manageArticle.service.SsoService;
import qyt.manageArticle.utils.E3Result;
import qyt.manageArticle.utils.EasyUIDataGridResult;
import qyt.manageArticle.utils.LayUiPageResult;
import qyt.manageArticle.utils.VerifyCodeUtils;

@Controller
@RequestMapping(value = "/article")
public class ArticleController {
	@Autowired
	ArticleService articleServiceImpl;
	//这个是发布文章的
	@RequestMapping(value = "/toArticleWrite.action")
	public String toArticleWrite( Integer bId,
			HttpServletRequest request) {
		
		System.out.println(bId);
		Article article=  articleServiceImpl.selectArticle(bId);
		//当flag为0的时候是发布，1为编辑
		int flag=0;
		if(bId!=null)
		{
			flag=1;
		}
		
		request.setAttribute("article", article);
		request.setAttribute("flag", flag);
		return "article/articleWrite";
	}

	
	  //这个是编辑文章的
	  @RequestMapping(value = "/editorArticle.action",method=RequestMethod.POST)
	  @ResponseBody
	  public E3Result editorArticle(Article article) {
		  System.out.println(article+"                               article");
	  return  articleServiceImpl.updateArticle(article);
	  }
	 
	
	
	@RequestMapping(value = "/toArticleList.action")
	public String toArticleList(Model model) {
		// 从首页进去的的page和rows都是1
		/*
		 * int page =1; int rows =10; EasyUIDataGridResult
		 * pageRows=articleServiceImpl.articleList(page, rows); //传给前台
		 * model.addAttribute("pageRows",pageRows );
		 */

		return "article/articleList";
	}

	@RequestMapping(value = "/toArticleTrash.action")
	public String toArticleTrash() {
		return "article/articleTrash";
	}

	@RequestMapping(value = "/articlePublished.action",method=RequestMethod.POST)
	@ResponseBody
	public E3Result articlePublished(Article article) {
		return articleServiceImpl.articlePublished(article);
	}

	@RequestMapping(value = "/demo/table/item.action")
	@ResponseBody
	public LayUiPageResult pageShow(Integer page, @RequestParam Integer limit) {
		int flag=1;
		return articleServiceImpl.articleList(page, limit,flag);
	}
	
	@RequestMapping(value = "/demo/table/item2.action")
	@ResponseBody
	public LayUiPageResult pageTrash(Integer page, @RequestParam Integer limit) {
		int flag=0;
		return articleServiceImpl.articleList(page, limit,flag);
	}
	

	// 这里的bId是文章的Id
	@RequestMapping(value = "/{bId}.action")
	public String toArticleView(@PathVariable Integer bId, HttpServletRequest request) {
		Article article = articleServiceImpl.selectArticle(bId);
		request.setAttribute("article", article);
		
		List<LeaveWordReplayAA> leaveWordReplayAAlist= articleServiceImpl.findReplayAA(bId);
		request.setAttribute("leaveWordReplayAAlist", leaveWordReplayAAlist);
		System.out.println(leaveWordReplayAAlist  +"  ss");
		
		
		return "article/articleView";
	}

	@RequestMapping(value = "/leaveWord.action",method=RequestMethod.POST)
	@ResponseBody
	public E3Result toLeaveWord(LeaveArticleNew lea, HttpSession session) {
		
		 Integer bId=lea.getbId();
		 String cContent=lea.getcContent();
		Admin admin = (Admin) session.getAttribute("admin");
		
		//下面开始写回复的代码  
		System.out.println(cContent +"     cContent");
		
		if (admin == null) {
			admin = new Admin();
			admin.setaName("lq");
		}
		return articleServiceImpl.insertLeaveWord(bId, admin, cContent);
	}
	
	
	
	
	@RequestMapping(value = "/reply.action")
	@ResponseBody
	public E3Result toReply(Reply reply) {
		System.out.println(reply+"                  reply");
		return articleServiceImpl.insertReply(reply);
	}
	
	//删除一篇文章
	@RequestMapping(value = "/updateArticleWhereVerify.action")
	@ResponseBody
	public E3Result updateArticleWhereVerify(Integer bId) {
		return articleServiceImpl.updateArticleWhereVerify( bId);
	}

	//删除多篇文章
	@RequestMapping(value = "/updateManyArticleWhereVerify.action")
	@ResponseBody
	public E3Result updateManyArticleWhereVerify(@RequestBody List<Article> checkDate) {
		int flag=0;
		return articleServiceImpl.updateManyArticleWhereVerify( checkDate,flag);
	}
	
	//还原除多篇文章
	@RequestMapping(value = "/updateManyArticleWhereVerify1.action",method = RequestMethod.POST)
	@ResponseBody
	public E3Result updateManyArticleWhereVerify1(@RequestBody List<Article> checkDate) {
		int flag=1;
		return articleServiceImpl.updateManyArticleWhereVerify( checkDate,flag);
	}
	
	@RequestMapping(value = "/deleteAll.action",method = RequestMethod.POST)
	@ResponseBody
	public E3Result  deleteManyArticle(@RequestBody List<Article> checkDate) {
		return articleServiceImpl.deleteManyArticle(checkDate);
	}
}
