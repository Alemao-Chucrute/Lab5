package Programa;
import java.util.Scanner;
import UI.ui;

public class RodaPrograma {
    Scanner scanner = new Scanner(System.in);
    ui u1 = new ui();
    Metodos m1 = new Metodos();

    public void rodaPrograma() {
        int opcao = 0;

        do {
            u1.menu();
            System.out.println("Digite a opção desejada!");
            opcao = scanner.nextInt();
            if (opcao == 1)
                m1.cadastrarContato();
            else if (opcao == 2)
                m1.removerContato();
            else if (opcao == 3)
                m1.cadastrarChamadaNAtendida();
            else if (opcao == 4)
                m1.mostrarListaChamadasNAtendidas();
            else if (opcao == 5)
                m1.excluirListaChamadas();
            else if (opcao == 6){
                System.out.println("Até Logo!");
                break;
            }
        } while (true);
    }

}