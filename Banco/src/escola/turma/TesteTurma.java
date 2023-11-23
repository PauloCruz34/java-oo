package escola.turma;

public class TesteTurma {

	public static void main(String[] args) {
		Turma fj11 = new Turma();
		fj11.alunos = new Aluno[10];	
		
		fj11.alunos[0] = new Aluno();
		fj11.alunos[0].nome = "Joao";
		fj11.alunos[0].nota = 10;
		
		fj11.imprimeAlunos();
				

	}

}
