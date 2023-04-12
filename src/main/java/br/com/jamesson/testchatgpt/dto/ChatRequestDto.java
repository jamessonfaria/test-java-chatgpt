package br.com.jamesson.testchatgpt.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatRequestDto {
  private String model;
  private List<MessageDto> messages;

  @JsonProperty("max_tokens")
  private int maxTokens;

  private double temperature;

}
