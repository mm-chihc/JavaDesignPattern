public class Sample {
	public static void main(String[] args){

		// パターン１（継承）
		Chairperson chairperson1 = new NewTaro();
		chairperson1.organizeClass();

		// パターン２ (委譲)
		Chairperson chairperson2 = new Hanako();
		chairperson2.organizeClass();

	}
}
