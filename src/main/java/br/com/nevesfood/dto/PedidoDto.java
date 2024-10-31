package br.com.nevesfood.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.nevesfood.nodel.Status;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDto {

    private Long id;
    private LocalDateTime dataHora;
    private Status status;
    private List<ItemDoPedidoDto> itens = new ArrayList<>();



}
