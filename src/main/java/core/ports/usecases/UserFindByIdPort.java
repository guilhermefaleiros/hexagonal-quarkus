package core.ports.usecases;

import core.models.dto.UserDetailDTO;

public interface UserFindByIdPort {
    UserDetailDTO execute(Long id);
}
