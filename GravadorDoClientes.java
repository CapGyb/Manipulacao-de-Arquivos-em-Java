import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class GravadorDoClientes {
    public static void main(){
     ArrayList<Cliente> clientes = new ArrayList<>();
     clientes.add(new Cliente("Alice", 30));
     clientes.add(new Cliente("Bob", 25));
     clientes.add(new Cliente("Carlos", 40));

     try {
         FileWriter escritor = new FileWriter("clientes.txt");
         for (Cliente c: clientes) {
             escritor.write(c.toString() + "\n");
         }
         escritor.close();
         System.out.println("Clientes gravados com sucesso!");
     } catch (IOException e) {
         System.out.println("Erro ao gravar clientes.");
         e.printStackTrace();
     }
    }
}
