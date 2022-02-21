package BonitaExternalApi.Api.dto;

public class KursPaymentRequestDTO {
    public String KonferencijaKursId;
    public int UkupnoZaPlacanje;

    public KursPaymentRequestDTO() {
    }
    public KursPaymentRequestDTO(String konferencijaKursId, int ukupnoZaPlacanje) {
        KonferencijaKursId = konferencijaKursId;
        UkupnoZaPlacanje= ukupnoZaPlacanje;
    }
}
