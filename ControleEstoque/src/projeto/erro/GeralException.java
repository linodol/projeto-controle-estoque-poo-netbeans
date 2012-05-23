/**
 *
 */
package projeto.erro;

/**
 * @author DANIEL VALENÇA
 *
 */
public class GeralException extends Exception {

    public GeralException() {
        super();
    }

    public GeralException(String texto) {
        super(texto);
    }

    public GeralException(Exception e) {
        super(e);
    }
}