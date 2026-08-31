package com.smit.eclat_ai.entity;

import com.smit.eclat_ai.enums.MessageRole;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    ChatSession chatSession;

    String content;

    MessageRole role;

    String toolCalls;                  //JSON Array of Tools Called

    Integer tokensUsed;

    Instant createdAt;

}
