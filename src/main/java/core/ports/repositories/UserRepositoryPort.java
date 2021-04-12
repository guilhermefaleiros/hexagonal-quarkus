package core.ports.repositories;

import core.models.entities.User;

public interface UserRepositoryPort {
    User findById(Long id);
}
