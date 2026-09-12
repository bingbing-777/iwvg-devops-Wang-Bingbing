package es.upm.miw.devops.model;

public class User {

    private Long id;
    private String nombre;
    private String email;

    public User() {
    }

    public User(Long id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

}
