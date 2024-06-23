package dev.heywinit.jesensiapi;

import dev.heywinit.jesensiapi.model.MessageResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JesensiApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(JesensiApiApplication.class, args);
    }

    @GetMapping("/status")
    public ResponseEntity<MessageResponse> hello() {
        return ResponseEntity.ok(new MessageResponse("Server is running", true));
    }
}
