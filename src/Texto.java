import java.time.LocalDate;

/**
 * La clase {@code Texto} hereda de la superclase {@code Material}
 *
 * @author jdleiva
 * @version %I% %G%
 */

public class Texto extends Material {
    private String titulo;
    private String nombreAutor;
    private LocalDate fechaPublicacion;
    private int numPaginas;

    /**
     * Instantiates a new Texto.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     */
    public Texto(LocalDate fechaCompra, boolean esRestringido) {
        super(fechaCompra, esRestringido);
    }

    /**
     * Instantiates a new Texto.
     *
     * @param fechaCompra      the fecha compra
     * @param esRestringido    the es restringido
     * @param titulo           the titulo
     * @param nombreAutor      the nombre autor
     * @param idioma           the idioma
     * @param fechaPublicacion the fecha publicacion
     * @param numPaginas       the num paginas
     */
    public Texto(LocalDate fechaCompra, boolean esRestringido, String titulo, String nombreAutor, String idioma,
                 LocalDate fechaPublicacion, int numPaginas) {
        super(fechaCompra, esRestringido, idioma);
        setIdioma(titulo);
        setNombreAutor(nombreAutor);
        setIdioma(idioma);
        setFechaPublicacion(fechaPublicacion);
        setNumPaginas(numPaginas);
    }

    /**
     * Sets titulo.
     *
     * @param titulo the titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Sets nombre autor.
     *
     * @param nombreAutor the nombre autor
     */
    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    /**
     * Sets fecha publicacion.
     *
     * @param fechaPublicacion the fecha publicacion
     */
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * Sets num paginas.
     *
     * @param numPaginas the num paginas
     */
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    /**
     * Gets titulo.
     *
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Gets nombre autor.
     *
     * @return the nombre autor
     */
    public String getNombreAutor() {
        return nombreAutor;
    }

    /**
     * Gets fecha publicacion.
     *
     * @return the fecha publicacion
     */
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Gets num paginas.
     *
     * @return the num paginas
     */
    public int getNumPaginas() {
        return numPaginas;
    }

    public String toString() {
        return "Texto";
    }
}
