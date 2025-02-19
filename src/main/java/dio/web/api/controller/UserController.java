package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserRepository _repository;

    @GetMapping
    public List<Usuario> getUsers() {
        return _repository.findAll();
    }

    @GetMapping("/{username}")
    public Optional<Usuario> getByName(@PathVariable("username") String username) {
        return _repository.findByName(username);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        _repository.deleteById(id);
    }

    @PostMapping
    public void postUser(@RequestBody Usuario usuario) {
        usuario.Validate();
        _repository.save(usuario);
    }
}
