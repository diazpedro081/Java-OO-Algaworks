import com.google.gson.Gson;

import modelo.Cliente;
import servico.ServicoCadastroCliente;

public class TrabalhandoComJson {

    public static void main(String[] args) {
        ServicoCadastroCliente cadastro = new ServicoCadastroCliente();
        Gson gson = new Gson();
        String json = gson.toJson(cadastro.cadastrarCLiente());

        System.out.println(json);

        /*
         * json gerado
         * {"nome":"João ","idade":19,
         * "endereco":
         * {"rua":"Rua das Flores, 37","cidade":"São Paulo","estado":"SP"},
         * "telefones":[
         * {"tipo":"RESIDENCIAL","numero":"11 9 94491775"},
         * {"tipo":"RESIDENCIAL","numero":"11 9 94491775"}]}
         */

        Cliente cliente = gson.fromJson(json, Cliente.class);
        System.out.println(cliente.getNome());
        System.out.println(cliente
                .getTelefones()
                .get(0)
                .getNumero());
    }
}
