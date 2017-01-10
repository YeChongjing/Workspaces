package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns={"/index.jsp"},
			initParams={
				@WebInitParam( name="count" , value="0")
			})
public class CounterFilter implements Filter {
	private int count;
    public CounterFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		count++;
		HttpServletRequest req=(HttpServletRequest) request;
		ServletContext context=req.getServletContext();
		context.setAttribute("count",count);
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		String param=fConfig.getInitParameter("count");
		count=Integer.parseInt(param);
	}

}
