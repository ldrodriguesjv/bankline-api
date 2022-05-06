package com.dio.santander.bankline.api.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NovaMovimentacao;
import com.dio.santander.bankline.api.model.Movimentacao;

@Service
public class MovimentacaoService {
	public void save(NovaMovimentacao novaMovimentacao) {
		Movimentacao movimentacao = new Movimentacao();
		
		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setDescricao(novaMovimentacao.getDescricao());
		movimentacao.setIdConta(novaMovimentacao.getIdConta());
		movimentacao.setTipo(novaMovimentacao.getTipo());
		movimentacao.setValor(novaMovimentacao.getValor());
		
		
	}
}
