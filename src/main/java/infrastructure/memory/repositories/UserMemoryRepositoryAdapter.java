package infrastructure.memory.repositories;

import core.models.entities.User;
import core.ports.repositories.UserRepositoryPort;
import infrastructure.memory.models.UserMemoryAdapter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class UserMemoryRepositoryAdapter implements UserRepositoryPort {

    private UserMemoryRepository userMemoryRepository;

    @Inject
    public UserMemoryRepositoryAdapter(UserMemoryRepository userMemoryRepository) {
        this.userMemoryRepository = userMemoryRepository;
    }

    @Override
    public User findById(Long id) {
        UserMemoryAdapter userMemoryAdapter = this.userMemoryRepository.findById(id);
        return UserMemoryAdapter.toUser(userMemoryAdapter);
    }
}
