package qyt.manageArticle.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.springframework.web.multipart.MultipartFile;


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
import qyt.manageArticle.utils.JsonUtils;
import qyt.manageArticle.utils.LayUiPageResult;
import qyt.manageArticle.utils.VerifyCodeUtils;

@Controller
public class KindeditorController {
	
	
	
	@RequestMapping(value="/pic/upload.action")
	@ResponseBody
	public String upload_image(MultipartFile uploadFile) {
		Map map=new HashMap();
		map.put("error", 0);
		map.put("url", "");
		return JsonUtils.objectToJson(map);
	}
	
	
	@RequestMapping(value="index2.action")
	public  String kk() {
		return "index2";
	}

}
