/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */

import java.util.Scanner;

public class main {

  /**
   * @param args the command line arguments
   */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      String miMovimiento = sc.nextLine();

      if (miMovimiento.equals("quitar")) {
        break;
      }

      if (
        !miMovimiento.equals("piedra") &&
        !miMovimiento.equals("papel") &&
        !miMovimiento.equals("tijeras")
      ) {
        System.out.println("Movimiento Invalido");
      } else {
        int rand = (int) (Math.random() * 3);

        String jugadaMaquina = "";
        if (rand == 0) {
          jugadaMaquina = "piedra";
        } else if (rand == 1) {
          jugadaMaquina = "papel";
        } else {
          jugadaMaquina = "tijeras";
        }

        System.out.println("La maquina ha sacado " + jugadaMaquina);

        if (miMovimiento.equals(jugadaMaquina)) {
          System.out.println("empate");
        } else {
          if (
            (
              miMovimiento.equals("piedra") && jugadaMaquina.equals("tijeras")
            ) ||
            (miMovimiento.equals("papel") && jugadaMaquina.equals("piedra")) ||
            (miMovimiento.equals("tijeras") && jugadaMaquina.equals("papel"))
          ) {
            System.out.println("has ganado");
          } else {
            System.out.println("has perdido");
          }
        }
        System.out.println();
      }
    }
  }
}
/* -------------------------------------------------------------------------- */
/* -------------------------------------------------------------------------- */
