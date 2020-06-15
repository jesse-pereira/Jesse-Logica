/**
 *
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String imprimirNome10x() {
        int count = 1;
        StringBuilder names = new StringBuilder();
        while(count <= 10) {
            names.append("\n" + this.name);
            count++;
        }
        return names.toString();
    }

    public String imprimirNomeConformeSolicitacao(int quantidade) {
        int count = 1;
        StringBuilder names = new StringBuilder();
        while(count <= quantidade) {
            names.append("\nCris");
            count = count + 1;
        }
        return names.toString();
    }

    public String imprimirNome5x() {
        StringBuilder names = new StringBuilder();
        for(int count = 1; count <= 5; count++) {
            names.append("\nCris");
        }
        return names.toString();
    }

    public String imprimirNomeConformeSolicitacao2(int quantidade) {
        StringBuilder names = new StringBuilder();
        for(int count = 1; count <= quantidade; count++) {
            names.append("\nCris");
        }
        return names.toString();
    }

    public String imprimirNome20x() {
        int count = 1;
        StringBuilder names = new StringBuilder();
        while(count <= 20) {
            if (count % 2 == 0) {
                names.append("\nCris");
            } else {
                names.append("\nMyllena");
            }
            count++;
        }
        return names.toString();
    }

}
