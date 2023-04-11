package br.com.jamesson.testchatgpt.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompletionRequestDto {
  private String prompt;
  private String model;

  @JsonProperty("max_tokens")
  private int maxTokens;

  private double temperature;

}
