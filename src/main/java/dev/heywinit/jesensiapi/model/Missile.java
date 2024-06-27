package dev.heywinit.jesensiapi.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@ToString()
@Document(collection = "missile")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Missile {
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

    private LocalDate firstFlight;
    private LocalDate introduction;

    private Missile variants;
    private Missile developedFrom;
    private Missile developedInto;

    private List<String> images;

    private String warheadId;
    private String propulsionId;

    @ToString() @Getter @Setter @AllArgsConstructor @NoArgsConstructor
    public static class Dimensions {
        private String length;
        private String diameter;
        private String launchWeight;
    }
}
