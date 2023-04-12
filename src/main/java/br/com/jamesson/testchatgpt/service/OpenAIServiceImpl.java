package br.com.jamesson.testchatgpt.service;

import br.com.jamesson.testchatgpt.client.OpenAIAPIClient;
import br.com.jamesson.testchatgpt.dto.ChatRequestDto;
import br.com.jamesson.testchatgpt.dto.CompletionRequestDto;
import br.com.jamesson.testchatgpt.dto.CompletionResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpenAIServiceImpl implements OpenAIService {

  @Autowired
  private OpenAIAPIClient openAIAPIClient;

  @Override
  public CompletionResponseDto postCompletion(CompletionRequestDto request, String token) {

    return openAIAPIClient.postCompletion(request, token);
  }

  @Override
  public String postChat(ChatRequestDto request, String token) {
    return openAIAPIClient.postChat(request, token);
  }

}
