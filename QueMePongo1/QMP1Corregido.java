class Prenda {
  TipoPrenda tipo;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;
  Bool prendaFinalizada;

  public Categoria getCategoria(){
    return tipo.getCategoria()
  }

  public Prenda(tipo, material, colorPrincipal, colorSecundario) {
  if(tipo == null) {
    throw new PrendaInvalidaException(
      "Falta el tipo de prenda"
    )
  }
  if(material == null) {
    throw new PrendaInvalidaException(
      "Falta el material"
    )
  }
  if(colorPrimario == null) {
    throw new PrendaInvalidaException(
      "Falta color principal"
    )
  }
  this.tipo = tipo;
  this.material = material;
  this.colorPrincipal = colorPrincipal;
  this.colorSecundario = colorSecundario;
}

public PrendaInvalidaException extends RuntimeException {
  public PrendaInvalidaException(String causa){
    super("La prenda es invalida porque: " + causa)
  }
}
}

enum TipoPrenda{
    Categoria categoria;
    TipoPrenda(categoria);
    ZAPATO(Categoria.CALZADO);
    CAMISA(Categoria.SUPERIOR);
    ...
}

enum Material{
  CUERO, JEAN,...
}

enum Categoria{
    SUPERIOR, INFERIOR, CALZADO, ACCESORIO
  }

class Color {
  String codigo;
}