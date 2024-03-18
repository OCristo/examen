class Empleado {
    private String nombre;
    private String cargo;
    private double salario;
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

    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

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

    public static void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario); 
        }
    }

    public static void altaEmpleados(){

        lista = new Empleado[3];

        lista[0] = new Empleado("Juan", "Desarrollador", 50000);
        lista[1] = new Empleado("María", "Diseñadora", 45000);
        lista[2] = new Empleado("Pedro", "Gerente", 60000);

    }

    

    

}
