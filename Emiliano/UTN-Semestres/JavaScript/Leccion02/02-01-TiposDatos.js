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