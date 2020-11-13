
package enumeracion;


public enum Continentes {
    
    AFRICA(53, "Inglés"),
    EUROPA(46, "Francés"),
    ASIA(44, "Chino"),
    AMERICA(34, "Español"),
    OCEANIA(14, "Inglés");
    
    private final int paises;
    private final String idioma;
    
    Continentes(int paises, String idioma) {
        this.paises = paises;
        this.idioma = idioma;
    }
    
    public int getPaises() {
        return this.paises;
    }
    
    public String getIdioma() {
        return this.idioma;
    }
}
