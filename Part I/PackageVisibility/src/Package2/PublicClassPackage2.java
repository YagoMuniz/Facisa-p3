package Package2;

import Package1.PublicClassPackage1;

/**
 * @author: Yago Muniz
 * Classe pública propriamente implementada para testes de visibilidade
 */
public class PublicClassPackage2 {

    public void method1(){}
    private void method2(){}
    protected void method3(){}
    void method4(){}

    /**
     * Método acessa métodos implementados no mesmo pacote.
     *
     * O erro ocorre devido ao method2 ser privado.
     */
    public void accessSamePackage(){
        DefaultClassPackage2 dc2 = new DefaultClassPackage2();
        dc2.method1();
        dc2.method2(); // Error: Private Method
        dc2.method3();
        dc2.method4();
    }

    /**
     * Método tenta instanciar classe de outro pacote.
     *
     * O erro ocorre pois a classe a ser instanciada é default
     * e só pode ser acessada no mesmo pacote.
     *
     * Não podemos acessar os métodos já que a classe é default.
     */
    public void acessOtherPackageDefaultClass(){
        DefaultClass dc1 = new DefaultClass(); // Error: Default Class
    }

    /**
     * Método acessa métodos da classe pública do pacote 1.
     *
     * O erros ocorrem devido aos modificadores de acesso dos métodos:
     *  method2 -> private;
     *  method3 -> protected;
     *  method4 -> default.
     */
    public void acessOtherPackagePublicClass(){
        PublicClassPackage1 pc1 = new PublicClassPackage1();
        pc1.method1();
        pc1.method2(); // Error: Private Method
        pc1.method3(); // Error: Protected Method
        pc1.method4(); // Error: Default Method
    }

}
