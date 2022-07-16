public class Aluno {
    private String nome;
    private String sexo;
    private double notaPriSem;
    private double notaSegSem;
    private double notaTerSem;
    private double somaNotas;

    public Aluno(String nome, String sexo, double notaPriSem, double notaSegSem, double notaTerSem){
        this.setNome(nome);
        this.setSexo(sexo);
        this.setNotaPriSem(notaPriSem);
        this.setNotaSegSem(notaSegSem);
        this.setNotaTerSem(notaTerSem);
        this.somaNotas = this.notaPriSem + this.notaSegSem + this.notaTerSem;
    }

    public void notaPrimeiroSemestre(double notaPriSem){
        this.notaPriSem = notaPriSem;
    }

    public void notaSegundoSemestre(double notaSegSem){
        this.notaSegSem = notaSegSem;
    }

    public void notaTerceiroSemestre(double notaTerSem){
        this.notaTerSem = notaTerSem;
    }

    protected void setNome(String nome){
        this.nome = nome;
    }

    protected String getNome(){
        return this.nome;
    }

    protected void setSexo(String sexo){
        this.sexo = sexo;
    }

    protected String getSexo(){
        return this.sexo;
    }

    protected double getNotaPriSem() {
        return notaTerSem;
    }

    protected void setNotaPriSem(double notaPriSem) {
        this.notaPriSem = notaPriSem;
    }

    protected double getNotaSegSem() {
        return notaSegSem;
    }

    protected void setNotaSegSem(double notaSegSem) {
        this.notaSegSem = notaSegSem;
    }

    protected double getNotaTerSem() {
        return notaTerSem;
    }

    protected void setNotaTerSem(double notaTerSem) {
        this.notaTerSem = notaTerSem;
    }

    protected void setSomaNotas(double somaNotas){
        this.somaNotas = somaNotas;
    }

    protected double getSomaNotas(){
        return this.somaNotas;
    }
}
