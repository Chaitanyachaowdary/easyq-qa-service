package com.easyq.qa.dto;

public class AnswerResponse {

    private String question;
    private String answer;
    private String source;

    public AnswerResponse(String question, String answer, String source) {
        this.question = question;
        this.answer = answer;
        this.source = source;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getSource() {
        return source;
    }
}
