# TallerServiciosTV

Se pretende desarrollar un conjunto de clases que representen, de forma simplificada, a una
hipotética empresa dedicada a prestar servicios de TV. A continuación, se describen las
características básicas de estas clases:
1. Empleado. Clase básica que describe a un empleado. Incluye sus datos personales
(nombre, apellidos, documento, dirección, email, edad) y algunos datos tales como los
años de antigüedad, teléfono de contacto y su salario. Incluye también información de
quién es el empleado que lo supervisa (Empleado *).
Tendrá, al menos, los siguientes métodos:
• Constructores para definir correctamente un empleado, a partir de su nombre, apellidos,
email, edad, dirección, teléfono y salario.
• Metodos get/set necesarios
• Cambiar supervisor
• Incrementar salario
2. Secretario. Tiene despacho, número de fax e incrementa su salario un 5% anual. Tendrá, al
menos, los siguientes métodos:
• Constructores (debe rellenar la información personal y los datos principales)
• Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
3. Vendedor. Tiene vehiculo de la empresa (identificado por la matricula, marca y modelo),
teléfono móvil, área de venta, lista de clientes (cada cliente tiene documento, nombre,
apellido, dirección, teléfono, tipo plan – básico, plata y Oro--) y porcentaje que se lleva de
las ventas en concepto de comisiones. Incrementa su salario un 10% anual. Tendrá, al
menos, los siguientes métodos:
• Constructores (debe rellenar la información personal y los datos principales)
• Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
• Crear un nuevo cliente.
• Eliminar un cliente.
• Cambiar de vehiculo.
4. Jefe de zona. Tiene despacho, tiene un secretario a su cargo, una lista de vendedores a su
cargo y tiene vehiculo de la empresa (identificado por la matrícula, marca y modelo).
Incrementa su salario un 20% anual. Tendrá, al menos, los siguientes métodos:
• Constructores (debe rellenar la información personal y los datos principales)
• Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
• Cambiar de secretario.
• Cambiar de vehiculo.
• Crear y eliminar vendedores en su zona.
Todos los empleados son vendedores, jefes de zona o secretarios. Los clientes básico
pagan una tarifa de 100.000 mensual, los plata 150.000 y los oro 230.000.

Los tipos de clientes debe tener un listado de canales (cada canal tiene un numero de
canal y nombre, y si es HD o no), los cuales son unos canales básicos y dependiendo del
tipo tendrá unos canales adicionales, una cobertura (estratos)
Cree el diagrama UML
Cree las clases correspondientes según el diagrama creado y un programa que permita
crear empleados, canales, clientes, vehículos, etc.
Permitir obtener listado de clientes de un empleado y el valor a pagar por todos sus
clientes
