public class Principal {
 
    public static void main(String[]args){
        Aluno a = new Aluno();
        Professor p = new Professor();
    
        // dados do aluno 
        a.setNome("Matheus Araujo");
        a.setEndereco("Rua José Pereira Mendes, 79 ");
        a.setTelefone("14981598854");
        a.setCpf("476.993.168-94");
    //Notas do aluno 
        a.setCursos("Big Data");
        a.setNotas(10.0);
        a.setNotas(6.0);
    
        // Prints 
        System.out.println("o aluno : ");
        System.out.println(a.getNome());
        System.out.println(a.getEndereco());
        System.out.println(a.getTelefone());
        System.out.println(a.getCpf());
        System.out.println(a.getCursos());
    
        if(a.verificaAprovado()){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
