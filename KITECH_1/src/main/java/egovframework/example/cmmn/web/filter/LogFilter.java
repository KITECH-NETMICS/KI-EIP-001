package egovframework.example.cmmn.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogFilter implements Filter {
	private static final Logger Logger = LoggerFactory.getLogger(LogFilter.class);
	
    @Override
    public void init(
            FilterConfig filterConfig
    ) throws ServletException {
        Logger.info("LogFilter init()");
    }

    @Override
    public void destroy() {
    	Logger.info("LogFilter destroy()");
    }

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain
    ) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String requestURI = req.getRequestURI();
        Logger.info("[{}] LogFilter doFilter Start", requestURI);

        try {
            chain.doFilter(request, response);
        } finally {
            Logger.info("[{}] LogFilter doFilter End", requestURI);
        }
    }
}