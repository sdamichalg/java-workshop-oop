package pl.sda.mg.streamApi.v2;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Car {
    private String brand;
    private String model;
    private String productionYear;
    private FuelType fuelType;
}
