package com.example.demo;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private String anotherMessage;

    public void init() {
        message = "Hello World!";
        anotherMessage="中文支持";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=gb2312");
        request.setCharacterEncoding("gb2312");//以上两句用于支持中文
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Page 2</title></head>");
        out.println("<body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h3>"+ anotherMessage+"</h3>");
        out.println("<h3>\n<%! \n out.println(\"hello world. --written by the out.println\");\n %>\n </h3>");// not success
        out.println("</body></html>");
    }

    public void destroy() {
    }
}