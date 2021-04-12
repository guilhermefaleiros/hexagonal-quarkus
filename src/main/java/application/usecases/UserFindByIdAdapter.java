package application.usecases;

import core.models.dto.UserDetailDTO;
import core.models.entities.User;
import core.ports.repositories.UserRepositoryPort;
import core.ports.usecases.UserFindByIdPort;
import infrastructure.memory.repositories.UserMemoryRepositoryAdapter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class UserFindByIdAdapter implements UserFindByIdPort {

    private UserRepositoryPort userRepository;

    @Inject
    public UserFindByIdAdapter(UserMemoryRepositoryAdapter userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetailDTO execute(Long id) {
        User user = this.userRepository.findById(id);
        return UserDetailDTO.fromEntity(user);
    }
}
