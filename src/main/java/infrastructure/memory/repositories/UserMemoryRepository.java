package infrastructure.memory.repositories;

import infrastructure.memory.models.UserMemoryAdapter;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class UserMemoryRepository {
    private static List<UserMemoryAdapter> users = new ArrayList<>();

    static {
        users.add(new UserMemoryAdapter(1l, "Fulano"));
        users.add(new UserMemoryAdapter(2l, "Beltrano"));
    }

    public UserMemoryAdapter findById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().get();
    }
}
