package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    // fake repo only for learning the endpoint implementations
    public void save(Usuario usuario) {
        if (usuario.getId() == null)
            System.out.println("SAVE");
        else
            System.out.println("UPDATE");

        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println("DELETE");
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("FINDALL");

        List<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("ottoni", "senha"));
        lista.add(new Usuario("joao", "senhaDois"));

        return lista;
    }

    public Optional<Usuario> findByName(String username) {
        return this.findAll()
                .stream()
                .filter(x ->
                        x.getLogin().equalsIgnoreCase(username)
                ).findFirst();
    }
}
