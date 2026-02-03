# Alke Wallet

Proyecto desarrollado en **Java** como parte de la **Evaluación del Módulo 2**.  
La aplicación simula una billetera digital que permite administrar fondos y realizar conversiones de moneda.

---

## 📌 Funcionalidades

- Creación de una cuenta
- Visualización de saldo
- Ingreso de dinero
- Retiro de dinero
- Conversión de moneda de Pesos a Dólares

---

## 🧠 Diseño del sistema

El proyecto fue desarrollado utilizando **Programación Orientada a Objetos**, separando responsabilidades mediante clases e interfaces.

### Componentes principales:
- **Cuenta**: gestiona el saldo y las operaciones de ingreso y retiro.
- **ConversorMoneda (interfaz)**: define el comportamiento de conversión.
- **ConversorPesosADolares**: implementación concreta del conversor.
- **Main**: clase principal de ejecución.

El modelo del sistema se encuentra representado en el **Diagrama de Clases**, incluido en el repositorio.

---

## 🧪 Pruebas Unitarias

Se implementaron pruebas unitarias utilizando **JUnit**, con el objetivo de validar:
- El ingreso de dinero a la cuenta
- El retiro de dinero y su impacto en el saldo

Las pruebas se ejecutan correctamente y validan el funcionamiento esperado de los métodos principales.

---

## ▶️ Cómo ejecutar el proyecto

1. Clonar o descargar el repositorio
2. Abrir el proyecto en **Eclipse**
3. Verificar que el proyecto esté configurado como **Java Project**
4. Ejecutar la clase `Main.java`
5. Observar los resultados en la consola

---

## 🛠 Tecnologías utilizadas

- Java
- Eclipse IDE
- Programación Orientada a Objetos
- JUnit

---

## 👤 Autor

**Daniel Hernandez**

Proyecto académico desarrollado para fines educativos.
