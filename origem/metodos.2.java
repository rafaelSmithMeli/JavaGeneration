package metodo_poo;

public class Pessofisica extends cliente {
    private String nome;
    private int cpf;

    public Pessofisica(int id, String nome, int cpf) {
        super(id);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public void visualizar() {


        System.out.println("Número de rodas: " + this.nome);
        System.out.println("Velocidade: " + this.cpf);

    }
}

package metodo_poo;

public class Pessoajuridica extends cliente {
    private String nomef;
    protected int cnpj;

    public Pessoajuridica(int id, String nomef, int cnpj) {
        super(id);
        this.nomef = nomef;
        this.cnpj = cnpj;
    }

    public String getNomef() {
        return nomef;
    }

    public void setNomef(String nomef) {
        this.nomef = nomef;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void visualizar() {


        System.out.println("Nome fantasia: " + this.nomef);
        System.out.println("CNPJ: " + this.cnpj);

    }
}


package metodo_poo;

import java.util.Scanner;

public class Testarcliente {
    public static void main(String[]args){

        Pessofisica psf= new Pessofisica();
        Pessofisica psf1 = new Pessofisica();

        String nome;
        int cpf;

        psf.setNome("Rafael");
        psf.setCpf(3417819);




        System.out.println("Nome: "+psf.getNome());
        System.out.println("CPF: "+psf.getCpf());



        psf1.setNome("Fabiano");
        psf1.setCpf(1434578);



        System.out.println("\nNome: "+psf1.getNome());
        System.out.println("CPF: "+psf1.getCpf());




    }
}
