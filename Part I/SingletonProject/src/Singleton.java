public class Singleton {

    /**
     * Atributo estático que é compartilhado entre diversos objetos
     * segundo o Singleton.
     */
    private static Conexao conn = new Conexao();

    /**
     * Retorna a instância a ser usada
     * @return conn
     */
    public static Conexao getInstance(){
        return conn;
    }
}
