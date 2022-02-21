package BonitaExternalApi.Api.DTO;

public class MostFrequentCityDTO {

	public String Name;
	
	public Long Count;
	
	public MostFrequentCityDTO() {}

	public MostFrequentCityDTO(String name, Long count) {
		super();
		Name = name;
		Count = count;
	}
	
	
}
