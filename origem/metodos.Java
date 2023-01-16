package metodo_poo;

public class cliente {

    private int idade;
    private int tel;
    private int rg;
    private String nome;
    private String email;

    public cliente (int idade, int tel, int rg, String nome, String email) {
        this.idade = idade;
        this.rg = rg;
        this.nome = nome;
        this.tel = tel;
        this.email = email;
    }

    public cliente() {

    }


    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibeDados(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(rg);
        System.out.println(tel);
        System.out.println(email);
    }
}
package metodo_poo;

import java.util.Scanner;

public class Testes {
    public static void main(String[]args){

        cliente cli = new cliente();
        cliente clii = new cliente();

        String nome;
        int idade,rg,tel;
        String email;

        cli.setNome("Rafael");
        cli.setIdade(34);
        cli.setRg(12289);
        cli.setTel(9598490);
        cli.setEmail("smithyoungflu@gmail.com");

        System.out.println("Nome: "+cli.getNome());
        System.out.println("Idade: "+cli.getIdade());
        System.out.println("RG: "+cli.getRg());
        System.out.println("Tel: "+cli.getTel());
        System.out.println("Email: "+cli.getEmail());

        clii.setNome("Fabiano");
        clii.setIdade(28);
        clii.setRg(14345);
        clii.setTel(9634897);
        clii.setEmail("Trikefuleiro@gmail.com");

        System.out.println("\nNome: "+clii.getNome());
        System.out.println("Idade: "+clii.getIdade());
        System.out.println("RG: "+clii.getRg());
        System.out.println("Telefone: "+clii.getTel());
        System.out.println("Email: "+clii.getEmail());

    }
}


package metodo_poo;

public class funcionário {

    private int idade;
    private int tel;
    private int cpf;
    private String nome;
    private String email;

    public funcionário (int idade, int tel, int cpf, String nome, String email) {
        this.idade = idade;
        this.cpf = cpf;
        this.nome = nome;
        this.tel = tel;
        this.email = email;
    }

    public funcionário() {

    }


    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibeDados(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(cpf);
        System.out.println(tel);
        System.out.println(email);
    }
}
package metodo_poo;

import java.util.Scanner;
public class Testefuncinário {
    public static void main(String[]args){

        funcionário fun = new funcionário();
        funcionário func = new funcionário();

        String nome;
        int idade,cpf,tel;
        String email;

        fun.setNome("Thaís");
        fun.setIdade(45);
        fun.setCpf(12289);
        fun.setTel(9598490);
        fun.setEmail("thaismeli@gmail.com");

        System.out.println("Nome: "+fun.getNome());
        System.out.println("Idade: "+fun.getIdade());
        System.out.println("RG: "+fun.getCpf());
        System.out.println("Tel: "+fun.getTel());
        System.out.println("Email: "+fun.getEmail());

        func.setNome("Marisa");
        func.setIdade(22);
        func.setCpf(14345);
        func.setTel(9634897);
        func.setEmail("Marisameli@gmail.com");

        System.out.println("\nNome: "+func.getNome());
        System.out.println("Idade: "+func.getIdade());
        System.out.println("Cpf: "+func.getCpf());
        System.out.println("Telefone: "+func.getTel());
        System.out.println("Email: "+func.getEmail());

    }
}

package metodo_poo;

public class curso {




        private int periodo;
        private String turno;
        private String modelo;
        private String nome;
        private String nivel;

        public curso (int periodo, String turno, String modelo, String nome, String nivel) {
            this.periodo = periodo;
            this.modelo = modelo;
            this.nome = nome;
            this.turno = turno;
            this.nivel = nivel;
        }

        public curso() {

        }


        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getTurno() {
            return turno;
        }

        public void setTurno(String turno) {
            this.turno = turno;
        }

        public int getPeriodo() {
            return periodo;
        }

        public void setPeriodo(int periodo) {
            this.periodo = periodo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNivel() {
            return nivel;
        }

        public void setNivel(String nivel) {
            this.nivel = nivel;
        }

        public void exibeDados(){
            System.out.println(nome);
            System.out.println(periodo);
            System.out.println(modelo);
            System.out.println(turno);
            System.out.println(nivel);
        }
    }


package metodo_poo;

import java.util.Scanner;

public class teste_curso {
    public static void main(String[] args) {
        curso cur = new curso();
        curso curs = new curso();

        String nome;
        int periodo;
        String modelo;
        String turno;
        String nivel;

        cur.setNome("Inglês");
        cur.setModelo("EAD");
        cur.setTurno("Manhã");
        cur.setNivel("Avançado");
        cur.setPeriodo(5);

        System.out.println("Nome: " + cur.getNome());
        System.out.println("Modelo: " + cur.getModelo());
        System.out.println("Turno: " + cur.getTurno());
        System.out.println("Nível: " + cur.getNivel());
        System.out.println("Período(s): " + cur.getPeriodo());

        curs.setNome("Espanhol");
        curs.setModelo("Presencial");
        curs.setTurno("Noite");
        curs.setNivel("Básico");
        curs.setPeriodo(2);

        System.out.println("\nNome: " + curs.getNome());
        System.out.println("Modelo: " + curs.getModelo());
        System.out.println("Turno: " + curs.getTurno());
        System.out.println("Nível: " + curs.getNivel());
        System.out.println("Período(s): " + curs.getPeriodo());


    }
}



