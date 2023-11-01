// Ejercicio para encontrar números pares e impares
let numero = 22;
if (numero % 2 == 0){
    console.log("El número es PAR")
} else {
    console.log("El número es IMPAR")
}

// Ejercicio es mayor de edad
let edad = 18;
if (edad < 18){
    console.log("Es mayor de edad")
} else {
    console.log("Es mayor de edad")
}

// Ejercicio: dentro de un rango
let dentroRango = 10; //Aquí vamos a ir cambiando el valor
let valMin = 0, valMax = 10;
if (dentroRango >= valMin && dentroRango <= valMax){
    console.log("Esta dentro del rango establecido");
}
else {
    console.log("Esta fuera del rango establecido")
}
// Hoy ya no se usa var, se utiliza ley y const
let nombre2 = "Pedro"; // 
console.log(nombre2);
const apellido2 = "Lepes";
//apellido2 = "Perez"; una constante no puede ser modificada
console.log(apellido2);
// let solo puede ser usado dentro de un bloque de llave o función
// const tiene valores que no pueden ser reasignados
// var tiene problemas en la estructura if. forma parte del ámbito global
let x, y;  // Se pueden crear varias variables en una línea
x = 17, y = 21;  // Se pueden asignar varios valores en una sola línea
let z = x + y;  // Se asigna el valor de la operación
console.log(z);
let $1num = 1;  // No utilizar números para el inicio de una variable
let rompiendo = 'Rompe';  // No utilizar palabras reservadas para una variable

console.log($1num)
console.log(rompiendo)

// Ejercicio si el padre puede asistir al juego de su hijo
let vacaciones = false, diaDescanso = true;
if(vacaciones || diaDescanso){
    console.log("El padre puede asistir al juedo de su hijo")

}
else{
    console.log("El padre no puede asistir al juedo de su hijo")
}
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";

let numero1 = 9;
resultado = numero1 % 2 == 0 ? "Es un número par" : " Es un número impar";
console.log(resultado);

// Convertir String a Number
let miNumero = "18"; //Es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero);  //Esta es una función
console.log(edad2);

// Funció isNaN
if(isNaN(edad2)){
    console.log("La variable no es un número")

}
else{
    if (edad2 >= 18){
    console.log("Puede votar");
    }
    else{
        console.log("Muy joven para votar");
}
    let resultado3 = edad2 >= 18 ? "Puede votar" : "Muy joven para votar";
    console.log(resultado3)
}




