package gcm.basics;

public class MyFirstClass {

    public static void main(String []args)
    {
       int edadJhon = 27;
       int edadCamila = 13;
       System.out.println("Jhon " + esMayorDeEdad(edadJhon));
       System.out.println("Camila " + esMayorDeEdad(edadCamila));
    }

    public static String esMayorDeEdad(int edad){
        // (condición) ? ejecuacion_si_verdadero : ejecución_si_falso;
        return edad >= 18 ? "Es mayor de edad" : "Es menor de edad";
    }

    public static String esMayorDeEdadConIf(int edad){
        if(edad >= 18){
            return "Es mayor de edad";
        }else {
            return "Es menor de edad";
        }
    }
}
