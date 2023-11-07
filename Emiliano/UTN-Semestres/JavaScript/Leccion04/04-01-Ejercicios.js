// Ejercicio 1: calcular estacion del año
let mes = 4;
let estacion;
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto"
}
console.log("Corresponde a la estación "+estacion);

//Ejercicio 2: Hora del dia 
let horaDia = 19;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje = "Hora del desayuno";
}
else if(horaDia >= 12 && horaDia <= 16){
    mensaje = "Hora de almorzar"
}
else if(horaDia >= 17 && horaDia <=19){
    mensaje = "Hora de la mediatarde"
}
else if(horaDia >= 20 && horaDia <=23){
    mensaje = "Hora de cenar"
}
else{
    mensaje = "Valor incorrecto"
}
console.log(mensaje)

//Estructura swich
switch(mes){
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion ="Invierno";
        break;
    case 9: case 10: case 11:
        estacion ="Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log("Estacion elejida: "+estacion);

//Ejercicio

let days = "miercoles";
switch(days){
    case "lunes":
        console.log("hoy es "+days);
        break;
    case "martes":
        console.log("hoy es "+days);
        break;
    case "miercoles":
        console.log("hoy es "+days);
        break;
    case "jueves":
        console.log("hoy es "+days);
        break;
    case "viernes":
        console.log("hoy es "+days);
        break;
    case "sabado":
        console.log("hoy es "+days);
        break;
    case "domingo":
        console.log("hoy es "+days);
        break;
    default:
        console.log("Error en el ingreso de dias");
        break;
}

//Version mejorada del ejercicio

let days2 = ["lunes","martes","miercoles","jueves","sabado","domingo"];
function getDay(n){
    if(n < 1 || n > 7){
        throw new Error("fuera de rango");
    }
    return days[n-1];
}
console.log(getDay(5));

//Ejercicio: hacer el mismo ejercicio anterior pero con meses del año

let meses = "marzo";
switch(meses){
    case "enero":
        console.log("hoy es "+meses);
        break;
    case "febrero":
        console.log("hoy es "+meses);
        break;
    case "marzo":
        console.log("hoy es "+meses);
        break;
    case "abril":
        console.log("hoy es "+meses);
        break;
    case "mayo":
        console.log("hoy es "+meses);
        break;
    case "junio":
        console.log("hoy es "+meses);
        break;
    case "julio":
        console.log("hoy es "+meses);
        break;
    case "agosto":
        console.log("hoy es "+meses);
        break;
    case "septiembre":
        console.log("hoy es "+meses);
        break;
    case "octubre":
        console.log("hoy es "+meses);
        break;
    case "noviembre":
        console.log("hoy es "+meses);
        break;
    case "diciembre":
        console.log("hoy es "+meses);
        break;
    default:
        console.log("Error en el ingreso del mes");
        break;
}
//Version mejorada del ejercicio de meses del año

let meses2 = ["enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"];
function getMeses2(n){
    if(n < 1 || n > 12){
        throw new Error("fuera de rango");
    }
    return meses2[n-1];
}
console.log(getDay(6));