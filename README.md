¡Excelente iniciativa! Practicar con un escenario distinto pero con la misma estructura técnica es la mejor forma de asegurar que has comprendido el patrón y no solo memorizado el código.

Aquí tienes un enunciado "espejo" diseñado para prepararte para ese examen, manteniendo la misma complejidad y requisitos técnicos.

---

# 🏨 Sistema de Gestión – Complejo Hotelero "EcoResort"

## 🎯 Objetivo

Aplicar el patrón de gestión de inventarios/personal utilizando:

* Clases, objetos y composición.
* **Arrays unidimensionales de tamaño fijo** (100% obligatorio).
* Lógica de búsqueda y control de huecos libres.
* Documentación Javadoc y buenas prácticas.

## 📖 Escenario

Un complejo hotelero de lujo necesita un sistema para gestionar sus **habitaciones**. El hotel tiene un límite estricto de **20 habitaciones** en su ala principal.

Cada **Habitacion** se define por:

* `numero` (int) - Identificador único.
* `tipo` (String) - Ej: "Suite", "Doble", "Individual".
* `precioNoche` (double).
* `estaOcupada` (boolean).

---

## 🧩 Requisitos técnicos

### 1️⃣ Clase `Habitacion`

* Atributos privados.
* Constructor completo.
* Métodos getters y **setters** (necesarios para cambiar el estado de ocupación).
* Método `toString()`.
* **Javadoc** completo en clase y métodos.

### 2️⃣ Clase `Hotel`

#### Atributos

```java
private Habitacion[] inventario;
private final int MAX_HABITACIONES;

```

#### Constructor

* Debe recibir el tamaño máximo por parámetro.
* Debe validar que el tamaño sea un número positivo.

#### Métodos obligatorios

* `public Habitacion buscarHabitacion(int numero)`: Busca por número de habitación.
* `private int encontrarPosicionLibre()`: Devuelve el primer índice `null`.
* `public boolean darDeAltaHabitacion(Habitacion h)`: Registra si hay hueco y el número no está duplicado.
* `public String listarHabitaciones()`: Retorna un String con la info de todas las habitaciones no nulas.
* `public int contarHabitacionesDisponibles()`: Cuenta cuántas habitaciones del array **no** están ocupadas (`estaOcupada == false`).

---

## 🛠️ Ampliación (Nivel Avanzado)

Si quieres bordar el examen, implementa estas funciones adicionales:

1. **Eliminación física:**
`public Habitacion eliminarHabitacion(int numero)`
Busca la habitación, la extrae del array (pone esa posición a `null`) y devuelve el objeto eliminado.
2. **Mantenimiento:**
`public void liberarTodasLasHabitaciones()`
Recorre el array y cambia el atributo `estaOcupada` a `false` en todas las habitaciones existentes.
3. **Ordenación:**
`public void ordenarPorPrecioDescendente()`
Ordena el array de mayor a menor precio. **Cuidado:** debes gestionar los valores `null` para que queden siempre al final del array y no lancen una `NullPointerException`.

---

## 🖥️ Tarea para la Clase Main

1. Instancia el `Hotel` con capacidad para 20.
2. Crea 4 objetos `Habitacion` (mezcla tipos y precios).
3. Registra las habitaciones en el hotel.
4. Intenta registrar una habitación con un número (`id`) que ya exista para probar la validación.
5. Muestra el listado completo por consola.
6. Busca la habitación número 105 y muestra sus detalles.

---

### 💡 Un consejo de "compañero":

Cuando implementes el método de búsqueda o registro, recuerda siempre la regla de oro: **Primero pregunta si la posición es `null` antes de preguntar por sus datos.**

```java
if (inventario[i] != null && inventario[i].getNumero() == numero) { ... }

```

¿Te gustaría que te ayude a estructurar el esqueleto de la clase `Hotel` o prefieres intentar escribir el código completo primero?
