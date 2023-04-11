package br.com.jamesson.testchatgpt.dto;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class CompletionResponseDto {

  private String id;
  private String object;
  private LocalDate created;
  private String model;
  private List<ChoiceDto> choices;

}
