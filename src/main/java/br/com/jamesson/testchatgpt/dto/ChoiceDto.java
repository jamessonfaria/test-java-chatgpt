package br.com.jamesson.testchatgpt.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChoiceDto {
  private String text;
  private Integer index;

  @JsonProperty("finish_reason")
  private String finishReason;
  
}
