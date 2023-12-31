//Ejercicio 1: Calcular estación del año
let mes = 2;
let estacion; //Undefined
if (mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if (mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño";
}
else if (mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
}
else if (mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto";
}
console.log("El valor introducido corresponde a: "+estacion);


//Ejercicio 2: Hora del día
let horaDelDia = 8;
let mensaje; // undefined
if (horaDelDia > 2 && horaDelDia <= 8){
    mensaje = "Durmiendo";
}
else if (horaDelDia > 8 && horaDelDia <= 14){
    mensaje = "Trabajando";
}
else if (horaDelDia > 14 && horaDelDia <= 19){
    mensaje = "Arreglando la casa";
}
else if (horaDelDia > 19 && horaDelDia <= 22){
    mensaje = "Cursando la tecnicatura";
}
else if (horaDelDia > 22 || horaDelDia == 1 || horaDelDia == 2){
    mensaje = "Codeando";
}
else {
    mensaje = "Horario no válido"
}
console.log(mensaje);


//Estructura switch(la sintaxis es igual a java)
switch(mes){
    case 12, 1, 2: mensaje = "Verano"; break;
    case 3, 4, 5: mensaje = "Otoño"; break;
    case 6, 7, 8: mensaje = "Invierno"; break;
    case 9, 10, 11: mensaje = "Primavera"; break;
    default: mensaje = "un valor ingresado no es correcto"
}
console.log("El ingreso corresponde a "+mensaje)


// Evitar repetir tu código
// Try don´t repeat yourself

let days = 8;

switch (days) {
    case 1:
        console.log('Hoy es: Lunes');
        break;
    case 2:
        console.log('Hoy es: Martes');
        break;
    case 3:
        console.log('Hoy es: Miercoles');
        break;
    case 4:
        console.log('Hoy es: Jueves');
        break;
    case 5:
        console.log('Hoy es: Viernes');
        break;
    case 6:
        console.log('Hoy es: Sabado');
        break;
    case 7:
        console.log('Hoy es: Domingo');
        break;

    default:
        console.log('Error en el ingreso del día de la semana');
        break;
}

let days2 = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"];

function getDay(n){
    if (n < 1 || n > 7){
        throw new Error('Out of range');
    }
    return days2[n-1];
}
console.log(getDay(3))


let mes2 = 7

switch(mes2){
    case 12, 1, 2: mensaje = "Verano"; break;
    case 3, 4, 5: mensaje = "Otoño"; break;
    case 6, 7, 8: mensaje = "Invierno"; break;
    case 9, 10, 11: mensaje = "Primavera"; break;
    default: mensaje = "un valor ingresado no es correcto"
}
console.log("El ingreso corresponde a "+mensaje)



function estacionAño(mes2){
    let estaciones = ["Verano","Verano", "Otoño","Otoño","Otoño", "Invierno","Invierno","Invierno" ,"Primavera","Primavera","Primavera","Verano"]
    return estaciones[mes2-1]
}
console.log(estacionAño(6))