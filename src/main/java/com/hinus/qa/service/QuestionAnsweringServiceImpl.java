package com.hinus.qa.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by hzlidandan1 on 2017/9/20.
 */
@Path(value = "question-answering-service")
public class QuestionAnsweringServiceImpl implements QuestionAnsweringService {
    @Override
    @GET
    @Produces(value = "text/plain")
    public String service() {
        return "QUESTION-ANSWERING";
    }
}
