package com.easyq.qa.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class QuestionRequest {

    @NotBlank(message = "Question must not be empty")
    @Size(min = 5, max = 500, message = "Question must be between 5 and 500 characters")
    private String question;

    // Getter
    public String getQuestion() {
        return question;
    }

    // Setter
    public void setQuestion(String question) {
        this.question = question;
    }
}
