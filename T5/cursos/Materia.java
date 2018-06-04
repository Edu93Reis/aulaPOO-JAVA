package cursos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Materia {
	private String nome;
	private double nota = 0;
	private double cargaHoraria = 0;
	private Date horario;
	private int semestre;
	
	public Materia(String nome, double cargaHoraria, String horario, int semestre) {
		this.nome = nome;
		this.nota = nota;
		this.cargaHoraria = cargaHoraria;
		try {
			SimpleDateFormat converte = new SimpleDateFormat("HH:mm");		
			this.horario = converte.parse(horario);
		}catch(ParseException e) {
			e.printStackTrace();
		}
			
		this.semestre = semestre;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getNota() {
		return this.nota;
	}
	
	public void setNota(double nota) {
		if(nota>=0 && nota <=10) {
			this.nota = nota;
		}else {
			System.out.println("Nota deve ser maior que 0 e menor que 10");
		}
	}

	public double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(double cargaHoraria) {
		do {
			if(cargaHoraria <= 0) {
				System.out.println("Carga horária não pode ser menor que zero");
			} else {
				this.cargaHoraria = cargaHoraria;
			}
		}while(cargaHoraria<=0);
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		do{
			if(horario == null) {
				System.out.println("Horário não pode ser campo vazio");
			}else {
				this.horario = horario;
			}
		}while(horario == null);		
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
}
