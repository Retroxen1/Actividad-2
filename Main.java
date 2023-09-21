import javax.management.NotCompliantMBeanException;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Variables
        Scanner scan = new Scanner(System.in);
        int entrada=1;
        int[] cal;
        cal=new int[5];
        String nombre;
        String opt;
        float prom = 0;
        int calfin;
        int x=0;
        String line="\n============================\n";

        //Nombre
        System.out.print("Cual es el nombre del alumno? \n...");
        nombre= scan.nextLine();

        //Opcion
        System.out.print("Que desea hacer? \nA)Promedio \nB)Calificacion final apartir del promedio \nC)Imprimir datos del programa \n...");
        opt= scan.nextLine();

        switch (opt.toLowerCase())
        {
            case "a":
                while (entrada-1<cal.length)
                {
                    System.out.print("Calificacion "+entrada+" de "+nombre+": ");
                    cal[entrada-1]= scan.nextInt();
                    entrada++;
                }
                for (int i = 0; i < cal.length; i++) {
                    prom = prom + cal[i];
                }
                System.out.print(line);
                System.out.println("Promedio de "+nombre+": " + prom/cal.length);
                System.out.print(line);
                break;

            case "b":
                System.out.print("Anote la calificacion final de "+nombre+": ");
                calfin = scan.nextInt();
                System.out.print(line);
                if (calfin<=50) {System.out.print("El promedio final de "+nombre+" es: F");}
                else if (calfin<=60){System.out.print("El promedio final de "+nombre+" es: E");}
                else if (calfin<=70){System.out.print("El promedio final de "+nombre+" es: D");}
                else if (calfin<=80){System.out.print("El promedio final de "+nombre+" es: C");}
                else if (calfin<=90){System.out.print("El promedio final de "+nombre+" es: B");}
                else {System.out.print("El promedio final de "+nombre+" es: A");}
                System.out.print(line);
                 break;

            case "c":
                while (entrada-1<cal.length)
                {
                    System.out.print("Calificacion "+entrada+" de "+nombre+": ");
                    cal[entrada-1]= scan.nextInt();
                    entrada++;
                }
                for (int i = 0; i < cal.length; i++) {
                    prom = prom + cal[i];
                }
                calfin= (int) prom/cal.length;
                System.out.print(line);
                System.out.println("Nombre del estudiante: "+ nombre);
                while (x<5)
                {
                    System.out.println("Calificacion "+x+": "+cal[x]);
                    x++;
                }

                if (calfin<=50) {System.out.print("El promedio final de "+nombre+" es: F");}
                else if (calfin<=60){System.out.print("El promedio final de "+nombre+" es: E");}
                else if (calfin<=70){System.out.print("El promedio final de "+nombre+" es: D");}
                else if (calfin<=80){System.out.print("El promedio final de "+nombre+" es: C");}
                else if (calfin<=90){System.out.print("El promedio final de "+nombre+" es: B");}
                else {System.out.print("El promedio final de "+nombre+" es: A");}
                System.out.print(line);
                break;

            default:
                System.out.print(line);
                System.out.println("Porfavor selecciona una de las opcionas A) B) o C)");
                System.out.print(line);
                break;
        }
    }
}