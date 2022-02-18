public class CarroBuilder {

    private Carro carro;

    public CarroBuilder(){
        carro = new Carro();
    }

    public CarroBuilder setNome(String nome){
        carro.setNome(nome);
        return this;
    }

    public CarroBuilder setMarca(String marca){
        carro.setMarca(marca);
        return this;
    }

    public Carro build() {

        return carro;

    }
}
