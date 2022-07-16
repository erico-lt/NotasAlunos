public class Escola {
    public static void main(String[] args){
        Aluno erico = new Aluno("Érico", "M", 10.3, 10, 30.00);
        VerificacaoDeNotas veri = new VerificacaoDeNotas(erico);
        veri.verficacaoDeAprovacaoDoAluno();
    }
}
