package com.zhang.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/5/27 0027.
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    private List<String> excludeUrls;

    public List<String> getExcludeUrls() {
        return excludeUrls;
    }

    public void setExcludeUrls(List<String> excludeUrls) {
        this.excludeUrls = excludeUrls;
    }

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String requestURI = httpServletRequest.getRequestURI();

        log.info("======>{}",excludeUrls);
        log.info("======>{}",requestURI);
        log.info("======>{}",httpServletRequest.getContextPath());
        log.info("======>{}",httpServletRequest.getRequestURL());
        if (excludeUrls.contains(requestURI) || requestURI.indexOf("/js") > -1) {
            return  true;
        }
        HttpSession session = httpServletRequest.getSession();
        String userName = (String) session.getAttribute("userName");
        if (userName!=null && "zhangsan".equals(userName)) {
           return true;
        }
        httpServletResponse.sendRedirect("/plogin");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
