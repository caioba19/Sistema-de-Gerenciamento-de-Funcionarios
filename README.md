# Sistema de Cadastro de Funcionários

Atividade de Programação Orientada a Objetos (POO) em Java. O sistema modela funcionários comuns e gerentes de uma empresa, aplicando encapsulamento, construtores, getters/setters e herança.

## Contextualização

A empresa precisa cadastrar e gerenciar funcionários comuns e gerentes. Um gerente possui todos os dados de um funcionário comum, além de informações próprias (departamento e bônus). Por isso, `Gerente` herda de `Funcionario`.

## Conceitos de POO aplicados

- **Classes**: `Funcionario` e `Gerente` representam os tipos de funcionário.
- **Encapsulamento**: todos os atributos são `private`, acessados só por get/set.
- **Métodos get e set**: um par para cada atributo.
- **Construtores**: inicializam o objeto já com todos os dados obrigatórios.
- **Herança**: `Gerente extends Funcionario`, reaproveitando nome, cpf e salário e usando `super()` no construtor.

## Estrutura das classes

### Funcionario

| Atributo | Tipo   |
|----------|--------|
| nome     | String |
| cpf      | int    |
| salario  | int    |

### Gerente (herda de Funcionario)

| Atributo     | Tipo   |
|--------------|--------|
| departamento | String |
| bonus        | int    |

## Código

### Funcionario.java

```java
public class Funcionario {
    private String nome;
    private int cpf;
    private int salario;

    public Funcionario(String nome, int cpf, int salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
```

### Gerente.java

```java
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
```

### Main (teste)

```java
void main(){
  Funcionario p1 = new Funcionario("Matheus", 234, 7777);
  Funcionario p2 = new Funcionario("DN", 123, 6767);

  Gerente gerente = new Gerente("Caioba", 123, 6969, "Aura + EGO", 1010);

  System.out.println(p1.getNome() + " Salario Funcionario - " + p1.getSalario());
  System.out.println(p2.getNome() + " Salario Funcionario - " + p2.getSalario());
  System.out.println(gerente.getNome() + " Departamento do Gerente - " + gerente.getDepartamento());
}
```

## Saída esperada

```
Matheus Salario Funcionario - 7777
DN Salario Funcionario - 6767
Caioba Departamento do Gerente - Aura + EGO
```

## Observações

- CPF está como `int`, mas na vida real tem 11 dígitos e não cabe nesse tipo — nesta atividade foram usados valores curtos de teste para evitar overflow.
- No main de teste, evite nomear a variável igual à classe (ex: `Gerente Funcionario`) para não confundir a leitura do código.
