package T21;

public class Eleicao {

	public static void main(String[] args) {
		Partido p1 = new Partido(Partidos.PT.getPartido(), Partidos.PT.getIdeologia(), Partidos.PT.getSigla(), Partidos.PT.getNum());
		Partido p2 = new Partido(Partidos.PSDB.getPartido(), Partidos.PSDB.getIdeologia(), Partidos.PSDB.getSigla(), Partidos.PSDB.getNum());
		Partido p3 = new Partido(Partidos.PSOL.getPartido(), Partidos.PSOL.getIdeologia(), Partidos.PSOL.getSigla(), Partidos.PSOL.getNum());
		Partido p4 = new Partido(Partidos.PTB.getPartido(), Partidos.PTB.getIdeologia(), Partidos.PTB.getSigla(), Partidos.PTB.getNum());
		Candidato c1 = new Candidato("Marcelinho", "Brasileiro", p1);
		Candidato c2 = new Candidato("Ronaldo", "Americano", p2);
		Candidato c3 = new Candidato("Tiririca", "Grego", p3);
		
		System.out.println("Candidato: "+ c1.getNome() + " de nacionalidade " + c1.getNacionalidade() +
				" está no partido " + c1.getPartido().getNome());
		c1.setPartido(p3);
		System.out.println("Candidato: "+ c1.getNome() + " de nacionalidade " + c1.getNacionalidade() +
				" está no partido " + c1.getPartido().getNome());
		c1.setPartido(p4);
		System.out.println("Candidato: "+ c1.getNome() + " de nacionalidade " + c1.getNacionalidade() +
				" está no partido " + c1.getPartido().getNome());
		System.out.println("Candidato: "+ c2.getNome() + " de nacionalidade " + c2.getNacionalidade() +
				" está no partido " + c2.getPartido().getNome());
		c3.setPartido(p2);
		System.out.println("Candidato: "+ c3.getNome() + " de nacionalidade " + c3.getNacionalidade() +
				" está no partido " + c3.getPartido().getNome()+ " Num: "+ c3.getPartido().getNum() + " Ideologia: " + c3.getPartido().getIdeologia());
		
		
	}

}
