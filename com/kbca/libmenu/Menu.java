package com.kbca.libmenu;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Optional;
public class Menu{
	private String nomeApp;
	private List<ItemMenu> items = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);

	Menu(String nomeApp){
		this.nomeApp = nomeApp;
	}

	public void addItem(ItemMenu item){
		items.add(item);
	}

	public List<ItemMenu> getItems(){
		return items;
	}

	public void exibir(){
		String welcome = """
			     Bem vindos ao App
			----------- MENU ----------
			""";
		System.out.println(nomeApp);
		System.out.println(welcome);
		items.stream()
			.forEach(i -> System.out.println(i.getDescricao()));
		System.out.print("Selecione uma opção: ");
		var opcao = scanner.nextInt();
		acessar(opcao);
	}

	private void acessar(int opcao){
		Optional<ItemMenu> item = items.stream()
			.filter(i -> i.getId()==opcao)
			.findFirst();
		ItemMenu i = item.orElseThrow();
		i.executar();
	}
}
