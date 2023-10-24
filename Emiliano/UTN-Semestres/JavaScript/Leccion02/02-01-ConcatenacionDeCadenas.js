var nombre = "Jose ";
var apellido = "Gomez";
var nombreCompleto = nombre+""+apellido;
console.log(nombreCompleto);
var nombreCompleto2 = "Emiliano"+""+"Grossi";
console.log(nombreCompleto2);
var juntos = nombre + 219; //Lee de izquierda a derecha siguiendo la cadena lee el numero como string
console.log(juntos);
juntos = nombre + (78 + 12); // Se puede diferenciar a travaz de los parentesis
console.log(juntos);
juntos = 79 + 12 + nombre;
console.log(juntos);
nombre += apellido; // concatenamos usando el operador simplificado
console.log(nombre);

let x, y; //Se puede crear varias variables dentro de una misma linea
x = 10, y = 20; //Se puede hacer asignacion de varias variables dento de la misma linea
let z = x + y;
console.log(z);

