package com.kbca.libmenu;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Optional;
public class Menu{
	private String nomeApp;
	private List<ItemMenu> items = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);

	private Menu(MenuBuilder builder){
		this.nomeApp = builder.nomeApp;
		this.items = builder.items;
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

	public static class MenuBuilder{
		private String nomeApp;
		private List<ItemMenu> items = new ArrayList<>();

		public MenuBuilder nomeApp(String nomeApp){
			this.nomeApp = nomeApp;
			return this;
		}

		public MenuBuilder itemMenu(ItemMenu itemMenu){
			addItem(itemMenu);
			return this;
		}

		private void addItem(ItemMenu item){
			items.add(item);
		}

		public Menu build(){
			return new Menu(this);
		}
	}
}
