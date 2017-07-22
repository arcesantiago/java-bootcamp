package topic0_ex3_factory;

public class HospitalParque extends Hospital{
	//Return values of hospital
	@Override
	public int traumatologist() {
		return 22;
	}

	@Override
	public int dentist() {
		return 15;
	}

	@Override
	public int dermatologist() {
		return 11;
	}

	@Override
	public int oculist() {
		return 9;
	}

	@Override
	public int nutritionist() {
		return 7;
	}
	//return a description of this instance
	public String toString(){
		return "[Hospital[Parque[List of specialista: Traumatologist=" + traumatologist() +
				" ,Dentist=" + dentist() + " ,Dermatologist=" + dermatologist()
				+ " ,Oculist=" + oculist() + ", Nutritionist=" + nutritionist() + "]";
	}

}
