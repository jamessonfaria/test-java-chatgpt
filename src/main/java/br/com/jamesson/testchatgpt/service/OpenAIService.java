package br.com.jamesson.testchatgpt.service;

import br.com.jamesson.testchatgpt.dto.CompletionRequestDto;
import br.com.jamesson.testchatgpt.dto.CompletionResponseDto;

public interface OpenAIService {
  CompletionResponseDto postCompletion(CompletionRequestDto request, String token);
}
