var nombre = 'José';
var apellido = ' Montés';
var nombreCompleto = nombre +' '+ apellido;  // Primera concatenación
console.log(nombreCompleto);
var nombreCompleto2 = 'Ariel' + ' ' + 'Betancud';  // Segunda concatenación
console.log(nombreCompleto2);
var juntos = nombre + 219;  // Al empezar con cadena el número es interpretado como cadena
console.log(juntos);
juntos = nombre + (78 + 17);  // Los paréntesis hacen que sean tratados como números y no como String. 
// Se llama contexto String o contexto cadena
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);

nombre += apellido;  // Tercera: concatenamos con el operador simplificado
console.log(nombre);

// Hoy ya no se usa var, se usa let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
// apellido2 = "Perez"  // Una constante no puede ser modificada
console.log(apellido2);

let x, y;  // Se puede crear varias variables en una misma línea
x = 17, y = 21;  // Se puede asignar varias variables en la misma línea
let z = x + y;  // Se asigna el valor de la operación
console.log(z);

let $1num = 31;  // No utilizar números al inicio
let rompiendo = "rompe";  // No usar palabras reservadas
console.log($1num);
console.log(rompiendo);
