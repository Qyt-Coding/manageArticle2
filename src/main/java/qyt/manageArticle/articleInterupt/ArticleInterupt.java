/*
 * package qyt.manageArticle.articleInterupt;
 * 
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse; import
 * javax.servlet.http.HttpSession;
 * 
 * import org.springframework.beans.factory.annotation.Value; import
 * org.springframework.web.servlet.HandlerInterceptor; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * import qyt.manageArticle.pojo.Admin;
 * 
 * public class ArticleInterupt implements HandlerInterceptor{
 * 
 * @Value("${LOGIN_IP}") String LOGIN_IP;
 * 
 * 
 * @Override public boolean preHandle(HttpServletRequest request,
 * HttpServletResponse response, Object handler) throws Exception {
 * 
 * HttpSession session=request.getSession(); Admin admin=(Admin)
 * session.getAttribute("admin");
 * 
 * if(admin==null && admin.getaName().equals("")) {
 * response.sendRedirect(LOGIN_IP); return true; }
 * 
 * return true; }
 * 
 * @Override public void postHandle(HttpServletRequest request,
 * HttpServletResponse response, Object handler, ModelAndView modelAndView)
 * throws Exception { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void afterCompletion(HttpServletRequest request,
 * HttpServletResponse response, Object handler, Exception ex) throws Exception
 * { // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */