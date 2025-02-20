package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin/users")
public class AdminUserController {
    @Autowired
    private UserRepository _repository;

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
