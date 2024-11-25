package br.com.ranevesfood.pedidos.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

import br.com.ranevesfood.pedidos.dto.PagamentoDto;

@Configuration
public class PagamentoListemer {
	@RabbitListener(queues = "pagamentos.detalhes-pedido")
	public void recebeMensagem(PagamentoDto pagamento) {
		 String mensagem = "ID:"+ pagamento.getId() + " - "
	                +"ID Pedido:"+pagamento.getPedidoId()+
	               "Valor:"+ pagamento.getValor()+
	               "Status:"+ pagamento.getStatus()+"";
        System.out.println("Recebi a mensagem: "+mensagem);
    }

}
