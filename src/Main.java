public class Main {
    public static void main(String[] args) {

        int numeroif = 10;  //Bucle IF

        if (numeroif < 0) {
            System.out.println("Este numero es negativo");
        }
        if (numeroif == 0) {
            System.out.println("Este numero es = 0");
        } else System.out.println("Este nuemro es positvo");
//____________________________________________________________
        int numerowhile = -5;  //Bucle while

        while (numerowhile < 3) {
          System.out.println(numerowhile);
        numerowhile++;
        }
        int contador = 0;
//____________________________________________________________________
        do {                                //Bucle do while
         System.out.println(contador);
         contador++;
        } while (contador < 3);
//____________________________________________________________________

        for (int numerofor = 0; numerofor <= 3 ; numerofor++) { //Bucle for
          System.out.println(numerofor);
        }
        String estacion = "primavera";
//_____________________________________________________________________

        switch (estacion) {     //Bucle switch
            case "verano":
                System.out.println("Estas en la estacion verano mucho calor");
                break;
            case "primavera":
                System.out.println("Estas en la estacion primavera todo florece");
                break;
            case "otoño":
                System.out.println("Estas en la estacion otoño se caen las hojas");
                break;
            case "Invierno":
                System.out.println("Estas en la estacion invierno mucho frio");
                break;
            default:
                System.out.println("Escribe el nombre de una estacion");
        }
    }
}


