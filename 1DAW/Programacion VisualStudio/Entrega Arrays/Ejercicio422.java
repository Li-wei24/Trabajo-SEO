import java.util.Scanner;
public class Ejercicio422 {

    //Desarrolla una aplicación que ayude a gestionar las notas de un centro educativo. Los
    //alumnos se organizan en grupos compuestos por 5 personas. Leer las notas (números
    //enteros) del primer, segundo y tercer trimestre de un grupo. Debes mostrar al final la nota
    //media del grupo en cada trimestre y la media del alumno que se encuentra en una posición
    //dada (que el usuario introduce por teclado)
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        // Creamos la tabla: 5 filas para los chavales y 3 columnas para sus notas
        int[][] notasAlumnos = new int[5][3];
        
        // Variables para ir sumando las notas de todo el grupo por cada trimestre
        int mediaGrupo1 = 0;
        int mediaGrupo2 = 0;
        int mediaGrupo3 = 0;
        
        // Acumuladores para sacar luego la media de cada alumno por separado
        int mediaAlumno1 = 0;
        int mediaAlumno2 = 0;
        int mediaAlumno3 = 0;
        int mediaAlumno4 = 0;
        int mediaAlumno5 = 0;

        // Empezamos a recorrer la tabla con dos for
        for (int fila = 0; fila < notasAlumnos.length; fila++){
            for(int columna = 0; columna < notasAlumnos[fila].length; columna++){
                System.out.println("Introduce las notas del alumno " + (fila +1) + " del trimestre " + (columna+1) + ": ");
                notasAlumnos[fila][columna] = sc.nextInt();
                
                // Aquí voy sumando las notas para la media del grupo dependiendo del trimestre (columna)
                if (columna == 0){
                    mediaGrupo1 += notasAlumnos[fila][columna];
                }
                
                else if (columna == 1){
                    mediaGrupo2 += notasAlumnos[fila][columna];
                }
                
                else if (columna == 2){
                    mediaGrupo3 += notasAlumnos[fila][columna];
                }
                
                // Y aquí voy sumando las de cada alumno fijándome en la fila en la que estamos
                if (fila == 0){
                    mediaAlumno1 += notasAlumnos[fila][columna];
                }
                
                else if (fila == 1){
                    mediaAlumno2 += notasAlumnos[fila][columna];
                }
                
                else if (fila == 2){
                    mediaAlumno3 += notasAlumnos[fila][columna];
                }
                
                else if (fila == 3){
                    mediaAlumno4 += notasAlumnos[fila][columna];
                }
                
                else if (fila == 4){
                    mediaAlumno5 += notasAlumnos[fila][columna];
                }
                
            }
        }
        
        

        // Le preguntamos al usuario de qué alumno quiere saber la nota media
        System.out.println("De que alumno quieres la media? (1-5): ");
        int alumno = sc.nextInt();
        
        System.out.print("Media del alumno " + alumno + ": ");
        // Usamos un switch para mostrar la suma que toque dividida entre 3 trimestres
        switch (alumno) {
            case 1:
                System.out.println(mediaAlumno1 / 3.0);
                break;
            case 2:
                System.out.println(mediaAlumno2 / 3.0);
                break;
            case 3:
                System.out.println(mediaAlumno3 / 3.0);
                break;
            case 4:
                System.out.println(mediaAlumno4 / 3.0);
                break;
            case 5:
                System.out.println(mediaAlumno5 / 3.0);
                break;
            default:
                System.out.println("No existe ese alumno!");
                break;
        }
        
        // Por último sacamos por pantalla las medias de todo el grupo
        System.out.println("Medias del grupo:");
        System.out.println("Trimestre 1: " + (mediaGrupo1 / 5.0));
        System.out.println("Trimestre 2: " + (mediaGrupo2 / 5.0));
        System.out.println("Trimestre 3: " + (mediaGrupo3 / 5.0));
      
         sc.close(); // Cerramos el scanner para que no de guerra
    }
}