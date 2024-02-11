package org.example.hello;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@WebServlet(name = "Hello", urlPatterns ={"/api"})
public class HelloServlet extends HttpServlet {
    private final Logger logger = LoggerFactory.getLogger(HelloServlet.class);
    private static final String NAME_PARAM = "name";
    private static final String LANG_PARAM = "lang";
    private HelloService service;

    /**
     * Servlet container needs it
     */
    @SuppressWarnings("unused")
    public HelloServlet() {
        this(new HelloService());
    }
    HelloServlet(HelloService service) {
        this.service = service;
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Request got " + req.getParameterMap());
        var getName = req.getParameter(NAME_PARAM);
        var getLang = req.getParameter(LANG_PARAM);
                resp.getWriter().write(service.prepareGreeting(getName, getLang));
            }
    }


