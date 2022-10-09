package Pizzaria;

/**
 *
 * @author Ayumi
 */
public abstract class Pizza {
    public abstract double cost();

    public abstract String getDescricao();

    public String getGenerico() {
	return this.getClass().getName();
    }
}
