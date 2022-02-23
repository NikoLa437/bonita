package BonitaExternalApi.Api.DTO;

public class ZahtevZaNabavkuOpremeMakePaymentDTO {
	public String ZahtevZaNabavkuOpremeId;
	public double Cena;
	public ZahtevZaNabavkuOpremeMakePaymentDTO() {
		super();
	}
	public ZahtevZaNabavkuOpremeMakePaymentDTO(String zahtevZaNabavkuOpremeId, double cena) {
		super();
		ZahtevZaNabavkuOpremeId = zahtevZaNabavkuOpremeId;
		Cena = cena;
	}
}
