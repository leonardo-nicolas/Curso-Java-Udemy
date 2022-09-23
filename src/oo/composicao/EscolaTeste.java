package oo.composicao;

public class EscolaTeste {
	public static void main(String[] args) {
		Aluno mariana = new Aluno("Mariana");
		Aluno marcelo = new Aluno("Marcelo");
		Aluno jainara = new Aluno("Jainara");
		Aluno juliana = new Aluno("Juliana");
		Aluno gabriel = new Aluno("Gabriel");
		Aluno gustavo = new Aluno("Gustavo");
		Aluno mariano = new Aluno("Mariano");
		Aluno marcele = new Aluno("Marcele");
		Aluno nicolas = new Aluno("Nicolas");
		Aluno rodrigo = new Aluno("Rodrigo");
		Aluno viviane = new Aluno("Viviane");
		Aluno vitoria = new Aluno("Vitória");
		Aluno raphael = new Aluno("Raphael");
		Aluno waleska = new Aluno("Waleska");
		
		Curso java = new Curso("Java");
		Curso csharp = new Curso("C#");
		Curso react = new Curso("React");
		Curso logica = new Curso("Lógica de Programação");

		java.matricularAluno(waleska);
		java.matricularAluno(raphael);
		java.matricularAluno(nicolas);
		
		react.matricularAluno(vitoria);
		react.matricularAluno(rodrigo);
		react.matricularAluno(mariana);
		
		csharp.matricularAluno(jainara);
		csharp.matricularAluno(gabriel);
		csharp.matricularAluno(marcelo);
		
		// Jeito 1 para fazer relação bi-direcional
		waleska.adicionarCursos(logica);
		raphael.adicionarCursos(logica);
		vitoria.adicionarCursos(logica);
		viviane.adicionarCursos(logica);
		rodrigo.adicionarCursos(logica);
		nicolas.adicionarCursos(logica);
		gustavo.adicionarCursos(logica);
		marcelo.adicionarCursos(logica);
		
		// Jeito 2 para fazer relação bi-direcional
		logica.matricularAluno(marcele);
		logica.matricularAluno(mariano);
		logica.matricularAluno(gabriel);
		logica.matricularAluno(juliana);
		logica.matricularAluno(jainara);
		logica.matricularAluno(mariana);
		
		for(Aluno aluno: logica.alunos) {
			System.out.printf(
				"Aluno(a) %s está matriculado(a) no curso %s.",
				aluno.nome, logica.nome
			);
			System.out.println();
		}
		
		System.out.println(
			"Alunos do curso " + nicolas.cursos.get(0).nome + ":" + 
			nicolas.cursos.get(0).alunos // Nícolas está matriculado em 2 cursos...
		);
		
		Curso cursoJavaRodrigo = rodrigo.obterCursoPorNome("React");
		if(cursoJavaRodrigo != null) {
			System.out.println(cursoJavaRodrigo.alunos);
		}
	}
}
