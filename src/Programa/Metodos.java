package Programa;
import java.util.ArrayList;
import java.util.Scanner;
import ContatosEChamadas.Chamadas;
import ContatosEChamadas.Contatos;

public class Metodos {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Contatos> lContatos = new ArrayList<Contatos>();
    Chamadas lChamadas = new Chamadas();

    public void cadastrarContato(){
        System.out.println("Digite o nome!");
        String nome = scanner.next();
        System.out.println("Digite o núemero!");
        int numero = scanner.nextInt();;
        lContatos.add(new Contatos(nome,numero));
    }

    public void removerContato(){
        System.out.println("Digite o nome do contato que será removido!");
        String nome = scanner.next();
        for(int i =0;i< lContatos.size();i++){
            if(lContatos.get(i).getNome().equalsIgnoreCase(nome))
                lContatos.remove(i);
            nome = "";
            break;
        }
    }

    public void cadastrarChamadaNAtendida(){
        System.out.println("Digite o nome!");
        String nome = scanner.next();
        System.out.println("Digite o núemero!");
        int numero = scanner.nextInt();;
        lChamadas.getContato().add(new Contatos(nome,numero));
    }

    public void mostrarListaChamadasNAtendidas(){
        if(lChamadas.getContato() == null)
            System.out.println("Lista Vazia!");
        else
            for(int i =0;i< lChamadas.getContato().size();i++) {
                System.out.println("Número: " + lChamadas.getContato().get(i).getNumero());
                for(int j=0;j< lContatos.size();j++){
                    if(lChamadas.getContato().get(i).getNumero()==lContatos.get(i).getNumero())
                        System.out.println("Nome: " + lContatos.get(i).getNome() + "\n" +
                                "Número: " + lChamadas.getContato().get(i).getNumero());
                    break;
                }
            }
    }

    public void excluirListaChamadas(){
        lChamadas.setContato(null);
        System.out.println("Todos os contatos foram excluídos!");
        }
    }

