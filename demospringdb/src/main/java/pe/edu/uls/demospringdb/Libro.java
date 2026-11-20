package pe.edu.uls.demospringdb;


import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_libro")
    @SequenceGenerator(
        name = "sec_libro",
        sequenceName = "sec_libro",
        allocationSize = 1
    )
    private Integer id;

    @Column(nullable = false, length = 150)
    private String autor;

    @Column(length = 500)
    private String isbn;

    @Column(length = 500)
    private String titulo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
}