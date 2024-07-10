package edu.paulo.lanchonete.atendimento.cozinha;


public class Cozinheiro {

    public void adicionarLancheNoBalcao(){
        prepararLanche();
        System.out.println("Adicionando lanche natural hamburguer no balcao");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcao");
    }
    public void adicionarComboNoBalcao(){
        prepararCombo();
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        selecionarIngredientesLanche();
        lavarIngredientes();
        fritarIngredientesLanche();
        System.out.println("Preparando lanche tipo hamburguer");
    }
    private void prepararVitamina(){
        selecionarIngredientesVitamina();
        lavarIngredientes();
        baterVitaminaLiquidificador();
        System.out.println("Preparando suco");
    }
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("Selecionando o pão, salada, ovo  e carne");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionado Fruta, leite e suco");
    }
    private void lavarIngredientes(){
        System.out.println("Lavando ingredientes");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("Batendo vitamina no liquidificador");
    }
    private void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e ovo para hamburguer");
    }
    @SuppressWarnings("unused")
    private void pedirParaTrocarGas( Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    @SuppressWarnings("unused")
    private void pedirIngredientes( Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
    
}
