package com.kbca.libmenu;
public class App{
	public static void main(String[] args){
		App app = new App();
		app.inicia();
	}

	public void inicia(){
		Menu menu = new MenuBuilder("Menu Novo")
			.comItemMenu(new ItemMenu(1,"1) Abrir",() -> metodoDois()))
			.comItemMenu(new ItemMenu(2,"2) Copiar",() -> metodoUm()))
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
