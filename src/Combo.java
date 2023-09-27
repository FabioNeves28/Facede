public class Combo {
    private Burger burger = new Burger();
    private Sobremesa sobremesa = new Sobremesa();
    private Bebida bebida = new Bebida();

    public void CriarCombo(int tipo) {
        switch (tipo) {
            case 1:
                burger.setGramas(250);
                sobremesa.setTamanho("Grande");
                bebida.setMl(500);
                burger.setPreco(55.00);
                burger.setDescricao("Combo com dois McMelt, 1 McFlurry e 2 Free-Refil da bebida a sua escolha");
                break;
            case 2:
                burger.setGramas(100);
                sobremesa.setTamanho("Médio");
                bebida.setMl(250);
                burger.setPreco(35.00);
                burger.setDescricao("Combo com um 1 McMelt, Casquinha e 1 Free-Refil da bebida a sua escolha");
                break;
        }
    }

    @Override
    public String toString() {
        return "SEU COMBO:\n" + "Hamburger: " + burger.getGramas() + "g\n" + "Sobremesa: " + sobremesa.getTamanho() + "\n" + "Bebida: " + bebida.getMl() + "mL" + "\nDescrição: "+burger.descricao();
    }
}
