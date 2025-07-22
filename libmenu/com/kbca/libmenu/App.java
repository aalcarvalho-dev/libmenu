package com.kbca.libmenu;
public class App{
	public static void main(String[] args){
		App app = new App();
		app.inicia();
	}

	public void novoInicia(){
		Menu menu = new Menu.MenuBuilder()
			.nomeApp("Nome do meu app")
			.build();
	}

	public void inicia(){
		Menu menu = new Menu.MenuBuilder()
			.nomeApp("meu app novo!")
			.itemMenu(new ItemMenu(1,"1) Abrir",() -> metodoDois()))
			.itemMenu(new ItemMenu(2,"2) Copiar",() -> metodoUm()))
			.build();
		menu.exibir();
	}

	public void metodoUm(){
		System.out.println("entrou método!");
	}

	public void metodoDois(){
		System.out.println("novo método!");
	}
}
