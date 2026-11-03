import java.util.Scanner;
import java.util.Arrays;
public class ApuntesArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int t[] = {8, 41, 37, 22, 19};

        //Muestra el contenido del array entre corchetes 
        //y separado por comas
        System.out.println(Arrays.toString(t));
        
        //Ordena la tabla de menor a mayor
        Arrays.sort(t);

        System.out.println(Arrays.toString(t));

        //Para buscar un elemnto en la tabla que devuelve el indice 
        //donde esta o un valor negativo si no esta
        //Ejemplo, buscar elemento en la tabla t
        int pos = Arrays.binarySearch(t, 19);
        if (pos >= 0){
            System.out.println("Se encontro en la posicion: " + pos);
        }

        else{
            System.out.println("No se encontro el elemento!");

        }

        //Para crear una copia de una tabla se necesita crear otra, 
        // se establece que tabla, vamos a copiar y su tamaño, 
        // en este caso lo hemos hecho para q sea identica
        int copiaT[] = Arrays.copyOf(t, t.length);
        System.out.println(Arrays.toString(copiaT));
        
        //Si queremos copiar algo establecido entre dos puntos, 
        // usamos lo siguiente
        copiaT = Arrays.copyOfRange(t, 1, 4);
        System.out.println(Arrays.toString(copiaT));

        //Para copiar en la tabla destino desde un punto en concreto lo de otra tabla
        // Utilizammos lo siguiente: decimos que queremos copiar y desde donde, luego 
        // su destino y desde que parametro y cuanto elementos de origen queremos copiar
        
        System.arraycopy(t, 0, copiaT, 0, 5 );
        
        //No es lo mismo comparar dos tablas con == que con equals, 
        // con uno estamos comparando su ID y el otro su contenido
        if (Arrays.equals (t, copiaT) == true){
            System.out.println("Son iguales!");

        }

        else {
            System.out.println("No son iguales!");
            
        }


        //**************************************************************
                                    //STRINGS Y CHAR
        //**************************************************************


        //Nos permite saber si es un digito, eso lo hacemos 
        // incorporandolo a un boolean para luego imprimirlo (true / false)
        char c1 = '2', c2 = 'p', c3 = 'A', c4 = ' ';
        boolean esUnDigito = Character.isDigit(c1);
        System.out.println("Es un digito?: " + esUnDigito);

        esUnDigito = Character.isDigit(c2);
        System.out.println("Es un digito?: " + esUnDigito);

        //Lo mismo pero determina si es una letra
        boolean esUnaLetra = Character.isLetter(c1);
        System.out.println("Es una letra?: " + esUnaLetra);

        esUnaLetra = Character.isLetter(c2);
        System.out.println("Es una letra?: " + esUnaLetra);

        //Si queremos saber si es letra O numero
        boolean esCaracterONumero = Character.isLetterOrDigit(c1);
        System.out.println("Es un digito o caracter?: " + esCaracterONumero);

        esCaracterONumero = Character.isLetterOrDigit(c2);
        System.out.println("Es un digito o caracter?: " + esCaracterONumero);

        esCaracterONumero = Character.isLetterOrDigit('%');
        System.out.println("Es un digito o caracter?: " + esCaracterONumero);

        //Si queremos saber si son caracteres en minuscula
        boolean esMinuscula = Character.isLowerCase(c2);
        System.out.println("Es una minuscula?: " + esMinuscula);

        esMinuscula = Character.isLowerCase(c3);
        System.out.println("Es una minuscula?: " + esMinuscula);

        //Si queremos saber si son mayusculas
        boolean esMayuscula = Character.isUpperCase(c2);
        System.out.println("Es una minuscula?: " + esMayuscula);

        esMayuscula = Character.isUpperCase(c3);
        System.out.println("Es una minuscula?: " + esMayuscula);

        //Si es un espacio
        boolean esEspacio = Character.isSpaceChar(c2);
        System.out.println("Es un espacio?: " + esEspacio);

        esEspacio = Character.isSpaceChar(c4);
        System.out.println("Es un espacio?: " + esEspacio);

        //Si queremos convertir una letra en minuscula
        c2 = Character.toLowerCase(c2);
        System.out.println(c2);

        c3 = Character.toLowerCase(c3);
        System.out.println(c3);

        //Si queremos convertir una letra en mayuscula
        c2 = Character.toUpperCase(c2);
         System.out.println(c2);

        c3 = Character.toUpperCase(c3);
        System.out.println(c3);

        //Si queremos obtener un caracter en una posicion en especifico
        String cadena = "Hola me llamo Angels";

        System.out.println(cadena.charAt(3));

        //Si queremos que nos imprima una parte concreta de la cadena
        System.out.println(cadena.substring(14, 19));

        //Si queremos que nos imprima desde cierto punto 
        // hasta el final omitimos el ultimo numero
        System.out.println(cadena.substring(14));

        //Para separar un String y obtener cada una de las palabras o frases podemos hacerlo
        //  utilizando un factor, por ejemplo " " y usando split, que guardara cada una de 
        // las frases o palabras en un array para luego recorrerlo y verlo

        String [] tablaCadena = cadena.split(" ");

        for (int i = 0; i < tablaCadena.length ; i++){
            System.out.println(tablaCadena[i]);
        }

        sc.close();

    }
}