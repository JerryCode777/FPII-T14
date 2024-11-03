# Proyecto de Concesionario

Este proyecto simula la gestión de un concesionario de autos mediante el uso de conceptos de **programación orientada a objetos (POO)**, como **herencia**, **agregación** y **composición** en Java. El programa incluye clases para manejar autos, empleados (gerentes y vendedores) y el concesionario en sí. A continuación, se explican los conceptos aplicados en el proyecto.

## Diagrama de Clases

![Diagrama de clases UML](ruta_a_la_imagen_del_diagrama)

## Estructura del Proyecto

- `Empleado`: Clase base que representa a cualquier empleado del concesionario.
- `Gerente`: Clase que hereda de `Empleado` y representa al gerente del concesionario.
- `Vendedor`: Clase que también hereda de `Empleado`, pero incluye un atributo adicional `ventas`.
- `Auto`: Representa un auto que el concesionario tiene en su inventario.
- `Concesionario`: Clase principal que agrupa la información de la empresa, sus autos, el gerente y los vendedores.

## Conceptos de Programación Orientada a Objetos

### 1. Herencia

La **herencia** es un principio fundamental de la POO que permite a una clase (clase hija) heredar atributos y métodos de otra clase (clase padre). En este proyecto:

- La clase `Empleado` actúa como clase base, ya que contiene el atributo `nombre` y el método `getNombre()`, comunes a todos los empleados.
- Las clases `Gerente` y `Vendedor` heredan de `Empleado`. De esta forma, `Gerente` y `Vendedor` reutilizan los atributos y métodos de `Empleado`, sin necesidad de redefinirlos. Esto ayuda a reducir la duplicación de código y facilita la extensibilidad.

La herencia permite una mejor organización del código, creando jerarquías que hacen el programa más legible y modular.

### 2. Agregación

La **agregación** es un tipo de relación entre clases en la cual una clase incluye objetos de otra clase como parte de su estado, pero dichos objetos pueden existir independientemente de la clase que los contiene. En este proyecto:

- La clase `Concesionario` tiene una relación de agregación con `Vendedor`. Esto se refleja en el atributo `personal` (una lista de vendedores). La vida de un `Vendedor` no depende de `Concesionario`, es decir, un `Vendedor` podría existir sin estar vinculado a un concesionario específico.
  
La agregación permite que los objetos relacionados se utilicen juntos, sin crear una dependencia de vida entre ellos. En este caso, se pueden agregar o remover vendedores del concesionario sin destruir los objetos `Vendedor`.

### 3. Composición

La **composición** es una relación más fuerte que la agregación, ya que indica una dependencia de vida entre los objetos involucrados. En otras palabras, si la clase contenedora es destruida, también lo son los objetos que contiene. En este proyecto:

- La relación entre `Concesionario` y `Auto` es de composición. Esto se ve en el atributo `autos` (una lista de `Auto`). En este caso, los `Auto` dependen de la existencia de `Concesionario`. Si el concesionario es destruido, los autos también dejan de existir en el contexto de este concesionario.

La composición garantiza que los objetos componentes dependan completamente de la clase que los contiene, lo cual ayuda a modelar relaciones "tiene-un" más estrechas.

## Código de Ejemplo

Aquí hay un fragmento de código que ilustra cómo se han implementado estos conceptos en Java:

```java
// Herencia: Clase base Empleado
class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Herencia: Clase Gerente que extiende Empleado
class Gerente extends Empleado {
    public Gerente(String nombre) {
        super(nombre);
    }
}

// Agregación: Lista de Vendedores en Concesionario
private ArrayList<Vendedor> personal;

// Composición: Lista de Autos en Concesionario
private ArrayList<Auto> autos;
