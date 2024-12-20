package testrendimiento;

public class TestRendimiento {

    public static void main(String[] args) {
        final String a = "Hello World!!!";
        final String b = "I'm Edu";
        String c = "";
        
        StringBuilder sb = new StringBuilder();

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            //c = c.concat(a).concat(b).concat("\n");
            //c += a + b + "\n";
            sb.append(a).append(b).append("\n");
        }

        long fin = System.currentTimeMillis();

        System.out.println("c = " + c);
        System.out.println("sb = " + sb);
        System.out.println("Tiempo = " + (fin - inicio));
    }

}
