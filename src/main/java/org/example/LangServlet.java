package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@WebServlet(name = "Lang", urlPatterns = {"/api/langs"})
public class LangServlet extends HttpServlet {
    private final Logger logger = LoggerFactory.getLogger(LangServlet.class);
    private LangRepository langRepository;
    private ObjectMapper mapper;

    /**
     * Servlet container needs it
     */
    @SuppressWarnings("unused")
    public LangServlet() {
        this(new LangRepository(), new ObjectMapper());
    }

    LangServlet(LangRepository langRepository, ObjectMapper mapper) {
        this.langRepository = langRepository;
        this.mapper = mapper;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Request got " + req.getParameterMap());
        resp.setContentType("application/json;charset=UTF-8");
        mapper.writeValue(resp.getOutputStream(), langRepository.findAll());
    }
}


