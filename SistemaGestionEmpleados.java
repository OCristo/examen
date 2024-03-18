import java.util.Scanner;

public class SistemaGestionEmpleados {

    /*
     * //Crear una rama de trabajo como nombre de la rama, las siglas de tu nombre. Muévete a ella para trabajar.
    // Modifica la visibilidad a private de los atributos de la clase empleados y añade sus setters y getters. Esto implicará cambios en la clase principal para que el código sigua funcionando. 
    // Haz un commit con una frase como explicación de la mejora anterior.
    // Separa la lógica de gestión de todos los empleados en SistemaGestionEmpleados a una clase nueva llamada Empleados, distinta de la aplicación principal (main). Esta nueva clase contendrá el array de empleados, un nuevo método para mostrar el listado de los empleados código que está en el main, el método de aumentar salario y un nuevo método para dar de alta empleados que se debe usar en el main para añadir los tres empleados del ejemplo. La nueva clase Empleados contendría el atributo empleados que es el array de "Empleado", esto sería válido pero algo redundante en su uso tipo: empleados.empleados, así que se pide refactorizar el nombre del atributo empleados al nombre lista quedando al usarlo como empleados.lista. Esta nueva clase debe ser usada correctamente desde el método main para que el código siga funcionando exactamente igual.
    // Haz un commit con una frase como explicación de la mejora anterior.
    Crea una clase estática con todos los textos fijos (magic strings) usados en pantalla como constantes para facilitar la corrección de textos y traducciones de idiomas. Por su puesto, sustituye el uso de los strings por el uso de las constantes correspondientes.
    Haz un commit con una frase como explicación de la mejora anterior.
    Crea una nueva rama llamada Doc y muévete a ella para trabajar.
    Documenta en la rama Doc, usando filosofía JavaDoc, todo el código de las tres clases resultantes, sus atributos y métodos.
    Haz un commit con una frase como explicación de la mejora anterior.
    Mezcla la rama Doc con la rama con tus iniciales
    Mezcla la rama de tus iniciales con la rama main donde debe estar el resultado de todo el código modificado pero funcionando exactamente igual que el código original.
    Publica el resultado en tu Github
    Modifica el Readme.md de tu repositorio incluyendo tu nombre completo y una captura de pantalla de una vista visual en tu editor de código de las ramas y los commits de tu proyecto. Puedes instalar alguna extensión o herramienta visual que permita esta visualización. Para poder incluir la imagen de la captura en el Readme.md tendrás que subirla también al repositorio.
    Responde a la tarea con la URL de tu repositorio.
     */

    public static void main(String[] args) {
        
        Empleado.altaEmpleados();

        Scanner scanner = new Scanner(System.in);
        Metodos.mostrarMensaje(Metodos.introduzcaPorcentaje);
        double porcentaje = scanner.nextDouble();

        Empleado.aumentarSalario(porcentaje);
        
        Metodos.mostrarMensaje(Metodos.mostrarListaEmpleados);
        for (Empleado empleado : Empleado.getLista()) {
            System.out.println(empleado);
        }

        scanner.close();
    }
}
