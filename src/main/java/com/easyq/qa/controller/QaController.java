package com.easyq.qa.controller;

import com.easyq.qa.dto.AnswerResponse;
import com.easyq.qa.dto.QuestionRequest;
import com.easyq.qa.service.QaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/qa")
public class QaController {

    private final QaService qaService;

    public QaController(QaService qaService) {
        this.qaService = qaService;
    }

    @PostMapping("/ask")
    public ResponseEntity<AnswerResponse> askQuestion(
            @Valid @RequestBody QuestionRequest request
    ) {
        AnswerResponse response = qaService.getAnswer(request);
        return ResponseEntity.ok(response);
    }
}
