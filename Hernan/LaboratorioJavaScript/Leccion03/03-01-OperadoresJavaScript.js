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