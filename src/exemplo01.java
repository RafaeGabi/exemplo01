public class exemplo01 {
        public static void main(String[] args) {
            double N1, N2, N3, N4, RES;
            System.out.print("Informe a Sua Nota do Primeiro Bimestre por favor. ");
            N1 = Double.parseDouble(System.console().readLine());
            System.out.print("Informe a Sua Nota do Segundo Bimestre por favor. ");
            N2 = Double.parseDouble(System.console().readLine());
            System.out.print("Informe a Sua Nota do Terceiro Bimestre por favor. ");
            N3 = Double.parseDouble(System.console().readLine());
            System.out.print("Informe a Sua Nota do Quarto Bimestre por favor. ");
            N4 = Double.parseDouble(System.console().readLine());

            RES = (N1 + N2 + N3 + N4) / 4;

            System.out.printf("Média de Notas = %.1f\n", RES);
        }
    }
