package BonitaExternalApi.Api.DTO;

public class MostFrequentPartOfDayDTO {

	public String Name;
	
	public String From;
	
	public String To;

	public Long Count;

	public MostFrequentPartOfDayDTO() {}

	public MostFrequentPartOfDayDTO(String name, String from, String to, Long count) {
		super();
		Name = name;
		From = from;
		To = to;
		Count = count;
	}
	
	
}
