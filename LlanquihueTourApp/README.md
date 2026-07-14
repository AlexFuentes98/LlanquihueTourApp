# LlanquihueTour

## Descripción

LlanquihueTour es una aplicación desarrollada en Java via Intellij Idea para gestionar información de guías turísticos pertenecientes a la agencia "Llanquihue Tour".

El sistema permite cargar información desde un archivo de txt, almacenar los datos en una colección dinámica (`ArrayList`) y realizar operaciones de búsqueda, filtrado y generación de estadísticas mediante consola.

Este proyecto fue desarrollado aplicando conceptos de Programación Orientada a Objetos (POO), composición entre clases, organización modular mediante paquetes y lectura de archivos externos.

---

## Funcionalidades

* Carga de guías turísticos desde un archivo de texto.
* Almacenamiento de objetos utilizando `ArrayList`.
* Búsqueda de guías por nombre.
* Búsqueda de guías por RUT.
* Visualización de todos los registros cargados.
* Filtrado de guías con más de 5 años de experiencia.
* Cálculo del total de guías registrados.
* Cálculo del promedio de años de experiencia.
* Manejo básico de errores mediante `try-catch`.

---

## Estructura del Proyecto

### app

Contiene la clase principal encargada de ejecutar el sistema.

* `Main.java`

### model

Contiene las entidades del sistema.

* `Persona.java`
* `Direccion.java`
* `GuiaTuristico.java`

### service

Contiene la lógica de negocio para gestionar los guías turísticos.

* `GuiaService.java`

### util

Contiene utilidades para lectura y procesamiento de archivos.

* `ArchivoUtil.java`

### data

Contiene los datos utilizados por la aplicación.

* `guias.txt`

---

## Relaciones entre Clases

El proyecto utiliza composición entre clases:

* `Persona` contiene un objeto `Direccion`.
* `GuiaTuristico` hereda de `Persona`.

Esto permite representar de forma adecuada la información de los guías turísticos y sus direcciones.

---

## Archivo de Datos

El sistema lee la información desde el archivo:

```text
src/data/guias.txt
```

Formato de cada registro:

```text
rut;nombre;telefono;calle;numero;ciudad;especialidad;aniosExperiencia
```

Ejemplo:

```text
11.111.111-1;Juan Pérez;987654321;Av. Los Volcanes;120;Llanquihue;Turismo Cultural;8
```

---

## Tecnologías Utilizadas

* Java
* IntelliJ IDEA
* Git
* GitHub

---

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `guias.txt` exista en la carpeta `src/data`.
3. Ejecutar la clase:

```text
app.Main
```

4. El sistema mostrará por consola:

    * Lista de guías.
    * Búsqueda por nombre.
    * Búsqueda por RUT.
    * Guías expertos.
    * Total de guías.
    * Promedio de experiencia.

---

## Autor

Alexander Jovany Fuentes Orellana

Desarrollo Orientado a Objetos I

IP Duoc UC
