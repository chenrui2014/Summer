package ren.yale.java.test;

import io.vertx.ext.web.RoutingContext;
import ren.yale.java.interceptor.Interceptor;

/**
 * Yale
 *
 * create at:  2018-02-01 17:24
 **/
public class TestInterceptor implements Interceptor {
    @Override
    public boolean handle(RoutingContext routingContext,Object obj) {
        return false;
    }
}
