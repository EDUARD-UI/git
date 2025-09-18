public class App {

    public static void main(String[] args) {
        Persona persona1 = new Persona("superman", "hombre de acero");
        Persona persona2 = new Persona("hulk", "verde");
        persona1.volar();
        persona2.comer();

        System.out.println(persona1);
    }
}
