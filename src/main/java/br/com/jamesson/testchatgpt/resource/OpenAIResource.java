package br.com.jamesson.testchatgpt.resource;

import br.com.jamesson.testchatgpt.dto.ChatRequestDto;
import br.com.jamesson.testchatgpt.dto.CompletionRequestDto;
import br.com.jamesson.testchatgpt.dto.CompletionResponseDto;
import br.com.jamesson.testchatgpt.service.OpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAIResource {

  @Autowired
  private OpenAIService openaiService;

  @PostMapping(value = "/create/completions", consumes = MediaType.APPLICATION_JSON_VALUE)
  public CompletionResponseDto postCompletion(
      @RequestBody CompletionRequestDto request,
      @RequestHeader String authorization
  ) {
    return openaiService.postCompletion(request, authorization);
  }

  @PostMapping(value = "/create/chat", consumes = MediaType.APPLICATION_JSON_VALUE)
  public String postChat(
      @RequestBody ChatRequestDto request,
      @RequestHeader String authorization
  ) {
    return openaiService.postChat(request, authorization);
  }

}
