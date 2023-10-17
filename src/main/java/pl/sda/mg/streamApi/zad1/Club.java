package pl.sda.mg.streamApi.zad1;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class Club {
    private Country country;
    private String clubName;
}
