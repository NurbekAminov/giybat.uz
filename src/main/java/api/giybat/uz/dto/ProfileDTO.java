package api.giybat.uz.dto;

import api.giybat.uz.enums.GeneralStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ProfileDTO {
    private String name;
    private String username;
    private String password;
    private GeneralStatus status;
    private Boolean visible;
    private LocalDateTime createdDate;
}
