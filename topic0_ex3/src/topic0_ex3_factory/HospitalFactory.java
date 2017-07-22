package topic0_ex3_factory;

public class HospitalFactory {
	
	public Hospital getHospitalCentenario(){
		return new HospitalCentenario();
	}
	
	public Hospital getHospitalParque(){
		return new HospitalParque();
	}

}
