# Historia de la Computación y Lenguajes de Programación

## 🖥️ Evolución de la Computadora

1. **¿La primera computadora?**
   - **Ábaco**: Considerado el primer dispositivo de cálculo, usado hace miles de años.
   - **Primeras computadoras electrónicas**: Grandes, costosas, poco eficientes. Limitadas en capacidad de procesamiento.
   - **Década de 1960**: Se empieza a hablar de *Inteligencia Artificial*.
   - **Años 90**:
     - Las computadoras personales (desktops) se popularizan a partir de 1995.
     - También surgen los primeros teléfonos móviles (básicos) desde mediados de los 90.
   - **2000**: Aparición y masificación de las laptops.
   - **2007**: Lanzamiento del primer *smartphone* moderno (iPhone), marcando el inicio de la computación móvil avanzada.
   - **Presente y futuro**: Automatización avanzada y desarrollo de Inteligencia Artificial más fuerte y sofisticada.

---

## 💻 Lenguajes de Programación

### Niveles de Lenguaje

1. **Lenguaje Máquina**
   - Binario (0 y 1), directamente ejecutado por el procesador.

2. **Lenguaje Ensamblador**
   - Más cercano al hardware. Usa instrucciones simbólicas representadas por mnemónicos (ej. `MOV`, `ADD`).

3. **Lenguajes de Alto Nivel**
   - Más fáciles de entender para los humanos.
   - Requieren **compiladores** o **intérpretes** para ser traducidos a lenguaje máquina.

### Ejemplos de Lenguajes de Alto Nivel

- `C`
- `C++`
- `Java`
- `JavaScript`
- `Python`
- `C#`
- `Ruby`
- `Kotlin`
- `PHP`

> 🔤 Todos estos lenguajes usan estructuras similares al inglés y aplican **operadores** para realizar tareas.

---

## ➕ Operadores Comunes

### 1. Operadores Aritméticos

| Operador | Descripción      |
|----------|------------------|
| `+`      | Suma             |
| `-`      | Resta            |
| `*`      | Multiplicación   |
| `/`      | División         |
| `%`      | Módulo (residuo) |
| `^`      | Potencia (en algunos lenguajes) |

---

### 2. Operadores Relacionales

| Operador | Significado               |
|----------|---------------------------|
| `>`      | Mayor que                 |
| `>=`     | Mayor o igual que         |
| `<`      | Menor que                 |
| `<=`     | Menor o igual que         |
| `!=`     | Distinto de               |
| `==`     | Igual a (en varios lenguajes) |

---

### 3. Operadores Lógicos

#### `AND` (&& o `and`)
| A | B | A AND B |
|---|---|----------|
| T | T | T        |
| T | F | F        |
| F | T | F        |
| F | F | F        |

#### `OR` (|| o `or`)
| A | B | A OR B |
|---|---|---------|
| T | T | T       |
| T | F | T       |
| F | T | T       |
| F | F | F       |

#### `NOT` (!)
| A | NOT A |
|---|--------|
| T | F      |
| F | T      |

---

## 🔎 Ejemplo Lógico: Mayor de Edad

> Se sabe que una persona es mayor de edad **si y solo si** tiene **18 años o más**.

```java
let edad = 20;
if (edad >= 18 && edad <= 130) {
  console.log("Es mayor de edad");
} else {
  console.log("No es mayor de edad o edad inválida");
}
```
