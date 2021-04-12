package infrastructure.memory.models;

import core.models.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserMemoryAdapter extends User {
    private Long id;
    private String name;

    public static User toUser(UserMemoryAdapter userMemoryAdapter) {
        return new User(userMemoryAdapter.getId(), userMemoryAdapter.getName());
    }
}
