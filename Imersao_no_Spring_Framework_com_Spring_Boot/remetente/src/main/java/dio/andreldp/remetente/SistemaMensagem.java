package dio.andreldp.remetente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreplay;
    @Autowired
    private Remetente teamTech;

    public void enviarConfirmacaoCadastro(){
        System.out.println(noreplay);
        System.out.println("Cadastro efetuado com sucesso! ");

    }

    public void enviarMensagemBoasVindas(){
        teamTech.setEmail("andrerj2000@gmail.com");
        System.out.println(teamTech);
        System.out.println("Seja bem vindo ao DioGlobal! ");

    }

}
