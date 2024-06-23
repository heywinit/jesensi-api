package dev.heywinit.jesensiapi.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@ToString()
@Document(collection = "aircraft")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Aircraft {
    @Id
    private String id;

    private String name;
    private String role;
    private String status;
    private String nationalOrigin;
    private String numberBuilt;
    private String maxSpeed;
    private String maxRange;

    private String description;

    private Dimensions dimensions;

    private List<String> manufacturers;
    private List<String> primaryUsers;

    private LocalDate firstFlight;
    private LocalDate introduction;

    private Aircraft variants;
    private Aircraft developedFrom;
    private Aircraft developedInto;

    private List<String> images;

    @ToString() @Getter @Setter @AllArgsConstructor @NoArgsConstructor
    public static class Dimensions {
        private String length;
        private String wingspan;
        private String height;
        private String wingArea;
        private String aspectRatio;
        private String emptyWeight;
        private String grossWeight;
        private String ceiling;
    }
}