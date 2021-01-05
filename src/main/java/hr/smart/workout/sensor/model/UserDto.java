package hr.smart.workout.sensor.model;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDto {

    private Long id;

    @NotNull(groups = Registration.class)
    private String username;
    @NotNull(groups = Registration.class)
    @Pattern(regexp="[^\\$2[ayb]\\$.{56}$]", groups = Registration.class)
    private String password;
    @NotNull(groups = Registration.class)
    private String firstName;
    @NotNull(groups = Registration.class)
    private String lastName;
    @NotNull(groups = Registration.class)
    private String email;
    private String apartment;
    @NotNull(groups = Registration.class)
    private String street;
    @NotNull(groups = Registration.class)
    private String town;
    @NotNull(groups = Registration.class)
    private String country;

    private LocalDateTime createTimestamp;
    private LocalDateTime updateTimestamp;

    public interface Registration {
    }

}