// Aplicando el uso de var let y const
/*
Con var puedes reasignar en cualqioer momento 
esta forma parte del ambito global
Un error es que seobreescriba
*/

var nombree = "Emiliano";
nombree = "Ariel";
console.log(nombree);

function saludar(){
    var nombree = "Natalia";
    console.log(nombree);
}
console.log(nombree); // aqui no lee el dato en la funcion

if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad); // En la funcion funciono correctamente, en la estructura if fallo

/*
let: esta f.puede ser reasignada en cualquier momento, la diferencia 
es que su ambito es de bloque, solo disponible dentro de un bloque de llaves
o dentro de una funcion
*/

function saludar(){
    let nombre3 = "Ariel";
    console.log(nombre3);
}
console.log(nombre3);

if(true){
    let edad = 33;
    console.log(edad);
}
console.log(edad);

/*
const se utiliza para valores constantes que no pueden ser reasignadas
*/

const fecha = 2004;
console.log(fecha);
fecha = 2003;
console.log(fecha); // solo se ejecuta el console anterior 