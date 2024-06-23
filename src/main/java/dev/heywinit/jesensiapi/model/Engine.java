package dev.heywinit.jesensiapi.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@ToString
@Document(collection = "engine")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Engine {
    @Id
    private String id;
    private String name;
    private String type;

    private String nationalOrigin;
    private List<String> manufacturers;
    private List<String> images;
    private List<String> applications;

    private String numberBuilt;

    private String length;
    private String diameter;
    private String dryWeight;

    private String maxThrust;
    private String thrustToWeight;
    private String overAllPressureRatio;
    private String turbineInletTemperature;

    private String compressor;
    private String combustor;
    private String turbine;
    private String nozzle;
    private String bypassRatio;
}
