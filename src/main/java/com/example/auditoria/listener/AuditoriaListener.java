package com.example.auditoria.listener;

import com.example.auditoria.model.DepositoEvento;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AuditoriaListener {

    @RabbitListener(queues = "auditoriaDepositos")
    public void procesarEvento(@Payload DepositoEvento evento) {
        log.info("Evento recibido de RabbitMQ: " + evento);
    }
}
