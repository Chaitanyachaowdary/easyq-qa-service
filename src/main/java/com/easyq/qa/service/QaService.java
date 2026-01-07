package com.easyq.qa.service;

import com.easyq.qa.dto.AnswerResponse;
import com.easyq.qa.dto.QuestionRequest;

public interface QaService {

    AnswerResponse getAnswer(QuestionRequest request);
}
