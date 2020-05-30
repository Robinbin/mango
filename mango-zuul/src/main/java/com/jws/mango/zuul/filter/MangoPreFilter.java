package com.jws.mango.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.protocol.RequestContent;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Slf4j
public class MangoPreFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 5;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
//        RequestContent ctx = RequestContent.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//        String token = request.getParameter("token");
//        log.info("Token: {}", token);
//        if (token == null) {
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            try{
//                ctx.getResponse().getWriter().writer("There is no request token.");
//            } catch (IOException e){
//                log.error(e.getMessage(), e);
//            }
//            //TODO: need to implement later
//        }

        return null;
    }
}
