public class Aluno extends Pessoa{
    private String cursos;
    private double notas;
    private double notas2;

    public void setCursos(String cursos){
        this.cursos=cursos;
    }
    public String getCursos(){
        return this.cursos;
    }
    public void setNotas(double notas){
        this.notas=notas;
    }
    public double getNotas(){
        return this.notas;
    }
    public void setNotas2(double notas2){
        this.notas2=notas2;
    }
    public double getNotas2(){
        return this.notas2;
    }
    public double calcularMedia(){
        return (this.notas + this.notas2) / 2.0;
    }
    public boolean verificaAprovado(){
        boolean condicao;
        if(this.notas < 6){
           condicao = false;  
        }else{
            condicao = true;
        }
        return condicao;
        
    }
}