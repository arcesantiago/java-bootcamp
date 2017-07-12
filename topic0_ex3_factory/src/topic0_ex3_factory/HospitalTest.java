package topic0_ex3_factory;

public class HospitalTest {
	public static void main(String[] args) {
		//test pattern factory
		HospitalFactory hospitalFactory1 = new HospitalFactory();// test create new factory
		Hospital hospital1 = hospitalFactory1.getHospitalCentenario();// test create new hospitalCentenario
		System.out.println(hospital1);// toString()
		System.out.println("Number of dentist=" + hospital1.dentist());// test method return number of dentist
		
		HospitalFactory hospitalFactory2 = new HospitalFactory();
		Hospital hospital2 = hospitalFactory2.getHospitalParque();
		System.out.println(hospital2);
		System.out.println("Number of oculist=" + hospital2.oculist());
	}
}
