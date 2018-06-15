package com.xupt.edu.ttms.util;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * @author: zhaowanyue
 * @date: 2018/6/4
 * @description:
 */
public class ResponseUtil {
    /**
     * 将数据通过ajax的方式发送到浏览器
     * @param response
     * @param o
     * @throws Exception
     */
    public static void write(HttpServletResponse response, Object o)throws Exception
    {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.println(o.toString());
        out.flush();
        out.close();
    }


}
