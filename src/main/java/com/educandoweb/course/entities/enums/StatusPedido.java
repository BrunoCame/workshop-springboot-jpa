package com.educandoweb.course.entities.enums;

public enum StatusPedido {
	
	AGUARDANDO_PAGAMENTO(1),
	PAGO(2),
	ENVIADO(3),
	ENTREGUE(4),
	CANCELADO(5);
	
	private int code;
	
	private StatusPedido(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;	
	}
	
	public static StatusPedido valorDe(int code) {
		for(StatusPedido status : StatusPedido.values()) {
			if(status.getCode() == code) {
				return status;
			}
		}
		throw new IllegalArgumentException("Status Invalido");
	}

}
