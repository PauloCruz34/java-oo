package escola.turma;

public class Turma {
	Aluno[] alunos;
	
	void imprimeAlunos() {
		for(int i = 0; i < this.alunos.length; i++) {
			Aluno aluno = this.alunos[i];
			System.out.println(aluno.nota);
		}
		
	}
}
