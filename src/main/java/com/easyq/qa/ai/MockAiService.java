package com.easyq.qa.ai;

import org.springframework.stereotype.Component;

@Component
public class MockAiService implements AiService {

    @Override
    public String generateAnswer(String question) {

        if (question.toLowerCase().contains("spring boot")) {
            return "Spring Boot is a framework that simplifies building production-ready Spring applications with minimal configuration.";
        }

        if (question.toLowerCase().contains("java")) {
            return "Java is a high-level, object-oriented programming language widely used for building scalable backend applications.";
        }

        return "This is a mock AI-generated answer. Real AI integration can be added easily.";
    }
}
