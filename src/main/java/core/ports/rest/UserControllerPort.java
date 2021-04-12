package core.ports.rest;

public interface UserControllerPort<T> {
    T findById(Long id);
}
