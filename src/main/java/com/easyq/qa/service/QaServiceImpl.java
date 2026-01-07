package com.easyq.qa.service;

import com.easyq.qa.ai.AiService;
import com.easyq.qa.dto.AnswerResponse;
import com.easyq.qa.dto.QuestionRequest;
import org.springframework.stereotype.Service;

@Service
public class QaServiceImpl implements QaService {

    private final AiService aiService;

    public QaServiceImpl(AiService aiService) {
        this.aiService = aiService;
    }

    @Override
    public AnswerResponse getAnswer(QuestionRequest request) {
        String question = request.getQuestion();
        String answer = aiService.generateAnswer(question);

        return new AnswerResponse(
                question,
                answer,
                "Mock-AI"
        );
    }
}
