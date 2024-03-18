class Empleado {
    /**
     * En este atributo se introduce el nombre del empleado
     */
    private String nombre;
    /**
     * En este atributo se introduce el cargo que ocupa este empleado
     */
    private String cargo;
    /**
     * En este atributo se introduce el salario del empleado
     */
    private double salario;
    /**
     * Array donde se almacenan los objetos empleado
     */
    private static Empleado[] lista;

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static Empleado[] getLista() {
        return lista;
    }
    /**
     * Constructor de empleado
     * @param nombre
     * @param cargo
     * @param salario
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }
    /**
     * Constructor de empleado por defecto
     */
    public Empleado() {
        
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
    /**
     * Metodo donde aumentar el salario de los empleados
     * @param porcentaje que quieres aumentar el salario
     */
    public static void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario); 
        }
    }
    /**
     * Metodo para inicializar a los empleados iniciales
     */
    public static void altaEmpleados(){

        lista = new Empleado[3];

        lista[0] = new Empleado("Juan", "Desarrollador", 50000);
        lista[1] = new Empleado("María", "Diseñadora", 45000);
        lista[2] = new Empleado("Pedro", "Gerente", 60000);

    }

    

    

}
