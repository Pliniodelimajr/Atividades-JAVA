package aula08marco;

public class Main {
    
    public static void main(String[] args) {

    Coordenador Coordenador1 = new Coordenador(582, "Lays", 29, Genero.FEMININO);
    Secretaria Secretaria1 = new Secretaria(010, "Lucas", 33, Genero.MASCULINO);
    ProfEngenharia ProfEngenharia1 = new ProfEngenharia(007, "Plínio", 25, Genero.MASCULINO, "06565227551");
    ProfNutricionista ProfNutricionista = new ProfNutricionista(011, "Daniele", 35, Genero.FEMININO, "858476454");
    ProfDireito ProfDireito = new ProfDireito(9986, "Licor", 85, Genero.FEMININO, "858447");
    
    System.out.println (Coordenador1.toString());
    System.out.println(Secretaria1.toString());
    
    
    
    
    
     
   
    }  
}

