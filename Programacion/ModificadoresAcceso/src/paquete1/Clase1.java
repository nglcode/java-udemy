
package paquete1;


class Clase1 {
    
    private String atributoPrivate = "Valor atributo private";

    private Clase1() {
        System.out.println("Constructor private");
    }
    

    
    public Clase1(String arg) {
        this();
        System.out.println("Constructor público");
    }
    
    private void metodoPrivate() {
        System.out.println("Metodo private");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
    
    
}
