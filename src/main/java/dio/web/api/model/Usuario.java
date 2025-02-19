package dio.web.api.model;


import dio.web.api.handler.BusinessException;

public class Usuario {
    private Integer id;
    private String login;
    private String password;

    public Usuario(){ }

    public Usuario(String login, String password){
        this.login = login;
        this.password = password;
    }

    public void Validate() {
        if (this.login.isBlank())
            throw new BusinessException("login é obrigatório!");

        if (this.password.isBlank())
            throw new BusinessException("password é obrigatório!");
    }

    @Override
    public String toString() {
        return "User { login='" + this.getLogin() + "', password='" + this.getPassword() + "' }";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        if (this.id == null)
            return 0;
        return this.id;
    }
}
