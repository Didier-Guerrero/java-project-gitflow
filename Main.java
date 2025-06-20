public class Main{
    public static void main(String[] args){
        System.out.println("***************");
        System.out.println("* JAVA PROJECT *");
        System.out.println("***************");
        Saludo saludo = new Saludo();
        System.out.println(saludo.generarSaludo("Mundo"));
        System.out.println(saludo.generarSaludo("Version 1.1.0 lista para produccion"));
        Despedida despedida = new Despedida();
        System.out.println(despedida.generarDespedida("Mundo"));
    }
}