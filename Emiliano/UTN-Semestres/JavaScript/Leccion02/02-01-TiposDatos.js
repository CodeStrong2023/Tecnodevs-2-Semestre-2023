var nom = "Emi"; // Tipo String

var num = 10; // Tipo Numerico
nom = 8;
console.log(typeof nom); // nos muestra el tipo de dato

num = 12.3;
console.log(typeof(nom));

var objeto = {
    nom : "Gabi",
    tel : 123456
}
console.log(objeto);

// Tipos boolean

var bandera = true;

// tipo de datos funcion
function miFuncion(){}
console.log(miFuncion);

// tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

//Tipo de dato clase
class Persona{
    constructor(nom,num){
        this.nom = nom;
        this.num = num;
    }
}
console.log(Persona);

// Tipo de dato undefined
var x;
console.log(typeof x);

x = undefined;
console.log(typeof x);

// null: significa ausencia de un valor(variable vacia)
var y = null; //null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

// Tipo de dato array y Empty String
var autos = ["Puede contener cualquier tipo de dato"];
console.log(autos);

var z = ""; // Se refiere a una cadena vacia
console.log(z)



