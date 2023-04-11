package br.com.jamesson.testchatgpt.client;

import br.com.jamesson.testchatgpt.dto.CompletionRequestDto;
import br.com.jamesson.testchatgpt.dto.CompletionResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "openai", url = "https://api.openai.com/v1", configuration = FeignConfig.class)
public interface OpenAIAPIClient {

  @PostMapping(value = "/completions", headers = "Content-Type: application/json")
  CompletionResponseDto postCompletion(
      @RequestBody CompletionRequestDto request,
      @RequestHeader("Authorization") String token
  );

}

