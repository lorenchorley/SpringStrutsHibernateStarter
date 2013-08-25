package s2sh.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

public class LocaleAction extends ActionSupport {
    
    private String url;

    public String getUrl() {
        return url;
    }

    public String execute() {
        url="/";
        HttpServletRequest request = ServletActionContext.getRequest();
        
        Enumeration<String> header = request.getHeaderNames();
        System.out.println("request.getHeaderNames(): ");
        while (header.hasMoreElements()) {
            System.out.println(header.nextElement());
        }
        System.out.println("request.getRequestURL(): " + request.getRequestURL());
        System.out.println("request.getRequestURI(): " + request.getRequestURI());
        return "redirect";
    }

}