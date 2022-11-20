package ContatosEChamadas;
import java.util.ArrayList;

public class Chamadas {
    private ArrayList<Contatos> contato;

    public Chamadas() {
        contato = new ArrayList<>();
    }

    public ArrayList<Contatos> getContato() {
        return contato;
    }

    public void setContato(ArrayList<Contatos> contato) {
        this.contato = contato;
    }
}

