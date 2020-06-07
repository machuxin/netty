package com.machuxin.io.bio.tomcat.http;

/**
 * Created by Tom on 2019/6/15.
 */
public abstract class DMServlet {
    public void service(DMRequest request, DMResponse response) throws Exception{
        if("GET".equalsIgnoreCase(request.getMethod())){
            doGet(request,response);
        }else{
            doPost(request,response);
        }
    }

    public abstract void doGet(DMRequest request, DMResponse response) throws Exception;
    public abstract void doPost(DMRequest request, DMResponse response) throws Exception;
}
