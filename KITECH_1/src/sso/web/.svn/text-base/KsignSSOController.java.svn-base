package example.sso.web;

import java.net.InetAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 
 * @author 공통서비스 개발팀 서준식
 * @since 2011. 8. 26.
 * @version 1.0
 * @see
 *
 * <pre>
 * 개정이력(Modification Information) 
 * 
 *   수정일      수정자          수정내용
 *  -------    --------    ---------------------------
 *  2011. 8. 26.    서준식        최초생성
 *  
 *  </pre>
 */
@Controller
public class KsignSSOController {

	
	
	@RequestMapping("/exam/sso/globalLogout.do")
	public void globalLogout(HttpServletRequest request, HttpServletResponse response, @RequestParam("returnURL") String returnURL) throws Exception{
		String serverIp = "";
    	String clientPort = "";
    	
		serverIp = InetAddress.getLocalHost().getHostAddress();
		clientPort = ":" + request.getServerPort();	
    	
    	
    	response.sendRedirect("http://192.168.100.222:7070/egovsso/pmi-logout-url.html?pmi-logout-url=http://192.168.100.222:7070/egovsso/pmi-logout.html&returl=" + "http://" + serverIp + clientPort + returnURL);
		
		
	}
	
	
	@RequestMapping("/exam/sso/loginPostProcess.do")
	public void loginPostProcess(@RequestParam("returnurl")String returnUrl, HttpServletRequest request, HttpServletResponse response)throws Exception{
	
		response.sendRedirect(returnUrl);
	}
}
