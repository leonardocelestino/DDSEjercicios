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

  public CrearPrendaPrimeraParte(tipo){
    if(tipo == null) {
        throw new PrendaInvalidaException(
          "Falta el tipo de prenda"
        )
      }
      this.tipo = tipo;
      this.prendaFinalizada = false;
  }

  public CrearPrendaSegundaParte(material, colorPrincipal, colorSecundario, trama) {
  
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
  
  this.material = material;
  this.colorPrincipal = colorPrincipal;
  this.colorSecundario = colorSecundario;
  if(material == null) {
    this.trama = Trama.LISA;
  }else{
    this.trama = trama;
  }

  //Si la prenda esta finalizada asumo que es valida. No aclara otra validacion.
  this.prendaFinalizada = true;
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

enum Trama{
    LISA, RAYADA, LUNARES, CUADROS, ESTAMPADO
  }

class Sugerencia{
      Prenda superior;
      Prenda inferior;
      Prenda calzado;

      CrearSugerencia(superior, inferior, calzado){
        if(superior.getCategoria() != SUPERIOR || inferior.getCategoria() != INFERIOR || calzado.getCategoria() != CALZADO) {
            throw new PrendaInvalidaException(
              "No consta de parte superior, inferior y calzado"
            )
          }
      }
      this.superior = superior;
      this.inferior = inferior;
      this.calzado = calzado;

      public SugerenciaInvalidaException extends RuntimeException {
        public SugerenciaInvalidaException(String causa){
          super("La sugerencia es invalida porque: " + causa)
        }
      }
}