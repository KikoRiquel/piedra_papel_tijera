import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class main {

  /**
   * @param args the command line arguments
   */
  public static void ppt() {
    Scanner sc = new Scanner(System.in);
    int contMaquina = 0;
    int contJugador = 0;

    while ((contMaquina != 3) && (contJugador != 3)) {
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
        switch (rand) {
          case 0:
            jugadaMaquina = "piedra";
            break;
          case 1:
            jugadaMaquina = "papel";
            break;
          case 2:
            jugadaMaquina = "tijeras";
            break;
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
            contJugador++;
            System.out.println(
              "Marcador: Jugador " + contJugador + " Maquina " + contMaquina
            );
          } else {
            System.out.println("has perdido");
            contMaquina++;
            System.out.println(
              "Marcador: Jugador " + contJugador + " Maquina " + contMaquina
            );
          }
        }

        System.out.println();

        if ((contMaquina == 3) || (contJugador == 3)) {
          System.out.println("Quieres volver a jugar? S/N");
          char respuesta = sc.next().charAt(0);
          respuesta = Character.toUpperCase(respuesta);

          if ((respuesta != 'S') && (respuesta != 'N')) {
            System.out.println("opcion no valida");
          } else {
            switch (respuesta) {
              case 'S':
                ppt();
                System.out.println(" ");
                break;
              case 'N':
                break;
            }
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);

    ppt();
    
  }
}
