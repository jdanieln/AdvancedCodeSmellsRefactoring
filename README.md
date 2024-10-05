
# Refactorización Avanzada de Code Smells en Java 21

Este proyecto contiene ejemplos prácticos de code smells comunes y sus versiones refactorizadas utilizando las características de Java 21. Está diseñado para programadores Java con experiencia que deseen comprender cómo identificar code smells y aplicar técnicas modernas de Java para mejorar la calidad del código.

## Tabla de Contenidos
- [Refactorización Avanzada de Code Smells en Java 21](#refactorización-avanzada-de-code-smells-en-java-21)
  - [Tabla de Contenidos](#tabla-de-contenidos)
  - [Estructura del Proyecto](#estructura-del-proyecto)
    - [Paquetes Principales:](#paquetes-principales)
  - [Code Smells y Refactorizaciones](#code-smells-y-refactorizaciones)
    - [1. Long Method (Método Largo)](#1-long-method-método-largo)
    - [2. Large Class (Clase Grande)](#2-large-class-clase-grande)
  - [Cómo Ejecutar el Proyecto](#cómo-ejecutar-el-proyecto)
    - [Prerrequisitos](#prerrequisitos)
    - [Pasos](#pasos)
  - [Aspectos Técnicos y Características de Java 21](#aspectos-técnicos-y-características-de-java-21)
    - [Records](#records)
  - [Contribuciones](#contribuciones)
  - [Licencia](#licencia)

## Estructura del Proyecto

El proyecto está organizado en paquetes, cada uno representando un code smell específico. Dentro de cada paquete principal, hay dos subpaquetes:

- **code_smell**: Contiene el código original que presenta el code smell.
- **refactoring**: Contiene el código refactorizado utilizando las características de Java 21.

### Paquetes Principales:
- `com.example.longmethod`
- `com.example.largeclass`
- `com.example.featureenvy`
- `com.example.duplicatecode`
- `com.example.dataclumps`
- `com.example.switchstatements`
- `com.example.primitiveobsession`
- `com.example.speculativegenerality`
- `com.example.messagechains`

Cada paquete incluye todas las clases necesarias y una clase Main para ejecutar y probar los ejemplos.

## Code Smells y Refactorizaciones

### 1. Long Method (Método Largo)
**Problema**:  
El método `procesarTransacciones` es demasiado largo y realiza múltiples tareas complejas, violando el Principio de Responsabilidad Única.

**Antes de la Refactorización**:  
- Paquete: `com.example.longmethod.code_smell`
- El método realiza validaciones, conversiones de moneda, actualizaciones de saldos, notificaciones, generación de reportes y auditorías en un solo bloque.

**Después de la Refactorización**:  
- Paquete: `com.example.longmethod.refactoring`
- El método se divide en métodos privados más pequeños y específicos.

**Características de Java 21 Utilizadas**:
- `String.formatted()` para mejorar la legibilidad al formatear cadenas.
- Uso de `Records` para inmutabilidad y simplificación de clases de datos (si es aplicable).

**Aspectos Técnicos**:
- Descomposición de Métodos: Mejora la legibilidad y facilita el mantenimiento.
- Uso de Nuevas Características: Aprovecha mejoras en el manejo de cadenas y estructuras de datos.

### 2. Large Class (Clase Grande)
...

(Puedes continuar con el formato proporcionado para los demás code smells, manteniendo la misma estructura).

## Cómo Ejecutar el Proyecto

### Prerrequisitos
- **Java Development Kit (JDK) 21** instalado.
- **Eclipse IDE** (o cualquier otro IDE que soporte Java 21).

### Pasos

1. **Clonar el Repositorio**:
   ```bash
   git clone https://github.com/jdanieln/AdvancedCodeSmellsRefactoring.git
   ```

2. **Importar el Proyecto en Eclipse**:
   - Abre Eclipse.
   - Ve a `File > Import... > Existing Projects into Workspace`.
   - Selecciona la carpeta del repositorio clonado.

3. **Configurar Java 21 en Eclipse**:
   - Ve a `Window > Preferences > Java > Installed JREs`.
   - Añade JDK 21 si aún no está añadido.
   - Configura el JRE del proyecto para usar Java 21.

4. **Ejecutar los Ejemplos**:
   - Navega a la clase `Main` en cada paquete `refactoring`.
   - Haz clic derecho y selecciona `Run As > Java Application`.

## Aspectos Técnicos y Características de Java 21

Este proyecto aprovecha varias características nuevas introducidas en Java 21 para mejorar la calidad del código y demostrar prácticas modernas de programación en Java.

### Records
...

(Completa esta sección según las características de Java 21 mencionadas).

## Contribuciones

¡Las contribuciones son bienvenidas! Si deseas mejorar o ampliar el proyecto, por favor abre un issue o envía un pull request.

## Licencia

Este proyecto está licenciado bajo la licencia MIT.
