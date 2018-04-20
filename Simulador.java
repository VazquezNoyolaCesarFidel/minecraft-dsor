public class Simulador{
  public static void main(String [] a){
    Material metal = new Metal();
    Herramienta desarmadorCruz = new Desarmador("De Cruz");
    Pieza clavoDeConcreto = new Clavo(metal,"De Concreto");
    CajaDeHerramientas caja = new CajaDeHerramientas();
    desarmadorCruz.addMaterial(metal);
    desarmadorCruz.addMaterial(metal);
    caja.addPieza(clavoDeConcreto);
    caja.addHerramienta(desarmadorCruz);
    caja.contenido();
    CajaDeHerramientas caja2 = new CajaDeHerramientas();
    caja2.contenido();
  }
}
