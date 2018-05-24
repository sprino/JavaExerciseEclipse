package modulo_5_incapsulamento;

public class E_5b_Gara 
{
	 private String nome;
	 private String risultato;
	 private E_5b_Auto griglia [];
	 
	 public E_5b_Gara(String nome)
	 {
	 setNome(nome);
	 setRisultato("Corsa non terminata");
	 creaGrigliaDiPartenza();
	 }
	 
	 public void creaGrigliaDiPartenza(){
	 E_5b_Pilota uno = new E_5b_Pilota("Pippo");
	 E_5b_Pilota due = new E_5b_Pilota("Pluto");
	 E_5b_Pilota tre = new E_5b_Pilota("Topolino");
	 E_5b_Pilota quattro = new E_5b_Pilota("Paperino");
	 E_5b_Auto autoNumeroUno = new E_5b_Auto("Ferrari", uno);
	 E_5b_Auto autoNumeroDue = new E_5b_Auto("Renault", due);
	 E_5b_Auto autoNumeroTre = new E_5b_Auto("BMW", tre);
	 E_5b_Auto autoNumeroQuattro = new E_5b_Auto("Mercedes",quattro);
	 griglia = new E_5b_Auto[4];
	 griglia[0] = autoNumeroUno;
	 griglia[1] = autoNumeroDue;
	 griglia[2] = autoNumeroTre;
	 griglia[3] = autoNumeroQuattro;
	 }
	 
	 public void corriGara() {
	 int numeroVincente = (int)(Math.random()*4);
	 E_5b_Auto vincitore = griglia[numeroVincente];
	 String risultato = vincitore.dammiDettagli();
	 setRisultato(risultato);
	 }
	 
	 public void setRisultato(String vincitore) {
		 this.risultato = "Il vincitore di " +
		this.getNome()
		 + ": \n" + vincitore;
		 }
	 
		 public String getRisultato() {
		 return risultato;
		 }
		 
		 public void setNome(String nome) {
		 this.nome = nome;
		 }
		 
		 public String getNome() {
		 return nome;
		 }
}