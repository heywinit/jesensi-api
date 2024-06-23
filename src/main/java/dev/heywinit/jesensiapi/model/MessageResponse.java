package dev.heywinit.jesensiapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class MessageResponse {
    private String message;
    private boolean success;
}
