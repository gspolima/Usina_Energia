package com.estacio.programacaoII;

public class Main {

    public static void main(String[] args) {
	    Usina usinaNuclear = new Usina(
	            "Usina Nuclear Angra 2",
                1.700,
                1.350);

        System.out.println(usinaNuclear.mostrarUsina());

        Usina usinaDrManhattan = new Usina();

        System.out.println(usinaDrManhattan.mostrarUsina());
    }
}
