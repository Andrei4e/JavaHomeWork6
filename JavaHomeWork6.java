import java.util.Scanner;

public class JavaHomeWork6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Введите координату x точки старта: ");
    int x = scanner.nextInt();
    System.out.printf("Введите координату y точки старта: ");
    int y = scanner.nextInt();
    scanner.close();
    
    Game game = new Game(x , y);
    game.PrintMap();
    game.FindExit();
    game.PrintMap();
  }
}