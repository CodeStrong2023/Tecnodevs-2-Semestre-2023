var nombre = 'José';
var apellido = ' Montés'
var nombreCompleto = nombre +' '+ apellido;
console.log(nombreCompleto);
var nombreCompleto2 = 'Ariel' + ' ' + 'Betancud';
console.log(nombreCompleto2);
var juntos = nombre + 219;
console.log(juntos);
juntos = nombre + (78 + 17);  // Los paréntesis hacen que sean tratados como números y no como String. 
// Se llama contexto String o contexto cadena
console.log(juntos)
juntos = 78 + 17 + nombre;
console.log(juntos);

;
console.log(nombre += apellido)