import java.util.*;

public class MenuVendas {
	
	public String opt;
	public String opt2 = "2";
	private boolean  loop = true;
	Scanner leitor = new Scanner(System.in);
	
	
	
	public boolean isLoop() {
		return loop;
	}

	public void setLoop(boolean loop) {
		this.loop = loop;
	}

	public String getOpt() {
		return opt;
	}
	
	public void setOpt(String opt) {
		this.opt = opt;
	}

	public String getOpt2() {
		return opt2;
	}

	public void setOpt2(String i) {
		this.opt2 = i;
	}

	public String menu1(){
		System.out.println("--------------------Menu Principal--------------------");
		System.out.println("\n1 - Cadastrar Venda");
		System.out.println("\n2 - Cadastrar novo Vendedor");
		System.out.println("\n3 - Cadastrar novo Produto");
		System.out.println("\n4 - Sair");
		System.out.println("\n>>");
		
		try{
		setOpt(leitor.nextLine());
		}catch (InputMismatchException e) {
			System.out.println("Digite apenas números!!");
		}
		return opt;
	}
	
	public String menu2(){
		vassourinha();
		System.out.println("------------------------------------------\n");
		System.out.println("1 - Menu Principal");
		System.out.println("\n>>");
		
		setOpt2(leitor.nextLine());
		
		return opt2;
	}
	
	public void menu3(){
		System.out.println("-----------------------Venda de Produtos-----------------------");
	}
	
	public void vassourinha(){
		int i = 0;
		while(i<5){
			System.out.println("\n");
			i++;
		}
	}
}
