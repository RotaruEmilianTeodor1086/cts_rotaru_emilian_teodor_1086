package ro.ase.cts.composite.clase;

public interface ComponentaAbstracta {
    public void printareElement();
    public void adaugaNod(ComponentaAbstracta componentaAbstracta);
    public void stergeNod(ComponentaAbstracta componentaAbstracta);
    public ComponentaAbstracta getNod(int pozitie);
}
