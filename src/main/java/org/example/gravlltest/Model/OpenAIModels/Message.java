package org.example.gravlltest.Model.OpenAIModels;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Data
@JsonSerialize
public  class Message {
    private String role;
    private String content;

}