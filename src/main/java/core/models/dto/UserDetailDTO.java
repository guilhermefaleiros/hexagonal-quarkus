package core.models.dto;

import core.models.entities.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailDTO {
    private String name;

    public static UserDetailDTO fromEntity(User user) {
        return new UserDetailDTO(user.getName());
    }
}
