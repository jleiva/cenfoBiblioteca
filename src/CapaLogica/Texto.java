package CapaLogica;

import java.time.LocalDate;

/**
 * La clase {@code CapaLogica.Texto} hereda de la superclase {@code CapaLogica.Material}
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
     * Instantiates a new CapaLogica.Texto.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     * @param tema          the tema
     */
    public Texto(String id, LocalDate fechaCompra, boolean esRestringido, String tema) {
        super(id, fechaCompra, esRestringido, tema);
    }

    /**
     * Instantiates a new CapaLogica.Texto.
     *
     * @param fechaCompra      the fecha compra
     * @param esRestringido    the es restringido
     * @param titulo           the titulo
     * @param nombreAutor      the nombre autor
     * @param tema             the tema
     * @param idioma           the idioma
     * @param fechaPublicacion the fecha publicacion
     * @param numPaginas       the num paginas
     */
    public Texto(String id, LocalDate fechaCompra, boolean esRestringido, String titulo, String nombreAutor,
                 String tema, String idioma, LocalDate fechaPublicacion, int numPaginas) {
        super(id, fechaCompra, esRestringido, tema, idioma);
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
        return "CapaLogica.Texto";
    }
}
