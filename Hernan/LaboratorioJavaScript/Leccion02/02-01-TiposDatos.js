// Tipos de datos en JavaScript
/*
La sintaxis en JavaScript
es muy parecida a Java en cuanto a comentarios
se podría decir que es idéntica
*/
var nombre = "Ariel"; // Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.5;
console.log(typeof nombre)
var numero = 3000; // Tipo numérico
console.log(numero);
var objeto = {
    nombre: "Ariel",
    apellido: "Betancud",
    telefono: "123456789"
}
console.log(objeto);

// Tipo de dato booleano (Bandera)

var bandera = true;
console.log(bandera);

// Tipo de dato función

function miFuncion (){};
console.log(typeof miFuncion);

//Tipo de dato symbol
var simbolo = Symbol("mi simbolo");
console.log(simbolo);

//Tipo de dato Clase

class persona {
    constructor(nombre,apellido){
        this.nombre = nombre;   // this. hace referencia a los atributos de nuestra clase
        this.apellido = apellido;
    }
}
console.log(typeof persona) // Una clase es una función