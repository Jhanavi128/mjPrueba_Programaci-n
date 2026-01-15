package mjBussinessLogic.mjEntities;

import java.util.Scanner;


public class mjAutomata {

    static final int mjEr = -1;
    static final int ESTADO_FINAL = 5;
    static final String mjAlfabeto = "a,b,c,d,t, ";

    static final int[][] mt = {
        // a   b   c   d   t   esp
        { 1, -1, -1, -1, -1, -1 }, // 0
        { -1, 2, -1, -1, -1, -1 }, // 1
        { -1, 2,  3, -1, -1, -1 }, // 2
        { -1, -1, -1, 4, -1, -1 }, // 3
        { -1, -1, -1, -1, 5, -1 }, // 4
        { -1, -1, -1, -1, 5, -1 }  // 5 (estado final)
    };

    private int getIndexAlfabeto(String c) {
        String[] alfa = mjAlfabeto.split(",");
        for (int i = 0; i < alfa.length; i++) {
            if (alfa[i].equals(c)) {
                return i;
            }
        }
        return mjEr;
    }

    public boolean checkTipoArsenal(String mjArsenal) {
        int q = 0;

        for (int i = 0; i < mjArsenal.length(); i++) {
            int index = getIndexAlfabeto(mjArsenal.charAt(i) + "");

            if (index == mjEr || mt[q][index] == mjEr) {
                return false;
            }

            q = mt[q][index];
        }

        return q == ESTADO_FINAL;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        mjAutomata automata = new mjAutomata();

        System.out.print("Ingrese la cadena: ");
        String cadena = sc.nextLine();

        if (automata.checkTipoArsenal(cadena)) {
            System.out.println("BOOM");
        } else {
            System.out.println("NO BOOM");
        }

        sc.close();
    }
}
