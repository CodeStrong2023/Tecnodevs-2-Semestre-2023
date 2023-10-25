// Ejercicio para encontrar numeros pares e impares
let parImpar = 10;
if(parImpar % 2 == 0){
    console.log("Es un numero PAR");
}
else{
    console.log("Es un numero IMPAR");
}


// Ejercicio mayor de edad
let edad = 20, adulto = 18;
if(edad >= adulto){
    console.log("Es MAYOR de edad");
}
else{
    console.log("Es MENOR de edad");
}

// Ejercicio: Dentro de un rango
let rango = 5;
let valMin = 0, valMax = 10;
if(rango >= valMin && rango <= valMax){
    console.log("Esta dentro del rango establecido")
}
else{
    console.log("Esta fuera del rango establecido")
}


//Ejercicio: si el padre puede asistir al juego de su hijo
let vacaciones = true, diaDescanso = false;
if(vacaciones || diaDescanso){
    console.log("Puede asistir al juego de su hijo")
}
else{
    console.log("No puede asistir al juego de su hijo")
}

//Operador Ternario
let resultado = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado);
let num = 9;
resultado = num % 2 == 0 ? "Es un numero PAR" : "Es un numero IMPAR";
console.log(resultado);

// Convertir String a Number
let miNum = "1";
console.log(typeof miNum);
let edad2 = Number(miNum);//Esta es una funcion
console.log(typeof edad2);

//Funcion isNaN -> es para verificar el valor de una variable que sea de tipo numerica
if(isNaN(edad2)){ // No es un numero = is Not a Number(devuelve un bool)
    console.log("Esta variable no contiene solo numeros")
}   
else{
    if(edad2 >= 18){
        console.log("Puede votar");
    }
else{
        console.log("No puede votar");
    }
}


//Operador ternario
let resultado3 = edad2 >= 18 ? "Puede votar" : "No puede votar";
console.log(resultado3);



