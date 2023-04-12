package br.com.jamesson.testchatgpt.dto;

import lombok.Data;

@Data
public class MessageDto {
  private String content;
  private String role;
}
