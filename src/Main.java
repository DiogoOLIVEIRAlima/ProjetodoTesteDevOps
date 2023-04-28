import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Usuario> usuarios = new ArrayList();
        for (int i = 0; i < 3; i++){
            System.out.println("Digite o nome do colobarador " + (i + 1));
            String nome = teclado.nextLine();
            System.out.println("Digite o CPF do colaboardor " + (i + 1));
            String cpf = teclado.nextLine();
            System.out.println("Digite o telefone do colaborador " + (i + 1));
            String telefone = teclado.nextLine();
            System.out.println("Digite a data de nascimento do colaborador " + (i + 1));
            String dataNasc = teclado.nextLine();
            System.out.println("Digite a data de agendamento do colaborador " + (i + 1));
            String dataAg = teclado.nextLine();
            System.out.println("Digite o período do colaborador "+ (i + 1) );
            String periodo = teclado.nextLine();
            Usuario usuario = new Usuario(nome, cpf, telefone, dataNasc, dataAg, periodo);
            usuarios.add(usuario);
        }

        for (Usuario usu: usuarios){
            System.out.println(usu);
        }
    }
}