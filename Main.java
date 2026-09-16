void main(){
  Funcionario p1 = new Funcionario("Matheus", 234, 7777);
  Funcionario p2 = new Funcionario("DN", 123, 6767);

  Gerente Funcionario = new Gerente( "Caioba", 123, 6969, "Aura + EGO", 1010);

  System.out.println(p1.getNome() + " Salario Funcionario - " + p1.getSalario());
  System.out.println(p2.getNome() + " Salario Funcionario - " + p2.getSalario());
  System.out.println(Funcionario.getNome() + " Departamento do Gerente - " + Funcionario.getDepartamento());
}
