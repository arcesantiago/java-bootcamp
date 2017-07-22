package topic0_ex3_factory;

public class HospitalCentenario extends Hospital {
	//Return values of hospital
	@Override
	public int traumatologist() {
		return 14;
	}

	@Override
	public int dentist() {
		return 11;
	}

	@Override
	public int dermatologist() {
		return 9;
	}

	@Override
	public int oculist() {
		return 4;
	}

	@Override
	public int nutritionist() {
		return 3;
	}
	// Return a description of this instance
	public String toString(){
		return "[Hospital[Centenario[List of specialista: Traumatologist=" + traumatologist() +
				" ,Dentist=" + dentist() + " ,Dermatologist=" + dermatologist()
				+ " ,Oculist=" + oculist() + ", Nutritionist=" + nutritionist() + "]";
	}
}
