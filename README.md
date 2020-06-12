# Examen Tema 4 Entornos de Desarrollo - 1DAW

***Refactorización, Documentación y control de versiones***

El examen se divide en 3 bloques claramente diferenciados: Refactorización, Documentación y control de versiones. Cada uno de ellos con una puntuación sobre 10. **Para dar por superado el RA relacionado con el tema 4, se deben aprobar las 3 partes**.

En cada apartado se indica la puntuación y que parte corresponden. las 3 se puntúan sobre 10

Sigue detalladamente las instrucciones del examen. Cualquier duda, pregunta a tu profesor.

1. En el repositorio tienes en código fuente que será la base sobre la cual desarrollaremos el examen. Dividiremos el examen en 3 partes, y las utilizaremos para desarrollar las versiones de git y github. Evidentemente, usaremos las buenas prácticas de git y github que hemos estado trabajando durante el curso

### Ramas y Merge I

1. Para el workflow del examen, utilizaremos las siguientes ramas: desarrollo, refactorización, documentación. Crealas cuando se te indique.

2. Crea la rama "desarrollo"

## Refactorización

3. Crea la rama "refactorizacion" a partir de la rama desarrollo y cambiate a esa rama ***(CV - 0.125 puntos)***

4. Haz las refactorizaciones que necesites para que "Miau" sea un campo de la clase Gato llamado "maulla". Compromete el estado actual con el mensaje "Refactorizacion 1 Gato - Nombre y Apellidos" ***(RF - 4 puntos)***
   
5. Compromete el estado actual con el mensaje "Refactorizacion 1 Perro - Nombre y Apellidos" ***(CV - 0.125 puntos)***

6. Extrae una superclase a partir de la clase "Estudiante" llamada "Persona" con los campos:

   1. nombre
   2. apellidos
   3. nif

   y los métodos

   1. getNombre(), setNombre()
   2. getApellidos(), setApellidos()
   3. getNif(), setNif()

7. Compromete el estado actual con el mensaje "Refactorizacion 2 Superclase Persona - Nombre y Apellidos". ***(RF - 6 puntos)***

8. Fusiona la rama "refactorizacion" en la rama "desarrollo" ***(CV - 0.25 puntos)***

## Documentación

8. Crea la rama "documentacion" a partir de la rama desarrollo y cambiate a esa rama ***(CV - 0.125 puntos)***

9. Documenta en Javadoc las clases y las funciones para que aparezcan sus descripciones, autor, y descripción de los parámetros y devoluciones de cada método. Compromete el estado actual con el mensaje "Documentación 1 - Nombre y Apellidos" ***(DOC - 6 puntos)***

10. Genera el Javadoc y Guárdalo en tu repositorio en una carpeta que se llame "doc". Compromete el estado actual con el mensaje "Documentación 2 Javadoc - Nombre y Apellidos" ***(DOC - 4 puntos)***

## Control de Versiones

### Pull Request

11. Abre un pull request llamado "añadir javadoc" para añadir los cambios de la rama "documentación" en la rama "desarrollo" ***(CV - 0.25 puntos)***

12.  Realiza lo siguiente en el pull request:  ***(CV - 1 punto)***

   1. Añade a tu profesor como Reviewers
   2. Asignate el pull request
   3. Aplica al pull request el label documentation
   4. Crea el milestone "examen"

    
13.  Incorpora los cambios a la rama desarrollo y Comenta y cierra el pull request a la vez con el siguiente mensaje y referenciando a tu profesor al final: "Refactorizando y añadiendo documentación" ***(CV - 0.5 puntos)***

### Fork y Pull Request

14.  Actualiza tu repositorio, si no lo has hecho ya.

15.  Realiza un fork del repositorio del examen a tu cuenta de github. ***(CV - 0.5 puntos)***

16.  En el repositorio forkado, crea una rama a partir de la rama desarrollo llamada "add_title" y modifica la etiqueta title del index.html con tu nombre y apellidos

17.  Compromete los cambios con la etiqueta "pull request add title Nombre y apellidos" ***(CV - 0.25 puntos)***

18.  Realiza un pull request de la rama **add_title** de tu repositorio forkado sobre la rama **desarrollo** del repositorio del examen llamado "Añadir título" ***(CV - 1 punto)***

19.  Acepta los cambios y haz un merge de tu pull request ***(CV - 0.5 puntos)***

20.  No borres el repositorio de tu cuenta hasta que el examen esté corregido

### Issues

21. Observa los issues que deberías tener en tu repositorio de examen.
    
22. Enlaza uno de ellos al pull request Feedback que ya tienes abierto en tu repositorio del examen ***(CV - 0.375 puntos)***

23. Cierralos con un solo commit que contenga en la etiqueta "Cerrando Issues - Nombre y Apellidos" ***(CV - 1 punto)***

### Ramas y Merge II

24.  Fusiona la rama desarrollo en la rama master ***(CV - 0.25 puntos)***

### Github Pages

25.  Crea una página con tu repositorio de la rama master. En la url "iesgrancapitan-entornos.github.io/repositorioexamen/doc" debe aparecer tu javadoc ***(CV - 0.5 puntos)***

### Tags y Releases

26. Añade un tag en el primer commit del repositorio de la rama master con la v0.0.1 y la descripción "Primera versión alpha - Nombre y Apellidos" ***(CV - 1 punto)***

27. Añade otro tag en el último commit (sin crear otro commit nuevo) con la v1.0.0 "Primera Release Candidate - Nombre y Apellidos" ***(CV - 0.5 puntos)***

28. Sube sólo los tags al repositorio y comprueba que se han añadido mirando en la pestaña release ***(CV - 0.5 puntos)***

###  Gitlab

29. Crea un repositorio en el grupo de Entornos de gitlab. Añadelo a tu repositorio local y súbelo. Deberás tener el mismo repositorio tanto en github como gitlab ***(CV - 1.25 puntos)***

##  Nota

***En caso de cualquier duda y/o errata, será resuelta durante la realización del examen***