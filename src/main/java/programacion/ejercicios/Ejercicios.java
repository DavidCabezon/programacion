/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package programacion.ejercicios;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ejercicios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        float n1 = 6, n2 = 4;
        float suma, resta, multi, div, modulo;
        suma = n1+n2;
        resta = n1-n2;
        multi = n1*n2;
        div = n1/n2;
        modulo = n1%n2;
        //forma 1
        System.out.println(n1+" + "+n2+" = "+suma);
        System.out.println(n1+" - "+n2+" = "+resta);
        System.out.println(n1+" * "+n2+" = "+multi);
        System.out.println(n1+" / "+n2+" = "+div);
        System.out.println(n1+" % "+n2+" = "+modulo);
        
        System.out.println(a+" x "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+(a/b));
        System.out.println(f1+" / "+f2+" = "+(f1/f2));
        System.out.println(a+" / "+f2+" = "+(a/f2));
        System.out.println(b+" % "+a+" = "+(b%a));
        System.out.println(f2+" % "+f1+" = "+(f2%f1));
      
        
        //Ejercicio 2
        int añoactual;
            System.out.println("Introduce el año actual: ");
                añoactual = sc.nextInt();
        int añonacimiento;
            System.out.println("Introduce tu año de nacimiento: ");
                añonacimiento = sc.nextInt();
        System.out.println("Tienes "+(añoactual-añonacimiento) +" años");
     
        //Ejercicio 3
        int nota1, nota2, nota3;
            System.out.println("Introduce la nota: ");
                nota1 = sc.nextInt();
            System.out.println("Introduce la nota: ");
                nota2 = sc.nextInt();
            System.out.println("Introduce la nota: ");
                nota3 = sc.nextInt();                
        
        int media = (nota1 + nota2 + nota3)/3;
        System.out.println("La nota media de las notas " +nota1 +", " +nota2 +" y " +nota3 +" es " +media);
      
        //Ejercicio 5
        double manzanas;
            System.out.println("Introduce los kilos de manzanas vendidas: ");
                manzanas = sc.nextDouble();
        double peras;
            System.out.println("Introduce los kilos de peras vendidas: ");
                peras = sc.nextDouble();
        double kilomanzana = 2.35;
        double kiloperas = 1.95;
        System.out.println("La venta de manzanas: "+(manzanas*kilomanzana) +" y la venta de peras: "+(peras*kiloperas));
        

        //Ejercicio 6
        double radio = 5;
            System.out.println("Introduce el radio: ");
                radio = (sc.nextDouble());
        double pi = 3.1416;
        double area = (radio*radio)*pi;
        System.out.println("El area es "+area);
       
        //Ejercicio 7
        double base;
            System.out.println("Introduce la base: ");
                base = sc.nextDouble();
        double iva = 0.21;
        double ivaeuros;
        double total;
        ivaeuros = base*iva;
        total = base+ivaeuros;
        System.out.println("El iva es "+ivaeuros +" y el total es "+total);
      
        //Ejercicio 8
        int a, b, c;
        System.out.println("Introduce el valor de a: ");
                a = sc.nextInt();
        System.out.println("Introduce el valor de b: ");
                b = sc.nextInt();
        System.out.println("Introduce el valor de c: ");
                c = sc.nextInt(); 
        double ecuacion = Math.sqrt((b*b)-4*a*c);
        double valorxmas = (-b+ecuacion)/(2*a);
        double valorxmenos = (-b-ecuacion)/(2*a);
        System.out.println("Si el valor de a es " +a +", el valor de b es " +b +" y el valor de c es "+c +"el valor de x es "+valorxmas +" y "+valorxmenos);
       
        //Ejercicio 11
        int dinero;
        System.out.println("Introduce la cantidad de dinero que tienes: ");
                dinero = sc.nextInt();
        int billetes500, billetes100, billetes20, billetes10, billetes5, moneda2, moneda1;
        int resto100, resto10;
        resto100 = ((dinero % 500)%100);
        resto10 = ((resto100%20)%10);
        billetes500 = dinero / 500;
        billetes100= (dinero % 500)/100;
        billetes20= ((dinero % 500)%100)/20;
        billetes10= (resto100%20)/10;
        billetes5= ((resto100%20)%10)/5;
        moneda2= (resto10%5)/2;
        moneda1= ((resto10%5)%2);
        System.out.println(+dinero +" € se divide en: "+billetes500 +" billetes de 500, "+billetes100 +" billetes de 100, "+billetes20 +" billetes de 20, "+billetes10 +" billetes de 10, "+billetes5 +" billetes de 5, "+moneda2 +" monedas de 2 y "+moneda1 +" monedas de 1.");
      
        
        int num1, num2;
        System.out.println("Introduce un múmero: ");
                num1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
                num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println("El numero "+num1 +" es mayor que "+num2);
        }else if (num1 < num2){
            System.out.println("El numero "+num1 +" es menor que "+num2);
        }else if (num1 == num2){
            System.out.println("El numero "+num1 +" es igual que "+num2);
        };
        
        int num1, num2;
        System.out.println("Introduce un múmero: ");
                num1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
                num2 = sc.nextInt();
        boolean mayor = num1 > num2;
        boolean menor = num1 < num2;
        boolean igual = num1 == num2;
        boolean distinto = num1 != num2;
        System.out.println("El numero "+num1 +" es mayor que "+num2 +": "+mayor);
        System.out.println("El numero "+num1 +" es menor que "+num2 +": "+menor);
        System.out.println("El numero "+num1 +" es igual que "+num2 +": "+igual);
        System.out.println("El numero "+num1 +" es distinto que "+num2 +": "+distinto);
     
        double num1, num2;
        System.out.println("Introduce un número: ");
                num1 = sc.nextDouble();
        System.out.println("Introduce otro número: ");
                num2 = sc.nextDouble();
        System.out.println(+num1 +" elevado a " +num2 +" es igual a " +Math.pow(num1, num2));
        System.out.println("La raiz cuadrada de " +num1 +" es " +Math.sqrt(num1));
        System.out.println("La raiz cuadrada de " +num2 +" es " +Math.sqrt(num2));

        int num1, num2;
        System.out.println("Introduce un número: ");
                num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el nombre: ");
                String nombre = sc.nextLine();
        System.out.println("Introduce otro número: ");
                num2 = sc.nextInt();
        System.out.println("el nombre es "+nombre +" y los numeros son " +num1 +" " +num2);
 
        double num1, num2;
        System.out.println("Introduce un número: ");
                num1 = sc.nextDouble();
        num2 = Math.random()*100;  
        boolean mayor = num1 > num2;
        boolean menor = num1 < num2;
        boolean igual = num1 == num2;
        System.out.println("El numero "+num1 +" es mayor que "+num2 +": "+mayor);
        System.out.println("El numero "+num1 +" es menor que "+num2 +": "+menor);
        System.out.println("El numero "+num1 +" es igual que "+num2 +": "+igual);
        
        double num1, num2;
        System.out.println("Introduce un número: ");
                num1 = sc.nextDouble();
        System.out.println("Introduce otro número: ");
                num2 = sc.nextDouble();
        double distancia = num1 - num2;
        System.out.println("la distancia absoluta entre "+num1 +" y "+num2 +" es "+Math.abs(distancia));
        
        double base, altura;
        System.out.println("Introduce la base del triangulo: ");
                base = sc.nextDouble();
        System.out.println("Introduce la altura del triangulo: ");
                altura = sc.nextDouble();
        double area = (base*altura)/2;
        System.out.println("El area del triangulo es "+area);

        double area = 50.26548245743669;
        double radio = Math.sqrt(area / Math.PI);
        System.out.println("El radio del circulo es "+radio);
        
        double perimetro = 31.41592653589793;
        double radio = perimetro/(2*Math.PI);
        System.out.println("El perimetro del circulo es "+radio);
    
        String cadena = "Juan";
        int a = cadena.length();
        System.out.println(a);
        System.out.println(cadena.charAt(0));  
         
        String algo;
        System.out.println("Introduce algo: ");
                algo = sc.nextLine();
        int pos;
        System.out.println("Introduce la posicion que quieres saber: ");
                pos = sc.nextInt();
                
        int longitud = algo.length();
        char caracter = algo.charAt(pos-1);
        System.out.println("La cadena que has introducido tiene "+longitud +" caracteres y el caracter "+pos +" es "+caracter);
      
        //EJERCICIOS STRINGS
        //Ejercicio 1
        System.out.println("Escribe tu nombre:");
            String nombre = sc.nextLine();
        String mayus = nombre.substring(0,1);
        String nombremin = nombre.substring(1);
        String nombremayus = mayus.toUpperCase();
        System.out.println(nombremayus + nombremin);
       
        //Ejercicio 2
        System.out.println("Escribe tu nombre:");
            String nombre = sc.nextLine();
        int longitud = nombre.length();
        for (int j = 0; j<longitud; j++){
            char letra = nombre.charAt(j);
            String espacio = letra +" ";
            System.out.print(espacio);
        }
        
        System.out.println("Escribe tu nombre: ");
            String nombre = sc.nextLine();
        System.out.println("Escribe tu apellido: ");
            String apellido = sc.nextLine();
        String nombre_completo = nombre +" " +apellido;
        System.out.println(nombre_completo);

        System.out.println("¿Cuanto dinero has invertido?");
            double dineroinicial = sc.nextDouble();
        System.out.println("¿Cuanto dinero has sacado de la inversion?");
            double dinerofinal = sc.nextDouble();
        double beneficio = dinerofinal-dineroinicial;
        double iva = 0.49;
        double total;
        double dineroiva;
        dineroiva = beneficio*iva;
        total=beneficio-dineroiva;
        System.out.println("El dinero invertido es "+dineroinicial +" y el dinero que ha conseguido con la inversion es "+beneficio +" , por lo que ha ganado "+total);       

        double num1, num2;
        System.out.println("Introduce un número: ");
                num1 = sc.nextDouble();
        System.out.println("Introduce un número: ");
                num2 = sc.nextDouble();  
        boolean mayor = num1 > num2;
        boolean menor = num1 < num2;
        boolean igual = num1 == num2;
        System.out.println("El numero "+num1 +" es mayor que "+num2 +": "+mayor);
        System.out.println("El numero "+num1 +" es menor que "+num2 +": "+menor);
        System.out.println("El numero "+num1 +" es igual que "+num2 +": "+igual);

        
        System.out.println("Introduce tu nombre: ");
            String nombre = sc.nextLine();
        char letra = nombre.charAt(3);
        System.out.println("El nombre es "+nombre +" y su cuarta letra es "+letra);
        
        System.out.println("Introduce tu nombre: ");
            String nombre = sc.nextLine();
        String sinespacios = nombre.trim();
        System.out.println(sinespacios);
      
        System.out.println("Introduce tu nombre: ");
            String nombre = sc.nextLine();
        System.out.println("Introduce tu apellido: ");
            String apellido = sc.nextLine();  
        String completo = nombre +" " +apellido;
        String comparacion = "David Cabezon";
        boolean es = completo.equals(comparacion);
        boolean esigual = completo==comparacion;
        System.out.println("El nombre es igual: "+es +" "+esigual);
         
        System.out.println("Introduce tu nombre: ");
            String nombre = sc.nextLine(); 
        String comparacion = "David Cabezon";
        boolean es = nombre.equals(comparacion);
        boolean esigual = nombre==comparacion;
        System.out.println("El nombre es igual: "+es +" "+esigual);
      
        System.out.println("Introduce tu edad: ");
            int edad = sc.nextInt();
        System.out.println("Introduce tu frecuencia cardiaca: ");
            double frep = sc.nextDouble();
        double FCObjetivo = 1;
        double fmax = 208-(0.7*edad);
        double pul_obj = (fmax-frep)*FCObjetivo+frep;
        System.out.println("Su frecuencia máxima es: "+fmax);
        System.out.println("Con una franja de trabajo del 100% ha conseguido las siguientes pulsaciones: "+pul_obj);
    
        //Ejercicio tabla *
        for (int j = 1, i=5; j<=i; j++){
            if (j==1 || j==5){
                System.out.print("*");
            } 
            for (int a = 1, b=34; a<=b; a++){
                if (a<=b){
                System.out.print("*");
            } 
        }
        }
       
        
        
        
        //Ejercicios iniciacion
        //Ejercicio 1
        System.out.println("Escribe una palabra: ");
            String palabra = sc.nextLine();
        int caracteres = palabra.length();
        String mayus = palabra.toUpperCase();
        String minus = palabra.toLowerCase();
        System.out.println("La palabra es "+palabra +" , tiene "+caracteres+" caracteres. La palabra en mayusculas: "+mayus+" , la palabra en minusculas "+minus);
    
        //Ejercicio 2
        System.out.println("Introduce un número: ");
            double num1 = sc.nextDouble();
        System.out.println("Introduce un número: ");
            double num2 = sc.nextDouble();
        double suma = num1+num2;
        double resta = num1-num2;
        double multi = num1*num2;
        double div = num1/num2;
        System.out.println("La suma de "+num1+" y "+num2+" es: "+suma);
        System.out.println("La resta de "+num1+" y "+num2+" es: "+resta);
        System.out.println("La multiplicación de "+num1+" y "+num2+" es: "+multi);
        System.out.println("La división de "+num1+" y "+num2+" es: "+div);
        
        //Ejercicio 3
        System.out.println("Introduce tu nombre: ");
            String nombre = sc.nextLine();
        char primera = nombre.charAt(1-1);
        int longitud = nombre.length();
        char ultima = nombre.charAt(longitud-1);
        String a = nombre.substring(0,1);
        String aa = "A";
        boolean letraA = a.equals(aa) ;
        boolean letraAA = nombre.startsWith(A) ;
        System.out.println("La primera letra es "+primera);
        System.out.println("La ultima letra es "+ultima);
        System.out.println("Empieza por A: "+letraA);
        
        //Ejercicio 4
        System.out.println("Introduce los litros vendidos de agua: ");
            double agua = sc.nextDouble();
        System.out.println("Introduce los litros vendidos de refresco: ");
            double refresco = sc.nextDouble();   
        System.out.println("Introduce los litros vendidos de zumo: ");
            double zumo = sc.nextDouble();
        double ingagua = agua*0.8;
        double ingrefresco = refresco*1.25;
        double ingzumo = zumo*1.9;
        double ingresos = ingagua+ingrefresco+ingzumo;
        System.out.println("Los ingresos anuales por los litros de agua son: "+ingagua);
        System.out.println("Los ingresos anuales por los litros de refresco son: "+ingrefresco);
        System.out.println("Los ingresos anuales por los litros de zumo son: "+ingzumo);  
        System.out.println("Los ingresos totales son: "+ingresos);
               
        //Ejercicio 5    
        System.out.println("Introduce los km recorridos este trimestre: ");
            double km = sc.nextDouble();
        int coste = 3000;
        double facturacion = km*0.65;
        double beneficio = facturacion - coste;
        System.out.println("La empresa factura "+facturacion);
        System.out.println("La empresa tiene de beneficios "+beneficio);
        
        //Ejercicio 6        
        System.out.println("Cuantos cuadernos se vendieron en el anterior mes: ");
           int cuadernos = sc.nextInt();
        System.out.println("Cuantos boligrafos se vendieron en el anterior mes: ");
           int bolis = sc.nextInt();
        System.out.println("Cuantas carpetas se vendieron en el anterior mes: ");
           int carpetas = sc.nextInt();
        double ingcuadernos = cuadernos*2.5;
        double ingbolis = bolis*1.2;
        double ingcarpetas=carpetas*3.75;
        double ingresos = ingcuadernos+ingbolis+ingcarpetas;
        double porcuadernos = (ingcuadernos/ingresos)*100;
        double porbolis = (ingbolis/ingresos)*100;
        double porcarpetas = (ingcarpetas/ingresos)*100;
        System.out.println("Con los cuadernos se recaudo: "+ingcuadernos+" euros");
        System.out.println("Con los boligrafos se recaudo: "+ingbolis+" euros");
        System.out.println("Con las carpetas se recaudo: "+ingcarpetas+" euros");
        System.out.println("En total se recaudo: "+ingresos+" euros");
        System.out.println("porcentaje de cuadernos: "+porcuadernos+" %");
        System.out.println("porcentaje de bolis: "+porbolis+" %");
        System.out.println("porcentaje de carpetas: "+porcarpetas+" %");
                
        //Ejercicio 7 
        System.out.println("Cuantos viajes nacionales se vendieron");
            int nacional = sc.nextInt();        
        System.out.println("Cuantos viajes europeos se vendieron");
            int europeo = sc.nextInt();
        System.out.println("Cuantos viajes internacionales se vendieron");
            int internacional = sc.nextInt();
        double ingnacional = nacional*250;
        double ingeuropeo = europeo*450;
        double inginternacional = internacional*900;
        double ingresos = ingnacional+ingeuropeo+inginternacional;
        double comision = ingresos*0.08;
        double ingresosfinales = ingresos-comision;
        System.out.println("Con los viajes nacionales se recaudo: "+ingnacional);
        System.out.println("Con los viajes europeos se recaudo: "+ingeuropeo);
        System.out.println("Con los viajes internacionales se recaudo: "+inginternacional);
        System.out.println("En total se recaudo: "+ingresos+" pero con la comisión del 8% que es "+comision+" finalmente se recaudo "+ingresosfinales);
                
        //Ejercicio 8
        System.out.println("Introduce el tamaño de un cateto");
            double cateto1 = sc.nextDouble();        
        System.out.println("Introduce el tamaño de un cateto");
            double cateto2 = sc.nextDouble();
        double hipotenusa = Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
        System.out.println("Si los catetos miden "+cateto1+" y "+cateto2+" , la hipotenusa mide "+hipotenusa);
                
        //Ejercicio 9
        System.out.println("Lanza el dado: ");
        double numero = Math.round(Math.random()*6);
        System.out.println("El numero que ha salido es "+numero);
              
        //Ejercicio 10       
        System.out.println("Introduce la nota 1: ");
            double nota1 = sc.nextDouble();
        System.out.println("Introduce la nota 2: ");
            double nota2 = sc.nextDouble();         
        System.out.println("Introduce la nota 3: ");
            double nota3 = sc.nextDouble();        
        System.out.println("Introduce la nota 4: ");
            double nota4 = sc.nextDouble();
        double nota1re = Math.round(nota1);
        double nota2re = Math.round(nota2);
        double nota3re = Math.round(nota3);
        double nota4re = Math.round(nota4);
        System.out.println("La nota 1 era "+nota1+" pero redondeada es "+nota1re);
        System.out.println("La nota 2 era "+nota2+" pero redondeada es "+nota2re);
        System.out.println("La nota 3 era "+nota3+" pero redondeada es "+nota3re);
        System.out.println("La nota 4 era "+nota4+" pero redondeada es "+nota4re);
                
        //Ejercicio 11        
        System.out.println("Introduce el usuario: ");
            String usuario1 = sc.nextLine();
        System.out.println("Introduce la contraseña: ");
            String contraseña1 = sc.nextLine();
        String usuario2 = "admin";
        String contraseña2 = "admin1234";
        boolean coincideusu = usuario1.equals(usuario2);
        boolean coincidecontra = contraseña1.equals(contraseña2);
        System.out.println("Coincide el usuario: "+coincideusu);
        System.out.println("Coincide la contraseña: "+coincidecontra);
                
        //Ejercicio 12
        System.out.println("Introduce un numero: ");
            double numero = sc.nextDouble();
        boolean entre = 1<=numero && 10>=numero;
        System.out.println("El numero esta entre 1 y 10 incluidos: "+entre);
        
        //Ejercicio 13
        System.out.println("Introduce un dia de la semana: ");
            String dia = sc.nextLine();
        boolean comprobacion = dia.equals("sabado") || dia.equals("domingo") ;
        if (comprobacion == true){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
              
        System.out.println("Introduce un nombre: ");
            String nombre1 = sc.nextLine();
        System.out.println("Introduce otro nombre: ");
            String nombre2 = sc.nextLine();
        boolean poj = nombre1.equals("juan") || nombre2.equals("pepe");
        System.out.println(poj);

        
        
        //EJERCICIOS BIFURCACIONES
        //Ejercicio 1
        System.out.println("Introduce un número: ");
            int num = sc.nextInt();
        if (num % 2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
        
        //Ejercicio 2
        System.out.println("Introduce un número: ");
            int num1 = sc.nextInt();
        System.out.println("Introduce un número: ");
            int num2 = sc.nextInt();
        if (num1 == num2){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        //Ejercicio 3
        System.out.println("Introduce un número: ");
            int num1 = sc.nextInt();
        System.out.println("Introduce un número: ");
            int num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println(num1 +" es mayor");
        }else{
            System.out.println(num2 +" es mayor");
        }        
    
        //Ejercicio 4
        System.out.println("Introduce un número: ");
            int num1 = sc.nextInt();
        System.out.println("Introduce un número: ");
            int num2 = sc.nextInt();
        if (num1 == num2){
            System.out.println("Son iguales");
        }else{
            if(num1>num2){
            System.out.println(num1 +" es mayor");
            }else{
            System.out.println(num2 +" es mayor");   
            }    
        }
        
        //Ejercicio 5
        System.out.println("Introduce un número: ");
            double num1 = sc.nextDouble();
        if (num1<1&&num1>-1){
            System.out.println(num1+" es un numero casi-cero");
        }else{
            System.out.println(num1+" no es un numero casi-cero");
        }
        
        //Ejercicio 6
        System.out.println("Introduce un número: ");
            int num1 = sc.nextInt();
        System.out.println("Introduce un número: ");
            int num2 = sc.nextInt();
        
        //Ejercicio 7
        System.out.println("Introduce un número: ");
            double num1 = sc.nextDouble();
        double floor = Math.floor(Math.abs(num1));
        if (floor==0){
            System.out.println(num1+" es un numero casi-cero");
        }else{
            System.out.println(num1+" no es un numero casi-cero");
        }
       
        //Ejercicio 13
        System.out.println("Introduce el dia mayor de un mes: ");
            int dia = sc.nextInt();
        if(dia==31){
            System.out.println("Los meses que tienen "+dia+" dias son: Enero, Marzo, Mayo, Julio, Agosto...");
        }else{
            if(dia==30){
                System.out.println("Los meses que tienen "+dia+" dias son: Abril, Junio, Septiembre y Noviembre");
            }else{
                if(dia==28 || dia==29){
                System.out.println("El mes que tiene "+dia+" dias es: Febrero");
                }
            }
        } 
        
        //Ejercicio 13 con switch
        System.out.println("Introduce el ultimo dia del mes: ");
            int dia = sc.nextInt();
            while(dia>31 || dia<28){
                System.out.println("No hay ningun mes con esos dias, introduce el ultimo dia de algun mes: ");
                dia=sc.nextInt();
            }
        switch (dia){
            case 28,29: System.out.println("Febrero"); 
                break;
            case 30: System.out.println("Abril, Junio, Septiembre y Noviembre"); 
                break;
            case 31: System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre"); 
                break;
            default:
                System.out.println("No hay ningun mes que tenga esos dias");
        }
        
       
        //Ejercicio 14
        System.out.println("Introduce el nombre del mes: ");
            String mes = sc.nextLine();
        switch (mes){
            case "enero","marzo","mayo","julio","agosto","octubre","diciembre": System.out.println("Tiene 31 dias");
                break;
            case "abril","junio","septiembre","noviembre": System.out.println("Tiene 30 dias");
                break;
            case "febrero": System.out.println("Tiene 28 o 29 dias");
                break; 
            default:
                System.out.println("No hay ningun mes que se llame asi");
        }
        
        //Ejercicio 15
        System.out.println("Introduce un número entre 1 y 99: ");
            int num = sc.nextInt();
            while (num>99||num<1){
                System.out.println("el numero que has introducido no esta entre 1 y 99, vuelve a introducir otro numero: ");
                num = sc.nextInt(); 
            }
        switch(num){
            case 1: System.out.println("uno");
                break;
            case 2: System.out.println("dos");
                break;
            case 3: System.out.println("tres");
                break;
            case 4: System.out.println("cuatro");
                break;
            case 5: System.out.println("cinco");
                break;
            case 6: System.out.println("seis");
                break;
            case 7: System.out.println("siete");
                break;       
        }
        
          
        
        //EJERCICIOS CONDICIONALES
        //ejercicio 1: sistema de becas universitarias
        System.out.println("Introduce tu nota media: ");
            double media = sc.nextDouble();
        System.out.println("¿Ha ganado una competición nacional? si/no");
            boolean comp = sc.next().equalsIgnoreCase("si");
        System.out.println("Introduce los ingresos familiares: ");
                int ingfam = sc.nextInt();
        System.out.println("¿Es familia numerosa? si/no");
                boolean numerosa = sc.next().equalsIgnoreCase("si");;
        int beca = 0;
        if (media>=9){
            System.out.println("Obtienes una beca completa");
            beca = beca + 100;
        }
        if(media>=7 && media<9){
            if(ingfam<20000){
                beca = beca + 75;
            }else{
                if(ingfam>=20000&&ingfam<=40000){;
                    System.out.println("Obtienes beca");
                    beca = beca + 50;
                }else{
                    System.out.println("No obtienes beca");
                }
            }
        }
        if(media>=5 && media<7){
            if(numerosa){
                System.out.println("Obtienes beca");
                beca = beca + 25;
            }else{
                System.out.println("No obtienes ninguna beca");
            }
        }
        if (comp==true &&media<9){
            beca = beca+10;
        }
        System.out.println("Obtienes una beca del "+beca+" %");

        //ejercicio 2: control de acceso a una atraccion
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Introduce tu altura en cm: ");
        int cm = sc.nextInt();
        System.out.println("¿Va acompañado de un adulto? si/no");
        boolean adulto = sc.next().equalsIgnoreCase("si");
        System.out.println("¿Tiene certificado médico? si/no");
        boolean certi = sc.next().equalsIgnoreCase("si");
        System.out.println("¿Tiene una lesion reciente? si/no");
        boolean lesion = sc.next().equalsIgnoreCase("si");
        if (lesion) {
            System.out.println("Acceso denegado: tienes una lesion reciente");
        } else if (edad > 65 && !certi) {
            System.out.println("Acceso denegado: Necesita un certificado medico");
        } else if (edad > 65 && certi) {
            System.out.println("Acceso permitido");
        } else {
            if (cm >= 140 && edad >= 12) {
                System.out.println("Acceso permitido");
            } else {
                if (((cm >= 130 && cm <= 139) && edad >= 12) && adulto) {
                    System.out.println("Acceso permitido con acompañante");
                } else if (((cm >= 130 && cm <= 139) && edad >= 12) && adulto == false) {
                    System.out.println("Acceso denegado: No va acompañado por un adulto");
                } else if ((cm >= 130 && cm <= 139) && edad < 12) {
                    System.out.println("Acceso denegado: Menor de 12 años");
                } else if (cm < 130 && edad >= 12) {
                    System.out.println("Acceso denegado: mide menos de 130cm");
                } else if (cm < 130 && edad < 12) {
                    System.out.println("Acceso denegado: mide menos de 130cm y tiene menos de 12 años");
                }
            } 
        }


        //ejercicio 3: cajero automatico inteligente
        System.out.println("Introduce el saldo de la cuenta: ");
        double saldo = sc.nextDouble();
        System.out.println("¿Cuanto desea retirar? ");
        double retirar = sc.nextDouble();
        System.out.println("¿Conoce el PIN? si/no");
        boolean pin = sc.next().equalsIgnoreCase("si");
        if (pin == false) {
            System.out.println("La operacion se cancela");
        } else {
            if (retirar <= 0) {
                System.out.println("ERROR: la cantidad es menor o igual que 0");
            } else if (retirar > saldo) {
                System.out.println("FONDOS INSUFICIENTES");
            } else if (retirar > 600) {
                System.out.println("Limite diario excedido");
            } else {
                System.out.println("Retirada ejecutada con exito");
                saldo = saldo - retirar;
                if (saldo < 100 && saldo > 0) {
                    System.out.println("ADVERTENCIA: tienes menos de 100 euros en la cuenta");
                } else if (saldo == 0) {
                    System.out.println("CUENTA VACIA");
                }
            }
        }

        int edad=19;
        boolean mayoredad; 

        if(edad>=18){
            mayoredad = true;
        }else{
            mayoredad = false;
        }
        mayoredad = edad>=18 ? true : false;
        System.out.println(mayoredad);

        int a = 9, b = 9, x;
        x = a == 10 ? b == 10 ? 100 : 1 : a ;
        System.out.println(x);
       
        int a = 1, b = 10, x;
        x = a == 10 ? b*2 : b == 10 ? 100 : a;
        System.out.println(x);

        
        //EJERCICIOS BIFURCACIONES CON TERNARIAS
        //Ejercicio 1
        System.out.println("Introduce un numero: ");
            double num = sc.nextDouble();
            String parimpar;
            String par = "es par";
            String impar = "es impar";
        parimpar = (num % 2==0) ? par : impar;
        System.out.println(parimpar);
        
        //Ejercicio 2
        System.out.println("Introduce un numero: ");
            double num1 = sc.nextDouble();
        System.out.println("Introduce un numero: ");
            double num2 = sc.nextDouble();
        String iguales;
        String si = "son iguales";
        String no = "no son iguales";
        iguales = num1==num2 ? si : no;
        System.out.println(iguales);   
        
        //Ejercicio 3
        System.out.println("Introduce un numero: ");
            double num1 = sc.nextDouble();
        System.out.println("Introduce un numero: ");
            double num2 = sc.nextDouble();
        String comparar;
        String mayor1 = +num1+" es mayor que "+num2;
        String mayor2 = +num1+" es menor que "+num2;
        comparar = num1>num2 ? mayor1 : mayor2;
        System.out.println(comparar);
        
        //Ejercicio 4
        System.out.println("Introduce un numero: ");
            double num1 = sc.nextDouble();
        System.out.println("Introduce un numero: ");
            double num2 = sc.nextDouble();
        String comparar;
        String mayor1 = "el numero 1: "+num1+" es mayor que el numero 2: "+num2;
        String mayor2 = "el numero 2: "+num2+" es mayor que el numero 1: "+num1;
        String iguales = "el numero 1: "+num1+" es igual que el numero 2: "+num2;
        comparar = num1>num2 ? mayor1 : num1==num2 ? iguales : mayor2;
        System.out.println(comparar);

        //Ejercicio 5
        System.out.println("Introduce un numero: ");
            double num = sc.nextDouble();
        String comparar;
        String casicero = num+" es un numero casi-cero";
        String no = num+" no es un numero casi-cero";
        comparar = num<1&&num>-1 ? casicero : no;
        System.out.println(comparar);

        //Ejercicio 6
        System.out.println("Introduce un numero: ");
            int num1 = sc.nextInt();
        System.out.println("Introduce un numero: ");
            int num2 = sc.nextInt();
        String comparar;
        String mayor1 = num1+" "+num2;
        String mayor2 = num2+" "+num1;
        comparar = num1>num2 ? mayor1 : mayor2;
        System.out.println(comparar);
        
        //Ejercicio 7
        System.out.println("Introduce un numero: ");
            double num = sc.nextDouble();
        String comparar;
        String casicero = num+" es un numero casi-cero";
        String no = num+" no es un numero casi-cero";
        double numero = Math.floor(Math.abs(num));
        comparar = numero==0 ? casicero : no;
        System.out.println(comparar);  

        //Ejercicio 9
        double dado1 = (Math.round(Math.random()*5))+1;
        double dado2 = (Math.round(Math.random()*5))+1;
        double suma = dado1+dado2;
        String comparar;
        String as = "AS";
        String rey = "REY";
        String reina = "REINA";
        String j = "J";
        String numero = "es una carta entre 1 y 10";
        comparar = 
        
        System.out.println(comparar);
        
        
        //ESTRUCTURAS DE CONTROL REPETITIVAS
        int i = 0;
        while (i<=100){
            System.out.println(i);
            i++;
        }
        
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i<=100);        
    
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        while (num !=2){
            System.out.println("funcionaa");
            num = sc.nextInt();
        }
        System.out.println("se termino");

        System.out.println("Introduce un numero");
            int num;
        do{
            num = sc.nextInt();
            if(num!=2){
                System.out.println("funcionaa");
            }
        }while (num !=2);
        System.out.println("se termino");

        int i = 0;
        while (i<=100){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }

        
        
        //EJERCICIOS BUCLES
        //Ejercicio 1
        int num = 0;
        while(num<=9){
            System.out.println(num);
            num++;
        }
       
        //Ejercicio 2
        System.out.println("Introduce un numero");
            int i = sc.nextInt();
        int num=1;
        while(num<=i){
            System.out.println(num);
            num++;
        }
         
        //Ejercicio 4
        System.out.println("Introduce el rango minimo");
            int num1 = sc.nextInt();
        System.out.println("Introduce el rango maximo");
            int num2 = sc.nextInt();    
        System.out.println("Introduce un numero");
            int num3 = sc.nextInt();
        while(num3<num1 || num3>num2){
            System.out.println("Ese numero esta fuera del rango, introduce otro");
            num3 = sc.nextInt();
        }

        
        //PLUS EJERCICIOS BUCLES
        //Ejercicio 1
        System.out.println("Introduce un numero");
            int num = sc.nextInt();     
        while (num>=0){
            System.out.println(num);
            num--;
        }
        
        //Ejercicio 2          
        int suma=0;
        System.out.println("Introduce un numero");
            int num = sc.nextInt();
        while (num!=0){
            suma += num;        
            System.out.println("Introduce un numero");
            num = sc.nextInt(); 
        }
        System.out.println("La suma es "+suma);
      
        //Ejercicio 3       
        System.out.println("Introduce un numero");
            int num = sc.nextInt();
        while (num<0){
            System.out.println("El numero que has introducido es negativo, introduce otro");
            num = sc.nextInt();
        }
        int contador = 0;
        while(num!=0){
            num=num/10;
            contador++;
        } 
        System.out.println("El numero tiene "+contador+" cifras");
      
        //Ejercicio 4
        System.out.println("Introduce un numero");
            int num = sc.nextInt();
        while (num<0){
            System.out.println("El numero que has introducido es negativo, introduce otro");
            num = sc.nextInt();
        }
        int num1= 0;
        String numero = "";
        while(num!=0){
            num1=num%10; 
            num=num/10;
            numero += num1;
        }
        System.out.println(numero);
       
        //Ejercicio 5
        System.out.println("Introduce un numero");
            int num = sc.nextInt();
        int multi = 1;
        int total = 0;
        while (multi<=10){
            total = num*multi;
            System.out.println(num +" x "+multi+" = "+total);
            multi++;
        }
        
        //Ejercicio 6        
        System.out.println("Introduce una base");
            int base = sc.nextInt();
        System.out.println("Introduce un exponente");
            int exp = sc.nextInt();

        */ 
       

    }
}
