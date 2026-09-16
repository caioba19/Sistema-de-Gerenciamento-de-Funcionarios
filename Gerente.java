public class Gerente extends Funcionario {
    private String departamento;
    private int bonus;

    public Gerente(String nome, int cpf, int salario, String departamento, int bonus) {
        super(nome, cpf, salario);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
