public class VerificacaoDeNotas{
    private boolean aprovado; 
    private Aluno aluno;

    public VerificacaoDeNotas(Aluno aluno){
        this.aprovado = false;
        this.aluno = aluno;
    }    
    public boolean getAprovado() {
        return aprovado;
    }
   
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void setAluno(Aluno aluno){
       this.aluno = aluno;
    }

    public Aluno getAluno(){
       return this.aluno
    }

    //Implementar metods para mostrar se o aluno foi aprovado ou reprovado
    public void verficacaoDeAprovacaoDoAluno(){
        if(aluno.getSomaNotas() > 60){
            this.aprovado = true;
            System.out.printf("Nome Aluno: %s \n", aluno.getNome());
            System.out.printf("Sexo: %s \n", aluno.getSexo());
            System.out.printf("Final Grade: %.2f \n", aluno.getSomaNotas());
            System.out.printf("Aprovado/Reprovado: %s \n", this.aprovado);
        }else{
            this.aprovado = false;
            double faltou = (60.00 - aluno.getSomaNotas());            
            System.out.printf("Nome Aluno: %s \n", aluno.getNome());
            System.out.printf("Sexo: %s \n", aluno.getSexo());
            System.out.printf("Nota Final: %.2f \n", aluno.getSomaNotas());
            System.out.printf("Aprovado/Reprovado: %s \n", this.aprovado);
            System.out.printf("Faltou: %.2f \n", faltou);
        }
    }

}
