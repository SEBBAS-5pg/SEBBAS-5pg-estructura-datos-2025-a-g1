# 🧠 Programación Orientada a Objetos (POO) en Java

La **Programación Orientada a Objetos (POO)** es un paradigma de programación que se basa en el uso de "objetos", los cuales son instancias de clases. Este enfoque busca modelar el mundo real utilizando estructuras lógicas.

## 🔗 Pilares de la POO
|Pilar|¿Que permite?|
|-----|-------------|
|Herencia|Reutilización de código y extensión de funcionalidades.|
|Encapsulamiento|Protección y control de acceso a los datos.|
|Polimorfismo|Comportamientos diferentes para un mismo método.|
|Abstracción|Definir estructuras base sin detalles de implementación.|
---

## 🧬 1. Herencia

La **herencia** permite que una clase (subclase o clase hija) herede atributos y métodos de otra clase (superclase o clase padre).

### 📌 Ejemplo:

```java
public class Persona {
    private String nombre;
    private String correo;

    public void Mostrar() {
        this.nombre = "Diana";
        this.correo = "diana@corhuila.edu.co";
        System.out.println("Nombre: " + this.nombre + "\nCorreo: " + this.correo);
    }
}

public class Estudiante extends Persona {
    // Nuevos atributos o métodos
}

public class Profesor extends Persona {
    // Nuevos atributos o métodos
}
```
---
## 🔐Encapsilamiento
El encapsulamiento protege los datos de un objeto ocultando su implementación interna. Se accede a los atributos mediante métodos públicos get y set.
### 📌 Ejemplo:
```java
public class Persona {
    private String nombre;
    private String correo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void Mostrar() {
        System.out.println("Nombre: " + this.getNombre() + "\nCorreo: " + this.getCorreo());
    }
}
```
---
## 🌀Polimorfismo
El polimorfismo permite que una clase hija redefina métodos de la clase padre, otorgándoles un comportamiento diferente.
### 📌 Ejemplo:
```java
public class Estudiante extends Persona {
    @Override
    public void Mostrar() {
        System.out.println("Estudiante: " + this.getNombre() + " - email: " + this.getCorreo());
    }
}

public class Profesor extends Persona {
    @Override
    public void Mostrar() {
        System.out.println("Profesor: " + this.getNombre() + " - email: " + this.getCorreo());
    }
}
```
---
## 🧩Abstraccion
La abstracción permite definir clases base que no deben instanciarse directamente. Se usan como modelos para clases más específicas.
### Ejemplo
```java
public abstract class Persona {
    private String nombre;
    private String correo;

    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCorreo(String correo) { this.correo = correo; }

    public abstract void Mostrar();
}
```
```java
public class Estudiante extends Persona {
    private String codigo;

    public void setCodigo(String codigo) { this.codigo = codigo; }

    @Override
    public void Mostrar() {
        System.out.println("Estudiante: " + codigo + " - " + getNombre() + " - email: " + getCorreo());
    }
}
```
