package dev.heywinit.jesensiapi.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@ToString()
@Document(collection = "ship")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Ship {
    @Id
    private String id;

    private String name;
    private String role;
    private String type;
    private String status;
    private String nationalOrigin;
    private String numberBuilt;
    private String maxSpeed;
    private String maxRange;

    private String description;

    private Dimensions dimensions;

    private List<String> manufacturers;
    private List<String> primaryUsers;

    private LocalDate launchDate;
    private LocalDate commissionDate;

    private Ship variants;
    private Ship developedFrom;
    private Ship developedInto;

    private List<String> images;

    private String propulsionSystemId;

    @ToString() @Getter @Setter @AllArgsConstructor @NoArgsConstructor
    public static class Dimensions {
        private String length;
        private String beam;
        private String draft;
        private String displacement;
    }
}
