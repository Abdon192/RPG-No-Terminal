package rpg;

public class Rpg {

	public static void main(String[] args) {

		try {

			Personagem person = new Personagem("Abdon", 11, ClassePersonagem.ARQUEIRO);
			person.golpeComum();

			System.out.println(person.golpeComum());

			switch (person.getClasse()) {

			case ARQUEIRO:
				System.out.println(golpeEspecial(new EspecialArqueiro()));
				break;

			case GUERREIRO:
				System.out.println(golpeEspecial(new EspecialGuerreiro()));
				break;

			case MAGO:
				System.out.println(golpeEspecial(new EspecialMago()));
				break;

			}
			if (person.getPassos() < 10) {
				throw new ArmadilhaException();

			}

			if (person.getNome() == "Abdon") {
				throw new AdmException();
			}

		} catch (AdmException e) {

			System.out.println(e.getMessage());

		}

		catch (ArmadilhaException e) {

			System.out.println(e.getMessage());
		}

	}

	private static String golpeEspecial(Especial e) {
		return e.golpeEspecial();
	}

}
